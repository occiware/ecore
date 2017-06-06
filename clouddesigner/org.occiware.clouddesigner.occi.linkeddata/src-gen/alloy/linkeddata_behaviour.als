// Generated at Sat Sep 24 13:41:01 CEST 2016 from platform:/resource/org.occiware.clouddesigner.occi.linkeddata/model/linkeddata.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'linkeddata'
//
// ======================================================================

module linkeddata_behaviour

open util/boolean
open OCCI
open linkeddata

//
// Imported extensions
//
open core
open infrastructure
open platform

// ======================================================================
//
// OCCI kind 'http://occiware.org/linkeddata#ldproject'
//
// ======================================================================

//
// Equivalence predicate between two Ldproject atoms.
//
pred isoLdproject[l1, l2: Ldproject]
{
    // Comment following lines when this is not the expected behaviour.
    isoLdproject[l1, l2] // same resource
}


//
// OCCI Action 'http://occiware.org/linkeddata/ldproject/action#publish'
//



//
// OCCI Action 'http://occiware.org/linkeddata/ldproject/action#unpublish'
//



//
// OCCI Action 'http://occiware.org/linkeddata/ldproject/action#update'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/linkeddata#lddatabaselink'
//
// ======================================================================

//
// Equivalence predicate between two Lddatabaselink atoms.
//
pred isoLddatabaselink[l1, l2: Lddatabaselink]
{
    // Comment following lines when this is not the expected behaviour.
    isoLddatabaselink[l1, l2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/linkeddata#ldprojectlink'
//
// ======================================================================

//
// Equivalence predicate between two Ldprojectlink atoms.
//
pred isoLdprojectlink[l1, l2: Ldprojectlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoLdprojectlink[l1, l2] // same link
}



// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

