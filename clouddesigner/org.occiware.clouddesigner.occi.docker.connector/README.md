OCCIWARE-DOCKER-CONNECTOR
=========================
This sub project aims to provide the necessaries tools for executing the OCCIWARE model in real execution environment.

Prerequisite
------------
You should have an account or register yourself on: https://hub.docker.com/account/signup/.

Configuration
-------------
Change the configuration below according to your requirements in the file ecore/clouddesigner/org.occiware.clouddesigner.occi.docker.connector/src/resources/docker.properties.

#### Properties
	docker.username=dockeruser
	docker.password=iloveocciware
	docker.email=dockeruser@occiware.org
	docker.version=1.16
	docker.url=https://index.docker.io/v1/
	

Lunch the modeler
----------------
To lunch the modeler follow these steps:

* Start your eclipse IDE in `Run` menu chose `Run Configurations..` (We assume that the OCCIWARE/ecore project is already lunched in your IDE).

![Run Configurations...](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/run.png "Run Configurations...")

* Click on `Run` button.

* After few minutes, a new Eclipse IDE will appears.

* Import the project "org.occiware.clouddesigner.occi.docker.samples" using `Import`, `Projects from Git`.

* When the project is imported, make a right click on it and choose  `Viewpoints Selection`.

![Viewpoint Selections](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/vs.png "Viewpoint Selections")

* Check that the `docker` box is checked as shown in the picture below.

![Viewpoint Selections](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/view.png "Viewpoint Selections")

Demo
----
This video shows how to:

  * Lunch the modeler.
  
  * Use all actions defined with the connector (see the document belongs): [Docker Connector Backlog](https://docs.google.com/document/d/1X1DtfjoB8PehV69BcCt8jGXZN40UNc97wSc3lbg-Lr0/edit)
  
  [![Docker Modeler Demo](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/docker-demo-youtube.png)](https://www.youtube.com/watch?v=2SZXi71L0qQ)
  