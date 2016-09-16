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
import java.text.DecimalFormat;
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
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.occiware.clouddesigner.occi.docker.connector.LimitedQueue;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class notifies monitoring events from the connector.
 */
@SuppressWarnings("all")
public class StatsCallback extends ResultCallbackTemplate<StatsCallback, Statistics> {
  private static Logger LOGGER = LoggerFactory.getLogger(StatsCallback.class);
  
  private List<Statistics> statisticsList = new LinkedList<Statistics>();
  
  private String containerId;
  
  private Container container;
  
  private LimitedQueue<Float> cpuTotalUsageQueue = new LimitedQueue<Float>(2);
  
  private LimitedQueue<Float> cpuSystemUsageQueue = new LimitedQueue<Float>(2);
  
  public StatsCallback(final String containerId) {
    this.containerId = containerId;
  }
  
  public StatsCallback(final Container container) {
    this.container = container;
  }
  
  @Override
  public void onNext(final Statistics stats) {
    try {
      int _size = this.statisticsList.size();
      String _containerid = this.container.getContainerid();
      StatsCallback.LOGGER.info("Received stats #{} :: {} :: {}", Integer.valueOf(_size), _containerid, stats);
      int _monitoring_interval = ((ExecutableContainer) this.container).getMonitoring_interval();
      Thread.sleep(_monitoring_interval);
      this.statisticsList.add(stats);
      Map<String, Object> cpu = stats.getCpuStats();
      Object _get = cpu.get("cpu_usage");
      LinkedHashMap tmpcpu = ((LinkedHashMap) _get);
      Object cpu_used = tmpcpu.get("total_usage");
      Object percpu_usage = tmpcpu.get("percpu_usage");
      Object system_cpu_usage = cpu.get("system_cpu_usage");
      List percpu_usage_size = ((List) percpu_usage);
      Map<String, Object> _memoryStats = stats.getMemoryStats();
      Object _get_1 = _memoryStats.get("usage");
      Integer mem_used = ((Integer) _get_1);
      Map<String, Object> _memoryStats_1 = stats.getMemoryStats();
      Object _get_2 = _memoryStats_1.get("limit");
      Integer mem_limit = ((Integer) _get_2);
      Map<String, Object> _network = stats.getNetwork();
      Object _get_3 = _network.get("rx_bytes");
      Integer network_r = ((Integer) _get_3);
      Map<String, Object> _network_1 = stats.getNetwork();
      Object _get_4 = _network_1.get("tx_bytes");
      Integer network_t = ((Integer) _get_4);
      Integer bandwitdh = Integer.valueOf(((network_r).intValue() + (network_t).intValue()));
      String _string = cpu_used.toString();
      Float _valueOf = Float.valueOf(_string);
      this.cpuTotalUsageQueue.add(_valueOf);
      String _string_1 = system_cpu_usage.toString();
      Float _valueOf_1 = Float.valueOf(_string_1);
      this.cpuSystemUsageQueue.add(_valueOf_1);
      boolean _and = false;
      int _size_1 = this.cpuTotalUsageQueue.size();
      boolean _equals = (_size_1 == 2);
      if (!_equals) {
        _and = false;
      } else {
        int _size_2 = this.cpuSystemUsageQueue.size();
        boolean _equals_1 = (_size_2 == 2);
        _and = _equals_1;
      }
      if (_and) {
        int _size_3 = percpu_usage_size.size();
        Float percent = this.calculateCPUPercent(this.cpuTotalUsageQueue, this.cpuSystemUsageQueue, _size_3);
        String _string_2 = cpu_used.toString();
        this.modifyResourceSet(this.container, _string_2, percent, mem_used, mem_limit, bandwitdh);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void modifyResourceSet(final Resource resource, final String cpu_used, final Float percent, final Integer mem_used, final Integer mem_limit, final Integer bandwitdh) {
    try {
      org.eclipse.emf.ecore.resource.Resource _eResource = resource.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_resourceSet);
      Command cmd = new RecordingCommand(domain) {
        @Override
        protected void doExecute() {
          DecimalFormat df = new DecimalFormat("#0.##");
          int cpu_max = 0;
          Float cpu_us = Float.valueOf(0.0F);
          String _string = mem_used.toString();
          int _parseInt = Integer.parseInt(_string);
          float _floatValue = Integer.valueOf(_parseInt).floatValue();
          String _string_1 = mem_limit.toString();
          int _parseInt_1 = Integer.parseInt(_string_1);
          float _floatValue_1 = Integer.valueOf(_parseInt_1).floatValue();
          Float mem_percent = Float.valueOf((_floatValue / _floatValue_1));
          try {
            ComputeStatus _state = ((ExecutableContainer) resource).getState();
            boolean _equals = Objects.equal(_state, ComputeStatus.ACTIVE);
            if (_equals) {
              String _string_2 = mem_used.toString();
              int _parseInt_2 = Integer.parseInt(_string_2);
              ((ExecutableContainer) resource).setMemory_used(_parseInt_2);
              String _string_3 = mem_limit.toString();
              int _parseInt_3 = Integer.parseInt(_string_3);
              ((ExecutableContainer) resource).setMemory_max_value(_parseInt_3);
              String _format = df.format(mem_percent);
              ((ExecutableContainer) resource).setMemory_percent(_format);
              ((ExecutableContainer) resource).setBandwidth_used((bandwitdh).intValue());
              String _string_4 = cpu_used.toString();
              Long _valueOf = Long.valueOf(_string_4);
              float _floatValue_2 = _valueOf.floatValue();
              float _divide = (_floatValue_2 / 1000000F);
              cpu_us = Float.valueOf(_divide);
              int _intValue = cpu_us.intValue();
              boolean _greaterThan = (_intValue > Integer.MAX_VALUE);
              if (_greaterThan) {
                cpu_us = Float.valueOf(((cpu_us).floatValue() / 100000000F));
              }
              int _intValue_1 = cpu_us.intValue();
              String _string_5 = Integer.valueOf(_intValue_1).toString();
              long _parseLong = Long.parseLong(_string_5);
              int _maxValue = StatsCallback.this.getMaxValue(Long.valueOf(_parseLong), percent);
              cpu_max = _maxValue;
              int _intValue_2 = Integer.valueOf(cpu_max).intValue();
              boolean _greaterThan_1 = (_intValue_2 > Integer.MAX_VALUE);
              if (_greaterThan_1) {
                cpu_max = (cpu_max / 100000000);
                cpu_us = Float.valueOf(((cpu_us).floatValue() / 100000000F));
              }
              int _intValue_3 = cpu_us.intValue();
              ((ExecutableContainer) resource).setCpu_used(_intValue_3);
              int _intValue_4 = cpu_us.intValue();
              StatsCallback.LOGGER.info("CPU USED <=====> {}", Integer.valueOf(_intValue_4));
              Integer _valueOf_1 = Integer.valueOf(cpu_max);
              ((ExecutableContainer) resource).setCpu_max_value((_valueOf_1).intValue());
              Integer _valueOf_2 = Integer.valueOf(cpu_max);
              StatsCallback.LOGGER.info("CPU MAX VALUE <=====> {}", _valueOf_2);
              String _format_1 = df.format(percent);
              ((ExecutableContainer) resource).setCpu_percent(_format_1);
            }
          } catch (final Throwable _t) {
            if (_t instanceof NumberFormatException) {
              final NumberFormatException e = (NumberFormatException)_t;
              String _message = e.getMessage();
              StatsCallback.LOGGER.error(_message);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
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
  
  public Float calculateCPUPercent(final LimitedQueue<Float> cpuTotalUsageQueue, final LimitedQueue<Float> cpuSystemUsageQueue, final int percpu_usage_size) {
    Float cpuPercent = Float.valueOf(0.0F);
    Float _get = cpuTotalUsageQueue.get(1);
    String _string = _get.toString();
    Float _valueOf = Float.valueOf(_string);
    Float _get_1 = cpuTotalUsageQueue.get(0);
    String _string_1 = _get_1.toString();
    Float _valueOf_1 = Float.valueOf(_string_1);
    float cpuDelta = ((_valueOf).floatValue() - (_valueOf_1).floatValue());
    Float _get_2 = cpuSystemUsageQueue.get(1);
    String _string_2 = _get_2.toString();
    Float _valueOf_2 = Float.valueOf(_string_2);
    Float _get_3 = cpuSystemUsageQueue.get(0);
    String _string_3 = _get_3.toString();
    Float _valueOf_3 = Float.valueOf(_string_3);
    float systemDelta = ((_valueOf_2).floatValue() - (_valueOf_3).floatValue());
    if (((systemDelta > 0.0) && (cpuDelta > 0.0))) {
      cpuPercent = Float.valueOf((((cpuDelta / systemDelta) * percpu_usage_size) * 100.0F));
    }
    return cpuPercent;
  }
  
  public int getMaxValue(final Long cpu_used, final Float percent) {
    float _floatValue = cpu_used.floatValue();
    float _multiply = (100F * _floatValue);
    float value = (_multiply / (percent).floatValue());
    int maxValue = Float.valueOf(value).intValue();
    return maxValue;
  }
}
