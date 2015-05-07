/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class GraphNode<T extends Object> {
  public T value;
  
  private List<GraphNode<T>> comingInNodes;
  
  private List<GraphNode<T>> goingOutNodes;
  
  /**
   * Adds an incoming node to the current node
   * 
   * @param node
   *            The incoming node
   */
  public void addComingInNode(final GraphNode<T> node) {
    boolean _equals = Objects.equal(this.comingInNodes, null);
    if (_equals) {
      ArrayList<GraphNode<T>> _arrayList = new ArrayList<GraphNode<T>>();
      this.comingInNodes = _arrayList;
    }
    this.comingInNodes.add(node);
  }
  
  /**
   * Adds an outgoing node from the current node
   * 
   * @param node
   *            The outgoing node
   */
  public void addGoingOutNode(final GraphNode<T> node) {
    boolean _equals = Objects.equal(this.goingOutNodes, null);
    if (_equals) {
      ArrayList<GraphNode<T>> _arrayList = new ArrayList<GraphNode<T>>();
      this.goingOutNodes = _arrayList;
    }
    this.goingOutNodes.add(node);
  }
  
  /**
   * Provides all the coming in nodes
   * 
   * @return The coming in nodes
   */
  public List<GraphNode<T>> getComingInNodes() {
    return this.comingInNodes;
  }
  
  /**
   * Provides all the going out nodes
   * 
   * @return The going out nodes
   */
  public List<GraphNode<T>> getGoingOutNodes() {
    return this.goingOutNodes;
  }
  
  public int getGoingOutNodesSize() {
    boolean _equals = Objects.equal(this.goingOutNodes, null);
    if (_equals) {
      ArrayList<GraphNode<T>> _arrayList = new ArrayList<GraphNode<T>>();
      this.goingOutNodes = _arrayList;
    }
    return this.goingOutNodes.size();
  }
  
  public int getComingInNodesSize() {
    boolean _equals = Objects.equal(this.comingInNodes, null);
    if (_equals) {
      ArrayList<GraphNode<T>> _arrayList = new ArrayList<GraphNode<T>>();
      this.comingInNodes = _arrayList;
    }
    return this.comingInNodes.size();
  }
  
  public int getTreeSize(final GraphNode<T> node) {
    int count = 1;
    int _goingOutNodesSize = node.getGoingOutNodesSize();
    boolean _greaterThan = (_goingOutNodesSize > 0);
    if (_greaterThan) {
      count++;
      List<GraphNode<T>> _goingOutNodes = node.getGoingOutNodes();
      for (final GraphNode<T> n : _goingOutNodes) {
        int _goingOutNodesSize_1 = n.getGoingOutNodesSize();
        boolean _greaterThan_1 = (_goingOutNodesSize_1 > 0);
        if (_greaterThan_1) {
          count++;
          this.getTreeSize(n);
        }
      }
    }
    return count;
  }
}
