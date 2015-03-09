EMF metamodel for OCCI and some OCCI extensions.

- extensions/ contains OCCI extensions.
  - All.xmi contains an OCCI extensions that imports all following OCCI extensions.
  - Core.xmi contains OCCI kinds for entity, resource, and link.
  - Infrastructure.xmi contains the OCCI Infrastructure extension.
  - Monitoring.xmi contains the OCCI Monitoring extension.
  - Docker.xmi contains an OCCI extension for Docker (WIP).
  - OCNI.xmi contains an OCCI extension for Network as a Service (WIP).
- configurations/ contains OCCI configurations.
    - OCCI-Infrastructure-*.xmi are configurations related to OCCI Infrastructure Extension.
    - ServiceManager-*.xmi are configurations related to the Service Manager extension.
- docker/ contains a new OCCI extension for Docker.
  - Docker.xmi contains the OCCI extension for Docker.
  - other .xmi files are Docker configurations.
- images/ contains OCCIware Modeler screenshots.
- tests/ contains OCCI models that violate OCL constraints defined in OCCI.ecore.
- OCCI.ecore is the EMF metamodel for OCCI Core.
- OCCI.ocl contains a copy of the OCL constraints embedded in OCCI.ecore.
- README.md is this file.
- representations.aird contains Sirius models.
 