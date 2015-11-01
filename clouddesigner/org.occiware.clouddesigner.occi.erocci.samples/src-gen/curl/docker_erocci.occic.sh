#! /bin/sh
#
# Generated at Sun Nov 01 15:19:35 CET 2015 from platform:/resource/org.occiware.clouddesigner.occi.erocci.samples/config/occi/docker_erocci.occic by org.occiware.clouddesigner.occi.gen.curl
#

OCCI_SERVER_URL=$1
CURL_OPTS="-s -v -i"

curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/machine_VirtualBox/_uEZL8H6gEeWnDLHK1wRq-g -H 'Content-Type: text/occi' -H 'Category: machine_VirtualBox; scheme="http://occiware.org/docker#"; class="kind";'
curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/container/_8QFOkH6gEeWnDLHK1wRq-g -H 'Content-Type: text/occi' -H 'Category: container; scheme="http://occiware.org/docker#"; class="kind";'

curl $CURL_OPTS -X PUT $OCCI_SERVER_URL/contains/_8QwkAH6gEeWnDLHK1wRq-g -H 'Content-Type: text/occi' -H 'Category: contains; scheme="http://occiware.org/docker#"; class="kind";' -H 'X-OCCI-Attribute: occi.core.source="/machine_VirtualBox/_uEZL8H6gEeWnDLHK1wRq-g", occi.core.target="/container/_8QFOkH6gEeWnDLHK1wRq-g"'

