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
package org.occiware.clouddesigner.occi.docker.connector;

import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.ContainerConfig;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.Link;
import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.JsonNode;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2;
import org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean;
import org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine;
import org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V;
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;
import org.occiware.clouddesigner.occi.docker.Machine_Rackspace;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.Provider;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class ModelHandler {
  private static Logger LOGGER = LoggerFactory.getLogger(ModelHandler.class);
  
  /**
   * Dynamic EMF
   */
  public void loadModelWithoutGenerateCode() {
    final Resource resource = this.loadModel();
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final EPackage ePackage = ((EPackage) _get);
    final EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
    for (final EClassifier eClassifier : eClassifiers) {
      {
        String _name = eClassifier.getName();
        ModelHandler.LOGGER.info(_name);
        ModelHandler.LOGGER.info(" ");
        if ((eClassifier instanceof EClass)) {
          final EClass eClass = ((EClass) eClassifier);
          final EList<EAttribute> eAttributes = eClass.getEAttributes();
          for (final EAttribute eAttribute : eAttributes) {
            String _name_1 = eAttribute.getName();
            String _plus = (_name_1 + "(");
            EDataType _eAttributeType = eAttribute.getEAttributeType();
            String _name_2 = _eAttributeType.getName();
            String _plus_1 = (_plus + _name_2);
            String _plus_2 = (_plus_1 + ") ");
            ModelHandler.LOGGER.info(_plus_2);
          }
          if (((!eClass.getEAttributes().isEmpty()) && (!eClass.getEReferences().isEmpty()))) {
            ModelHandler.LOGGER.info(" References: ");
          }
          final EList<EReference> eReferences = eClass.getEReferences();
          for (final EReference eReference : eReferences) {
            String _name_3 = eReference.getName();
            String _plus_3 = (_name_3 + "(");
            EClass _eReferenceType = eReference.getEReferenceType();
            String _name_4 = _eReferenceType.getName();
            String _plus_4 = (_plus_3 + _name_4);
            String _plus_5 = (_plus_4 + "[");
            int _lowerBound = eReference.getLowerBound();
            String _plus_6 = (_plus_5 + Integer.valueOf(_lowerBound));
            String _plus_7 = (_plus_6 + 
              "..");
            int _upperBound = eReference.getUpperBound();
            String _plus_8 = (_plus_7 + Integer.valueOf(_upperBound));
            String _plus_9 = (_plus_8 + "])");
            ModelHandler.LOGGER.info(_plus_9);
          }
          EList<EOperation> _eOperations = eClass.getEOperations();
          boolean _isEmpty = _eOperations.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            ModelHandler.LOGGER.info(" Operations: ");
            EList<EOperation> _eOperations_1 = eClass.getEOperations();
            for (final EOperation eOperation : _eOperations_1) {
              EClassifier _eType = eOperation.getEType();
              String _plus_10 = (_eType + " ");
              String _name_5 = eOperation.getName();
              String _plus_11 = (_plus_10 + _name_5);
              ModelHandler.LOGGER.info(_plus_11);
            }
          }
        }
      }
    }
  }
  
  public void createAndSaveDockerMachineWithMetaModel() {
    try {
      Resource resource = this.loadModel();
      resource.load(null);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      final EPackage ePackage = ((EPackage) _get);
      EClassifier _eClassifier = ePackage.getEClassifier("Machine");
      final EClass dockerMachine = ((EClass) _eClassifier);
      EStructuralFeature _eStructuralFeature = dockerMachine.getEStructuralFeature("contains");
      final EReference eContains = ((EReference) _eStructuralFeature);
      EStructuralFeature _eStructuralFeature_1 = dockerMachine.getEStructuralFeature("name");
      final EAttribute eName = ((EAttribute) _eStructuralFeature_1);
      EFactory _eFactoryInstance = ePackage.getEFactoryInstance();
      final EObject dockerMachineInstance = _eFactoryInstance.create(dockerMachine);
      dockerMachineInstance.eSet(eName, "test-xx");
      EClassifier _eClassifier_1 = ePackage.getEClassifier("Machine_VirtualBox");
      final EClass evbox = ((EClass) _eClassifier_1);
      EStructuralFeature _eStructuralFeature_2 = evbox.getEStructuralFeature("boot2docker_url");
      final EAttribute eboot2docker_url = ((EAttribute) _eStructuralFeature_2);
      EStructuralFeature _eStructuralFeature_3 = evbox.getEStructuralFeature("disk_size");
      final EAttribute edisk_size = ((EAttribute) _eStructuralFeature_3);
      EFactory _eFactoryInstance_1 = ePackage.getEFactoryInstance();
      final EObject vboxInstance = _eFactoryInstance_1.create(evbox);
      vboxInstance.eSet(eboot2docker_url, "link");
      final ResourceSet resourceSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      File temp = File.createTempFile("tempfile", "dockerinstancesonlymodel.xmi");
      String _absolutePath = temp.getAbsolutePath();
      final URI uri = URI.createURI(_absolutePath);
      String _string = uri.toString();
      ModelHandler.LOGGER.info(_string);
      final Resource r = resourceSet.createResource(uri);
      boolean _equals = Objects.equal(r, null);
      if (_equals) {
        throw new NullPointerException("The resource is null.");
      }
      ModelHandler.LOGGER.info(("Resource: " + r));
      EList<EObject> _contents_1 = r.getContents();
      _contents_1.add(vboxInstance);
      r.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Resource loadModel() {
    final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    final Map<String, Object> m = reg.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    m.put("ecore", _xMIResourceFactoryImpl);
    final ResourceSet resourceSet = new ResourceSetImpl();
    final URI fileURI = URI.createFileURI("model/Docker.ecore");
    final Resource resource = resourceSet.getResource(fileURI, true);
    return resource;
  }
  
  public Map<String, Machine> getmodelEClass() {
    final Map<String, Machine> m = new HashMap<String, Machine>();
    String _string = Provider.virtualbox.toString();
    Machine_VirtualBox _createMachine_VirtualBox = DockerFactory.eINSTANCE.createMachine_VirtualBox();
    m.put(_string, _createMachine_VirtualBox);
    String _string_1 = Provider.amazonec2.toString();
    Machine_Amazon_EC2 _createMachine_Amazon_EC2 = DockerFactory.eINSTANCE.createMachine_Amazon_EC2();
    m.put(_string_1, _createMachine_Amazon_EC2);
    String _string_2 = Provider.digitalocean.toString();
    Machine_Digital_Ocean _createMachine_Digital_Ocean = DockerFactory.eINSTANCE.createMachine_Digital_Ocean();
    m.put(_string_2, _createMachine_Digital_Ocean);
    String _string_3 = Provider.google.toString();
    Machine_Google_Compute_Engine _createMachine_Google_Compute_Engine = DockerFactory.eINSTANCE.createMachine_Google_Compute_Engine();
    m.put(_string_3, _createMachine_Google_Compute_Engine);
    String _string_4 = Provider.ibm.toString();
    Machine_IBM_SoftLayer _createMachine_IBM_SoftLayer = DockerFactory.eINSTANCE.createMachine_IBM_SoftLayer();
    m.put(_string_4, _createMachine_IBM_SoftLayer);
    String _string_5 = Provider.azure.toString();
    Machine_Microsoft_Azure _createMachine_Microsoft_Azure = DockerFactory.eINSTANCE.createMachine_Microsoft_Azure();
    m.put(_string_5, _createMachine_Microsoft_Azure);
    String _string_6 = Provider.microsofthyperv.toString();
    Machine_Microsoft_Hyper_V _createMachine_Microsoft_Hyper_V = DockerFactory.eINSTANCE.createMachine_Microsoft_Hyper_V();
    m.put(_string_6, _createMachine_Microsoft_Hyper_V);
    String _string_7 = Provider.openstack.toString();
    Machine_OpenStack _createMachine_OpenStack = DockerFactory.eINSTANCE.createMachine_OpenStack();
    m.put(_string_7, _createMachine_OpenStack);
    String _string_8 = Provider.rackspace.toString();
    Machine_Rackspace _createMachine_Rackspace = DockerFactory.eINSTANCE.createMachine_Rackspace();
    m.put(_string_8, _createMachine_Rackspace);
    String _string_9 = Provider.vmwarefusion.toString();
    Machine_VMware_Fusion _createMachine_VMware_Fusion = DockerFactory.eINSTANCE.createMachine_VMware_Fusion();
    m.put(_string_9, _createMachine_VMware_Fusion);
    String _string_10 = Provider.vmwarevcloudair.toString();
    Machine_VMware_vCloud_Air _createMachine_VMware_vCloud_Air = DockerFactory.eINSTANCE.createMachine_VMware_vCloud_Air();
    m.put(_string_10, _createMachine_VMware_vCloud_Air);
    String _string_11 = Provider.vmwarevsphere.toString();
    Machine_VMware_vSphere _createMachine_VMware_vSphere = DockerFactory.eINSTANCE.createMachine_VMware_vSphere();
    m.put(_string_11, _createMachine_VMware_vSphere);
    return m;
  }
  
  public void saveFromStream(final OutputStream output, final Machine machine) {
    try {
      final ResourceSetImpl rs = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = rs.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      EPackage.Registry _packageRegistry = rs.getPackageRegistry();
      _packageRegistry.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE);
      final URI uri = URI.createURI((DockerPackage.eNS_URI + "RAM"));
      final Resource resource = rs.createResource(uri);
      final XMIResource res = ((XMIResource) resource);
      Map<Object, Object> _defaultLoadOptions = res.getDefaultLoadOptions();
      _defaultLoadOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      Map<Object, Object> _defaultSaveOptions = res.getDefaultSaveOptions();
      _defaultSaveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      EList<EObject> _contents = res.getContents();
      _contents.add(machine);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      res.save(output, _hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Machine loadFromStream(final InputStream input) {
    try {
      final ResourceSetImpl rs = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = rs.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      EPackage.Registry _packageRegistry = rs.getPackageRegistry();
      _packageRegistry.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE);
      URI _createURI = URI.createURI(DockerPackage.eNS_URI);
      final Resource resource = rs.createResource(_createURI);
      final XMIResource res = ((XMIResource) resource);
      Map<Object, Object> _defaultLoadOptions = res.getDefaultLoadOptions();
      _defaultLoadOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      Map<Object, Object> _defaultSaveOptions = res.getDefaultSaveOptions();
      _defaultSaveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      res.load(input, _hashMap);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      return ((Machine) _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Machine loadFromFile(final String xmiPath) {
    Class<? extends ModelHandler> _class = this.getClass();
    ClassLoader _classLoader = _class.getClassLoader();
    final InputStream in = _classLoader.getResourceAsStream(xmiPath);
    boolean _equals = Objects.equal(in, null);
    if (_equals) {
      throw new IllegalArgumentException(("Unable to locate resource " + xmiPath));
    }
    final ResourceSetImpl rs = new ResourceSetImpl();
    Resource.Factory.Registry _resourceFactoryRegistry = rs.getResourceFactoryRegistry();
    Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    EPackage.Registry _packageRegistry = rs.getPackageRegistry();
    _packageRegistry.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE);
    final File inputFile = new File(xmiPath);
    String _absolutePath = inputFile.getAbsolutePath();
    final URI uri = URI.createURI(_absolutePath);
    final Resource resource = rs.getResource(uri, true);
    final XMIResource res = ((XMIResource) resource);
    Map<Object, Object> _defaultLoadOptions = res.getDefaultLoadOptions();
    _defaultLoadOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
    Map<Object, Object> _defaultSaveOptions = res.getDefaultSaveOptions();
    _defaultSaveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
    boolean _equals_1 = Objects.equal(resource, null);
    if (_equals_1) {
      throw new NullPointerException("The resource is null.");
    }
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final Machine m = ((Machine) _get);
    String _string = m.toString();
    ModelHandler.LOGGER.info(_string);
    return m;
  }
  
  public void saveFromFile(final Machine machine) {
    try {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      Class<? extends ModelHandler> _class = this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      URL _resource = _classLoader.getResource(".");
      final String basePath = _resource.getPath();
      String _name = machine.getName();
      String _plus = (basePath + _name);
      String _plus_1 = (_plus + ".xmi");
      File temp = new File(_plus_1);
      String _absolutePath = temp.getAbsolutePath();
      ModelHandler.LOGGER.info(_absolutePath);
      String _absolutePath_1 = temp.getAbsolutePath();
      final URI uri = URI.createURI(_absolutePath_1);
      Resource resource = resourceSet.createResource(uri);
      final XMIResource res = ((XMIResource) resource);
      Map<Object, Object> _defaultLoadOptions = res.getDefaultLoadOptions();
      _defaultLoadOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      Map<Object, Object> _defaultSaveOptions = res.getDefaultSaveOptions();
      _defaultSaveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      boolean _equals = Objects.equal(resource, null);
      if (_equals) {
        throw new NullPointerException("The resource is null.");
      }
      EList<EObject> _contents = resource.getContents();
      _contents.add(machine);
      resource.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean deleteAllOldModels() {
    boolean _xblockexpression = false;
    {
      final File myFile = new File("Models");
      boolean _xifexpression = false;
      boolean _isDirectory = myFile.isDirectory();
      if (_isDirectory) {
        _xifexpression = myFile.delete();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static Resource load(final URI uri, final ResourceSet resourceSet, final String data) throws IOException {
    Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
    Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
    ClassLoader _classLoader = ModelHandler.class.getClassLoader();
    InputStream in = _classLoader.getResourceAsStream(data);
    boolean _equals = Objects.equal(in, null);
    if (_equals) {
      FileInputStream _fileInputStream = new FileInputStream(data);
      in = _fileInputStream;
      boolean _equals_1 = Objects.equal(in, null);
      if (_equals_1) {
        throw new IllegalArgumentException(("Unable to locate resource " + data));
      }
    }
    final Reader reader = new InputStreamReader(in);
    final URIConverter.ReadableInputStream input = new URIConverter.ReadableInputStream(reader, "UTF-8");
    final Resource resource = resourceSet.createResource(uri);
    resource.load(input, null);
    return resource;
  }
  
  public String loadResource(final String xmi) {
    try {
      Class<? extends ModelHandler> _class = this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      InputStream in = _classLoader.getResourceAsStream(xmi);
      boolean _equals = Objects.equal(in, null);
      if (_equals) {
        FileInputStream _fileInputStream = new FileInputStream(xmi);
        in = _fileInputStream;
        boolean _equals_1 = Objects.equal(in, null);
        if (_equals_1) {
          throw new IllegalArgumentException(("Unable to locate resource " + xmi));
        }
      }
      String result = null;
      try {
        InputStreamReader _inputStreamReader = new InputStreamReader(in);
        BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
        String _readContentAsString = this.readContentAsString(_bufferedReader);
        result = _readContentAsString;
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException ex = (IOException)_t;
          throw new IllegalArgumentException(("Unable to read resource " + xmi), ex);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Machine load(final String path) {
    final ResourceSetImpl rs = new ResourceSetImpl();
    Resource.Factory.Registry _resourceFactoryRegistry = rs.getResourceFactoryRegistry();
    Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    EPackage.Registry _packageRegistry = rs.getPackageRegistry();
    _packageRegistry.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE);
    final File inputFile = new File(path);
    String _absolutePath = inputFile.getAbsolutePath();
    final URI uri = URI.createURI(_absolutePath);
    final Resource resource = rs.getResource(uri, true);
    final XMIResource res = ((XMIResource) resource);
    Map<Object, Object> _defaultLoadOptions = res.getDefaultLoadOptions();
    _defaultLoadOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
    Map<Object, Object> _defaultSaveOptions = res.getDefaultSaveOptions();
    _defaultSaveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
    boolean _equals = Objects.equal(resource, null);
    if (_equals) {
      throw new NullPointerException("The resource is null.");
    }
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final Machine m = ((Machine) _get);
    String _string = m.toString();
    ModelHandler.LOGGER.info(_string);
    return m;
  }
  
  public String readContentAsString(final Reader reader) throws IOException {
    StringBuffer result = new StringBuffer(1000);
    char[] buf = new char[1024];
    int numRead = 0;
    while (((numRead = reader.read(buf)) != (-1))) {
      result.append(buf, 0, numRead);
    }
    reader.close();
    return result.toString();
  }
  
  public static EList<EObject> toEObject(final String xmi, final boolean unsetID) {
    try {
      Map<Object, Object> options = new HashMap<Object, Object>();
      options.put(XMLResource.OPTION_ENCODING, "UTF-8");
      options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
      options.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
      ResourceSet resourceSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      EPackage.Registry _packageRegistry = resourceSet.getPackageRegistry();
      _packageRegistry.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE);
      StringReader _stringReader = new StringReader(xmi);
      URIConverter.ReadableInputStream input = new URIConverter.ReadableInputStream(_stringReader, 
        "UTF-8");
      URI _createURI = URI.createURI("");
      Resource resource = resourceSet.createResource(_createURI);
      resource.load(input, options);
      if (((!resource.getErrors().isEmpty()) || (!resource.getWarnings().isEmpty()))) {
        EList<Resource.Diagnostic> _errors = resource.getErrors();
        String _plus = ("Unable to load the EObject. Errors:" + _errors);
        String _plus_1 = (_plus + "Warnings:");
        EList<Resource.Diagnostic> _warnings = resource.getWarnings();
        String _plus_2 = (_plus_1 + _warnings);
        throw new IllegalArgumentException(_plus_2);
      }
      EList<EObject> result = resource.getContents();
      if (((!Objects.equal(result, null)) && unsetID)) {
        Map<EObject, Boolean> preventCycles = new IdentityHashMap<EObject, Boolean>();
        ArrayList<EObject> rootList = new ArrayList<EObject>();
        for (final EObject eObj : result) {
          ModelHandler.readReferences(eObj, preventCycles, rootList);
        }
        for (final EObject eobj : rootList) {
          {
            EClass _eClass = eobj.eClass();
            EAttribute _eIDAttribute = _eClass.getEIDAttribute();
            boolean _notEquals = (!Objects.equal(_eIDAttribute, null));
            if (_notEquals) {
              EClass _eClass_1 = eobj.eClass();
              EAttribute _eIDAttribute_1 = _eClass_1.getEIDAttribute();
              eobj.eSet(_eIDAttribute_1, null);
            }
            Iterator<EObject> iterator = eobj.eAllContents();
            while (iterator.hasNext()) {
              {
                EObject dependentEObject = iterator.next();
                EClass _eClass_2 = dependentEObject.eClass();
                EAttribute _eIDAttribute_2 = _eClass_2.getEIDAttribute();
                boolean _notEquals_1 = (!Objects.equal(_eIDAttribute_2, null));
                if (_notEquals_1) {
                  EClass _eClass_3 = dependentEObject.eClass();
                  EAttribute _eIDAttribute_3 = _eClass_3.getEIDAttribute();
                  dependentEObject.eSet(_eIDAttribute_3, null);
                }
              }
            }
          }
        }
      }
      return result;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        throw new IllegalArgumentException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static String toXMI(final EObject object) {
    try {
      Map<Object, Object> options = new HashMap<Object, Object>();
      options.put(XMLResource.OPTION_ENCODING, "UTF-8");
      options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
      options.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
      final StringWriter sw = new StringWriter();
      final URIConverter.WriteableOutputStream uws = new URIConverter.WriteableOutputStream(sw, "UTF-8");
      final ResourceSet resourceSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      EPackage.Registry _packageRegistry = resourceSet.getPackageRegistry();
      _packageRegistry.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE);
      URI _createURI = URI.createURI("");
      Resource resource = resourceSet.createResource(_createURI);
      Map<EObject, Boolean> preventCycles = new IdentityHashMap<EObject, Boolean>();
      ArrayList<EObject> rootList = new ArrayList<EObject>();
      ModelHandler.readReferences(object, preventCycles, rootList);
      for (final EObject obj : rootList) {
        EList<EObject> _contents = resource.getContents();
        _contents.add(obj);
      }
      resource.save(uws, options);
      return sw.toString();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        throw new IllegalArgumentException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static void readReferences(final EObject eobject, final Map<EObject, Boolean> preventCycles, final List<EObject> rootList) {
    boolean _containsKey = preventCycles.containsKey(eobject);
    if (_containsKey) {
      return;
    }
    preventCycles.put(eobject, null);
    EObject _eContainer = eobject.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    if (_notEquals) {
      EObject _eContainer_1 = eobject.eContainer();
      ModelHandler.readReferences(_eContainer_1, preventCycles, rootList);
    } else {
      rootList.add(eobject);
    }
    EClass _eClass = eobject.eClass();
    EList<EReference> _eAllReferences = _eClass.getEAllReferences();
    for (final Object erefObj : _eAllReferences) {
      {
        EReference eref = ((EReference) erefObj);
        final Object value = eobject.eGet(eref);
        boolean _equals = Objects.equal(value, null);
        if (_equals) {
        }
        if ((value instanceof List)) {
          for (final Object obj : ((List<?>) value)) {
            ModelHandler.readReferences(((EObject) obj), preventCycles, rootList);
          }
        } else {
          ModelHandler.readReferences(((EObject) value), preventCycles, rootList);
        }
      }
    }
  }
  
  public Machine getModel(final String machine, final String state, final boolean machineExists) {
    final DockerContainerManager instance = new DockerContainerManager();
    Runtime _runtime = Runtime.getRuntime();
    String _inspectHostCmd = DockerMachineManager.inspectHostCmd(_runtime, machine);
    final JsonNode node = DockerUtil.jsonify(_inspectHostCmd);
    boolean _notEquals = (!Objects.equal(node, null));
    if (_notEquals) {
      Map<String, Machine> _modelEClass = this.getmodelEClass();
      JsonNode _get = node.get("DriverName");
      String _string = _get.toString();
      String _replaceAll = _string.replaceAll("\"", "");
      Machine vbox = _modelEClass.get(_replaceAll);
      if ((vbox instanceof Machine_VirtualBox)) {
        Machine_VirtualBox newvbox = ((Machine_VirtualBox) vbox);
        this.machineFactory_VBOX(newvbox, node, state);
        ModelHandler.LOGGER.info(("Model setting: " + newvbox));
      } else {
        if ((vbox instanceof Machine_Amazon_EC2)) {
          Machine_Amazon_EC2 newvbox_1 = ((Machine_Amazon_EC2) vbox);
          this.machineFactory(newvbox_1, node, state);
          ModelHandler.LOGGER.info(("Model setting: " + newvbox_1));
        } else {
          if ((vbox instanceof Machine_Digital_Ocean)) {
            Machine_Digital_Ocean newvbox_2 = ((Machine_Digital_Ocean) vbox);
            this.machineFactory(newvbox_2, node, state);
            ModelHandler.LOGGER.info(("Model setting: " + newvbox_2));
          } else {
            if ((vbox instanceof Machine_VMware_Fusion)) {
              Machine_VMware_Fusion newvbox_3 = ((Machine_VMware_Fusion) vbox);
              this.machineFactory_Fusion(newvbox_3, node, state);
              ModelHandler.LOGGER.info(("Model setting: " + newvbox_3));
            } else {
              if ((vbox instanceof Machine_Google_Compute_Engine)) {
                Machine_Google_Compute_Engine newvbox_4 = ((Machine_Google_Compute_Engine) vbox);
                this.machineFactory(newvbox_4, node, state);
                ModelHandler.LOGGER.info(("Model setting: " + newvbox_4));
              } else {
                if ((vbox instanceof Machine_IBM_SoftLayer)) {
                  Machine_IBM_SoftLayer newvbox_5 = ((Machine_IBM_SoftLayer) vbox);
                  this.machineFactory(newvbox_5, node, state);
                  ModelHandler.LOGGER.info(("Model setting: " + newvbox_5));
                } else {
                  if ((vbox instanceof Machine_Microsoft_Azure)) {
                    Machine_Microsoft_Azure newvbox_6 = ((Machine_Microsoft_Azure) vbox);
                    this.machineFactory(newvbox_6, node, state);
                    ModelHandler.LOGGER.info(("Model setting: " + newvbox_6));
                  } else {
                    if ((vbox instanceof Machine_Microsoft_Hyper_V)) {
                      Machine_Microsoft_Hyper_V newvbox_7 = ((Machine_Microsoft_Hyper_V) vbox);
                      this.machineFactory(newvbox_7, node, state);
                      ModelHandler.LOGGER.info(("Model setting: " + newvbox_7));
                    } else {
                      if ((vbox instanceof Machine_OpenStack)) {
                        Machine_OpenStack newvbox_8 = ((Machine_OpenStack) vbox);
                        this.machineFactory_OpenStack(newvbox_8, node, state);
                        ModelHandler.LOGGER.info(("Model setting: " + newvbox_8));
                      } else {
                        if ((vbox instanceof Machine_Rackspace)) {
                          Machine_Rackspace newvbox_9 = ((Machine_Rackspace) vbox);
                          this.machineFactory(newvbox_9, node, state);
                          ModelHandler.LOGGER.info(("Model setting: " + newvbox_9));
                        } else {
                          if ((vbox instanceof Machine_VMware_vSphere)) {
                            Machine_VMware_vSphere newvbox_10 = ((Machine_VMware_vSphere) vbox);
                            this.machineFactory(newvbox_10, node, state);
                            ModelHandler.LOGGER.info(("Model setting: " + newvbox_10));
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      if ((!machineExists)) {
        ComputeStatus _state = vbox.getState();
        String _string_1 = _state.toString();
        boolean _equalsIgnoreCase = _string_1.equalsIgnoreCase("active");
        if (_equalsIgnoreCase) {
          String _name = vbox.getName();
          final List<Container> containers = instance.listContainer(_name);
          boolean _notEquals_1 = (!Objects.equal(containers, null));
          if (_notEquals_1) {
            List<org.occiware.clouddesigner.occi.docker.Container> modelContainers = this.buildContainer(vbox, containers);
            for (final org.occiware.clouddesigner.occi.docker.Container container : modelContainers) {
              {
                HashSet<String> existingLinks = new HashSet<String>();
                this.linkContainerToMachine(container, vbox);
                String _id = container.getId();
                final InspectContainerResponse inspectContainer = instance.inspectContainer(vbox, _id);
                HostConfig _hostConfig = inspectContainer.getHostConfig();
                Link[] _links = _hostConfig.getLinks();
                boolean _isEmpty = ((List<Link>)Conversions.doWrapArray(_links)).isEmpty();
                boolean _not = (!_isEmpty);
                if (_not) {
                  HostConfig _hostConfig_1 = inspectContainer.getHostConfig();
                  Link[] _links_1 = _hostConfig_1.getLinks();
                  for (final Link link : _links_1) {
                    String _name_1 = link.getName();
                    boolean _contains = existingLinks.contains(_name_1);
                    boolean _not_1 = (!_contains);
                    if (_not_1) {
                      String _name_2 = link.getName();
                      org.occiware.clouddesigner.occi.docker.Container _containerByName = this.getContainerByName(modelContainers, _name_2);
                      this.linkContainerToContainer(container, _containerByName);
                      String _name_3 = link.getName();
                      existingLinks.add(_name_3);
                    }
                  }
                }
              }
            }
          }
        }
      }
      return vbox;
    }
    return null;
  }
  
  public org.occiware.clouddesigner.occi.docker.Container getContainerByName(final List<org.occiware.clouddesigner.occi.docker.Container> containers, final String containerName) {
    for (final org.occiware.clouddesigner.occi.docker.Container c : containers) {
      String _name = c.getName();
      boolean _equals = Objects.equal(_name, containerName);
      if (_equals) {
        return c;
      }
    }
    return null;
  }
  
  public void machineFactory(final Machine vbox, final JsonNode node, final String state) {
    JsonNode _get = node.get("Driver");
    JsonNode _get_1 = _get.get("MachineName");
    String _string = _get_1.toString();
    String _replaceAll = _string.replaceAll("\"", "");
    vbox.setName(_replaceAll);
    JsonNode _get_2 = node.get("Driver");
    JsonNode _get_3 = _get_2.get("Memory");
    String _string_1 = _get_3.toString();
    float _parseFloat = Float.parseFloat(_string_1);
    vbox.setMemory(_parseFloat);
    JsonNode _get_4 = node.get("Driver");
    JsonNode _get_5 = _get_4.get("CPU");
    String _string_2 = _get_5.toString();
    int _parseInt = Integer.parseInt(_string_2);
    vbox.setCores(_parseInt);
    boolean _equals = Objects.equal(state, "Running");
    if (_equals) {
      ComputeStatus _get_6 = ComputeStatus.get(0);
      vbox.setState(_get_6);
    }
    boolean _equals_1 = Objects.equal(state, "Stopped");
    if (_equals_1) {
      ComputeStatus _get_7 = ComputeStatus.get(1);
      vbox.setState(_get_7);
    }
  }
  
  public void machineFactory_VBOX(final Machine_VirtualBox vbox, final JsonNode node, final String state) {
    JsonNode _get = node.get("Driver");
    JsonNode _get_1 = _get.get("MachineName");
    String _string = _get_1.toString();
    String _replaceAll = _string.replaceAll("\"", "");
    vbox.setName(_replaceAll);
    JsonNode _get_2 = node.get("Driver");
    JsonNode _get_3 = _get_2.get("Memory");
    String _string_1 = _get_3.toString();
    float _parseFloat = Float.parseFloat(_string_1);
    vbox.setMemory(_parseFloat);
    JsonNode _get_4 = node.get("Driver");
    JsonNode _get_5 = _get_4.get("DiskSize");
    String _string_2 = _get_5.toString();
    int _parseInt = Integer.parseInt(_string_2);
    vbox.setDisk_size(_parseInt);
    JsonNode _get_6 = node.get("Driver");
    JsonNode _get_7 = _get_6.get("CPU");
    String _string_3 = _get_7.toString();
    int _parseInt_1 = Integer.parseInt(_string_3);
    vbox.setCores(_parseInt_1);
    JsonNode _get_8 = node.get("Driver");
    JsonNode _get_9 = _get_8.get("Boot2DockerURL");
    String _string_4 = _get_9.toString();
    String _replaceAll_1 = _string_4.replaceAll("\"", "");
    vbox.setBoot2docker_url(_replaceAll_1);
    boolean _equals = Objects.equal(state, "Running");
    if (_equals) {
      ComputeStatus _get_10 = ComputeStatus.get(0);
      vbox.setState(_get_10);
    }
    boolean _equals_1 = Objects.equal(state, "Stopped");
    if (_equals_1) {
      ComputeStatus _get_11 = ComputeStatus.get(1);
      vbox.setState(_get_11);
    }
  }
  
  public void machineFactory_Fusion(final Machine_VMware_Fusion vbox, final JsonNode node, final String state) {
    JsonNode _get = node.get("Driver");
    JsonNode _get_1 = _get.get("MachineName");
    String _string = _get_1.toString();
    String _replaceAll = _string.replaceAll("\"", "");
    vbox.setName(_replaceAll);
    JsonNode _get_2 = node.get("Driver");
    JsonNode _get_3 = _get_2.get("Memory");
    String _string_1 = _get_3.toString();
    float _parseFloat = Float.parseFloat(_string_1);
    vbox.setMemory(_parseFloat);
    JsonNode _get_4 = node.get("Driver");
    JsonNode _get_5 = _get_4.get("DiskSize");
    String _string_2 = _get_5.toString();
    int _parseInt = Integer.parseInt(_string_2);
    vbox.setDisk_size(_parseInt);
    try {
      JsonNode _get_6 = node.get("Driver");
      JsonNode _get_7 = _get_6.get("CPU");
      String _string_3 = _get_7.toString();
      int _parseInt_1 = Integer.parseInt(_string_3);
      vbox.setCores(_parseInt_1);
    } catch (final Throwable _t) {
      if (_t instanceof NullPointerException) {
        final NullPointerException e = (NullPointerException)_t;
        JsonNode _get_8 = node.get("Driver");
        JsonNode _get_9 = _get_8.get("CPUs");
        String _string_4 = _get_9.toString();
        int _parseInt_2 = Integer.parseInt(_string_4);
        vbox.setCores(_parseInt_2);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    JsonNode _get_10 = node.get("Driver");
    JsonNode _get_11 = _get_10.get("Boot2DockerURL");
    String _string_5 = _get_11.toString();
    String _replaceAll_1 = _string_5.replaceAll("\"", "");
    vbox.setBoot2docker_url(_replaceAll_1);
    boolean _equals = Objects.equal(state, "Running");
    if (_equals) {
      ComputeStatus _get_12 = ComputeStatus.get(0);
      vbox.setState(_get_12);
    }
    boolean _equals_1 = Objects.equal(state, "Stopped");
    if (_equals_1) {
      ComputeStatus _get_13 = ComputeStatus.get(1);
      vbox.setState(_get_13);
    }
  }
  
  public void machineFactory_OpenStack(final Machine_OpenStack vbox, final JsonNode node, final String state) {
    JsonNode _get = node.get("Driver");
    JsonNode _get_1 = _get.get("MachineName");
    String _string = _get_1.toString();
    String _replaceAll = _string.replaceAll("\"", "");
    vbox.setName(_replaceAll);
    JsonNode _get_2 = node.get("Driver");
    JsonNode _get_3 = _get_2.get("AuthUrl");
    String _string_1 = _get_3.toString();
    String _replaceAll_1 = _string_1.replaceAll("\"", "");
    vbox.setAuth_url(_replaceAll_1);
    JsonNode _get_4 = node.get("Driver");
    JsonNode _get_5 = _get_4.get("Username");
    String _string_2 = _get_5.toString();
    String _replaceAll_2 = _string_2.replaceAll("\"", "");
    vbox.setUsername(_replaceAll_2);
    JsonNode _get_6 = node.get("Driver");
    JsonNode _get_7 = _get_6.get("Password");
    String _string_3 = _get_7.toString();
    String _replaceAll_3 = _string_3.replaceAll("\"", "");
    vbox.setPassword(_replaceAll_3);
    JsonNode _get_8 = node.get("Driver");
    JsonNode _get_9 = _get_8.get("TenantName");
    String _string_4 = _get_9.toString();
    String _replaceAll_4 = _string_4.replaceAll("\"", "");
    vbox.setTenant_name(_replaceAll_4);
    JsonNode _get_10 = node.get("Driver");
    JsonNode _get_11 = _get_10.get("TenantId");
    String _string_5 = _get_11.toString();
    String _replaceAll_5 = _string_5.replaceAll("\"", "");
    vbox.setTenant_id(_replaceAll_5);
    JsonNode _get_12 = node.get("Driver");
    JsonNode _get_13 = _get_12.get("Region");
    String _string_6 = _get_13.toString();
    String _replaceAll_6 = _string_6.replaceAll("\"", "");
    vbox.setRegion(_replaceAll_6);
    JsonNode _get_14 = node.get("Driver");
    JsonNode _get_15 = _get_14.get("EndpointType");
    String _string_7 = _get_15.toString();
    String _replaceAll_7 = _string_7.replaceAll("\"", "");
    vbox.setEndpoint_type(_replaceAll_7);
    JsonNode _get_16 = node.get("Driver");
    JsonNode _get_17 = _get_16.get("FlavorId");
    String _string_8 = _get_17.toString();
    String _replaceAll_8 = _string_8.replaceAll("\"", "");
    vbox.setFlavor_id(_replaceAll_8);
    JsonNode _get_18 = node.get("Driver");
    JsonNode _get_19 = _get_18.get("FloatingIpPool");
    String _string_9 = _get_19.toString();
    String _replaceAll_9 = _string_9.replaceAll("\"", "");
    vbox.setFloatingip_pool(_replaceAll_9);
    JsonNode _get_20 = node.get("Driver");
    JsonNode _get_21 = _get_20.get("ImageId");
    String _string_10 = _get_21.toString();
    String _replaceAll_10 = _string_10.replaceAll("\"", "");
    vbox.setImage_id(_replaceAll_10);
    JsonNode _get_22 = node.get("Driver");
    JsonNode _get_23 = _get_22.get("NetworkId");
    String _string_11 = _get_23.toString();
    String _replaceAll_11 = _string_11.replaceAll("\"", "");
    vbox.setNet_id(_replaceAll_11);
    JsonNode _get_24 = node.get("Driver");
    JsonNode _get_25 = _get_24.get("SecurityGroups");
    String _string_12 = _get_25.toString();
    String _replaceAll_12 = _string_12.replaceAll("\\[\"", "");
    String _replaceAll_13 = _replaceAll_12.replaceAll("\"\\]", 
      "");
    String _replaceAll_14 = _replaceAll_13.replaceAll("\"", "");
    vbox.setSec_groups(_replaceAll_14);
    boolean _equals = Objects.equal(state, "Running");
    if (_equals) {
      ComputeStatus _get_26 = ComputeStatus.get(0);
      vbox.setState(_get_26);
    }
    boolean _equals_1 = Objects.equal(state, "Stopped");
    if (_equals_1) {
      ComputeStatus _get_27 = ComputeStatus.get(1);
      vbox.setState(_get_27);
    }
  }
  
  public org.occiware.clouddesigner.occi.docker.Container getModel(final Container container) {
    DockerFactory.eINSTANCE.eClass();
    org.occiware.clouddesigner.occi.docker.Container modelContainer = DockerFactory.eINSTANCE.createContainer();
    String _id = container.getId();
    modelContainer.setId(_id);
    String[] _names = container.getNames();
    String _get = _names[0];
    modelContainer.setName(_get);
    String _image = container.getImage();
    modelContainer.setImage(_image);
    String _command = container.getCommand();
    modelContainer.setCommand(_command);
    String _id_1 = container.getId();
    modelContainer.setContainerid(_id_1);
    return modelContainer;
  }
  
  public org.occiware.clouddesigner.occi.docker.Container buildContainer(final Container container) {
    org.occiware.clouddesigner.occi.docker.Container modelContainer = DockerFactory.eINSTANCE.createContainer();
    String _id = container.getId();
    modelContainer.setId(_id);
    String[] _names = container.getNames();
    String _get = _names[0];
    boolean _notEquals = (!Objects.equal(_get, null));
    if (_notEquals) {
      String[] _names_1 = container.getNames();
      String _get_1 = _names_1[0];
      String _replace = _get_1.replace("/", "");
      modelContainer.setName(_replace);
    }
    String _image = container.getImage();
    modelContainer.setImage(_image);
    String _command = container.getCommand();
    modelContainer.setCommand(_command);
    String _id_1 = container.getId();
    modelContainer.setContainerid(_id_1);
    return modelContainer;
  }
  
  public List<org.occiware.clouddesigner.occi.docker.Container> buildContainer(final List<Container> containers) {
    List<org.occiware.clouddesigner.occi.docker.Container> containerList = CollectionLiterals.<org.occiware.clouddesigner.occi.docker.Container>newArrayList();
    for (final Container c : containers) {
      {
        org.occiware.clouddesigner.occi.docker.Container modelContainer = DockerFactory.eINSTANCE.createContainer();
        String _id = c.getId();
        modelContainer.setId(_id);
        String[] _names = c.getNames();
        String _get = _names[0];
        boolean _notEquals = (!Objects.equal(_get, null));
        if (_notEquals) {
          String[] _names_1 = c.getNames();
          String _get_1 = _names_1[0];
          String _replace = _get_1.replace("/", "");
          modelContainer.setName(_replace);
        }
        String _image = c.getImage();
        modelContainer.setImage(_image);
        String _command = c.getCommand();
        modelContainer.setCommand(_command);
        String _id_1 = c.getId();
        modelContainer.setContainerid(_id_1);
        containerList.add(modelContainer);
      }
    }
    return containerList;
  }
  
  public List<org.occiware.clouddesigner.occi.docker.Container> buildContainer(final Machine machine, final List<Container> containers) {
    final DockerContainerManager instance = new DockerContainerManager(machine);
    List<org.occiware.clouddesigner.occi.docker.Container> containerList = CollectionLiterals.<org.occiware.clouddesigner.occi.docker.Container>newArrayList();
    for (final Container c : containers) {
      {
        String _id = c.getId();
        final InspectContainerResponse currentContainer = instance.inspectContainer(machine, _id);
        currentContainer.getId();
        org.occiware.clouddesigner.occi.docker.Container modelContainer = DockerFactory.eINSTANCE.createContainer();
        String _id_1 = c.getId();
        modelContainer.setId(_id_1);
        String _name = currentContainer.getName();
        String _replace = _name.replace("/", "");
        modelContainer.setName(_replace);
        String _imageId = currentContainer.getImageId();
        modelContainer.setImage(_imageId);
        ContainerConfig _config = currentContainer.getConfig();
        String[] _cmd = _config.getCmd();
        String _string = Arrays.toString(_cmd);
        String _replace_1 = _string.replace("[", "");
        String _replace_2 = _replace_1.replace("]", "");
        modelContainer.setCommand(_replace_2);
        String _id_2 = currentContainer.getId();
        modelContainer.setContainerid(_id_2);
        try {
          ContainerConfig _config_1 = currentContainer.getConfig();
          ExposedPort[] _exposedPorts = _config_1.getExposedPorts();
          String _string_1 = Arrays.toString(_exposedPorts);
          String _replace_3 = _string_1.replace("[", "");
          String _replace_4 = _replace_3.replace("]", "");
          modelContainer.setPorts(_replace_4);
        } catch (final Throwable _t) {
          if (_t instanceof NullPointerException) {
            final NullPointerException exception = (NullPointerException)_t;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        ContainerConfig _config_2 = currentContainer.getConfig();
        String _macAddress = _config_2.getMacAddress();
        modelContainer.setMac_address(_macAddress);
        ContainerConfig _config_3 = currentContainer.getConfig();
        String _domainName = _config_3.getDomainName();
        modelContainer.setDomainname(_domainName);
        ContainerConfig _config_4 = currentContainer.getConfig();
        String _hostName = _config_4.getHostName();
        modelContainer.setHostname(_hostName);
        ContainerConfig _config_5 = currentContainer.getConfig();
        String _workingDir = _config_5.getWorkingDir();
        modelContainer.setWorking_dir(_workingDir);
        ContainerConfig _config_6 = currentContainer.getConfig();
        String[] _entrypoint = _config_6.getEntrypoint();
        String _string_2 = Arrays.toString(_entrypoint);
        modelContainer.setEntrypoint(_string_2);
        ContainerConfig _config_7 = currentContainer.getConfig();
        String[] _env = _config_7.getEnv();
        String _string_3 = Arrays.toString(_env);
        String _replace_5 = _string_3.replace("[", "");
        String _replace_6 = _replace_5.replace("]", "");
        modelContainer.setEnvironment(_replace_6);
        ContainerConfig _config_8 = currentContainer.getConfig();
        Boolean _tty = _config_8.getTty();
        modelContainer.setTty((_tty).booleanValue());
        ContainerConfig _config_9 = currentContainer.getConfig();
        Boolean _stdinOpen = _config_9.getStdinOpen();
        modelContainer.setStdin_open((_stdinOpen).booleanValue());
        String _processLabel = currentContainer.getProcessLabel();
        modelContainer.setPid(_processLabel);
        InspectContainerResponse.ContainerState _state = currentContainer.getState();
        Boolean _running = _state.getRunning();
        if ((_running).booleanValue()) {
          ComputeStatus _get = ComputeStatus.get(0);
          modelContainer.setState(_get);
        }
        containerList.add(modelContainer);
      }
    }
    return containerList;
  }
  
  public org.occiware.clouddesigner.occi.docker.Container buildContainer(final Machine machine, final String containerId) {
    final DockerContainerManager instance = new DockerContainerManager(machine);
    final InspectContainerResponse currentContainer = instance.inspectContainer(machine, containerId);
    org.occiware.clouddesigner.occi.docker.Container modelContainer = DockerFactory.eINSTANCE.createContainer();
    String _id = currentContainer.getId();
    modelContainer.setId(_id);
    String _name = currentContainer.getName();
    String _replace = _name.replace("/", "");
    modelContainer.setName(_replace);
    ContainerConfig _config = currentContainer.getConfig();
    String _image = _config.getImage();
    modelContainer.setImage(_image);
    ContainerConfig _config_1 = currentContainer.getConfig();
    String[] _cmd = _config_1.getCmd();
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(_cmd)).isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      ContainerConfig _config_2 = currentContainer.getConfig();
      String[] _cmd_1 = _config_2.getCmd();
      String _string = Arrays.toString(_cmd_1);
      String _replace_1 = _string.replace("[", "");
      String _replace_2 = _replace_1.replace("]", "");
      String _deleteWhitespace = StringUtils.deleteWhitespace(_replace_2);
      modelContainer.setCommand(_deleteWhitespace);
    }
    String _id_1 = currentContainer.getId();
    modelContainer.setContainerid(_id_1);
    ContainerConfig _config_3 = currentContainer.getConfig();
    String _macAddress = _config_3.getMacAddress();
    modelContainer.setMac_address(_macAddress);
    ContainerConfig _config_4 = currentContainer.getConfig();
    String _domainName = _config_4.getDomainName();
    modelContainer.setDomainname(_domainName);
    ContainerConfig _config_5 = currentContainer.getConfig();
    String _hostName = _config_5.getHostName();
    modelContainer.setHostname(_hostName);
    ContainerConfig _config_6 = currentContainer.getConfig();
    String _workingDir = _config_6.getWorkingDir();
    modelContainer.setWorking_dir(_workingDir);
    ContainerConfig _config_7 = currentContainer.getConfig();
    String[] _entrypoint = _config_7.getEntrypoint();
    String _string_1 = Arrays.toString(_entrypoint);
    modelContainer.setEntrypoint(_string_1);
    ContainerConfig _config_8 = currentContainer.getConfig();
    String[] _env = _config_8.getEnv();
    String _string_2 = Arrays.toString(_env);
    String _replace_3 = _string_2.replace("[", "");
    String _replace_4 = _replace_3.replace("]", "");
    modelContainer.setEnvironment(_replace_4);
    ContainerConfig _config_9 = currentContainer.getConfig();
    Boolean _tty = _config_9.getTty();
    modelContainer.setTty((_tty).booleanValue());
    ContainerConfig _config_10 = currentContainer.getConfig();
    Boolean _stdinOpen = _config_10.getStdinOpen();
    modelContainer.setStdin_open((_stdinOpen).booleanValue());
    String _processLabel = currentContainer.getProcessLabel();
    modelContainer.setPid(_processLabel);
    InspectContainerResponse.ContainerState _state = currentContainer.getState();
    Boolean _running = _state.getRunning();
    if ((_running).booleanValue()) {
      modelContainer.setState(ComputeStatus.ACTIVE);
    } else {
      modelContainer.setState(ComputeStatus.INACTIVE);
    }
    return modelContainer;
  }
  
  public String saveMachine(final Machine machine) {
    try {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      Class<? extends ModelHandler> _class = this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      URL _resource = _classLoader.getResource(".");
      final String basePath = _resource.getPath();
      String _name = machine.getName();
      String _plus = (basePath + _name);
      String _plus_1 = (_plus + ".xmi");
      File temp = new File(_plus_1);
      String _absolutePath = temp.getAbsolutePath();
      ModelHandler.LOGGER.info(_absolutePath);
      String _absolutePath_1 = temp.getAbsolutePath();
      final URI uri = URI.createURI(_absolutePath_1);
      Resource resource = resourceSet.createResource(uri);
      final XMIResource res = ((XMIResource) resource);
      Map<Object, Object> _defaultLoadOptions = res.getDefaultLoadOptions();
      _defaultLoadOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      Map<Object, Object> _defaultSaveOptions = res.getDefaultSaveOptions();
      _defaultSaveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      boolean _equals = Objects.equal(resource, null);
      if (_equals) {
        throw new NullPointerException("The resource is null.");
      }
      EList<EObject> _contents = resource.getContents();
      _contents.add(machine);
      resource.save(Collections.EMPTY_MAP);
      return temp.getAbsolutePath();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void saveContainer(final org.occiware.clouddesigner.occi.docker.Container container) {
    try {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      Class<? extends ModelHandler> _class = this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      URL _resource = _classLoader.getResource(".");
      final String basePath = _resource.getPath();
      String _name = container.getName();
      String _plus = (basePath + _name);
      String _plus_1 = (_plus + ".xmi");
      File temp = new File(_plus_1);
      String _absolutePath = temp.getAbsolutePath();
      ModelHandler.LOGGER.info(_absolutePath);
      String _absolutePath_1 = temp.getAbsolutePath();
      final URI uri = URI.createURI(_absolutePath_1);
      Resource resource = resourceSet.createResource(uri);
      final XMIResource res = ((XMIResource) resource);
      Map<Object, Object> _defaultLoadOptions = res.getDefaultLoadOptions();
      _defaultLoadOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      Map<Object, Object> _defaultSaveOptions = res.getDefaultSaveOptions();
      _defaultSaveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      boolean _equals = Objects.equal(resource, null);
      if (_equals) {
        throw new NullPointerException("The resource is null.");
      }
      EList<EObject> _contents = resource.getContents();
      _contents.add(container);
      resource.save(Collections.EMPTY_MAP);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void linkContainerToMachine(final org.occiware.clouddesigner.occi.docker.Container container, final Machine machine) {
    Contains contains = DockerFactory.eINSTANCE.createContains();
    contains.setTarget(container);
    EList<org.occiware.clouddesigner.occi.Link> _links = machine.getLinks();
    _links.add(contains);
  }
  
  public Machine linkContainerToMachine(final List<org.occiware.clouddesigner.occi.docker.Container> containers, final Machine machine) {
    Contains contains = DockerFactory.eINSTANCE.createContains();
    for (final org.occiware.clouddesigner.occi.docker.Container c : containers) {
      {
        contains.setTarget(c);
        EList<org.occiware.clouddesigner.occi.Link> _links = machine.getLinks();
        _links.add(contains);
      }
    }
    return machine;
  }
  
  public void linkContainerToContainer(final org.occiware.clouddesigner.occi.docker.Container left, final org.occiware.clouddesigner.occi.docker.Container right) {
    org.occiware.clouddesigner.occi.docker.Link links = DockerFactory.eINSTANCE.createLink();
    links.setTarget(right);
    EList<org.occiware.clouddesigner.occi.Link> _links = left.getLinks();
    _links.add(links);
  }
  
  public void removeContainerFromMachine(final org.occiware.clouddesigner.occi.docker.Container container, final Machine machine) {
    Contains contains = DockerFactory.eINSTANCE.createContains();
    contains.setTarget(container);
    EList<org.occiware.clouddesigner.occi.Link> _links = machine.getLinks();
    _links.remove(contains);
  }
  
  public boolean isSimilar(final Notifier left, final Notifier right) {
    EMFCompare.Builder _builder = EMFCompare.builder();
    EMFCompare _build = _builder.build();
    DefaultComparisonScope _defaultComparisonScope = new DefaultComparisonScope(left, right, null);
    Comparison _compare = _build.compare(_defaultComparisonScope);
    EList<Diff> _differences = _compare.getDifferences();
    return _differences.isEmpty();
  }
  
  public boolean isSimilar(final Machine machine1, final Machine machine2) {
    final ResourceSet resourceSet1 = new ResourceSetImpl();
    final ResourceSet resourceSet2 = new ResourceSetImpl();
    final String xmi1 = this.saveMachine(machine1);
    final String xmi2 = this.saveMachine(machine2);
    this.load(xmi1, resourceSet1);
    this.load(xmi2, resourceSet2);
    final IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
    DefaultEqualityHelperFactory _defaultEqualityHelperFactory = new DefaultEqualityHelperFactory();
    final IComparisonFactory comparisonFactory = new DefaultComparisonFactory(_defaultEqualityHelperFactory);
    final IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
    matchEngineFactory.setRanking(20);
    final IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
    matchEngineRegistry.add(matchEngineFactory);
    EMFCompare.Builder _builder = EMFCompare.builder();
    EMFCompare.Builder _setMatchEngineFactoryRegistry = _builder.setMatchEngineFactoryRegistry(matchEngineRegistry);
    final EMFCompare comparator = _setMatchEngineFactoryRegistry.build();
    final IComparisonScope scope = EMFCompare.createDefaultScope(resourceSet1, resourceSet2);
    Comparison _compare = comparator.compare(scope);
    EList<Diff> _differences = _compare.getDifferences();
    return _differences.isEmpty();
  }
  
  public void load(final String absolutePath, final ResourceSet resourceSet) {
    final URI uri = URI.createFileURI(absolutePath);
    Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
    Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    resourceSet.getResource(uri, true);
  }
}
