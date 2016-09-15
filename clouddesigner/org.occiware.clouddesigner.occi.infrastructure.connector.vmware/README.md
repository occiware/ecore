# occiware-infravmware
This connector plug a VMWare infrastructure with infrastructure extension.

## How to use this connector 
For use, you must replace "dummy connector" by this one.

Infrastructure extension is the extension model for this connector, you can design a compute and launch it on VMWare VCenter.

Two modes are supported now, the creation of virtual machine without virtual machine template and with a template.

Usage with template : set the attribute "occi.compute.image" with the name of your template and the connector will clone the template on your compute without taking account of other fields (like cpu, memory etc.), set the title as it represent the name of your virtual machine.

Don't forget to add your credentials in src/resources/vmware-credential.properties and copy it to your home directory before using this connector.

Disk usage has been added, you can now create empty disk, create attached disk, attach/detach a disk, delete a disk, resize a disk (only on superior capacity) and rename a disk.

Network usage has been added, you can now discover networks, the vswitch networking actions is in development. You can create network adapters and connect or disconnect them.

## Supported version of VMWare vcenter
The version 6.0, and all older version 5.5, 5.0, 4.1 etc. (ESX and ESXi).
