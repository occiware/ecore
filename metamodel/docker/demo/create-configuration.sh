#!/bin/sh

SERVER=$1
COPTS="-s -v" # -i

curl $COPTS -X PUT $SERVER/machine_VirtualBox/machine-1 -H 'Content-Type: text/occi' -H 'Category: machine_VirtualBox; scheme="http://occiware.org/occi/docker#"; class="kind";' -H 'X-OCCI-Attribute: name="demo"' -H 'X-OCCI-Attribute: memory=2048' -H 'X-OCCI-Attribute: disk_size=80000'
curl $COPTS -X PUT $SERVER/container/container-1 -H 'Content-Type: text/occi' -H 'Category: container; scheme="http://occiware.org/occi/docker#"; class="kind";' -H 'X-OCCI-Attribute: name="web"' -H 'X-OCCI-Attribute: publish_all="true"' -H 'X-OCCI-Attribute: image="training/webapp"' -H 'X-OCCI-Attribute: command="python app.py"'
curl $COPTS -X PUT $SERVER/container/container-2 -H 'Content-Type: text/occi' -H 'Category: container; scheme="http://occiware.org/occi/docker#"; class="kind";' -H 'X-OCCI-Attribute: name="db"' -H 'X-OCCI-Attribute: image="training/postgres"'

curl $COPTS -X PUT $SERVER/contains/contains-1.1 -H 'Content-Type: text/occi' -H 'Category: contains; scheme="http://occiware.org/occi/docker#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.source="/machine_VirtualBox/machine-1", occi.core.target="/container/container-1"'
curl $COPTS -X PUT $SERVER/contains/contains-1.2 -H 'Content-Type: text/occi' -H 'Category: contains; scheme="http://occiware.org/occi/docker#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.source="/machine_VirtualBox/machine-1", occi.core.target="/container/container-2"'
curl $COPTS -X PUT $SERVER/link/link-1.1 -H 'Content-Type: text/occi' -H 'Category: link; scheme="http://occiware.org/occi/docker#"; class="kind";' -H 'X-OCCI-Attribute: alias="db"' -H 'X-OCCI-Attribute: occi.core.source="/container/container-1", occi.core.target="/container/container-2"'

