OCCIWARE-HYPERVISOR-CONNECTOR
=========================
This sub project aims to provide the necessaries tools for executing the OCCIWARE model in real execution environment.

Prerequisites
------------- 
	Be sure libvirt client is installed on our machine.

Configuration
-------------
Change the configuration below according to your requirements in the file ecore/clouddesigner/org.occiware.clouddesigner.occi.hypervisor.connector/src/resources/libvirt.properties.

#### Properties
	libvirt.xmlDirectory = /tmp/xml/
	libvirt.storageDirectory = /tmp/storage/
	libvirt.ramDirectory = /tmp/ram/	

Lunch the modeler
----------------
To lunch the modeler follow these steps:

* Start your eclipse IDE in `Run` menu chose `Run Configurations..` (We assume that the OCCIWARE/ecore project is already lunched in your IDE).

![Run Configurations...](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/run.png "Run Configurations...")

* Click on `Run` button.

* After few minutes, a new Eclipse IDE will appears.

* Import the project "org.occiware.clouddesigner.occi.hypervisor.samples" using `Import`, `Projects from Git`.

* When the project is imported, make a right click on it and choose  `Viewpoints Selection`.

![Viewpoint Selections](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/vs.png "Viewpoint Selections")

* Check that the `hypervisor` box is checked as shown in the picture below.

![Viewpoint Selections](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/viewpoint-hypervisor.png "Viewpoint Selections")

Demo
----
This video shows how to:

  * Lunch the modeler.
  
  * Use all actions defined with the connector (see the document belongs): [Hypervisor Connector Backlog](https://docs.google.com/document/d/1X1DtfjoB8PehV69BcCt8jGXZN40UNc97wSc3lbg-Lr0/edit)
  
  [![Hypervisor Modeler Demo](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/hypervisor-demo-youtube.png)](https://www.youtube.com/watch?v=2SZXi71L0qQ)
  