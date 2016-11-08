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
package org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup;

import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class CgroupManager {
  private static Logger LOGGER = LoggerFactory.getLogger(CgroupManager.class);
  
  private final static String cGroupPath = "/sys/fs/cgroup/";
  
  public final static String blkio_subsystem = "blkio";
  
  public final static String cpuset_subsystem = "cpuset";
  
  public final static String cpu_subsystem = "cpu";
  
  public final static String cpuacct_subsystem = "cpuacct";
  
  public final static String devices_subsystem = "devices";
  
  public final static String freezer_subsystem = "freezer";
  
  public final static String memory_subsystem = "memory";
  
  public final static String netcls_subsystem = "net_cls";
  
  public final static String blkio_write = "blkio.throttle.write_bps_device";
  
  public final static String blkio_read = "blkio.throttle.read_bps_device";
  
  public final static String memory_max_mem = "memory.limit_in_bytes";
  
  public final static String memory_swap = "memory.memsw.limit_in_bytes";
  
  public final static String cpuset_cpus = "cpuset.cpus";
  
  public final static String net_cls_classid = "net_cls.classid";
  
  public final static String cpu_cfs_period = "cpu.cfs_period_us";
  
  public final static String cpu_cfs_quota = "cpu.cfs_quota_us";
  
  public static void SetValue(final String host, final String privateKey, final Container container, final String subsystem, final String file, final String value) {
    String _containerid = container.getContainerid();
    String _plus = (((CgroupManager.cGroupPath + subsystem) + "/docker/") + _containerid);
    String _plus_1 = (_plus + "/");
    final String FilePath = (_plus_1 + file);
    String command = "";
    final DockerContainerManager dockerContainerManager = new DockerContainerManager();
    boolean _equalsIgnoreCase = file.equalsIgnoreCase(CgroupManager.memory_max_mem);
    if (_equalsIgnoreCase) {
      float _parseFloat = Float.parseFloat(value);
      int _intValue = Float.valueOf(_parseFloat).intValue();
      String _plus_2 = ("echo \'" + Integer.valueOf(_intValue));
      String _plus_3 = (_plus_2 + "\' > ");
      String _plus_4 = (_plus_3 + FilePath);
      command = _plus_4;
      CgroupManager.LOGGER.info("EXECUTE COMMAND: {}", command);
      dockerContainerManager.connect(host, privateKey, command);
    } else {
      boolean _equalsIgnoreCase_1 = file.equalsIgnoreCase(CgroupManager.cpuset_cpus);
      if (_equalsIgnoreCase_1) {
        String _cpuSetGenerator = CgroupManager.cpuSetGenerator(value, container);
        String _plus_5 = ("echo \'" + _cpuSetGenerator);
        String _plus_6 = (_plus_5 + "\' > ");
        String _plus_7 = (_plus_6 + FilePath);
        command = _plus_7;
        CgroupManager.LOGGER.info("EXECUTE COMMAND: {}", command);
        dockerContainerManager.connect(host, privateKey, command);
      } else {
        boolean _equalsIgnoreCase_2 = file.equalsIgnoreCase(CgroupManager.net_cls_classid);
        if (_equalsIgnoreCase_2) {
          float _parseFloat_1 = Float.parseFloat(value);
          int _intValue_1 = Float.valueOf(_parseFloat_1).intValue();
          String _plus_8 = ("echo \'" + Integer.valueOf(_intValue_1));
          String _plus_9 = (_plus_8 + "\' > ");
          String _plus_10 = (_plus_9 + FilePath);
          command = _plus_10;
          CgroupManager.LOGGER.info("EXECUTE COMMAND: {}", command);
          dockerContainerManager.connect(host, privateKey, command);
        } else {
          boolean _equalsIgnoreCase_3 = file.equalsIgnoreCase(CgroupManager.memory_swap);
          if (_equalsIgnoreCase_3) {
            float _parseFloat_2 = Float.parseFloat(value);
            int _intValue_2 = Float.valueOf(_parseFloat_2).intValue();
            String _plus_11 = ("echo \'" + Integer.valueOf(_intValue_2));
            String _plus_12 = (_plus_11 + "\' > ");
            String _plus_13 = (_plus_12 + FilePath);
            command = _plus_13;
            CgroupManager.LOGGER.info("EXECUTE COMMAND: {}", command);
            dockerContainerManager.connect(host, privateKey, command);
          }
        }
      }
    }
  }
  
  public static String cpuSetGenerator(final String nbCores, final Container container) {
    if ((((Integer.valueOf(nbCores)).intValue() > 1) && ((Integer.valueOf(nbCores)).intValue() <= container.getCore_max()))) {
      String cpuSet = String.format("0-%s", nbCores);
      return cpuSet;
    }
    return "0";
  }
}
