// Generated at Wed Nov 09 13:07:01 CET 2016 from platform:/resource/org.occiware.clouddesigner.occi.infrastructure.crtp.backend/model/backend.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'backend'
//
// ======================================================================

module backend_behaviour

open util/boolean
open OCCI
open backend

//
// Imported extensions
//
open core
open crtp
open infrastructure

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#vmaddon'
//
// ======================================================================

//
// Equivalence predicate between two Vmaddon atoms.
//
pred isoVmaddon[v1, v2: Vmaddon]
{
    // Comment following lines when this is not the expected behaviour.
    v1.vcpu = v2.vcpu // same vcpu
    v1.gueststate = v2.gueststate // same gueststate
    v1.guestosid = v2.guestosid // same guestosid
    v1.markedastemplate = v2.markedastemplate // same markedastemplate
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#linux'
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
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#macosx'
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
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#vmwarefolders'
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
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#vswitchinfos'
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
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#windows'
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
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#vmimage'
//
// ======================================================================

//
// Equivalence predicate between two Vmimage atoms.
//
pred isoVmimage[v1, v2: Vmimage]
{
    // Comment following lines when this is not the expected behaviour.
    v1.imagename = v2.imagename // same imagename
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/infrastructure/crtp/backend#credential'
//
// ======================================================================

//
// Equivalence predicate between two Credential atoms.
//
pred isoCredential[c1, c2: Credential]
{
    // Comment following lines when this is not the expected behaviour.
    c1.user = c2.user // same user
    c1.password = c2.password // same password
}


// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

