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
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class notifies stats events to the connector.
 */
@SuppressWarnings("all")
public class StatsCallback extends ResultCallbackTemplate<StatsCallback, Statistics> {
  private static Logger LOGGER = LoggerFactory.getLogger(StatsCallback.class);
  
  private Boolean gotStats = Boolean.valueOf(false);
  
  private ExecutableContainer container;
  
  public StatsCallback(final ExecutableContainer container) {
    this.container = container;
  }
  
  @Override
  public void onNext(final Statistics stats) {
    StatsCallback.LOGGER.info("Received stats #{} ", stats);
    boolean _notEquals = (!Objects.equal(stats, null));
    if (_notEquals) {
      this.gotStats = Boolean.valueOf(true);
    }
  }
  
  public Boolean gotStats() {
    return this.gotStats;
  }
}
