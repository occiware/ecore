// Generated at Mon Mar 13 17:16:45 CET 2017 from platform:/resource/org.occiware.clouddesigner.occi.monitoring.ext/model/monitoringext.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Static Semantics for OCCI Extension 'monitoringext'
//
// ======================================================================

module monitoringext

open util/boolean
open OCCI

// ======================================================================
//
// Imported extensions
//
// ======================================================================

open core
open monitoring

// ======================================================================
//
// OCCI extension 'monitoringext'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "monitoringext"
    scheme = "http://occiware.org/occi/monitoring/ext#"
    import = core/extension + monitoring/extension
    kinds = sshcollector + centreoncollector + sensorext
    mixins = emf-publisher + systemout-publisher
    types = FloatType_DataType
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/monitoring/ext#sshcollector'
//
// ======================================================================

one sig sshcollector extends Kind {} {
    term = "sshcollector"
    scheme = "http://occiware.org/occi/monitoring/ext#"
    title = "Collector data metrics with an ssh script"
    parent = monitoring/collector
    attributes = sshcollector_cpu + sshcollector_ram + sshcollector_loadavg
    no actions
    entities in Sshcollector
}

//
// OCCI attribute 'cpu'
//
one sig sshcollector_cpu extends Attribute {} {
    name = "cpu"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'ram'
//
one sig sshcollector_ram extends Attribute {} {
    name = "ram"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'loadavg'
//
one sig sshcollector_loadavg extends Attribute {} {
    name = "loadavg"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Sshcollector
// ======================================================================

sig Sshcollector extends monitoring/Collector {
    cpu : lone FloatType,
    ram : lone FloatType,
    loadavg : lone FloatType,
} {
    hasKind[sshcollector]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/monitoring/ext#centreoncollector'
//
// ======================================================================

one sig centreoncollector extends Kind {} {
    term = "centreoncollector"
    scheme = "http://occiware.org/occi/monitoring/ext#"
    title = "Connect to a centreon server and use its api"
    parent = monitoring/collector
    attributes = centreoncollector_cpuPercent + centreoncollector_loadavg + centreoncollector_ram
    no actions
    entities in Centreoncollector
}

//
// OCCI attribute 'cpuPercent'
//
one sig centreoncollector_cpuPercent extends Attribute {} {
    name = "cpuPercent"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'loadavg'
//
one sig centreoncollector_loadavg extends Attribute {} {
    name = "loadavg"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'ram'
//
one sig centreoncollector_ram extends Attribute {} {
    name = "ram"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Centreoncollector
// ======================================================================

sig Centreoncollector extends monitoring/Collector {
    cpuPercent : lone FloatType,
    loadavg : lone FloatType,
    ram : lone FloatType,
} {
    hasKind[centreoncollector]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/monitoring/ext#sensorext'
//
// ======================================================================

one sig sensorext extends Kind {} {
    term = "sensorext"
    scheme = "http://occiware.org/occi/monitoring/ext#"
    title = "A sensor with a publisher to directly have bars and display its values in a nice way on designer"
    parent = monitoring/sensor
    attributes = sensorext_cpu + sensorext_ram + sensorext_loadavg
    actions = sensorext_startMonitoring + sensorext_stopMonitoring
    entities in Sensorext
}

//
// OCCI attribute 'cpu'
//
one sig sensorext_cpu extends Attribute {} {
    name = "cpu"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'ram'
//
one sig sensorext_ram extends Attribute {} {
    name = "ram"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'loadavg'
//
one sig sensorext_loadavg extends Attribute {} {
    name = "loadavg"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/monitoring/ext/sensorext/action#startMonitoring'
//
one sig sensorext_startMonitoring extends Action {} {
    term = "startMonitoring"
    scheme = "http://occiware.org/occi/monitoring/ext/sensorext/action#"
    title = "Start the monitoring system for this sensor"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/monitoring/ext/sensorext/action#stopMonitoring'
//
one sig sensorext_stopMonitoring extends Action {} {
    term = "stopMonitoring"
    scheme = "http://occiware.org/occi/monitoring/ext/sensorext/action#"
    title = "Stop monitoring for this sensor"
    no attributes
}


// ======================================================================
// Signature for Sensorext
// ======================================================================

sig Sensorext extends monitoring/Sensor {
    cpu : lone FloatType,
    ram : lone FloatType,
    loadavg : lone FloatType,
} {
    hasKind[sensorext]
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/monitoring/ext#emf-publisher'
//
// ======================================================================

one sig emf-publisher extends Mixin {} {
    term = "emf-publisher"
    scheme = "http://occiware.org/occi/monitoring/ext#"
    title = "display attributes values on sensor and activate values to display on designer"
    depends = monitoring/publisher
    no applies
    attributes = emf-publisher_cpu + emf-publisher_ram + emf-publisher_loadavg
    no actions
    entities in Emf-publisher
}

//
// OCCI attribute 'cpu'
//
one sig emf-publisher_cpu extends Attribute {} {
    name = "cpu"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'ram'
//
one sig emf-publisher_ram extends Attribute {} {
    name = "ram"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'loadavg'
//
one sig emf-publisher_loadavg extends Attribute {} {
    name = "loadavg"
    type = FloatType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Emf-publisher
// ======================================================================

sig Emf-publisher in core/Entity {
    cpu : lone FloatType,
    ram : lone FloatType,
    loadavg : lone FloatType,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/monitoring/ext#systemout-publisher'
//
// ======================================================================

one sig systemout-publisher extends Mixin {} {
    term = "systemout-publisher"
    scheme = "http://occiware.org/occi/monitoring/ext#"
    title = "If this mixin is set the metrics are displayed in system.out."
    depends = monitoring/publisher
    no applies
    no attributes
    no actions
    entities in Systemout-publisher
}

// ======================================================================
// Signature for Systemout-publisher
// ======================================================================

sig Systemout-publisher in core/Entity {
}

//
// OCCI data type FloatType
//
one sig FloatType_DataType extends DataType {} {
    name = "FloatType"
}

let FloatType=String

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

