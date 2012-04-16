SYNTAXDEF bt
FOR <http://org.be.textbe/textbt> 
START Specification
 
OPTIONS {
        reloadGeneratorModel = "true";
        generateCodeFromGeneratorModel = "true";
        usePredefinedTokens = "true";
		disableTokenSorting = "false";

}

TOKENS { 
    // token definitions go here in the form: 
    DEFINE CHAR $('a'..'z'|'A'..'Z')$;
}

RULES {
Specification ::= "#RT" requirements+ components+ ("#T" root)?;

Requirement ::= id[] name[] ;

Component ::= "#C" id[] name[] behavior*;
SystemComponent ::= "#SC" id[] name[] behavior*;

Event ::= "#E" number[] name[] relations*;
InternalInput ::= "#II" number[] name[] relations*;
ExternalInput ::= "#EI" number[] name[] relations*;
InternalOutput ::= "#IO" number[] name[] relations*;
ExternalOutput ::= "#EO" number[] name[] relations*;

StateRealization ::= "#S" number[] name[] ("[" qualifier[] "]")? relations* ;

AttributeRealization ::= "#AR" number[] name[] relations*;

Selection ::= "#L" number[] relations*;
Guard ::= "#G" number[] relations*;
Assertion ::= "#A" number[] relations*;

What ::= "#R" multiLevel["/" : ""] ("/")* "What" observation[] (observation[] | "/")*;
Who ::= "#R" multiLevel["/" : ""] ("/")* "Who" person[] (person[] | "/")*;
Why ::= "#R" multiLevel["/" : ""] ("/")* "Why" reason[] (reason[] | "/")*;
How ::= "#R" multiLevel["/" : ""] ("/")* "How" means[] (means[] | "/")*;
Where ::= "#R" multiLevel["/" : ""] ("/")* "Where" place[] (place[] | "/")*;
When ::= "#R" multiLevel["/" : ""] ("/")* "When" time[] (time[] | "/")*;

Interleaving ::= steps (";" steps)* child: Transaction, Alternative, Parallel? ;
Transaction ::= steps (";;" steps)* child: Interleaving, Alternative, Parallel? ;

Alternative ::= "#N" "{" "\n" choices "\n" (choices "\n")* "}" "\n";
Parallel ::= "#P" "{" "\n" processes "\n" (processes "\n")* "}" "\n";

Node ::= label[]? showTag["show" : "hide"]? traceability behavior[] operator[]?;
TraceabilityLink ::= requirement[]? status[Original : "", Implied : "+", Missing : "-", Updated : "++", Deleted : "--", Refined : "+-"]? ;





 



}