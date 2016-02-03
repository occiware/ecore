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
package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders

import org.jclouds.domain.Location
import java.util.List
import org.jclouds.compute.domain.Hardware
import org.jclouds.openstack.nova.v2_0.domain.Volume

abstract class IaaSHandler {

	/**
	 * Create a machine on target provider
	 */
	def createMachine() {
	}

	/**
	 * Start a machine
	 * 
	 */
	def startMachine() {
	}

	/**
	 * Stop a machine
	 * 
	 */
	def void stopMachine() {
	}

	/**
	 * Restart a machine
	 * 
	 */
	def restartMachine() {
	}

	/**
	 * List all machine available on the target provider
	 * 
	 */
	def listMachines() {
	}

	/**
	 * List all images available on the target provider
	 * 
	 */
	def listImages() {
	}

	/**
	 * List all region available on the target provider
	 * 
	 */
	def List<Location> listLocations() {
	}

	/**
	 * List all hardware available on target provider
	 * 
	 */
	def List<Hardware> listHardware() {
	}
	
	/**
	 * Create a volume
	 */
	def Volume createVolume(String volumeName, Integer size){
		
	}
	
	/**
	 * Attach a volume to machine
	 */
	def void attachVolume(String VolumeId){
		
	}
	
	/**
	 * Detach volume
	 */
	 def void detachVolume(String volumeId){
	 	
	 }
	
	/**
	 * Delete volume
	 */
	
	def void deleteVolume(){
		
	}

}
