 /*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	- Fawaz PARAISO 
 *******************************************************************************/
package org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Set
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Graph<T> {
	
	// Initialize logger for Graph.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(Graph))

	/*
         * Organize the deployment order of the Nodes
         */
	private List<GraphNode<T>> deploymentOrder = newArrayList

	/*
         * These are basically the nodes of the graph
         */
	private HashMap<T, GraphNode<T>> nodes = new HashMap<T, GraphNode<T>>

	/*
         * The callback interface used to notify of the fact that a node just got
         * the evaluation
         */
	private NodeValueListener<T> listener

	/*
         * It holds a list of the already evaluated nodes
         */
	private List<GraphNode<T>> evaluatedNodes = new ArrayList<GraphNode<T>>

	/*
         * The main constructor that has one parameter representing the callback
         * mechanism used by this class to notify when a node gets the evaluation.
         * 
         * @param listener
         * The callback interface implemented by the user classes
         */
	def Graph(NodeValueListener<T> listener) {
		this.listener = listener
	}

	/*
         * Allows adding of new dependicies to the graph. "evalFirstValue" needs to
         * be evaluated before "evalAfterValue"
         * 
         * @param evalFirstValue
         *            The parameter that needs to be evaluated first
         * @param evalAfterValue
         *            The parameter that needs to be evaluated after
         */
	def void addDependency(T evalFirstValue, T evalAfterValue) {
		var GraphNode<T> firstNode = null
		var GraphNode<T> afterNode = null
		if (nodes.containsKey(evalFirstValue)) {
			firstNode = nodes.get(evalFirstValue);
		} else {
			firstNode = createNode(evalFirstValue);
			nodes.put(evalFirstValue, firstNode);
		}
		if (nodes.containsKey(evalAfterValue)) {
			afterNode = nodes.get(evalAfterValue);
		} else {
			afterNode = createNode(evalAfterValue);
			nodes.put(evalAfterValue, afterNode);
		}
		firstNode.addGoingOutNode(afterNode);
		afterNode.addComingInNode(firstNode);
	}

	/*
         * Creates a graph node of the <T> generic type
         * 
         * @param value
         * The value that is hosted by the node
         * @return a generic GraphNode object
         */
	def private GraphNode<T> createNode(T value) {
		var GraphNode<T> node = new GraphNode<T>();
		node.value = value;
		return node;
	}

	/*
	 * Get the node that has not a parent
	 *  
	 */
	def List<GraphNode<T>> getOrphanNodes() {
		var List<GraphNode<T>> orphanNodes = null
		var Set<T> keys = nodes.keySet
		for (T key : keys) {
			var GraphNode<T> node = nodes.get(key)
			if (node.getComingInNodes() == null && node.comingInNodes == null) {
				if (orphanNodes == null) {
					orphanNodes = new ArrayList<GraphNode<T>>
				}
				orphanNodes.add(node);
			}
		}
		return orphanNodes;
	}

	def List<GraphNode<T>> getLeafNodes() {
		var List<GraphNode<T>> leafNodes = null
		var Set<T> keys = nodes.keySet
		for (T key : keys) {
			var GraphNode<T> node = nodes.get(key)
			if (node.goingOutNodes == null) {
				if (leafNodes == null) {
					leafNodes = new ArrayList<GraphNode<T>>
				}
				leafNodes.add(node);
			}
		}
		return leafNodes;
	}

	def List<GraphNode<T>> deploymentOrder() {
		var currentNodes = getLeafNodes
		var orphnanNodes = getOrphanNodes
		for (GraphNode<T> m : orphnanNodes) {
			LOGGER.info("Orphans: " + m.value)
		}
		var List<GraphNode<T>> newleafNodes = new ArrayList<GraphNode<T>>
		while (!currentNodes.isEmpty) {
			for (GraphNode<T> g : currentNodes) {
				if (g.comingInNodes != null) {
					var realLeafs = g.comingInNodes
					realLeafs.removeAll(orphnanNodes)
					newleafNodes.addAll(new ArrayList<GraphNode<T>>(realLeafs))
				}
			}
			// remove linked graphs first
			val linkedGraphs = getLinkedGraphs(newleafNodes)
			// Add linked graphs after
			newleafNodes.addAll(new ArrayList<GraphNode<T>>(linkedGraphs))
			for (GraphNode<T> n : currentNodes) {
				if (!this.deploymentOrder.contains(n)) {
					this.deploymentOrder.add(n)
				}
			}
			currentNodes = new ArrayList<GraphNode<T>>(newleafNodes)
			newleafNodes = new ArrayList<GraphNode<T>>
		}
		for (GraphNode<T> n : orphnanNodes) {
			if (!this.deploymentOrder.contains(n)) {
				this.deploymentOrder.add(n)
			}
		}
		return this.deploymentOrder
	}
	
	def synchronized List<GraphNode<T>> getLinkedGraphs(List<GraphNode<T>> graphs){
		var List<GraphNode<T>> linkedGraphs = new ArrayList<GraphNode<T>>
		for (GraphNode<T> firstVal:graphs){
			for(GraphNode<T> g:graphs){
				if(g.comingInNodes.contains(firstVal)){
					linkedGraphs.add(firstVal)
				}
			}
   		}
   		graphs.removeAll(linkedGraphs)
		return linkedGraphs
	}
	
	def boolean isAlreadyEvaluated(GraphNode<T> node) {
		return evaluatedNodes.contains(node);
	}

	def boolean areAlreadyEvaluated(List<GraphNode<T>> nodes) {
		return evaluatedNodes.containsAll(nodes);
	}
}
