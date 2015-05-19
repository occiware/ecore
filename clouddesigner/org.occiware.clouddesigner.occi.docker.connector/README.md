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
To lunch the modeler follow the steps

Start your eclipse IDE in `Run` menu chose `Run Configurations..`

![Run Configurations...](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/run.png "Run Configurations...")

Click on `Run` button.

After few minutes, a new Eclipse IDE will appears.

Import the project "org.occiware.clouddesigner.occi.docker.samples" using `Import`, `Projects from Git`

When the project is imported, make a right click on it and choose  `Viewpoint Selections`.

![Viewpoint Selections](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/vs.png "Viewpoint Selections")

Check that the `docker` box is checked as shown in the picture below.

![Viewpoint Selections](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/view.png "Viewpoint Selections")

Demo
----
This video shows how to:
  
	1. Lunch the modeler.
	
	2. Use all actions defined with the connector (see the document belongs):[Docker Connector Backlog](https://docs.google.com/document/d/1X1DtfjoB8PehV69BcCt8jGXZN40UNc97wSc3lbg-Lr0/edit)
	
	[![IMAGE ALT TEXT HERE](http://img.youtube.com/vi/YOUTUBE_VIDEO_ID_HERE/0.jpg)](http://youtu.be/2SZXi71L0qQ)
	
	<a href="https://youtu.be/2SZXi71L0qQ" target="_blank"><img src="http://img.youtube.com/vi/YOUTUBE_VIDEO_ID_HERE/0.jpg" alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" /></a>
	
	

	
	