// Author: tmyers
// Version: 0.1
// Created: 01.06.2010

SYNTAXDEF ct
FOR <http://org.be.textbe/textct>
START TextCT

OPTIONS {
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "false";
	overrideClasspath = "false";
	overrideManifest = "false";
	overrideProjectFile = "false";
}

TOKENS {
	DEFINE PERCENT $'%'$;
	DEFINE DOUBLEMINUS $'--'$;
	DEFINE EQUALS $'='$;
	DEFINE VALIDITY $'+'|'-'|'+-'|'++'$; // | DOUBLEMINUS
	DEFINE MCI $'\u007C\u007C'|'[]'|'%+'$; // | PERCENT
	DEFINE COMPONENT $'C'('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*$;
	DEFINE REQUIREMENT $'R'('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-'|'.')*$;
	DEFINE OPERATORWITHLABEL $('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*'.'('^'|'=>'|'--'|'='|'^^'|'%'|'&'|'\u007C'|'XOR')$;
	DEFINE STATE $('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')+'['('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')+']'$;
	DEFINE OPERATOR $('^'|'=>'|'^^'|'&'|'\u007C'|'XOR')$;//DOUBLEMINUS | PERCENT | EQUALS
	DEFINE QUALIFIER $('Who'|'What'|'Where'|'When'|'Why'|'How')$;
	DEFINE LEVEL $('/')+$;
	DEFINE COMPONENTNAME $('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*('#'|'*'|'+')('0'..'9')*$;
	DEFINE BEHAVIOR $(('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*('+'|'#'|'<'|'>'|'='|':'|'.'|'\u007C'|'('|')'|','|'/')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*)+$; // | COMPONENT | REQUIREMENT
}

RULES {
	TextCT ::= options? requirements? components? compositionTree;
	
	CompositionTree ::= "#T" rootNode:Node;  
	
	AggregatedNode ::= "<" componentRef[COMPONENT] (childNode:AbstractBlockOrNode+)?;
	
	AssociatedNode ::= ">" componentRef[COMPONENT] (childNode:AbstractBlockOrNode+)?;
	
	InheritedNode ::= "<=" componentRef[COMPONENT] (childNode:AbstractBlockOrNode+)?;
		
	AggregatedBlock ::= "<" "{" childNode:AbstractNode+ "}"; 
	
	AssociatedBlock ::= ">" "{" childNode:AbstractNode+ "}";
	
	InheritedBlock ::= "<=" "{" childNode:AbstractNode+ "}";  
	
	Node ::= componentRef[COMPONENT] (childNode:AbstractBlockOrNode+)?;
	// (requirementRef[REQUIREMENT]*)? (traceabilityStatus[VALIDITY]|traceabilityStatus[DOUBLEMINUS])? (((mci[MCI]|mci[PERCENT]) componentRef[COMPONENT] ":" componentSet[COMPONENT])|componentRef[COMPONENT]) ((operator[OPERATOR]|operator[OPERATORWITHLABEL]|operator[PERCENT]|operator[DOUBLEMINUS]|operator[EQUALS]|operator[BEHAVIOR])?) childNode:AbstractBlockOrNode?;
	
	OptionList ::= "#OPTIONS" options+;
	
	Option ::= name[TEXT] "=" value[TEXT];
		
	RequirementList ::= "#RT" requirements+; 
	
	Requirement ::= ref[REQUIREMENT] (val[BEHAVIOR]|val[REQUIREMENT]|val[TEXT]|val[COMPONENT]);
	
	ComponentList ::=("#C" components:Component)* ("#SC" components:SystemComponent)? ("#C" components:Component)* ;
 
	Component ::= ref[COMPONENT] (val[TEXT]|val[COMPONENT]|val[COMPONENTNAME]|val[REQUIREMENT]);// (("#S" behaviors:State+)| 
//												("#L" behaviors:Selection+)|
//												("#E" behaviors:Event+)|
//												("#G" behaviors:Guard+)|
//												("#II" behaviors:InternalInput+)|
//												("#IO" behaviors:InternalOutput+)|
//												("#EI" behaviors:ExternalInput+)|
//												("#EO" behaviors:ExternalOutput+)|
//												("#A" behaviors:Assertion+))*;
	
	SystemComponent ::= ref[COMPONENT] (val[TEXT]|val[COMPONENT]|val[COMPONENTNAME]|val[REQUIREMENT]);// (("#S" behaviors:State+) | 
//												("#L" behaviors:Selection+)|
//												("#E" behaviors:Event+)|
//												("#G" behaviors:Guard+)|
//												("#II" behaviors:InternalInput+)|
//												("#IO" behaviors:InternalOutput+)|
//												("#EI" behaviors:ExternalInput+)|
//												("#EO" behaviors:ExternalOutput+)|
//												("#A" behaviors:Assertion+))*;
	
//	State ::=  ref[] (val[TEXT]|val[REQUIREMENT]|val[COMPONENT]|val[STATE]|val[BEHAVIOR]) ("#R" relations:Relation+)*;
	
//	Selection ::= ref[] (val[TEXT]|val[REQUIREMENT]|val[COMPONENT]|val[STATE]|val[BEHAVIOR]) ("#R" relations:Relation+)*;
	
//	Event ::= ref[] (val[TEXT]|val[REQUIREMENT]|val[COMPONENT]|val[STATE]|val[BEHAVIOR]) ("#R" relations:Relation+)*;
	
//	Guard ::= ref[] (val[TEXT]|val[REQUIREMENT]|val[COMPONENT]|val[STATE]|val[BEHAVIOR]) ("#R" relations:Relation+)*;
	
//	InternalInput ::= ref[] (val[TEXT]|val[REQUIREMENT]|val[COMPONENT]|val[STATE]|val[BEHAVIOR]) ("#R" relations:Relation+)*;
	
//	InternalOutput ::= ref[] (val[TEXT]|val[REQUIREMENT]|val[COMPONENT]|val[STATE]|val[BEHAVIOR]) ("#R" relations:Relation+)*;
	
//	ExternalInput ::= ref[] (val[TEXT]|val[REQUIREMENT]|val[COMPONENT]|val[STATE]|val[BEHAVIOR]) ("#R" relations:Relation+)*;
	 
//	ExternalOutput ::= ref[] (val[TEXT]|val[REQUIREMENT]|val[COMPONENT]|val[STATE]|val[BEHAVIOR]) ("#R" relations:Relation+)*;
	
//	Assertion ::= ref[] (val[TEXT]|val[REQUIREMENT]|val[COMPONENT]|val[STATE]|val[BEHAVIOR]) ("#R" relations:Relation+)*;		
	
//	Relation ::= (level[LEVEL]? question[QUALIFIER] preposition[TEXT]? componentRef[COMPONENT] componentLevel[LEVEL]? behaviorRef[TEXT]?) |
//	                (level[LEVEL]? question[QUALIFIER] preposition[TEXT]? (mci[MCI]|mci[PERCENT]) componentRef[COMPONENT] ":" componentSet[COMPONENT] componentLevel[LEVEL]? behaviorRef[TEXT]?);
	
//	RelationalBehavior ::= (("#S" behavior:State)|
//							("#L" behavior:Selection)|
//							("#E" behavior:Event)|
//							("#G" behavior:Guard)|
//							("#II" behavior:InternalInput)|
//							("#IO" behavior:InternalOutput)|
//							("#EI" behavior:ExternalInput)|
//							("#EO" behavior:ExternalOutput)|
//							("#A" behavior:Assertion)) relations:Relation+;
}