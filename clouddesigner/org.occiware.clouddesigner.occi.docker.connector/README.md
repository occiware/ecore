OCCIWARE-DOCKER-CONNECTOR
=========================
This sub project aims to provide the necessaries tools for executing the OCCIWARE model in real execution environment.

Prerequisite
------------
You should have an account or register yourself on: https://hub.docker.com/account/signup/.

Configuration
-------------
Change the configuration below according to your requirements in the class ecore/clouddesigner/org.occiware.clouddesigner.occi.docker.connector/src/org/occiware/clouddesigner/occi/docker/connector/dockerjava/DockerContainerManager.xtend.

		var DockerClientConfig config = DockerClientConfig.createDefaultConfigBuilder().withVersion("1.16")
		.withUri(dockerUri).withUsername("dockeruser")
		.withPassword("iloveocciware")
		.withEmail("dockeruser@occiware.org")
		.withServerAddress("https://index.docker.io/v1/")
		.withDockerCertPath(certPath).build();
		var DockerClient dockerClient = DockerClientBuilder.getInstance(config).build();
		return dockerClient
