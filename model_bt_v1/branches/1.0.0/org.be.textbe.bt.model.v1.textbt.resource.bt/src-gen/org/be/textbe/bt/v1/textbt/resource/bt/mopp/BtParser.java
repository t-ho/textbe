// $ANTLR ${project.version} ${buildNumber}

	package org.be.textbe.bt.v1.textbt.resource.bt.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class BtParser extends BtANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "WHITESPACE", "LINEBREAK", "'#RT'", "'#T'", "'#C'", "'#SC'", "'#E'", "'#II'", "'#EI'", "'#IO'", "'#EO'", "'#S'", "'['", "']'", "'#AR'", "'#L'", "'#G'", "'#A'", "'#R'", "'/'", "'What'", "'Who'", "'Why'", "'How'", "'Where'", "'When'", "'{'", "';;'", "'}'", "';'", "'#N'", "'#P'", "'\\''", "'show'", "'hide'", "'_'", "'^'", "'='", "'=>'", "'--'", "'\\u0025'", "'^^'", "'XOR'", "'|'", "'&'", "'+'", "'-'", "'++'", "'+-'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int TEXT=4;
    public static final int WHITESPACE=5;
    public static final int LINEBREAK=6;

    // delegates
    // delegators


        public BtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[125+1];
             
             
        }
        

    public String[] getTokenNames() { return BtParser.tokenNames; }
    public String getGrammarFileName() { return "Bt.g"; }


    	private org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolverFactory tokenResolverFactory = new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal> expectedElements = new java.util.ArrayList<org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.be.textbe.bt.v1.textbt.resource.bt.IBtCommand<org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource>() {
    			public boolean execute(org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.be.textbe.bt.v1.textbt.resource.bt.IBtProblem() {
    					public org.be.textbe.bt.v1.textbt.resource.bt.BtEProblemSeverity getSeverity() {
    						return org.be.textbe.bt.v1.textbt.resource.bt.BtEProblemSeverity.ERROR;
    					}
    					public org.be.textbe.bt.v1.textbt.resource.bt.BtEProblemType getType() {
    						return org.be.textbe.bt.v1.textbt.resource.bt.BtEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.be.textbe.bt.v1.textbt.resource.bt.IBtQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal expectedElement = new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal(terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new org.be.textbe.bt.v1.textbt.resource.bt.IBtCommand<org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource>() {
    			public boolean execute(org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource resource) {
    				org.be.textbe.bt.v1.textbt.resource.bt.IBtLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_3_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new org.be.textbe.bt.v1.textbt.resource.bt.IBtCommand<org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource>() {
    			public boolean execute(org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource resource) {
    				org.be.textbe.bt.v1.textbt.resource.bt.IBtLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<org.be.textbe.bt.v1.textbt.resource.bt.IBtCommand<org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new org.be.textbe.bt.v1.textbt.resource.bt.IBtCommand<org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource>() {
    			public boolean execute(org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource resource) {
    				org.be.textbe.bt.v1.textbt.resource.bt.IBtLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public org.be.textbe.bt.v1.textbt.resource.bt.IBtTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new BtParser(new org.antlr.runtime3_3_0.CommonTokenStream(new BtLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new BtParser(new org.antlr.runtime3_3_0.CommonTokenStream(new BtLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public BtParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((BtLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((BtLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Specification.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Specification();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Requirement.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Requirement();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Component.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Component();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.SystemComponent.class) {
    				return parse_org_be_textbe_bt_v1_textbt_SystemComponent();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Event.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Event();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.InternalInput.class) {
    				return parse_org_be_textbe_bt_v1_textbt_InternalInput();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.ExternalInput.class) {
    				return parse_org_be_textbe_bt_v1_textbt_ExternalInput();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.InternalOutput.class) {
    				return parse_org_be_textbe_bt_v1_textbt_InternalOutput();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.ExternalOutput.class) {
    				return parse_org_be_textbe_bt_v1_textbt_ExternalOutput();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.StateRealization.class) {
    				return parse_org_be_textbe_bt_v1_textbt_StateRealization();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.AttributeRealization.class) {
    				return parse_org_be_textbe_bt_v1_textbt_AttributeRealization();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Selection.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Selection();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Guard.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Guard();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Assertion.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Assertion();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.What.class) {
    				return parse_org_be_textbe_bt_v1_textbt_What();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Who.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Who();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Why.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Why();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.How.class) {
    				return parse_org_be_textbe_bt_v1_textbt_How();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Where.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Where();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.When.class) {
    				return parse_org_be_textbe_bt_v1_textbt_When();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Atomic.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Atomic();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Interleaving.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Interleaving();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Alternative.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Alternative();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Parallel.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Parallel();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.Node.class) {
    				return parse_org_be_textbe_bt_v1_textbt_Node();
    			}
    			if (type.getInstanceClass() == org.be.textbe.bt.v1.textbt.TraceabilityLink.class) {
    				return parse_org_be_textbe_bt_v1_textbt_TraceabilityLink();
    			}
    		}
    		throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_3_0.IntStream arg0, org.antlr.runtime3_3_0.RecognitionException arg1, int arg2, org.antlr.runtime3_3_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.be.textbe.bt.v1.textbt.resource.bt.IBtOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.be.textbe.bt.v1.textbt.resource.bt.IBtParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.be.textbe.bt.v1.textbt.resource.bt.IBtCommand<org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource>>();
    		org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtParseResult parseResult = new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_3_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_3_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
    		org.be.textbe.bt.v1.textbt.resource.bt.IBtParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_3_0.Lexer lexer = (org.antlr.runtime3_3_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (org.be.textbe.bt.v1.textbt.resource.bt.IBtCommand<org.be.textbe.bt.v1.textbt.resource.bt.IBtTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal>();
    		java.util.List<org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal> newFollowSet = new java.util.ArrayList<org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 153;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_3_0.CommonToken nextToken = (org.antlr.runtime3_3_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.be.textbe.bt.v1.textbt.resource.bt.util.BtPair<org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.be.textbe.bt.v1.textbt.resource.bt.util.BtPair<org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement newFollower = newFollowerPair.getLeft();
    							org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal newFollowTerminal = new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_3_0.CommonToken tokenAtIndex = (org.antlr.runtime3_3_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_3_0.IntStream input, int ttype, org.antlr.runtime3_3_0.BitSet follow) throws org.antlr.runtime3_3_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_3_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_3_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_3_0.CommonToken) {
    			final org.antlr.runtime3_3_0.CommonToken ct = (org.antlr.runtime3_3_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			org.antlr.runtime3_3_0.EarlyExitException eee = (org.antlr.runtime3_3_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedRangeException) {
    			org.antlr.runtime3_3_0.MismatchedRangeException mre = (org.antlr.runtime3_3_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	protected void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			this.incompleteObjects.pop();
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	



    // $ANTLR start "start"
    // Bt.g:538:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_be_textbe_bt_v1_textbt_Specification ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        org.be.textbe.bt.v1.textbt.Specification c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Bt.g:539:1: ( (c0= parse_org_be_textbe_bt_v1_textbt_Specification ) EOF )
            // Bt.g:540:2: (c0= parse_org_be_textbe_bt_v1_textbt_Specification ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_0, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Bt.g:545:2: (c0= parse_org_be_textbe_bt_v1_textbt_Specification )
            // Bt.g:546:3: c0= parse_org_be_textbe_bt_v1_textbt_Specification
            {
            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Specification_in_start82);
            c0=parse_org_be_textbe_bt_v1_textbt_Specification();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		retrieveLayoutInformation(element, null, null, false);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Specification"
    // Bt.g:554:1: parse_org_be_textbe_bt_v1_textbt_Specification returns [org.be.textbe.bt.v1.textbt.Specification element = null] : a0= '#RT' ( (a1_0= parse_org_be_textbe_bt_v1_textbt_Requirement ) )+ ( (a2_0= parse_org_be_textbe_bt_v1_textbt_Component ) )+ ( (a3= '#T' (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence ) ) )? ;
    public final org.be.textbe.bt.v1.textbt.Specification parse_org_be_textbe_bt_v1_textbt_Specification() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Specification element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Specification_StartIndex = input.index();
        Token a0=null;
        Token a3=null;
        org.be.textbe.bt.v1.textbt.Requirement a1_0 = null;

        org.be.textbe.bt.v1.textbt.Component a2_0 = null;

        org.be.textbe.bt.v1.textbt.Sequence a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Bt.g:557:1: (a0= '#RT' ( (a1_0= parse_org_be_textbe_bt_v1_textbt_Requirement ) )+ ( (a2_0= parse_org_be_textbe_bt_v1_textbt_Component ) )+ ( (a3= '#T' (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence ) ) )? )
            // Bt.g:558:2: a0= '#RT' ( (a1_0= parse_org_be_textbe_bt_v1_textbt_Requirement ) )+ ( (a2_0= parse_org_be_textbe_bt_v1_textbt_Component ) )+ ( (a3= '#T' (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence ) ) )?
            {
            a0=(Token)match(input,7,FOLLOW_7_in_parse_org_be_textbe_bt_v1_textbt_Specification115); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSpecification();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_0_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_1, 1, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_0);
              	
            }
            // Bt.g:572:2: ( (a1_0= parse_org_be_textbe_bt_v1_textbt_Requirement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TEXT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Bt.g:573:3: (a1_0= parse_org_be_textbe_bt_v1_textbt_Requirement )
            	    {
            	    // Bt.g:573:3: (a1_0= parse_org_be_textbe_bt_v1_textbt_Requirement )
            	    // Bt.g:574:4: a1_0= parse_org_be_textbe_bt_v1_textbt_Requirement
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Requirement_in_parse_org_be_textbe_bt_v1_textbt_Specification138);
            	    a1_0=parse_org_be_textbe_bt_v1_textbt_Requirement();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSpecification();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a1_0 != null) {
            	      					if (a1_0 != null) {
            	      						Object value = a1_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.SPECIFICATION__REQUIREMENTS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_0_0_0_2, a1_0, true);
            	      					copyLocalizationInfos(a1_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_1, 2, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 2, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 2, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              	
            }
            // Bt.g:602:2: ( (a2_0= parse_org_be_textbe_bt_v1_textbt_Component ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=9 && LA2_0<=10)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Bt.g:603:3: (a2_0= parse_org_be_textbe_bt_v1_textbt_Component )
            	    {
            	    // Bt.g:603:3: (a2_0= parse_org_be_textbe_bt_v1_textbt_Component )
            	    // Bt.g:604:4: a2_0= parse_org_be_textbe_bt_v1_textbt_Component
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Component_in_parse_org_be_textbe_bt_v1_textbt_Specification173);
            	    a2_0=parse_org_be_textbe_bt_v1_textbt_Component();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSpecification();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a2_0 != null) {
            	      					if (a2_0 != null) {
            	      						Object value = a2_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.SPECIFICATION__COMPONENTS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_0_0_0_4, a2_0, true);
            	      					copyLocalizationInfos(a2_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 3, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 3, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 3);
              	
            }
            // Bt.g:632:2: ( (a3= '#T' (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==8) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Bt.g:633:3: (a3= '#T' (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence ) )
                    {
                    // Bt.g:633:3: (a3= '#T' (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence ) )
                    // Bt.g:634:4: a3= '#T' (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence )
                    {
                    a3=(Token)match(input,8,FOLLOW_8_in_parse_org_be_textbe_bt_v1_textbt_Specification208); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSpecification();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_0_0_0_5_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 4, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 4, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_2);
                      			
                    }
                    // Bt.g:649:4: (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence )
                    // Bt.g:650:5: a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Sequence_in_parse_org_be_textbe_bt_v1_textbt_Specification234);
                    a4_0=parse_org_be_textbe_bt_v1_textbt_Sequence();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSpecification();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4_0 != null) {
                      						if (a4_0 != null) {
                      							Object value = a4_0;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SPECIFICATION__ROOT), value);
                      							completedElement(value, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_0_0_0_5_0_0_2, a4_0, true);
                      						copyLocalizationInfos(a4_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_be_textbe_bt_v1_textbt_Specification_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Specification"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Requirement"
    // Bt.g:682:1: parse_org_be_textbe_bt_v1_textbt_Requirement returns [org.be.textbe.bt.v1.textbt.Requirement element = null] : (a0= TEXT ) (a1= TEXT ) ;
    public final org.be.textbe.bt.v1.textbt.Requirement parse_org_be_textbe_bt_v1_textbt_Requirement() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Requirement element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Requirement_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Bt.g:685:1: ( (a0= TEXT ) (a1= TEXT ) )
            // Bt.g:686:2: (a0= TEXT ) (a1= TEXT )
            {
            // Bt.g:686:2: (a0= TEXT )
            // Bt.g:687:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Requirement294); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createRequirement();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__ID), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__ID), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_1_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_7, 7);
              	
            }
            // Bt.g:722:2: (a1= TEXT )
            // Bt.g:723:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Requirement319); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createRequirement();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.REQUIREMENT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_1_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_1, 8, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 8, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 8, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_be_textbe_bt_v1_textbt_Requirement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Requirement"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Component"
    // Bt.g:762:1: parse_org_be_textbe_bt_v1_textbt_Component returns [org.be.textbe.bt.v1.textbt.Component element = null] : (a0= '#C' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior ) )* | c0= parse_org_be_textbe_bt_v1_textbt_SystemComponent );
    public final org.be.textbe.bt.v1.textbt.Component parse_org_be_textbe_bt_v1_textbt_Component() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Component element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Component_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Behavior a3_0 = null;

        org.be.textbe.bt.v1.textbt.SystemComponent c0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Bt.g:765:1: (a0= '#C' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior ) )* | c0= parse_org_be_textbe_bt_v1_textbt_SystemComponent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==9) ) {
                alt5=1;
            }
            else if ( (LA5_0==10) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Bt.g:766:2: a0= '#C' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior ) )*
                    {
                    a0=(Token)match(input,9,FOLLOW_9_in_parse_org_be_textbe_bt_v1_textbt_Component355); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createComponent();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_2_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_8, 9);
                      	
                    }
                    // Bt.g:780:2: (a1= TEXT )
                    // Bt.g:781:3: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Component373); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createComponent();
                      				incompleteObjects.push(element);
                      			}
                      			if (a1 != null) {
                      				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      				tokenResolver.setOptions(getOptions());
                      				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__ID), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String) resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__ID), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_2_0_0_2, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_9, 10);
                      	
                    }
                    // Bt.g:816:2: (a2= TEXT )
                    // Bt.g:817:3: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Component398); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createComponent();
                      				incompleteObjects.push(element);
                      			}
                      			if (a2 != null) {
                      				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      				tokenResolver.setOptions(getOptions());
                      				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__NAME), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String) resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__NAME), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_2_0_0_4, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 11, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 11);
                      	
                    }
                    // Bt.g:864:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=11 && LA4_0<=16)||(LA4_0>=19 && LA4_0<=22)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Bt.g:865:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior )
                    	    {
                    	    // Bt.g:865:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior )
                    	    // Bt.g:866:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior
                    	    {
                    	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Behavior_in_parse_org_be_textbe_bt_v1_textbt_Component428);
                    	    a3_0=parse_org_be_textbe_bt_v1_textbt_Behavior();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      				if (terminateParsing) {
                    	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                    	      				}
                    	      				if (element == null) {
                    	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createComponent();
                    	      					incompleteObjects.push(element);
                    	      				}
                    	      				if (a3_0 != null) {
                    	      					if (a3_0 != null) {
                    	      						Object value = a3_0;
                    	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.COMPONENT__BEHAVIOR, value);
                    	      						completedElement(value, true);
                    	      					}
                    	      					collectHiddenTokens(element);
                    	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_2_0_0_6, a3_0, true);
                    	      					copyLocalizationInfos(a3_0, element);
                    	      				}
                    	      			
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 12, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 12);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Bt.g:906:2: c0= parse_org_be_textbe_bt_v1_textbt_SystemComponent
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_SystemComponent_in_parse_org_be_textbe_bt_v1_textbt_Component459);
                    c0=parse_org_be_textbe_bt_v1_textbt_SystemComponent();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_be_textbe_bt_v1_textbt_Component_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Component"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_SystemComponent"
    // Bt.g:910:1: parse_org_be_textbe_bt_v1_textbt_SystemComponent returns [org.be.textbe.bt.v1.textbt.SystemComponent element = null] : a0= '#SC' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior ) )* ;
    public final org.be.textbe.bt.v1.textbt.SystemComponent parse_org_be_textbe_bt_v1_textbt_SystemComponent() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.SystemComponent element =  null;
        int parse_org_be_textbe_bt_v1_textbt_SystemComponent_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Behavior a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Bt.g:913:1: (a0= '#SC' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior ) )* )
            // Bt.g:914:2: a0= '#SC' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior ) )*
            {
            a0=(Token)match(input,10,FOLLOW_10_in_parse_org_be_textbe_bt_v1_textbt_SystemComponent484); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSystemComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_3_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_20, 13);
              	
            }
            // Bt.g:928:2: (a1= TEXT )
            // Bt.g:929:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_SystemComponent502); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSystemComponent();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__ID), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__ID), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_3_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_21, 14);
              	
            }
            // Bt.g:964:2: (a2= TEXT )
            // Bt.g:965:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_SystemComponent527); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSystemComponent();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_3_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 15, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 15);
              	
            }
            // Bt.g:1012:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=16)||(LA6_0>=19 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Bt.g:1013:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior )
            	    {
            	    // Bt.g:1013:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior )
            	    // Bt.g:1014:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Behavior
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Behavior_in_parse_org_be_textbe_bt_v1_textbt_SystemComponent557);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Behavior();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSystemComponent();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						Object value = a3_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.SYSTEM_COMPONENT__BEHAVIOR, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_3_0_0_6, a3_0, true);
            	      					copyLocalizationInfos(a3_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 16, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 16);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_be_textbe_bt_v1_textbt_SystemComponent_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_SystemComponent"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Event"
    // Bt.g:1054:1: parse_org_be_textbe_bt_v1_textbt_Event returns [org.be.textbe.bt.v1.textbt.Event element = null] : (a0= '#E' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* | c0= parse_org_be_textbe_bt_v1_textbt_InternalInput | c1= parse_org_be_textbe_bt_v1_textbt_ExternalInput | c2= parse_org_be_textbe_bt_v1_textbt_InternalOutput | c3= parse_org_be_textbe_bt_v1_textbt_ExternalOutput );
    public final org.be.textbe.bt.v1.textbt.Event parse_org_be_textbe_bt_v1_textbt_Event() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Event element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Event_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Relation a3_0 = null;

        org.be.textbe.bt.v1.textbt.InternalInput c0 = null;

        org.be.textbe.bt.v1.textbt.ExternalInput c1 = null;

        org.be.textbe.bt.v1.textbt.InternalOutput c2 = null;

        org.be.textbe.bt.v1.textbt.ExternalOutput c3 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Bt.g:1057:1: (a0= '#E' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* | c0= parse_org_be_textbe_bt_v1_textbt_InternalInput | c1= parse_org_be_textbe_bt_v1_textbt_ExternalInput | c2= parse_org_be_textbe_bt_v1_textbt_InternalOutput | c3= parse_org_be_textbe_bt_v1_textbt_ExternalOutput )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // Bt.g:1058:2: a0= '#E' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
                    {
                    a0=(Token)match(input,11,FOLLOW_11_in_parse_org_be_textbe_bt_v1_textbt_Event598); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createEvent();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_4_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_22, 17);
                      	
                    }
                    // Bt.g:1072:2: (a1= TEXT )
                    // Bt.g:1073:3: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Event616); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createEvent();
                      				incompleteObjects.push(element);
                      			}
                      			if (a1 != null) {
                      				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      				tokenResolver.setOptions(getOptions());
                      				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NUMBER), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      				}
                      				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NUMBER), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_4_0_0_2, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_23, 18);
                      	
                    }
                    // Bt.g:1108:2: (a2= TEXT )
                    // Bt.g:1109:3: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Event641); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createEvent();
                      				incompleteObjects.push(element);
                      			}
                      			if (a2 != null) {
                      				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      				tokenResolver.setOptions(getOptions());
                      				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NAME), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String) resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__NAME), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_4_0_0_4, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 19, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 19);
                      	
                    }
                    // Bt.g:1162:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==23) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Bt.g:1163:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
                    	    {
                    	    // Bt.g:1163:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
                    	    // Bt.g:1164:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Relation
                    	    {
                    	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_Event671);
                    	    a3_0=parse_org_be_textbe_bt_v1_textbt_Relation();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      				if (terminateParsing) {
                    	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                    	      				}
                    	      				if (element == null) {
                    	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createEvent();
                    	      					incompleteObjects.push(element);
                    	      				}
                    	      				if (a3_0 != null) {
                    	      					if (a3_0 != null) {
                    	      						Object value = a3_0;
                    	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.EVENT__RELATIONS, value);
                    	      						completedElement(value, true);
                    	      					}
                    	      					collectHiddenTokens(element);
                    	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_4_0_0_6, a3_0, true);
                    	      					copyLocalizationInfos(a3_0, element);
                    	      				}
                    	      			
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 20, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 20);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Bt.g:1210:2: c0= parse_org_be_textbe_bt_v1_textbt_InternalInput
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalInput_in_parse_org_be_textbe_bt_v1_textbt_Event702);
                    c0=parse_org_be_textbe_bt_v1_textbt_InternalInput();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Bt.g:1211:4: c1= parse_org_be_textbe_bt_v1_textbt_ExternalInput
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalInput_in_parse_org_be_textbe_bt_v1_textbt_Event712);
                    c1=parse_org_be_textbe_bt_v1_textbt_ExternalInput();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Bt.g:1212:4: c2= parse_org_be_textbe_bt_v1_textbt_InternalOutput
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalOutput_in_parse_org_be_textbe_bt_v1_textbt_Event722);
                    c2=parse_org_be_textbe_bt_v1_textbt_InternalOutput();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Bt.g:1213:4: c3= parse_org_be_textbe_bt_v1_textbt_ExternalOutput
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalOutput_in_parse_org_be_textbe_bt_v1_textbt_Event732);
                    c3=parse_org_be_textbe_bt_v1_textbt_ExternalOutput();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_be_textbe_bt_v1_textbt_Event_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Event"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_InternalInput"
    // Bt.g:1217:1: parse_org_be_textbe_bt_v1_textbt_InternalInput returns [org.be.textbe.bt.v1.textbt.InternalInput element = null] : a0= '#II' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* ;
    public final org.be.textbe.bt.v1.textbt.InternalInput parse_org_be_textbe_bt_v1_textbt_InternalInput() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.InternalInput element =  null;
        int parse_org_be_textbe_bt_v1_textbt_InternalInput_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Relation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Bt.g:1220:1: (a0= '#II' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* )
            // Bt.g:1221:2: a0= '#II' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_org_be_textbe_bt_v1_textbt_InternalInput757); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalInput();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_5_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_30, 21);
              	
            }
            // Bt.g:1235:2: (a1= TEXT )
            // Bt.g:1236:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_InternalInput775); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalInput();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NUMBER), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NUMBER), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_5_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_31, 22);
              	
            }
            // Bt.g:1271:2: (a2= TEXT )
            // Bt.g:1272:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_InternalInput800); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalInput();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_5_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 23, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 23);
              	
            }
            // Bt.g:1325:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Bt.g:1326:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    {
            	    // Bt.g:1326:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    // Bt.g:1327:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_InternalInput830);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalInput();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						Object value = a3_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_INPUT__RELATIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_5_0_0_6, a3_0, true);
            	      					copyLocalizationInfos(a3_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 24, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 24);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_be_textbe_bt_v1_textbt_InternalInput_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_InternalInput"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_ExternalInput"
    // Bt.g:1373:1: parse_org_be_textbe_bt_v1_textbt_ExternalInput returns [org.be.textbe.bt.v1.textbt.ExternalInput element = null] : a0= '#EI' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* ;
    public final org.be.textbe.bt.v1.textbt.ExternalInput parse_org_be_textbe_bt_v1_textbt_ExternalInput() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.ExternalInput element =  null;
        int parse_org_be_textbe_bt_v1_textbt_ExternalInput_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Relation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Bt.g:1376:1: (a0= '#EI' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* )
            // Bt.g:1377:2: a0= '#EI' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_org_be_textbe_bt_v1_textbt_ExternalInput871); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalInput();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_6_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_32, 25);
              	
            }
            // Bt.g:1391:2: (a1= TEXT )
            // Bt.g:1392:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_ExternalInput889); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalInput();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NUMBER), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NUMBER), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_6_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_33, 26);
              	
            }
            // Bt.g:1427:2: (a2= TEXT )
            // Bt.g:1428:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_ExternalInput914); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalInput();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_6_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 27, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 27);
              	
            }
            // Bt.g:1481:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Bt.g:1482:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    {
            	    // Bt.g:1482:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    // Bt.g:1483:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_ExternalInput944);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalInput();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						Object value = a3_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_INPUT__RELATIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_6_0_0_6, a3_0, true);
            	      					copyLocalizationInfos(a3_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 28, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 28);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_be_textbe_bt_v1_textbt_ExternalInput_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_ExternalInput"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_InternalOutput"
    // Bt.g:1529:1: parse_org_be_textbe_bt_v1_textbt_InternalOutput returns [org.be.textbe.bt.v1.textbt.InternalOutput element = null] : a0= '#IO' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* ;
    public final org.be.textbe.bt.v1.textbt.InternalOutput parse_org_be_textbe_bt_v1_textbt_InternalOutput() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.InternalOutput element =  null;
        int parse_org_be_textbe_bt_v1_textbt_InternalOutput_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Relation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Bt.g:1532:1: (a0= '#IO' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* )
            // Bt.g:1533:2: a0= '#IO' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_org_be_textbe_bt_v1_textbt_InternalOutput985); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalOutput();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_7_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_34, 29);
              	
            }
            // Bt.g:1547:2: (a1= TEXT )
            // Bt.g:1548:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_InternalOutput1003); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalOutput();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NUMBER), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NUMBER), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_7_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_35, 30);
              	
            }
            // Bt.g:1583:2: (a2= TEXT )
            // Bt.g:1584:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_InternalOutput1028); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalOutput();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_7_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 31, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 31);
              	
            }
            // Bt.g:1637:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Bt.g:1638:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    {
            	    // Bt.g:1638:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    // Bt.g:1639:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_InternalOutput1058);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalOutput();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						Object value = a3_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.INTERNAL_OUTPUT__RELATIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_7_0_0_6, a3_0, true);
            	      					copyLocalizationInfos(a3_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 32, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 32);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_be_textbe_bt_v1_textbt_InternalOutput_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_InternalOutput"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_ExternalOutput"
    // Bt.g:1685:1: parse_org_be_textbe_bt_v1_textbt_ExternalOutput returns [org.be.textbe.bt.v1.textbt.ExternalOutput element = null] : a0= '#EO' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* ;
    public final org.be.textbe.bt.v1.textbt.ExternalOutput parse_org_be_textbe_bt_v1_textbt_ExternalOutput() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.ExternalOutput element =  null;
        int parse_org_be_textbe_bt_v1_textbt_ExternalOutput_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Relation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Bt.g:1688:1: (a0= '#EO' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* )
            // Bt.g:1689:2: a0= '#EO' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_org_be_textbe_bt_v1_textbt_ExternalOutput1099); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalOutput();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_8_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_36, 33);
              	
            }
            // Bt.g:1703:2: (a1= TEXT )
            // Bt.g:1704:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_ExternalOutput1117); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalOutput();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NUMBER), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NUMBER), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_8_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_37, 34);
              	
            }
            // Bt.g:1739:2: (a2= TEXT )
            // Bt.g:1740:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_ExternalOutput1142); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalOutput();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_8_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 35, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 35);
              	
            }
            // Bt.g:1793:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Bt.g:1794:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    {
            	    // Bt.g:1794:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    // Bt.g:1795:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_ExternalOutput1172);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalOutput();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						Object value = a3_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.EXTERNAL_OUTPUT__RELATIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_8_0_0_6, a3_0, true);
            	      					copyLocalizationInfos(a3_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 36, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 36);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_be_textbe_bt_v1_textbt_ExternalOutput_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_ExternalOutput"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_StateRealization"
    // Bt.g:1841:1: parse_org_be_textbe_bt_v1_textbt_StateRealization returns [org.be.textbe.bt.v1.textbt.StateRealization element = null] : a0= '#S' (a1= TEXT ) (a2= TEXT ) ( (a3= '[' (a4= TEXT ) a5= ']' ) )? ( (a6_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* ;
    public final org.be.textbe.bt.v1.textbt.StateRealization parse_org_be_textbe_bt_v1_textbt_StateRealization() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.StateRealization element =  null;
        int parse_org_be_textbe_bt_v1_textbt_StateRealization_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        org.be.textbe.bt.v1.textbt.Relation a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Bt.g:1844:1: (a0= '#S' (a1= TEXT ) (a2= TEXT ) ( (a3= '[' (a4= TEXT ) a5= ']' ) )? ( (a6_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* )
            // Bt.g:1845:2: a0= '#S' (a1= TEXT ) (a2= TEXT ) ( (a3= '[' (a4= TEXT ) a5= ']' ) )? ( (a6_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1213); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_38, 37);
              	
            }
            // Bt.g:1859:2: (a1= TEXT )
            // Bt.g:1860:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1231); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NUMBER), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NUMBER), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_39, 38);
              	
            }
            // Bt.g:1895:2: (a2= TEXT )
            // Bt.g:1896:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1256); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_40, 39);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 39, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 39);
              	
            }
            // Bt.g:1950:2: ( (a3= '[' (a4= TEXT ) a5= ']' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Bt.g:1951:3: (a3= '[' (a4= TEXT ) a5= ']' )
                    {
                    // Bt.g:1951:3: (a3= '[' (a4= TEXT ) a5= ']' )
                    // Bt.g:1952:4: a3= '[' (a4= TEXT ) a5= ']'
                    {
                    a3=(Token)match(input,17,FOLLOW_17_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1286); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_6_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_41, 40);
                      			
                    }
                    // Bt.g:1966:4: (a4= TEXT )
                    // Bt.g:1967:5: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1312); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4 != null) {
                      						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__QUALIFIER), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__QUALIFIER), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_6_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_42, 41);
                      			
                    }
                    a5=(Token)match(input,18,FOLLOW_18_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1345); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_6_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 42, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 42);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 43, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 43);
              	
            }
            // Bt.g:2059:2: ( (a6_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Bt.g:2060:3: (a6_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    {
            	    // Bt.g:2060:3: (a6_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    // Bt.g:2061:4: a6_0= parse_org_be_textbe_bt_v1_textbt_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1387);
            	    a6_0=parse_org_be_textbe_bt_v1_textbt_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a6_0 != null) {
            	      					if (a6_0 != null) {
            	      						Object value = a6_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.STATE_REALIZATION__RELATIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_7, a6_0, true);
            	      					copyLocalizationInfos(a6_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 44, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 44);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_be_textbe_bt_v1_textbt_StateRealization_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_StateRealization"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_AttributeRealization"
    // Bt.g:2107:1: parse_org_be_textbe_bt_v1_textbt_AttributeRealization returns [org.be.textbe.bt.v1.textbt.AttributeRealization element = null] : a0= '#AR' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* ;
    public final org.be.textbe.bt.v1.textbt.AttributeRealization parse_org_be_textbe_bt_v1_textbt_AttributeRealization() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.AttributeRealization element =  null;
        int parse_org_be_textbe_bt_v1_textbt_AttributeRealization_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Relation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Bt.g:2110:1: (a0= '#AR' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* )
            // Bt.g:2111:2: a0= '#AR' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_org_be_textbe_bt_v1_textbt_AttributeRealization1428); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAttributeRealization();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_10_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_43, 45);
              	
            }
            // Bt.g:2125:2: (a1= TEXT )
            // Bt.g:2126:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_AttributeRealization1446); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAttributeRealization();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NUMBER), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NUMBER), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_10_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_44, 46);
              	
            }
            // Bt.g:2161:2: (a2= TEXT )
            // Bt.g:2162:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_AttributeRealization1471); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAttributeRealization();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_10_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 47, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 47);
              	
            }
            // Bt.g:2215:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Bt.g:2216:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    {
            	    // Bt.g:2216:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    // Bt.g:2217:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_AttributeRealization1501);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAttributeRealization();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						Object value = a3_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.ATTRIBUTE_REALIZATION__RELATIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_10_0_0_6, a3_0, true);
            	      					copyLocalizationInfos(a3_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 48, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 48);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_be_textbe_bt_v1_textbt_AttributeRealization_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_AttributeRealization"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Selection"
    // Bt.g:2263:1: parse_org_be_textbe_bt_v1_textbt_Selection returns [org.be.textbe.bt.v1.textbt.Selection element = null] : a0= '#L' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* ;
    public final org.be.textbe.bt.v1.textbt.Selection parse_org_be_textbe_bt_v1_textbt_Selection() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Selection element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Selection_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Relation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Bt.g:2266:1: (a0= '#L' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* )
            // Bt.g:2267:2: a0= '#L' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_org_be_textbe_bt_v1_textbt_Selection1542); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSelection();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_11_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_45, 49);
              	
            }
            // Bt.g:2281:2: (a1= TEXT )
            // Bt.g:2282:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Selection1560); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSelection();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NUMBER), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NUMBER), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_11_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_46, 50);
              	
            }
            // Bt.g:2317:2: (a2= TEXT )
            // Bt.g:2318:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Selection1585); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSelection();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_11_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 51, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 51);
              	
            }
            // Bt.g:2371:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Bt.g:2372:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    {
            	    // Bt.g:2372:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    // Bt.g:2373:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_Selection1615);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSelection();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						Object value = a3_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.SELECTION__RELATIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_11_0_0_6, a3_0, true);
            	      					copyLocalizationInfos(a3_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 52, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 52);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_be_textbe_bt_v1_textbt_Selection_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Selection"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Guard"
    // Bt.g:2419:1: parse_org_be_textbe_bt_v1_textbt_Guard returns [org.be.textbe.bt.v1.textbt.Guard element = null] : a0= '#G' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* ;
    public final org.be.textbe.bt.v1.textbt.Guard parse_org_be_textbe_bt_v1_textbt_Guard() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Guard element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Guard_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Relation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Bt.g:2422:1: (a0= '#G' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* )
            // Bt.g:2423:2: a0= '#G' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_be_textbe_bt_v1_textbt_Guard1656); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createGuard();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_12_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_47, 53);
              	
            }
            // Bt.g:2437:2: (a1= TEXT )
            // Bt.g:2438:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Guard1674); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createGuard();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NUMBER), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NUMBER), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_12_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_48, 54);
              	
            }
            // Bt.g:2473:2: (a2= TEXT )
            // Bt.g:2474:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Guard1699); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createGuard();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_12_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 55, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 55);
              	
            }
            // Bt.g:2527:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Bt.g:2528:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    {
            	    // Bt.g:2528:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    // Bt.g:2529:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_Guard1729);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createGuard();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						Object value = a3_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.GUARD__RELATIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_12_0_0_6, a3_0, true);
            	      					copyLocalizationInfos(a3_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 56, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 56);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_be_textbe_bt_v1_textbt_Guard_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Guard"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Assertion"
    // Bt.g:2575:1: parse_org_be_textbe_bt_v1_textbt_Assertion returns [org.be.textbe.bt.v1.textbt.Assertion element = null] : a0= '#A' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* ;
    public final org.be.textbe.bt.v1.textbt.Assertion parse_org_be_textbe_bt_v1_textbt_Assertion() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Assertion element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Assertion_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.be.textbe.bt.v1.textbt.Relation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Bt.g:2578:1: (a0= '#A' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )* )
            // Bt.g:2579:2: a0= '#A' (a1= TEXT ) (a2= TEXT ) ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_be_textbe_bt_v1_textbt_Assertion1770); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAssertion();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_13_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_49, 57);
              	
            }
            // Bt.g:2593:2: (a1= TEXT )
            // Bt.g:2594:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Assertion1788); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAssertion();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NUMBER), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NUMBER), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_13_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_50, 58);
              	
            }
            // Bt.g:2629:2: (a2= TEXT )
            // Bt.g:2630:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Assertion1813); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAssertion();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_13_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 59, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 59);
              	
            }
            // Bt.g:2683:2: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Bt.g:2684:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    {
            	    // Bt.g:2684:3: (a3_0= parse_org_be_textbe_bt_v1_textbt_Relation )
            	    // Bt.g:2685:4: a3_0= parse_org_be_textbe_bt_v1_textbt_Relation
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_Assertion1843);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAssertion();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						Object value = a3_0;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.ASSERTION__RELATIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_13_0_0_6, a3_0, true);
            	      					copyLocalizationInfos(a3_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 60, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 60);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_be_textbe_bt_v1_textbt_Assertion_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Assertion"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_What"
    // Bt.g:2731:1: parse_org_be_textbe_bt_v1_textbt_What returns [org.be.textbe.bt.v1.textbt.What element = null] : a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'What' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* ;
    public final org.be.textbe.bt.v1.textbt.What parse_org_be_textbe_bt_v1_textbt_What() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.What element =  null;
        int parse_org_be_textbe_bt_v1_textbt_What_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // Bt.g:2734:1: (a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'What' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* )
            // Bt.g:2735:2: a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'What' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )*
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_What1884); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhat();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_14_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_51, 61);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_52, 61);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_53, 61);
              	
            }
            // Bt.g:2756:2: ( (a1= '/' )? )
            // Bt.g:2757:3: (a1= '/' )?
            {
            // Bt.g:2757:3: (a1= '/' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred22_Bt()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // Bt.g:2758:4: a1= '/'
                    {
                    a1=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_What1907); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhat();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_14_0_0_1, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_52, 62);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_53, 62);
              	
            }
            // Bt.g:2783:2: ( (a4= '/' ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Bt.g:2784:3: (a4= '/' )
            	    {
            	    // Bt.g:2784:3: (a4= '/' )
            	    // Bt.g:2785:4: a4= '/'
            	    {
            	    a4=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_What1937); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhat();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_14_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_52, 63);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_53, 63);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_52, 64);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_53, 64);
              	
            }
            a5=(Token)match(input,25,FOLLOW_25_in_parse_org_be_textbe_bt_v1_textbt_What1970); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhat();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_14_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_54, 65);
              	
            }
            // Bt.g:2832:2: (a6= TEXT )
            // Bt.g:2833:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_What1988); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhat();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL), value);
              				}
              			}
              			if (a6 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__OBSERVATION), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__OBSERVATION, value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_14_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_55, 66);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_56, 66);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 66, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 66);
              	
            }
            // Bt.g:2893:2: ( ( (a7= TEXT ) | a8= '/' ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==TEXT||LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Bt.g:2894:3: ( (a7= TEXT ) | a8= '/' )
            	    {
            	    // Bt.g:2894:3: ( (a7= TEXT ) | a8= '/' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==TEXT) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==24) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // Bt.g:2895:4: (a7= TEXT )
            	            {
            	            // Bt.g:2895:4: (a7= TEXT )
            	            // Bt.g:2896:5: a7= TEXT
            	            {
            	            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_What2024); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhat();
            	              						incompleteObjects.push(element);
            	              						// initialize boolean attribute
            	              						{
            	              							Object value = false;
            	              							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL), value);
            	              						}
            	              					}
            	              					if (a7 != null) {
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	              						tokenResolver.setOptions(getOptions());
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
            	              						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__OBSERVATION), result);
            	              						Object resolvedObject = result.getResolvedToken();
            	              						if (resolvedObject == null) {
            	              							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
            	              						}
            	              						java.lang.String resolved = (java.lang.String) resolvedObject;
            	              						if (resolved != null) {
            	              							Object value = resolved;
            	              							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__OBSERVATION, value);
            	              							completedElement(value, false);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_14_0_0_5_0_0_0, resolved, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_55, 67);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_56, 67);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 67, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 67);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Bt.g:2957:8: a8= '/'
            	            {
            	            a8=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_What2065); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              				if (element == null) {
            	              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhat();
            	              					incompleteObjects.push(element);
            	              					// initialize boolean attribute
            	              					{
            	              						Object value = false;
            	              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHAT__MULTI_LEVEL), value);
            	              					}
            	              				}
            	              				collectHiddenTokens(element);
            	              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_14_0_0_5_0_1_0, null, true);
            	              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_55, 68);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_56, 68);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 68, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 68);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_55, 69);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_56, 69);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 69, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 69);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_org_be_textbe_bt_v1_textbt_What_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_What"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Who"
    // Bt.g:3025:1: parse_org_be_textbe_bt_v1_textbt_Who returns [org.be.textbe.bt.v1.textbt.Who element = null] : a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'Who' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* ;
    public final org.be.textbe.bt.v1.textbt.Who parse_org_be_textbe_bt_v1_textbt_Who() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Who element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Who_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // Bt.g:3028:1: (a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'Who' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* )
            // Bt.g:3029:2: a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'Who' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )*
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_Who2113); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWho();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_15_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_57, 70);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_58, 70);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_59, 70);
              	
            }
            // Bt.g:3050:2: ( (a1= '/' )? )
            // Bt.g:3051:3: (a1= '/' )?
            {
            // Bt.g:3051:3: (a1= '/' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred26_Bt()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // Bt.g:3052:4: a1= '/'
                    {
                    a1=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Who2136); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWho();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_15_0_0_1, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_58, 71);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_59, 71);
              	
            }
            // Bt.g:3077:2: ( (a4= '/' ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Bt.g:3078:3: (a4= '/' )
            	    {
            	    // Bt.g:3078:3: (a4= '/' )
            	    // Bt.g:3079:4: a4= '/'
            	    {
            	    a4=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Who2166); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWho();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_15_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_58, 72);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_59, 72);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_58, 73);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_59, 73);
              	
            }
            a5=(Token)match(input,26,FOLLOW_26_in_parse_org_be_textbe_bt_v1_textbt_Who2199); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWho();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_15_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_60, 74);
              	
            }
            // Bt.g:3126:2: (a6= TEXT )
            // Bt.g:3127:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Who2217); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWho();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL), value);
              				}
              			}
              			if (a6 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__PERSON), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__PERSON, value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_15_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_61, 75);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_62, 75);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 75, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 75);
              	
            }
            // Bt.g:3187:2: ( ( (a7= TEXT ) | a8= '/' ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==TEXT||LA26_0==24) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Bt.g:3188:3: ( (a7= TEXT ) | a8= '/' )
            	    {
            	    // Bt.g:3188:3: ( (a7= TEXT ) | a8= '/' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==TEXT) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==24) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // Bt.g:3189:4: (a7= TEXT )
            	            {
            	            // Bt.g:3189:4: (a7= TEXT )
            	            // Bt.g:3190:5: a7= TEXT
            	            {
            	            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Who2253); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWho();
            	              						incompleteObjects.push(element);
            	              						// initialize boolean attribute
            	              						{
            	              							Object value = false;
            	              							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL), value);
            	              						}
            	              					}
            	              					if (a7 != null) {
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	              						tokenResolver.setOptions(getOptions());
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
            	              						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__PERSON), result);
            	              						Object resolvedObject = result.getResolvedToken();
            	              						if (resolvedObject == null) {
            	              							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
            	              						}
            	              						java.lang.String resolved = (java.lang.String) resolvedObject;
            	              						if (resolved != null) {
            	              							Object value = resolved;
            	              							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__PERSON, value);
            	              							completedElement(value, false);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_15_0_0_5_0_0_0, resolved, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_61, 76);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_62, 76);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 76, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 76);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Bt.g:3251:8: a8= '/'
            	            {
            	            a8=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Who2294); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              				if (element == null) {
            	              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWho();
            	              					incompleteObjects.push(element);
            	              					// initialize boolean attribute
            	              					{
            	              						Object value = false;
            	              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHO__MULTI_LEVEL), value);
            	              					}
            	              				}
            	              				collectHiddenTokens(element);
            	              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_15_0_0_5_0_1_0, null, true);
            	              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_61, 77);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_62, 77);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 77, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 77);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_61, 78);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_62, 78);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 78, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 78);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_org_be_textbe_bt_v1_textbt_Who_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Who"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Why"
    // Bt.g:3319:1: parse_org_be_textbe_bt_v1_textbt_Why returns [org.be.textbe.bt.v1.textbt.Why element = null] : a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'Why' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* ;
    public final org.be.textbe.bt.v1.textbt.Why parse_org_be_textbe_bt_v1_textbt_Why() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Why element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Why_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // Bt.g:3322:1: (a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'Why' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* )
            // Bt.g:3323:2: a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'Why' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )*
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_Why2342); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhy();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_16_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_63, 79);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_64, 79);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_65, 79);
              	
            }
            // Bt.g:3344:2: ( (a1= '/' )? )
            // Bt.g:3345:3: (a1= '/' )?
            {
            // Bt.g:3345:3: (a1= '/' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred30_Bt()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // Bt.g:3346:4: a1= '/'
                    {
                    a1=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Why2365); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhy();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_16_0_0_1, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_64, 80);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_65, 80);
              	
            }
            // Bt.g:3371:2: ( (a4= '/' ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Bt.g:3372:3: (a4= '/' )
            	    {
            	    // Bt.g:3372:3: (a4= '/' )
            	    // Bt.g:3373:4: a4= '/'
            	    {
            	    a4=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Why2395); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhy();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_16_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_64, 81);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_65, 81);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_64, 82);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_65, 82);
              	
            }
            a5=(Token)match(input,27,FOLLOW_27_in_parse_org_be_textbe_bt_v1_textbt_Why2428); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhy();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_16_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_66, 83);
              	
            }
            // Bt.g:3420:2: (a6= TEXT )
            // Bt.g:3421:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Why2446); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhy();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL), value);
              				}
              			}
              			if (a6 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__REASON), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__REASON, value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_16_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_67, 84);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_68, 84);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 84, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 84);
              	
            }
            // Bt.g:3481:2: ( ( (a7= TEXT ) | a8= '/' ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==TEXT||LA30_0==24) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Bt.g:3482:3: ( (a7= TEXT ) | a8= '/' )
            	    {
            	    // Bt.g:3482:3: ( (a7= TEXT ) | a8= '/' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==TEXT) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==24) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // Bt.g:3483:4: (a7= TEXT )
            	            {
            	            // Bt.g:3483:4: (a7= TEXT )
            	            // Bt.g:3484:5: a7= TEXT
            	            {
            	            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Why2482); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhy();
            	              						incompleteObjects.push(element);
            	              						// initialize boolean attribute
            	              						{
            	              							Object value = false;
            	              							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL), value);
            	              						}
            	              					}
            	              					if (a7 != null) {
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	              						tokenResolver.setOptions(getOptions());
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
            	              						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__REASON), result);
            	              						Object resolvedObject = result.getResolvedToken();
            	              						if (resolvedObject == null) {
            	              							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
            	              						}
            	              						java.lang.String resolved = (java.lang.String) resolvedObject;
            	              						if (resolved != null) {
            	              							Object value = resolved;
            	              							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__REASON, value);
            	              							completedElement(value, false);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_16_0_0_5_0_0_0, resolved, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_67, 85);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_68, 85);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 85, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 85);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Bt.g:3545:8: a8= '/'
            	            {
            	            a8=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Why2523); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              				if (element == null) {
            	              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhy();
            	              					incompleteObjects.push(element);
            	              					// initialize boolean attribute
            	              					{
            	              						Object value = false;
            	              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHY__MULTI_LEVEL), value);
            	              					}
            	              				}
            	              				collectHiddenTokens(element);
            	              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_16_0_0_5_0_1_0, null, true);
            	              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_67, 86);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_68, 86);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 86, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 86);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_67, 87);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_68, 87);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 87, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 87);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_org_be_textbe_bt_v1_textbt_Why_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Why"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_How"
    // Bt.g:3613:1: parse_org_be_textbe_bt_v1_textbt_How returns [org.be.textbe.bt.v1.textbt.How element = null] : a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'How' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* ;
    public final org.be.textbe.bt.v1.textbt.How parse_org_be_textbe_bt_v1_textbt_How() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.How element =  null;
        int parse_org_be_textbe_bt_v1_textbt_How_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // Bt.g:3616:1: (a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'How' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* )
            // Bt.g:3617:2: a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'How' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )*
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_How2571); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createHow();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_17_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_69, 88);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_70, 88);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_71, 88);
              	
            }
            // Bt.g:3638:2: ( (a1= '/' )? )
            // Bt.g:3639:3: (a1= '/' )?
            {
            // Bt.g:3639:3: (a1= '/' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred34_Bt()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // Bt.g:3640:4: a1= '/'
                    {
                    a1=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_How2594); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createHow();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_17_0_0_1, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_70, 89);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_71, 89);
              	
            }
            // Bt.g:3665:2: ( (a4= '/' ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==24) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Bt.g:3666:3: (a4= '/' )
            	    {
            	    // Bt.g:3666:3: (a4= '/' )
            	    // Bt.g:3667:4: a4= '/'
            	    {
            	    a4=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_How2624); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createHow();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_17_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_70, 90);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_71, 90);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_70, 91);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_71, 91);
              	
            }
            a5=(Token)match(input,28,FOLLOW_28_in_parse_org_be_textbe_bt_v1_textbt_How2657); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createHow();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_17_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_72, 92);
              	
            }
            // Bt.g:3714:2: (a6= TEXT )
            // Bt.g:3715:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_How2675); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createHow();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL), value);
              				}
              			}
              			if (a6 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MEANS), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MEANS, value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_17_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_73, 93);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_74, 93);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 93, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 93);
              	
            }
            // Bt.g:3775:2: ( ( (a7= TEXT ) | a8= '/' ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==TEXT||LA34_0==24) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Bt.g:3776:3: ( (a7= TEXT ) | a8= '/' )
            	    {
            	    // Bt.g:3776:3: ( (a7= TEXT ) | a8= '/' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==TEXT) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==24) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // Bt.g:3777:4: (a7= TEXT )
            	            {
            	            // Bt.g:3777:4: (a7= TEXT )
            	            // Bt.g:3778:5: a7= TEXT
            	            {
            	            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_How2711); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createHow();
            	              						incompleteObjects.push(element);
            	              						// initialize boolean attribute
            	              						{
            	              							Object value = false;
            	              							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL), value);
            	              						}
            	              					}
            	              					if (a7 != null) {
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	              						tokenResolver.setOptions(getOptions());
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
            	              						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MEANS), result);
            	              						Object resolvedObject = result.getResolvedToken();
            	              						if (resolvedObject == null) {
            	              							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
            	              						}
            	              						java.lang.String resolved = (java.lang.String) resolvedObject;
            	              						if (resolved != null) {
            	              							Object value = resolved;
            	              							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MEANS, value);
            	              							completedElement(value, false);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_17_0_0_5_0_0_0, resolved, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_73, 94);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_74, 94);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 94, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 94);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Bt.g:3839:8: a8= '/'
            	            {
            	            a8=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_How2752); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              				if (element == null) {
            	              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createHow();
            	              					incompleteObjects.push(element);
            	              					// initialize boolean attribute
            	              					{
            	              						Object value = false;
            	              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.HOW__MULTI_LEVEL), value);
            	              					}
            	              				}
            	              				collectHiddenTokens(element);
            	              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_17_0_0_5_0_1_0, null, true);
            	              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_73, 95);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_74, 95);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 95, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 95);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_73, 96);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_74, 96);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 96, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 96);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_org_be_textbe_bt_v1_textbt_How_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_How"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Where"
    // Bt.g:3907:1: parse_org_be_textbe_bt_v1_textbt_Where returns [org.be.textbe.bt.v1.textbt.Where element = null] : a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'Where' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* ;
    public final org.be.textbe.bt.v1.textbt.Where parse_org_be_textbe_bt_v1_textbt_Where() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Where element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Where_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // Bt.g:3910:1: (a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'Where' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* )
            // Bt.g:3911:2: a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'Where' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )*
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_Where2800); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhere();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_18_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_75, 97);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_76, 97);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_77, 97);
              	
            }
            // Bt.g:3932:2: ( (a1= '/' )? )
            // Bt.g:3933:3: (a1= '/' )?
            {
            // Bt.g:3933:3: (a1= '/' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred38_Bt()) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // Bt.g:3934:4: a1= '/'
                    {
                    a1=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Where2823); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhere();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_18_0_0_1, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_76, 98);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_77, 98);
              	
            }
            // Bt.g:3959:2: ( (a4= '/' ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==24) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Bt.g:3960:3: (a4= '/' )
            	    {
            	    // Bt.g:3960:3: (a4= '/' )
            	    // Bt.g:3961:4: a4= '/'
            	    {
            	    a4=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Where2853); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhere();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_18_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_76, 99);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_77, 99);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_76, 100);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_77, 100);
              	
            }
            a5=(Token)match(input,29,FOLLOW_29_in_parse_org_be_textbe_bt_v1_textbt_Where2886); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhere();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_18_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_78, 101);
              	
            }
            // Bt.g:4008:2: (a6= TEXT )
            // Bt.g:4009:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Where2904); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhere();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL), value);
              				}
              			}
              			if (a6 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__PLACE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__PLACE, value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_18_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_79, 102);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_80, 102);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 102, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 102);
              	
            }
            // Bt.g:4069:2: ( ( (a7= TEXT ) | a8= '/' ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==TEXT||LA38_0==24) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Bt.g:4070:3: ( (a7= TEXT ) | a8= '/' )
            	    {
            	    // Bt.g:4070:3: ( (a7= TEXT ) | a8= '/' )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==TEXT) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==24) ) {
            	        alt37=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // Bt.g:4071:4: (a7= TEXT )
            	            {
            	            // Bt.g:4071:4: (a7= TEXT )
            	            // Bt.g:4072:5: a7= TEXT
            	            {
            	            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Where2940); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhere();
            	              						incompleteObjects.push(element);
            	              						// initialize boolean attribute
            	              						{
            	              							Object value = false;
            	              							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL), value);
            	              						}
            	              					}
            	              					if (a7 != null) {
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	              						tokenResolver.setOptions(getOptions());
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
            	              						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__PLACE), result);
            	              						Object resolvedObject = result.getResolvedToken();
            	              						if (resolvedObject == null) {
            	              							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
            	              						}
            	              						java.lang.String resolved = (java.lang.String) resolvedObject;
            	              						if (resolved != null) {
            	              							Object value = resolved;
            	              							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__PLACE, value);
            	              							completedElement(value, false);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_18_0_0_5_0_0_0, resolved, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_79, 103);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_80, 103);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 103, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 103);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Bt.g:4133:8: a8= '/'
            	            {
            	            a8=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Where2981); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              				if (element == null) {
            	              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhere();
            	              					incompleteObjects.push(element);
            	              					// initialize boolean attribute
            	              					{
            	              						Object value = false;
            	              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHERE__MULTI_LEVEL), value);
            	              					}
            	              				}
            	              				collectHiddenTokens(element);
            	              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_18_0_0_5_0_1_0, null, true);
            	              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_79, 104);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_80, 104);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 104, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 104);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_79, 105);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_80, 105);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 105, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 105);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_org_be_textbe_bt_v1_textbt_Where_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Where"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_When"
    // Bt.g:4201:1: parse_org_be_textbe_bt_v1_textbt_When returns [org.be.textbe.bt.v1.textbt.When element = null] : a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'When' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* ;
    public final org.be.textbe.bt.v1.textbt.When parse_org_be_textbe_bt_v1_textbt_When() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.When element =  null;
        int parse_org_be_textbe_bt_v1_textbt_When_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // Bt.g:4204:1: (a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'When' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )* )
            // Bt.g:4205:2: a0= '#R' ( (a1= '/' )? ) ( (a4= '/' ) )* a5= 'When' (a6= TEXT ) ( ( (a7= TEXT ) | a8= '/' ) )*
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_When3029); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhen();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_19_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_81, 106);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_82, 106);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_83, 106);
              	
            }
            // Bt.g:4226:2: ( (a1= '/' )? )
            // Bt.g:4227:3: (a1= '/' )?
            {
            // Bt.g:4227:3: (a1= '/' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred42_Bt()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // Bt.g:4228:4: a1= '/'
                    {
                    a1=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_When3052); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhen();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_19_0_0_1, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_82, 107);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_83, 107);
              	
            }
            // Bt.g:4253:2: ( (a4= '/' ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==24) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // Bt.g:4254:3: (a4= '/' )
            	    {
            	    // Bt.g:4254:3: (a4= '/' )
            	    // Bt.g:4255:4: a4= '/'
            	    {
            	    a4=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_When3082); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhen();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_19_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_82, 108);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_83, 108);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_82, 109);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_83, 109);
              	
            }
            a5=(Token)match(input,30,FOLLOW_30_in_parse_org_be_textbe_bt_v1_textbt_When3115); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhen();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_19_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_84, 110);
              	
            }
            // Bt.g:4302:2: (a6= TEXT )
            // Bt.g:4303:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_When3133); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhen();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL), value);
              				}
              			}
              			if (a6 != null) {
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__TIME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__TIME, value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_19_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_85, 111);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_86, 111);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 111, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 111);
              	
            }
            // Bt.g:4363:2: ( ( (a7= TEXT ) | a8= '/' ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==TEXT||LA42_0==24) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Bt.g:4364:3: ( (a7= TEXT ) | a8= '/' )
            	    {
            	    // Bt.g:4364:3: ( (a7= TEXT ) | a8= '/' )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==TEXT) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==24) ) {
            	        alt41=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // Bt.g:4365:4: (a7= TEXT )
            	            {
            	            // Bt.g:4365:4: (a7= TEXT )
            	            // Bt.g:4366:5: a7= TEXT
            	            {
            	            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_When3169); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhen();
            	              						incompleteObjects.push(element);
            	              						// initialize boolean attribute
            	              						{
            	              							Object value = false;
            	              							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL), value);
            	              						}
            	              					}
            	              					if (a7 != null) {
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	              						tokenResolver.setOptions(getOptions());
            	              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
            	              						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__TIME), result);
            	              						Object resolvedObject = result.getResolvedToken();
            	              						if (resolvedObject == null) {
            	              							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
            	              						}
            	              						java.lang.String resolved = (java.lang.String) resolvedObject;
            	              						if (resolved != null) {
            	              							Object value = resolved;
            	              							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__TIME, value);
            	              							completedElement(value, false);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_19_0_0_5_0_0_0, resolved, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_85, 112);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_86, 112);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 112, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 112);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Bt.g:4427:8: a8= '/'
            	            {
            	            a8=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_When3210); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              				if (element == null) {
            	              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createWhen();
            	              					incompleteObjects.push(element);
            	              					// initialize boolean attribute
            	              					{
            	              						Object value = false;
            	              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.WHEN__MULTI_LEVEL), value);
            	              					}
            	              				}
            	              				collectHiddenTokens(element);
            	              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_19_0_0_5_0_1_0, null, true);
            	              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_85, 113);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_86, 113);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 113, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 113);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_85, 114);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_86, 114);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_24, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_25, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_26, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_27, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_28, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_29, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_10, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_11, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_12, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_13, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_14, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_15, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_16, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_17, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_18, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_19, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 114, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 114);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_org_be_textbe_bt_v1_textbt_When_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_When"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Atomic"
    // Bt.g:4495:1: parse_org_be_textbe_bt_v1_textbt_Atomic returns [org.be.textbe.bt.v1.textbt.Atomic element = null] : a0= '{' (a1_0= parse_org_be_textbe_bt_v1_textbt_Node ) ( (a2= ';;' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) ) )* ( (a4_0= parse_org_be_textbe_bt_v1_textbt_Interleaving | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel ) )? a5= '}' ;
    public final org.be.textbe.bt.v1.textbt.Atomic parse_org_be_textbe_bt_v1_textbt_Atomic() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Atomic element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Atomic_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        Token a5=null;
        org.be.textbe.bt.v1.textbt.Node a1_0 = null;

        org.be.textbe.bt.v1.textbt.Node a3_0 = null;

        org.be.textbe.bt.v1.textbt.Interleaving a4_0 = null;

        org.be.textbe.bt.v1.textbt.Alternative a4_1 = null;

        org.be.textbe.bt.v1.textbt.Parallel a4_2 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // Bt.g:4498:1: (a0= '{' (a1_0= parse_org_be_textbe_bt_v1_textbt_Node ) ( (a2= ';;' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) ) )* ( (a4_0= parse_org_be_textbe_bt_v1_textbt_Interleaving | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel ) )? a5= '}' )
            // Bt.g:4499:2: a0= '{' (a1_0= parse_org_be_textbe_bt_v1_textbt_Node ) ( (a2= ';;' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) ) )* ( (a4_0= parse_org_be_textbe_bt_v1_textbt_Interleaving | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel ) )? a5= '}'
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_org_be_textbe_bt_v1_textbt_Atomic3258); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_87, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_92, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              	
            }
            // Bt.g:4518:2: (a1_0= parse_org_be_textbe_bt_v1_textbt_Node )
            // Bt.g:4519:3: a1_0= parse_org_be_textbe_bt_v1_textbt_Node
            {
            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Node_in_parse_org_be_textbe_bt_v1_textbt_Atomic3276);
            a1_0=parse_org_be_textbe_bt_v1_textbt_Node();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
              				incompleteObjects.push(element);
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					Object value = a1_0;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__STEPS, value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_2, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 116);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 116, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 116, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 116, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 116);
              	
            }
            // Bt.g:4548:2: ( (a2= ';;' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==32) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Bt.g:4549:3: (a2= ';;' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) )
            	    {
            	    // Bt.g:4549:3: (a2= ';;' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) )
            	    // Bt.g:4550:4: a2= ';;' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node )
            	    {
            	    a2=(Token)match(input,32,FOLLOW_32_in_parse_org_be_textbe_bt_v1_textbt_Atomic3303); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_3_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_87, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_92, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      			
            	    }
            	    // Bt.g:4569:4: (a3_0= parse_org_be_textbe_bt_v1_textbt_Node )
            	    // Bt.g:4570:5: a3_0= parse_org_be_textbe_bt_v1_textbt_Node
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Node_in_parse_org_be_textbe_bt_v1_textbt_Atomic3329);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Node();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a3_0 != null) {
            	      						if (a3_0 != null) {
            	      							Object value = a3_0;
            	      							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__STEPS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_3_0_0_1, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 118);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 118, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 118, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 118, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 118);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 119);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 119, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 119, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 119, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 119);
              	
            }
            // Bt.g:4610:2: ( (a4_0= parse_org_be_textbe_bt_v1_textbt_Interleaving | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==31||(LA45_0>=35 && LA45_0<=36)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Bt.g:4611:3: (a4_0= parse_org_be_textbe_bt_v1_textbt_Interleaving | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel )
                    {
                    // Bt.g:4611:3: (a4_0= parse_org_be_textbe_bt_v1_textbt_Interleaving | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel )
                    int alt44=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt44=1;
                        }
                        break;
                    case 35:
                        {
                        alt44=2;
                        }
                        break;
                    case 36:
                        {
                        alt44=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }

                    switch (alt44) {
                        case 1 :
                            // Bt.g:4612:4: a4_0= parse_org_be_textbe_bt_v1_textbt_Interleaving
                            {
                            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Interleaving_in_parse_org_be_textbe_bt_v1_textbt_Atomic3379);
                            a4_0=parse_org_be_textbe_bt_v1_textbt_Interleaving();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
                              					incompleteObjects.push(element);
                              				}
                              				if (a4_0 != null) {
                              					if (a4_0 != null) {
                              						Object value = a4_0;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__CHILD), value);
                              						completedElement(value, true);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_5, a4_0, true);
                              					copyLocalizationInfos(a4_0, element);
                              				}
                              			
                            }

                            }
                            break;
                        case 2 :
                            // Bt.g:4631:8: a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative
                            {
                            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Alternative_in_parse_org_be_textbe_bt_v1_textbt_Atomic3396);
                            a4_1=parse_org_be_textbe_bt_v1_textbt_Alternative();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
                              					incompleteObjects.push(element);
                              				}
                              				if (a4_1 != null) {
                              					if (a4_1 != null) {
                              						Object value = a4_1;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__CHILD), value);
                              						completedElement(value, true);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_5, a4_1, true);
                              					copyLocalizationInfos(a4_1, element);
                              				}
                              			
                            }

                            }
                            break;
                        case 3 :
                            // Bt.g:4650:8: a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel
                            {
                            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Parallel_in_parse_org_be_textbe_bt_v1_textbt_Atomic3413);
                            a4_2=parse_org_be_textbe_bt_v1_textbt_Parallel();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
                              					incompleteObjects.push(element);
                              				}
                              				if (a4_2 != null) {
                              					if (a4_2 != null) {
                              						Object value = a4_2;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.ATOMIC__CHILD), value);
                              						completedElement(value, true);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_5, a4_2, true);
                              					copyLocalizationInfos(a4_2, element);
                              				}
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 120);
              	
            }
            a5=(Token)match(input,33,FOLLOW_33_in_parse_org_be_textbe_bt_v1_textbt_Atomic3439); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 121);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 121, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 121, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 121, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 121, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 121);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 121);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_org_be_textbe_bt_v1_textbt_Atomic_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Atomic"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Interleaving"
    // Bt.g:4698:1: parse_org_be_textbe_bt_v1_textbt_Interleaving returns [org.be.textbe.bt.v1.textbt.Interleaving element = null] : a0= '{' (a1_0= parse_org_be_textbe_bt_v1_textbt_Node ) ( (a2= ';' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) ) )* ( (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel ) )? a5= '}' ;
    public final org.be.textbe.bt.v1.textbt.Interleaving parse_org_be_textbe_bt_v1_textbt_Interleaving() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Interleaving element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Interleaving_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        Token a5=null;
        org.be.textbe.bt.v1.textbt.Node a1_0 = null;

        org.be.textbe.bt.v1.textbt.Node a3_0 = null;

        org.be.textbe.bt.v1.textbt.Sequence a4_0 = null;

        org.be.textbe.bt.v1.textbt.Alternative a4_1 = null;

        org.be.textbe.bt.v1.textbt.Parallel a4_2 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // Bt.g:4701:1: (a0= '{' (a1_0= parse_org_be_textbe_bt_v1_textbt_Node ) ( (a2= ';' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) ) )* ( (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel ) )? a5= '}' )
            // Bt.g:4702:2: a0= '{' (a1_0= parse_org_be_textbe_bt_v1_textbt_Node ) ( (a2= ';' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) ) )* ( (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel ) )? a5= '}'
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3468); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_87, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_92, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
              	
            }
            // Bt.g:4721:2: (a1_0= parse_org_be_textbe_bt_v1_textbt_Node )
            // Bt.g:4722:3: a1_0= parse_org_be_textbe_bt_v1_textbt_Node
            {
            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Node_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3486);
            a1_0=parse_org_be_textbe_bt_v1_textbt_Node();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
              				incompleteObjects.push(element);
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					Object value = a1_0;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__STEPS, value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_2, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 123);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 123, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 123, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 123, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 123, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 123);
              	
            }
            // Bt.g:4752:2: ( (a2= ';' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==34) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Bt.g:4753:3: (a2= ';' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) )
            	    {
            	    // Bt.g:4753:3: (a2= ';' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node ) )
            	    // Bt.g:4754:4: a2= ';' (a3_0= parse_org_be_textbe_bt_v1_textbt_Node )
            	    {
            	    a2=(Token)match(input,34,FOLLOW_34_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3513); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_3_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_87, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_92, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
            	      			
            	    }
            	    // Bt.g:4773:4: (a3_0= parse_org_be_textbe_bt_v1_textbt_Node )
            	    // Bt.g:4774:5: a3_0= parse_org_be_textbe_bt_v1_textbt_Node
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Node_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3539);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_Node();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a3_0 != null) {
            	      						if (a3_0 != null) {
            	      							Object value = a3_0;
            	      							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__STEPS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_3_0_0_1, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 125);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 125, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 125, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 125, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 125, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 125);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 126);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 126, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 126, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 126, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 126, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 126);
              	
            }
            // Bt.g:4816:2: ( (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31||(LA48_0>=35 && LA48_0<=36)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Bt.g:4817:3: (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel )
                    {
                    // Bt.g:4817:3: (a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence | a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative | a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel )
                    int alt47=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt47=1;
                        }
                        break;
                    case 35:
                        {
                        alt47=2;
                        }
                        break;
                    case 36:
                        {
                        alt47=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // Bt.g:4818:4: a4_0= parse_org_be_textbe_bt_v1_textbt_Sequence
                            {
                            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Sequence_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3589);
                            a4_0=parse_org_be_textbe_bt_v1_textbt_Sequence();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
                              					incompleteObjects.push(element);
                              				}
                              				if (a4_0 != null) {
                              					if (a4_0 != null) {
                              						Object value = a4_0;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__CHILD), value);
                              						completedElement(value, true);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_5, a4_0, true);
                              					copyLocalizationInfos(a4_0, element);
                              				}
                              			
                            }

                            }
                            break;
                        case 2 :
                            // Bt.g:4837:8: a4_1= parse_org_be_textbe_bt_v1_textbt_Alternative
                            {
                            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Alternative_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3606);
                            a4_1=parse_org_be_textbe_bt_v1_textbt_Alternative();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
                              					incompleteObjects.push(element);
                              				}
                              				if (a4_1 != null) {
                              					if (a4_1 != null) {
                              						Object value = a4_1;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__CHILD), value);
                              						completedElement(value, true);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_5, a4_1, true);
                              					copyLocalizationInfos(a4_1, element);
                              				}
                              			
                            }

                            }
                            break;
                        case 3 :
                            // Bt.g:4856:8: a4_2= parse_org_be_textbe_bt_v1_textbt_Parallel
                            {
                            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Parallel_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3623);
                            a4_2=parse_org_be_textbe_bt_v1_textbt_Parallel();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
                              					incompleteObjects.push(element);
                              				}
                              				if (a4_2 != null) {
                              					if (a4_2 != null) {
                              						Object value = a4_2;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.INTERLEAVING__CHILD), value);
                              						completedElement(value, true);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_5, a4_2, true);
                              					copyLocalizationInfos(a4_2, element);
                              				}
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 127);
              	
            }
            a5=(Token)match(input,33,FOLLOW_33_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3649); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 128);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 128);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 128, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 128, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 128, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 128, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 128);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 128);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parse_org_be_textbe_bt_v1_textbt_Interleaving_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Interleaving"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Alternative"
    // Bt.g:4905:1: parse_org_be_textbe_bt_v1_textbt_Alternative returns [org.be.textbe.bt.v1.textbt.Alternative element = null] : a0= '#N' a1= '{' (a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ( ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ) )* a4= '}' ;
    public final org.be.textbe.bt.v1.textbt.Alternative parse_org_be_textbe_bt_v1_textbt_Alternative() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Alternative element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Alternative_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        org.be.textbe.bt.v1.textbt.BehaviorTree a2_0 = null;

        org.be.textbe.bt.v1.textbt.BehaviorTree a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // Bt.g:4908:1: (a0= '#N' a1= '{' (a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ( ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ) )* a4= '}' )
            // Bt.g:4909:2: a0= '#N' a1= '{' (a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ( ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ) )* a4= '}'
            {
            a0=(Token)match(input,35,FOLLOW_35_in_parse_org_be_textbe_bt_v1_textbt_Alternative3678); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAlternative();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_22_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_101, 129);
              	
            }
            a1=(Token)match(input,31,FOLLOW_31_in_parse_org_be_textbe_bt_v1_textbt_Alternative3692); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAlternative();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_22_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 130, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 130, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 130, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 130, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              	
            }
            // Bt.g:4940:2: (a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree )
            // Bt.g:4941:3: a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree
            {
            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_BehaviorTree_in_parse_org_be_textbe_bt_v1_textbt_Alternative3710);
            a2_0=parse_org_be_textbe_bt_v1_textbt_BehaviorTree();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAlternative();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.ALTERNATIVE__CHOICES, value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_22_0_0_3, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 131, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 131, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 131, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 131, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 131);
              	
            }
            // Bt.g:4970:2: ( ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==31||(LA49_0>=35 && LA49_0<=36)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Bt.g:4971:3: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) )
            	    {
            	    // Bt.g:4971:3: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) )
            	    // Bt.g:4972:4: (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree )
            	    {
            	    // Bt.g:4972:4: (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree )
            	    // Bt.g:4973:5: a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_BehaviorTree_in_parse_org_be_textbe_bt_v1_textbt_Alternative3743);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_BehaviorTree();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAlternative();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a3_0 != null) {
            	      						if (a3_0 != null) {
            	      							Object value = a3_0;
            	      							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.ALTERNATIVE__CHOICES, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_22_0_0_4_0_0_0, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 132, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 132, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 132, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 132, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 132);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 133, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 133, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 133, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 133, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 133);
              	
            }
            a4=(Token)match(input,33,FOLLOW_33_in_parse_org_be_textbe_bt_v1_textbt_Alternative3784); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAlternative();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_22_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 134);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 134);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 134, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 134, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 134, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 134, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 134);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 134);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parse_org_be_textbe_bt_v1_textbt_Alternative_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Alternative"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Parallel"
    // Bt.g:5036:1: parse_org_be_textbe_bt_v1_textbt_Parallel returns [org.be.textbe.bt.v1.textbt.Parallel element = null] : a0= '#P' a1= '{' (a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ( ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ) )* a4= '}' ;
    public final org.be.textbe.bt.v1.textbt.Parallel parse_org_be_textbe_bt_v1_textbt_Parallel() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Parallel element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Parallel_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        org.be.textbe.bt.v1.textbt.BehaviorTree a2_0 = null;

        org.be.textbe.bt.v1.textbt.BehaviorTree a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // Bt.g:5039:1: (a0= '#P' a1= '{' (a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ( ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ) )* a4= '}' )
            // Bt.g:5040:2: a0= '#P' a1= '{' (a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ( ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ) )* a4= '}'
            {
            a0=(Token)match(input,36,FOLLOW_36_in_parse_org_be_textbe_bt_v1_textbt_Parallel3813); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createParallel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_23_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_102, 135);
              	
            }
            a1=(Token)match(input,31,FOLLOW_31_in_parse_org_be_textbe_bt_v1_textbt_Parallel3827); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createParallel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_23_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 136, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 136, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 136, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 136, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              	
            }
            // Bt.g:5071:2: (a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree )
            // Bt.g:5072:3: a2_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree
            {
            pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_BehaviorTree_in_parse_org_be_textbe_bt_v1_textbt_Parallel3845);
            a2_0=parse_org_be_textbe_bt_v1_textbt_BehaviorTree();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createParallel();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.PARALLEL__PROCESSES, value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_23_0_0_3, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 137, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 137, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 137, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 137, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 137);
              	
            }
            // Bt.g:5101:2: ( ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==31||(LA50_0>=35 && LA50_0<=36)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Bt.g:5102:3: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) )
            	    {
            	    // Bt.g:5102:3: ( (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree ) )
            	    // Bt.g:5103:4: (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree )
            	    {
            	    // Bt.g:5103:4: (a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree )
            	    // Bt.g:5104:5: a3_0= parse_org_be_textbe_bt_v1_textbt_BehaviorTree
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_BehaviorTree_in_parse_org_be_textbe_bt_v1_textbt_Parallel3878);
            	    a3_0=parse_org_be_textbe_bt_v1_textbt_BehaviorTree();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createParallel();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a3_0 != null) {
            	      						if (a3_0 != null) {
            	      							Object value = a3_0;
            	      							addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.PARALLEL__PROCESSES, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_23_0_0_4_0_0_0, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 138, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 138, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 138, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 138, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 138);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 139, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 139, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 139, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 139, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 139);
              	
            }
            a4=(Token)match(input,33,FOLLOW_33_in_parse_org_be_textbe_bt_v1_textbt_Parallel3919); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createParallel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_23_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 140);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 140);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 140, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 140, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 140, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 140, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 140);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 140);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, parse_org_be_textbe_bt_v1_textbt_Parallel_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Parallel"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Node"
    // Bt.g:5167:1: parse_org_be_textbe_bt_v1_textbt_Node returns [org.be.textbe.bt.v1.textbt.Node element = null] : ( ( (a0= '\\'' (a1= TEXT ) a2= '\\'' ) )? ( ( (a3= 'show' | a4= 'hide' ) ) )? ( (a6_0= parse_org_be_textbe_bt_v1_textbt_TraceabilityLink ) (a7= TEXT ) ) | a8= '_' ( ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? ) )? );
    public final org.be.textbe.bt.v1.textbt.Node parse_org_be_textbe_bt_v1_textbt_Node() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Node element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Node_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        org.be.textbe.bt.v1.textbt.TraceabilityLink a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // Bt.g:5170:1: ( ( (a0= '\\'' (a1= TEXT ) a2= '\\'' ) )? ( ( (a3= 'show' | a4= 'hide' ) ) )? ( (a6_0= parse_org_be_textbe_bt_v1_textbt_TraceabilityLink ) (a7= TEXT ) ) | a8= '_' ( ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? ) )? )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==TEXT||(LA56_0>=37 && LA56_0<=39)||LA56_0==44||(LA56_0>=50 && LA56_0<=53)) ) {
                alt56=1;
            }
            else if ( (LA56_0==40) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // Bt.g:5171:2: ( (a0= '\\'' (a1= TEXT ) a2= '\\'' ) )? ( ( (a3= 'show' | a4= 'hide' ) ) )? ( (a6_0= parse_org_be_textbe_bt_v1_textbt_TraceabilityLink ) (a7= TEXT ) )
                    {
                    // Bt.g:5171:2: ( (a0= '\\'' (a1= TEXT ) a2= '\\'' ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==37) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // Bt.g:5172:3: (a0= '\\'' (a1= TEXT ) a2= '\\'' )
                            {
                            // Bt.g:5172:3: (a0= '\\'' (a1= TEXT ) a2= '\\'' )
                            // Bt.g:5173:4: a0= '\\'' (a1= TEXT ) a2= '\\''
                            {
                            a0=(Token)match(input,37,FOLLOW_37_in_parse_org_be_textbe_bt_v1_textbt_Node3957); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (element == null) {
                              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                              					incompleteObjects.push(element);
                              					// initialize enumeration attribute
                              					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                              				}
                              				collectHiddenTokens(element);
                              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_0_0_0_0_0, null, true);
                              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				// expected elements (follow set)
                              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_103, 141);
                              			
                            }
                            // Bt.g:5190:4: (a1= TEXT )
                            // Bt.g:5191:5: a1= TEXT
                            {
                            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Node3983); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (terminateParsing) {
                              						throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                              					}
                              					if (element == null) {
                              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                              						incompleteObjects.push(element);
                              						// initialize enumeration attribute
                              						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                              					}
                              					if (a1 != null) {
                              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                              						tokenResolver.setOptions(getOptions());
                              						org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
                              						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__LABEL), result);
                              						Object resolvedObject = result.getResolvedToken();
                              						if (resolvedObject == null) {
                              							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                              						}
                              						java.lang.String resolved = (java.lang.String) resolvedObject;
                              						if (resolved != null) {
                              							Object value = resolved;
                              							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__LABEL), value);
                              							completedElement(value, false);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_0_0_0_0_1, resolved, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                              					}
                              				
                            }

                            }

                            if ( state.backtracking==0 ) {

                              				// expected elements (follow set)
                              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_104, 142);
                              			
                            }
                            a2=(Token)match(input,37,FOLLOW_37_in_parse_org_be_textbe_bt_v1_textbt_Node4016); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (element == null) {
                              					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                              					incompleteObjects.push(element);
                              					// initialize enumeration attribute
                              					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                              				}
                              				collectHiddenTokens(element);
                              				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_0_0_0_0_2, null, true);
                              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				// expected elements (follow set)
                              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 143);
                              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 143, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
                              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 143, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
                              				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 143);
                              			
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 144);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 144, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 144, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 144);
                      	
                    }
                    // Bt.g:5259:2: ( ( (a3= 'show' | a4= 'hide' ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=38 && LA53_0<=39)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // Bt.g:5260:3: ( (a3= 'show' | a4= 'hide' ) )
                            {
                            // Bt.g:5260:3: ( (a3= 'show' | a4= 'hide' ) )
                            // Bt.g:5261:4: (a3= 'show' | a4= 'hide' )
                            {
                            // Bt.g:5261:4: (a3= 'show' | a4= 'hide' )
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==38) ) {
                                alt52=1;
                            }
                            else if ( (LA52_0==39) ) {
                                alt52=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 52, 0, input);

                                throw nvae;
                            }
                            switch (alt52) {
                                case 1 :
                                    // Bt.g:5262:5: a3= 'show'
                                    {
                                    a3=(Token)match(input,38,FOLLOW_38_in_parse_org_be_textbe_bt_v1_textbt_Node4064); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_0_1, true, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                                      					// set value of boolean attribute
                                      					Object value = true;
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__SHOW_TAG), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;
                                case 2 :
                                    // Bt.g:5278:10: a4= 'hide'
                                    {
                                    a4=(Token)match(input,39,FOLLOW_39_in_parse_org_be_textbe_bt_v1_textbt_Node4081); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_0_1, false, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                                      					// set value of boolean attribute
                                      					Object value = false;
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__SHOW_TAG), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 145, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 145, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 145);
                      	
                    }
                    // Bt.g:5304:2: ( (a6_0= parse_org_be_textbe_bt_v1_textbt_TraceabilityLink ) (a7= TEXT ) )
                    // Bt.g:5305:3: (a6_0= parse_org_be_textbe_bt_v1_textbt_TraceabilityLink ) (a7= TEXT )
                    {
                    // Bt.g:5305:3: (a6_0= parse_org_be_textbe_bt_v1_textbt_TraceabilityLink )
                    // Bt.g:5306:4: a6_0= parse_org_be_textbe_bt_v1_textbt_TraceabilityLink
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink_in_parse_org_be_textbe_bt_v1_textbt_Node4119);
                    a6_0=parse_org_be_textbe_bt_v1_textbt_TraceabilityLink();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                      					incompleteObjects.push(element);
                      					// initialize enumeration attribute
                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                      				}
                      				if (a6_0 != null) {
                      					if (a6_0 != null) {
                      						Object value = a6_0;
                      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__TRACEABILITY, value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_0_2_0_0_0, a6_0, true);
                      					copyLocalizationInfos(a6_0, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 146);
                      		
                    }
                    // Bt.g:5334:3: (a7= TEXT )
                    // Bt.g:5335:4: a7= TEXT
                    {
                    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Node4147); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                      					incompleteObjects.push(element);
                      					// initialize enumeration attribute
                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                      				}
                      				if (a7 != null) {
                      					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__BEHAVIOR), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					org.be.textbe.bt.v1.textbt.Behavior proxy = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtContextDependentURIFragmentFactory<org.be.textbe.bt.v1.textbt.Node, org.be.textbe.bt.v1.textbt.Behavior>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNodeBehaviorReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__BEHAVIOR), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__BEHAVIOR), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_0_2_0_0_1, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 147);
                      			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 147, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 147, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 147, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 147);
                      			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 147);
                      			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 147, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 147);
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 148);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 148, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 148, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 148, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 148);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 148);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 148, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 148);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Bt.g:5398:4: a8= '_' ( ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? ) )?
                    {
                    a8=(Token)match(input,40,FOLLOW_40_in_parse_org_be_textbe_bt_v1_textbt_Node4185); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                      			incompleteObjects.push(element);
                      			// initialize enumeration attribute
                      			Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                      			element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_105, 149);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 149);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 149, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 149, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 149, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 149);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 149);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 149, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 149);
                      	
                    }
                    // Bt.g:5423:2: ( ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? ) )?
                    int alt55=2;
                    alt55 = dfa55.predict(input);
                    switch (alt55) {
                        case 1 :
                            // Bt.g:5424:3: ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? )
                            {
                            // Bt.g:5424:3: ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? )
                            // Bt.g:5425:4: (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )?
                            {
                            // Bt.g:5425:4: (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )?
                            int alt54=10;
                            switch ( input.LA(1) ) {
                                case 41:
                                    {
                                    alt54=1;
                                    }
                                    break;
                                case 42:
                                    {
                                    alt54=2;
                                    }
                                    break;
                                case 43:
                                    {
                                    alt54=3;
                                    }
                                    break;
                                case 44:
                                    {
                                    alt54=4;
                                    }
                                    break;
                                case 45:
                                    {
                                    alt54=5;
                                    }
                                    break;
                                case 46:
                                    {
                                    alt54=6;
                                    }
                                    break;
                                case 47:
                                    {
                                    alt54=7;
                                    }
                                    break;
                                case 48:
                                    {
                                    alt54=8;
                                    }
                                    break;
                                case 49:
                                    {
                                    alt54=9;
                                    }
                                    break;
                            }

                            switch (alt54) {
                                case 1 :
                                    // Bt.g:5426:5: a9= '^'
                                    {
                                    a9=(Token)match(input,41,FOLLOW_41_in_parse_org_be_textbe_bt_v1_textbt_Node4214); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_1, null, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
                                      					// set value of enumeration attribute
                                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.REVERSION_VALUE).getInstance();
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;
                                case 2 :
                                    // Bt.g:5442:10: a10= '='
                                    {
                                    a10=(Token)match(input,42,FOLLOW_42_in_parse_org_be_textbe_bt_v1_textbt_Node4231); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_1, null, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
                                      					// set value of enumeration attribute
                                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.SYNCHRONIZATION_VALUE).getInstance();
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;
                                case 3 :
                                    // Bt.g:5458:10: a11= '=>'
                                    {
                                    a11=(Token)match(input,43,FOLLOW_43_in_parse_org_be_textbe_bt_v1_textbt_Node4248); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_1, null, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
                                      					// set value of enumeration attribute
                                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.REFERENCE_VALUE).getInstance();
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;
                                case 4 :
                                    // Bt.g:5474:10: a12= '--'
                                    {
                                    a12=(Token)match(input,44,FOLLOW_44_in_parse_org_be_textbe_bt_v1_textbt_Node4265); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_1, null, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a12, element);
                                      					// set value of enumeration attribute
                                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.BRANCH_KILL_VALUE).getInstance();
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;
                                case 5 :
                                    // Bt.g:5490:10: a13= '\\u0025'
                                    {
                                    a13=(Token)match(input,45,FOLLOW_45_in_parse_org_be_textbe_bt_v1_textbt_Node4282); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_1, null, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
                                      					// set value of enumeration attribute
                                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.MAY_VALUE).getInstance();
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;
                                case 6 :
                                    // Bt.g:5506:10: a14= '^^'
                                    {
                                    a14=(Token)match(input,46,FOLLOW_46_in_parse_org_be_textbe_bt_v1_textbt_Node4299); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_1, null, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a14, element);
                                      					// set value of enumeration attribute
                                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.START_NEW_VALUE).getInstance();
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;
                                case 7 :
                                    // Bt.g:5522:10: a15= 'XOR'
                                    {
                                    a15=(Token)match(input,47,FOLLOW_47_in_parse_org_be_textbe_bt_v1_textbt_Node4316); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_1, null, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a15, element);
                                      					// set value of enumeration attribute
                                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.XOR_VALUE).getInstance();
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;
                                case 8 :
                                    // Bt.g:5538:10: a16= '|'
                                    {
                                    a16=(Token)match(input,48,FOLLOW_48_in_parse_org_be_textbe_bt_v1_textbt_Node4333); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_1, null, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a16, element);
                                      					// set value of enumeration attribute
                                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.DISJUNCTION_VALUE).getInstance();
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;
                                case 9 :
                                    // Bt.g:5554:10: a17= '&'
                                    {
                                    a17=(Token)match(input,49,FOLLOW_49_in_parse_org_be_textbe_bt_v1_textbt_Node4350); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      					if (element == null) {
                                      						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createNode();
                                      						incompleteObjects.push(element);
                                      						// initialize enumeration attribute
                                      						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.NORMAL_VALUE).getInstance();
                                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					}
                                      					collectHiddenTokens(element);
                                      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_24_0_1_1, null, true);
                                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a17, element);
                                      					// set value of enumeration attribute
                                      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNodeType().getEEnumLiteral(org.be.textbe.bt.v1.textbt.NodeType.CONJUNCTION_VALUE).getInstance();
                                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.NODE__OPERATOR), value);
                                      					completedElement(value, false);
                                      				
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 150);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 150, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 150, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 150, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 150);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 150);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 150, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
                      		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 150);
                      	
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, parse_org_be_textbe_bt_v1_textbt_Node_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Node"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_TraceabilityLink"
    // Bt.g:5586:1: parse_org_be_textbe_bt_v1_textbt_TraceabilityLink returns [org.be.textbe.bt.v1.textbt.TraceabilityLink element = null] : ( (a0= TEXT ) )* ( ( (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )? ) )? ;
    public final org.be.textbe.bt.v1.textbt.TraceabilityLink parse_org_be_textbe_bt_v1_textbt_TraceabilityLink() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.TraceabilityLink element =  null;
        int parse_org_be_textbe_bt_v1_textbt_TraceabilityLink_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // Bt.g:5589:1: ( ( (a0= TEXT ) )* ( ( (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )? ) )? )
            // Bt.g:5590:2: ( (a0= TEXT ) )* ( ( (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )? ) )?
            {
            // Bt.g:5590:2: ( (a0= TEXT ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==TEXT) ) {
                    int LA57_2 = input.LA(2);

                    if ( (LA57_2==TEXT||LA57_2==44||(LA57_2>=50 && LA57_2<=53)) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // Bt.g:5591:3: (a0= TEXT )
            	    {
            	    // Bt.g:5591:3: (a0= TEXT )
            	    // Bt.g:5592:4: a0= TEXT
            	    {
            	    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4403); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createTraceabilityLink();
            	      					incompleteObjects.push(element);
            	      					// initialize enumeration attribute
            	      					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.ORIGINAL_VALUE).getInstance();
            	      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
            	      				}
            	      				if (a0 != null) {
            	      					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	      					tokenResolver.setOptions(getOptions());
            	      					org.be.textbe.bt.v1.textbt.resource.bt.IBtTokenResolveResult result = getFreshTokenResolveResult();
            	      					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__REQUIREMENT), result);
            	      					Object resolvedObject = result.getResolvedToken();
            	      					if (resolvedObject == null) {
            	      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
            	      					}
            	      					String resolved = (String) resolvedObject;
            	      					org.be.textbe.bt.v1.textbt.Requirement proxy = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createRequirement();
            	      					collectHiddenTokens(element);
            	      					registerContextDependentProxy(new org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtContextDependentURIFragmentFactory<org.be.textbe.bt.v1.textbt.TraceabilityLink, org.be.textbe.bt.v1.textbt.Requirement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTraceabilityLinkRequirementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__REQUIREMENT), resolved, proxy);
            	      					if (proxy != null) {
            	      						Object value = proxy;
            	      						addObjectToList(element, org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__REQUIREMENT, value);
            	      						completedElement(value, false);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_25_0_0_0, proxy, true);
            	      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
            	      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 151);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 151);
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 151);
              	
            }
            // Bt.g:5637:2: ( ( (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )? ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44||(LA59_0>=50 && LA59_0<=53)) ) {
                alt59=1;
            }
            else if ( (LA59_0==TEXT) ) {
                int LA59_2 = input.LA(2);

                if ( (synpred76_Bt()) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // Bt.g:5638:3: ( (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )? )
                    {
                    // Bt.g:5638:3: ( (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )? )
                    // Bt.g:5639:4: (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )?
                    {
                    // Bt.g:5639:4: (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )?
                    int alt58=6;
                    switch ( input.LA(1) ) {
                        case 50:
                            {
                            alt58=1;
                            }
                            break;
                        case 51:
                            {
                            alt58=2;
                            }
                            break;
                        case 52:
                            {
                            alt58=3;
                            }
                            break;
                        case 44:
                            {
                            alt58=4;
                            }
                            break;
                        case 53:
                            {
                            alt58=5;
                            }
                            break;
                    }

                    switch (alt58) {
                        case 1 :
                            // Bt.g:5640:5: a1= '+'
                            {
                            a1=(Token)match(input,50,FOLLOW_50_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4448); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createTraceabilityLink();
                              						incompleteObjects.push(element);
                              						// initialize enumeration attribute
                              						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.ORIGINAL_VALUE).getInstance();
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_25_0_0_1, null, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                              					// set value of enumeration attribute
                              					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.IMPLIED_VALUE).getInstance();
                              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					completedElement(value, false);
                              				
                            }

                            }
                            break;
                        case 2 :
                            // Bt.g:5656:10: a2= '-'
                            {
                            a2=(Token)match(input,51,FOLLOW_51_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4465); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createTraceabilityLink();
                              						incompleteObjects.push(element);
                              						// initialize enumeration attribute
                              						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.ORIGINAL_VALUE).getInstance();
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_25_0_0_1, null, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                              					// set value of enumeration attribute
                              					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.MISSING_VALUE).getInstance();
                              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					completedElement(value, false);
                              				
                            }

                            }
                            break;
                        case 3 :
                            // Bt.g:5672:10: a3= '++'
                            {
                            a3=(Token)match(input,52,FOLLOW_52_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4482); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createTraceabilityLink();
                              						incompleteObjects.push(element);
                              						// initialize enumeration attribute
                              						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.ORIGINAL_VALUE).getInstance();
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_25_0_0_1, null, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                              					// set value of enumeration attribute
                              					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.UPDATED_VALUE).getInstance();
                              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					completedElement(value, false);
                              				
                            }

                            }
                            break;
                        case 4 :
                            // Bt.g:5688:10: a4= '--'
                            {
                            a4=(Token)match(input,44,FOLLOW_44_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4499); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createTraceabilityLink();
                              						incompleteObjects.push(element);
                              						// initialize enumeration attribute
                              						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.ORIGINAL_VALUE).getInstance();
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_25_0_0_1, null, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                              					// set value of enumeration attribute
                              					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.DELETED_VALUE).getInstance();
                              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					completedElement(value, false);
                              				
                            }

                            }
                            break;
                        case 5 :
                            // Bt.g:5704:10: a5= '+-'
                            {
                            a5=(Token)match(input,53,FOLLOW_53_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4516); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createTraceabilityLink();
                              						incompleteObjects.push(element);
                              						// initialize enumeration attribute
                              						Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.ORIGINAL_VALUE).getInstance();
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_25_0_0_1, null, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                              					// set value of enumeration attribute
                              					Object value = org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityStatus().getEEnumLiteral(org.be.textbe.bt.v1.textbt.TraceabilityStatus.REFINED_VALUE).getInstance();
                              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bt.v1.textbt.TextbtPackage.TRACEABILITY_LINK__STATUS), value);
                              					completedElement(value, false);
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 152);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, parse_org_be_textbe_bt_v1_textbt_TraceabilityLink_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_TraceabilityLink"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Sequence"
    // Bt.g:5729:1: parse_org_be_textbe_bt_v1_textbt_Sequence returns [org.be.textbe.bt.v1.textbt.Sequence element = null] : (c0= parse_org_be_textbe_bt_v1_textbt_Atomic | c1= parse_org_be_textbe_bt_v1_textbt_Interleaving );
    public final org.be.textbe.bt.v1.textbt.Sequence parse_org_be_textbe_bt_v1_textbt_Sequence() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Sequence element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Sequence_StartIndex = input.index();
        org.be.textbe.bt.v1.textbt.Atomic c0 = null;

        org.be.textbe.bt.v1.textbt.Interleaving c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // Bt.g:5730:1: (c0= parse_org_be_textbe_bt_v1_textbt_Atomic | c1= parse_org_be_textbe_bt_v1_textbt_Interleaving )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==31) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred77_Bt()) ) {
                    alt60=1;
                }
                else if ( (true) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // Bt.g:5731:2: c0= parse_org_be_textbe_bt_v1_textbt_Atomic
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Atomic_in_parse_org_be_textbe_bt_v1_textbt_Sequence4556);
                    c0=parse_org_be_textbe_bt_v1_textbt_Atomic();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Bt.g:5732:4: c1= parse_org_be_textbe_bt_v1_textbt_Interleaving
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Interleaving_in_parse_org_be_textbe_bt_v1_textbt_Sequence4566);
                    c1=parse_org_be_textbe_bt_v1_textbt_Interleaving();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, parse_org_be_textbe_bt_v1_textbt_Sequence_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Sequence"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Behavior"
    // Bt.g:5736:1: parse_org_be_textbe_bt_v1_textbt_Behavior returns [org.be.textbe.bt.v1.textbt.Behavior element = null] : (c0= parse_org_be_textbe_bt_v1_textbt_Event | c1= parse_org_be_textbe_bt_v1_textbt_InternalInput | c2= parse_org_be_textbe_bt_v1_textbt_ExternalInput | c3= parse_org_be_textbe_bt_v1_textbt_InternalOutput | c4= parse_org_be_textbe_bt_v1_textbt_ExternalOutput | c5= parse_org_be_textbe_bt_v1_textbt_StateRealization | c6= parse_org_be_textbe_bt_v1_textbt_AttributeRealization | c7= parse_org_be_textbe_bt_v1_textbt_Selection | c8= parse_org_be_textbe_bt_v1_textbt_Guard | c9= parse_org_be_textbe_bt_v1_textbt_Assertion );
    public final org.be.textbe.bt.v1.textbt.Behavior parse_org_be_textbe_bt_v1_textbt_Behavior() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Behavior element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Behavior_StartIndex = input.index();
        org.be.textbe.bt.v1.textbt.Event c0 = null;

        org.be.textbe.bt.v1.textbt.InternalInput c1 = null;

        org.be.textbe.bt.v1.textbt.ExternalInput c2 = null;

        org.be.textbe.bt.v1.textbt.InternalOutput c3 = null;

        org.be.textbe.bt.v1.textbt.ExternalOutput c4 = null;

        org.be.textbe.bt.v1.textbt.StateRealization c5 = null;

        org.be.textbe.bt.v1.textbt.AttributeRealization c6 = null;

        org.be.textbe.bt.v1.textbt.Selection c7 = null;

        org.be.textbe.bt.v1.textbt.Guard c8 = null;

        org.be.textbe.bt.v1.textbt.Assertion c9 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // Bt.g:5737:1: (c0= parse_org_be_textbe_bt_v1_textbt_Event | c1= parse_org_be_textbe_bt_v1_textbt_InternalInput | c2= parse_org_be_textbe_bt_v1_textbt_ExternalInput | c3= parse_org_be_textbe_bt_v1_textbt_InternalOutput | c4= parse_org_be_textbe_bt_v1_textbt_ExternalOutput | c5= parse_org_be_textbe_bt_v1_textbt_StateRealization | c6= parse_org_be_textbe_bt_v1_textbt_AttributeRealization | c7= parse_org_be_textbe_bt_v1_textbt_Selection | c8= parse_org_be_textbe_bt_v1_textbt_Guard | c9= parse_org_be_textbe_bt_v1_textbt_Assertion )
            int alt61=10;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // Bt.g:5738:2: c0= parse_org_be_textbe_bt_v1_textbt_Event
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Event_in_parse_org_be_textbe_bt_v1_textbt_Behavior4587);
                    c0=parse_org_be_textbe_bt_v1_textbt_Event();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Bt.g:5739:4: c1= parse_org_be_textbe_bt_v1_textbt_InternalInput
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalInput_in_parse_org_be_textbe_bt_v1_textbt_Behavior4597);
                    c1=parse_org_be_textbe_bt_v1_textbt_InternalInput();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Bt.g:5740:4: c2= parse_org_be_textbe_bt_v1_textbt_ExternalInput
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalInput_in_parse_org_be_textbe_bt_v1_textbt_Behavior4607);
                    c2=parse_org_be_textbe_bt_v1_textbt_ExternalInput();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Bt.g:5741:4: c3= parse_org_be_textbe_bt_v1_textbt_InternalOutput
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalOutput_in_parse_org_be_textbe_bt_v1_textbt_Behavior4617);
                    c3=parse_org_be_textbe_bt_v1_textbt_InternalOutput();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Bt.g:5742:4: c4= parse_org_be_textbe_bt_v1_textbt_ExternalOutput
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalOutput_in_parse_org_be_textbe_bt_v1_textbt_Behavior4627);
                    c4=parse_org_be_textbe_bt_v1_textbt_ExternalOutput();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Bt.g:5743:4: c5= parse_org_be_textbe_bt_v1_textbt_StateRealization
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_StateRealization_in_parse_org_be_textbe_bt_v1_textbt_Behavior4637);
                    c5=parse_org_be_textbe_bt_v1_textbt_StateRealization();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // Bt.g:5744:4: c6= parse_org_be_textbe_bt_v1_textbt_AttributeRealization
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_AttributeRealization_in_parse_org_be_textbe_bt_v1_textbt_Behavior4647);
                    c6=parse_org_be_textbe_bt_v1_textbt_AttributeRealization();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 8 :
                    // Bt.g:5745:4: c7= parse_org_be_textbe_bt_v1_textbt_Selection
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Selection_in_parse_org_be_textbe_bt_v1_textbt_Behavior4657);
                    c7=parse_org_be_textbe_bt_v1_textbt_Selection();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 9 :
                    // Bt.g:5746:4: c8= parse_org_be_textbe_bt_v1_textbt_Guard
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Guard_in_parse_org_be_textbe_bt_v1_textbt_Behavior4667);
                    c8=parse_org_be_textbe_bt_v1_textbt_Guard();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 10 :
                    // Bt.g:5747:4: c9= parse_org_be_textbe_bt_v1_textbt_Assertion
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Assertion_in_parse_org_be_textbe_bt_v1_textbt_Behavior4677);
                    c9=parse_org_be_textbe_bt_v1_textbt_Assertion();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, parse_org_be_textbe_bt_v1_textbt_Behavior_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Behavior"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_Relation"
    // Bt.g:5751:1: parse_org_be_textbe_bt_v1_textbt_Relation returns [org.be.textbe.bt.v1.textbt.Relation element = null] : (c0= parse_org_be_textbe_bt_v1_textbt_What | c1= parse_org_be_textbe_bt_v1_textbt_Who | c2= parse_org_be_textbe_bt_v1_textbt_Why | c3= parse_org_be_textbe_bt_v1_textbt_How | c4= parse_org_be_textbe_bt_v1_textbt_Where | c5= parse_org_be_textbe_bt_v1_textbt_When );
    public final org.be.textbe.bt.v1.textbt.Relation parse_org_be_textbe_bt_v1_textbt_Relation() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.Relation element =  null;
        int parse_org_be_textbe_bt_v1_textbt_Relation_StartIndex = input.index();
        org.be.textbe.bt.v1.textbt.What c0 = null;

        org.be.textbe.bt.v1.textbt.Who c1 = null;

        org.be.textbe.bt.v1.textbt.Why c2 = null;

        org.be.textbe.bt.v1.textbt.How c3 = null;

        org.be.textbe.bt.v1.textbt.Where c4 = null;

        org.be.textbe.bt.v1.textbt.When c5 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // Bt.g:5752:1: (c0= parse_org_be_textbe_bt_v1_textbt_What | c1= parse_org_be_textbe_bt_v1_textbt_Who | c2= parse_org_be_textbe_bt_v1_textbt_Why | c3= parse_org_be_textbe_bt_v1_textbt_How | c4= parse_org_be_textbe_bt_v1_textbt_Where | c5= parse_org_be_textbe_bt_v1_textbt_When )
            int alt62=6;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // Bt.g:5753:2: c0= parse_org_be_textbe_bt_v1_textbt_What
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_What_in_parse_org_be_textbe_bt_v1_textbt_Relation4698);
                    c0=parse_org_be_textbe_bt_v1_textbt_What();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Bt.g:5754:4: c1= parse_org_be_textbe_bt_v1_textbt_Who
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Who_in_parse_org_be_textbe_bt_v1_textbt_Relation4708);
                    c1=parse_org_be_textbe_bt_v1_textbt_Who();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Bt.g:5755:4: c2= parse_org_be_textbe_bt_v1_textbt_Why
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Why_in_parse_org_be_textbe_bt_v1_textbt_Relation4718);
                    c2=parse_org_be_textbe_bt_v1_textbt_Why();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Bt.g:5756:4: c3= parse_org_be_textbe_bt_v1_textbt_How
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_How_in_parse_org_be_textbe_bt_v1_textbt_Relation4728);
                    c3=parse_org_be_textbe_bt_v1_textbt_How();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Bt.g:5757:4: c4= parse_org_be_textbe_bt_v1_textbt_Where
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Where_in_parse_org_be_textbe_bt_v1_textbt_Relation4738);
                    c4=parse_org_be_textbe_bt_v1_textbt_Where();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Bt.g:5758:4: c5= parse_org_be_textbe_bt_v1_textbt_When
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_When_in_parse_org_be_textbe_bt_v1_textbt_Relation4748);
                    c5=parse_org_be_textbe_bt_v1_textbt_When();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, parse_org_be_textbe_bt_v1_textbt_Relation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_Relation"


    // $ANTLR start "parse_org_be_textbe_bt_v1_textbt_BehaviorTree"
    // Bt.g:5762:1: parse_org_be_textbe_bt_v1_textbt_BehaviorTree returns [org.be.textbe.bt.v1.textbt.BehaviorTree element = null] : (c0= parse_org_be_textbe_bt_v1_textbt_Atomic | c1= parse_org_be_textbe_bt_v1_textbt_Interleaving | c2= parse_org_be_textbe_bt_v1_textbt_Alternative | c3= parse_org_be_textbe_bt_v1_textbt_Parallel );
    public final org.be.textbe.bt.v1.textbt.BehaviorTree parse_org_be_textbe_bt_v1_textbt_BehaviorTree() throws RecognitionException {
        org.be.textbe.bt.v1.textbt.BehaviorTree element =  null;
        int parse_org_be_textbe_bt_v1_textbt_BehaviorTree_StartIndex = input.index();
        org.be.textbe.bt.v1.textbt.Atomic c0 = null;

        org.be.textbe.bt.v1.textbt.Interleaving c1 = null;

        org.be.textbe.bt.v1.textbt.Alternative c2 = null;

        org.be.textbe.bt.v1.textbt.Parallel c3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // Bt.g:5763:1: (c0= parse_org_be_textbe_bt_v1_textbt_Atomic | c1= parse_org_be_textbe_bt_v1_textbt_Interleaving | c2= parse_org_be_textbe_bt_v1_textbt_Alternative | c3= parse_org_be_textbe_bt_v1_textbt_Parallel )
            int alt63=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                int LA63_1 = input.LA(2);

                if ( (synpred92_Bt()) ) {
                    alt63=1;
                }
                else if ( (synpred93_Bt()) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt63=3;
                }
                break;
            case 36:
                {
                alt63=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // Bt.g:5764:2: c0= parse_org_be_textbe_bt_v1_textbt_Atomic
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Atomic_in_parse_org_be_textbe_bt_v1_textbt_BehaviorTree4769);
                    c0=parse_org_be_textbe_bt_v1_textbt_Atomic();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Bt.g:5765:4: c1= parse_org_be_textbe_bt_v1_textbt_Interleaving
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Interleaving_in_parse_org_be_textbe_bt_v1_textbt_BehaviorTree4779);
                    c1=parse_org_be_textbe_bt_v1_textbt_Interleaving();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Bt.g:5766:4: c2= parse_org_be_textbe_bt_v1_textbt_Alternative
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Alternative_in_parse_org_be_textbe_bt_v1_textbt_BehaviorTree4789);
                    c2=parse_org_be_textbe_bt_v1_textbt_Alternative();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Bt.g:5767:4: c3= parse_org_be_textbe_bt_v1_textbt_Parallel
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Parallel_in_parse_org_be_textbe_bt_v1_textbt_BehaviorTree4799);
                    c3=parse_org_be_textbe_bt_v1_textbt_Parallel();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, parse_org_be_textbe_bt_v1_textbt_BehaviorTree_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_bt_v1_textbt_BehaviorTree"

    // $ANTLR start synpred22_Bt
    public final void synpred22_Bt_fragment() throws RecognitionException {   
        Token a1=null;

        // Bt.g:2758:4: (a1= '/' )
        // Bt.g:2758:4: a1= '/'
        {
        a1=(Token)match(input,24,FOLLOW_24_in_synpred22_Bt1907); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_Bt

    // $ANTLR start synpred26_Bt
    public final void synpred26_Bt_fragment() throws RecognitionException {   
        Token a1=null;

        // Bt.g:3052:4: (a1= '/' )
        // Bt.g:3052:4: a1= '/'
        {
        a1=(Token)match(input,24,FOLLOW_24_in_synpred26_Bt2136); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Bt

    // $ANTLR start synpred30_Bt
    public final void synpred30_Bt_fragment() throws RecognitionException {   
        Token a1=null;

        // Bt.g:3346:4: (a1= '/' )
        // Bt.g:3346:4: a1= '/'
        {
        a1=(Token)match(input,24,FOLLOW_24_in_synpred30_Bt2365); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Bt

    // $ANTLR start synpred34_Bt
    public final void synpred34_Bt_fragment() throws RecognitionException {   
        Token a1=null;

        // Bt.g:3640:4: (a1= '/' )
        // Bt.g:3640:4: a1= '/'
        {
        a1=(Token)match(input,24,FOLLOW_24_in_synpred34_Bt2594); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Bt

    // $ANTLR start synpred38_Bt
    public final void synpred38_Bt_fragment() throws RecognitionException {   
        Token a1=null;

        // Bt.g:3934:4: (a1= '/' )
        // Bt.g:3934:4: a1= '/'
        {
        a1=(Token)match(input,24,FOLLOW_24_in_synpred38_Bt2823); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Bt

    // $ANTLR start synpred42_Bt
    public final void synpred42_Bt_fragment() throws RecognitionException {   
        Token a1=null;

        // Bt.g:4228:4: (a1= '/' )
        // Bt.g:4228:4: a1= '/'
        {
        a1=(Token)match(input,24,FOLLOW_24_in_synpred42_Bt3052); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_Bt

    // $ANTLR start synpred69_Bt
    public final void synpred69_Bt_fragment() throws RecognitionException {   
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;

        // Bt.g:5424:3: ( ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? ) )
        // Bt.g:5424:3: ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? )
        {
        // Bt.g:5424:3: ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? )
        // Bt.g:5425:4: (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )?
        {
        // Bt.g:5425:4: (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )?
        int alt78=10;
        switch ( input.LA(1) ) {
            case 41:
                {
                alt78=1;
                }
                break;
            case 42:
                {
                alt78=2;
                }
                break;
            case 43:
                {
                alt78=3;
                }
                break;
            case 44:
                {
                alt78=4;
                }
                break;
            case 45:
                {
                alt78=5;
                }
                break;
            case 46:
                {
                alt78=6;
                }
                break;
            case 47:
                {
                alt78=7;
                }
                break;
            case 48:
                {
                alt78=8;
                }
                break;
            case 49:
                {
                alt78=9;
                }
                break;
        }

        switch (alt78) {
            case 1 :
                // Bt.g:5426:5: a9= '^'
                {
                a9=(Token)match(input,41,FOLLOW_41_in_synpred69_Bt4214); if (state.failed) return ;

                }
                break;
            case 2 :
                // Bt.g:5442:10: a10= '='
                {
                a10=(Token)match(input,42,FOLLOW_42_in_synpred69_Bt4231); if (state.failed) return ;

                }
                break;
            case 3 :
                // Bt.g:5458:10: a11= '=>'
                {
                a11=(Token)match(input,43,FOLLOW_43_in_synpred69_Bt4248); if (state.failed) return ;

                }
                break;
            case 4 :
                // Bt.g:5474:10: a12= '--'
                {
                a12=(Token)match(input,44,FOLLOW_44_in_synpred69_Bt4265); if (state.failed) return ;

                }
                break;
            case 5 :
                // Bt.g:5490:10: a13= '\\u0025'
                {
                a13=(Token)match(input,45,FOLLOW_45_in_synpred69_Bt4282); if (state.failed) return ;

                }
                break;
            case 6 :
                // Bt.g:5506:10: a14= '^^'
                {
                a14=(Token)match(input,46,FOLLOW_46_in_synpred69_Bt4299); if (state.failed) return ;

                }
                break;
            case 7 :
                // Bt.g:5522:10: a15= 'XOR'
                {
                a15=(Token)match(input,47,FOLLOW_47_in_synpred69_Bt4316); if (state.failed) return ;

                }
                break;
            case 8 :
                // Bt.g:5538:10: a16= '|'
                {
                a16=(Token)match(input,48,FOLLOW_48_in_synpred69_Bt4333); if (state.failed) return ;

                }
                break;
            case 9 :
                // Bt.g:5554:10: a17= '&'
                {
                a17=(Token)match(input,49,FOLLOW_49_in_synpred69_Bt4350); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred69_Bt

    // $ANTLR start synpred76_Bt
    public final void synpred76_Bt_fragment() throws RecognitionException {   
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;

        // Bt.g:5638:3: ( ( (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )? ) )
        // Bt.g:5638:3: ( (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )? )
        {
        // Bt.g:5638:3: ( (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )? )
        // Bt.g:5639:4: (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )?
        {
        // Bt.g:5639:4: (a1= '+' | a2= '-' | a3= '++' | a4= '--' | a5= '+-' )?
        int alt79=6;
        switch ( input.LA(1) ) {
            case 50:
                {
                alt79=1;
                }
                break;
            case 51:
                {
                alt79=2;
                }
                break;
            case 52:
                {
                alt79=3;
                }
                break;
            case 44:
                {
                alt79=4;
                }
                break;
            case 53:
                {
                alt79=5;
                }
                break;
        }

        switch (alt79) {
            case 1 :
                // Bt.g:5640:5: a1= '+'
                {
                a1=(Token)match(input,50,FOLLOW_50_in_synpred76_Bt4448); if (state.failed) return ;

                }
                break;
            case 2 :
                // Bt.g:5656:10: a2= '-'
                {
                a2=(Token)match(input,51,FOLLOW_51_in_synpred76_Bt4465); if (state.failed) return ;

                }
                break;
            case 3 :
                // Bt.g:5672:10: a3= '++'
                {
                a3=(Token)match(input,52,FOLLOW_52_in_synpred76_Bt4482); if (state.failed) return ;

                }
                break;
            case 4 :
                // Bt.g:5688:10: a4= '--'
                {
                a4=(Token)match(input,44,FOLLOW_44_in_synpred76_Bt4499); if (state.failed) return ;

                }
                break;
            case 5 :
                // Bt.g:5704:10: a5= '+-'
                {
                a5=(Token)match(input,53,FOLLOW_53_in_synpred76_Bt4516); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred76_Bt

    // $ANTLR start synpred77_Bt
    public final void synpred77_Bt_fragment() throws RecognitionException {   
        org.be.textbe.bt.v1.textbt.Atomic c0 = null;


        // Bt.g:5731:2: (c0= parse_org_be_textbe_bt_v1_textbt_Atomic )
        // Bt.g:5731:2: c0= parse_org_be_textbe_bt_v1_textbt_Atomic
        {
        pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Atomic_in_synpred77_Bt4556);
        c0=parse_org_be_textbe_bt_v1_textbt_Atomic();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_Bt

    // $ANTLR start synpred78_Bt
    public final void synpred78_Bt_fragment() throws RecognitionException {   
        org.be.textbe.bt.v1.textbt.Event c0 = null;


        // Bt.g:5738:2: (c0= parse_org_be_textbe_bt_v1_textbt_Event )
        // Bt.g:5738:2: c0= parse_org_be_textbe_bt_v1_textbt_Event
        {
        pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Event_in_synpred78_Bt4587);
        c0=parse_org_be_textbe_bt_v1_textbt_Event();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_Bt

    // $ANTLR start synpred79_Bt
    public final void synpred79_Bt_fragment() throws RecognitionException {   
        org.be.textbe.bt.v1.textbt.InternalInput c1 = null;


        // Bt.g:5739:4: (c1= parse_org_be_textbe_bt_v1_textbt_InternalInput )
        // Bt.g:5739:4: c1= parse_org_be_textbe_bt_v1_textbt_InternalInput
        {
        pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalInput_in_synpred79_Bt4597);
        c1=parse_org_be_textbe_bt_v1_textbt_InternalInput();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_Bt

    // $ANTLR start synpred80_Bt
    public final void synpred80_Bt_fragment() throws RecognitionException {   
        org.be.textbe.bt.v1.textbt.ExternalInput c2 = null;


        // Bt.g:5740:4: (c2= parse_org_be_textbe_bt_v1_textbt_ExternalInput )
        // Bt.g:5740:4: c2= parse_org_be_textbe_bt_v1_textbt_ExternalInput
        {
        pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalInput_in_synpred80_Bt4607);
        c2=parse_org_be_textbe_bt_v1_textbt_ExternalInput();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_Bt

    // $ANTLR start synpred81_Bt
    public final void synpred81_Bt_fragment() throws RecognitionException {   
        org.be.textbe.bt.v1.textbt.InternalOutput c3 = null;


        // Bt.g:5741:4: (c3= parse_org_be_textbe_bt_v1_textbt_InternalOutput )
        // Bt.g:5741:4: c3= parse_org_be_textbe_bt_v1_textbt_InternalOutput
        {
        pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalOutput_in_synpred81_Bt4617);
        c3=parse_org_be_textbe_bt_v1_textbt_InternalOutput();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_Bt

    // $ANTLR start synpred82_Bt
    public final void synpred82_Bt_fragment() throws RecognitionException {   
        org.be.textbe.bt.v1.textbt.ExternalOutput c4 = null;


        // Bt.g:5742:4: (c4= parse_org_be_textbe_bt_v1_textbt_ExternalOutput )
        // Bt.g:5742:4: c4= parse_org_be_textbe_bt_v1_textbt_ExternalOutput
        {
        pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalOutput_in_synpred82_Bt4627);
        c4=parse_org_be_textbe_bt_v1_textbt_ExternalOutput();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_Bt

    // $ANTLR start synpred92_Bt
    public final void synpred92_Bt_fragment() throws RecognitionException {   
        org.be.textbe.bt.v1.textbt.Atomic c0 = null;


        // Bt.g:5764:2: (c0= parse_org_be_textbe_bt_v1_textbt_Atomic )
        // Bt.g:5764:2: c0= parse_org_be_textbe_bt_v1_textbt_Atomic
        {
        pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Atomic_in_synpred92_Bt4769);
        c0=parse_org_be_textbe_bt_v1_textbt_Atomic();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_Bt

    // $ANTLR start synpred93_Bt
    public final void synpred93_Bt_fragment() throws RecognitionException {   
        org.be.textbe.bt.v1.textbt.Interleaving c1 = null;


        // Bt.g:5765:4: (c1= parse_org_be_textbe_bt_v1_textbt_Interleaving )
        // Bt.g:5765:4: c1= parse_org_be_textbe_bt_v1_textbt_Interleaving
        {
        pushFollow(FOLLOW_parse_org_be_textbe_bt_v1_textbt_Interleaving_in_synpred93_Bt4779);
        c1=parse_org_be_textbe_bt_v1_textbt_Interleaving();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_Bt

    // Delegated rules

    public final boolean synpred93_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_Bt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_Bt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA55 dfa55 = new DFA55(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String DFA55_eotS =
        "\12\uffff";
    static final String DFA55_eofS =
        "\1\10\11\uffff";
    static final String DFA55_minS =
        "\1\37\1\uffff\7\0\1\uffff";
    static final String DFA55_maxS =
        "\1\61\1\uffff\7\0\1\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA55_specialS =
        "\2\uffff\1\2\1\1\1\6\1\5\1\0\1\4\1\3\1\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\3\1\2\1\6\1\7\1\4\1\5\4\uffff\11\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "5423:2: ( ( (a9= '^' | a10= '=' | a11= '=>' | a12= '--' | a13= '\\u0025' | a14= '^^' | a15= 'XOR' | a16= '|' | a17= '&' )? ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_6 = input.LA(1);

                         
                        int index55_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Bt()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index55_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Bt()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Bt()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_8 = input.LA(1);

                         
                        int index55_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Bt()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index55_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Bt()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_5 = input.LA(1);

                         
                        int index55_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Bt()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index55_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Bt()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\27\uffff";
    static final String DFA61_eofS =
        "\27\uffff";
    static final String DFA61_minS =
        "\1\13\1\uffff\4\4\5\uffff\4\4\4\0\4\uffff";
    static final String DFA61_maxS =
        "\1\26\1\uffff\4\4\5\uffff\4\4\4\0\4\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\4\uffff\1\6\1\7\1\10\1\11\1\12\10\uffff\1\2\1\3\1"+
        "\4\1\5";
    static final String DFA61_specialS =
        "\17\uffff\1\3\1\2\1\0\1\1\4\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\7\1\10\1\11\1\12",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "5736:1: parse_org_be_textbe_bt_v1_textbt_Behavior returns [org.be.textbe.bt.v1.textbt.Behavior element = null] : (c0= parse_org_be_textbe_bt_v1_textbt_Event | c1= parse_org_be_textbe_bt_v1_textbt_InternalInput | c2= parse_org_be_textbe_bt_v1_textbt_ExternalInput | c3= parse_org_be_textbe_bt_v1_textbt_InternalOutput | c4= parse_org_be_textbe_bt_v1_textbt_ExternalOutput | c5= parse_org_be_textbe_bt_v1_textbt_StateRealization | c6= parse_org_be_textbe_bt_v1_textbt_AttributeRealization | c7= parse_org_be_textbe_bt_v1_textbt_Selection | c8= parse_org_be_textbe_bt_v1_textbt_Guard | c9= parse_org_be_textbe_bt_v1_textbt_Assertion );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_17 = input.LA(1);

                         
                        int index61_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_Bt()) ) {s = 1;}

                        else if ( (synpred81_Bt()) ) {s = 21;}

                         
                        input.seek(index61_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_18 = input.LA(1);

                         
                        int index61_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_Bt()) ) {s = 1;}

                        else if ( (synpred82_Bt()) ) {s = 22;}

                         
                        input.seek(index61_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_16 = input.LA(1);

                         
                        int index61_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_Bt()) ) {s = 1;}

                        else if ( (synpred80_Bt()) ) {s = 20;}

                         
                        input.seek(index61_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA61_15 = input.LA(1);

                         
                        int index61_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_Bt()) ) {s = 1;}

                        else if ( (synpred79_Bt()) ) {s = 19;}

                         
                        input.seek(index61_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\12\uffff";
    static final String DFA62_eofS =
        "\12\uffff";
    static final String DFA62_minS =
        "\1\27\2\30\6\uffff\1\30";
    static final String DFA62_maxS =
        "\1\27\2\36\6\uffff\1\36";
    static final String DFA62_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff";
    static final String DFA62_specialS =
        "\12\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1",
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\11\1\3\1\4\1\5\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\3\1\4\1\5\1\6\1\7\1\10"
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "5751:1: parse_org_be_textbe_bt_v1_textbt_Relation returns [org.be.textbe.bt.v1.textbt.Relation element = null] : (c0= parse_org_be_textbe_bt_v1_textbt_What | c1= parse_org_be_textbe_bt_v1_textbt_Who | c2= parse_org_be_textbe_bt_v1_textbt_Why | c3= parse_org_be_textbe_bt_v1_textbt_How | c4= parse_org_be_textbe_bt_v1_textbt_Where | c5= parse_org_be_textbe_bt_v1_textbt_When );";
        }
    }
 

    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Specification_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_parse_org_be_textbe_bt_v1_textbt_Specification115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Requirement_in_parse_org_be_textbe_bt_v1_textbt_Specification138 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Component_in_parse_org_be_textbe_bt_v1_textbt_Specification173 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_8_in_parse_org_be_textbe_bt_v1_textbt_Specification208 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Sequence_in_parse_org_be_textbe_bt_v1_textbt_Specification234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Requirement294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Requirement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_parse_org_be_textbe_bt_v1_textbt_Component355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Component373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Component398 = new BitSet(new long[]{0x000000000079F802L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Behavior_in_parse_org_be_textbe_bt_v1_textbt_Component428 = new BitSet(new long[]{0x000000000079F802L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_SystemComponent_in_parse_org_be_textbe_bt_v1_textbt_Component459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_parse_org_be_textbe_bt_v1_textbt_SystemComponent484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_SystemComponent502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_SystemComponent527 = new BitSet(new long[]{0x000000000079F802L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Behavior_in_parse_org_be_textbe_bt_v1_textbt_SystemComponent557 = new BitSet(new long[]{0x000000000079F802L});
    public static final BitSet FOLLOW_11_in_parse_org_be_textbe_bt_v1_textbt_Event598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Event616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Event641 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_Event671 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalInput_in_parse_org_be_textbe_bt_v1_textbt_Event702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalInput_in_parse_org_be_textbe_bt_v1_textbt_Event712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalOutput_in_parse_org_be_textbe_bt_v1_textbt_Event722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalOutput_in_parse_org_be_textbe_bt_v1_textbt_Event732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_org_be_textbe_bt_v1_textbt_InternalInput757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_InternalInput775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_InternalInput800 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_InternalInput830 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13_in_parse_org_be_textbe_bt_v1_textbt_ExternalInput871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_ExternalInput889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_ExternalInput914 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_ExternalInput944 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14_in_parse_org_be_textbe_bt_v1_textbt_InternalOutput985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_InternalOutput1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_InternalOutput1028 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_InternalOutput1058 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15_in_parse_org_be_textbe_bt_v1_textbt_ExternalOutput1099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_ExternalOutput1117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_ExternalOutput1142 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_ExternalOutput1172 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1256 = new BitSet(new long[]{0x0000000000820002L});
    public static final BitSet FOLLOW_17_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1312 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1345 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_StateRealization1387 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19_in_parse_org_be_textbe_bt_v1_textbt_AttributeRealization1428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_AttributeRealization1446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_AttributeRealization1471 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_AttributeRealization1501 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20_in_parse_org_be_textbe_bt_v1_textbt_Selection1542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Selection1560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Selection1585 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_Selection1615 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21_in_parse_org_be_textbe_bt_v1_textbt_Guard1656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Guard1674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Guard1699 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_Guard1729 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22_in_parse_org_be_textbe_bt_v1_textbt_Assertion1770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Assertion1788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Assertion1813 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Relation_in_parse_org_be_textbe_bt_v1_textbt_Assertion1843 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_What1884 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_What1907 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_What1937 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_parse_org_be_textbe_bt_v1_textbt_What1970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_What1988 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_What2024 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_What2065 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_Who2113 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Who2136 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Who2166 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_parse_org_be_textbe_bt_v1_textbt_Who2199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Who2217 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Who2253 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Who2294 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_Why2342 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Why2365 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Why2395 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_27_in_parse_org_be_textbe_bt_v1_textbt_Why2428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Why2446 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Why2482 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Why2523 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_How2571 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_How2594 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_How2624 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_28_in_parse_org_be_textbe_bt_v1_textbt_How2657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_How2675 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_How2711 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_How2752 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_Where2800 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Where2823 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Where2853 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_29_in_parse_org_be_textbe_bt_v1_textbt_Where2886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Where2904 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Where2940 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_Where2981 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_23_in_parse_org_be_textbe_bt_v1_textbt_When3029 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_When3052 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_When3082 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_30_in_parse_org_be_textbe_bt_v1_textbt_When3115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_When3133 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_When3169 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_bt_v1_textbt_When3210 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_31_in_parse_org_be_textbe_bt_v1_textbt_Atomic3258 = new BitSet(new long[]{0x003C11E000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Node_in_parse_org_be_textbe_bt_v1_textbt_Atomic3276 = new BitSet(new long[]{0x0000001B80000000L});
    public static final BitSet FOLLOW_32_in_parse_org_be_textbe_bt_v1_textbt_Atomic3303 = new BitSet(new long[]{0x003C11E000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Node_in_parse_org_be_textbe_bt_v1_textbt_Atomic3329 = new BitSet(new long[]{0x0000001B80000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Interleaving_in_parse_org_be_textbe_bt_v1_textbt_Atomic3379 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Alternative_in_parse_org_be_textbe_bt_v1_textbt_Atomic3396 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Parallel_in_parse_org_be_textbe_bt_v1_textbt_Atomic3413 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_org_be_textbe_bt_v1_textbt_Atomic3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3468 = new BitSet(new long[]{0x003C11E000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Node_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3486 = new BitSet(new long[]{0x0000001E80000000L});
    public static final BitSet FOLLOW_34_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3513 = new BitSet(new long[]{0x003C11E000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Node_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3539 = new BitSet(new long[]{0x0000001E80000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Sequence_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3589 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Alternative_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3606 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Parallel_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3623 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_org_be_textbe_bt_v1_textbt_Interleaving3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_org_be_textbe_bt_v1_textbt_Alternative3678 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_org_be_textbe_bt_v1_textbt_Alternative3692 = new BitSet(new long[]{0x0000001880000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_BehaviorTree_in_parse_org_be_textbe_bt_v1_textbt_Alternative3710 = new BitSet(new long[]{0x0000001A80000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_BehaviorTree_in_parse_org_be_textbe_bt_v1_textbt_Alternative3743 = new BitSet(new long[]{0x0000001A80000000L});
    public static final BitSet FOLLOW_33_in_parse_org_be_textbe_bt_v1_textbt_Alternative3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_parse_org_be_textbe_bt_v1_textbt_Parallel3813 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_org_be_textbe_bt_v1_textbt_Parallel3827 = new BitSet(new long[]{0x0000001880000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_BehaviorTree_in_parse_org_be_textbe_bt_v1_textbt_Parallel3845 = new BitSet(new long[]{0x0000001A80000000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_BehaviorTree_in_parse_org_be_textbe_bt_v1_textbt_Parallel3878 = new BitSet(new long[]{0x0000001A80000000L});
    public static final BitSet FOLLOW_33_in_parse_org_be_textbe_bt_v1_textbt_Parallel3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_org_be_textbe_bt_v1_textbt_Node3957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Node3983 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_org_be_textbe_bt_v1_textbt_Node4016 = new BitSet(new long[]{0x003C10C000000010L});
    public static final BitSet FOLLOW_38_in_parse_org_be_textbe_bt_v1_textbt_Node4064 = new BitSet(new long[]{0x003C100000000010L});
    public static final BitSet FOLLOW_39_in_parse_org_be_textbe_bt_v1_textbt_Node4081 = new BitSet(new long[]{0x003C100000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink_in_parse_org_be_textbe_bt_v1_textbt_Node4119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_Node4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parse_org_be_textbe_bt_v1_textbt_Node4185 = new BitSet(new long[]{0x0003FE0000000002L});
    public static final BitSet FOLLOW_41_in_parse_org_be_textbe_bt_v1_textbt_Node4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_org_be_textbe_bt_v1_textbt_Node4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_org_be_textbe_bt_v1_textbt_Node4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_org_be_textbe_bt_v1_textbt_Node4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_org_be_textbe_bt_v1_textbt_Node4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_parse_org_be_textbe_bt_v1_textbt_Node4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parse_org_be_textbe_bt_v1_textbt_Node4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_parse_org_be_textbe_bt_v1_textbt_Node4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_parse_org_be_textbe_bt_v1_textbt_Node4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4403 = new BitSet(new long[]{0x003C100000000012L});
    public static final BitSet FOLLOW_50_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_parse_org_be_textbe_bt_v1_textbt_TraceabilityLink4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Atomic_in_parse_org_be_textbe_bt_v1_textbt_Sequence4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Interleaving_in_parse_org_be_textbe_bt_v1_textbt_Sequence4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Event_in_parse_org_be_textbe_bt_v1_textbt_Behavior4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalInput_in_parse_org_be_textbe_bt_v1_textbt_Behavior4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalInput_in_parse_org_be_textbe_bt_v1_textbt_Behavior4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalOutput_in_parse_org_be_textbe_bt_v1_textbt_Behavior4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalOutput_in_parse_org_be_textbe_bt_v1_textbt_Behavior4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_StateRealization_in_parse_org_be_textbe_bt_v1_textbt_Behavior4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_AttributeRealization_in_parse_org_be_textbe_bt_v1_textbt_Behavior4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Selection_in_parse_org_be_textbe_bt_v1_textbt_Behavior4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Guard_in_parse_org_be_textbe_bt_v1_textbt_Behavior4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Assertion_in_parse_org_be_textbe_bt_v1_textbt_Behavior4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_What_in_parse_org_be_textbe_bt_v1_textbt_Relation4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Who_in_parse_org_be_textbe_bt_v1_textbt_Relation4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Why_in_parse_org_be_textbe_bt_v1_textbt_Relation4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_How_in_parse_org_be_textbe_bt_v1_textbt_Relation4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Where_in_parse_org_be_textbe_bt_v1_textbt_Relation4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_When_in_parse_org_be_textbe_bt_v1_textbt_Relation4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Atomic_in_parse_org_be_textbe_bt_v1_textbt_BehaviorTree4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Interleaving_in_parse_org_be_textbe_bt_v1_textbt_BehaviorTree4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Alternative_in_parse_org_be_textbe_bt_v1_textbt_BehaviorTree4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Parallel_in_parse_org_be_textbe_bt_v1_textbt_BehaviorTree4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred22_Bt1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred26_Bt2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred30_Bt2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred34_Bt2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred38_Bt2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred42_Bt3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred69_Bt4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred69_Bt4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred69_Bt4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred69_Bt4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred69_Bt4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred69_Bt4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred69_Bt4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred69_Bt4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred69_Bt4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred76_Bt4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred76_Bt4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred76_Bt4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred76_Bt4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred76_Bt4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Atomic_in_synpred77_Bt4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Event_in_synpred78_Bt4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalInput_in_synpred79_Bt4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalInput_in_synpred80_Bt4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_InternalOutput_in_synpred81_Bt4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_ExternalOutput_in_synpred82_Bt4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Atomic_in_synpred92_Bt4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_bt_v1_textbt_Interleaving_in_synpred93_Bt4779 = new BitSet(new long[]{0x0000000000000002L});

}