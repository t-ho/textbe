SYNTAXDEF textbt
FOR <http://org.be.textbe/textbt/2.0.0> <textbt.genmodel>
START Specification

OPTIONS {
	reloadGeneratorModel = "true";
}

RULES {

	Specification ::= "Specification" name[] !0!0 "Types" componentTypes+ ("System" system[])? "Components" components+ "Requirements" requirements  "Behavior" root?;

	Component.ComponentType ::= !0 id[] name['"','"','\\'] ("{"behavior+"}")?;
	Component.Component ::= id[] name['"','"','\\'] type[];

	Traceability.Requirement ::= id[] name['"','"','\\'] ;
	Traceability.TraceabilityLink ::= requirement[]* status[]? updatedInVersion[]?;

	Component.Event.ExternalInput ::= id[] "External" "Input" definition ;
	Component.Event.ExternalOutput ::= id[] "External" "Output" definition ;
	Component.Event.InternalInput ::= id[] "Internal" "Input" definition ;
	Component.Event.InternalOutput ::= id[] "Internal" "Input" definition ;

	Component.Event.TextualEventDefinition ::= expression['"','"','\\'];

	Component.State.Guard ::= id[] "Guard" definition;
	Component.State.Selection ::= id[] "Selection" definition;
	Component.State.StateRealization ::= id[] "Realization" definition;

	Component.State.TextualStateDefinition ::= expression['"','"','\\'];

	Activity.Sequence.AtomicSequence ::= quantifier? "{" step+ child? "}";
	Activity.Sequence.InterleavingSequence ::= quantifier? "|" step+ child? "|";

	Branch.ForkBranch ::= "Process" "Fork" "{" processes processes+ "}";
	Branch.RandomChoiceBranch ::= "Random" "Selection" "{" choices choices+ "}";

	Node.Quantifying.ForAll ::= label[]? traceability  "For" "all" variable set "=" definition;
	Node.Quantifying.AtLeastOne ::= label[]? traceability "For" "at" "least" "one" variable set "=" definition;
	Node.Quantifying.ForOneArbitrary ::= label[]? traceability "For" "one" "arbitrary" variable set "=" definition;
	Node.Quantifying.ForSome ::= label[]? traceability "For" "some" "arbitrary" variable set "=" definition;

	Node.Quantifying.TextualComponentSetDefinition ::= expression['"','"','\\'];

	Node.BehaviorNode ::= label[]? traceability operation? behavior[] ;
	Node.LabelOnlyNode ::= label[]? traceability operation?;

	Node.Operation.BranchKill ::= "stop" stop[];
	Node.Operation.May ::= "may" "happen";
	Node.Operation.Reference ::= "continue" "like" continueLike[];
	Node.Operation.Reversion ::= "revert" "to" revertTo[];
	Node.Operation.StartNew ::= "start" "new" startNew[];
	Node.Operation.Synchronisation::= "wait" "for" waitFor[];

	Activity.SystemStateGuard.Conjunction ::= "AND" componentSelection[]+ child?;
	Activity.SystemStateGuard.Disjunction ::="OR" componentSelection[]+ child?;
	Activity.SystemStateGuard.MutualExclusion ::="XOR" componentSelection[]+ child?;

}
