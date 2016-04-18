#! /bin/sh

M2_REPOSITORY_HOME=$HOME/.m2/repository
CLOUDDESIGNER_GROUPID=Clouddesigner

OCCIware_HOME=$HOME/git/ecore-genmodel
CLOUDDESIGNER_HOME=${OCCIware_HOME}/clouddesigner
MART_HOME=${OCCIware_HOME}/mart

update_module()
{
  MODULE=$1
  echo Updating ${MODULE}...
  echo rm -rf ${M2_REPOSITORY_HOME}/${CLOUDDESIGNER_GROUPID}/$MODULE
  rm -rf ${M2_REPOSITORY_HOME}/${CLOUDDESIGNER_GROUPID}/$MODULE
  echo cd ${CLOUDDESIGNER_HOME}/$MODULE
  cd ${CLOUDDESIGNER_HOME}/$MODULE
  echo mvn clean install
  mvn clean install
  echo cp -r ${M2_REPOSITORY_HOME}/${CLOUDDESIGNER_GROUPID}/$MODULE ${MART_HOME}/repo/${CLOUDDESIGNER_GROUPID}
  cp -r ${M2_REPOSITORY_HOME}/${CLOUDDESIGNER_GROUPID}/$MODULE ${MART_HOME}/repo/${CLOUDDESIGNER_GROUPID}
  echo ${MODULE} updated.
}

update_module org.occiware.clouddesigner.occi

update_module org.occiware.clouddesigner.occi.infrastructure

update_module org.occiware.clouddesigner.occi.infrastructure.connector.dummy

update_module org.occiware.clouddesigner.occi.platform

update_module org.occiware.clouddesigner.occi.platform.connector.dummy
