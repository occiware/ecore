# Introduction

This connector allows to interact with OCCI servers:
* import OCCI entities from an OCCI server
* create/read/update/delete OCCI entities hosted by an OCCI server
* execute OCCI actions on OCCI entities

Current supported OCCI servers are [erocci](http://erocci.ow2.org) and [rOCCI](https://github.com/EGI-FCTF/rOCCI).

This connector is based on [jOCCI](https://github.com/EGI-FCTF/jOCCI-api), a Java-based OCCI client library.

# Usage

* Select "New" / "Cloud Designer" / "OCCI Configuration File with jOCCI connector" in order to create a new OCCI Configuration File with jOCCI connector:

![Create a new OCCI Configuration File with jOCCI connector - step 1](screenshots/new-OCCI-Configuration-File-with-jOCCI-connector-1.png "Create a new OCCI Configuration File with jOCCI connector - step 1")

* Enter the OCCI configuration file name and the URL of an OCCI server:

![Create a new OCCI Configuration File with jOCCI connector - step 2](screenshots/new-OCCI-Configuration-File-with-jOCCI-connector-2.png "Create a new OCCI Configuration File with jOCCI connector - step 2")

* Then a new OCCI configuration file is created and contains all OCCI entities hosted by the OCCI server:

![Create a new OCCI Configuration File with jOCCI connector - step 3](screenshots/new-OCCI-Configuration-File-with-jOCCI-connector-3.png "Create a new OCCI Configuration File with jOCCI connector - step 3")
