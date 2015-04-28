package org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph

import java.util.ArrayList
import java.util.List

class GraphNode<T> {
	public T value;
	private List<GraphNode<T>> comingInNodes
	private List<GraphNode<T>> goingOutNodes

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
