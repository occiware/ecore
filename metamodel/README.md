#A Precise Metamodel for Open Cloud Computing Interface

This repository provides the EMF metamodel for OCCI and some OCCI extensions.

These examples are used in the paper titled **"A Precise Metamodel for Open Cloud Computing Interface"** and accepted for **[CLOUD 2015](http://www.thecloudcomputing.org/2015/)**. 

It contains the following artefacts:

- OCCI.ecore is the EMF metamodel for OCCI Core.
- OCCI.ocl contains a copy of the OCL constraints embedded in OCCI.ecore.

It  also provides contains the following artefacts used to validate the proposed contribution. 
- a list of proposed extensions defined using our precise metamodel
  - extensions/ contains OCCI extensions.
    - All.xmi contains an OCCI extensions that imports all following OCCI extensions.
    - Core.xmi contains OCCI kinds for entity, resource, and link.
    - Infrastructure.xmi contains the OCCI Infrastructure extension.
    - Monitoring.xmi contains the OCCI Monitoring extension.
    - Docker.xmi contains an OCCI extension for Docker (WIP).
    - OCNI.xmi contains an OCCI extension for Network as a Service (WIP).
- a list of configurations builds using these extensions
  - configurations/ contains OCCI configurations.
    - OCCI-Infrastructure-*.xmi are configurations related to OCCI Infrastructure Extension.
    - ServiceManager-*.xmi are configurations related to the Service Manager extension.
  - docker/ contains a new OCCI extension for Docker.
    - Docker.xmi contains the OCCI extension for Docker.
    - other .xmi files are Docker configurations.

Finally it provides some artefacts that can be used to understand the proposed models and metamodels and to highlight some models that violates the proposed semantics. 

- images/ contains OCCIware Modeler screenshots.
- tests/ contains OCCI models that violate OCL constraints defined in OCCI.ecore.
- README.md is this file.
- representations.aird contains Sirius models.
 
