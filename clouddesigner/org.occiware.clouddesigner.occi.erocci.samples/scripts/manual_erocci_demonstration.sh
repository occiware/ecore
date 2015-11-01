#! /bin/sh
#################################################################################
# Copyright (c) 2015 Inria
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
# 
# Contributors:
#     Philippe Merle <philippe.merle@inria.fr>
#
#################################################################################

echo Creating a Docker machine named OCCIware...
docker-machine create --driver virtualbox OCCIware

echo Setting the Docker environment variables to use the OCCIware machine...
eval "$(docker-machine env OCCIware)"

echo Running erocci Docker-based container on the OCCIware machine...
docker run --name erocci -p 8080:80 -v `pwd`/config/erocci:/tmp -d erocci/erocci

echo Waiting for erocci is running...
sleep 2 # TODO: find a better way to be sure that erocci is running!

EROCCI_URL=http://`docker-machine ip OCCIware`:8080
echo erocci is running at $EROCCI_URL

echo Displaying all OCCI categories managed by the running erocci...
curl $EROCCI_URL/-/

echo Displaying all OCCI entities managed by the running erocci...
scripts/erocci-show-all-entities.sh $EROCCI_URL

echo Creating several OCCI resources...
scripts/infrastructure.occic.sh $EROCCI_URL

echo Displaying all previously created OCCI entities...
scripts/erocci-show-all-entities.sh $EROCCI_URL

echo Cleaning up the environment...
docker-machine rm -f OCCIware
