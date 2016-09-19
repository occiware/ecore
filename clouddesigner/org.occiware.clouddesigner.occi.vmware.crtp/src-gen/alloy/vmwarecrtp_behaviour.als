// Generated at Mon Sep 19 14:37:47 CEST 2016 from platform:/resource/org.occiware.clouddesigner.occi.vmware.crtp/model/vmwarecrtp.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'vmwarecrtp'
//
// ======================================================================

module vmwarecrtp_behaviour

open util/boolean
open OCCI
open vmwarecrtp

//
// Imported extensions
//
open core
open crtp
open infrastructure

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmwarecrtp#vmwarefolders'
//
// ======================================================================

//
// Equivalence predicate between two Vmwarefolders atoms.
//
pred isoVmwarefolders[v1, v2: Vmwarefolders]
{
    // Comment following lines when this is not the expected behaviour.
    v1.datacentername = v2.datacentername // same datacentername
    v1.datastorename = v2.datastorename // same datastorename
    v1.clustername = v2.clustername // same clustername
    v1.hostsystemname = v2.hostsystemname // same hostsystemname
    v1.inventorypath = v2.inventorypath // same inventorypath
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmwarecrtp#vmaddon'
//
// ======================================================================

//
// Equivalence predicate between two Vmaddon atoms.
//
pred isoVmaddon[v1, v2: Vmaddon]
{
    // Comment following lines when this is not the expected behaviour.
    v1.imagename = v2.imagename // same imagename
    v1.vcpu = v2.vcpu // same vcpu
    v1.gueststate = v2.gueststate // same gueststate
    v1.guestosid = v2.guestosid // same guestosid
    v1.markedastemplate = v2.markedastemplate // same markedastemplate
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmwarecrtp#windows'
//
// ======================================================================

//
// Equivalence predicate between two Windows atoms.
//
pred isoWindows[w1, w2: Windows]
{
    // Comment following lines when this is not the expected behaviour.
    w1.guestid = w2.guestid // same guestid
    w1.datastoreisopath = w2.datastoreisopath // same datastoreisopath
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmwarecrtp#linux'
//
// ======================================================================

//
// Equivalence predicate between two Linux atoms.
//
pred isoLinux[l1, l2: Linux]
{
    // Comment following lines when this is not the expected behaviour.
    l1.guestid = l2.guestid // same guestid
    l1.datastoreisopath = l2.datastoreisopath // same datastoreisopath
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmwarecrtp#macosx'
//
// ======================================================================

//
// Equivalence predicate between two Macosx atoms.
//
pred isoMacosx[m1, m2: Macosx]
{
    // Comment following lines when this is not the expected behaviour.
    m1.guestid = m2.guestid // same guestid
    m1.datastoreisopath = m2.datastoreisopath // same datastoreisopath
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmwarecrtp#vswitchinfos'
//
// ======================================================================

//
// Equivalence predicate between two Vswitchinfos atoms.
//
pred isoVswitchinfos[v1, v2: Vswitchinfos]
{
    // Comment following lines when this is not the expected behaviour.
    v1.nbport = v2.nbport // same nbport
}


// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

