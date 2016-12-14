# Using the connector through Mart-Server

Model at Runtime server application, OCCI HTTP Server with OCCIware model support (Configuration / Extension / Runtime Connector).

## Mart Server source code

https://github.com/cgourdin/MartServer

## User guide

### List the information of all deployed compute

```curl -v -X GET http://xx.xxx.xx.xxx:8080/compute/ -H "accept: application/occi+json"```

### Create a compute

<pre>
<code>
curl -v -X PUT -d '{
  "id": "urn:uuid:d99486b7-0632-482d-a184-a8195733ddd3",
  "title": "vm-name",
  "kind": "http://schemas.ogf.org/occi/infrastructure#compute",
  "attributes": {
    "occi.compute.speed": 3.0,
    "occi.compute.memory": 4.0,
    "occi.compute.cores": 4,
    "occi.compute.architecture": "x86",
    "occi.compute.state": "active"
  }
}' http://xx.xxx.xx.xxx:8080/ -H "Content-Type: application/occi+json" -H "accept: application/occi+json
</pre>
</code>



