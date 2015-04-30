package org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph;

@SuppressWarnings("all")
public interface NodeValueListener<T extends Object> {
  public abstract void evaluating(final T nodeValue);
}
