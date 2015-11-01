#! /bin/sh
#
# Generated at Sun Nov 01 21:40:02 CET 2015 from platform:/resource/org.occiware.clouddesigner.occi.erocci.samples/config/occi/docker_erocci.occic by org.occiware.clouddesigner.occi.docker.gen.conf
#

# Create the Docker Machine_VirtualBox named OCCIware
docker-machine create --driver=virtualbox --virtualbox-disk-size 20000 OCCIware

eval "$(docker-machine env OCCIware)"

# Create the Docker Container named erocci
docker create --name erocci -v `pwd`/config/erocci:/tmp -p 8080:80 erocci/erocci

# Start the Docker Container named erocci
docker start erocci


