SYNTAXDEF btt
FOR <http://org.be.textbe/textbttrace>
START TextBTTrace

OPTIONS{
	reloadGeneratorModel = "true";
}

TOKENS{
	
	DEFINE FILE $('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-'|'.')+$;
	DEFINE INTEGER $('0'..'9')+$;
	DEFINE COLORS 
	$(
		'orange'			| 'blanchedalmond'	| 'aliceblue'			| 'antiquewhite'		| 
		'aqua'				| 'aquamarine'		| 'azure'				| 'beige'				|
		'bisque'			| 'black'			| 'blue'				| 'blueviolet'			|
		'brown'				| 'burlywood'		| 'cadetblue'			| 'chartreuse'			|
		'chocolate'			| 'coral'			| 'cornflowerblue'		| 'cornsilk'			|
		'crimson'			| 'cyan'			| 'darkblue' 			| 'darkcyan'			|
		'darkgoldenrod'		| 'darkgray'		| 'darkgreen'			| 'darkgrey'			|
		'darkkhaki'			| 'darkmagenta'		| 'darkolivegreen'		| 'darkorange'			|
		'darkorchid'		| 'darkred'			| 'darksalmon'			| 'darkseagreen'		|
		'darkslateblue'		| 'darkslategray'	| 'darkslategrey'		| 'darkturquoise'		|
		'darkviolet'		| 'deeppink'		| 'deepskyblue'			| 'dimgray'				|
		'dimgrey'			| 'dodgerblue'		| 'firebrick'			| 'floralwhite'			|
		'forestgreen'		| 'fuchsia'			| 'gainsboro'			| 'ghostwhite'			|
		'gold'				| 'goldenrod'		| 'gray'				| 'green'				|
		'greenyellow'		| 'grey'			| 'honeydew'			| 'hotpink'				|
		'indianred'			| 'indigo'			| 'ivory'				| 'khaki'				|
		'lavender'			| 'lavenderblush'	| 'lawngreen'			| 'lemonchiffon'		|
		'lightblue'			| 'lightcoral'		| 'lightcyan'			| 'lightgoldenrodyellow'|
		'lightgray'			| 'lightgreen'		| 'lightgrey'			| 'lightpink'			|
		'lightsalmon'		| 'lightseagreen'	| 'lightskyblue'		| 'lightslategray'		|
		'lightslategrey'	| 'lightsteelblue'	| 'lightyellow'			| 'lime'				|
		'limegreen'			| 'linen'			| 'magenta'				| 'maroon'				|
		'mediumaquamarine'	| 'mediumblue'		| 'mediumorchid'		| 'mediumpurple'		|
		'mediumseagreen'	| 'mediumslateblue'	| 'mediumspringgreen'	| 'mediumturquoise'		|
		'mediumvioletred'	| 'midnightblue'	| 'mintcream'			| 'mistyrose'			|
		'moccasin'			| 'navajowhite'		| 'navy'				| 'oldlace'				|
		'olive'				| 'olivedrab'		| 'orangered'			| 'orchid'				|
		'palegoldenrod'		| 'palegreen'		| 'paleturquoise'		| 'palevioletred'		|
		'papayawhip'		| 'peachpuff'		| 'peru'				| 'pink'				|
		'plum'				| 'powderblue'		| 'purple'				| 'red'					|
		'rosybrown'			| 'royalblue'		| 'saddlebrown'			| 'salmon'				|
		'sandybrown'		| 'seagreen'		| 'seashell'			| 'sienna'				|
		'silver'			| 'skyblue'			| 'slateblue'			| 'slategray'			|
		'slategrey'			| 'snow'			| 'springgreen'			| 'steelblue'			|
		'tan'				| 'teal'			| 'thistle'				| 'tomato'				|
		'turquoise'			| 'violet'			| 'wheat'				| 'white'				|
		'whitesmoke'		| 'yellow'			| 'yellowgreen'
	)$;
	
}

TOKENSTYLES{
	"COLORS" COLOR #223DD8;
	"INTEGER" COLOR #61A527;
}

RULES {
	TextBTTrace ::= bt:BT delay:Delay? activate:Activate? interleave:Interleave? trace:Trace;
	BT ::= "BT" value[FILE];
	Delay ::= "DELAY" value[INTEGER];
	Activate ::= "ACTIVATE" color[COLORS];
	Interleave ::= "INTERLEAVE" color[COLORS];
	Trace ::= ("TRACE" (nodeGroup:NodeGroup)+)|("LOOP" (loopNodeGroup:NodeGroup)+)|("TRACE" (nodeGroup:NodeGroup)+ "LOOP" (loopNodeGroup:NodeGroup)+);
	NodeGroup ::= "[" activeNode:Node ("," interleaveNode:Node)* "]";
	Node ::= value[INTEGER];
}