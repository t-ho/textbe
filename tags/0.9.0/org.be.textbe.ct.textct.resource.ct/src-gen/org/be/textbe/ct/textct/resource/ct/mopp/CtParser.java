// $ANTLR ${project.version} ${buildNumber}

	package org.be.textbe.ct.textct.resource.ct.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class CtParser extends CtANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMPONENT", "TEXT", "REQUIREMENT", "BEHAVIOR", "COMPONENTNAME", "PERCENT", "DOUBLEMINUS", "EQUALS", "VALIDITY", "MCI", "OPERATORWITHLABEL", "STATE", "OPERATOR", "QUALIFIER", "LEVEL", "WHITESPACE", "LINEBREAK", "'#T'", "'<'", "'>'", "'<='", "'{'", "'}'", "'#OPTIONS'", "'#RT'", "'#C'", "'#SC'"
    };
    public static final int EOF=-1;
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
    public static final int COMPONENT=4;
    public static final int TEXT=5;
    public static final int REQUIREMENT=6;
    public static final int BEHAVIOR=7;
    public static final int COMPONENTNAME=8;
    public static final int PERCENT=9;
    public static final int DOUBLEMINUS=10;
    public static final int EQUALS=11;
    public static final int VALIDITY=12;
    public static final int MCI=13;
    public static final int OPERATORWITHLABEL=14;
    public static final int STATE=15;
    public static final int OPERATOR=16;
    public static final int QUALIFIER=17;
    public static final int LEVEL=18;
    public static final int WHITESPACE=19;
    public static final int LINEBREAK=20;

    // delegates
    // delegators


        public CtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[57+1];
             
             
        }
        

    public String[] getTokenNames() { return CtParser.tokenNames; }
    public String getGrammarFileName() { return "Ct.g"; }


    	private org.be.textbe.ct.textct.resource.ct.ICtTokenResolverFactory tokenResolverFactory = new org.be.textbe.ct.textct.resource.ct.mopp.CtTokenResolverFactory();
    	
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
    	private java.util.List<org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal> expectedElements = new java.util.ArrayList<org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal>();
    	
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
    		postParseCommands.add(new org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>() {
    			public boolean execute(org.be.textbe.ct.textct.resource.ct.ICtTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.be.textbe.ct.textct.resource.ct.ICtProblem() {
    					public org.be.textbe.ct.textct.resource.ct.CtEProblemSeverity getSeverity() {
    						return org.be.textbe.ct.textct.resource.ct.CtEProblemSeverity.ERROR;
    					}
    					public org.be.textbe.ct.textct.resource.ct.CtEProblemType getType() {
    						return org.be.textbe.ct.textct.resource.ct.CtEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.be.textbe.ct.textct.resource.ct.ICtExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal expectedElement = new org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal(terminal, followSetID, containmentTrace);
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
    		postParseCommands.add(new org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>() {
    			public boolean execute(org.be.textbe.ct.textct.resource.ct.ICtTextResource resource) {
    				org.be.textbe.ct.textct.resource.ct.ICtLocationMap locationMap = resource.getLocationMap();
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
    		postParseCommands.add(new org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>() {
    			public boolean execute(org.be.textbe.ct.textct.resource.ct.ICtTextResource resource) {
    				org.be.textbe.ct.textct.resource.ct.ICtLocationMap locationMap = resource.getLocationMap();
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
    	protected void setLocalizationEnd(java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>() {
    			public boolean execute(org.be.textbe.ct.textct.resource.ct.ICtTextResource resource) {
    				org.be.textbe.ct.textct.resource.ct.ICtLocationMap locationMap = resource.getLocationMap();
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
    	
    	public org.be.textbe.ct.textct.resource.ct.ICtTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new CtParser(new org.antlr.runtime3_3_0.CommonTokenStream(new CtLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new CtParser(new org.antlr.runtime3_3_0.CommonTokenStream(new CtLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			org.be.textbe.ct.textct.resource.ct.mopp.CtPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public CtParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((CtLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((CtLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.TextCT.class) {
    				return parse_org_be_textbe_ct_textct_TextCT();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.CompositionTree.class) {
    				return parse_org_be_textbe_ct_textct_CompositionTree();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.AggregatedNode.class) {
    				return parse_org_be_textbe_ct_textct_AggregatedNode();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.AssociatedNode.class) {
    				return parse_org_be_textbe_ct_textct_AssociatedNode();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.InheritedNode.class) {
    				return parse_org_be_textbe_ct_textct_InheritedNode();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.AggregatedBlock.class) {
    				return parse_org_be_textbe_ct_textct_AggregatedBlock();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.AssociatedBlock.class) {
    				return parse_org_be_textbe_ct_textct_AssociatedBlock();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.InheritedBlock.class) {
    				return parse_org_be_textbe_ct_textct_InheritedBlock();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.Node.class) {
    				return parse_org_be_textbe_ct_textct_Node();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.OptionList.class) {
    				return parse_org_be_textbe_ct_textct_OptionList();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.Option.class) {
    				return parse_org_be_textbe_ct_textct_Option();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.RequirementList.class) {
    				return parse_org_be_textbe_ct_textct_RequirementList();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.Requirement.class) {
    				return parse_org_be_textbe_ct_textct_Requirement();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.ComponentList.class) {
    				return parse_org_be_textbe_ct_textct_ComponentList();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.Component.class) {
    				return parse_org_be_textbe_ct_textct_Component();
    			}
    			if (type.getInstanceClass() == org.be.textbe.ct.textct.SystemComponent.class) {
    				return parse_org_be_textbe_ct_textct_SystemComponent();
    			}
    		}
    		throw new org.be.textbe.ct.textct.resource.ct.mopp.CtUnexpectedContentTypeException(typeObject);
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
    			typeObject = options.get(org.be.textbe.ct.textct.resource.ct.ICtOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.be.textbe.ct.textct.resource.ct.ICtParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>>();
    		org.be.textbe.ct.textct.resource.ct.mopp.CtParseResult parseResult = new org.be.textbe.ct.textct.resource.ct.mopp.CtParseResult();
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
    	
    	public java.util.List<org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.be.textbe.ct.textct.resource.ct.ICtTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
    		org.be.textbe.ct.textct.resource.ct.ICtParseResult result = parse();
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
    			for (org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal>();
    		java.util.List<org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal> newFollowSet = new java.util.ArrayList<org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 68;
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
    				for (org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.be.textbe.ct.textct.resource.ct.util.CtPair<org.be.textbe.ct.textct.resource.ct.ICtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.be.textbe.ct.textct.resource.ct.util.CtPair<org.be.textbe.ct.textct.resource.ct.ICtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							org.be.textbe.ct.textct.resource.ct.ICtExpectedElement newFollower = newFollowerPair.getLeft();
    							org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal newFollowTerminal = new org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
    		for (org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.be.textbe.ct.textct.resource.ct.mopp.CtExpectedTerminal expectedElement, int tokenIndex) {
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
    // Ct.g:508:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_be_textbe_ct_textct_TextCT ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        org.be.textbe.ct.textct.TextCT c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Ct.g:509:1: ( (c0= parse_org_be_textbe_ct_textct_TextCT ) EOF )
            // Ct.g:510:2: (c0= parse_org_be_textbe_ct_textct_TextCT ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_0, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_1, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Ct.g:520:2: (c0= parse_org_be_textbe_ct_textct_TextCT )
            // Ct.g:521:3: c0= parse_org_be_textbe_ct_textct_TextCT
            {
            pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_TextCT_in_start82);
            c0=parse_org_be_textbe_ct_textct_TextCT();

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


    // $ANTLR start "parse_org_be_textbe_ct_textct_TextCT"
    // Ct.g:529:1: parse_org_be_textbe_ct_textct_TextCT returns [org.be.textbe.ct.textct.TextCT element = null] : ( (a0_0= parse_org_be_textbe_ct_textct_OptionList ) )? ( (a1_0= parse_org_be_textbe_ct_textct_RequirementList ) )? ( (a2_0= parse_org_be_textbe_ct_textct_ComponentList ) )? (a3_0= parse_org_be_textbe_ct_textct_CompositionTree ) ;
    public final org.be.textbe.ct.textct.TextCT parse_org_be_textbe_ct_textct_TextCT() throws RecognitionException {
        org.be.textbe.ct.textct.TextCT element =  null;
        int parse_org_be_textbe_ct_textct_TextCT_StartIndex = input.index();
        org.be.textbe.ct.textct.OptionList a0_0 = null;

        org.be.textbe.ct.textct.RequirementList a1_0 = null;

        org.be.textbe.ct.textct.ComponentList a2_0 = null;

        org.be.textbe.ct.textct.CompositionTree a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Ct.g:532:1: ( ( (a0_0= parse_org_be_textbe_ct_textct_OptionList ) )? ( (a1_0= parse_org_be_textbe_ct_textct_RequirementList ) )? ( (a2_0= parse_org_be_textbe_ct_textct_ComponentList ) )? (a3_0= parse_org_be_textbe_ct_textct_CompositionTree ) )
            // Ct.g:533:2: ( (a0_0= parse_org_be_textbe_ct_textct_OptionList ) )? ( (a1_0= parse_org_be_textbe_ct_textct_RequirementList ) )? ( (a2_0= parse_org_be_textbe_ct_textct_ComponentList ) )? (a3_0= parse_org_be_textbe_ct_textct_CompositionTree )
            {
            // Ct.g:533:2: ( (a0_0= parse_org_be_textbe_ct_textct_OptionList ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Ct.g:534:3: (a0_0= parse_org_be_textbe_ct_textct_OptionList )
                    {
                    // Ct.g:534:3: (a0_0= parse_org_be_textbe_ct_textct_OptionList )
                    // Ct.g:535:4: a0_0= parse_org_be_textbe_ct_textct_OptionList
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_OptionList_in_parse_org_be_textbe_ct_textct_TextCT124);
                    a0_0=parse_org_be_textbe_ct_textct_OptionList();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createTextCT();
                      					incompleteObjects.push(element);
                      				}
                      				if (a0_0 != null) {
                      					if (a0_0 != null) {
                      						Object value = a0_0;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__OPTIONS), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_0_0_0_0, a0_0, true);
                      					copyLocalizationInfos(a0_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_1, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }
            // Ct.g:565:2: ( (a1_0= parse_org_be_textbe_ct_textct_RequirementList ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Ct.g:566:3: (a1_0= parse_org_be_textbe_ct_textct_RequirementList )
                    {
                    // Ct.g:566:3: (a1_0= parse_org_be_textbe_ct_textct_RequirementList )
                    // Ct.g:567:4: a1_0= parse_org_be_textbe_ct_textct_RequirementList
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_RequirementList_in_parse_org_be_textbe_ct_textct_TextCT159);
                    a1_0=parse_org_be_textbe_ct_textct_RequirementList();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createTextCT();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1_0 != null) {
                      					if (a1_0 != null) {
                      						Object value = a1_0;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__REQUIREMENTS), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_0_0_0_1, a1_0, true);
                      					copyLocalizationInfos(a1_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 2, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 2, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 2, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 2, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }
            // Ct.g:596:2: ( (a2_0= parse_org_be_textbe_ct_textct_ComponentList ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=29 && LA3_0<=30)) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                int LA3_2 = input.LA(2);

                if ( (synpred3_Ct()) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // Ct.g:597:3: (a2_0= parse_org_be_textbe_ct_textct_ComponentList )
                    {
                    // Ct.g:597:3: (a2_0= parse_org_be_textbe_ct_textct_ComponentList )
                    // Ct.g:598:4: a2_0= parse_org_be_textbe_ct_textct_ComponentList
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_ComponentList_in_parse_org_be_textbe_ct_textct_TextCT194);
                    a2_0=parse_org_be_textbe_ct_textct_ComponentList();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createTextCT();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2_0 != null) {
                      					if (a2_0 != null) {
                      						Object value = a2_0;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__COMPONENTS), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_0_0_0_2, a2_0, true);
                      					copyLocalizationInfos(a2_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 3, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }
            // Ct.g:624:2: (a3_0= parse_org_be_textbe_ct_textct_CompositionTree )
            // Ct.g:625:3: a3_0= parse_org_be_textbe_ct_textct_CompositionTree
            {
            pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_CompositionTree_in_parse_org_be_textbe_ct_textct_TextCT224);
            a3_0=parse_org_be_textbe_ct_textct_CompositionTree();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createTextCT();
              				incompleteObjects.push(element);
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					Object value = a3_0;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.TEXT_CT__COMPOSITION_TREE), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_0_0_0_3, a3_0, true);
              				copyLocalizationInfos(a3_0, element);
              			}
              		
            }

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
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_be_textbe_ct_textct_TextCT_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_TextCT"


    // $ANTLR start "parse_org_be_textbe_ct_textct_CompositionTree"
    // Ct.g:651:1: parse_org_be_textbe_ct_textct_CompositionTree returns [org.be.textbe.ct.textct.CompositionTree element = null] : a0= '#T' (a1_0= parse_org_be_textbe_ct_textct_Node ) ;
    public final org.be.textbe.ct.textct.CompositionTree parse_org_be_textbe_ct_textct_CompositionTree() throws RecognitionException {
        org.be.textbe.ct.textct.CompositionTree element =  null;
        int parse_org_be_textbe_ct_textct_CompositionTree_StartIndex = input.index();
        Token a0=null;
        org.be.textbe.ct.textct.Node a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Ct.g:654:1: (a0= '#T' (a1_0= parse_org_be_textbe_ct_textct_Node ) )
            // Ct.g:655:2: a0= '#T' (a1_0= parse_org_be_textbe_ct_textct_Node )
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_be_textbe_ct_textct_CompositionTree257); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createCompositionTree();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_1_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 5, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_4);
              	
            }
            // Ct.g:669:2: (a1_0= parse_org_be_textbe_ct_textct_Node )
            // Ct.g:670:3: a1_0= parse_org_be_textbe_ct_textct_Node
            {
            pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_Node_in_parse_org_be_textbe_ct_textct_CompositionTree275);
            a1_0=parse_org_be_textbe_ct_textct_Node();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createCompositionTree();
              				incompleteObjects.push(element);
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					Object value = a1_0;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPOSITION_TREE__ROOT_NODE), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_1_0_0_1, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

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
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_be_textbe_ct_textct_CompositionTree_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_CompositionTree"


    // $ANTLR start "parse_org_be_textbe_ct_textct_AggregatedNode"
    // Ct.g:696:1: parse_org_be_textbe_ct_textct_AggregatedNode returns [org.be.textbe.ct.textct.AggregatedNode element = null] : a0= '<' (a1= COMPONENT ) ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )? ;
    public final org.be.textbe.ct.textct.AggregatedNode parse_org_be_textbe_ct_textct_AggregatedNode() throws RecognitionException {
        org.be.textbe.ct.textct.AggregatedNode element =  null;
        int parse_org_be_textbe_ct_textct_AggregatedNode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        org.be.textbe.ct.textct.AbstractBlockOrNode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Ct.g:699:1: (a0= '<' (a1= COMPONENT ) ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )? )
            // Ct.g:700:2: a0= '<' (a1= COMPONENT ) ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )?
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_be_textbe_ct_textct_AggregatedNode308); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedNode();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_2_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_8, 7);
              	
            }
            // Ct.g:714:2: (a1= COMPONENT )
            // Ct.g:715:3: a1= COMPONENT
            {
            a1=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_AggregatedNode326); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedNode();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__COMPONENT_REF), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__COMPONENT_REF), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_2_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 8, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 8, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 8, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 8, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 8, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 8, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 8, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 8);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 8);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 8);
              	
            }
            // Ct.g:759:2: ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA5_1 = input.LA(2);

                    if ( (synpred5_Ct()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_Ct()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (synpred5_Ct()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case COMPONENT:
                    {
                    int LA5_4 = input.LA(2);

                    if ( (synpred5_Ct()) ) {
                        alt5=1;
                    }
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // Ct.g:760:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
                    {
                    // Ct.g:760:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
                    // Ct.g:761:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
                    {
                    // Ct.g:761:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        switch ( input.LA(1) ) {
                        case 22:
                            {
                            int LA4_1 = input.LA(2);

                            if ( (synpred4_Ct()) ) {
                                alt4=1;
                            }


                            }
                            break;
                        case 23:
                            {
                            int LA4_2 = input.LA(2);

                            if ( (synpred4_Ct()) ) {
                                alt4=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA4_3 = input.LA(2);

                            if ( (synpred4_Ct()) ) {
                                alt4=1;
                            }


                            }
                            break;
                        case COMPONENT:
                            {
                            int LA4_4 = input.LA(2);

                            if ( (synpred4_Ct()) ) {
                                alt4=1;
                            }


                            }
                            break;

                        }

                        switch (alt4) {
                    	case 1 :
                    	    // Ct.g:762:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
                    	    {
                    	    // Ct.g:762:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
                    	    // Ct.g:763:6: a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
                    	    {
                    	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_parse_org_be_textbe_ct_textct_AggregatedNode369);
                    	    a2_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedNode();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						if (a2_0 != null) {
                    	      							if (a2_0 != null) {
                    	      								Object value = a2_0;
                    	      								addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.AGGREGATED_NODE__CHILD_NODE, value);
                    	      								completedElement(value, true);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_2_0_0_2_0_0_0, a2_0, true);
                    	      							copyLocalizationInfos(a2_0, element);
                    	      						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 9, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 9, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 9, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 9, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 9, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 9, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 9, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 9);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 9);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 9);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 10, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 10, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 10, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 10, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 10, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 10, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 10, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 10);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 10);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 10);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_be_textbe_ct_textct_AggregatedNode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_AggregatedNode"


    // $ANTLR start "parse_org_be_textbe_ct_textct_AssociatedNode"
    // Ct.g:816:1: parse_org_be_textbe_ct_textct_AssociatedNode returns [org.be.textbe.ct.textct.AssociatedNode element = null] : a0= '>' (a1= COMPONENT ) ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )? ;
    public final org.be.textbe.ct.textct.AssociatedNode parse_org_be_textbe_ct_textct_AssociatedNode() throws RecognitionException {
        org.be.textbe.ct.textct.AssociatedNode element =  null;
        int parse_org_be_textbe_ct_textct_AssociatedNode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        org.be.textbe.ct.textct.AbstractBlockOrNode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Ct.g:819:1: (a0= '>' (a1= COMPONENT ) ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )? )
            // Ct.g:820:2: a0= '>' (a1= COMPONENT ) ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )?
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_be_textbe_ct_textct_AssociatedNode437); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedNode();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_3_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_17, 11);
              	
            }
            // Ct.g:834:2: (a1= COMPONENT )
            // Ct.g:835:3: a1= COMPONENT
            {
            a1=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_AssociatedNode455); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedNode();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__COMPONENT_REF), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__COMPONENT_REF), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_3_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 12, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 12, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 12, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 12, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 12, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 12, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 12, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 12);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 12);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 12);
              	
            }
            // Ct.g:879:2: ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA7_1 = input.LA(2);

                    if ( (synpred7_Ct()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (synpred7_Ct()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA7_3 = input.LA(2);

                    if ( (synpred7_Ct()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case COMPONENT:
                    {
                    int LA7_4 = input.LA(2);

                    if ( (synpred7_Ct()) ) {
                        alt7=1;
                    }
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // Ct.g:880:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
                    {
                    // Ct.g:880:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
                    // Ct.g:881:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
                    {
                    // Ct.g:881:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        switch ( input.LA(1) ) {
                        case 22:
                            {
                            int LA6_2 = input.LA(2);

                            if ( (synpred6_Ct()) ) {
                                alt6=1;
                            }


                            }
                            break;
                        case 23:
                            {
                            int LA6_3 = input.LA(2);

                            if ( (synpred6_Ct()) ) {
                                alt6=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA6_4 = input.LA(2);

                            if ( (synpred6_Ct()) ) {
                                alt6=1;
                            }


                            }
                            break;
                        case COMPONENT:
                            {
                            int LA6_5 = input.LA(2);

                            if ( (synpred6_Ct()) ) {
                                alt6=1;
                            }


                            }
                            break;

                        }

                        switch (alt6) {
                    	case 1 :
                    	    // Ct.g:882:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
                    	    {
                    	    // Ct.g:882:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
                    	    // Ct.g:883:6: a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
                    	    {
                    	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_parse_org_be_textbe_ct_textct_AssociatedNode498);
                    	    a2_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedNode();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						if (a2_0 != null) {
                    	      							if (a2_0 != null) {
                    	      								Object value = a2_0;
                    	      								addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_NODE__CHILD_NODE, value);
                    	      								completedElement(value, true);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_3_0_0_2_0_0_0, a2_0, true);
                    	      							copyLocalizationInfos(a2_0, element);
                    	      						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 13, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 13, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 13, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 13, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 13, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 13, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 13, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 13);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 13);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 13);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 14, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 14, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 14, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 14, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 14, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 14, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 14, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 14);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 14);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 14);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_be_textbe_ct_textct_AssociatedNode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_AssociatedNode"


    // $ANTLR start "parse_org_be_textbe_ct_textct_InheritedNode"
    // Ct.g:936:1: parse_org_be_textbe_ct_textct_InheritedNode returns [org.be.textbe.ct.textct.InheritedNode element = null] : a0= '<=' (a1= COMPONENT ) ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )? ;
    public final org.be.textbe.ct.textct.InheritedNode parse_org_be_textbe_ct_textct_InheritedNode() throws RecognitionException {
        org.be.textbe.ct.textct.InheritedNode element =  null;
        int parse_org_be_textbe_ct_textct_InheritedNode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        org.be.textbe.ct.textct.AbstractBlockOrNode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Ct.g:939:1: (a0= '<=' (a1= COMPONENT ) ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )? )
            // Ct.g:940:2: a0= '<=' (a1= COMPONENT ) ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )?
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_ct_textct_InheritedNode566); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedNode();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_4_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_18, 15);
              	
            }
            // Ct.g:954:2: (a1= COMPONENT )
            // Ct.g:955:3: a1= COMPONENT
            {
            a1=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_InheritedNode584); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedNode();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__COMPONENT_REF), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__COMPONENT_REF), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_4_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 16, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 16, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 16, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 16, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 16, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 16, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 16, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 16);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 16);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 16);
              	
            }
            // Ct.g:999:2: ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA9_1 = input.LA(2);

                    if ( (synpred9_Ct()) ) {
                        alt9=1;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred9_Ct()) ) {
                        alt9=1;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred9_Ct()) ) {
                        alt9=1;
                    }
                    }
                    break;
                case COMPONENT:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred9_Ct()) ) {
                        alt9=1;
                    }
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // Ct.g:1000:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
                    {
                    // Ct.g:1000:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
                    // Ct.g:1001:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
                    {
                    // Ct.g:1001:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case 22:
                            {
                            int LA8_2 = input.LA(2);

                            if ( (synpred8_Ct()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 23:
                            {
                            int LA8_3 = input.LA(2);

                            if ( (synpred8_Ct()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA8_4 = input.LA(2);

                            if ( (synpred8_Ct()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case COMPONENT:
                            {
                            int LA8_5 = input.LA(2);

                            if ( (synpred8_Ct()) ) {
                                alt8=1;
                            }


                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // Ct.g:1002:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
                    	    {
                    	    // Ct.g:1002:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
                    	    // Ct.g:1003:6: a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
                    	    {
                    	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_parse_org_be_textbe_ct_textct_InheritedNode627);
                    	    a2_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedNode();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						if (a2_0 != null) {
                    	      							if (a2_0 != null) {
                    	      								Object value = a2_0;
                    	      								addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.INHERITED_NODE__CHILD_NODE, value);
                    	      								completedElement(value, true);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_4_0_0_2_0_0_0, a2_0, true);
                    	      							copyLocalizationInfos(a2_0, element);
                    	      						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 17, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 17, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 17, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 17, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 17, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 17, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 17, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 17);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 17);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 17);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 18, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 18, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 18, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 18, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 18, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 18, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 18, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 18);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 18);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 18);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_be_textbe_ct_textct_InheritedNode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_InheritedNode"


    // $ANTLR start "parse_org_be_textbe_ct_textct_AggregatedBlock"
    // Ct.g:1056:1: parse_org_be_textbe_ct_textct_AggregatedBlock returns [org.be.textbe.ct.textct.AggregatedBlock element = null] : a0= '<' a1= '{' ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+ a3= '}' ;
    public final org.be.textbe.ct.textct.AggregatedBlock parse_org_be_textbe_ct_textct_AggregatedBlock() throws RecognitionException {
        org.be.textbe.ct.textct.AggregatedBlock element =  null;
        int parse_org_be_textbe_ct_textct_AggregatedBlock_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.be.textbe.ct.textct.AbstractNode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Ct.g:1059:1: (a0= '<' a1= '{' ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+ a3= '}' )
            // Ct.g:1060:2: a0= '<' a1= '{' ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+ a3= '}'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_be_textbe_ct_textct_AggregatedBlock695); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_5_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_19, 19);
              	
            }
            a1=(Token)match(input,25,FOLLOW_25_in_parse_org_be_textbe_ct_textct_AggregatedBlock709); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_5_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 20, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 20, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 20, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 20, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              	
            }
            // Ct.g:1091:2: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMPONENT||(LA10_0>=22 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Ct.g:1092:3: (a2_0= parse_org_be_textbe_ct_textct_AbstractNode )
            	    {
            	    // Ct.g:1092:3: (a2_0= parse_org_be_textbe_ct_textct_AbstractNode )
            	    // Ct.g:1093:4: a2_0= parse_org_be_textbe_ct_textct_AbstractNode
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractNode_in_parse_org_be_textbe_ct_textct_AggregatedBlock732);
            	    a2_0=parse_org_be_textbe_ct_textct_AbstractNode();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedBlock();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a2_0 != null) {
            	      					if (a2_0 != null) {
            	      						Object value = a2_0;
            	      						addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.AGGREGATED_BLOCK__CHILD_NODE, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_5_0_0_2, a2_0, true);
            	      					copyLocalizationInfos(a2_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 21, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 21, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 21, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 21, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 21);
              	
            }
            a3=(Token)match(input,26,FOLLOW_26_in_parse_org_be_textbe_ct_textct_AggregatedBlock758); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_5_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 22, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 22, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 22, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 22, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 22, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 22, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 22, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 22);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 22);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 22);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_be_textbe_ct_textct_AggregatedBlock_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_AggregatedBlock"


    // $ANTLR start "parse_org_be_textbe_ct_textct_AssociatedBlock"
    // Ct.g:1148:1: parse_org_be_textbe_ct_textct_AssociatedBlock returns [org.be.textbe.ct.textct.AssociatedBlock element = null] : a0= '>' a1= '{' ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+ a3= '}' ;
    public final org.be.textbe.ct.textct.AssociatedBlock parse_org_be_textbe_ct_textct_AssociatedBlock() throws RecognitionException {
        org.be.textbe.ct.textct.AssociatedBlock element =  null;
        int parse_org_be_textbe_ct_textct_AssociatedBlock_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.be.textbe.ct.textct.AbstractNode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Ct.g:1151:1: (a0= '>' a1= '{' ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+ a3= '}' )
            // Ct.g:1152:2: a0= '>' a1= '{' ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+ a3= '}'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_be_textbe_ct_textct_AssociatedBlock787); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_6_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_20, 23);
              	
            }
            a1=(Token)match(input,25,FOLLOW_25_in_parse_org_be_textbe_ct_textct_AssociatedBlock801); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_6_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 24, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 24, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 24, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 24, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              	
            }
            // Ct.g:1183:2: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMPONENT||(LA11_0>=22 && LA11_0<=24)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Ct.g:1184:3: (a2_0= parse_org_be_textbe_ct_textct_AbstractNode )
            	    {
            	    // Ct.g:1184:3: (a2_0= parse_org_be_textbe_ct_textct_AbstractNode )
            	    // Ct.g:1185:4: a2_0= parse_org_be_textbe_ct_textct_AbstractNode
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractNode_in_parse_org_be_textbe_ct_textct_AssociatedBlock824);
            	    a2_0=parse_org_be_textbe_ct_textct_AbstractNode();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedBlock();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a2_0 != null) {
            	      					if (a2_0 != null) {
            	      						Object value = a2_0;
            	      						addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.ASSOCIATED_BLOCK__CHILD_NODE, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_6_0_0_2, a2_0, true);
            	      					copyLocalizationInfos(a2_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 25, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 25, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 25, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 25, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 25);
              	
            }
            a3=(Token)match(input,26,FOLLOW_26_in_parse_org_be_textbe_ct_textct_AssociatedBlock850); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_6_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 26, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 26, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 26, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 26, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 26, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 26, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 26, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 26);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 26);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 26);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_be_textbe_ct_textct_AssociatedBlock_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_AssociatedBlock"


    // $ANTLR start "parse_org_be_textbe_ct_textct_InheritedBlock"
    // Ct.g:1240:1: parse_org_be_textbe_ct_textct_InheritedBlock returns [org.be.textbe.ct.textct.InheritedBlock element = null] : a0= '<=' a1= '{' ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+ a3= '}' ;
    public final org.be.textbe.ct.textct.InheritedBlock parse_org_be_textbe_ct_textct_InheritedBlock() throws RecognitionException {
        org.be.textbe.ct.textct.InheritedBlock element =  null;
        int parse_org_be_textbe_ct_textct_InheritedBlock_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.be.textbe.ct.textct.AbstractNode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Ct.g:1243:1: (a0= '<=' a1= '{' ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+ a3= '}' )
            // Ct.g:1244:2: a0= '<=' a1= '{' ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+ a3= '}'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_ct_textct_InheritedBlock879); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_7_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_21, 27);
              	
            }
            a1=(Token)match(input,25,FOLLOW_25_in_parse_org_be_textbe_ct_textct_InheritedBlock893); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_7_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 28, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 28, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 28, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 28, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              	
            }
            // Ct.g:1275:2: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractNode ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMPONENT||(LA12_0>=22 && LA12_0<=24)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Ct.g:1276:3: (a2_0= parse_org_be_textbe_ct_textct_AbstractNode )
            	    {
            	    // Ct.g:1276:3: (a2_0= parse_org_be_textbe_ct_textct_AbstractNode )
            	    // Ct.g:1277:4: a2_0= parse_org_be_textbe_ct_textct_AbstractNode
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractNode_in_parse_org_be_textbe_ct_textct_InheritedBlock916);
            	    a2_0=parse_org_be_textbe_ct_textct_AbstractNode();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedBlock();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a2_0 != null) {
            	      					if (a2_0 != null) {
            	      						Object value = a2_0;
            	      						addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.INHERITED_BLOCK__CHILD_NODE, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_7_0_0_2, a2_0, true);
            	      					copyLocalizationInfos(a2_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 29, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 29, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 29, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 29, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 29);
              	
            }
            a3=(Token)match(input,26,FOLLOW_26_in_parse_org_be_textbe_ct_textct_InheritedBlock942); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_7_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 30, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 30, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 30, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 30, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 30, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 30, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 30, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 30);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 30);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 30);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_be_textbe_ct_textct_InheritedBlock_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_InheritedBlock"


    // $ANTLR start "parse_org_be_textbe_ct_textct_Node"
    // Ct.g:1332:1: parse_org_be_textbe_ct_textct_Node returns [org.be.textbe.ct.textct.Node element = null] : (a0= COMPONENT ) ( ( ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )? ;
    public final org.be.textbe.ct.textct.Node parse_org_be_textbe_ct_textct_Node() throws RecognitionException {
        org.be.textbe.ct.textct.Node element =  null;
        int parse_org_be_textbe_ct_textct_Node_StartIndex = input.index();
        Token a0=null;
        org.be.textbe.ct.textct.AbstractBlockOrNode a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Ct.g:1335:1: ( (a0= COMPONENT ) ( ( ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )? )
            // Ct.g:1336:2: (a0= COMPONENT ) ( ( ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )?
            {
            // Ct.g:1336:2: (a0= COMPONENT )
            // Ct.g:1337:3: a0= COMPONENT
            {
            a0=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_Node975); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createNode();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__COMPONENT_REF), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.NODE__COMPONENT_REF), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_8_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 31, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 31, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 31, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 31, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 31, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 31, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 31, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 31);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 31);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 31);
              	
            }
            // Ct.g:1381:2: ( ( ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA14_1 = input.LA(2);

                    if ( (synpred14_Ct()) ) {
                        alt14=1;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred14_Ct()) ) {
                        alt14=1;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred14_Ct()) ) {
                        alt14=1;
                    }
                    }
                    break;
                case COMPONENT:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred14_Ct()) ) {
                        alt14=1;
                    }
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // Ct.g:1382:3: ( ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
                    {
                    // Ct.g:1382:3: ( ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
                    // Ct.g:1383:4: ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
                    {
                    // Ct.g:1383:4: ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        switch ( input.LA(1) ) {
                        case 22:
                            {
                            int LA13_3 = input.LA(2);

                            if ( (synpred13_Ct()) ) {
                                alt13=1;
                            }


                            }
                            break;
                        case 23:
                            {
                            int LA13_4 = input.LA(2);

                            if ( (synpred13_Ct()) ) {
                                alt13=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA13_5 = input.LA(2);

                            if ( (synpred13_Ct()) ) {
                                alt13=1;
                            }


                            }
                            break;
                        case COMPONENT:
                            {
                            int LA13_6 = input.LA(2);

                            if ( (synpred13_Ct()) ) {
                                alt13=1;
                            }


                            }
                            break;

                        }

                        switch (alt13) {
                    	case 1 :
                    	    // Ct.g:1384:5: (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
                    	    {
                    	    // Ct.g:1384:5: (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
                    	    // Ct.g:1385:6: a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
                    	    {
                    	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_parse_org_be_textbe_ct_textct_Node1018);
                    	    a1_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createNode();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						if (a1_0 != null) {
                    	      							if (a1_0 != null) {
                    	      								Object value = a1_0;
                    	      								addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.NODE__CHILD_NODE, value);
                    	      								completedElement(value, true);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_8_0_0_1_0_0_0, a1_0, true);
                    	      							copyLocalizationInfos(a1_0, element);
                    	      						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 32, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 32, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 32, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 32, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 32, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 32, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 32, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 32);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 32);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 32);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 33, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 33, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 33, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_11, 33, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_12, 33, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_13, 33, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 33, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 33);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 33);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 33);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_be_textbe_ct_textct_Node_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_Node"


    // $ANTLR start "parse_org_be_textbe_ct_textct_OptionList"
    // Ct.g:1438:1: parse_org_be_textbe_ct_textct_OptionList returns [org.be.textbe.ct.textct.OptionList element = null] : a0= '#OPTIONS' ( (a1_0= parse_org_be_textbe_ct_textct_Option ) )+ ;
    public final org.be.textbe.ct.textct.OptionList parse_org_be_textbe_ct_textct_OptionList() throws RecognitionException {
        org.be.textbe.ct.textct.OptionList element =  null;
        int parse_org_be_textbe_ct_textct_OptionList_StartIndex = input.index();
        Token a0=null;
        org.be.textbe.ct.textct.Option a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Ct.g:1441:1: (a0= '#OPTIONS' ( (a1_0= parse_org_be_textbe_ct_textct_Option ) )+ )
            // Ct.g:1442:2: a0= '#OPTIONS' ( (a1_0= parse_org_be_textbe_ct_textct_Option ) )+
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_org_be_textbe_ct_textct_OptionList1086); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createOptionList();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_9_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_22, 34, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_7);
              	
            }
            // Ct.g:1456:2: ( (a1_0= parse_org_be_textbe_ct_textct_Option ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==TEXT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Ct.g:1457:3: (a1_0= parse_org_be_textbe_ct_textct_Option )
            	    {
            	    // Ct.g:1457:3: (a1_0= parse_org_be_textbe_ct_textct_Option )
            	    // Ct.g:1458:4: a1_0= parse_org_be_textbe_ct_textct_Option
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_Option_in_parse_org_be_textbe_ct_textct_OptionList1109);
            	    a1_0=parse_org_be_textbe_ct_textct_Option();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createOptionList();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a1_0 != null) {
            	      					if (a1_0 != null) {
            	      						Object value = a1_0;
            	      						addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.OPTION_LIST__OPTIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_9_0_0_1, a1_0, true);
            	      					copyLocalizationInfos(a1_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_22, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_1, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_be_textbe_ct_textct_OptionList_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_OptionList"


    // $ANTLR start "parse_org_be_textbe_ct_textct_Option"
    // Ct.g:1491:1: parse_org_be_textbe_ct_textct_Option returns [org.be.textbe.ct.textct.Option element = null] : (a0= TEXT ) a1= '=' (a2= TEXT ) ;
    public final org.be.textbe.ct.textct.Option parse_org_be_textbe_ct_textct_Option() throws RecognitionException {
        org.be.textbe.ct.textct.Option element =  null;
        int parse_org_be_textbe_ct_textct_Option_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Ct.g:1494:1: ( (a0= TEXT ) a1= '=' (a2= TEXT ) )
            // Ct.g:1495:2: (a0= TEXT ) a1= '=' (a2= TEXT )
            {
            // Ct.g:1495:2: (a0= TEXT )
            // Ct.g:1496:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_Option1154); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createOption();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_10_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_23, 36);
              	
            }
            a1=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parse_org_be_textbe_ct_textct_Option1175); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_10_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_24, 37);
              	
            }
            // Ct.g:1545:2: (a2= TEXT )
            // Ct.g:1546:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_Option1193); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createOption();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__VALUE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.OPTION__VALUE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_10_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_22, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_1, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_be_textbe_ct_textct_Option_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_Option"


    // $ANTLR start "parse_org_be_textbe_ct_textct_RequirementList"
    // Ct.g:1588:1: parse_org_be_textbe_ct_textct_RequirementList returns [org.be.textbe.ct.textct.RequirementList element = null] : a0= '#RT' ( (a1_0= parse_org_be_textbe_ct_textct_Requirement ) )+ ;
    public final org.be.textbe.ct.textct.RequirementList parse_org_be_textbe_ct_textct_RequirementList() throws RecognitionException {
        org.be.textbe.ct.textct.RequirementList element =  null;
        int parse_org_be_textbe_ct_textct_RequirementList_StartIndex = input.index();
        Token a0=null;
        org.be.textbe.ct.textct.Requirement a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Ct.g:1591:1: (a0= '#RT' ( (a1_0= parse_org_be_textbe_ct_textct_Requirement ) )+ )
            // Ct.g:1592:2: a0= '#RT' ( (a1_0= parse_org_be_textbe_ct_textct_Requirement ) )+
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_org_be_textbe_ct_textct_RequirementList1229); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createRequirementList();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_11_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 39, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
              	
            }
            // Ct.g:1606:2: ( (a1_0= parse_org_be_textbe_ct_textct_Requirement ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==REQUIREMENT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Ct.g:1607:3: (a1_0= parse_org_be_textbe_ct_textct_Requirement )
            	    {
            	    // Ct.g:1607:3: (a1_0= parse_org_be_textbe_ct_textct_Requirement )
            	    // Ct.g:1608:4: a1_0= parse_org_be_textbe_ct_textct_Requirement
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_Requirement_in_parse_org_be_textbe_ct_textct_RequirementList1252);
            	    a1_0=parse_org_be_textbe_ct_textct_Requirement();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createRequirementList();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a1_0 != null) {
            	      					if (a1_0 != null) {
            	      						Object value = a1_0;
            	      						addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.REQUIREMENT_LIST__REQUIREMENTS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_11_0_0_1, a1_0, true);
            	      					copyLocalizationInfos(a1_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_be_textbe_ct_textct_RequirementList_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_RequirementList"


    // $ANTLR start "parse_org_be_textbe_ct_textct_Requirement"
    // Ct.g:1640:1: parse_org_be_textbe_ct_textct_Requirement returns [org.be.textbe.ct.textct.Requirement element = null] : (a0= REQUIREMENT ) ( (a1= BEHAVIOR ) | (a2= REQUIREMENT ) | (a3= TEXT ) | (a4= COMPONENT ) ) ;
    public final org.be.textbe.ct.textct.Requirement parse_org_be_textbe_ct_textct_Requirement() throws RecognitionException {
        org.be.textbe.ct.textct.Requirement element =  null;
        int parse_org_be_textbe_ct_textct_Requirement_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Ct.g:1643:1: ( (a0= REQUIREMENT ) ( (a1= BEHAVIOR ) | (a2= REQUIREMENT ) | (a3= TEXT ) | (a4= COMPONENT ) ) )
            // Ct.g:1644:2: (a0= REQUIREMENT ) ( (a1= BEHAVIOR ) | (a2= REQUIREMENT ) | (a3= TEXT ) | (a4= COMPONENT ) )
            {
            // Ct.g:1644:2: (a0= REQUIREMENT )
            // Ct.g:1645:3: a0= REQUIREMENT
            {
            a0=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_ct_textct_Requirement1297); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createRequirement();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__REF), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__REF), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_12_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_26, 41);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_27, 41);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_28, 41);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_29, 41);
              	
            }
            // Ct.g:1683:2: ( (a1= BEHAVIOR ) | (a2= REQUIREMENT ) | (a3= TEXT ) | (a4= COMPONENT ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case BEHAVIOR:
                {
                alt17=1;
                }
                break;
            case REQUIREMENT:
                {
                alt17=2;
                }
                break;
            case TEXT:
                {
                alt17=3;
                }
                break;
            case COMPONENT:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // Ct.g:1684:3: (a1= BEHAVIOR )
                    {
                    // Ct.g:1684:3: (a1= BEHAVIOR )
                    // Ct.g:1685:4: a1= BEHAVIOR
                    {
                    a1=(Token)match(input,BEHAVIOR,FOLLOW_BEHAVIOR_in_parse_org_be_textbe_ct_textct_Requirement1327); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createRequirement();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1 != null) {
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BEHAVIOR");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_12_0_0_1_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Ct.g:1725:6: (a2= REQUIREMENT )
                    {
                    // Ct.g:1725:6: (a2= REQUIREMENT )
                    // Ct.g:1726:4: a2= REQUIREMENT
                    {
                    a2=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_ct_textct_Requirement1365); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createRequirement();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_12_0_0_1_0_1_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 3 :
                    // Ct.g:1766:6: (a3= TEXT )
                    {
                    // Ct.g:1766:6: (a3= TEXT )
                    // Ct.g:1767:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_Requirement1403); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createRequirement();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_12_0_0_1_0_2_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 4 :
                    // Ct.g:1807:6: (a4= COMPONENT )
                    {
                    // Ct.g:1807:6: (a4= COMPONENT )
                    // Ct.g:1808:4: a4= COMPONENT
                    {
                    a4=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_Requirement1441); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createRequirement();
                      					incompleteObjects.push(element);
                      				}
                      				if (a4 != null) {
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.REQUIREMENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_12_0_0_1_0_3_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_be_textbe_ct_textct_Requirement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_Requirement"


    // $ANTLR start "parse_org_be_textbe_ct_textct_ComponentList"
    // Ct.g:1859:1: parse_org_be_textbe_ct_textct_ComponentList returns [org.be.textbe.ct.textct.ComponentList element = null] : ( (a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component ) ) )* ( (a2= '#SC' (a3_0= parse_org_be_textbe_ct_textct_SystemComponent ) ) )? ( (a4= '#C' (a5_0= parse_org_be_textbe_ct_textct_Component ) ) )* ;
    public final org.be.textbe.ct.textct.ComponentList parse_org_be_textbe_ct_textct_ComponentList() throws RecognitionException {
        org.be.textbe.ct.textct.ComponentList element =  null;
        int parse_org_be_textbe_ct_textct_ComponentList_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        Token a4=null;
        org.be.textbe.ct.textct.Component a1_0 = null;

        org.be.textbe.ct.textct.SystemComponent a3_0 = null;

        org.be.textbe.ct.textct.Component a5_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Ct.g:1862:1: ( ( (a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component ) ) )* ( (a2= '#SC' (a3_0= parse_org_be_textbe_ct_textct_SystemComponent ) ) )? ( (a4= '#C' (a5_0= parse_org_be_textbe_ct_textct_Component ) ) )* )
            // Ct.g:1863:2: ( (a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component ) ) )* ( (a2= '#SC' (a3_0= parse_org_be_textbe_ct_textct_SystemComponent ) ) )? ( (a4= '#C' (a5_0= parse_org_be_textbe_ct_textct_Component ) ) )*
            {
            // Ct.g:1863:2: ( (a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==COMPONENT) ) {
                        switch ( input.LA(3) ) {
                        case TEXT:
                            {
                            int LA18_4 = input.LA(4);

                            if ( (synpred20_Ct()) ) {
                                alt18=1;
                            }


                            }
                            break;
                        case COMPONENT:
                            {
                            int LA18_5 = input.LA(4);

                            if ( (synpred20_Ct()) ) {
                                alt18=1;
                            }


                            }
                            break;
                        case COMPONENTNAME:
                            {
                            int LA18_6 = input.LA(4);

                            if ( (synpred20_Ct()) ) {
                                alt18=1;
                            }


                            }
                            break;
                        case REQUIREMENT:
                            {
                            int LA18_7 = input.LA(4);

                            if ( (synpred20_Ct()) ) {
                                alt18=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt18) {
            	case 1 :
            	    // Ct.g:1864:3: (a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component ) )
            	    {
            	    // Ct.g:1864:3: (a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component ) )
            	    // Ct.g:1865:4: a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component )
            	    {
            	    a0=(Token)match(input,29,FOLLOW_29_in_parse_org_be_textbe_ct_textct_ComponentList1499); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponentList();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_13_0_0_0_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_30, 47, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_31, 47, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
            	      			
            	    }
            	    // Ct.g:1880:4: (a1_0= parse_org_be_textbe_ct_textct_Component )
            	    // Ct.g:1881:5: a1_0= parse_org_be_textbe_ct_textct_Component
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_Component_in_parse_org_be_textbe_ct_textct_ComponentList1525);
            	    a1_0=parse_org_be_textbe_ct_textct_Component();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponentList();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a1_0 != null) {
            	      						if (a1_0 != null) {
            	      							Object value = a1_0;
            	      							addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_13_0_0_0_0_0_1, a1_0, true);
            	      						copyLocalizationInfos(a1_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 48);
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 48);
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 48);
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 48, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
            	      			
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
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 49);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 49);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 49);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 49, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }
            // Ct.g:1919:2: ( (a2= '#SC' (a3_0= parse_org_be_textbe_ct_textct_SystemComponent ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Ct.g:1920:3: (a2= '#SC' (a3_0= parse_org_be_textbe_ct_textct_SystemComponent ) )
                    {
                    // Ct.g:1920:3: (a2= '#SC' (a3_0= parse_org_be_textbe_ct_textct_SystemComponent ) )
                    // Ct.g:1921:4: a2= '#SC' (a3_0= parse_org_be_textbe_ct_textct_SystemComponent )
                    {
                    a2=(Token)match(input,30,FOLLOW_30_in_parse_org_be_textbe_ct_textct_ComponentList1575); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponentList();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_13_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_31, 50, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
                      			
                    }
                    // Ct.g:1935:4: (a3_0= parse_org_be_textbe_ct_textct_SystemComponent )
                    // Ct.g:1936:5: a3_0= parse_org_be_textbe_ct_textct_SystemComponent
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_SystemComponent_in_parse_org_be_textbe_ct_textct_ComponentList1601);
                    a3_0=parse_org_be_textbe_ct_textct_SystemComponent();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponentList();
                      						incompleteObjects.push(element);
                      					}
                      					if (a3_0 != null) {
                      						if (a3_0 != null) {
                      							Object value = a3_0;
                      							addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS, value);
                      							completedElement(value, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_13_0_0_1_0_0_1, a3_0, true);
                      						copyLocalizationInfos(a3_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 51);
                      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 51, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 52);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 52, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }
            // Ct.g:1970:2: ( (a4= '#C' (a5_0= parse_org_be_textbe_ct_textct_Component ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Ct.g:1971:3: (a4= '#C' (a5_0= parse_org_be_textbe_ct_textct_Component ) )
            	    {
            	    // Ct.g:1971:3: (a4= '#C' (a5_0= parse_org_be_textbe_ct_textct_Component ) )
            	    // Ct.g:1972:4: a4= '#C' (a5_0= parse_org_be_textbe_ct_textct_Component )
            	    {
            	    a4=(Token)match(input,29,FOLLOW_29_in_parse_org_be_textbe_ct_textct_ComponentList1651); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponentList();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_13_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_30, 53, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_31, 53, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
            	      			
            	    }
            	    // Ct.g:1987:4: (a5_0= parse_org_be_textbe_ct_textct_Component )
            	    // Ct.g:1988:5: a5_0= parse_org_be_textbe_ct_textct_Component
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_Component_in_parse_org_be_textbe_ct_textct_ComponentList1677);
            	    a5_0=parse_org_be_textbe_ct_textct_Component();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponentList();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a5_0 != null) {
            	      						if (a5_0 != null) {
            	      							Object value = a5_0;
            	      							addObjectToList(element, org.be.textbe.ct.textct.TextctPackage.COMPONENT_LIST__COMPONENTS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_13_0_0_2_0_0_1, a5_0, true);
            	      						copyLocalizationInfos(a5_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 54);
            	      				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 54, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
            	      			
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
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 55);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 55, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_be_textbe_ct_textct_ComponentList_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_ComponentList"


    // $ANTLR start "parse_org_be_textbe_ct_textct_Component"
    // Ct.g:2024:1: parse_org_be_textbe_ct_textct_Component returns [org.be.textbe.ct.textct.Component element = null] : ( (a0= COMPONENT ) ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) ) | c0= parse_org_be_textbe_ct_textct_SystemComponent );
    public final org.be.textbe.ct.textct.Component parse_org_be_textbe_ct_textct_Component() throws RecognitionException {
        org.be.textbe.ct.textct.Component element =  null;
        int parse_org_be_textbe_ct_textct_Component_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        org.be.textbe.ct.textct.SystemComponent c0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // Ct.g:2027:1: ( (a0= COMPONENT ) ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) ) | c0= parse_org_be_textbe_ct_textct_SystemComponent )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==COMPONENT) ) {
                switch ( input.LA(2) ) {
                case TEXT:
                    {
                    int LA22_2 = input.LA(3);

                    if ( (synpred26_Ct()) ) {
                        alt22=1;
                    }
                    else if ( (true) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case COMPONENT:
                    {
                    int LA22_3 = input.LA(3);

                    if ( (synpred26_Ct()) ) {
                        alt22=1;
                    }
                    else if ( (true) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case COMPONENTNAME:
                    {
                    int LA22_4 = input.LA(3);

                    if ( (synpred26_Ct()) ) {
                        alt22=1;
                    }
                    else if ( (true) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case REQUIREMENT:
                    {
                    int LA22_5 = input.LA(3);

                    if ( (synpred26_Ct()) ) {
                        alt22=1;
                    }
                    else if ( (true) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // Ct.g:2028:2: (a0= COMPONENT ) ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) )
                    {
                    // Ct.g:2028:2: (a0= COMPONENT )
                    // Ct.g:2029:3: a0= COMPONENT
                    {
                    a0=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_Component1737); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponent();
                      				incompleteObjects.push(element);
                      			}
                      			if (a0 != null) {
                      				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      				tokenResolver.setOptions(getOptions());
                      				org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__REF), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String) resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__REF), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_14_0_0_0, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_32, 56);
                      		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_33, 56);
                      		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_34, 56);
                      		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_35, 56);
                      	
                    }
                    // Ct.g:2067:2: ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) )
                    int alt21=4;
                    switch ( input.LA(1) ) {
                    case TEXT:
                        {
                        alt21=1;
                        }
                        break;
                    case COMPONENT:
                        {
                        alt21=2;
                        }
                        break;
                    case COMPONENTNAME:
                        {
                        alt21=3;
                        }
                        break;
                    case REQUIREMENT:
                        {
                        alt21=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // Ct.g:2068:3: (a1= TEXT )
                            {
                            // Ct.g:2068:3: (a1= TEXT )
                            // Ct.g:2069:4: a1= TEXT
                            {
                            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_Component1767); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponent();
                              					incompleteObjects.push(element);
                              				}
                              				if (a1 != null) {
                              					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                              					tokenResolver.setOptions(getOptions());
                              					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                              					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), result);
                              					Object resolvedObject = result.getResolvedToken();
                              					if (resolvedObject == null) {
                              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                              					}
                              					java.lang.String resolved = (java.lang.String) resolvedObject;
                              					if (resolved != null) {
                              						Object value = resolved;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), value);
                              						completedElement(value, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_14_0_0_1_0_0_0, resolved, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                              				}
                              			
                            }

                            }

                            if ( state.backtracking==0 ) {

                              			// expected elements (follow set)
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 57);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 57);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 57);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 57, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                              		
                            }

                            }
                            break;
                        case 2 :
                            // Ct.g:2108:6: (a2= COMPONENT )
                            {
                            // Ct.g:2108:6: (a2= COMPONENT )
                            // Ct.g:2109:4: a2= COMPONENT
                            {
                            a2=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_Component1805); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponent();
                              					incompleteObjects.push(element);
                              				}
                              				if (a2 != null) {
                              					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                              					tokenResolver.setOptions(getOptions());
                              					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                              					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), result);
                              					Object resolvedObject = result.getResolvedToken();
                              					if (resolvedObject == null) {
                              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                              					}
                              					java.lang.String resolved = (java.lang.String) resolvedObject;
                              					if (resolved != null) {
                              						Object value = resolved;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), value);
                              						completedElement(value, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_14_0_0_1_0_1_0, resolved, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                              				}
                              			
                            }

                            }

                            if ( state.backtracking==0 ) {

                              			// expected elements (follow set)
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 58);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 58);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 58);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 58, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                              		
                            }

                            }
                            break;
                        case 3 :
                            // Ct.g:2148:6: (a3= COMPONENTNAME )
                            {
                            // Ct.g:2148:6: (a3= COMPONENTNAME )
                            // Ct.g:2149:4: a3= COMPONENTNAME
                            {
                            a3=(Token)match(input,COMPONENTNAME,FOLLOW_COMPONENTNAME_in_parse_org_be_textbe_ct_textct_Component1843); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponent();
                              					incompleteObjects.push(element);
                              				}
                              				if (a3 != null) {
                              					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENTNAME");
                              					tokenResolver.setOptions(getOptions());
                              					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                              					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), result);
                              					Object resolvedObject = result.getResolvedToken();
                              					if (resolvedObject == null) {
                              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                              					}
                              					java.lang.String resolved = (java.lang.String) resolvedObject;
                              					if (resolved != null) {
                              						Object value = resolved;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), value);
                              						completedElement(value, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_14_0_0_1_0_2_0, resolved, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                              				}
                              			
                            }

                            }

                            if ( state.backtracking==0 ) {

                              			// expected elements (follow set)
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 59);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 59);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 59);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 59, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                              		
                            }

                            }
                            break;
                        case 4 :
                            // Ct.g:2188:6: (a4= REQUIREMENT )
                            {
                            // Ct.g:2188:6: (a4= REQUIREMENT )
                            // Ct.g:2189:4: a4= REQUIREMENT
                            {
                            a4=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_ct_textct_Component1881); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponent();
                              					incompleteObjects.push(element);
                              				}
                              				if (a4 != null) {
                              					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                              					tokenResolver.setOptions(getOptions());
                              					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                              					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), result);
                              					Object resolvedObject = result.getResolvedToken();
                              					if (resolvedObject == null) {
                              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                              					}
                              					java.lang.String resolved = (java.lang.String) resolvedObject;
                              					if (resolved != null) {
                              						Object value = resolved;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.COMPONENT__VAL), value);
                              						completedElement(value, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_14_0_0_1_0_3_0, resolved, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                              				}
                              			
                            }

                            }

                            if ( state.backtracking==0 ) {

                              			// expected elements (follow set)
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 60);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 60);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 60);
                              			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 60, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                              		
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 61);
                      		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 61);
                      		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 61);
                      		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 61, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Ct.g:2238:2: c0= parse_org_be_textbe_ct_textct_SystemComponent
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_SystemComponent_in_parse_org_be_textbe_ct_textct_Component1920);
                    c0=parse_org_be_textbe_ct_textct_SystemComponent();

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
            if ( state.backtracking>0 ) { memoize(input, 16, parse_org_be_textbe_ct_textct_Component_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_Component"


    // $ANTLR start "parse_org_be_textbe_ct_textct_SystemComponent"
    // Ct.g:2242:1: parse_org_be_textbe_ct_textct_SystemComponent returns [org.be.textbe.ct.textct.SystemComponent element = null] : (a0= COMPONENT ) ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) ) ;
    public final org.be.textbe.ct.textct.SystemComponent parse_org_be_textbe_ct_textct_SystemComponent() throws RecognitionException {
        org.be.textbe.ct.textct.SystemComponent element =  null;
        int parse_org_be_textbe_ct_textct_SystemComponent_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // Ct.g:2245:1: ( (a0= COMPONENT ) ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) ) )
            // Ct.g:2246:2: (a0= COMPONENT ) ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) )
            {
            // Ct.g:2246:2: (a0= COMPONENT )
            // Ct.g:2247:3: a0= COMPONENT
            {
            a0=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_SystemComponent1949); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createSystemComponent();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__REF), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__REF), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_15_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_36, 62);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_37, 62);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_38, 62);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_39, 62);
              	
            }
            // Ct.g:2285:2: ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt23=1;
                }
                break;
            case COMPONENT:
                {
                alt23=2;
                }
                break;
            case COMPONENTNAME:
                {
                alt23=3;
                }
                break;
            case REQUIREMENT:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // Ct.g:2286:3: (a1= TEXT )
                    {
                    // Ct.g:2286:3: (a1= TEXT )
                    // Ct.g:2287:4: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_SystemComponent1979); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createSystemComponent();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1 != null) {
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_15_0_0_1_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 63);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 63);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 63);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 63, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Ct.g:2326:6: (a2= COMPONENT )
                    {
                    // Ct.g:2326:6: (a2= COMPONENT )
                    // Ct.g:2327:4: a2= COMPONENT
                    {
                    a2=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_SystemComponent2017); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createSystemComponent();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_15_0_0_1_0_1_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 64);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 64);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 64);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 64, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 3 :
                    // Ct.g:2366:6: (a3= COMPONENTNAME )
                    {
                    // Ct.g:2366:6: (a3= COMPONENTNAME )
                    // Ct.g:2367:4: a3= COMPONENTNAME
                    {
                    a3=(Token)match(input,COMPONENTNAME,FOLLOW_COMPONENTNAME_in_parse_org_be_textbe_ct_textct_SystemComponent2055); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createSystemComponent();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENTNAME");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_15_0_0_1_0_2_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 65);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 65);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 65);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 65, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 4 :
                    // Ct.g:2406:6: (a4= REQUIREMENT )
                    {
                    // Ct.g:2406:6: (a4= REQUIREMENT )
                    // Ct.g:2407:4: a4= REQUIREMENT
                    {
                    a4=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_ct_textct_SystemComponent2093); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.ct.textct.resource.ct.mopp.CtTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createSystemComponent();
                      					incompleteObjects.push(element);
                      				}
                      				if (a4 != null) {
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.ct.textct.TextctPackage.SYSTEM_COMPONENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_15_0_0_1_0_3_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 66);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 66);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 66);
                      			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 66, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 67);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 67);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 67);
              		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 67, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_org_be_textbe_ct_textct_SystemComponent_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_SystemComponent"


    // $ANTLR start "parse_org_be_textbe_ct_textct_AbstractBlockOrNode"
    // Ct.g:2456:1: parse_org_be_textbe_ct_textct_AbstractBlockOrNode returns [org.be.textbe.ct.textct.AbstractBlockOrNode element = null] : (c0= parse_org_be_textbe_ct_textct_AggregatedNode | c1= parse_org_be_textbe_ct_textct_AssociatedNode | c2= parse_org_be_textbe_ct_textct_InheritedNode | c3= parse_org_be_textbe_ct_textct_AggregatedBlock | c4= parse_org_be_textbe_ct_textct_AssociatedBlock | c5= parse_org_be_textbe_ct_textct_InheritedBlock | c6= parse_org_be_textbe_ct_textct_Node );
    public final org.be.textbe.ct.textct.AbstractBlockOrNode parse_org_be_textbe_ct_textct_AbstractBlockOrNode() throws RecognitionException {
        org.be.textbe.ct.textct.AbstractBlockOrNode element =  null;
        int parse_org_be_textbe_ct_textct_AbstractBlockOrNode_StartIndex = input.index();
        org.be.textbe.ct.textct.AggregatedNode c0 = null;

        org.be.textbe.ct.textct.AssociatedNode c1 = null;

        org.be.textbe.ct.textct.InheritedNode c2 = null;

        org.be.textbe.ct.textct.AggregatedBlock c3 = null;

        org.be.textbe.ct.textct.AssociatedBlock c4 = null;

        org.be.textbe.ct.textct.InheritedBlock c5 = null;

        org.be.textbe.ct.textct.Node c6 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // Ct.g:2457:1: (c0= parse_org_be_textbe_ct_textct_AggregatedNode | c1= parse_org_be_textbe_ct_textct_AssociatedNode | c2= parse_org_be_textbe_ct_textct_InheritedNode | c3= parse_org_be_textbe_ct_textct_AggregatedBlock | c4= parse_org_be_textbe_ct_textct_AssociatedBlock | c5= parse_org_be_textbe_ct_textct_InheritedBlock | c6= parse_org_be_textbe_ct_textct_Node )
            int alt24=7;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // Ct.g:2458:2: c0= parse_org_be_textbe_ct_textct_AggregatedNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AggregatedNode_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2138);
                    c0=parse_org_be_textbe_ct_textct_AggregatedNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Ct.g:2459:4: c1= parse_org_be_textbe_ct_textct_AssociatedNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AssociatedNode_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2148);
                    c1=parse_org_be_textbe_ct_textct_AssociatedNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Ct.g:2460:4: c2= parse_org_be_textbe_ct_textct_InheritedNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_InheritedNode_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2158);
                    c2=parse_org_be_textbe_ct_textct_InheritedNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Ct.g:2461:4: c3= parse_org_be_textbe_ct_textct_AggregatedBlock
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AggregatedBlock_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2168);
                    c3=parse_org_be_textbe_ct_textct_AggregatedBlock();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Ct.g:2462:4: c4= parse_org_be_textbe_ct_textct_AssociatedBlock
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AssociatedBlock_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2178);
                    c4=parse_org_be_textbe_ct_textct_AssociatedBlock();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Ct.g:2463:4: c5= parse_org_be_textbe_ct_textct_InheritedBlock
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_InheritedBlock_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2188);
                    c5=parse_org_be_textbe_ct_textct_InheritedBlock();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // Ct.g:2464:4: c6= parse_org_be_textbe_ct_textct_Node
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_Node_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2198);
                    c6=parse_org_be_textbe_ct_textct_Node();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 18, parse_org_be_textbe_ct_textct_AbstractBlockOrNode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_AbstractBlockOrNode"


    // $ANTLR start "parse_org_be_textbe_ct_textct_AbstractNode"
    // Ct.g:2468:1: parse_org_be_textbe_ct_textct_AbstractNode returns [org.be.textbe.ct.textct.AbstractNode element = null] : (c0= parse_org_be_textbe_ct_textct_AggregatedNode | c1= parse_org_be_textbe_ct_textct_AssociatedNode | c2= parse_org_be_textbe_ct_textct_InheritedNode | c3= parse_org_be_textbe_ct_textct_Node );
    public final org.be.textbe.ct.textct.AbstractNode parse_org_be_textbe_ct_textct_AbstractNode() throws RecognitionException {
        org.be.textbe.ct.textct.AbstractNode element =  null;
        int parse_org_be_textbe_ct_textct_AbstractNode_StartIndex = input.index();
        org.be.textbe.ct.textct.AggregatedNode c0 = null;

        org.be.textbe.ct.textct.AssociatedNode c1 = null;

        org.be.textbe.ct.textct.InheritedNode c2 = null;

        org.be.textbe.ct.textct.Node c3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // Ct.g:2469:1: (c0= parse_org_be_textbe_ct_textct_AggregatedNode | c1= parse_org_be_textbe_ct_textct_AssociatedNode | c2= parse_org_be_textbe_ct_textct_InheritedNode | c3= parse_org_be_textbe_ct_textct_Node )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt25=1;
                }
                break;
            case 23:
                {
                alt25=2;
                }
                break;
            case 24:
                {
                alt25=3;
                }
                break;
            case COMPONENT:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // Ct.g:2470:2: c0= parse_org_be_textbe_ct_textct_AggregatedNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AggregatedNode_in_parse_org_be_textbe_ct_textct_AbstractNode2219);
                    c0=parse_org_be_textbe_ct_textct_AggregatedNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Ct.g:2471:4: c1= parse_org_be_textbe_ct_textct_AssociatedNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AssociatedNode_in_parse_org_be_textbe_ct_textct_AbstractNode2229);
                    c1=parse_org_be_textbe_ct_textct_AssociatedNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Ct.g:2472:4: c2= parse_org_be_textbe_ct_textct_InheritedNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_InheritedNode_in_parse_org_be_textbe_ct_textct_AbstractNode2239);
                    c2=parse_org_be_textbe_ct_textct_InheritedNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Ct.g:2473:4: c3= parse_org_be_textbe_ct_textct_Node
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_Node_in_parse_org_be_textbe_ct_textct_AbstractNode2249);
                    c3=parse_org_be_textbe_ct_textct_Node();

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
            if ( state.backtracking>0 ) { memoize(input, 19, parse_org_be_textbe_ct_textct_AbstractNode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_ct_textct_AbstractNode"

    // $ANTLR start synpred3_Ct
    public final void synpred3_Ct_fragment() throws RecognitionException {   
        org.be.textbe.ct.textct.ComponentList a2_0 = null;


        // Ct.g:597:3: ( (a2_0= parse_org_be_textbe_ct_textct_ComponentList ) )
        // Ct.g:597:3: (a2_0= parse_org_be_textbe_ct_textct_ComponentList )
        {
        // Ct.g:597:3: (a2_0= parse_org_be_textbe_ct_textct_ComponentList )
        // Ct.g:598:4: a2_0= parse_org_be_textbe_ct_textct_ComponentList
        {
        pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_ComponentList_in_synpred3_Ct194);
        a2_0=parse_org_be_textbe_ct_textct_ComponentList();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_Ct

    // $ANTLR start synpred4_Ct
    public final void synpred4_Ct_fragment() throws RecognitionException {   
        org.be.textbe.ct.textct.AbstractBlockOrNode a2_0 = null;


        // Ct.g:762:5: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )
        // Ct.g:762:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        {
        // Ct.g:762:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        // Ct.g:763:6: a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
        {
        pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred4_Ct369);
        a2_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_Ct

    // $ANTLR start synpred5_Ct
    public final void synpred5_Ct_fragment() throws RecognitionException {   
        org.be.textbe.ct.textct.AbstractBlockOrNode a2_0 = null;


        // Ct.g:760:3: ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )
        // Ct.g:760:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
        {
        // Ct.g:760:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
        // Ct.g:761:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
        {
        // Ct.g:761:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
        int cnt26=0;
        loop26:
        do {
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COMPONENT||(LA26_0>=22 && LA26_0<=24)) ) {
                alt26=1;
            }


            switch (alt26) {
        	case 1 :
        	    // Ct.g:762:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        	    {
        	    // Ct.g:762:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        	    // Ct.g:763:6: a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
        	    {
        	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred5_Ct369);
        	    a2_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt26 >= 1 ) break loop26;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(26, input);
                    throw eee;
            }
            cnt26++;
        } while (true);


        }


        }
    }
    // $ANTLR end synpred5_Ct

    // $ANTLR start synpred6_Ct
    public final void synpred6_Ct_fragment() throws RecognitionException {   
        org.be.textbe.ct.textct.AbstractBlockOrNode a2_0 = null;


        // Ct.g:882:5: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )
        // Ct.g:882:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        {
        // Ct.g:882:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        // Ct.g:883:6: a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
        {
        pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred6_Ct498);
        a2_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_Ct

    // $ANTLR start synpred7_Ct
    public final void synpred7_Ct_fragment() throws RecognitionException {   
        org.be.textbe.ct.textct.AbstractBlockOrNode a2_0 = null;


        // Ct.g:880:3: ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )
        // Ct.g:880:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
        {
        // Ct.g:880:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
        // Ct.g:881:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
        {
        // Ct.g:881:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
        int cnt27=0;
        loop27:
        do {
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==COMPONENT||(LA27_0>=22 && LA27_0<=24)) ) {
                alt27=1;
            }


            switch (alt27) {
        	case 1 :
        	    // Ct.g:882:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        	    {
        	    // Ct.g:882:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        	    // Ct.g:883:6: a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
        	    {
        	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred7_Ct498);
        	    a2_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt27 >= 1 ) break loop27;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(27, input);
                    throw eee;
            }
            cnt27++;
        } while (true);


        }


        }
    }
    // $ANTLR end synpred7_Ct

    // $ANTLR start synpred8_Ct
    public final void synpred8_Ct_fragment() throws RecognitionException {   
        org.be.textbe.ct.textct.AbstractBlockOrNode a2_0 = null;


        // Ct.g:1002:5: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )
        // Ct.g:1002:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        {
        // Ct.g:1002:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        // Ct.g:1003:6: a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
        {
        pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred8_Ct627);
        a2_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_Ct

    // $ANTLR start synpred9_Ct
    public final void synpred9_Ct_fragment() throws RecognitionException {   
        org.be.textbe.ct.textct.AbstractBlockOrNode a2_0 = null;


        // Ct.g:1000:3: ( ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )
        // Ct.g:1000:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
        {
        // Ct.g:1000:3: ( ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
        // Ct.g:1001:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
        {
        // Ct.g:1001:4: ( (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
        int cnt28=0;
        loop28:
        do {
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==COMPONENT||(LA28_0>=22 && LA28_0<=24)) ) {
                alt28=1;
            }


            switch (alt28) {
        	case 1 :
        	    // Ct.g:1002:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        	    {
        	    // Ct.g:1002:5: (a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        	    // Ct.g:1003:6: a2_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
        	    {
        	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred9_Ct627);
        	    a2_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt28 >= 1 ) break loop28;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(28, input);
                    throw eee;
            }
            cnt28++;
        } while (true);


        }


        }
    }
    // $ANTLR end synpred9_Ct

    // $ANTLR start synpred13_Ct
    public final void synpred13_Ct_fragment() throws RecognitionException {   
        org.be.textbe.ct.textct.AbstractBlockOrNode a1_0 = null;


        // Ct.g:1384:5: ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )
        // Ct.g:1384:5: (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        {
        // Ct.g:1384:5: (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        // Ct.g:1385:6: a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
        {
        pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred13_Ct1018);
        a1_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_Ct

    // $ANTLR start synpred14_Ct
    public final void synpred14_Ct_fragment() throws RecognitionException {   
        org.be.textbe.ct.textct.AbstractBlockOrNode a1_0 = null;


        // Ct.g:1382:3: ( ( ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ ) )
        // Ct.g:1382:3: ( ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
        {
        // Ct.g:1382:3: ( ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+ )
        // Ct.g:1383:4: ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
        {
        // Ct.g:1383:4: ( (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode ) )+
        int cnt29=0;
        loop29:
        do {
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==COMPONENT||(LA29_0>=22 && LA29_0<=24)) ) {
                alt29=1;
            }


            switch (alt29) {
        	case 1 :
        	    // Ct.g:1384:5: (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        	    {
        	    // Ct.g:1384:5: (a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode )
        	    // Ct.g:1385:6: a1_0= parse_org_be_textbe_ct_textct_AbstractBlockOrNode
        	    {
        	    pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred14_Ct1018);
        	    a1_0=parse_org_be_textbe_ct_textct_AbstractBlockOrNode();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt29 >= 1 ) break loop29;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(29, input);
                    throw eee;
            }
            cnt29++;
        } while (true);


        }


        }
    }
    // $ANTLR end synpred14_Ct

    // $ANTLR start synpred20_Ct
    public final void synpred20_Ct_fragment() throws RecognitionException {   
        Token a0=null;
        org.be.textbe.ct.textct.Component a1_0 = null;


        // Ct.g:1864:3: ( (a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component ) ) )
        // Ct.g:1864:3: (a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component ) )
        {
        // Ct.g:1864:3: (a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component ) )
        // Ct.g:1865:4: a0= '#C' (a1_0= parse_org_be_textbe_ct_textct_Component )
        {
        a0=(Token)match(input,29,FOLLOW_29_in_synpred20_Ct1499); if (state.failed) return ;
        // Ct.g:1880:4: (a1_0= parse_org_be_textbe_ct_textct_Component )
        // Ct.g:1881:5: a1_0= parse_org_be_textbe_ct_textct_Component
        {
        pushFollow(FOLLOW_parse_org_be_textbe_ct_textct_Component_in_synpred20_Ct1525);
        a1_0=parse_org_be_textbe_ct_textct_Component();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_Ct

    // $ANTLR start synpred26_Ct
    public final void synpred26_Ct_fragment() throws RecognitionException {   
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;

        // Ct.g:2028:2: ( (a0= COMPONENT ) ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) ) )
        // Ct.g:2028:2: (a0= COMPONENT ) ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) )
        {
        // Ct.g:2028:2: (a0= COMPONENT )
        // Ct.g:2029:3: a0= COMPONENT
        {
        a0=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred26_Ct1737); if (state.failed) return ;

        }

        // Ct.g:2067:2: ( (a1= TEXT ) | (a2= COMPONENT ) | (a3= COMPONENTNAME ) | (a4= REQUIREMENT ) )
        int alt30=4;
        switch ( input.LA(1) ) {
        case TEXT:
            {
            alt30=1;
            }
            break;
        case COMPONENT:
            {
            alt30=2;
            }
            break;
        case COMPONENTNAME:
            {
            alt30=3;
            }
            break;
        case REQUIREMENT:
            {
            alt30=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 30, 0, input);

            throw nvae;
        }

        switch (alt30) {
            case 1 :
                // Ct.g:2068:3: (a1= TEXT )
                {
                // Ct.g:2068:3: (a1= TEXT )
                // Ct.g:2069:4: a1= TEXT
                {
                a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_synpred26_Ct1767); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // Ct.g:2108:6: (a2= COMPONENT )
                {
                // Ct.g:2108:6: (a2= COMPONENT )
                // Ct.g:2109:4: a2= COMPONENT
                {
                a2=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred26_Ct1805); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // Ct.g:2148:6: (a3= COMPONENTNAME )
                {
                // Ct.g:2148:6: (a3= COMPONENTNAME )
                // Ct.g:2149:4: a3= COMPONENTNAME
                {
                a3=(Token)match(input,COMPONENTNAME,FOLLOW_COMPONENTNAME_in_synpred26_Ct1843); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // Ct.g:2188:6: (a4= REQUIREMENT )
                {
                // Ct.g:2188:6: (a4= REQUIREMENT )
                // Ct.g:2189:4: a4= REQUIREMENT
                {
                a4=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred26_Ct1881); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred26_Ct

    // Delegated rules

    public final boolean synpred7_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Ct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Ct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\13\uffff";
    static final String DFA24_eofS =
        "\13\uffff";
    static final String DFA24_minS =
        "\4\4\7\uffff";
    static final String DFA24_maxS =
        "\1\30\3\31\7\uffff";
    static final String DFA24_acceptS =
        "\4\uffff\1\7\1\1\1\4\1\2\1\5\1\3\1\6";
    static final String DFA24_specialS =
        "\13\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\4\21\uffff\1\1\1\2\1\3",
            "\1\5\24\uffff\1\6",
            "\1\7\24\uffff\1\10",
            "\1\11\24\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "2456:1: parse_org_be_textbe_ct_textct_AbstractBlockOrNode returns [org.be.textbe.ct.textct.AbstractBlockOrNode element = null] : (c0= parse_org_be_textbe_ct_textct_AggregatedNode | c1= parse_org_be_textbe_ct_textct_AssociatedNode | c2= parse_org_be_textbe_ct_textct_InheritedNode | c3= parse_org_be_textbe_ct_textct_AggregatedBlock | c4= parse_org_be_textbe_ct_textct_AssociatedBlock | c5= parse_org_be_textbe_ct_textct_InheritedBlock | c6= parse_org_be_textbe_ct_textct_Node );";
        }
    }
 

    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_TextCT_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_OptionList_in_parse_org_be_textbe_ct_textct_TextCT124 = new BitSet(new long[]{0x0000000070200000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_RequirementList_in_parse_org_be_textbe_ct_textct_TextCT159 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_ComponentList_in_parse_org_be_textbe_ct_textct_TextCT194 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_CompositionTree_in_parse_org_be_textbe_ct_textct_TextCT224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_be_textbe_ct_textct_CompositionTree257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_Node_in_parse_org_be_textbe_ct_textct_CompositionTree275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_org_be_textbe_ct_textct_AggregatedNode308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_AggregatedNode326 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_parse_org_be_textbe_ct_textct_AggregatedNode369 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_23_in_parse_org_be_textbe_ct_textct_AssociatedNode437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_AssociatedNode455 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_parse_org_be_textbe_ct_textct_AssociatedNode498 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_ct_textct_InheritedNode566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_InheritedNode584 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_parse_org_be_textbe_ct_textct_InheritedNode627 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_22_in_parse_org_be_textbe_ct_textct_AggregatedBlock695 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_org_be_textbe_ct_textct_AggregatedBlock709 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractNode_in_parse_org_be_textbe_ct_textct_AggregatedBlock732 = new BitSet(new long[]{0x0000000005C00010L});
    public static final BitSet FOLLOW_26_in_parse_org_be_textbe_ct_textct_AggregatedBlock758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_org_be_textbe_ct_textct_AssociatedBlock787 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_org_be_textbe_ct_textct_AssociatedBlock801 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractNode_in_parse_org_be_textbe_ct_textct_AssociatedBlock824 = new BitSet(new long[]{0x0000000005C00010L});
    public static final BitSet FOLLOW_26_in_parse_org_be_textbe_ct_textct_AssociatedBlock850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_ct_textct_InheritedBlock879 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_org_be_textbe_ct_textct_InheritedBlock893 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractNode_in_parse_org_be_textbe_ct_textct_InheritedBlock916 = new BitSet(new long[]{0x0000000005C00010L});
    public static final BitSet FOLLOW_26_in_parse_org_be_textbe_ct_textct_InheritedBlock942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_Node975 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_parse_org_be_textbe_ct_textct_Node1018 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_27_in_parse_org_be_textbe_ct_textct_OptionList1086 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_Option_in_parse_org_be_textbe_ct_textct_OptionList1109 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_Option1154 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_parse_org_be_textbe_ct_textct_Option1175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_Option1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_org_be_textbe_ct_textct_RequirementList1229 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_Requirement_in_parse_org_be_textbe_ct_textct_RequirementList1252 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_ct_textct_Requirement1297 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_BEHAVIOR_in_parse_org_be_textbe_ct_textct_Requirement1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_ct_textct_Requirement1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_Requirement1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_Requirement1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_org_be_textbe_ct_textct_ComponentList1499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_Component_in_parse_org_be_textbe_ct_textct_ComponentList1525 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_30_in_parse_org_be_textbe_ct_textct_ComponentList1575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_SystemComponent_in_parse_org_be_textbe_ct_textct_ComponentList1601 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_parse_org_be_textbe_ct_textct_ComponentList1651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_Component_in_parse_org_be_textbe_ct_textct_ComponentList1677 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_Component1737 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_Component1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_Component1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTNAME_in_parse_org_be_textbe_ct_textct_Component1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_ct_textct_Component1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_SystemComponent_in_parse_org_be_textbe_ct_textct_Component1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_SystemComponent1949 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_be_textbe_ct_textct_SystemComponent1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_ct_textct_SystemComponent2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTNAME_in_parse_org_be_textbe_ct_textct_SystemComponent2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_ct_textct_SystemComponent2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AggregatedNode_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AssociatedNode_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_InheritedNode_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AggregatedBlock_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AssociatedBlock_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_InheritedBlock_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_Node_in_parse_org_be_textbe_ct_textct_AbstractBlockOrNode2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AggregatedNode_in_parse_org_be_textbe_ct_textct_AbstractNode2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AssociatedNode_in_parse_org_be_textbe_ct_textct_AbstractNode2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_InheritedNode_in_parse_org_be_textbe_ct_textct_AbstractNode2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_Node_in_parse_org_be_textbe_ct_textct_AbstractNode2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_ComponentList_in_synpred3_Ct194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred4_Ct369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred5_Ct369 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred6_Ct498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred7_Ct498 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred8_Ct627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred9_Ct627 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred13_Ct1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_AbstractBlockOrNode_in_synpred14_Ct1018 = new BitSet(new long[]{0x0000000001C00012L});
    public static final BitSet FOLLOW_29_in_synpred20_Ct1499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_ct_textct_Component_in_synpred20_Ct1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred26_Ct1737 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_TEXT_in_synpred26_Ct1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred26_Ct1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTNAME_in_synpred26_Ct1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred26_Ct1881 = new BitSet(new long[]{0x0000000000000002L});

}