SYNTAXDEF bt
FOR <http://org.be.textbe/textbt/v1> 
START Specification
 
OPTIONS {
        reloadGeneratorModel = "true";
        generateCodeFromGeneratorModel = "true";
        usePredefinedTokens = "true";
		disableTokenSorting = "false";

}

TOKENSTYLES { 
        "#RT" COLOR #da0000, BOLD; 
        "#T" COLOR #da0000, BOLD;
        "#C" COLOR #da0000, BOLD;
        "#SC" COLOR #da0000, BOLD;
        "#E" COLOR #da0000, BOLD;
        "#EI" COLOR #da0000, BOLD;
        "#EO" COLOR #da0000, BOLD;
        "#II" COLOR #da0000, BOLD;
        "#IO" COLOR #da0000, BOLD;
        "#S" COLOR #da0000, BOLD;
        "#AR" COLOR #da0000, BOLD;
        "#L" COLOR #da0000, BOLD;
        "#G" COLOR #da0000, BOLD;
        "#A" COLOR #da0000, BOLD;
        "#R" COLOR #da0000, BOLD;
        "#N" COLOR #da0000, BOLD;
        "#P" COLOR #da0000, BOLD;
        "{" COLOR #00da00, BOLD;
        "}" COLOR #00da00, BOLD;
        }

RULES {
Specification ::= "#RT"  #1 requirements+  #1 components+ ("#T"  #1 root)?;

Requirement ::= id[] #1 name[] ;

Component ::= "#C" #1 id[] #1 name[] !0 behavior*;
SystemComponent ::= "#SC" #1 id[] #1 name[] #1 behavior*;

Event ::= "#E" #1 number[] #1 name[] #1 relations*;
InternalInput ::= "#II"  #1 number[]  #1 name[]  #1 relations*;
ExternalInput ::= "#EI"  #1 number[]  #1 name[]  #1 relations*;
InternalOutput ::= "#IO"  #1 number[]  #1 name[]  #1 relations*;
ExternalOutput ::= "#EO"  #1 number[]  #1 name[]  #1 relations*;

StateRealization ::= "#S"  #1 number[]  #1 name[]  #1 ("[" qualifier[] "]")? relations* ;

AttributeRealization ::= "#AR"  #1 number[]  #1 name[]  #1 relations*;

Selection ::= "#L"  #1 number[]  #1 name[]  #1 relations*;
Guard ::= "#G"  #1 number[]  #1 name[]  #1 relations*;
Assertion ::= "#A"  #1 number[] #1 name[]  #1 relations*;

What ::= "#R" multiLevel["/" : ""] ("/")* "What" observation[] (observation[] | "/")*;
Who ::= "#R" multiLevel["/" : ""] ("/")* "Who" person[] (person[] | "/")*;
Why ::= "#R" multiLevel["/" : ""] ("/")* "Why" reason[] (reason[] | "/")*;
How ::= "#R" multiLevel["/" : ""] ("/")* "How" means[] (means[] | "/")*;
Where ::= "#R" multiLevel["/" : ""] ("/")* "Where" place[] (place[] | "/")*;
When ::= "#R" multiLevel["/" : ""] ("/")* "When" time[] (time[] | "/")*;

Atomic ::= "{" #1 steps (";;" steps)* #1 child: Interleaving, Alternative, Parallel? "}";
Interleaving ::= "{" #1 steps (";" steps)* #1 child: Sequence, Alternative, Parallel? "}";

Alternative ::= "#N" #1 "{" choices (choices)* "}";
Parallel ::= "#P" #1 "{" processes (processes)* "}";

Node ::= ("'" label[] "'")? showTag["show" : "hide"]? (traceability behavior[])|"_" operator[Normal:"", Reversion : "^", Synchronization : "=", Reference : "=>", BranchKill:"--",May:"%", StartNew:"^^", Xor:"XOR", Disjunction:"|", Conjunction : "&"]?;
TraceabilityLink ::= requirement[]* status[Original : "", Implied : "+", Missing : "-", Updated : "++", Deleted : "--", Refined : "+-"]? ;





 



}