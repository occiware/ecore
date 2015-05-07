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
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util;

import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Output {
  public static synchronized String print(final String string) {
    return InputOutput.<String>println(string);
  }
  
  public static synchronized String printErr(final String string) {
    return InputOutput.<String>println(string);
  }
  
  public static synchronized void printlnErr(final String string) {
    System.err.print(string);
  }
  
  public static synchronized void flushOut() {
    System.out.flush();
  }
  
  public static synchronized void flushErr() {
    System.err.flush();
  }
}
