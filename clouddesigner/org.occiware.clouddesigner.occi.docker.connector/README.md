OCCIWARE-DOCKER-CONNECTOR
=========================
This sub project aims to provide the necessaries tools for executing the OCCIWARE model in real execution environment.

Prerequisites
-------------
	Supports Docker client version 1.8.3
	Be sure the Docker daemon is running.
	You should have an account or register yourself on: https://hub.docker.com/account/signup/.
	To use the driver ```vmwarevsphere```, you should install ```govc``` CLI as described here: https://github.com/vmware/govmomi/tree/master/govc.
	
	Setting the docker-machine command (You should download the binary file docker-machine):
	$ ln -s /path/to-file/docker-machine /usr/bin/docker-machine

	Setting the govc command :
	$ ln -s /path/to-file/govc /usr/bin/govc
	

Launch the modeler
----------------
There are two ways to launch the docker connector.

	* Using the occiware studio here: http://www.obeo.fr/download/occiware/
	* Using the eclipse with ecore source code


To launch the modeler from OCCIware Studio follow these steps:

* Start the occiware studio you have downloaded [here](http://www.obeo.fr/download/occiware/)

Configuration
-------------
This configuration is optional, let the default value if you do not change it. However, if you want to use a specific docker images you should configure it according to your requirements.

#### Go to the Prefrerences
	On WINDOWS PLATFORM or Linux PLATFORM : Window > Preferences  dialog page will appear
	On MAC OS X PLATFORM : eclipse > Preferences  dialog page will appear like this :

![Preferences](documentation/images/preferences.png "Docker preferences")

Click on the `Docker Preferences` button in order to change the settings. Change the configuration below according to your requirements in the Docker modeler.

![Preferences](documentation/images/docker_preferences.png "Docker preferences")
		

* Create new project 
![Viewpoint Selections](documentation/images/new_projet.png "New project")



* Create the docker configuration 
![Viewpoint Selections](documentation/images/set_config.png "Create the configuration")



* Set the configuration name in the wizard
![Viewpoint Selections](documentation/images/set_configuration_name.png "Select the appropriate configuration")



* You should get something like this
![Viewpoint Selections](documentation/images/rendering_docker_modeler.png "Select the docker reference extension")


* Create a new machine and one container inside the machine
![Viewpoint Selections](documentation/images/ex_design.png "create a new machine")


* Select `Startall` in the contextual menu `Execute`in order to start both the machine and the docker
![Viewpoint Selections](documentation/images/ex_design_on.png "create a new machine")


* You can also import all machines deployed in the execution environment
![Viewpoint Selections](documentation/images/after_import.png "create a new machine")

To launch the modeler from eclipse with ecore source code follow these steps:

* Start your eclipse IDE in `Run` menu chose `Run Configurations..` (We assume that the OCCIWARE/ecore project is already launched in your IDE).

![Run Configurations...](documentation/images/run.png "Run Configurations...")

* Click on `Run` button.

* After few minutes, a new Eclipse IDE will appears.

* Import the project "org.occiware.clouddesigner.occi.docker.samples" using `Import`, `Projects from Git`.

* When the project is imported, make a right click on it and choose  `Viewpoints Selection`.

![Viewpoint Selections](documentation/images/vs.png "Viewpoint Selections")

* Check that the `docker` box is checked as shown in the picture below.

![Viewpoint Selections](documentation/images/view.png "Viewpoint Selections")

Demo
----
This video shows how to:

  * Launch the modeler.
  
  * Use all actions defined with the connector (see the document belongs): [Docker Connector Backlog](https://docs.google.com/document/d/1X1DtfjoB8PehV69BcCt8jGXZN40UNc97wSc3lbg-Lr0/edit)
  
  [![Docker Modeler Demo](https://raw.githubusercontent.com/occiware/dev-tools/master/eclipse/images/docker-demo-youtube.png)](https://www.youtube.com/watch?v=2SZXi71L0qQ)
  