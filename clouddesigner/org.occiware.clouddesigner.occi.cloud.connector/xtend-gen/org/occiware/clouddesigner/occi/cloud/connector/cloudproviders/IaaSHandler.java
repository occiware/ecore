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
package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders;

import java.util.List;

@SuppressWarnings("all")
public abstract class IaaSHandler {
  /**
   * Create a machine on target provider
   */
  public Object createMachine() {
    return null;
  }
  
  /**
   * Start a machine
   */
  public Object startMachine() {
    return null;
  }
  
  /**
   * Launch a machine
   */
  public Object lanchMachine() {
    return null;
  }
  
  /**
   * Stop a machine
   */
  public void stopMachine() {
  }
  
  /**
   * Stop a machine
   */
  public void stopMachine(final String machineId) {
  }
  
  /**
   * Restart a machine
   */
  public Object restartMachine() {
    return null;
  }
  
  /**
   * List all machine available on the target provider
   */
  public Object listMachines() {
    return null;
  }
  
  /**
   * List all images available on the target provider
   */
  public Object listImages() {
    return null;
  }
  
  /**
   * List all region available on the target provider
   */
  public /* List<Location> */Object listLocations() {
    return null;
  }
  
  /**
   * List all hardware available on target provider
   */
  public /* List<Hardware> */Object listHardware() {
    return null;
  }
  
  /**
   * Create a volume
   */
  public /* Volume */Object createVolume(final String volumeName, final Integer size) {
    return null;
  }
  
  /**
   * Attach a volume to machine
   */
  public void attachVolume(final String VolumeId) {
  }
  
  /**
   * Detach volume
   */
  public void detachVolume(final String volumeId) {
  }
  
  /**
   * Delete volume
   */
  public void deleteVolume() {
  }
}
