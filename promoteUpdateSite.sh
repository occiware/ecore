#!/bin/bash
API=https://api.bintray.com
BINTRAY_R=https://dl.bintray.com/$BINTRAY_USER/generic
BINTRAY_W=$API/content/$BINTRAY_USER/generic
BINTRAY_USER=wpiers
BINTRAY_API_KEY=$KEY
BINTRAY_OWNER=wpiers
BINTRAY_REPO=generic
PCK_NAME=CloudDesigner
PCK_VERSION=0.1.0
PATH_TO_REPOSITORY=clouddesigner/org.occiware.clouddesigner.repository/target/repository

function main() {
clean
deploy_updatesite
}

function clean() {
curl -u$BINTRAY_USER:$KEY -X DELETE $BINTRAY_W/content.jar
curl -u$BINTRAY_USER:$KEY -X DELETE $BINTRAY_W/artifacts.jar
for file in $(curl --list-only --silent -u$BINTRAY_USER:$KEY $BINTRAY_R/plugins/ | grep '.jar' | sed 's/.*href=".//' | sed 's/".*//');
do curl -u$BINTRAY_USER:$KEY -X DELETE $BINTRAY_W/$file
done
for file in $(curl --list-only --silent -u$BINTRAY_USER:$KEY $BINTRAY_R/feature/ | grep '.jar' | sed 's/.*href=".//' | sed 's/".*//');
do curl -u$BINTRAY_USER:$KEY -X DELETE $BINTRAY_W/$file
done
}

function deploy_updatesite() {
echo "${BINTRAY_USER}"
echo "${BINTRAY_API_KEY}"
echo "${BINTRAY_OWNER}"
echo "${BINTRAY_REPO}"
echo "${PCK_NAME}"
echo "${PCK_VERSION}"
echo "${PATH_TO_REPOSITORY}"

if [ ! -z "$PATH_TO_REPOSITORY" ]; then
   cd $PATH_TO_REPOSITORY
fi


FILES=./*
BINARYDIR=./binary/*
PLUGINDIR=./plugins/*
FEATUREDIR=./features/*

for f in $FILES;
do
if [ ! -d $f ]; then
  echo "Processing $f file..."
  if [[ "$f" == *content.jar ]] || [[ "$f" == *artifacts.jar ]] 
  then
    echo "Uploading p2 metadata file directly to the repository"
    curl -X PUT -T $f -u ${BINTRAY_USER}:${BINTRAY_API_KEY} https://api.bintray.com/content/${BINTRAY_OWNER}/${BINTRAY_REPO}/$f;publish=0
  else 
    curl -X PUT -T $f -u ${BINTRAY_USER}:${BINTRAY_API_KEY} https://api.bintray.com/content/${BINTRAY_OWNER}/${BINTRAY_REPO}/${PCK_NAME}/${PCK_VERSION}/$f;publish=0
  fi
  echo ""
fi
done

echo "Processing features dir $FEATUREDIR file..."
for f in $FEATUREDIR;
do
  echo "Processing feature: $f file..."
  curl -X PUT -T $f -u ${BINTRAY_USER}:${BINTRAY_API_KEY} https://api.bintray.com/content/${BINTRAY_OWNER}/${BINTRAY_REPO}/${PCK_NAME}/${PCK_VERSION}/$f;publish=0
  echo ""
done

echo "Processing plugin dir $PLUGINDIR file..."

for f in $PLUGINDIR;
do
   # take action on each file. $f store current file name
  echo "Processing plugin: $f file..."
  curl -X PUT -T $f -u ${BINTRAY_USER}:${BINTRAY_API_KEY} https://api.bintray.com/content/${BINTRAY_OWNER}/${BINTRAY_REPO}/${PCK_NAME}/${PCK_VERSION}/$f;publish=0
  echo ""
done

echo "Processing binary dir $BINARYDIR file..."

echo "Publishing the new version"
curl -X POST -u ${BINTRAY_USER}:${BINTRAY_API_KEY} https://api.bintray.com/content/${BINTRAY_OWNER}/${BINTRAY_REPO}/${PCK_NAME}/${PCK_VERSION}/publish -d "{ \"discard\": \"false\" }"

}


main "$@"
