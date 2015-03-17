#!/bin/sh

# Create the Docker Machine_VirtualBox named demo
docker-machine create --driver=virtualbox --virtualbox-memory 2048 --virtualbox-disk-size 80000 demo

# Create the Docker Container named db
docker $(docker-machine config demo) create --name db  training/postgres 

# Start the Docker Container named db
docker $(docker-machine config demo) start db

# Create the Docker Container named web
docker $(docker-machine config demo) create --name web -P --link db:db training/webapp python app.py

# Start the Docker Container named web
docker $(docker-machine config demo) start web


