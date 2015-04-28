package org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph

interface NodeValueListener<T> {
	def void evaluating(T nodeValue);
}
