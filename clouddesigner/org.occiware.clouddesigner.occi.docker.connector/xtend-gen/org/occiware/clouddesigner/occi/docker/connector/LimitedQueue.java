/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe MERLE
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector;

import java.util.LinkedList;

/**
 * This class implements Queue with size 2
 */
@SuppressWarnings("all")
public class LimitedQueue<E extends Object> extends LinkedList<E> {
  private int limit;
  
  public LimitedQueue(final int limit) {
    this.limit = limit;
  }
  
  @Override
  public boolean add(final E o) {
    super.add(o);
    while ((this.size() > this.limit)) {
      super.remove();
    }
    return true;
  }
}
