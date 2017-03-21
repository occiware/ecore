// Generated at Mon Mar 13 17:16:45 CET 2017 from platform:/resource/org.occiware.clouddesigner.occi.monitoring.ext/model/monitoringext.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'monitoringext'
//
// ======================================================================

module monitoringext_behaviour

open util/boolean
open OCCI
open monitoringext

//
// Imported extensions
//
open core
open monitoring

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/monitoring/ext#sshcollector'
//
// ======================================================================

//
// Equivalence predicate between two Sshcollector atoms.
//
pred isoSshcollector[s1, s2: Sshcollector]
{
    // Comment following lines when this is not the expected behaviour.
    isoSshcollector[s1, s2] // same collector
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/monitoring/ext#centreoncollector'
//
// ======================================================================

//
// Equivalence predicate between two Centreoncollector atoms.
//
pred isoCentreoncollector[c1, c2: Centreoncollector]
{
    // Comment following lines when this is not the expected behaviour.
    isoCentreoncollector[c1, c2] // same collector
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/monitoring/ext#sensorext'
//
// ======================================================================

//
// Equivalence predicate between two Sensorext atoms.
//
pred isoSensorext[s1, s2: Sensorext]
{
    // Comment following lines when this is not the expected behaviour.
    isoSensorext[s1, s2] // same sensor
}


//
// OCCI Action 'http://occiware.org/occi/monitoring/ext/sensorext/action#startMonitoring'
//



//
// OCCI Action 'http://occiware.org/occi/monitoring/ext/sensorext/action#stopMonitoring'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/monitoring/ext#emf-publisher'
//
// ======================================================================

//
// Equivalence predicate between two Emf-publisher atoms.
//
pred isoEmf-publisher[e1, e2: Emf-publisher]
{
    // Comment following lines when this is not the expected behaviour.
    e1.cpu = e2.cpu // same cpu
    e1.ram = e2.ram // same ram
    e1.loadavg = e2.loadavg // same loadavg
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/monitoring/ext#systemout-publisher'
//
// ======================================================================

//
// Equivalence predicate between two Systemout-publisher atoms.
//
pred isoSystemout-publisher[s1, s2: Systemout-publisher]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

