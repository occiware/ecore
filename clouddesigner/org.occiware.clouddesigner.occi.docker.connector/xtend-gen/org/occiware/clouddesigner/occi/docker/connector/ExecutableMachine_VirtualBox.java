/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Fawaz PARAISO
 * - Philippe MERLE
 */
package org.occiware.clouddesigner.occi.docker.connector;

import org.apache.commons.lang.StringUtils;
import org.occiware.clouddesigner.occi.docker.connector.MachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver;
import org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Virtualbox.
 */
@SuppressWarnings("all")
public class ExecutableMachine_VirtualBox extends Machine_VirtualBoxImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "virtualbox";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      if ((ExecutableMachine_VirtualBox.this.disk_size > 0)) {
        StringBuilder _append = sb.append(" --virtualbox-disk-size ");
        _append.append(ExecutableMachine_VirtualBox.this.disk_size);
      }
      if ((ExecutableMachine_VirtualBox.this.memory > 0.0F)) {
        StringBuilder _append_1 = sb.append(" --virtualbox-memory ");
        int _intValue = Float.valueOf(ExecutableMachine_VirtualBox.this.memory).intValue();
        _append_1.append(_intValue);
      } else {
        if ((ExecutableMachine_VirtualBox.this.memory == 0.0F)) {
          StringBuilder _append_2 = sb.append(" --virtualbox-memory ");
          _append_2.append(1024);
        }
      }
      if ((ExecutableMachine_VirtualBox.this.cores > 0)) {
        StringBuilder _append_3 = sb.append(" --virtualbox-cpu-count ");
        _append_3.append(ExecutableMachine_VirtualBox.this.cores);
      } else {
        if ((ExecutableMachine_VirtualBox.this.cores == 0)) {
          StringBuilder _append_4 = sb.append(" --virtualbox-cpu-count ");
          _append_4.append((-1));
        }
      }
      boolean _isEmpty = StringUtils.isEmpty(ExecutableMachine_VirtualBox.this.boot2docker_url);
      boolean _not = (!_isEmpty);
      if (_not) {
        StringBuilder _append_5 = sb.append(" --virtualbox-boot2docker-url ");
        _append_5.append(ExecutableMachine_VirtualBox.this.boot2docker_url);
      } else {
        StringBuilder _append_6 = sb.append(" --virtualbox-boot2docker-url ");
        _append_6.append("https://github.com/boot2docker/boot2docker/releases/download/v1.11.2/boot2docker.iso");
      }
      if (ExecutableMachine_VirtualBox.this.host_dns_resolver) {
        StringBuilder _append_7 = sb.append(" --virtualbox-host-dns-resolver ");
        _append_7.append(ExecutableMachine_VirtualBox.this.host_dns_resolver);
      }
      boolean _isEmpty_1 = StringUtils.isEmpty(ExecutableMachine_VirtualBox.this.import_boot2docker_vm);
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        StringBuilder _append_8 = sb.append(" --virtualbox-import-boot2docker-vm ");
        _append_8.append(ExecutableMachine_VirtualBox.this.import_boot2docker_vm);
      }
      if (ExecutableMachine_VirtualBox.this.host_dns_resolver) {
        StringBuilder _append_9 = sb.append(" --virtualbox-host-dns-resolver ");
        _append_9.append(ExecutableMachine_VirtualBox.this.host_dns_resolver);
      }
      boolean _isEmpty_2 = StringUtils.isEmpty(ExecutableMachine_VirtualBox.this.hostonly_nictype);
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        StringBuilder _append_10 = sb.append(" --virtualbox-hostonly-nictype ");
        _append_10.append(ExecutableMachine_VirtualBox.this.hostonly_nictype);
      }
      if (ExecutableMachine_VirtualBox.this.no_share) {
        StringBuilder _append_11 = sb.append(" --virtualbox-no-share ");
        _append_11.append(ExecutableMachine_VirtualBox.this.no_share);
      }
      if (ExecutableMachine_VirtualBox.this.no_dns_proxy) {
        StringBuilder _append_12 = sb.append(" --virtualbox-no-dns-proxy ");
        _append_12.append(ExecutableMachine_VirtualBox.this.no_dns_proxy);
      }
      if (ExecutableMachine_VirtualBox.this.no_vtx_check) {
        StringBuilder _append_13 = sb.append(" --virtualbox-no-vtx-check ");
        _append_13.append(ExecutableMachine_VirtualBox.this.no_vtx_check);
      }
      boolean _isEmpty_3 = StringUtils.isEmpty(ExecutableMachine_VirtualBox.this.share_folder);
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        StringBuilder _append_14 = sb.append(" --virtualbox-share-folder ");
        _append_14.append(ExecutableMachine_VirtualBox.this.share_folder);
      }
    }
  };
  
  @Override
  public void start() {
    this.manager.start();
    final DockerObserver observer = new DockerObserver();
    observer.listener(this);
  }
  
  public void startAll() {
    this.manager.startAll();
  }
  
  @Override
  public void stop(final StopMethod method) {
    this.manager.stop(method);
  }
  
  @Override
  public void restart(final RestartMethod method) {
    this.manager.restart(method);
  }
  
  @Override
  public void suspend(final SuspendMethod method) {
    this.manager.suspend(method);
  }
  
  public void synchronize() {
    this.manager.synchronize();
  }
}
