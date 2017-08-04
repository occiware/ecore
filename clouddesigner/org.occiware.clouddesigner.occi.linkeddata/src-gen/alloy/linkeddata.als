// Generated at Fri Aug 04 14:54:16 CEST 2017 from platform:/resource/org.occiware.clouddesigner.occi.linkeddata/model/linkeddata.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Static Semantics for OCCI Extension 'linkeddata'
//
// ======================================================================

module linkeddata

open util/boolean
open OCCI

// ======================================================================
//
// Imported extensions
//
// ======================================================================

open core
open infrastructure
open platform

// ======================================================================
//
// OCCI extension 'linkeddata'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "linkeddata"
    scheme = "http://occiware.org/linkeddata#"
    import = core/extension + infrastructure/extension + platform/extension
    kinds = ldproject + lddatabaselink + ldprojectlink + ldnode
    no mixins
    types = Lifecycle_DataType + Robustness_DataType
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/linkeddata#ldproject'
//
// ======================================================================

one sig ldproject extends Kind {} {
    term = "ldproject"
    scheme = "http://occiware.org/linkeddata#"
    title = "LDProject"
    parent = core/resource
    attributes = ldproject_occi_ld_project_name + ldproject_occi_ld_project_lifecycle + ldproject_occi_ld_project_robustness
    actions = ldproject_publish + ldproject_unpublish + ldproject_update
    entities in Ldproject
}

//
// OCCI attribute 'occi.ld.project.name'
//
one sig ldproject_occi_ld_project_name extends Attribute {} {
    name = "occi.ld.project.name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'occi.ld.project.lifecycle'
//
one sig ldproject_occi_ld_project_lifecycle extends Attribute {} {
    name = "occi.ld.project.lifecycle"
    type = Lifecycle_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'occi.ld.project.robustness'
//
one sig ldproject_occi_ld_project_robustness extends Attribute {} {
    name = "occi.ld.project.robustness"
    type = Robustness_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/linkeddata/ldproject/action#publish'
//
one sig ldproject_publish extends Action {} {
    term = "publish"
    scheme = "http://occiware.org/linkeddata/ldproject/action#"
    no title
    no attributes
}


//
// OCCI action 'http://occiware.org/linkeddata/ldproject/action#unpublish'
//
one sig ldproject_unpublish extends Action {} {
    term = "unpublish"
    scheme = "http://occiware.org/linkeddata/ldproject/action#"
    no title
    no attributes
}


//
// OCCI action 'http://occiware.org/linkeddata/ldproject/action#update'
//
one sig ldproject_update extends Action {} {
    term = "update"
    scheme = "http://occiware.org/linkeddata/ldproject/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Ldproject
// ======================================================================

sig Ldproject extends core/Resource {
    occi_ld_project_name : one String,
    occi_ld_project_lifecycle : lone Lifecycle,
    occi_ld_project_robustness : lone Robustness,
} {
    hasKind[ldproject]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/linkeddata#lddatabaselink'
//
// ======================================================================

one sig lddatabaselink extends Kind {} {
    term = "lddatabaselink"
    scheme = "http://occiware.org/linkeddata#"
    title = "LDDatabaseLink"
    parent = core/link
    attributes = lddatabaselink_occi_ld_dblink_database + lddatabaselink_occi_ld_dblink_port
    no actions
    entities in Lddatabaselink
}

//
// OCCI attribute 'occi.ld.dblink.database'
//
one sig lddatabaselink_occi_ld_dblink_database extends Attribute {} {
    name = "occi.ld.dblink.database"
    type = core/String_DataType
    mutable = True
    required = True
    default = "datacore"
    no description
    multiple_values = False
}

//
// OCCI attribute 'occi.ld.dblink.port'
//
one sig lddatabaselink_occi_ld_dblink_port extends Attribute {} {
    name = "occi.ld.dblink.port"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "27017"
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Lddatabaselink
// ======================================================================

sig Lddatabaselink extends core/Link {
    occi_ld_dblink_database : one String,
    occi_ld_dblink_port : lone core/Number,
} {
    hasKind[lddatabaselink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/linkeddata#ldprojectlink'
//
// ======================================================================

one sig ldprojectlink extends Kind {} {
    term = "ldprojectlink"
    scheme = "http://occiware.org/linkeddata#"
    no title
    parent = core/link
    no attributes
    no actions
    entities in Ldprojectlink
}

// ======================================================================
// Signature for Ldprojectlink
// ======================================================================

sig Ldprojectlink extends core/Link {
} {
    hasKind[ldprojectlink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/linkeddata#ldnode'
//
// ======================================================================

one sig ldnode extends Kind {} {
    term = "ldnode"
    scheme = "http://occiware.org/linkeddata#"
    title = "LDNode"
    parent = core/resource
    attributes = ldnode_occi_ld_node_name + ldnode_occi_ld_node_mongoHosts + ldnode_occi_ld_node_mainProject + ldnode_occi_ld_node_analyticsReadPreference
    no actions
    entities in Ldnode
}

//
// OCCI attribute 'occi.ld.node.name'
//
one sig ldnode_occi_ld_node_name extends Attribute {} {
    name = "occi.ld.node.name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'occi.ld.node.mongoHosts'
//
one sig ldnode_occi_ld_node_mongoHosts extends Attribute {} {
    name = "occi.ld.node.mongoHosts"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'occi.ld.node.mainProject'
//
one sig ldnode_occi_ld_node_mainProject extends Attribute {} {
    name = "occi.ld.node.mainProject"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'occi.ld.node.analyticsReadPreference'
//
one sig ldnode_occi_ld_node_analyticsReadPreference extends Attribute {} {
    name = "occi.ld.node.analyticsReadPreference"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Ldnode
// ======================================================================

sig Ldnode extends core/Resource {
    occi_ld_node_name : one String,
    occi_ld_node_mongoHosts : one String,
    occi_ld_node_mainProject : one String,
    occi_ld_node_analyticsReadPreference : one String,
} {
    hasKind[ldnode]
}

//
// OCCI data type Lifecycle
//
one sig Lifecycle_DataType extends DataType {} {
    name = "Lifecycle"
}

abstract sig Lifecycle extends EnumBase {}
one sig Lifecycle_draft, Lifecycle_published extends Lifecycle {}

//
// OCCI data type Robustness
//
one sig Robustness_DataType extends DataType {} {
    name = "Robustness"
}

abstract sig Robustness extends EnumBase {}
one sig Robustness_cluster, Robustness_node, Robustness_none extends Robustness {}

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

