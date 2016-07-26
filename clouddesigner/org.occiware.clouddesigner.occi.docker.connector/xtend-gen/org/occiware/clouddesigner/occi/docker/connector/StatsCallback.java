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

import com.github.dockerjava.api.model.Statistics;
import com.github.dockerjava.core.async.ResultCallbackTemplate;
import com.google.common.base.Objects;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class notifies monitoring events from the connector.
 */
@SuppressWarnings("all")
public class StatsCallback extends ResultCallbackTemplate<StatsCallback, Statistics> {
  private static Logger LOGGER = LoggerFactory.getLogger(StatsCallback.class);
  
  private List<Statistics> statisticsList = new LinkedList<Statistics>();
  
  private Boolean gotStats = Boolean.valueOf(false);
  
  private String containerId;
  
  private Container container;
  
  private LinkedHashMap<Object, Object> containersMap = CollectionLiterals.<Object, Object>newLinkedHashMap();
  
  public StatsCallback(final String containerId) {
    this.containerId = containerId;
  }
  
  public StatsCallback(final Container container) {
    this.container = container;
  }
  
  @Override
  public void onNext(final Statistics stats) {
    int _size = this.statisticsList.size();
    String _containerid = this.container.getContainerid();
    StatsCallback.LOGGER.info("Received stats #{} :: {} :: {}", Integer.valueOf(_size), _containerid, stats);
    this.statisticsList.add(stats);
    this.modifyResourceSet(this.container, stats);
    boolean _notEquals = (!Objects.equal(stats, null));
    if (_notEquals) {
      this.gotStats = Boolean.valueOf(true);
    }
  }
  
  public void modifyResourceSet(final Resource resource, final Statistics stats) {
    try {
      org.eclipse.emf.ecore.resource.Resource _eResource = resource.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_resourceSet);
      Thread.sleep((30 * 1000));
      Command cmd = new RecordingCommand(domain) {
        @Override
        protected void doExecute() {
          Map<String, Object> _memoryStats = stats.getMemoryStats();
          Object _get = _memoryStats.get("usage");
          Integer memory = ((Integer) _get);
          Map<String, Object> cpu = stats.getCpuStats();
          Object _get_1 = cpu.get("cpu_usage");
          LinkedHashMap tmpcpu = ((LinkedHashMap) _get_1);
          Object cpu_used = tmpcpu.get("total_usage");
          StatsCallback.LOGGER.info("Received CPU <=====> {}", cpu_used);
          String _valueOf = String.valueOf(memory);
          ((ExecutableContainer) resource).setMemory_used(_valueOf);
          String _valueOf_1 = String.valueOf(cpu_used);
          ((ExecutableContainer) resource).setCpu_used(_valueOf_1);
        }
      };
      try {
        CommandStack _commandStack = domain.getCommandStack();
        ((TransactionalCommandStack) _commandStack).execute(cmd, null);
      } catch (final Throwable _t) {
        if (_t instanceof RollbackException) {
          final RollbackException rbe = (RollbackException)_t;
          IStatus _status = rbe.getStatus();
          String _string = _status.toString();
          StatsCallback.LOGGER.error(_string);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Boolean gotStats() {
    return this.gotStats;
  }
  
  public String getContainerId() {
    return this.containerId;
  }
  
  public List<Statistics> getStatisticsList() {
    return this.statisticsList;
  }
  
  public Boolean compateTo(final Statistics stats1, final Statistics stats2) {
    String _string = stats1.toString();
    String _string_1 = stats2.toString();
    return Boolean.valueOf(_string.equals(_string_1));
  }
}
