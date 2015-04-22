package org.occiware.clouddesigner.occi.docker.connector;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.match.eobject.EObjectIndex;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.ScopeQuery;
import org.eclipse.emf.compare.match.eobject.internal.ByTypeIndex;
import org.eclipse.emf.compare.match.eobject.internal.MatchAheadOfTime;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class FixedProximityEObjectMatcher implements IEObjectMatcher, ScopeQuery {
  /**
   * Number of elements to index before a starting a match ahead step.
   */
  private final static int NB_ELEMENTS_BETWEEN_MATCH_AHEAD = 10000;
  
  /**
   * The index which keep the EObjects.
   */
  private EObjectIndex index;
  
  /**
   * Keeps track of which side was the EObject from.
   */
  private Map<EObject, EObjectIndex.Side> eObjectsToSide = Maps.<EObject, EObjectIndex.Side>newHashMap();
  
  /**
   * Create the matcher using the given distance function.
   * 
   * @param meter
   *            a function to measure the distance between two {@link EObject}s.
   */
  public FixedProximityEObjectMatcher(final ProximityEObjectMatcher.DistanceFunction meter) {
    ByTypeIndex _byTypeIndex = new ByTypeIndex(meter, this);
    this.index = _byTypeIndex;
  }
  
  /**
   * {@inheritDoc}
   */
  public void createMatches(final Comparison comparison, final Iterator<? extends EObject> leftEObjects, final Iterator<? extends EObject> rightEObjects, final Iterator<? extends EObject> originEObjects, final Monitor monitor) {
    Monitor subMonitor = new BasicMonitor();
    subMonitor.beginTask("indexing objects", 1);
    int nbElements = 0;
    int lastSegment = 0;
    while (((leftEObjects.hasNext() || rightEObjects.hasNext()) || originEObjects.hasNext())) {
      {
        boolean _hasNext = leftEObjects.hasNext();
        if (_hasNext) {
          EObject next = leftEObjects.next();
          nbElements++;
          this.index.index(next, EObjectIndex.Side.LEFT);
          this.eObjectsToSide.put(next, EObjectIndex.Side.LEFT);
        }
        boolean _hasNext_1 = rightEObjects.hasNext();
        if (_hasNext_1) {
          EObject next_1 = rightEObjects.next();
          this.index.index(next_1, EObjectIndex.Side.RIGHT);
          this.eObjectsToSide.put(next_1, EObjectIndex.Side.RIGHT);
        }
        boolean _hasNext_2 = originEObjects.hasNext();
        if (_hasNext_2) {
          EObject next_2 = originEObjects.next();
          this.index.index(next_2, EObjectIndex.Side.ORIGIN);
          this.eObjectsToSide.put(next_2, EObjectIndex.Side.ORIGIN);
        }
        if (((nbElements / FixedProximityEObjectMatcher.NB_ELEMENTS_BETWEEN_MATCH_AHEAD) > lastSegment)) {
          this.matchAheadOfTime(comparison, subMonitor);
          lastSegment++;
        }
      }
    }
    subMonitor.worked(1);
    subMonitor.done();
    subMonitor.beginTask("matching objects", nbElements);
    this.matchIndexedObjects(comparison, subMonitor);
    this.createUnmatchesForRemainingObjects(comparison);
    subMonitor.done();
    this.restructureMatchModel(comparison);
  }
  
  /**
   * If the index supports it, match element ahead of time, in case of failure the elements are kept and
   * will be processed again later on.
   * 
   * @param comparison
   *            the current comoparison.
   * @param monitor
   *            monitor to track progress.
   */
  public void matchAheadOfTime(final Comparison comparison, final Monitor monitor) {
    if ((this.index instanceof MatchAheadOfTime)) {
      Iterable<EObject> _valuesToMatchAhead = ((MatchAheadOfTime) this.index).getValuesToMatchAhead(EObjectIndex.Side.LEFT);
      this.matchList(comparison, _valuesToMatchAhead, false, monitor);
      Iterable<EObject> _valuesToMatchAhead_1 = ((MatchAheadOfTime) this.index).getValuesToMatchAhead(EObjectIndex.Side.RIGHT);
      this.matchList(comparison, _valuesToMatchAhead_1, false, monitor);
    }
  }
  
  /**
   * Match elements for real, if no match is found for an element, an object will be created to represent
   * this unmatch and the element will not be processed again.
   * 
   * @param comparison
   *            the current comparison.
   * @param subMonitor
   *            monitor to track progress.
   */
  public void matchIndexedObjects(final Comparison comparison, final Monitor subMonitor) {
    Iterable<EObject> todo = this.index.getValuesStillThere(EObjectIndex.Side.LEFT);
    while (todo.iterator().hasNext()) {
      Iterable<EObject> _matchList = this.matchList(comparison, todo, true, subMonitor);
      todo = _matchList;
    }
    Iterable<EObject> _valuesStillThere = this.index.getValuesStillThere(EObjectIndex.Side.RIGHT);
    todo = _valuesStillThere;
    while (todo.iterator().hasNext()) {
      Iterable<EObject> _matchList = this.matchList(comparison, todo, true, subMonitor);
      todo = _matchList;
    }
  }
  
  /**
   * Create all the Match objects for the remaining EObjects.
   * 
   * @param comparison
   *            the current comparison.
   */
  public void createUnmatchesForRemainingObjects(final Comparison comparison) {
    Iterable<EObject> _valuesStillThere = this.index.getValuesStillThere(EObjectIndex.Side.RIGHT);
    for (final EObject notFound : _valuesStillThere) {
      this.areMatching(comparison, null, notFound, null);
    }
    Iterable<EObject> _valuesStillThere_1 = this.index.getValuesStillThere(EObjectIndex.Side.LEFT);
    for (final EObject notFound_1 : _valuesStillThere_1) {
      this.areMatching(comparison, notFound_1, null, null);
    }
    Iterable<EObject> _valuesStillThere_2 = this.index.getValuesStillThere(EObjectIndex.Side.ORIGIN);
    for (final EObject notFound_2 : _valuesStillThere_2) {
      this.areMatching(comparison, null, null, notFound_2);
    }
  }
  
  /**
   * Process the list of objects matching them. This method might not be able to process all the EObjects if
   * - for instance, their container has not been matched already. Every object which could not be matched
   * is returned in the list.
   * 
   * @param comparison
   *            the comparison being built.
   * @param todoList
   *            the list of objects to process.
   * @param createUnmatches
   *            whether elements which have no match should trigger the creation of a Match object (meaning
   *            we won't try to match them afterwards) or not.
   * @param monitor
   *            a monitor to track progress.
   * @return the list of EObjects which could not be processed for some reason.
   */
  public Iterable<EObject> matchList(final Comparison comparison, final Iterable<EObject> todoList, final boolean createUnmatches, final Monitor monitor) {
    Set<EObject> remainingResult = Sets.<EObject>newLinkedHashSet();
    List<EObject> requiredContainers = Lists.<EObject>newArrayList();
    Iterator<EObject> todo = todoList.iterator();
    while (todo.hasNext()) {
      {
        EObject next = todo.next();
        EObject container = next.eContainer();
        while (((!Objects.equal(container, null)) && this.isInScope(container))) {
          {
            Match _match = comparison.getMatch(container);
            boolean _equals = Objects.equal(_match, null);
            if (_equals) {
              requiredContainers.add(0, container);
            }
            EObject _eContainer = container.eContainer();
            container = _eContainer;
          }
        }
      }
    }
    Iterator<EObject> _iterator = requiredContainers.iterator();
    Iterator<EObject> _iterator_1 = todoList.iterator();
    Iterator<EObject> containersAndTodo = Iterators.<EObject>concat(_iterator, _iterator_1);
    while (containersAndTodo.hasNext()) {
      {
        EObject next = containersAndTodo.next();
        Match _match = comparison.getMatch(next);
        boolean _equals = Objects.equal(_match, null);
        if (_equals) {
          boolean _tryToMatch = this.tryToMatch(comparison, next, createUnmatches);
          boolean _not = (!_tryToMatch);
          if (_not) {
            remainingResult.add(next);
            monitor.worked(1);
          }
        }
      }
    }
    return remainingResult;
  }
  
  /**
   * Try to create a Match. If the match got created, register it (having actual left/right/origin matches
   * or not), if not, then return false. Cases where it might not create the match : if some required data
   * has not been computed yet (for instance if the container of an object has not been matched and if the
   * distance need to know if it's match to find the children matches).
   * 
   * @param comparison
   *            the comparison under construction, it will be updated with the new match.
   * @param a
   *            object to match.
   * @param createUnmatches
   *            whether elements which have no match should trigger the creation of a Match object (meaning
   *            we won't try to match them afterwards) or not.
   * @return false if the conditions are not fulfilled to create the match, true otherwhise.
   */
  public boolean tryToMatch(final Comparison comparison, final EObject a, final boolean createUnmatches) {
    boolean okToMatch = false;
    EObjectIndex.Side aSide = this.eObjectsToSide.get(a);
    boolean _equals = Objects.equal(aSide, null);
    if (_equals) {
      return okToMatch;
    }
    EObjectIndex.Side bSide = EObjectIndex.Side.LEFT;
    EObjectIndex.Side cSide = EObjectIndex.Side.RIGHT;
    boolean _equals_1 = Objects.equal(aSide, EObjectIndex.Side.RIGHT);
    if (_equals_1) {
      bSide = EObjectIndex.Side.LEFT;
      cSide = EObjectIndex.Side.ORIGIN;
    } else {
      boolean _equals_2 = Objects.equal(aSide, EObjectIndex.Side.LEFT);
      if (_equals_2) {
        bSide = EObjectIndex.Side.RIGHT;
        cSide = EObjectIndex.Side.ORIGIN;
      } else {
        boolean _equals_3 = Objects.equal(aSide, EObjectIndex.Side.ORIGIN);
        if (_equals_3) {
          bSide = EObjectIndex.Side.LEFT;
          cSide = EObjectIndex.Side.RIGHT;
        }
      }
    }
    boolean _equals_4 = Objects.equal(aSide, bSide);
    if (_equals_4) {
      return okToMatch;
    }
    boolean _equals_5 = Objects.equal(bSide, cSide);
    if (_equals_5) {
      return okToMatch;
    }
    boolean _equals_6 = Objects.equal(cSide, aSide);
    if (_equals_6) {
      return okToMatch;
    }
    Map<EObjectIndex.Side, EObject> closests = this.index.findClosests(comparison, a, aSide);
    boolean _notEquals = (!Objects.equal(closests, null));
    if (_notEquals) {
      EObject lObj = closests.get(bSide);
      EObject aObj = closests.get(cSide);
      boolean _or = false;
      boolean _notEquals_1 = (!Objects.equal(lObj, null));
      if (_notEquals_1) {
        _or = true;
      } else {
        boolean _notEquals_2 = (!Objects.equal(aObj, null));
        _or = _notEquals_2;
      }
      if (_or) {
        EObject _get = closests.get(EObjectIndex.Side.LEFT);
        EObject _get_1 = closests.get(EObjectIndex.Side.RIGHT);
        EObject _get_2 = closests.get(EObjectIndex.Side.ORIGIN);
        this.areMatching(comparison, _get, _get_1, _get_2);
        okToMatch = true;
      } else {
        if (createUnmatches) {
          EObject _get_3 = closests.get(EObjectIndex.Side.LEFT);
          EObject _get_4 = closests.get(EObjectIndex.Side.RIGHT);
          EObject _get_5 = closests.get(EObjectIndex.Side.ORIGIN);
          this.areMatching(comparison, _get_3, _get_4, _get_5);
          okToMatch = true;
        }
      }
    }
    return okToMatch;
  }
  
  /**
   * Process all the matches of the given comparison and re-attach them to their parent if one is found.
   * 
   * @param comparison
   *            the comparison to restructure.
   */
  public void restructureMatchModel(final Comparison comparison) {
    TreeIterator<EObject> _eAllContents = comparison.eAllContents();
    UnmodifiableIterator<Match> _filter = Iterators.<Match>filter(_eAllContents, Match.class);
    ImmutableList<Match> _copyOf = ImmutableList.<Match>copyOf(_filter);
    Iterator<Match> it = _copyOf.iterator();
    while (it.hasNext()) {
      {
        Match cur = it.next();
        EObject possibleContainer = null;
        EObject _left = cur.getLeft();
        boolean _notEquals = (!Objects.equal(_left, null));
        if (_notEquals) {
          EObject _left_1 = cur.getLeft();
          EObject _eContainer = _left_1.eContainer();
          possibleContainer = _eContainer;
        }
        boolean _and = false;
        boolean _equals = Objects.equal(possibleContainer, null);
        if (!_equals) {
          _and = false;
        } else {
          EObject _right = cur.getRight();
          boolean _notEquals_1 = (!Objects.equal(_right, null));
          _and = _notEquals_1;
        }
        if (_and) {
          EObject _right_1 = cur.getRight();
          EObject _eContainer_1 = _right_1.eContainer();
          possibleContainer = _eContainer_1;
        }
        boolean _and_1 = false;
        boolean _equals_1 = Objects.equal(possibleContainer, null);
        if (!_equals_1) {
          _and_1 = false;
        } else {
          EObject _origin = cur.getOrigin();
          boolean _notEquals_2 = (!Objects.equal(_origin, null));
          _and_1 = _notEquals_2;
        }
        if (_and_1) {
          EObject _origin_1 = cur.getOrigin();
          EObject _eContainer_2 = _origin_1.eContainer();
          possibleContainer = _eContainer_2;
        }
        Match possibleContainerMatch = comparison.getMatch(possibleContainer);
        boolean _notEquals_3 = (!Objects.equal(possibleContainerMatch, null));
        if (_notEquals_3) {
          EList<Match> _submatches = possibleContainerMatch.getSubmatches();
          ((BasicEList<Match>) _submatches).addUnique(cur);
        }
      }
    }
  }
  
  /**
   * Register the given object as a match and add it in the comparison.
   * 
   * @param comparison
   *            container for the Match.
   * @param left
   *            left element.
   * @param right
   *            right element
   * @param origin
   *            origin element.
   * @return the created match.
   */
  public Match areMatching(final Comparison comparison, final EObject left, final EObject right, final EObject origin) {
    Match result = CompareFactory.eINSTANCE.createMatch();
    result.setLeft(left);
    result.setRight(right);
    result.setOrigin(origin);
    EList<Match> _matches = comparison.getMatches();
    ((BasicEList<Match>) _matches).addUnique(result);
    boolean _notEquals = (!Objects.equal(left, null));
    if (_notEquals) {
      this.index.remove(left, EObjectIndex.Side.LEFT);
    }
    boolean _notEquals_1 = (!Objects.equal(right, null));
    if (_notEquals_1) {
      this.index.remove(right, EObjectIndex.Side.RIGHT);
    }
    boolean _notEquals_2 = (!Objects.equal(origin, null));
    if (_notEquals_2) {
      this.index.remove(origin, EObjectIndex.Side.ORIGIN);
    }
    return result;
  }
  
  /**
   * {@inheritDoc}
   */
  public boolean isInScope(final EObject eContainer) {
    EObjectIndex.Side _get = this.eObjectsToSide.get(eContainer);
    return (!Objects.equal(_get, null));
  }
}
