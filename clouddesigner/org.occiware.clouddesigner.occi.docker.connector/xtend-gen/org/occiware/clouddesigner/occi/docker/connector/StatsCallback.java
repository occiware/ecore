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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
  
  private LinkedHashMap<Object, Object> containersMap = CollectionLiterals.<Object, Object>newLinkedHashMap();
  
  public StatsCallback(final String containerId) {
    this.containerId = containerId;
  }
  
  @Override
  public void onNext(final Statistics stats) {
    int _size = this.statisticsList.size();
    StatsCallback.LOGGER.info("Received stats #{} :: {} :: {}", Integer.valueOf(_size), this.containerId, stats);
    this.statisticsList.add(stats);
    boolean _notEquals = (!Objects.equal(stats, null));
    if (_notEquals) {
      this.gotStats = Boolean.valueOf(true);
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
