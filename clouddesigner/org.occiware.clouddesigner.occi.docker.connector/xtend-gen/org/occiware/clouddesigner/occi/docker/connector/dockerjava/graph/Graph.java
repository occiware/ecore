package org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.GraphNode;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.NodeValueListener;

@SuppressWarnings("all")
public class Graph<T extends Object> {
  /**
   * Organize the deployment order of the Nodes
   */
  private List<GraphNode<T>> deploymentOrder = CollectionLiterals.<GraphNode<T>>newArrayList();
  
  /**
   * These are basically the nodes of the graph
   */
  private HashMap<T, GraphNode<T>> nodes = new HashMap<T, GraphNode<T>>();
  
  /**
   * The callback interface used to notify of the fact that a node just got
   * the evaluation
   */
  private NodeValueListener<T> listener;
  
  /**
   * It holds a list of the already evaluated nodes
   */
  private List<GraphNode<T>> evaluatedNodes = new ArrayList<GraphNode<T>>();
  
  /**
   * The main constructor that has one parameter representing the callback
   * mechanism used by this class to notify when a node gets the evaluation.
   * 
   * @param listener
   * The callback interface implemented by the user classes
   */
  public NodeValueListener<T> Graph(final NodeValueListener<T> listener) {
    return this.listener = listener;
  }
  
  /**
   * Allows adding of new dependicies to the graph. "evalFirstValue" needs to
   * be evaluated before "evalAfterValue"
   * 
   * @param evalFirstValue
   *            The parameter that needs to be evaluated first
   * @param evalAfterValue
   *            The parameter that needs to be evaluated after
   */
  public void addDependency(final T evalFirstValue, final T evalAfterValue) {
    GraphNode<T> firstNode = null;
    GraphNode<T> afterNode = null;
    boolean _containsKey = this.nodes.containsKey(evalFirstValue);
    if (_containsKey) {
      GraphNode<T> _get = this.nodes.get(evalFirstValue);
      firstNode = _get;
    } else {
      GraphNode<T> _createNode = this.createNode(evalFirstValue);
      firstNode = _createNode;
      this.nodes.put(evalFirstValue, firstNode);
    }
    boolean _containsKey_1 = this.nodes.containsKey(evalAfterValue);
    if (_containsKey_1) {
      GraphNode<T> _get_1 = this.nodes.get(evalAfterValue);
      afterNode = _get_1;
    } else {
      GraphNode<T> _createNode_1 = this.createNode(evalAfterValue);
      afterNode = _createNode_1;
      this.nodes.put(evalAfterValue, afterNode);
    }
    firstNode.addGoingOutNode(afterNode);
    afterNode.addComingInNode(firstNode);
  }
  
  /**
   * Creates a graph node of the <T> generic type
   * 
   * @param value
   * The value that is hosted by the node
   * @return a generic GraphNode object
   */
  private GraphNode<T> createNode(final T value) {
    GraphNode<T> node = new GraphNode<T>();
    node.value = value;
    return node;
  }
  
  /**
   * Get the node that has not a parent
   */
  public List<GraphNode<T>> getOrphanNodes() {
    List<GraphNode<T>> orphanNodes = null;
    Set<T> keys = this.nodes.keySet();
    for (final T key : keys) {
      {
        GraphNode<T> node = this.nodes.get(key);
        boolean _and = false;
        List<GraphNode<T>> _comingInNodes = node.getComingInNodes();
        boolean _equals = Objects.equal(_comingInNodes, null);
        if (!_equals) {
          _and = false;
        } else {
          List<GraphNode<T>> _comingInNodes_1 = node.getComingInNodes();
          boolean _equals_1 = Objects.equal(_comingInNodes_1, null);
          _and = _equals_1;
        }
        if (_and) {
          boolean _equals_2 = Objects.equal(orphanNodes, null);
          if (_equals_2) {
            ArrayList<GraphNode<T>> _arrayList = new ArrayList<GraphNode<T>>();
            orphanNodes = _arrayList;
          }
          orphanNodes.add(node);
        }
      }
    }
    return orphanNodes;
  }
  
  public List<GraphNode<T>> getLeafNodes() {
    List<GraphNode<T>> leafNodes = null;
    Set<T> keys = this.nodes.keySet();
    for (final T key : keys) {
      {
        GraphNode<T> node = this.nodes.get(key);
        List<GraphNode<T>> _goingOutNodes = node.getGoingOutNodes();
        boolean _equals = Objects.equal(_goingOutNodes, null);
        if (_equals) {
          boolean _equals_1 = Objects.equal(leafNodes, null);
          if (_equals_1) {
            ArrayList<GraphNode<T>> _arrayList = new ArrayList<GraphNode<T>>();
            leafNodes = _arrayList;
          }
          leafNodes.add(node);
        }
      }
    }
    return leafNodes;
  }
  
  public List<GraphNode<T>> deploymentOrder() {
    List<GraphNode<T>> currentNodes = this.getLeafNodes();
    List<GraphNode<T>> orphnanNodes = this.getOrphanNodes();
    List<GraphNode<T>> _orphanNodes = this.getOrphanNodes();
    for (final GraphNode<T> m : _orphanNodes) {
      InputOutput.<T>println(m.value);
    }
    List<GraphNode<T>> newleafNodes = new ArrayList<GraphNode<T>>();
    while ((!currentNodes.isEmpty())) {
      {
        for (final GraphNode<T> g : currentNodes) {
          List<GraphNode<T>> _comingInNodes = g.getComingInNodes();
          boolean _notEquals = (!Objects.equal(_comingInNodes, null));
          if (_notEquals) {
            final List<GraphNode<T>> realLeafs = g.getComingInNodes();
            realLeafs.removeAll(orphnanNodes);
            ArrayList<GraphNode<T>> _arrayList = new ArrayList<GraphNode<T>>(realLeafs);
            newleafNodes.addAll(_arrayList);
          }
        }
        for (final GraphNode<T> n : currentNodes) {
          boolean _contains = this.deploymentOrder.contains(n);
          boolean _not = (!_contains);
          if (_not) {
            this.deploymentOrder.add(n);
          }
        }
        ArrayList<GraphNode<T>> _arrayList_1 = new ArrayList<GraphNode<T>>(newleafNodes);
        currentNodes = _arrayList_1;
        ArrayList<GraphNode<T>> _arrayList_2 = new ArrayList<GraphNode<T>>();
        newleafNodes = _arrayList_2;
      }
    }
    for (final GraphNode<T> n : orphnanNodes) {
      boolean _contains = this.deploymentOrder.contains(n);
      boolean _not = (!_contains);
      if (_not) {
        this.deploymentOrder.add(n);
      }
    }
    return this.deploymentOrder;
  }
  
  public boolean isAlreadyEvaluated(final GraphNode<T> node) {
    return this.evaluatedNodes.contains(node);
  }
  
  public boolean areAlreadyEvaluated(final List<GraphNode<T>> nodes) {
    return this.evaluatedNodes.containsAll(nodes);
  }
}
