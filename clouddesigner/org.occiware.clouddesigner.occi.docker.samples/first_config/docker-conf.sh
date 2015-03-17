#!/bin/sh

# Create the Docker Machine_VirtualBox named localhost
docker-machine create --driver=virtualbox --virtualbox-memory adezdeza5000 --virtualbox-disk-size 20000 localhost

# Create the Docker Container named webserver
docker $(docker-machine config localhost) create --name webserver --link db:db tomcat 

# Start the Docker Container named webserver
docker $(docker-machine config localhost) start webserver

# Create the Docker Container named db
docker $(docker-machine config localhost) create --name db  mysql 

# Start the Docker Container named db
docker $(docker-machine config localhost) start db


