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

OCCI_SERVER_URL=$1

# Iterate over all OCCI kind collections.
collection_urls=$(curl $CURL_OPTS $OCCI_SERVER_URL/-/ 2> /dev/null | grep "class=\"kind\";" | sed 's/.* location=\"\(.*\)\"/\1/')
for collection_url in $collection_urls
do
    echo OCCI collection at $collection_url
    echo --------------------------------------------------------------------------------
    # Iterate over all OCCI entities of each collection.
	entity_urls=$(curl $collection_url 2> /dev/null | grep "x-occi-location: " | sed 's/x-occi-location: \(.*\)/\1/')
	for entity_url in $entity_urls
    do
      echo OCCI entity at $entity_url
	  curl $entity_url
	  curl -H 'accept: application/json' $entity_url
    done
    echo
done
