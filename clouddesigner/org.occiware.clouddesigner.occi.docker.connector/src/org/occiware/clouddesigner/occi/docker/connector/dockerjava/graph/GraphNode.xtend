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
import java.util.List
import org.slf4j.LoggerFactory
import org.slf4j.Logger

class GraphNode<T> {
	public T value;
	private List<GraphNode<T>> comingInNodes
	private List<GraphNode<T>> goingOutNodes
	// Initialize logger for Graph.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(Graph))
		/*
         * Adds an incoming node to the current node
         * 
         * @param node
         *            The incoming node
         */
	def void addComingInNode(GraphNode<T> node) {
		if (comingInNodes == null) {
			comingInNodes = new ArrayList<GraphNode<T>>
		}
		comingInNodes.add(node)
	}

		/*
         * Adds an outgoing node from the current node
         * 
         * @param node
         *            The outgoing node
         */
	def void addGoingOutNode(GraphNode<T> node) {
		if (goingOutNodes == null) {
			goingOutNodes = new ArrayList<GraphNode<T>>
		}
		goingOutNodes.add(node)
	}

	/**
         * Provides all the coming in nodes
         * 
         * @return The coming in nodes
         */
	def List<GraphNode<T>> getComingInNodes() {
		return comingInNodes
	}

		/*
         * Provides all the going out nodes
         * 
         * @return The going out nodes
         */
	def List<GraphNode<T>> getGoingOutNodes() {
		return goingOutNodes
	}

	def int getGoingOutNodesSize() {
		if (goingOutNodes == null) {
			goingOutNodes = new ArrayList<GraphNode<T>>
		}
		return goingOutNodes.size
	}

	def int getComingInNodesSize() {
		if (comingInNodes == null) {
			comingInNodes = new ArrayList<GraphNode<T>>
		}
		return comingInNodes.size
	}

	def int getTreeSize(GraphNode<T> node) {
		var int count = 1;
		if (node.getGoingOutNodesSize() > 0) {
			count++ // Get number of familly
			for (GraphNode<T> n : node.getGoingOutNodes()) {
				if (n.getGoingOutNodesSize() > 0) {
					count++ // Get number of familly
					getTreeSize(n)
				}
			}
		}
		return count
	}
}
