// Author: tmyers
// Version: 0.1
// Created: 01.09.2010

SYNTAXDEF st
FOR <http://org.be.textbe/textst>
START TextST

OPTIONS {
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "true";
	 
	usePredefinedTokens = "false";
	overrideBuilder = "false";
} 

TOKENS{
	DEFINE FRAGMENT PERCENT $'%'$;
	DEFINE FRAGMENT ASTERIX $'*'$;
	DEFINE FRAGMENT PLUS $'+'$;
	DEFINE FRAGMENT PERIOD $'.'$;
	DEFINE FRAGMENT DOUBLEMINUS $'--'$;
	DEFINE FRAGMENT SLASH $'/'$;
	DEFINE FRAGMENT HASH $'#'$;
	DEFINE FRAGMENT DOLLAR $'\u0024'$;
	DEFINE FRAGMENT EXCLAMATION $'\u0021'$;
	DEFINE FRAGMENT ROUNDBRACKET $'('|')'$;
	DEFINE FRAGMENT NEGATED $'\u007E'$;
	DEFINE OPERATOR $('^'|'=>'|'^^')$;
	DEFINE VALIDITY $'+'|'-'|'+-'|'++'|$ + DOUBLEMINUS;
	DEFINE QUALIFIER $'?'|$ + EXCLAMATION + $|$ + NEGATED;
	DEFINE MCI $'\u007C\u007C'|'[]'|'%+'|$ + PERCENT; // | PERCENT
	DEFINE COMPONENT $'C'('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*$;
	DEFINE REQUIREMENT $'R'('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-'|'.')*$;
	DEFINE NUMBER $('0'..'9')+$;
	DEFINE UPPERBOUND $($ + NUMBER + $|$ + ASTERIX + $)+$;
	DEFINE TEXT2 $($ + DOLLAR +$)?(('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-')+ ($ + HASH + $|$ + PLUS + $|$ + PERIOD + $|$ + SLASH + $|$ + ROUNDBRACKET + $)* )+$;
	DEFINE LINEBREAK $('\r\n'|'\r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}

RULES {
	TextST ::= options? requirements? components? structureTree;
	
	StructureTree ::= "#ST" rootNode:Node;
	
	ParallelBlock ::= "#P{" ("#" childNode:AbstractNode)+ "}";
	
	AlternativeBlock ::= "#N{" ("#" childNode:AbstractNode)+ "}";	
	
	RelatedToNode ::= ">" (requirementRef[REQUIREMENT]*)? traceabilityStatus[VALIDITY]? ((componentRef[COMPONENT] (behaviorRef[TEXT2]|behaviorRef[NUMBER]|behaviorRef[COMPONENT]|behaviorRef[REQUIREMENT])? (qualifier[QUALIFIER]|(qualifier[QUALIFIER] secondQualifier[QUALIFIER]))? )|
							(mci[MCI] componentRef[COMPONENT] ":" componentSet[COMPONENT] (behaviorRef[TEXT2]|behaviorRef[NUMBER]|behaviorRef[COMPONENT]|behaviorRef[REQUIREMENT])? (qualifier[QUALIFIER]|(qualifier[QUALIFIER] secondQualifier[QUALIFIER]))?)| "_") operator[OPERATOR]? childNode:AbstractBlockOrNode?; 
	
	DefinedByNode ::= "<" (requirementRef[REQUIREMENT]*)? traceabilityStatus[VALIDITY]? ((componentRef[COMPONENT] (behaviorRef[TEXT2]|behaviorRef[NUMBER]|behaviorRef[COMPONENT]|behaviorRef[REQUIREMENT])? (qualifier[QUALIFIER]|(qualifier[QUALIFIER] secondQualifier[QUALIFIER]))? )|
							(mci[MCI] componentRef[COMPONENT] ":" componentSet[COMPONENT] (behaviorRef[TEXT2]|behaviorRef[NUMBER]|behaviorRef[COMPONENT]|behaviorRef[REQUIREMENT])? (qualifier[QUALIFIER]|(qualifier[QUALIFIER] secondQualifier[QUALIFIER]))?)| "_") operator[OPERATOR]? childNode:AbstractBlockOrNode?;
	
	Node ::= (requirementRef[REQUIREMENT]*)? traceabilityStatus[VALIDITY]? ((componentRef[COMPONENT] (behaviorRef[TEXT2]|behaviorRef[NUMBER]|behaviorRef[COMPONENT]|behaviorRef[REQUIREMENT])? (qualifier[QUALIFIER]|(qualifier[QUALIFIER] secondQualifier[QUALIFIER]))? )|
							(mci[MCI] componentRef[COMPONENT] ":" componentSet[COMPONENT] (behaviorRef[TEXT2]|behaviorRef[NUMBER]|behaviorRef[COMPONENT]|behaviorRef[REQUIREMENT])? (qualifier[QUALIFIER]|(qualifier[QUALIFIER] secondQualifier[QUALIFIER]))?)| "_") operator[OPERATOR]? childNode:AbstractBlockOrNode?;
	
	OptionList ::= "#OPTIONS" options+;
	
	Option ::= name[TEXT2] "=" value[TEXT2];
	
	RequirementList ::= "#RT" requirements+;
	
	Requirement ::= ref[REQUIREMENT] (val[TEXT2]|val[NUMBER]|val[COMPONENT]|val[REQUIREMENT]);
	
	ComponentList ::=("#C" components:Component)* ("#SC" components:SystemComponent)? ("#C" components:Component)* ;
	
	Component ::= ref[COMPONENT] (val[REQUIREMENT]|val[COMPONENT]|val[TEXT2]) ("#SR" behaviors:SecondaryRelation+)*;
	
	SystemComponent ::= ref[COMPONENT] (val[REQUIREMENT]|val[COMPONENT]|val[TEXT2]) ("#SR" behaviors:SecondaryRelation+)*;
	
	SecondaryRelation ::= (behaviorRef[NUMBER] ("." (attribute[TEXT2]|attribute[NUMBER]|attribute[COMPONENT]|attribute[REQUIREMENT]))? (primaryLowerBound[NUMBER]|(primaryLowerBound[NUMBER] (primaryUpperBound[UPPERBOUND]|primaryUpperBound[NUMBER])))? componentRef[COMPONENT] ("." (componentAttribute[TEXT2]|componentAttribute[NUMBER]|componentAttribute[COMPONENT]|componentAttribute[REQUIREMENT]))? (secondaryLowerBound[NUMBER]|(secondaryLowerBound[NUMBER] (secondaryUpperBound[UPPERBOUND]|secondaryUpperBound[NUMBER])))? (relationName[TEXT2]|relationName[COMPONENT]|relationName[REQUIREMENT])?);
}