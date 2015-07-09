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
package org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.hypervisor.Interface;
import org.occiware.clouddesigner.occi.hypervisor.Machine;
import org.occiware.clouddesigner.occi.hypervisor.connector.generated.Domain;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableMachine;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableMachine_VirtualBox;
import org.occiware.clouddesigner.occi.infrastructure.Network;
import org.occiware.clouddesigner.occi.infrastructure.Storage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DomainMarshaller {
  private static Logger LOGGER = LoggerFactory.getLogger(DomainMarshaller.class);
  
  protected final String xmlDirectory = "/xml";
  
  protected final String storageDirectory = "/storage";
  
  protected final String ramDirectory = "/ram/";
  
  public final Map<String, String> uri = new HashMap<String, String>();
  
  public void loadUri() {
    this.uri.put("vbox", "vbox+unix:///session");
  }
  
  /**
   * Create an XML file from compute.
   * @param compute
   * @return domain
   */
  public Domain createComputeDescription(final Machine compute) {
    Domain domain = new Domain();
    if ((compute instanceof ExecutableMachine_VirtualBox)) {
      String _driver = ((ExecutableMachine_VirtualBox)compute).getDriver();
      domain.setType(_driver);
    }
    UUID _randomUUID = UUID.randomUUID();
    final String id = _randomUUID.toString();
    String _name = compute.getName();
    domain.setName(_name);
    domain.setUuid(id);
    compute.setUuid(id);
    float _memory = compute.getMemory();
    int _round = Math.round(_memory);
    domain.setMemory(_round);
    float _memory_1 = compute.getMemory();
    int _round_1 = Math.round(_memory_1);
    domain.setCurrentMemory(_round_1);
    int _cores = compute.getCores();
    domain.setVcpu(_cores);
    final Domain.Os os = new Domain.Os();
    os.setType("hvm");
    final Domain.Os.Boot boot1 = new Domain.Os.Boot();
    boot1.setDev("cdrom");
    final Domain.Os.Boot boot = new Domain.Os.Boot();
    boot.setDev("hd");
    List<Domain.Os.Boot> _boot = os.getBoot();
    _boot.add(boot1);
    List<Domain.Os.Boot> _boot_1 = os.getBoot();
    _boot_1.add(boot);
    domain.setOs(os);
    final Domain.Features features = new Domain.Features();
    features.setPae("");
    features.setAcpi("");
    features.setApic("");
    domain.setFeatures(features);
    final Domain.Clock clock = new Domain.Clock();
    clock.setOffset("localtime");
    domain.setClock(clock);
    domain.setOnPoweroff("destroy");
    domain.setOnReboot("restart");
    domain.setOnCrash("restart");
    final Domain.Devices devices = new Domain.Devices();
    final Domain.Devices.Disk disk = new Domain.Devices.Disk();
    disk.setType("file");
    disk.setDevice("disk");
    final Domain.Devices.Disk.Source source = new Domain.Devices.Disk.Source();
    File _createTempDir = this.createTempDir(this.storageDirectory);
    String _absolutePath = _createTempDir.getAbsolutePath();
    String _plus = (_absolutePath + "/");
    String _plus_1 = (_plus + id);
    String _plus_2 = (_plus_1 + ".vdi");
    source.setFile(_plus_2);
    EList<Link> _links = compute.getLinks();
    boolean _isEmpty = _links.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Link> _links_1 = compute.getLinks();
      for (final Link link : _links_1) {
        {
          Resource _target = link.getTarget();
          if ((_target instanceof Storage)) {
            List<Domain.Devices.Disk> _disk = devices.getDisk();
            Resource _target_1 = link.getTarget();
            Domain.Devices.Disk _createStorageDescription = this.createStorageDescription(((Storage) _target_1));
            _disk.add(_createStorageDescription);
          }
          Resource _target_2 = link.getTarget();
          if ((_target_2 instanceof Interface)) {
            List<Domain.Devices.Interface> _interface = devices.getInterface();
            Resource _target_3 = link.getTarget();
            Domain.Devices.Interface _createNetworkDescription = this.createNetworkDescription(((Interface) _target_3));
            _interface.add(_createNetworkDescription);
          }
        }
      }
    }
    final Domain.Devices.Disk.Target target = new Domain.Devices.Disk.Target();
    target.setDev("hdd");
    target.setBus("sata");
    disk.setSource(source);
    disk.setTarget(target);
    final Domain.Devices.Disk disk1 = new Domain.Devices.Disk();
    disk1.setType("file");
    disk1.setDevice("cdrom");
    disk1.setReadonly("");
    final Domain.Devices.Disk.Source source1 = new Domain.Devices.Disk.Source();
    source1.setFile("/Users/spirals/Downloads/ubuntu-14.04-server-i386.iso");
    final Domain.Devices.Disk.Target target1 = new Domain.Devices.Disk.Target();
    target1.setDev("hdc");
    target1.setBus("ide");
    disk1.setSource(source1);
    disk1.setTarget(target1);
    List<Domain.Devices.Disk> _disk = devices.getDisk();
    _disk.add(disk1);
    List<Domain.Devices.Disk> _disk_1 = devices.getDisk();
    _disk_1.add(disk);
    final Domain.Devices.Graphics graphic = new Domain.Devices.Graphics();
    graphic.setType("vnc");
    graphic.setPort(Integer.valueOf((-1)));
    devices.setGraphics(graphic);
    final Domain.Devices.Input input = new Domain.Devices.Input();
    input.setType("mouse");
    input.setBus("ps2");
    final Domain.Devices.Input input1 = new Domain.Devices.Input();
    input1.setType("keyboard");
    input1.setBus("ps2");
    List<Domain.Devices.Input> _input = devices.getInput();
    _input.add(input);
    List<Domain.Devices.Input> _input_1 = devices.getInput();
    _input_1.add(input1);
    domain.setDevices(devices);
    this.writeToDisk(domain);
    String _id = compute.getId();
    String _plus_3 = ("Domain description: " + _id);
    DomainMarshaller.LOGGER.info(_plus_3);
    return domain;
  }
  
  /**
   * Create the XML file from Network.
   * @param network
   * @return domain
   */
  public Domain.Devices.Interface createNetworkDescription(final Network network) {
    final Domain.Devices.Interface interface_ = new Domain.Devices.Interface();
    EObject _eContainer = network.eContainer();
    String _plus = ("Link size: ------------------>" + _eContainer);
    InputOutput.<String>println(_plus);
    interface_.setType("bridge");
    final Domain.Devices.Interface.Source source = new Domain.Devices.Interface.Source();
    String _label = network.getLabel();
    source.setBridge(_label);
    interface_.setSource(source);
    final Domain.Devices.Interface.Mac mac = new Domain.Devices.Interface.Mac();
    mac.setAddress("00:0c:29:76:78:50");
    interface_.setMac(mac);
    final Domain.Devices.Interface.Model model = new Domain.Devices.Interface.Model();
    model.setType("82540EM");
    interface_.setModel(model);
    return interface_;
  }
  
  public Domain.Devices.Interface createNetworkDescription(final Interface network) {
    final Domain.Devices.Interface interface_ = new Domain.Devices.Interface();
    EObject _eContainer = network.eContainer();
    String _plus = ("Link size: ------------------>" + _eContainer);
    InputOutput.<String>println(_plus);
    String _type = network.getType();
    interface_.setType(_type);
    final Domain.Devices.Interface.Source source = new Domain.Devices.Interface.Source();
    String _label = network.getLabel();
    source.setBridge(_label);
    interface_.setSource(source);
    final Domain.Devices.Interface.Mac mac = new Domain.Devices.Interface.Mac();
    String _mac_addresss = network.getMac_addresss();
    mac.setAddress(_mac_addresss);
    interface_.setMac(mac);
    final Domain.Devices.Interface.Model model = new Domain.Devices.Interface.Model();
    String _model = network.getModel();
    model.setType(_model);
    interface_.setModel(model);
    return interface_;
  }
  
  public String generateMacAddress() {
    return null;
  }
  
  /**
   * Create the XML file from Storage.
   * @param storage
   * @return domain
   */
  public Domain.Devices.Disk createStorageDescription(final Storage storage) {
    final Domain.Devices.Disk.Source source = new Domain.Devices.Disk.Source();
    File _createTempDir = this.createTempDir(this.storageDirectory);
    String _absolutePath = _createTempDir.getAbsolutePath();
    String _plus = (_absolutePath + "/");
    String _id = storage.getId();
    String _plus_1 = (_plus + _id);
    String _plus_2 = (_plus_1 + ".vdi");
    source.setFile(_plus_2);
    final Domain.Devices.Disk.Target target = new Domain.Devices.Disk.Target();
    target.setBus("sata");
    target.setDev("hda");
    final Domain.Devices.Disk disk = new Domain.Devices.Disk();
    disk.setType("file");
    disk.setDevice("disk");
    disk.setSource(source);
    disk.setTarget(target);
    return disk;
  }
  
  public File createTempDir(final String baseName) {
    String _property = System.getProperty("java.io.tmpdir");
    final File baseDir = new File(_property);
    File tempDir = new File(baseDir, baseName);
    boolean _exists = tempDir.exists();
    boolean _not = (!_exists);
    if (_not) {
      boolean _mkdir = tempDir.mkdir();
      if (_mkdir) {
        return tempDir;
      }
    } else {
      return tempDir;
    }
    return null;
  }
  
  public String asString(final String uuid) {
    try {
      final String filename = (("/" + uuid) + ".xml");
      final StringWriter logwriter = new StringWriter();
      final File tmpDir = this.createTempDir(this.xmlDirectory);
      String _plus = (tmpDir + "/");
      String _plus_1 = (_plus + filename);
      InputStream response = new FileInputStream(_plus_1);
      try {
        final LineIterator itr = IOUtils.lineIterator(response, "UTF-8");
        while (itr.hasNext()) {
          {
            String line = itr.next();
            boolean _hasNext = itr.hasNext();
            if (_hasNext) {
              logwriter.write((line + "\n"));
            } else {
              logwriter.write((line + ""));
            }
          }
        }
        response.close();
        return logwriter.toString();
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          throw new RuntimeException(e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      } finally {
        IOUtils.closeQuietly(response);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void writeToDisk(final Domain domain) {
    FileOutputStream fos = null;
    File file = null;
    try {
      final File tmpDir = this.createTempDir(this.xmlDirectory);
      String _plus = (tmpDir + "/");
      String _uuid = domain.getUuid();
      String _string = _uuid.toString();
      String _plus_1 = (_plus + _string);
      String _plus_2 = (_plus_1 + ".xml");
      File _file = new File(_plus_2);
      file = _file;
      String _absolutePath = file.getAbsolutePath();
      DomainMarshaller.LOGGER.info(_absolutePath);
      boolean _exists = file.exists();
      if (_exists) {
        file.delete();
      }
      FileOutputStream _fileOutputStream = new FileOutputStream(file);
      fos = _fileOutputStream;
      JAXBContext context = JAXBContext.newInstance(Domain.class);
      final Marshaller m = context.createMarshaller();
      m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      m.marshal(domain, fos);
    } catch (final Throwable _t) {
      if (_t instanceof JAXBException) {
        final JAXBException e = (JAXBException)_t;
        e.printStackTrace();
      } else if (_t instanceof FileNotFoundException) {
        final FileNotFoundException e_1 = (FileNotFoundException)_t;
        e_1.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public String getHypervisorUri(final String driver) {
    return null;
  }
  
  public static void main(final String[] args) {
    final ExecutableMachine compute = new ExecutableMachine();
    compute.setHostname("libvirt-machine-1");
    final DomainMarshaller domain = new DomainMarshaller();
    final Domain vmdomain = domain.createComputeDescription(compute);
    domain.writeToDisk(vmdomain);
    String _uuid = vmdomain.getUuid();
    String _asString = domain.asString(_uuid);
    InputOutput.<String>println(_asString);
  }
}
