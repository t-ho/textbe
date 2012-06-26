// $ANTLR ${project.version} ${buildNumber}

	package org.be.textbe.st.textst.resource.st.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class StParser extends StANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "REQUIREMENT", "VALIDITY", "COMPONENT", "TEXT2", "NUMBER", "QUALIFIER", "MCI", "OPERATOR", "UPPERBOUND", "LINEBREAK", "WHITESPACE", "'#ST'", "'#P{'", "'#'", "'}'", "'#N{'", "'>'", "':'", "'_'", "'<'", "'#OPTIONS'", "'='", "'#RT'", "'#C'", "'#SC'", "'#SR'", "'.'"
    };
    public static final int EOF=-1;
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
    public static final int REQUIREMENT=4;
    public static final int VALIDITY=5;
    public static final int COMPONENT=6;
    public static final int TEXT2=7;
    public static final int NUMBER=8;
    public static final int QUALIFIER=9;
    public static final int MCI=10;
    public static final int OPERATOR=11;
    public static final int UPPERBOUND=12;
    public static final int LINEBREAK=13;
    public static final int WHITESPACE=14;

    // delegates
    // delegators


        public StParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public StParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[120+1];
             
             
        }
        

    public String[] getTokenNames() { return StParser.tokenNames; }
    public String getGrammarFileName() { return "St.g"; }


    	private org.be.textbe.st.textst.resource.st.IStTokenResolverFactory tokenResolverFactory = new org.be.textbe.st.textst.resource.st.mopp.StTokenResolverFactory();
    	
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
    	private java.util.List<org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal> expectedElements = new java.util.ArrayList<org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal>();
    	
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
    		postParseCommands.add(new org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>() {
    			public boolean execute(org.be.textbe.st.textst.resource.st.IStTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.be.textbe.st.textst.resource.st.IStProblem() {
    					public org.be.textbe.st.textst.resource.st.StEProblemSeverity getSeverity() {
    						return org.be.textbe.st.textst.resource.st.StEProblemSeverity.ERROR;
    					}
    					public org.be.textbe.st.textst.resource.st.StEProblemType getType() {
    						return org.be.textbe.st.textst.resource.st.StEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.be.textbe.st.textst.resource.st.IStQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.be.textbe.st.textst.resource.st.IStExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal expectedElement = new org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal(terminal, followSetID, containmentTrace);
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
    		postParseCommands.add(new org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>() {
    			public boolean execute(org.be.textbe.st.textst.resource.st.IStTextResource resource) {
    				org.be.textbe.st.textst.resource.st.IStLocationMap locationMap = resource.getLocationMap();
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
    		postParseCommands.add(new org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>() {
    			public boolean execute(org.be.textbe.st.textst.resource.st.IStTextResource resource) {
    				org.be.textbe.st.textst.resource.st.IStLocationMap locationMap = resource.getLocationMap();
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
    	protected void setLocalizationEnd(java.util.Collection<org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>() {
    			public boolean execute(org.be.textbe.st.textst.resource.st.IStTextResource resource) {
    				org.be.textbe.st.textst.resource.st.IStLocationMap locationMap = resource.getLocationMap();
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
    	
    	public org.be.textbe.st.textst.resource.st.IStTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new StParser(new org.antlr.runtime3_3_0.CommonTokenStream(new StLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new StParser(new org.antlr.runtime3_3_0.CommonTokenStream(new StLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			org.be.textbe.st.textst.resource.st.mopp.StPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public StParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((StLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((StLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.be.textbe.st.textst.TextST.class) {
    				return parse_org_be_textbe_st_textst_TextST();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.StructureTree.class) {
    				return parse_org_be_textbe_st_textst_StructureTree();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.ParallelBlock.class) {
    				return parse_org_be_textbe_st_textst_ParallelBlock();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.AlternativeBlock.class) {
    				return parse_org_be_textbe_st_textst_AlternativeBlock();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.RelatedToNode.class) {
    				return parse_org_be_textbe_st_textst_RelatedToNode();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.DefinedByNode.class) {
    				return parse_org_be_textbe_st_textst_DefinedByNode();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.Node.class) {
    				return parse_org_be_textbe_st_textst_Node();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.OptionList.class) {
    				return parse_org_be_textbe_st_textst_OptionList();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.Option.class) {
    				return parse_org_be_textbe_st_textst_Option();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.RequirementList.class) {
    				return parse_org_be_textbe_st_textst_RequirementList();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.Requirement.class) {
    				return parse_org_be_textbe_st_textst_Requirement();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.ComponentList.class) {
    				return parse_org_be_textbe_st_textst_ComponentList();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.Component.class) {
    				return parse_org_be_textbe_st_textst_Component();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.SystemComponent.class) {
    				return parse_org_be_textbe_st_textst_SystemComponent();
    			}
    			if (type.getInstanceClass() == org.be.textbe.st.textst.SecondaryRelation.class) {
    				return parse_org_be_textbe_st_textst_SecondaryRelation();
    			}
    		}
    		throw new org.be.textbe.st.textst.resource.st.mopp.StUnexpectedContentTypeException(typeObject);
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
    			typeObject = options.get(org.be.textbe.st.textst.resource.st.IStOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.be.textbe.st.textst.resource.st.IStParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>>();
    		org.be.textbe.st.textst.resource.st.mopp.StParseResult parseResult = new org.be.textbe.st.textst.resource.st.mopp.StParseResult();
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
    	
    	public java.util.List<org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.be.textbe.st.textst.resource.st.IStTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
    		org.be.textbe.st.textst.resource.st.IStParseResult result = parse();
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
    			for (org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal>();
    		java.util.List<org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal> newFollowSet = new java.util.ArrayList<org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 194;
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
    				for (org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.be.textbe.st.textst.resource.st.util.StPair<org.be.textbe.st.textst.resource.st.IStExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.be.textbe.st.textst.resource.st.util.StPair<org.be.textbe.st.textst.resource.st.IStExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							org.be.textbe.st.textst.resource.st.IStExpectedElement newFollower = newFollowerPair.getLeft();
    							org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal newFollowTerminal = new org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
    		for (org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.be.textbe.st.textst.resource.st.mopp.StExpectedTerminal expectedElement, int tokenIndex) {
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
    // St.g:505:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_be_textbe_st_textst_TextST ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        org.be.textbe.st.textst.TextST c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // St.g:506:1: ( (c0= parse_org_be_textbe_st_textst_TextST ) EOF )
            // St.g:507:2: (c0= parse_org_be_textbe_st_textst_TextST ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_0, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_1, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // St.g:517:2: (c0= parse_org_be_textbe_st_textst_TextST )
            // St.g:518:3: c0= parse_org_be_textbe_st_textst_TextST
            {
            pushFollow(FOLLOW_parse_org_be_textbe_st_textst_TextST_in_start82);
            c0=parse_org_be_textbe_st_textst_TextST();

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


    // $ANTLR start "parse_org_be_textbe_st_textst_TextST"
    // St.g:526:1: parse_org_be_textbe_st_textst_TextST returns [org.be.textbe.st.textst.TextST element = null] : ( (a0_0= parse_org_be_textbe_st_textst_OptionList ) )? ( (a1_0= parse_org_be_textbe_st_textst_RequirementList ) )? ( (a2_0= parse_org_be_textbe_st_textst_ComponentList ) )? (a3_0= parse_org_be_textbe_st_textst_StructureTree ) ;
    public final org.be.textbe.st.textst.TextST parse_org_be_textbe_st_textst_TextST() throws RecognitionException {
        org.be.textbe.st.textst.TextST element =  null;
        int parse_org_be_textbe_st_textst_TextST_StartIndex = input.index();
        org.be.textbe.st.textst.OptionList a0_0 = null;

        org.be.textbe.st.textst.RequirementList a1_0 = null;

        org.be.textbe.st.textst.ComponentList a2_0 = null;

        org.be.textbe.st.textst.StructureTree a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // St.g:529:1: ( ( (a0_0= parse_org_be_textbe_st_textst_OptionList ) )? ( (a1_0= parse_org_be_textbe_st_textst_RequirementList ) )? ( (a2_0= parse_org_be_textbe_st_textst_ComponentList ) )? (a3_0= parse_org_be_textbe_st_textst_StructureTree ) )
            // St.g:530:2: ( (a0_0= parse_org_be_textbe_st_textst_OptionList ) )? ( (a1_0= parse_org_be_textbe_st_textst_RequirementList ) )? ( (a2_0= parse_org_be_textbe_st_textst_ComponentList ) )? (a3_0= parse_org_be_textbe_st_textst_StructureTree )
            {
            // St.g:530:2: ( (a0_0= parse_org_be_textbe_st_textst_OptionList ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // St.g:531:3: (a0_0= parse_org_be_textbe_st_textst_OptionList )
                    {
                    // St.g:531:3: (a0_0= parse_org_be_textbe_st_textst_OptionList )
                    // St.g:532:4: a0_0= parse_org_be_textbe_st_textst_OptionList
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_OptionList_in_parse_org_be_textbe_st_textst_TextST124);
                    a0_0=parse_org_be_textbe_st_textst_OptionList();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createTextST();
                      					incompleteObjects.push(element);
                      				}
                      				if (a0_0 != null) {
                      					if (a0_0 != null) {
                      						Object value = a0_0;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__OPTIONS), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_0_0_0_0, a0_0, true);
                      					copyLocalizationInfos(a0_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_1, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }
            // St.g:562:2: ( (a1_0= parse_org_be_textbe_st_textst_RequirementList ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // St.g:563:3: (a1_0= parse_org_be_textbe_st_textst_RequirementList )
                    {
                    // St.g:563:3: (a1_0= parse_org_be_textbe_st_textst_RequirementList )
                    // St.g:564:4: a1_0= parse_org_be_textbe_st_textst_RequirementList
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_RequirementList_in_parse_org_be_textbe_st_textst_TextST159);
                    a1_0=parse_org_be_textbe_st_textst_RequirementList();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createTextST();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1_0 != null) {
                      					if (a1_0 != null) {
                      						Object value = a1_0;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__REQUIREMENTS), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_0_0_0_1, a1_0, true);
                      					copyLocalizationInfos(a1_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 2, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 2, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 2, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 2, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }
            // St.g:593:2: ( (a2_0= parse_org_be_textbe_st_textst_ComponentList ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=27 && LA3_0<=28)) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                int LA3_2 = input.LA(2);

                if ( (synpred3_St()) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // St.g:594:3: (a2_0= parse_org_be_textbe_st_textst_ComponentList )
                    {
                    // St.g:594:3: (a2_0= parse_org_be_textbe_st_textst_ComponentList )
                    // St.g:595:4: a2_0= parse_org_be_textbe_st_textst_ComponentList
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_ComponentList_in_parse_org_be_textbe_st_textst_TextST194);
                    a2_0=parse_org_be_textbe_st_textst_ComponentList();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createTextST();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2_0 != null) {
                      					if (a2_0 != null) {
                      						Object value = a2_0;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__COMPONENTS), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_0_0_0_2, a2_0, true);
                      					copyLocalizationInfos(a2_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 3, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }
            // St.g:621:2: (a3_0= parse_org_be_textbe_st_textst_StructureTree )
            // St.g:622:3: a3_0= parse_org_be_textbe_st_textst_StructureTree
            {
            pushFollow(FOLLOW_parse_org_be_textbe_st_textst_StructureTree_in_parse_org_be_textbe_st_textst_TextST224);
            a3_0=parse_org_be_textbe_st_textst_StructureTree();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createTextST();
              				incompleteObjects.push(element);
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					Object value = a3_0;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.TEXT_ST__STRUCTURE_TREE), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_0_0_0_3, a3_0, true);
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
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_be_textbe_st_textst_TextST_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_TextST"


    // $ANTLR start "parse_org_be_textbe_st_textst_StructureTree"
    // St.g:648:1: parse_org_be_textbe_st_textst_StructureTree returns [org.be.textbe.st.textst.StructureTree element = null] : a0= '#ST' (a1_0= parse_org_be_textbe_st_textst_Node ) ;
    public final org.be.textbe.st.textst.StructureTree parse_org_be_textbe_st_textst_StructureTree() throws RecognitionException {
        org.be.textbe.st.textst.StructureTree element =  null;
        int parse_org_be_textbe_st_textst_StructureTree_StartIndex = input.index();
        Token a0=null;
        org.be.textbe.st.textst.Node a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // St.g:651:1: (a0= '#ST' (a1_0= parse_org_be_textbe_st_textst_Node ) )
            // St.g:652:2: a0= '#ST' (a1_0= parse_org_be_textbe_st_textst_Node )
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_org_be_textbe_st_textst_StructureTree257); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createStructureTree();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_1_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
              	
            }
            // St.g:670:2: (a1_0= parse_org_be_textbe_st_textst_Node )
            // St.g:671:3: a1_0= parse_org_be_textbe_st_textst_Node
            {
            pushFollow(FOLLOW_parse_org_be_textbe_st_textst_Node_in_parse_org_be_textbe_st_textst_StructureTree275);
            a1_0=parse_org_be_textbe_st_textst_Node();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createStructureTree();
              				incompleteObjects.push(element);
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					Object value = a1_0;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.STRUCTURE_TREE__ROOT_NODE), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_1_0_0_1, a1_0, true);
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
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_be_textbe_st_textst_StructureTree_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_StructureTree"


    // $ANTLR start "parse_org_be_textbe_st_textst_ParallelBlock"
    // St.g:697:1: parse_org_be_textbe_st_textst_ParallelBlock returns [org.be.textbe.st.textst.ParallelBlock element = null] : a0= '#P{' ( (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) ) )+ a3= '}' ;
    public final org.be.textbe.st.textst.ParallelBlock parse_org_be_textbe_st_textst_ParallelBlock() throws RecognitionException {
        org.be.textbe.st.textst.ParallelBlock element =  null;
        int parse_org_be_textbe_st_textst_ParallelBlock_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.be.textbe.st.textst.AbstractNode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // St.g:700:1: (a0= '#P{' ( (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) ) )+ a3= '}' )
            // St.g:701:2: a0= '#P{' ( (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) ) )+ a3= '}'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_be_textbe_st_textst_ParallelBlock308); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createParallelBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_2_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 7);
              	
            }
            // St.g:715:2: ( (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // St.g:716:3: (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) )
            	    {
            	    // St.g:716:3: (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) )
            	    // St.g:717:4: a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode )
            	    {
            	    a1=(Token)match(input,17,FOLLOW_17_in_parse_org_be_textbe_st_textst_ParallelBlock331); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createParallelBlock();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_2_0_0_1_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      			
            	    }
            	    // St.g:737:4: (a2_0= parse_org_be_textbe_st_textst_AbstractNode )
            	    // St.g:738:5: a2_0= parse_org_be_textbe_st_textst_AbstractNode
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_AbstractNode_in_parse_org_be_textbe_st_textst_ParallelBlock357);
            	    a2_0=parse_org_be_textbe_st_textst_AbstractNode();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createParallelBlock();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a2_0 != null) {
            	      						if (a2_0 != null) {
            	      							Object value = a2_0;
            	      							addObjectToList(element, org.be.textbe.st.textst.TextstPackage.PARALLEL_BLOCK__CHILD_NODE, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_2_0_0_1_0_0_1, a2_0, true);
            	      						copyLocalizationInfos(a2_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 9);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 9);
            	      			
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
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 10);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 10);
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_org_be_textbe_st_textst_ParallelBlock398); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createParallelBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_2_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 11);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 11);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 11);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 11);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_be_textbe_st_textst_ParallelBlock_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_ParallelBlock"


    // $ANTLR start "parse_org_be_textbe_st_textst_AlternativeBlock"
    // St.g:791:1: parse_org_be_textbe_st_textst_AlternativeBlock returns [org.be.textbe.st.textst.AlternativeBlock element = null] : a0= '#N{' ( (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) ) )+ a3= '}' ;
    public final org.be.textbe.st.textst.AlternativeBlock parse_org_be_textbe_st_textst_AlternativeBlock() throws RecognitionException {
        org.be.textbe.st.textst.AlternativeBlock element =  null;
        int parse_org_be_textbe_st_textst_AlternativeBlock_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.be.textbe.st.textst.AbstractNode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // St.g:794:1: (a0= '#N{' ( (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) ) )+ a3= '}' )
            // St.g:795:2: a0= '#N{' ( (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) ) )+ a3= '}'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_org_be_textbe_st_textst_AlternativeBlock427); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createAlternativeBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_3_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 12);
              	
            }
            // St.g:809:2: ( (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // St.g:810:3: (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) )
            	    {
            	    // St.g:810:3: (a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode ) )
            	    // St.g:811:4: a1= '#' (a2_0= parse_org_be_textbe_st_textst_AbstractNode )
            	    {
            	    a1=(Token)match(input,17,FOLLOW_17_in_parse_org_be_textbe_st_textst_AlternativeBlock450); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createAlternativeBlock();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_3_0_0_1_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
            	      			
            	    }
            	    // St.g:831:4: (a2_0= parse_org_be_textbe_st_textst_AbstractNode )
            	    // St.g:832:5: a2_0= parse_org_be_textbe_st_textst_AbstractNode
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_AbstractNode_in_parse_org_be_textbe_st_textst_AlternativeBlock476);
            	    a2_0=parse_org_be_textbe_st_textst_AbstractNode();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createAlternativeBlock();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a2_0 != null) {
            	      						if (a2_0 != null) {
            	      							Object value = a2_0;
            	      							addObjectToList(element, org.be.textbe.st.textst.TextstPackage.ALTERNATIVE_BLOCK__CHILD_NODE, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_3_0_0_1_0_0_1, a2_0, true);
            	      						copyLocalizationInfos(a2_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 14);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 14);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 15);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 15);
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_org_be_textbe_st_textst_AlternativeBlock517); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createAlternativeBlock();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_3_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 16);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 16);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 16);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 16);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_be_textbe_st_textst_AlternativeBlock_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_AlternativeBlock"


    // $ANTLR start "parse_org_be_textbe_st_textst_RelatedToNode"
    // St.g:885:1: parse_org_be_textbe_st_textst_RelatedToNode returns [org.be.textbe.st.textst.RelatedToNode element = null] : a0= '>' ( ( ( (a1= REQUIREMENT ) )* ) )? ( (a2= VALIDITY ) )? ( ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? ) | ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? ) | a22= '_' ) ( (a23= OPERATOR ) )? ( (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )? ;
    public final org.be.textbe.st.textst.RelatedToNode parse_org_be_textbe_st_textst_RelatedToNode() throws RecognitionException {
        org.be.textbe.st.textst.RelatedToNode element =  null;
        int parse_org_be_textbe_st_textst_RelatedToNode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
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
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;
        Token a22=null;
        Token a23=null;
        org.be.textbe.st.textst.AbstractBlockOrNode a24_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // St.g:888:1: (a0= '>' ( ( ( (a1= REQUIREMENT ) )* ) )? ( (a2= VALIDITY ) )? ( ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? ) | ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? ) | a22= '_' ) ( (a23= OPERATOR ) )? ( (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )? )
            // St.g:889:2: a0= '>' ( ( ( (a1= REQUIREMENT ) )* ) )? ( (a2= VALIDITY ) )? ( ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? ) | ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? ) | a22= '_' ) ( (a23= OPERATOR ) )? ( (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )?
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_org_be_textbe_st_textst_RelatedToNode546); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_19, 17);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_20, 17);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_21, 17);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_22, 17);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_23, 17);
              	
            }
            // St.g:907:2: ( ( ( (a1= REQUIREMENT ) )* ) )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case REQUIREMENT:
                    {
                    alt7=1;
                    }
                    break;
                case VALIDITY:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (synpred7_St()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case COMPONENT:
                    {
                    int LA7_3 = input.LA(2);

                    if ( (synpred7_St()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case MCI:
                    {
                    int LA7_4 = input.LA(2);

                    if ( (synpred7_St()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA7_5 = input.LA(2);

                    if ( (synpred7_St()) ) {
                        alt7=1;
                    }
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // St.g:908:3: ( ( (a1= REQUIREMENT ) )* )
                    {
                    // St.g:908:3: ( ( (a1= REQUIREMENT ) )* )
                    // St.g:909:4: ( (a1= REQUIREMENT ) )*
                    {
                    // St.g:909:4: ( (a1= REQUIREMENT ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==REQUIREMENT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // St.g:910:5: (a1= REQUIREMENT )
                    	    {
                    	    // St.g:910:5: (a1= REQUIREMENT )
                    	    // St.g:911:6: a1= REQUIREMENT
                    	    {
                    	    a1=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_RelatedToNode582); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						if (a1 != null) {
                    	      							org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                    	      							tokenResolver.setOptions(getOptions());
                    	      							org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                    	      							tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__REQUIREMENT_REF), result);
                    	      							Object resolvedObject = result.getResolvedToken();
                    	      							if (resolvedObject == null) {
                    	      								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                    	      							}
                    	      							java.lang.String resolved = (java.lang.String) resolvedObject;
                    	      							if (resolved != null) {
                    	      								Object value = resolved;
                    	      								addObjectToList(element, org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__REQUIREMENT_REF, value);
                    	      								completedElement(value, false);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_1_0_0_0, resolved, true);
                    	      							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
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
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_19, 18);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_20, 18);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_21, 18);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_22, 18);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_23, 18);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_20, 19);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_21, 19);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_22, 19);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_23, 19);
              	
            }
            // St.g:961:2: ( (a2= VALIDITY ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==VALIDITY) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // St.g:962:3: (a2= VALIDITY )
                    {
                    // St.g:962:3: (a2= VALIDITY )
                    // St.g:963:4: a2= VALIDITY
                    {
                    a2=(Token)match(input,VALIDITY,FOLLOW_VALIDITY_in_parse_org_be_textbe_st_textst_RelatedToNode650); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VALIDITY");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__TRACEABILITY_STATUS), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					org.be.textbe.st.textst.Validity resolved = (org.be.textbe.st.textst.Validity) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__TRACEABILITY_STATUS), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_2, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_21, 20);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_22, 20);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_23, 20);
              	
            }
            // St.g:1001:2: ( ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? ) | ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? ) | a22= '_' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case COMPONENT:
                {
                alt17=1;
                }
                break;
            case MCI:
                {
                alt17=2;
                }
                break;
            case 22:
                {
                alt17=3;
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
                    // St.g:1002:3: ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? )
                    {
                    // St.g:1002:3: ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? )
                    // St.g:1003:4: (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )?
                    {
                    // St.g:1003:4: (a3= COMPONENT )
                    // St.g:1004:5: a3= COMPONENT
                    {
                    a3=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode695); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a3 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_REF), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_REF), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_0_0_0_0_0, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_24, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_25, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_26, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_27, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_28, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_29, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 21, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 21, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 21, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 21, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 21, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 21, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 21, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 21, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 21, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 21);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 21);
                      			
                    }
                    // St.g:1058:4: ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )?
                    int alt10=2;
                    switch ( input.LA(1) ) {
                        case TEXT2:
                        case NUMBER:
                            {
                            alt10=1;
                            }
                            break;
                        case COMPONENT:
                            {
                            int LA10_2 = input.LA(2);

                            if ( (synpred12_St()) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case REQUIREMENT:
                            {
                            int LA10_3 = input.LA(2);

                            if ( (synpred12_St()) ) {
                                alt10=1;
                            }
                            }
                            break;
                    }

                    switch (alt10) {
                        case 1 :
                            // St.g:1059:5: ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) )
                            {
                            // St.g:1059:5: ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) )
                            int alt9=4;
                            switch ( input.LA(1) ) {
                            case TEXT2:
                                {
                                alt9=1;
                                }
                                break;
                            case NUMBER:
                                {
                                alt9=2;
                                }
                                break;
                            case COMPONENT:
                                {
                                alt9=3;
                                }
                                break;
                            case REQUIREMENT:
                                {
                                alt9=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 0, input);

                                throw nvae;
                            }

                            switch (alt9) {
                                case 1 :
                                    // St.g:1060:6: (a4= TEXT2 )
                                    {
                                    // St.g:1060:6: (a4= TEXT2 )
                                    // St.g:1061:7: a4= TEXT2
                                    {
                                    a4=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_RelatedToNode749); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a4 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_0_0_0_0_1_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_28, 22);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_29, 22);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 22);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 22, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 22, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 22, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 22, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 22, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 22, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 22, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 22, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 22, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 22);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 22);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 22);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 22);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:1112:12: (a5= NUMBER )
                                    {
                                    // St.g:1112:12: (a5= NUMBER )
                                    // St.g:1113:7: a5= NUMBER
                                    {
                                    a5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_RelatedToNode814); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a5 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_0_0_0_0_1_0_1_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_28, 23);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_29, 23);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 23);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 23, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 23, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 23, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 23, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 23, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 23, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 23, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 23, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 23, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 23);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 23);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 23);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 23);
                                      					
                                    }

                                    }
                                    break;
                                case 3 :
                                    // St.g:1164:12: (a6= COMPONENT )
                                    {
                                    // St.g:1164:12: (a6= COMPONENT )
                                    // St.g:1165:7: a6= COMPONENT
                                    {
                                    a6=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode879); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a6 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_0_0_0_0_1_0_2_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_28, 24);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_29, 24);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 24);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 24, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 24, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 24, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 24, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 24, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 24, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 24, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 24, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 24, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 24);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 24);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 24);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 24);
                                      					
                                    }

                                    }
                                    break;
                                case 4 :
                                    // St.g:1216:12: (a7= REQUIREMENT )
                                    {
                                    // St.g:1216:12: (a7= REQUIREMENT )
                                    // St.g:1217:7: a7= REQUIREMENT
                                    {
                                    a7=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_RelatedToNode944); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a7 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_0_0_0_0_1_0_3_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_28, 25);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_29, 25);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 25);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 25, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 25, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 25, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 25, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 25, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 25, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 25, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 25, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 25, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 25);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 25);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 25);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 25);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_28, 26);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_29, 26);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 26);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 26, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 26, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 26, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 26, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 26, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 26, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 26, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 26, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 26, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 26);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 26);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 26);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 26);
                      			
                    }
                    // St.g:1289:4: ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==QUALIFIER) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // St.g:1290:5: ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) )
                            {
                            // St.g:1290:5: ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) )
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==QUALIFIER) ) {
                                int LA11_1 = input.LA(2);

                                if ( (LA11_1==EOF||(LA11_1>=REQUIREMENT && LA11_1<=COMPONENT)||(LA11_1>=MCI && LA11_1<=OPERATOR)||(LA11_1>=16 && LA11_1<=20)||(LA11_1>=22 && LA11_1<=23)) ) {
                                    alt11=1;
                                }
                                else if ( (LA11_1==QUALIFIER) ) {
                                    alt11=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 11, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 0, input);

                                throw nvae;
                            }
                            switch (alt11) {
                                case 1 :
                                    // St.g:1291:6: (a8= QUALIFIER )
                                    {
                                    // St.g:1291:6: (a8= QUALIFIER )
                                    // St.g:1292:7: a8= QUALIFIER
                                    {
                                    a8=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1033); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a8 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStopIndex());
                                      								}
                                      								org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_0_0_0_0_2_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a8, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 27);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 27, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 27, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 27, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 27, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 27, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 27, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 27, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 27, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 27, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 27);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 27);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 27);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 27);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:1341:12: ( (a9= QUALIFIER ) (a10= QUALIFIER ) )
                                    {
                                    // St.g:1341:12: ( (a9= QUALIFIER ) (a10= QUALIFIER ) )
                                    // St.g:1342:7: (a9= QUALIFIER ) (a10= QUALIFIER )
                                    {
                                    // St.g:1342:7: (a9= QUALIFIER )
                                    // St.g:1343:8: a9= QUALIFIER
                                    {
                                    a9=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1107); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a9 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a9).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_0_0_0_0_2_0_1_0_0_0_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a9, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_31, 28);
                                      						
                                    }
                                    // St.g:1378:7: (a10= QUALIFIER )
                                    // St.g:1379:8: a10= QUALIFIER
                                    {
                                    a10=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1167); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a10 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__SECOND_QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__SECOND_QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_0_0_0_0_2_0_1_0_0_0_1, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a10, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 29);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 29, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 29, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 29, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 29, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 29, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 29, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 29, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 29, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 29, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 29);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 29);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 29);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 29);
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 30);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 30, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 30, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 30, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 30, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 30, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 30, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 30, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 30, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 30, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 30);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 30);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 30);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 30);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 31);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 31, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 31, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 31, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 31, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 31, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 31, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 31, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 31, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 31, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 31);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 31);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 31);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 31);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 32);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 32, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 32, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 32, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 32, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 32, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 32, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 32, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 32, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 32, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 32);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 32);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 32);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 32);
                      		
                    }

                    }
                    break;
                case 2 :
                    // St.g:1486:6: ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? )
                    {
                    // St.g:1486:6: ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? )
                    // St.g:1487:4: (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )?
                    {
                    // St.g:1487:4: (a11= MCI )
                    // St.g:1488:5: a11= MCI
                    {
                    a11=(Token)match(input,MCI,FOLLOW_MCI_in_parse_org_be_textbe_st_textst_RelatedToNode1287); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a11 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MCI");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__MCI), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a11).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__MCI), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_0, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a11, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_32, 33);
                      			
                    }
                    // St.g:1523:4: (a12= COMPONENT )
                    // St.g:1524:5: a12= COMPONENT
                    {
                    a12=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode1326); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a12 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_REF), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a12).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_REF), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a12, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_33, 34);
                      			
                    }
                    a13=(Token)match(input,21,FOLLOW_21_in_parse_org_be_textbe_st_textst_RelatedToNode1359); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_34, 35);
                      			
                    }
                    // St.g:1573:4: (a14= COMPONENT )
                    // St.g:1574:5: a14= COMPONENT
                    {
                    a14=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode1385); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a14 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_SET), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__COMPONENT_SET), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_3, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a14, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_35, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_36, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_37, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_38, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_39, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_40, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 36, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 36, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 36, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 36, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 36, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 36, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 36, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 36, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 36, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 36);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 36);
                      			
                    }
                    // St.g:1628:4: ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )?
                    int alt14=2;
                    switch ( input.LA(1) ) {
                        case TEXT2:
                        case NUMBER:
                            {
                            alt14=1;
                            }
                            break;
                        case COMPONENT:
                            {
                            int LA14_2 = input.LA(2);

                            if ( (synpred19_St()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case REQUIREMENT:
                            {
                            int LA14_3 = input.LA(2);

                            if ( (synpred19_St()) ) {
                                alt14=1;
                            }
                            }
                            break;
                    }

                    switch (alt14) {
                        case 1 :
                            // St.g:1629:5: ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) )
                            {
                            // St.g:1629:5: ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) )
                            int alt13=4;
                            switch ( input.LA(1) ) {
                            case TEXT2:
                                {
                                alt13=1;
                                }
                                break;
                            case NUMBER:
                                {
                                alt13=2;
                                }
                                break;
                            case COMPONENT:
                                {
                                alt13=3;
                                }
                                break;
                            case REQUIREMENT:
                                {
                                alt13=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 0, input);

                                throw nvae;
                            }

                            switch (alt13) {
                                case 1 :
                                    // St.g:1630:6: (a15= TEXT2 )
                                    {
                                    // St.g:1630:6: (a15= TEXT2 )
                                    // St.g:1631:7: a15= TEXT2
                                    {
                                    a15=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_RelatedToNode1439); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a15 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a15).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_4_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a15, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_39, 37);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_40, 37);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 37);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 37, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 37, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 37, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 37, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 37, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 37, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 37, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 37, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 37, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 37);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 37);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 37);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 37);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:1682:12: (a16= NUMBER )
                                    {
                                    // St.g:1682:12: (a16= NUMBER )
                                    // St.g:1683:7: a16= NUMBER
                                    {
                                    a16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_RelatedToNode1504); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a16 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a16).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_4_0_1_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a16, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_39, 38);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_40, 38);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 38);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 38, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 38, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 38, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 38, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 38, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 38, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 38, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 38, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 38, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 38);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 38);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 38);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 38);
                                      					
                                    }

                                    }
                                    break;
                                case 3 :
                                    // St.g:1734:12: (a17= COMPONENT )
                                    {
                                    // St.g:1734:12: (a17= COMPONENT )
                                    // St.g:1735:7: a17= COMPONENT
                                    {
                                    a17=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode1569); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a17 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a17).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a17).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a17).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_4_0_2_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a17, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_39, 39);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_40, 39);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 39);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 39, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 39, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 39, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 39, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 39, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 39, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 39, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 39, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 39, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 39);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 39);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 39);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 39);
                                      					
                                    }

                                    }
                                    break;
                                case 4 :
                                    // St.g:1786:12: (a18= REQUIREMENT )
                                    {
                                    // St.g:1786:12: (a18= REQUIREMENT )
                                    // St.g:1787:7: a18= REQUIREMENT
                                    {
                                    a18=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_RelatedToNode1634); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a18 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a18).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a18).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a18).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a18).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_4_0_3_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a18, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_39, 40);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_40, 40);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 40);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 40, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 40, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 40, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 40, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 40, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 40, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 40, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 40, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 40, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 40);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 40);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 40);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 40);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_39, 41);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_40, 41);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 41);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 41, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 41, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 41, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 41, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 41, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 41, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 41, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 41, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 41, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 41);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 41);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 41);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 41);
                      			
                    }
                    // St.g:1859:4: ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==QUALIFIER) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // St.g:1860:5: ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) )
                            {
                            // St.g:1860:5: ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) )
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==QUALIFIER) ) {
                                int LA15_1 = input.LA(2);

                                if ( (LA15_1==EOF||(LA15_1>=REQUIREMENT && LA15_1<=COMPONENT)||(LA15_1>=MCI && LA15_1<=OPERATOR)||(LA15_1>=16 && LA15_1<=20)||(LA15_1>=22 && LA15_1<=23)) ) {
                                    alt15=1;
                                }
                                else if ( (LA15_1==QUALIFIER) ) {
                                    alt15=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 0, input);

                                throw nvae;
                            }
                            switch (alt15) {
                                case 1 :
                                    // St.g:1861:6: (a19= QUALIFIER )
                                    {
                                    // St.g:1861:6: (a19= QUALIFIER )
                                    // St.g:1862:7: a19= QUALIFIER
                                    {
                                    a19=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1723); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a19 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a19).getStopIndex());
                                      								}
                                      								org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_5_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a19, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 42);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 42, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 42, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 42, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 42, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 42, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 42, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 42, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 42, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 42, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 42);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 42);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 42);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 42);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:1911:12: ( (a20= QUALIFIER ) (a21= QUALIFIER ) )
                                    {
                                    // St.g:1911:12: ( (a20= QUALIFIER ) (a21= QUALIFIER ) )
                                    // St.g:1912:7: (a20= QUALIFIER ) (a21= QUALIFIER )
                                    {
                                    // St.g:1912:7: (a20= QUALIFIER )
                                    // St.g:1913:8: a20= QUALIFIER
                                    {
                                    a20=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1797); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a20 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a20).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a20).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a20).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_5_0_1_0_0_0_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a20, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_41, 43);
                                      						
                                    }
                                    // St.g:1948:7: (a21= QUALIFIER )
                                    // St.g:1949:8: a21= QUALIFIER
                                    {
                                    a21=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1857); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a21 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a21.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__SECOND_QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a21).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a21).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a21).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a21).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__SECOND_QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_5_0_1_0_0_0_1, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a21, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 44);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 44, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 44, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 44, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 44, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 44, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 44, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 44, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 44, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 44, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 44);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 44);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 44);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 44);
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 45);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 45, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 45, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 45, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 45, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 45, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 45, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 45, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 45, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 45, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 45);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 45);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 45);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 45);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 46);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 46, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 46, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 46, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 46, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 46, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 46, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 46, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 46, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 46, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 46);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 46);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 46);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 46);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 47);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 47, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 47, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 47, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 47, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 47, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 47, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 47, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 47, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 47, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 47);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 47);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 47);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 47);
                      		
                    }

                    }
                    break;
                case 3 :
                    // St.g:2056:6: a22= '_'
                    {
                    a22=(Token)match(input,22,FOLLOW_22_in_parse_org_be_textbe_st_textst_RelatedToNode1966); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                      				incompleteObjects.push(element);
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_2_0, null, true);
                      			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a22, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 48);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 48, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 48, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 48, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 48, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 48, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 48, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 48, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 48, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 48, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 48);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 48);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 48);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 48);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_30, 49);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 49, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 49, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 49, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 49, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 49, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 49, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 49, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 49, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 49, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 49);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 49);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 49);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 49);
              	
            }
            // St.g:2102:2: ( (a23= OPERATOR ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==OPERATOR) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // St.g:2103:3: (a23= OPERATOR )
                    {
                    // St.g:2103:3: (a23= OPERATOR )
                    // St.g:2104:4: a23= OPERATOR
                    {
                    a23=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_parse_org_be_textbe_st_textst_RelatedToNode1999); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                      					incompleteObjects.push(element);
                      				}
                      				if (a23 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("OPERATOR");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a23.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__OPERATOR), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a23).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a23).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a23).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a23).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__OPERATOR), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_4, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a23, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 50, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 50, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 50, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 50, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 50, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 50, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 50, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 50, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 50, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 50);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 50);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 50);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 50);
              	
            }
            // St.g:2152:2: ( (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=REQUIREMENT && LA19_0<=COMPONENT)||LA19_0==MCI||LA19_0==16||(LA19_0>=19 && LA19_0<=20)||(LA19_0>=22 && LA19_0<=23)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // St.g:2153:3: (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode )
                    {
                    // St.g:2153:3: (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode )
                    // St.g:2154:4: a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_AbstractBlockOrNode_in_parse_org_be_textbe_st_textst_RelatedToNode2038);
                    a24_0=parse_org_be_textbe_st_textst_AbstractBlockOrNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
                      					incompleteObjects.push(element);
                      				}
                      				if (a24_0 != null) {
                      					if (a24_0 != null) {
                      						Object value = a24_0;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.RELATED_TO_NODE__CHILD_NODE), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_5, a24_0, true);
                      					copyLocalizationInfos(a24_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 51);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 51);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 51);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 51);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_be_textbe_st_textst_RelatedToNode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_RelatedToNode"


    // $ANTLR start "parse_org_be_textbe_st_textst_DefinedByNode"
    // St.g:2185:1: parse_org_be_textbe_st_textst_DefinedByNode returns [org.be.textbe.st.textst.DefinedByNode element = null] : a0= '<' ( ( ( (a1= REQUIREMENT ) )* ) )? ( (a2= VALIDITY ) )? ( ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? ) | ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? ) | a22= '_' ) ( (a23= OPERATOR ) )? ( (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )? ;
    public final org.be.textbe.st.textst.DefinedByNode parse_org_be_textbe_st_textst_DefinedByNode() throws RecognitionException {
        org.be.textbe.st.textst.DefinedByNode element =  null;
        int parse_org_be_textbe_st_textst_DefinedByNode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
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
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;
        Token a22=null;
        Token a23=null;
        org.be.textbe.st.textst.AbstractBlockOrNode a24_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // St.g:2188:1: (a0= '<' ( ( ( (a1= REQUIREMENT ) )* ) )? ( (a2= VALIDITY ) )? ( ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? ) | ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? ) | a22= '_' ) ( (a23= OPERATOR ) )? ( (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )? )
            // St.g:2189:2: a0= '<' ( ( ( (a1= REQUIREMENT ) )* ) )? ( (a2= VALIDITY ) )? ( ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? ) | ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? ) | a22= '_' ) ( (a23= OPERATOR ) )? ( (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )?
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_be_textbe_st_textst_DefinedByNode2079); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_42, 52);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_43, 52);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_44, 52);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_45, 52);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_46, 52);
              	
            }
            // St.g:2207:2: ( ( ( (a1= REQUIREMENT ) )* ) )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case REQUIREMENT:
                    {
                    alt21=1;
                    }
                    break;
                case VALIDITY:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred26_St()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case COMPONENT:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred26_St()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case MCI:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred26_St()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA21_5 = input.LA(2);

                    if ( (synpred26_St()) ) {
                        alt21=1;
                    }
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // St.g:2208:3: ( ( (a1= REQUIREMENT ) )* )
                    {
                    // St.g:2208:3: ( ( (a1= REQUIREMENT ) )* )
                    // St.g:2209:4: ( (a1= REQUIREMENT ) )*
                    {
                    // St.g:2209:4: ( (a1= REQUIREMENT ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==REQUIREMENT) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // St.g:2210:5: (a1= REQUIREMENT )
                    	    {
                    	    // St.g:2210:5: (a1= REQUIREMENT )
                    	    // St.g:2211:6: a1= REQUIREMENT
                    	    {
                    	    a1=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_DefinedByNode2115); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						if (a1 != null) {
                    	      							org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                    	      							tokenResolver.setOptions(getOptions());
                    	      							org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                    	      							tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF), result);
                    	      							Object resolvedObject = result.getResolvedToken();
                    	      							if (resolvedObject == null) {
                    	      								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                    	      							}
                    	      							java.lang.String resolved = (java.lang.String) resolvedObject;
                    	      							if (resolved != null) {
                    	      								Object value = resolved;
                    	      								addObjectToList(element, org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__REQUIREMENT_REF, value);
                    	      								completedElement(value, false);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_1_0_0_0, resolved, true);
                    	      							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                    	      						}
                    	      					
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
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_42, 53);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_43, 53);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_44, 53);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_45, 53);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_46, 53);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_43, 54);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_44, 54);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_45, 54);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_46, 54);
              	
            }
            // St.g:2261:2: ( (a2= VALIDITY ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VALIDITY) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // St.g:2262:3: (a2= VALIDITY )
                    {
                    // St.g:2262:3: (a2= VALIDITY )
                    // St.g:2263:4: a2= VALIDITY
                    {
                    a2=(Token)match(input,VALIDITY,FOLLOW_VALIDITY_in_parse_org_be_textbe_st_textst_DefinedByNode2183); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VALIDITY");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					org.be.textbe.st.textst.Validity resolved = (org.be.textbe.st.textst.Validity) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__TRACEABILITY_STATUS), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_2, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_44, 55);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_45, 55);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_46, 55);
              	
            }
            // St.g:2301:2: ( ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? ) | ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? ) | a22= '_' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case COMPONENT:
                {
                alt31=1;
                }
                break;
            case MCI:
                {
                alt31=2;
                }
                break;
            case 22:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // St.g:2302:3: ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? )
                    {
                    // St.g:2302:3: ( (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )? )
                    // St.g:2303:4: (a3= COMPONENT ) ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )? ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )?
                    {
                    // St.g:2303:4: (a3= COMPONENT )
                    // St.g:2304:5: a3= COMPONENT
                    {
                    a3=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode2228); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a3 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_REF), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_REF), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_0_0_0_0_0, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_47, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_48, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_49, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_50, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_51, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_52, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 56, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 56, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 56, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 56, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 56, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 56, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 56, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 56, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 56, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 56);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 56);
                      			
                    }
                    // St.g:2358:4: ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )?
                    int alt24=2;
                    switch ( input.LA(1) ) {
                        case TEXT2:
                        case NUMBER:
                            {
                            alt24=1;
                            }
                            break;
                        case COMPONENT:
                            {
                            int LA24_2 = input.LA(2);

                            if ( (synpred31_St()) ) {
                                alt24=1;
                            }
                            }
                            break;
                        case REQUIREMENT:
                            {
                            int LA24_3 = input.LA(2);

                            if ( (synpred31_St()) ) {
                                alt24=1;
                            }
                            }
                            break;
                    }

                    switch (alt24) {
                        case 1 :
                            // St.g:2359:5: ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) )
                            {
                            // St.g:2359:5: ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) )
                            int alt23=4;
                            switch ( input.LA(1) ) {
                            case TEXT2:
                                {
                                alt23=1;
                                }
                                break;
                            case NUMBER:
                                {
                                alt23=2;
                                }
                                break;
                            case COMPONENT:
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
                                    // St.g:2360:6: (a4= TEXT2 )
                                    {
                                    // St.g:2360:6: (a4= TEXT2 )
                                    // St.g:2361:7: a4= TEXT2
                                    {
                                    a4=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_DefinedByNode2282); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a4 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_0_0_0_0_1_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_51, 57);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_52, 57);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 57);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 57, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 57, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 57, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 57, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 57, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 57, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 57, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 57, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 57, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 57);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 57);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 57);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 57);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:2412:12: (a5= NUMBER )
                                    {
                                    // St.g:2412:12: (a5= NUMBER )
                                    // St.g:2413:7: a5= NUMBER
                                    {
                                    a5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_DefinedByNode2347); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a5 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_0_0_0_0_1_0_1_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_51, 58);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_52, 58);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 58);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 58, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 58, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 58, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 58, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 58, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 58, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 58, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 58, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 58, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 58);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 58);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 58);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 58);
                                      					
                                    }

                                    }
                                    break;
                                case 3 :
                                    // St.g:2464:12: (a6= COMPONENT )
                                    {
                                    // St.g:2464:12: (a6= COMPONENT )
                                    // St.g:2465:7: a6= COMPONENT
                                    {
                                    a6=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode2412); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a6 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_0_0_0_0_1_0_2_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_51, 59);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_52, 59);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 59);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 59, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 59, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 59, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 59, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 59, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 59, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 59, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 59, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 59, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 59);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 59);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 59);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 59);
                                      					
                                    }

                                    }
                                    break;
                                case 4 :
                                    // St.g:2516:12: (a7= REQUIREMENT )
                                    {
                                    // St.g:2516:12: (a7= REQUIREMENT )
                                    // St.g:2517:7: a7= REQUIREMENT
                                    {
                                    a7=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_DefinedByNode2477); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a7 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_0_0_0_0_1_0_3_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_51, 60);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_52, 60);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 60);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 60, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 60, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 60, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 60, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 60, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 60, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 60, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 60, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 60, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 60);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 60);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 60);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 60);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_51, 61);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_52, 61);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 61);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 61, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 61, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 61, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 61, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 61, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 61, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 61, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 61, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 61, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 61);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 61);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 61);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 61);
                      			
                    }
                    // St.g:2589:4: ( ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==QUALIFIER) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // St.g:2590:5: ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) )
                            {
                            // St.g:2590:5: ( (a8= QUALIFIER ) | ( (a9= QUALIFIER ) (a10= QUALIFIER ) ) )
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==QUALIFIER) ) {
                                int LA25_1 = input.LA(2);

                                if ( (LA25_1==EOF||(LA25_1>=REQUIREMENT && LA25_1<=COMPONENT)||(LA25_1>=MCI && LA25_1<=OPERATOR)||(LA25_1>=16 && LA25_1<=20)||(LA25_1>=22 && LA25_1<=23)) ) {
                                    alt25=1;
                                }
                                else if ( (LA25_1==QUALIFIER) ) {
                                    alt25=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 25, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 0, input);

                                throw nvae;
                            }
                            switch (alt25) {
                                case 1 :
                                    // St.g:2591:6: (a8= QUALIFIER )
                                    {
                                    // St.g:2591:6: (a8= QUALIFIER )
                                    // St.g:2592:7: a8= QUALIFIER
                                    {
                                    a8=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode2566); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a8 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStopIndex());
                                      								}
                                      								org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_0_0_0_0_2_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a8, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 62);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 62, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 62, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 62, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 62, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 62, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 62, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 62, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 62, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 62, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 62);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 62);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 62);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 62);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:2641:12: ( (a9= QUALIFIER ) (a10= QUALIFIER ) )
                                    {
                                    // St.g:2641:12: ( (a9= QUALIFIER ) (a10= QUALIFIER ) )
                                    // St.g:2642:7: (a9= QUALIFIER ) (a10= QUALIFIER )
                                    {
                                    // St.g:2642:7: (a9= QUALIFIER )
                                    // St.g:2643:8: a9= QUALIFIER
                                    {
                                    a9=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode2640); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a9 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a9).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_0_0_0_0_2_0_1_0_0_0_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a9, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_54, 63);
                                      						
                                    }
                                    // St.g:2678:7: (a10= QUALIFIER )
                                    // St.g:2679:8: a10= QUALIFIER
                                    {
                                    a10=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode2700); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a10 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_0_0_0_0_2_0_1_0_0_0_1, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a10, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 64);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 64, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 64, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 64, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 64, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 64, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 64, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 64, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 64, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 64, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 64);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 64);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 64);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 64);
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 65);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 65, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 65, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 65, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 65, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 65, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 65, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 65, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 65, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 65, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 65);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 65);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 65);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 65);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 66);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 66, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 66, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 66, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 66, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 66, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 66, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 66, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 66, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 66, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 66);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 66);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 66);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 66);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 67);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 67, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 67, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 67, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 67, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 67, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 67, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 67, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 67, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 67, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 67);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 67);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 67);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 67);
                      		
                    }

                    }
                    break;
                case 2 :
                    // St.g:2786:6: ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? )
                    {
                    // St.g:2786:6: ( (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )? )
                    // St.g:2787:4: (a11= MCI ) (a12= COMPONENT ) a13= ':' (a14= COMPONENT ) ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )? ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )?
                    {
                    // St.g:2787:4: (a11= MCI )
                    // St.g:2788:5: a11= MCI
                    {
                    a11=(Token)match(input,MCI,FOLLOW_MCI_in_parse_org_be_textbe_st_textst_DefinedByNode2820); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a11 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MCI");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__MCI), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a11).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__MCI), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_0, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a11, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_55, 68);
                      			
                    }
                    // St.g:2823:4: (a12= COMPONENT )
                    // St.g:2824:5: a12= COMPONENT
                    {
                    a12=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode2859); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a12 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_REF), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a12).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_REF), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a12, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_56, 69);
                      			
                    }
                    a13=(Token)match(input,21,FOLLOW_21_in_parse_org_be_textbe_st_textst_DefinedByNode2892); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_57, 70);
                      			
                    }
                    // St.g:2873:4: (a14= COMPONENT )
                    // St.g:2874:5: a14= COMPONENT
                    {
                    a14=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode2918); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a14 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_SET), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__COMPONENT_SET), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_3, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a14, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_58, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_59, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_60, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_61, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_62, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_63, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 71, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 71, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 71, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 71, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 71, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 71, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 71, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 71, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 71, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 71);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 71);
                      			
                    }
                    // St.g:2928:4: ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )?
                    int alt28=2;
                    switch ( input.LA(1) ) {
                        case TEXT2:
                        case NUMBER:
                            {
                            alt28=1;
                            }
                            break;
                        case COMPONENT:
                            {
                            int LA28_2 = input.LA(2);

                            if ( (synpred38_St()) ) {
                                alt28=1;
                            }
                            }
                            break;
                        case REQUIREMENT:
                            {
                            int LA28_3 = input.LA(2);

                            if ( (synpred38_St()) ) {
                                alt28=1;
                            }
                            }
                            break;
                    }

                    switch (alt28) {
                        case 1 :
                            // St.g:2929:5: ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) )
                            {
                            // St.g:2929:5: ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) )
                            int alt27=4;
                            switch ( input.LA(1) ) {
                            case TEXT2:
                                {
                                alt27=1;
                                }
                                break;
                            case NUMBER:
                                {
                                alt27=2;
                                }
                                break;
                            case COMPONENT:
                                {
                                alt27=3;
                                }
                                break;
                            case REQUIREMENT:
                                {
                                alt27=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 0, input);

                                throw nvae;
                            }

                            switch (alt27) {
                                case 1 :
                                    // St.g:2930:6: (a15= TEXT2 )
                                    {
                                    // St.g:2930:6: (a15= TEXT2 )
                                    // St.g:2931:7: a15= TEXT2
                                    {
                                    a15=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_DefinedByNode2972); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a15 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a15).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_4_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a15, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_62, 72);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_63, 72);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 72);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 72, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 72, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 72, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 72, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 72, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 72, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 72, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 72, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 72, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 72);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 72);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 72);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 72);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:2982:12: (a16= NUMBER )
                                    {
                                    // St.g:2982:12: (a16= NUMBER )
                                    // St.g:2983:7: a16= NUMBER
                                    {
                                    a16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_DefinedByNode3037); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a16 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a16).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_4_0_1_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a16, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_62, 73);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_63, 73);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 73);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 73, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 73, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 73, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 73, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 73, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 73, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 73, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 73, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 73, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 73);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 73);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 73);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 73);
                                      					
                                    }

                                    }
                                    break;
                                case 3 :
                                    // St.g:3034:12: (a17= COMPONENT )
                                    {
                                    // St.g:3034:12: (a17= COMPONENT )
                                    // St.g:3035:7: a17= COMPONENT
                                    {
                                    a17=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode3102); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a17 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a17).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a17).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a17).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_4_0_2_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a17, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_62, 74);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_63, 74);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 74);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 74, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 74, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 74, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 74, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 74, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 74, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 74, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 74, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 74, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 74);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 74);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 74);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 74);
                                      					
                                    }

                                    }
                                    break;
                                case 4 :
                                    // St.g:3086:12: (a18= REQUIREMENT )
                                    {
                                    // St.g:3086:12: (a18= REQUIREMENT )
                                    // St.g:3087:7: a18= REQUIREMENT
                                    {
                                    a18=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_DefinedByNode3167); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a18 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a18).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a18).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a18).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a18).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_4_0_3_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a18, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_62, 75);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_63, 75);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 75);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 75, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 75, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 75, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 75, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 75, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 75, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 75, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 75, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 75, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 75);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 75);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 75);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 75);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_62, 76);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_63, 76);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 76);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 76, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 76, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 76, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 76, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 76, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 76, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 76, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 76, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 76, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 76);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 76);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 76);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 76);
                      			
                    }
                    // St.g:3159:4: ( ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==QUALIFIER) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // St.g:3160:5: ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) )
                            {
                            // St.g:3160:5: ( (a19= QUALIFIER ) | ( (a20= QUALIFIER ) (a21= QUALIFIER ) ) )
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==QUALIFIER) ) {
                                int LA29_1 = input.LA(2);

                                if ( (LA29_1==EOF||(LA29_1>=REQUIREMENT && LA29_1<=COMPONENT)||(LA29_1>=MCI && LA29_1<=OPERATOR)||(LA29_1>=16 && LA29_1<=20)||(LA29_1>=22 && LA29_1<=23)) ) {
                                    alt29=1;
                                }
                                else if ( (LA29_1==QUALIFIER) ) {
                                    alt29=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 29, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 29, 0, input);

                                throw nvae;
                            }
                            switch (alt29) {
                                case 1 :
                                    // St.g:3161:6: (a19= QUALIFIER )
                                    {
                                    // St.g:3161:6: (a19= QUALIFIER )
                                    // St.g:3162:7: a19= QUALIFIER
                                    {
                                    a19=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode3256); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a19 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a19).getStopIndex());
                                      								}
                                      								org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_5_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a19, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 77);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 77, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 77, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 77, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 77, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 77, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 77, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 77, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 77, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 77, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 77);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 77);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 77);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 77);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:3211:12: ( (a20= QUALIFIER ) (a21= QUALIFIER ) )
                                    {
                                    // St.g:3211:12: ( (a20= QUALIFIER ) (a21= QUALIFIER ) )
                                    // St.g:3212:7: (a20= QUALIFIER ) (a21= QUALIFIER )
                                    {
                                    // St.g:3212:7: (a20= QUALIFIER )
                                    // St.g:3213:8: a20= QUALIFIER
                                    {
                                    a20=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode3330); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a20 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a20).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a20).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a20).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_5_0_1_0_0_0_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a20, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_64, 78);
                                      						
                                    }
                                    // St.g:3248:7: (a21= QUALIFIER )
                                    // St.g:3249:8: a21= QUALIFIER
                                    {
                                    a21=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode3390); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a21 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a21.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a21).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a21).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a21).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a21).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__SECOND_QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_5_0_1_0_0_0_1, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a21, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 79);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 79, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 79, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 79, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 79, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 79, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 79, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 79, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 79, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 79, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 79);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 79);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 79);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 79);
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 80);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 80, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 80, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 80, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 80, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 80, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 80, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 80, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 80, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 80, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 80);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 80);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 80);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 80);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 81);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 81, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 81, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 81, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 81, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 81, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 81, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 81, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 81, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 81, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 81);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 81);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 81);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 81);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 82);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 82, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 82, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 82, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 82, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 82, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 82, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 82, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 82, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 82, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 82);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 82);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 82);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 82);
                      		
                    }

                    }
                    break;
                case 3 :
                    // St.g:3356:6: a22= '_'
                    {
                    a22=(Token)match(input,22,FOLLOW_22_in_parse_org_be_textbe_st_textst_DefinedByNode3499); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                      				incompleteObjects.push(element);
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_2_0, null, true);
                      			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a22, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 83);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 83, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 83, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 83, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 83, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 83, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 83, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 83, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 83, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 83, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 83);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 83);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 83);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 83);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_53, 84);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 84, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 84, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 84, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 84, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 84, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 84, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 84, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 84, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 84, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 84);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 84);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 84);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 84);
              	
            }
            // St.g:3402:2: ( (a23= OPERATOR ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==OPERATOR) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // St.g:3403:3: (a23= OPERATOR )
                    {
                    // St.g:3403:3: (a23= OPERATOR )
                    // St.g:3404:4: a23= OPERATOR
                    {
                    a23=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_parse_org_be_textbe_st_textst_DefinedByNode3532); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                      					incompleteObjects.push(element);
                      				}
                      				if (a23 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("OPERATOR");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a23.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__OPERATOR), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a23).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a23).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a23).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a23).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__OPERATOR), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_4, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a23, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 85, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 85, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 85, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 85, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 85, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 85, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 85, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 85, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 85, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 85);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 85);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 85);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 85);
              	
            }
            // St.g:3452:2: ( (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=REQUIREMENT && LA33_0<=COMPONENT)||LA33_0==MCI||LA33_0==16||(LA33_0>=19 && LA33_0<=20)||(LA33_0>=22 && LA33_0<=23)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // St.g:3453:3: (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode )
                    {
                    // St.g:3453:3: (a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode )
                    // St.g:3454:4: a24_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_AbstractBlockOrNode_in_parse_org_be_textbe_st_textst_DefinedByNode3571);
                    a24_0=parse_org_be_textbe_st_textst_AbstractBlockOrNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
                      					incompleteObjects.push(element);
                      				}
                      				if (a24_0 != null) {
                      					if (a24_0 != null) {
                      						Object value = a24_0;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.DEFINED_BY_NODE__CHILD_NODE), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_5, a24_0, true);
                      					copyLocalizationInfos(a24_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 86);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 86);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 86);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 86);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_be_textbe_st_textst_DefinedByNode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_DefinedByNode"


    // $ANTLR start "parse_org_be_textbe_st_textst_Node"
    // St.g:3485:1: parse_org_be_textbe_st_textst_Node returns [org.be.textbe.st.textst.Node element = null] : ( ( ( (a0= REQUIREMENT ) )* ) )? ( (a1= VALIDITY ) )? ( ( (a2= COMPONENT ) ( ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) ) )? ( ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) ) )? ) | ( (a10= MCI ) (a11= COMPONENT ) a12= ':' (a13= COMPONENT ) ( ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) ) )? ( ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) ) )? ) | a21= '_' ) ( (a22= OPERATOR ) )? ( (a23_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )? ;
    public final org.be.textbe.st.textst.Node parse_org_be_textbe_st_textst_Node() throws RecognitionException {
        org.be.textbe.st.textst.Node element =  null;
        int parse_org_be_textbe_st_textst_Node_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
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
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;
        Token a22=null;
        org.be.textbe.st.textst.AbstractBlockOrNode a23_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // St.g:3488:1: ( ( ( ( (a0= REQUIREMENT ) )* ) )? ( (a1= VALIDITY ) )? ( ( (a2= COMPONENT ) ( ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) ) )? ( ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) ) )? ) | ( (a10= MCI ) (a11= COMPONENT ) a12= ':' (a13= COMPONENT ) ( ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) ) )? ( ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) ) )? ) | a21= '_' ) ( (a22= OPERATOR ) )? ( (a23_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )? )
            // St.g:3489:2: ( ( ( (a0= REQUIREMENT ) )* ) )? ( (a1= VALIDITY ) )? ( ( (a2= COMPONENT ) ( ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) ) )? ( ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) ) )? ) | ( (a10= MCI ) (a11= COMPONENT ) a12= ':' (a13= COMPONENT ) ( ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) ) )? ( ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) ) )? ) | a21= '_' ) ( (a22= OPERATOR ) )? ( (a23_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )?
            {
            // St.g:3489:2: ( ( ( (a0= REQUIREMENT ) )* ) )?
            int alt35=2;
            switch ( input.LA(1) ) {
                case REQUIREMENT:
                    {
                    alt35=1;
                    }
                    break;
                case VALIDITY:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred45_St()) ) {
                        alt35=1;
                    }
                    }
                    break;
                case COMPONENT:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred45_St()) ) {
                        alt35=1;
                    }
                    }
                    break;
                case MCI:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred45_St()) ) {
                        alt35=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA35_5 = input.LA(2);

                    if ( (synpred45_St()) ) {
                        alt35=1;
                    }
                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // St.g:3490:3: ( ( (a0= REQUIREMENT ) )* )
                    {
                    // St.g:3490:3: ( ( (a0= REQUIREMENT ) )* )
                    // St.g:3491:4: ( (a0= REQUIREMENT ) )*
                    {
                    // St.g:3491:4: ( (a0= REQUIREMENT ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==REQUIREMENT) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // St.g:3492:5: (a0= REQUIREMENT )
                    	    {
                    	    // St.g:3492:5: (a0= REQUIREMENT )
                    	    // St.g:3493:6: a0= REQUIREMENT
                    	    {
                    	    a0=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Node3634); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						if (a0 != null) {
                    	      							org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                    	      							tokenResolver.setOptions(getOptions());
                    	      							org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                    	      							tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__REQUIREMENT_REF), result);
                    	      							Object resolvedObject = result.getResolvedToken();
                    	      							if (resolvedObject == null) {
                    	      								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
                    	      							}
                    	      							java.lang.String resolved = (java.lang.String) resolvedObject;
                    	      							if (resolved != null) {
                    	      								Object value = resolved;
                    	      								addObjectToList(element, org.be.textbe.st.textst.TextstPackage.NODE__REQUIREMENT_REF, value);
                    	      								completedElement(value, false);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_0_0_0_0, resolved, true);
                    	      							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
                    	      						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 87);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 87);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 87);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 87);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 87);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 88);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 88);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 88);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 88);
              	
            }
            // St.g:3543:2: ( (a1= VALIDITY ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==VALIDITY) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // St.g:3544:3: (a1= VALIDITY )
                    {
                    // St.g:3544:3: (a1= VALIDITY )
                    // St.g:3545:4: a1= VALIDITY
                    {
                    a1=(Token)match(input,VALIDITY,FOLLOW_VALIDITY_in_parse_org_be_textbe_st_textst_Node3702); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VALIDITY");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__TRACEABILITY_STATUS), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      					}
                      					org.be.textbe.st.textst.Validity resolved = (org.be.textbe.st.textst.Validity) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__TRACEABILITY_STATUS), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_1, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 89);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 89);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 89);
              	
            }
            // St.g:3583:2: ( ( (a2= COMPONENT ) ( ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) ) )? ( ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) ) )? ) | ( (a10= MCI ) (a11= COMPONENT ) a12= ':' (a13= COMPONENT ) ( ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) ) )? ( ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) ) )? ) | a21= '_' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case COMPONENT:
                {
                alt45=1;
                }
                break;
            case MCI:
                {
                alt45=2;
                }
                break;
            case 22:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // St.g:3584:3: ( (a2= COMPONENT ) ( ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) ) )? ( ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) ) )? )
                    {
                    // St.g:3584:3: ( (a2= COMPONENT ) ( ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) ) )? ( ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) ) )? )
                    // St.g:3585:4: (a2= COMPONENT ) ( ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) ) )? ( ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) ) )?
                    {
                    // St.g:3585:4: (a2= COMPONENT )
                    // St.g:3586:5: a2= COMPONENT
                    {
                    a2=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node3747); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a2 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_REF), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_REF), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_0_0_0_0_0, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_65, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_66, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_67, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_68, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_69, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_70, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 90, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 90, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 90, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 90, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 90, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 90, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 90, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 90, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 90, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 90);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 90);
                      			
                    }
                    // St.g:3640:4: ( ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) ) )?
                    int alt38=2;
                    switch ( input.LA(1) ) {
                        case TEXT2:
                        case NUMBER:
                            {
                            alt38=1;
                            }
                            break;
                        case COMPONENT:
                            {
                            int LA38_2 = input.LA(2);

                            if ( (synpred50_St()) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case REQUIREMENT:
                            {
                            int LA38_3 = input.LA(2);

                            if ( (synpred50_St()) ) {
                                alt38=1;
                            }
                            }
                            break;
                    }

                    switch (alt38) {
                        case 1 :
                            // St.g:3641:5: ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) )
                            {
                            // St.g:3641:5: ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) )
                            int alt37=4;
                            switch ( input.LA(1) ) {
                            case TEXT2:
                                {
                                alt37=1;
                                }
                                break;
                            case NUMBER:
                                {
                                alt37=2;
                                }
                                break;
                            case COMPONENT:
                                {
                                alt37=3;
                                }
                                break;
                            case REQUIREMENT:
                                {
                                alt37=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 37, 0, input);

                                throw nvae;
                            }

                            switch (alt37) {
                                case 1 :
                                    // St.g:3642:6: (a3= TEXT2 )
                                    {
                                    // St.g:3642:6: (a3= TEXT2 )
                                    // St.g:3643:7: a3= TEXT2
                                    {
                                    a3=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Node3801); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a3 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_0_0_0_0_1_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_69, 91);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_70, 91);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 91);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 91, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 91, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 91, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 91, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 91, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 91, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 91, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 91, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 91, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 91);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 91);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 91);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 91);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:3694:12: (a4= NUMBER )
                                    {
                                    // St.g:3694:12: (a4= NUMBER )
                                    // St.g:3695:7: a4= NUMBER
                                    {
                                    a4=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_Node3866); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a4 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_0_0_0_0_1_0_1_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_69, 92);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_70, 92);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 92);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 92, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 92, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 92, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 92, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 92, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 92, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 92, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 92, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 92, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 92);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 92);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 92);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 92);
                                      					
                                    }

                                    }
                                    break;
                                case 3 :
                                    // St.g:3746:12: (a5= COMPONENT )
                                    {
                                    // St.g:3746:12: (a5= COMPONENT )
                                    // St.g:3747:7: a5= COMPONENT
                                    {
                                    a5=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node3931); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a5 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_0_0_0_0_1_0_2_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_69, 93);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_70, 93);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 93);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 93, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 93, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 93, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 93, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 93, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 93, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 93, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 93, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 93, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 93);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 93);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 93);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 93);
                                      					
                                    }

                                    }
                                    break;
                                case 4 :
                                    // St.g:3798:12: (a6= REQUIREMENT )
                                    {
                                    // St.g:3798:12: (a6= REQUIREMENT )
                                    // St.g:3799:7: a6= REQUIREMENT
                                    {
                                    a6=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Node3996); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a6 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_0_0_0_0_1_0_3_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_69, 94);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_70, 94);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 94);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 94, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 94, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 94, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 94, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 94, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 94, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 94, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 94, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 94, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 94);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 94);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 94);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 94);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_69, 95);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_70, 95);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 95);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 95, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 95, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 95, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 95, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 95, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 95, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 95, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 95, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 95, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 95);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 95);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 95);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 95);
                      			
                    }
                    // St.g:3871:4: ( ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==QUALIFIER) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // St.g:3872:5: ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) )
                            {
                            // St.g:3872:5: ( (a7= QUALIFIER ) | ( (a8= QUALIFIER ) (a9= QUALIFIER ) ) )
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==QUALIFIER) ) {
                                int LA39_1 = input.LA(2);

                                if ( (LA39_1==EOF||(LA39_1>=REQUIREMENT && LA39_1<=COMPONENT)||(LA39_1>=MCI && LA39_1<=OPERATOR)||(LA39_1>=16 && LA39_1<=20)||(LA39_1>=22 && LA39_1<=23)) ) {
                                    alt39=1;
                                }
                                else if ( (LA39_1==QUALIFIER) ) {
                                    alt39=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 39, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }
                            switch (alt39) {
                                case 1 :
                                    // St.g:3873:6: (a7= QUALIFIER )
                                    {
                                    // St.g:3873:6: (a7= QUALIFIER )
                                    // St.g:3874:7: a7= QUALIFIER
                                    {
                                    a7=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4085); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a7 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
                                      								}
                                      								org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_0_0_0_0_2_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 96);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 96, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 96, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 96, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 96, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 96, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 96, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 96, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 96, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 96, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 96);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 96);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 96);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 96);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:3923:12: ( (a8= QUALIFIER ) (a9= QUALIFIER ) )
                                    {
                                    // St.g:3923:12: ( (a8= QUALIFIER ) (a9= QUALIFIER ) )
                                    // St.g:3924:7: (a8= QUALIFIER ) (a9= QUALIFIER )
                                    {
                                    // St.g:3924:7: (a8= QUALIFIER )
                                    // St.g:3925:8: a8= QUALIFIER
                                    {
                                    a8=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4159); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a8 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_0_0_0_0_2_0_1_0_0_0_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a8, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_72, 97);
                                      						
                                    }
                                    // St.g:3960:7: (a9= QUALIFIER )
                                    // St.g:3961:8: a9= QUALIFIER
                                    {
                                    a9=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4219); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a9 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__SECOND_QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a9).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__SECOND_QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_0_0_0_0_2_0_1_0_0_0_1, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a9, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 98);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 98, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 98, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 98, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 98, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 98, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 98, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 98, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 98, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 98, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 98);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 98);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 98);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 98);
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 99);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 99, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 99, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 99, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 99, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 99, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 99, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 99, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 99, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 99, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 99);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 99);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 99);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 99);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 100);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 100, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 100, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 100, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 100, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 100, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 100, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 100, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 100, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 100, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 100);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 100);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 100);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 100);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 101);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 101, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 101, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 101, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 101, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 101, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 101, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 101, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 101, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 101, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 101);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 101);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 101);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 101);
                      		
                    }

                    }
                    break;
                case 2 :
                    // St.g:4068:6: ( (a10= MCI ) (a11= COMPONENT ) a12= ':' (a13= COMPONENT ) ( ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) ) )? ( ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) ) )? )
                    {
                    // St.g:4068:6: ( (a10= MCI ) (a11= COMPONENT ) a12= ':' (a13= COMPONENT ) ( ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) ) )? ( ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) ) )? )
                    // St.g:4069:4: (a10= MCI ) (a11= COMPONENT ) a12= ':' (a13= COMPONENT ) ( ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) ) )? ( ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) ) )?
                    {
                    // St.g:4069:4: (a10= MCI )
                    // St.g:4070:5: a10= MCI
                    {
                    a10=(Token)match(input,MCI,FOLLOW_MCI_in_parse_org_be_textbe_st_textst_Node4339); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a10 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MCI");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__MCI), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__MCI), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_0, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a10, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_73, 102);
                      			
                    }
                    // St.g:4105:4: (a11= COMPONENT )
                    // St.g:4106:5: a11= COMPONENT
                    {
                    a11=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node4378); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a11 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_REF), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a11).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_REF), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a11, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_74, 103);
                      			
                    }
                    a12=(Token)match(input,21,FOLLOW_21_in_parse_org_be_textbe_st_textst_Node4411); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a12, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_75, 104);
                      			
                    }
                    // St.g:4155:4: (a13= COMPONENT )
                    // St.g:4156:5: a13= COMPONENT
                    {
                    a13=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node4437); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                      						incompleteObjects.push(element);
                      					}
                      					if (a13 != null) {
                      						org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      						tokenResolver.setOptions(getOptions());
                      						org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_SET), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a13).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__COMPONENT_SET), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_3, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a13, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_76, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_77, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_78, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_79, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_80, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_81, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 105, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 105, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 105, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 105, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 105, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 105, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 105, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 105, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 105, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 105);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 105);
                      			
                    }
                    // St.g:4210:4: ( ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) ) )?
                    int alt42=2;
                    switch ( input.LA(1) ) {
                        case TEXT2:
                        case NUMBER:
                            {
                            alt42=1;
                            }
                            break;
                        case COMPONENT:
                            {
                            int LA42_2 = input.LA(2);

                            if ( (synpred57_St()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case REQUIREMENT:
                            {
                            int LA42_3 = input.LA(2);

                            if ( (synpred57_St()) ) {
                                alt42=1;
                            }
                            }
                            break;
                    }

                    switch (alt42) {
                        case 1 :
                            // St.g:4211:5: ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) )
                            {
                            // St.g:4211:5: ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) )
                            int alt41=4;
                            switch ( input.LA(1) ) {
                            case TEXT2:
                                {
                                alt41=1;
                                }
                                break;
                            case NUMBER:
                                {
                                alt41=2;
                                }
                                break;
                            case COMPONENT:
                                {
                                alt41=3;
                                }
                                break;
                            case REQUIREMENT:
                                {
                                alt41=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 0, input);

                                throw nvae;
                            }

                            switch (alt41) {
                                case 1 :
                                    // St.g:4212:6: (a14= TEXT2 )
                                    {
                                    // St.g:4212:6: (a14= TEXT2 )
                                    // St.g:4213:7: a14= TEXT2
                                    {
                                    a14=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Node4491); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a14 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_4_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a14, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_80, 106);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_81, 106);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 106);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 106, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 106, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 106, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 106, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 106, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 106, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 106, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 106, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 106, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 106);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 106);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 106);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 106);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:4264:12: (a15= NUMBER )
                                    {
                                    // St.g:4264:12: (a15= NUMBER )
                                    // St.g:4265:7: a15= NUMBER
                                    {
                                    a15=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_Node4556); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a15 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a15).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_4_0_1_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a15, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_80, 107);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_81, 107);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 107);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 107, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 107, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 107, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 107, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 107, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 107, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 107, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 107, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 107, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 107);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 107);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 107);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 107);
                                      					
                                    }

                                    }
                                    break;
                                case 3 :
                                    // St.g:4316:12: (a16= COMPONENT )
                                    {
                                    // St.g:4316:12: (a16= COMPONENT )
                                    // St.g:4317:7: a16= COMPONENT
                                    {
                                    a16=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node4621); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a16 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a16).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_4_0_2_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a16, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_80, 108);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_81, 108);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 108);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 108, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 108, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 108, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 108, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 108, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 108, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 108, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 108, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 108, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 108);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 108);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 108);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 108);
                                      					
                                    }

                                    }
                                    break;
                                case 4 :
                                    // St.g:4368:12: (a17= REQUIREMENT )
                                    {
                                    // St.g:4368:12: (a17= REQUIREMENT )
                                    // St.g:4369:7: a17= REQUIREMENT
                                    {
                                    a17=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Node4686); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a17 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a17).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a17).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a17).getStopIndex());
                                      								}
                                      								java.lang.String resolved = (java.lang.String) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__BEHAVIOR_REF), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_4_0_3_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a17, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_80, 109);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_81, 109);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 109);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 109, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 109, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 109, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 109, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 109, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 109, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 109, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 109, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 109, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 109);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 109);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 109);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 109);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_80, 110);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_81, 110);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 110);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 110, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 110, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 110, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 110, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 110, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 110, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 110, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 110, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 110, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 110);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 110);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 110);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 110);
                      			
                    }
                    // St.g:4441:4: ( ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==QUALIFIER) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // St.g:4442:5: ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) )
                            {
                            // St.g:4442:5: ( (a18= QUALIFIER ) | ( (a19= QUALIFIER ) (a20= QUALIFIER ) ) )
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==QUALIFIER) ) {
                                int LA43_1 = input.LA(2);

                                if ( (LA43_1==EOF||(LA43_1>=REQUIREMENT && LA43_1<=COMPONENT)||(LA43_1>=MCI && LA43_1<=OPERATOR)||(LA43_1>=16 && LA43_1<=20)||(LA43_1>=22 && LA43_1<=23)) ) {
                                    alt43=1;
                                }
                                else if ( (LA43_1==QUALIFIER) ) {
                                    alt43=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 43, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 43, 0, input);

                                throw nvae;
                            }
                            switch (alt43) {
                                case 1 :
                                    // St.g:4443:6: (a18= QUALIFIER )
                                    {
                                    // St.g:4443:6: (a18= QUALIFIER )
                                    // St.g:4444:7: a18= QUALIFIER
                                    {
                                    a18=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4775); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      							if (terminateParsing) {
                                      								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      							}
                                      							if (element == null) {
                                      								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      								incompleteObjects.push(element);
                                      							}
                                      							if (a18 != null) {
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      								tokenResolver.setOptions(getOptions());
                                      								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      								tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), result);
                                      								Object resolvedObject = result.getResolvedToken();
                                      								if (resolvedObject == null) {
                                      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a18).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a18).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a18).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a18).getStopIndex());
                                      								}
                                      								org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      								if (resolved != null) {
                                      									Object value = resolved;
                                      									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), value);
                                      									completedElement(value, false);
                                      								}
                                      								collectHiddenTokens(element);
                                      								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_5_0_0_0, resolved, true);
                                      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a18, element);
                                      							}
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 111);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 111, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 111, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 111, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 111, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 111, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 111, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 111, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 111, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 111, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 111);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 111);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 111);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 111);
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:4493:12: ( (a19= QUALIFIER ) (a20= QUALIFIER ) )
                                    {
                                    // St.g:4493:12: ( (a19= QUALIFIER ) (a20= QUALIFIER ) )
                                    // St.g:4494:7: (a19= QUALIFIER ) (a20= QUALIFIER )
                                    {
                                    // St.g:4494:7: (a19= QUALIFIER )
                                    // St.g:4495:8: a19= QUALIFIER
                                    {
                                    a19=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4849); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a19 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a19).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_5_0_1_0_0_0_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a19, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_82, 112);
                                      						
                                    }
                                    // St.g:4530:7: (a20= QUALIFIER )
                                    // St.g:4531:8: a20= QUALIFIER
                                    {
                                    a20=(Token)match(input,QUALIFIER,FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4909); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a20 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUALIFIER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__SECOND_QUALIFIER), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a20).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a20).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a20).getStopIndex());
                                      									}
                                      									org.be.textbe.st.textst.Qualifier resolved = (org.be.textbe.st.textst.Qualifier) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__SECOND_QUALIFIER), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_5_0_1_0_0_0_1, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a20, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 113);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 113, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 113, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 113, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 113, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 113, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 113, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 113, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 113, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 113, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 113);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 113);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 113);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 113);
                                      						
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      						// expected elements (follow set)
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 114);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 114, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 114, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 114, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 114, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 114, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 114, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 114, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 114, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 114, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 114);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 114);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 114);
                                      						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 114);
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 115);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 115, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 115, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 115, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 115, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 115, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 115, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 115, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 115, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 115, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 115);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 115);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 115);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 115);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 116);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 116, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 116, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 116, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 116, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 116, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 116, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 116, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 116, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 116, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 116);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 116);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 116);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 116);
                      		
                    }

                    }
                    break;
                case 3 :
                    // St.g:4638:6: a21= '_'
                    {
                    a21=(Token)match(input,22,FOLLOW_22_in_parse_org_be_textbe_st_textst_Node5018); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                      				incompleteObjects.push(element);
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_2_0, null, true);
                      			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a21, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 117);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 117, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 117, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 117, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 117, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 117, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 117, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 117, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 117, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 117, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 117);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 117);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 117);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 117);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_71, 118);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 118, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 118, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 118, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 118, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 118, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 118, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 118, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 118, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 118, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 118);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 118);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 118);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 118);
              	
            }
            // St.g:4684:2: ( (a22= OPERATOR ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==OPERATOR) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // St.g:4685:3: (a22= OPERATOR )
                    {
                    // St.g:4685:3: (a22= OPERATOR )
                    // St.g:4686:4: a22= OPERATOR
                    {
                    a22=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_parse_org_be_textbe_st_textst_Node5051); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                      					incompleteObjects.push(element);
                      				}
                      				if (a22 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("OPERATOR");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__OPERATOR), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a22).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__OPERATOR), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_3, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a22, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_11, 119, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_18, 119, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 119, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 119, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 119, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 119, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 119, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 119, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 119, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 119);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 119);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 119);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 119);
              	
            }
            // St.g:4734:2: ( (a23_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=REQUIREMENT && LA47_0<=COMPONENT)||LA47_0==MCI||LA47_0==16||(LA47_0>=19 && LA47_0<=20)||(LA47_0>=22 && LA47_0<=23)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // St.g:4735:3: (a23_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode )
                    {
                    // St.g:4735:3: (a23_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode )
                    // St.g:4736:4: a23_0= parse_org_be_textbe_st_textst_AbstractBlockOrNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_AbstractBlockOrNode_in_parse_org_be_textbe_st_textst_Node5090);
                    a23_0=parse_org_be_textbe_st_textst_AbstractBlockOrNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
                      					incompleteObjects.push(element);
                      				}
                      				if (a23_0 != null) {
                      					if (a23_0 != null) {
                      						Object value = a23_0;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.NODE__CHILD_NODE), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_4, a23_0, true);
                      					copyLocalizationInfos(a23_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 120);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 120);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 120);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 120);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_be_textbe_st_textst_Node_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_Node"


    // $ANTLR start "parse_org_be_textbe_st_textst_OptionList"
    // St.g:4767:1: parse_org_be_textbe_st_textst_OptionList returns [org.be.textbe.st.textst.OptionList element = null] : a0= '#OPTIONS' ( (a1_0= parse_org_be_textbe_st_textst_Option ) )+ ;
    public final org.be.textbe.st.textst.OptionList parse_org_be_textbe_st_textst_OptionList() throws RecognitionException {
        org.be.textbe.st.textst.OptionList element =  null;
        int parse_org_be_textbe_st_textst_OptionList_StartIndex = input.index();
        Token a0=null;
        org.be.textbe.st.textst.Option a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // St.g:4770:1: (a0= '#OPTIONS' ( (a1_0= parse_org_be_textbe_st_textst_Option ) )+ )
            // St.g:4771:2: a0= '#OPTIONS' ( (a1_0= parse_org_be_textbe_st_textst_Option ) )+
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_org_be_textbe_st_textst_OptionList5131); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createOptionList();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_7_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_83, 121, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_7);
              	
            }
            // St.g:4785:2: ( (a1_0= parse_org_be_textbe_st_textst_Option ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==TEXT2) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // St.g:4786:3: (a1_0= parse_org_be_textbe_st_textst_Option )
            	    {
            	    // St.g:4786:3: (a1_0= parse_org_be_textbe_st_textst_Option )
            	    // St.g:4787:4: a1_0= parse_org_be_textbe_st_textst_Option
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_Option_in_parse_org_be_textbe_st_textst_OptionList5154);
            	    a1_0=parse_org_be_textbe_st_textst_Option();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createOptionList();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a1_0 != null) {
            	      					if (a1_0 != null) {
            	      						Object value = a1_0;
            	      						addObjectToList(element, org.be.textbe.st.textst.TextstPackage.OPTION_LIST__OPTIONS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_7_0_0_1, a1_0, true);
            	      					copyLocalizationInfos(a1_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_83, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_1, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_be_textbe_st_textst_OptionList_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_OptionList"


    // $ANTLR start "parse_org_be_textbe_st_textst_Option"
    // St.g:4820:1: parse_org_be_textbe_st_textst_Option returns [org.be.textbe.st.textst.Option element = null] : (a0= TEXT2 ) a1= '=' (a2= TEXT2 ) ;
    public final org.be.textbe.st.textst.Option parse_org_be_textbe_st_textst_Option() throws RecognitionException {
        org.be.textbe.st.textst.Option element =  null;
        int parse_org_be_textbe_st_textst_Option_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // St.g:4823:1: ( (a0= TEXT2 ) a1= '=' (a2= TEXT2 ) )
            // St.g:4824:2: (a0= TEXT2 ) a1= '=' (a2= TEXT2 )
            {
            // St.g:4824:2: (a0= TEXT2 )
            // St.g:4825:3: a0= TEXT2
            {
            a0=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Option5199); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createOption();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_8_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_84, 123);
              	
            }
            a1=(Token)match(input,25,FOLLOW_25_in_parse_org_be_textbe_st_textst_Option5220); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_8_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_85, 124);
              	
            }
            // St.g:4874:2: (a2= TEXT2 )
            // St.g:4875:3: a2= TEXT2
            {
            a2=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Option5238); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createOption();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__VALUE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.OPTION__VALUE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_8_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_83, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_1, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_be_textbe_st_textst_Option_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_Option"


    // $ANTLR start "parse_org_be_textbe_st_textst_RequirementList"
    // St.g:4917:1: parse_org_be_textbe_st_textst_RequirementList returns [org.be.textbe.st.textst.RequirementList element = null] : a0= '#RT' ( (a1_0= parse_org_be_textbe_st_textst_Requirement ) )+ ;
    public final org.be.textbe.st.textst.RequirementList parse_org_be_textbe_st_textst_RequirementList() throws RecognitionException {
        org.be.textbe.st.textst.RequirementList element =  null;
        int parse_org_be_textbe_st_textst_RequirementList_StartIndex = input.index();
        Token a0=null;
        org.be.textbe.st.textst.Requirement a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // St.g:4920:1: (a0= '#RT' ( (a1_0= parse_org_be_textbe_st_textst_Requirement ) )+ )
            // St.g:4921:2: a0= '#RT' ( (a1_0= parse_org_be_textbe_st_textst_Requirement ) )+
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_org_be_textbe_st_textst_RequirementList5274); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRequirementList();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_9_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 126, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
              	
            }
            // St.g:4935:2: ( (a1_0= parse_org_be_textbe_st_textst_Requirement ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==REQUIREMENT) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // St.g:4936:3: (a1_0= parse_org_be_textbe_st_textst_Requirement )
            	    {
            	    // St.g:4936:3: (a1_0= parse_org_be_textbe_st_textst_Requirement )
            	    // St.g:4937:4: a1_0= parse_org_be_textbe_st_textst_Requirement
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_Requirement_in_parse_org_be_textbe_st_textst_RequirementList5297);
            	    a1_0=parse_org_be_textbe_st_textst_Requirement();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRequirementList();
            	      					incompleteObjects.push(element);
            	      				}
            	      				if (a1_0 != null) {
            	      					if (a1_0 != null) {
            	      						Object value = a1_0;
            	      						addObjectToList(element, org.be.textbe.st.textst.TextstPackage.REQUIREMENT_LIST__REQUIREMENTS, value);
            	      						completedElement(value, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_9_0_0_1, a1_0, true);
            	      					copyLocalizationInfos(a1_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_be_textbe_st_textst_RequirementList_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_RequirementList"


    // $ANTLR start "parse_org_be_textbe_st_textst_Requirement"
    // St.g:4969:1: parse_org_be_textbe_st_textst_Requirement returns [org.be.textbe.st.textst.Requirement element = null] : (a0= REQUIREMENT ) ( (a1= TEXT2 ) | (a2= NUMBER ) | (a3= COMPONENT ) | (a4= REQUIREMENT ) ) ;
    public final org.be.textbe.st.textst.Requirement parse_org_be_textbe_st_textst_Requirement() throws RecognitionException {
        org.be.textbe.st.textst.Requirement element =  null;
        int parse_org_be_textbe_st_textst_Requirement_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // St.g:4972:1: ( (a0= REQUIREMENT ) ( (a1= TEXT2 ) | (a2= NUMBER ) | (a3= COMPONENT ) | (a4= REQUIREMENT ) ) )
            // St.g:4973:2: (a0= REQUIREMENT ) ( (a1= TEXT2 ) | (a2= NUMBER ) | (a3= COMPONENT ) | (a4= REQUIREMENT ) )
            {
            // St.g:4973:2: (a0= REQUIREMENT )
            // St.g:4974:3: a0= REQUIREMENT
            {
            a0=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Requirement5342); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRequirement();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__REF), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__REF), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_10_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_87, 128);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_88, 128);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_89, 128);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_90, 128);
              	
            }
            // St.g:5012:2: ( (a1= TEXT2 ) | (a2= NUMBER ) | (a3= COMPONENT ) | (a4= REQUIREMENT ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case TEXT2:
                {
                alt50=1;
                }
                break;
            case NUMBER:
                {
                alt50=2;
                }
                break;
            case COMPONENT:
                {
                alt50=3;
                }
                break;
            case REQUIREMENT:
                {
                alt50=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // St.g:5013:3: (a1= TEXT2 )
                    {
                    // St.g:5013:3: (a1= TEXT2 )
                    // St.g:5014:4: a1= TEXT2
                    {
                    a1=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Requirement5372); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRequirement();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_10_0_0_1_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 2 :
                    // St.g:5054:6: (a2= NUMBER )
                    {
                    // St.g:5054:6: (a2= NUMBER )
                    // St.g:5055:4: a2= NUMBER
                    {
                    a2=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_Requirement5410); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRequirement();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_10_0_0_1_0_1_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 3 :
                    // St.g:5095:6: (a3= COMPONENT )
                    {
                    // St.g:5095:6: (a3= COMPONENT )
                    // St.g:5096:4: a3= COMPONENT
                    {
                    a3=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Requirement5448); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRequirement();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_10_0_0_1_0_2_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 4 :
                    // St.g:5136:6: (a4= REQUIREMENT )
                    {
                    // St.g:5136:6: (a4= REQUIREMENT )
                    // St.g:5137:4: a4= REQUIREMENT
                    {
                    a4=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Requirement5486); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRequirement();
                      					incompleteObjects.push(element);
                      				}
                      				if (a4 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.REQUIREMENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_10_0_0_1_0_3_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_be_textbe_st_textst_Requirement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_Requirement"


    // $ANTLR start "parse_org_be_textbe_st_textst_ComponentList"
    // St.g:5188:1: parse_org_be_textbe_st_textst_ComponentList returns [org.be.textbe.st.textst.ComponentList element = null] : ( (a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component ) ) )* ( (a2= '#SC' (a3_0= parse_org_be_textbe_st_textst_SystemComponent ) ) )? ( (a4= '#C' (a5_0= parse_org_be_textbe_st_textst_Component ) ) )* ;
    public final org.be.textbe.st.textst.ComponentList parse_org_be_textbe_st_textst_ComponentList() throws RecognitionException {
        org.be.textbe.st.textst.ComponentList element =  null;
        int parse_org_be_textbe_st_textst_ComponentList_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        Token a4=null;
        org.be.textbe.st.textst.Component a1_0 = null;

        org.be.textbe.st.textst.SystemComponent a3_0 = null;

        org.be.textbe.st.textst.Component a5_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // St.g:5191:1: ( ( (a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component ) ) )* ( (a2= '#SC' (a3_0= parse_org_be_textbe_st_textst_SystemComponent ) ) )? ( (a4= '#C' (a5_0= parse_org_be_textbe_st_textst_Component ) ) )* )
            // St.g:5192:2: ( (a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component ) ) )* ( (a2= '#SC' (a3_0= parse_org_be_textbe_st_textst_SystemComponent ) ) )? ( (a4= '#C' (a5_0= parse_org_be_textbe_st_textst_Component ) ) )*
            {
            // St.g:5192:2: ( (a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==27) ) {
                    int LA51_2 = input.LA(2);

                    if ( (LA51_2==COMPONENT) ) {
                        switch ( input.LA(3) ) {
                        case REQUIREMENT:
                            {
                            int LA51_4 = input.LA(4);

                            if ( (synpred68_St()) ) {
                                alt51=1;
                            }


                            }
                            break;
                        case COMPONENT:
                            {
                            int LA51_5 = input.LA(4);

                            if ( (synpred68_St()) ) {
                                alt51=1;
                            }


                            }
                            break;
                        case TEXT2:
                            {
                            int LA51_6 = input.LA(4);

                            if ( (synpred68_St()) ) {
                                alt51=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt51) {
            	case 1 :
            	    // St.g:5193:3: (a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component ) )
            	    {
            	    // St.g:5193:3: (a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component ) )
            	    // St.g:5194:4: a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component )
            	    {
            	    a0=(Token)match(input,27,FOLLOW_27_in_parse_org_be_textbe_st_textst_ComponentList5544); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponentList();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_11_0_0_0_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_91, 134, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_92, 134, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
            	      			
            	    }
            	    // St.g:5209:4: (a1_0= parse_org_be_textbe_st_textst_Component )
            	    // St.g:5210:5: a1_0= parse_org_be_textbe_st_textst_Component
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_Component_in_parse_org_be_textbe_st_textst_ComponentList5570);
            	    a1_0=parse_org_be_textbe_st_textst_Component();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponentList();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a1_0 != null) {
            	      						if (a1_0 != null) {
            	      							Object value = a1_0;
            	      							addObjectToList(element, org.be.textbe.st.textst.TextstPackage.COMPONENT_LIST__COMPONENTS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_11_0_0_0_0_0_1, a1_0, true);
            	      						copyLocalizationInfos(a1_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 135);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 135);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 135);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 135, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 136);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 136);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 136);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 136, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }
            // St.g:5248:2: ( (a2= '#SC' (a3_0= parse_org_be_textbe_st_textst_SystemComponent ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // St.g:5249:3: (a2= '#SC' (a3_0= parse_org_be_textbe_st_textst_SystemComponent ) )
                    {
                    // St.g:5249:3: (a2= '#SC' (a3_0= parse_org_be_textbe_st_textst_SystemComponent ) )
                    // St.g:5250:4: a2= '#SC' (a3_0= parse_org_be_textbe_st_textst_SystemComponent )
                    {
                    a2=(Token)match(input,28,FOLLOW_28_in_parse_org_be_textbe_st_textst_ComponentList5620); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponentList();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_11_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_92, 137, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
                      			
                    }
                    // St.g:5264:4: (a3_0= parse_org_be_textbe_st_textst_SystemComponent )
                    // St.g:5265:5: a3_0= parse_org_be_textbe_st_textst_SystemComponent
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_SystemComponent_in_parse_org_be_textbe_st_textst_ComponentList5646);
                    a3_0=parse_org_be_textbe_st_textst_SystemComponent();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponentList();
                      						incompleteObjects.push(element);
                      					}
                      					if (a3_0 != null) {
                      						if (a3_0 != null) {
                      							Object value = a3_0;
                      							addObjectToList(element, org.be.textbe.st.textst.TextstPackage.COMPONENT_LIST__COMPONENTS, value);
                      							completedElement(value, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_11_0_0_1_0_0_1, a3_0, true);
                      						copyLocalizationInfos(a3_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 138);
                      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 138, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 139);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 139, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }
            // St.g:5299:2: ( (a4= '#C' (a5_0= parse_org_be_textbe_st_textst_Component ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==27) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // St.g:5300:3: (a4= '#C' (a5_0= parse_org_be_textbe_st_textst_Component ) )
            	    {
            	    // St.g:5300:3: (a4= '#C' (a5_0= parse_org_be_textbe_st_textst_Component ) )
            	    // St.g:5301:4: a4= '#C' (a5_0= parse_org_be_textbe_st_textst_Component )
            	    {
            	    a4=(Token)match(input,27,FOLLOW_27_in_parse_org_be_textbe_st_textst_ComponentList5696); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponentList();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_11_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_91, 140, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_92, 140, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
            	      			
            	    }
            	    // St.g:5316:4: (a5_0= parse_org_be_textbe_st_textst_Component )
            	    // St.g:5317:5: a5_0= parse_org_be_textbe_st_textst_Component
            	    {
            	    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_Component_in_parse_org_be_textbe_st_textst_ComponentList5722);
            	    a5_0=parse_org_be_textbe_st_textst_Component();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponentList();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a5_0 != null) {
            	      						if (a5_0 != null) {
            	      							Object value = a5_0;
            	      							addObjectToList(element, org.be.textbe.st.textst.TextstPackage.COMPONENT_LIST__COMPONENTS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_11_0_0_2_0_0_1, a5_0, true);
            	      						copyLocalizationInfos(a5_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 141);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 141, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 142);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 142, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_be_textbe_st_textst_ComponentList_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_ComponentList"


    // $ANTLR start "parse_org_be_textbe_st_textst_Component"
    // St.g:5353:1: parse_org_be_textbe_st_textst_Component returns [org.be.textbe.st.textst.Component element = null] : ( (a0= COMPONENT ) ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) ) ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )* | c0= parse_org_be_textbe_st_textst_SystemComponent );
    public final org.be.textbe.st.textst.Component parse_org_be_textbe_st_textst_Component() throws RecognitionException {
        org.be.textbe.st.textst.Component element =  null;
        int parse_org_be_textbe_st_textst_Component_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        org.be.textbe.st.textst.SecondaryRelation a5_0 = null;

        org.be.textbe.st.textst.SystemComponent c0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // St.g:5356:1: ( (a0= COMPONENT ) ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) ) ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )* | c0= parse_org_be_textbe_st_textst_SystemComponent )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COMPONENT) ) {
                switch ( input.LA(2) ) {
                case REQUIREMENT:
                    {
                    int LA57_2 = input.LA(3);

                    if ( (synpred75_St()) ) {
                        alt57=1;
                    }
                    else if ( (true) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case COMPONENT:
                    {
                    int LA57_3 = input.LA(3);

                    if ( (synpred75_St()) ) {
                        alt57=1;
                    }
                    else if ( (true) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case TEXT2:
                    {
                    int LA57_4 = input.LA(3);

                    if ( (synpred75_St()) ) {
                        alt57=1;
                    }
                    else if ( (true) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // St.g:5357:2: (a0= COMPONENT ) ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) ) ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )*
                    {
                    // St.g:5357:2: (a0= COMPONENT )
                    // St.g:5358:3: a0= COMPONENT
                    {
                    a0=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Component5782); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponent();
                      				incompleteObjects.push(element);
                      			}
                      			if (a0 != null) {
                      				org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      				tokenResolver.setOptions(getOptions());
                      				org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__REF), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String) resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__REF), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_12_0_0_0, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_93, 143);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_94, 143);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_95, 143);
                      	
                    }
                    // St.g:5395:2: ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) )
                    int alt54=3;
                    switch ( input.LA(1) ) {
                    case REQUIREMENT:
                        {
                        alt54=1;
                        }
                        break;
                    case COMPONENT:
                        {
                        alt54=2;
                        }
                        break;
                    case TEXT2:
                        {
                        alt54=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // St.g:5396:3: (a1= REQUIREMENT )
                            {
                            // St.g:5396:3: (a1= REQUIREMENT )
                            // St.g:5397:4: a1= REQUIREMENT
                            {
                            a1=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Component5812); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponent();
                              					incompleteObjects.push(element);
                              				}
                              				if (a1 != null) {
                              					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                              					tokenResolver.setOptions(getOptions());
                              					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL), result);
                              					Object resolvedObject = result.getResolvedToken();
                              					if (resolvedObject == null) {
                              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                              					}
                              					java.lang.String resolved = (java.lang.String) resolvedObject;
                              					if (resolved != null) {
                              						Object value = resolved;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL), value);
                              						completedElement(value, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_12_0_0_1_0_0_0, resolved, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                              				}
                              			
                            }

                            }

                            if ( state.backtracking==0 ) {

                              			// expected elements (follow set)
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 144);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 144);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 144);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 144);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 144, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              		
                            }

                            }
                            break;
                        case 2 :
                            // St.g:5437:6: (a2= COMPONENT )
                            {
                            // St.g:5437:6: (a2= COMPONENT )
                            // St.g:5438:4: a2= COMPONENT
                            {
                            a2=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Component5850); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponent();
                              					incompleteObjects.push(element);
                              				}
                              				if (a2 != null) {
                              					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                              					tokenResolver.setOptions(getOptions());
                              					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL), result);
                              					Object resolvedObject = result.getResolvedToken();
                              					if (resolvedObject == null) {
                              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                              					}
                              					java.lang.String resolved = (java.lang.String) resolvedObject;
                              					if (resolved != null) {
                              						Object value = resolved;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL), value);
                              						completedElement(value, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_12_0_0_1_0_1_0, resolved, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                              				}
                              			
                            }

                            }

                            if ( state.backtracking==0 ) {

                              			// expected elements (follow set)
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 145);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 145);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 145);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 145);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 145, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              		
                            }

                            }
                            break;
                        case 3 :
                            // St.g:5478:6: (a3= TEXT2 )
                            {
                            // St.g:5478:6: (a3= TEXT2 )
                            // St.g:5479:4: a3= TEXT2
                            {
                            a3=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Component5888); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponent();
                              					incompleteObjects.push(element);
                              				}
                              				if (a3 != null) {
                              					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                              					tokenResolver.setOptions(getOptions());
                              					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL), result);
                              					Object resolvedObject = result.getResolvedToken();
                              					if (resolvedObject == null) {
                              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                              					}
                              					java.lang.String resolved = (java.lang.String) resolvedObject;
                              					if (resolved != null) {
                              						Object value = resolved;
                              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.COMPONENT__VAL), value);
                              						completedElement(value, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_12_0_0_1_0_2_0, resolved, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                              				}
                              			
                            }

                            }

                            if ( state.backtracking==0 ) {

                              			// expected elements (follow set)
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 146);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 146);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 146);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 146);
                              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 146, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              		
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 147);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 147);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 147);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 147);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 147, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      	
                    }
                    // St.g:5528:2: ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==29) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // St.g:5529:3: (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ )
                    	    {
                    	    // St.g:5529:3: (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ )
                    	    // St.g:5530:4: a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+
                    	    {
                    	    a4=(Token)match(input,29,FOLLOW_29_in_parse_org_be_textbe_st_textst_Component5931); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      				if (element == null) {
                    	      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponent();
                    	      					incompleteObjects.push(element);
                    	      				}
                    	      				collectHiddenTokens(element);
                    	      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_12_0_0_2_0_0_0, null, true);
                    	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				// expected elements (follow set)
                    	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 148, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                    	      			
                    	    }
                    	    // St.g:5544:4: ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+
                    	    int cnt55=0;
                    	    loop55:
                    	    do {
                    	        int alt55=2;
                    	        int LA55_0 = input.LA(1);

                    	        if ( (LA55_0==NUMBER) ) {
                    	            alt55=1;
                    	        }


                    	        switch (alt55) {
                    	    	case 1 :
                    	    	    // St.g:5545:5: (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation )
                    	    	    {
                    	    	    // St.g:5545:5: (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation )
                    	    	    // St.g:5546:6: a5_0= parse_org_be_textbe_st_textst_SecondaryRelation
                    	    	    {
                    	    	    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_SecondaryRelation_in_parse_org_be_textbe_st_textst_Component5964);
                    	    	    a5_0=parse_org_be_textbe_st_textst_SecondaryRelation();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return element;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						if (terminateParsing) {
                    	    	      							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                    	    	      						}
                    	    	      						if (element == null) {
                    	    	      							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponent();
                    	    	      							incompleteObjects.push(element);
                    	    	      						}
                    	    	      						if (a5_0 != null) {
                    	    	      							if (a5_0 != null) {
                    	    	      								Object value = a5_0;
                    	    	      								addObjectToList(element, org.be.textbe.st.textst.TextstPackage.COMPONENT__BEHAVIORS, value);
                    	    	      								completedElement(value, true);
                    	    	      							}
                    	    	      							collectHiddenTokens(element);
                    	    	      							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_12_0_0_2_0_0_1, a5_0, true);
                    	    	      							copyLocalizationInfos(a5_0, element);
                    	    	      						}
                    	    	      					
                    	    	    }

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt55 >= 1 ) break loop55;
                    	    	    if (state.backtracking>0) {state.failed=true; return element;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(55, input);
                    	                throw eee;
                    	        }
                    	        cnt55++;
                    	    } while (true);

                    	    if ( state.backtracking==0 ) {

                    	      				// expected elements (follow set)
                    	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 149, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                    	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 149);
                    	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 149);
                    	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 149);
                    	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 149);
                    	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 149, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                    	      			
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 150);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 150);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 150);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 150);
                      		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 150, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      	
                    }

                    }
                    break;
                case 2 :
                    // St.g:5590:2: c0= parse_org_be_textbe_st_textst_SystemComponent
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_SystemComponent_in_parse_org_be_textbe_st_textst_Component6022);
                    c0=parse_org_be_textbe_st_textst_SystemComponent();

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
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_be_textbe_st_textst_Component_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_Component"


    // $ANTLR start "parse_org_be_textbe_st_textst_SystemComponent"
    // St.g:5594:1: parse_org_be_textbe_st_textst_SystemComponent returns [org.be.textbe.st.textst.SystemComponent element = null] : (a0= COMPONENT ) ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) ) ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )* ;
    public final org.be.textbe.st.textst.SystemComponent parse_org_be_textbe_st_textst_SystemComponent() throws RecognitionException {
        org.be.textbe.st.textst.SystemComponent element =  null;
        int parse_org_be_textbe_st_textst_SystemComponent_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        org.be.textbe.st.textst.SecondaryRelation a5_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // St.g:5597:1: ( (a0= COMPONENT ) ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) ) ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )* )
            // St.g:5598:2: (a0= COMPONENT ) ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) ) ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )*
            {
            // St.g:5598:2: (a0= COMPONENT )
            // St.g:5599:3: a0= COMPONENT
            {
            a0=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SystemComponent6051); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSystemComponent();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
              				tokenResolver.setOptions(getOptions());
              				org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__REF), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__REF), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_13_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_98, 151);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_99, 151);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_100, 151);
              	
            }
            // St.g:5636:2: ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case REQUIREMENT:
                {
                alt58=1;
                }
                break;
            case COMPONENT:
                {
                alt58=2;
                }
                break;
            case TEXT2:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // St.g:5637:3: (a1= REQUIREMENT )
                    {
                    // St.g:5637:3: (a1= REQUIREMENT )
                    // St.g:5638:4: a1= REQUIREMENT
                    {
                    a1=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_SystemComponent6081); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSystemComponent();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_13_0_0_1_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 152);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 152);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 152);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 152);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 152, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 2 :
                    // St.g:5678:6: (a2= COMPONENT )
                    {
                    // St.g:5678:6: (a2= COMPONENT )
                    // St.g:5679:4: a2= COMPONENT
                    {
                    a2=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SystemComponent6119); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSystemComponent();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_13_0_0_1_0_1_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 153);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 153);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 153);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 153);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 153, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;
                case 3 :
                    // St.g:5719:6: (a3= TEXT2 )
                    {
                    // St.g:5719:6: (a3= TEXT2 )
                    // St.g:5720:4: a3= TEXT2
                    {
                    a3=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_SystemComponent6157); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSystemComponent();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                      					tokenResolver.setOptions(getOptions());
                      					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__VAL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_13_0_0_1_0_2_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 154);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 154);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 154);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 154);
                      			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 154, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 155);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 155);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 155);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 155);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 155, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }
            // St.g:5769:2: ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==29) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // St.g:5770:3: (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ )
            	    {
            	    // St.g:5770:3: (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ )
            	    // St.g:5771:4: a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+
            	    {
            	    a4=(Token)match(input,29,FOLLOW_29_in_parse_org_be_textbe_st_textst_SystemComponent6200); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSystemComponent();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_13_0_0_2_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 156, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
            	      			
            	    }
            	    // St.g:5785:4: ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+
            	    int cnt59=0;
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==NUMBER) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // St.g:5786:5: (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation )
            	    	    {
            	    	    // St.g:5786:5: (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation )
            	    	    // St.g:5787:6: a5_0= parse_org_be_textbe_st_textst_SecondaryRelation
            	    	    {
            	    	    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_SecondaryRelation_in_parse_org_be_textbe_st_textst_SystemComponent6233);
            	    	    a5_0=parse_org_be_textbe_st_textst_SecondaryRelation();

            	    	    state._fsp--;
            	    	    if (state.failed) return element;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (terminateParsing) {
            	    	      							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
            	    	      						}
            	    	      						if (element == null) {
            	    	      							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSystemComponent();
            	    	      							incompleteObjects.push(element);
            	    	      						}
            	    	      						if (a5_0 != null) {
            	    	      							if (a5_0 != null) {
            	    	      								Object value = a5_0;
            	    	      								addObjectToList(element, org.be.textbe.st.textst.TextstPackage.SYSTEM_COMPONENT__BEHAVIORS, value);
            	    	      								completedElement(value, true);
            	    	      							}
            	    	      							collectHiddenTokens(element);
            	    	      							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_13_0_0_2_0_0_1, a5_0, true);
            	    	      							copyLocalizationInfos(a5_0, element);
            	    	      						}
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt59 >= 1 ) break loop59;
            	    	    if (state.backtracking>0) {state.failed=true; return element;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(59, input);
            	                throw eee;
            	        }
            	        cnt59++;
            	    } while (true);

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 157, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 157);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 157);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 157);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 157);
            	      				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 157, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 158);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 158);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 158);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 158);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 158, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_be_textbe_st_textst_SystemComponent_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_SystemComponent"


    // $ANTLR start "parse_org_be_textbe_st_textst_SecondaryRelation"
    // St.g:5831:1: parse_org_be_textbe_st_textst_SecondaryRelation returns [org.be.textbe.st.textst.SecondaryRelation element = null] : ( (a0= NUMBER ) ( (a1= '.' ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) ) ) )? ( ( (a6= NUMBER ) | ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) ) ) )? (a10= COMPONENT ) ( (a11= '.' ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) ) ) )? ( ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) ) )? ( ( (a20= TEXT2 ) | (a21= COMPONENT ) | (a22= REQUIREMENT ) ) )? ) ;
    public final org.be.textbe.st.textst.SecondaryRelation parse_org_be_textbe_st_textst_SecondaryRelation() throws RecognitionException {
        org.be.textbe.st.textst.SecondaryRelation element =  null;
        int parse_org_be_textbe_st_textst_SecondaryRelation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
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
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;
        Token a22=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // St.g:5834:1: ( ( (a0= NUMBER ) ( (a1= '.' ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) ) ) )? ( ( (a6= NUMBER ) | ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) ) ) )? (a10= COMPONENT ) ( (a11= '.' ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) ) ) )? ( ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) ) )? ( ( (a20= TEXT2 ) | (a21= COMPONENT ) | (a22= REQUIREMENT ) ) )? ) )
            // St.g:5835:2: ( (a0= NUMBER ) ( (a1= '.' ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) ) ) )? ( ( (a6= NUMBER ) | ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) ) ) )? (a10= COMPONENT ) ( (a11= '.' ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) ) ) )? ( ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) ) )? ( ( (a20= TEXT2 ) | (a21= COMPONENT ) | (a22= REQUIREMENT ) ) )? )
            {
            // St.g:5835:2: ( (a0= NUMBER ) ( (a1= '.' ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) ) ) )? ( ( (a6= NUMBER ) | ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) ) ) )? (a10= COMPONENT ) ( (a11= '.' ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) ) ) )? ( ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) ) )? ( ( (a20= TEXT2 ) | (a21= COMPONENT ) | (a22= REQUIREMENT ) ) )? )
            // St.g:5836:3: (a0= NUMBER ) ( (a1= '.' ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) ) ) )? ( ( (a6= NUMBER ) | ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) ) ) )? (a10= COMPONENT ) ( (a11= '.' ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) ) ) )? ( ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) ) )? ( ( (a20= TEXT2 ) | (a21= COMPONENT ) | (a22= REQUIREMENT ) ) )?
            {
            // St.g:5836:3: (a0= NUMBER )
            // St.g:5837:4: a0= NUMBER
            {
            a0=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6310); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              				if (terminateParsing) {
              					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
              				}
              				if (element == null) {
              					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
              					incompleteObjects.push(element);
              				}
              				if (a0 != null) {
              					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
              					tokenResolver.setOptions(getOptions());
              					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
              					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF), result);
              					Object resolvedObject = result.getResolvedToken();
              					if (resolvedObject == null) {
              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              					}
              					java.lang.String resolved = (java.lang.String) resolvedObject;
              					if (resolved != null) {
              						Object value = resolved;
              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__BEHAVIOR_REF), value);
              						completedElement(value, false);
              					}
              					collectHiddenTokens(element);
              					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_0, resolved, true);
              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              				}
              			
            }

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_102, 159);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 159);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 159);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 159);
              		
            }
            // St.g:5875:3: ( (a1= '.' ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==30) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // St.g:5876:4: (a1= '.' ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) ) )
                    {
                    // St.g:5876:4: (a1= '.' ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) ) )
                    // St.g:5877:5: a1= '.' ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) )
                    {
                    a1=(Token)match(input,30,FOLLOW_30_in_parse_org_be_textbe_st_textst_SecondaryRelation6348); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                      						incompleteObjects.push(element);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_1_0_0_0, null, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_106, 160);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_107, 160);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_108, 160);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_109, 160);
                      				
                    }
                    // St.g:5894:5: ( (a2= TEXT2 ) | (a3= NUMBER ) | (a4= COMPONENT ) | (a5= REQUIREMENT ) )
                    int alt61=4;
                    switch ( input.LA(1) ) {
                    case TEXT2:
                        {
                        alt61=1;
                        }
                        break;
                    case NUMBER:
                        {
                        alt61=2;
                        }
                        break;
                    case COMPONENT:
                        {
                        alt61=3;
                        }
                        break;
                    case REQUIREMENT:
                        {
                        alt61=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // St.g:5895:6: (a2= TEXT2 )
                            {
                            // St.g:5895:6: (a2= TEXT2 )
                            // St.g:5896:7: a2= TEXT2
                            {
                            a2=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_SecondaryRelation6386); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a2 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_1_0_0_1_0_0_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 161);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 161);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 161);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // St.g:5934:12: (a3= NUMBER )
                            {
                            // St.g:5934:12: (a3= NUMBER )
                            // St.g:5935:7: a3= NUMBER
                            {
                            a3=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6451); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a3 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_1_0_0_1_0_1_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 162);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 162);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 162);
                              					
                            }

                            }
                            break;
                        case 3 :
                            // St.g:5973:12: (a4= COMPONENT )
                            {
                            // St.g:5973:12: (a4= COMPONENT )
                            // St.g:5974:7: a4= COMPONENT
                            {
                            a4=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SecondaryRelation6516); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a4 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_1_0_0_1_0_2_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 163);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 163);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 163);
                              					
                            }

                            }
                            break;
                        case 4 :
                            // St.g:6012:12: (a5= REQUIREMENT )
                            {
                            // St.g:6012:12: (a5= REQUIREMENT )
                            // St.g:6013:7: a5= REQUIREMENT
                            {
                            a5=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_SecondaryRelation6581); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a5 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__ATTRIBUTE), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_1_0_0_1_0_3_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 164);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 164);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 164);
                              					
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 165);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 165);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 165);
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 166);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 166);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 166);
              		
            }
            // St.g:6067:3: ( ( (a6= NUMBER ) | ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==NUMBER) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // St.g:6068:4: ( (a6= NUMBER ) | ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) ) )
                    {
                    // St.g:6068:4: ( (a6= NUMBER ) | ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==NUMBER) ) {
                        int LA64_1 = input.LA(2);

                        if ( (LA64_1==COMPONENT) ) {
                            alt64=1;
                        }
                        else if ( (LA64_1==NUMBER||LA64_1==UPPERBOUND) ) {
                            alt64=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // St.g:6069:5: (a6= NUMBER )
                            {
                            // St.g:6069:5: (a6= NUMBER )
                            // St.g:6070:6: a6= NUMBER
                            {
                            a6=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6678); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (terminateParsing) {
                              							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              						}
                              						if (element == null) {
                              							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              							incompleteObjects.push(element);
                              						}
                              						if (a6 != null) {
                              							org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                              							tokenResolver.setOptions(getOptions());
                              							org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              							tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND), result);
                              							Object resolvedObject = result.getResolvedToken();
                              							if (resolvedObject == null) {
                              								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
                              							}
                              							java.lang.String resolved = (java.lang.String) resolvedObject;
                              							if (resolved != null) {
                              								Object value = resolved;
                              								element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND), value);
                              								completedElement(value, false);
                              							}
                              							collectHiddenTokens(element);
                              							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_2_0_0_0, resolved, true);
                              							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
                              						}
                              					
                            }

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 167);
                              				
                            }

                            }
                            break;
                        case 2 :
                            // St.g:6106:10: ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) )
                            {
                            // St.g:6106:10: ( (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) ) )
                            // St.g:6107:6: (a7= NUMBER ) ( (a8= UPPERBOUND ) | (a9= NUMBER ) )
                            {
                            // St.g:6107:6: (a7= NUMBER )
                            // St.g:6108:7: a7= NUMBER
                            {
                            a7=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6742); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a7 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_LOWER_BOUND), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_2_0_1_0_0_0_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_110, 168);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_111, 168);
                              					
                            }
                            // St.g:6144:6: ( (a8= UPPERBOUND ) | (a9= NUMBER ) )
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==UPPERBOUND) ) {
                                alt63=1;
                            }
                            else if ( (LA63_0==NUMBER) ) {
                                alt63=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 63, 0, input);

                                throw nvae;
                            }
                            switch (alt63) {
                                case 1 :
                                    // St.g:6145:7: (a8= UPPERBOUND )
                                    {
                                    // St.g:6145:7: (a8= UPPERBOUND )
                                    // St.g:6146:8: a8= UPPERBOUND
                                    {
                                    a8=(Token)match(input,UPPERBOUND,FOLLOW_UPPERBOUND_in_parse_org_be_textbe_st_textst_SecondaryRelation6804); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a8 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UPPERBOUND");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStopIndex());
                                      									}
                                      									java.lang.String resolved = (java.lang.String) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_2_0_1_0_0_0_1_0_0_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a8, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 169);
                                      						
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:6182:14: (a9= NUMBER )
                                    {
                                    // St.g:6182:14: (a9= NUMBER )
                                    // St.g:6183:8: a9= NUMBER
                                    {
                                    a9=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6878); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a9 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a9).getStopIndex());
                                      									}
                                      									java.lang.String resolved = (java.lang.String) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__PRIMARY_UPPER_BOUND), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_2_0_1_0_0_0_1_0_1_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a9, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 170);
                                      						
                                    }

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 171);
                              					
                            }

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 172);
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 173);
              		
            }
            // St.g:6237:3: (a10= COMPONENT )
            // St.g:6238:4: a10= COMPONENT
            {
            a10=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SecondaryRelation6987); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              				if (terminateParsing) {
              					throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
              				}
              				if (element == null) {
              					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
              					incompleteObjects.push(element);
              				}
              				if (a10 != null) {
              					org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
              					tokenResolver.setOptions(getOptions());
              					org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
              					tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_REF), result);
              					Object resolvedObject = result.getResolvedToken();
              					if (resolvedObject == null) {
              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStopIndex());
              					}
              					java.lang.String resolved = (java.lang.String) resolvedObject;
              					if (resolved != null) {
              						Object value = resolved;
              						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_REF), value);
              						completedElement(value, false);
              					}
              					collectHiddenTokens(element);
              					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_3, resolved, true);
              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a10, element);
              				}
              			
            }

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_112, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_113, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_114, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 174, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 174);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 174, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 174);
              		
            }
            // St.g:6285:3: ( (a11= '.' ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==30) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // St.g:6286:4: (a11= '.' ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) ) )
                    {
                    // St.g:6286:4: (a11= '.' ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) ) )
                    // St.g:6287:5: a11= '.' ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) )
                    {
                    a11=(Token)match(input,30,FOLLOW_30_in_parse_org_be_textbe_st_textst_SecondaryRelation7025); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (element == null) {
                      						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                      						incompleteObjects.push(element);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_4_0_0_0, null, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_118, 175);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_119, 175);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_120, 175);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_121, 175);
                      				
                    }
                    // St.g:6304:5: ( (a12= TEXT2 ) | (a13= NUMBER ) | (a14= COMPONENT ) | (a15= REQUIREMENT ) )
                    int alt66=4;
                    switch ( input.LA(1) ) {
                    case TEXT2:
                        {
                        alt66=1;
                        }
                        break;
                    case NUMBER:
                        {
                        alt66=2;
                        }
                        break;
                    case COMPONENT:
                        {
                        alt66=3;
                        }
                        break;
                    case REQUIREMENT:
                        {
                        alt66=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // St.g:6305:6: (a12= TEXT2 )
                            {
                            // St.g:6305:6: (a12= TEXT2 )
                            // St.g:6306:7: a12= TEXT2
                            {
                            a12=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_SecondaryRelation7063); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a12 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a12).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_4_0_0_1_0_0_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a12, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_113, 176);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_114, 176);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 176);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 176);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 176);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 176, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 176);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 176);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 176);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 176);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 176, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 176);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // St.g:6353:12: (a13= NUMBER )
                            {
                            // St.g:6353:12: (a13= NUMBER )
                            // St.g:6354:7: a13= NUMBER
                            {
                            a13=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation7128); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a13 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a13).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_4_0_0_1_0_1_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a13, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_113, 177);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_114, 177);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 177);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 177);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 177);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 177, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 177);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 177);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 177);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 177);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 177, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 177);
                              					
                            }

                            }
                            break;
                        case 3 :
                            // St.g:6401:12: (a14= COMPONENT )
                            {
                            // St.g:6401:12: (a14= COMPONENT )
                            // St.g:6402:7: a14= COMPONENT
                            {
                            a14=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SecondaryRelation7193); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a14 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_4_0_0_1_0_2_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a14, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_113, 178);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_114, 178);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 178);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 178);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 178);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 178, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 178);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 178);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 178);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 178);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 178, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 178);
                              					
                            }

                            }
                            break;
                        case 4 :
                            // St.g:6449:12: (a15= REQUIREMENT )
                            {
                            // St.g:6449:12: (a15= REQUIREMENT )
                            // St.g:6450:7: a15= REQUIREMENT
                            {
                            a15=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_SecondaryRelation7258); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a15 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a15).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__COMPONENT_ATTRIBUTE), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_4_0_0_1_0_3_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a15, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_113, 179);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_114, 179);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 179);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 179);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 179);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 179, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 179);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 179);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 179);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 179);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 179, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 179);
                              					
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_113, 180);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_114, 180);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 180);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 180);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 180);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 180, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 180);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 180);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 180);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 180);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 180, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                      					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 180);
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_113, 181);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_114, 181);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 181);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 181);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 181);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 181, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 181);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 181);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 181);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 181);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 181, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 181);
              		
            }
            // St.g:6531:3: ( ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==NUMBER) ) {
                switch ( input.LA(2) ) {
                    case EOF:
                    case REQUIREMENT:
                    case TEXT2:
                    case UPPERBOUND:
                    case 15:
                    case 27:
                    case 28:
                    case 29:
                        {
                        alt70=1;
                        }
                        break;
                    case COMPONENT:
                        {
                        int LA70_4 = input.LA(3);

                        if ( (synpred93_St()) ) {
                            alt70=1;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA70_5 = input.LA(3);

                        if ( (synpred93_St()) ) {
                            alt70=1;
                        }
                        }
                        break;
                }

            }
            switch (alt70) {
                case 1 :
                    // St.g:6532:4: ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) )
                    {
                    // St.g:6532:4: ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NUMBER) ) {
                        switch ( input.LA(2) ) {
                        case EOF:
                        case REQUIREMENT:
                        case COMPONENT:
                        case TEXT2:
                        case 15:
                        case 27:
                        case 28:
                        case 29:
                            {
                            alt69=1;
                            }
                            break;
                        case NUMBER:
                            {
                            switch ( input.LA(3) ) {
                            case 30:
                                {
                                alt69=1;
                                }
                                break;
                            case NUMBER:
                                {
                                int LA69_5 = input.LA(4);

                                if ( (synpred91_St()) ) {
                                    alt69=1;
                                }
                                else if ( (true) ) {
                                    alt69=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 69, 5, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case COMPONENT:
                                {
                                int LA69_6 = input.LA(4);

                                if ( (synpred91_St()) ) {
                                    alt69=1;
                                }
                                else if ( (true) ) {
                                    alt69=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 69, 6, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case EOF:
                            case REQUIREMENT:
                            case TEXT2:
                            case 15:
                            case 27:
                            case 28:
                            case 29:
                                {
                                alt69=2;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 69, 3, input);

                                throw nvae;
                            }

                            }
                            break;
                        case UPPERBOUND:
                            {
                            alt69=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 69, 1, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // St.g:6533:5: (a16= NUMBER )
                            {
                            // St.g:6533:5: (a16= NUMBER )
                            // St.g:6534:6: a16= NUMBER
                            {
                            a16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation7355); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (terminateParsing) {
                              							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              						}
                              						if (element == null) {
                              							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              							incompleteObjects.push(element);
                              						}
                              						if (a16 != null) {
                              							org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                              							tokenResolver.setOptions(getOptions());
                              							org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              							tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND), result);
                              							Object resolvedObject = result.getResolvedToken();
                              							if (resolvedObject == null) {
                              								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a16).getStopIndex());
                              							}
                              							java.lang.String resolved = (java.lang.String) resolvedObject;
                              							if (resolved != null) {
                              								Object value = resolved;
                              								element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND), value);
                              								completedElement(value, false);
                              							}
                              							collectHiddenTokens(element);
                              							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_5_0_0_0, resolved, true);
                              							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a16, element);
                              						}
                              					
                            }

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 182);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 182);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 182);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 182, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 182);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 182);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 182);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 182);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 182, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 182);
                              				
                            }

                            }
                            break;
                        case 2 :
                            // St.g:6579:10: ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) )
                            {
                            // St.g:6579:10: ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) )
                            // St.g:6580:6: (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) )
                            {
                            // St.g:6580:6: (a17= NUMBER )
                            // St.g:6581:7: a17= NUMBER
                            {
                            a17=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation7419); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              								incompleteObjects.push(element);
                              							}
                              							if (a17 != null) {
                              								org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                              								tokenResolver.setOptions(getOptions());
                              								org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a17).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a17).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a17).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String) resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_LOWER_BOUND), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_5_0_1_0_0_0_0, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a17, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_122, 183);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_123, 183);
                              					
                            }
                            // St.g:6617:6: ( (a18= UPPERBOUND ) | (a19= NUMBER ) )
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==UPPERBOUND) ) {
                                alt68=1;
                            }
                            else if ( (LA68_0==NUMBER) ) {
                                alt68=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 68, 0, input);

                                throw nvae;
                            }
                            switch (alt68) {
                                case 1 :
                                    // St.g:6618:7: (a18= UPPERBOUND )
                                    {
                                    // St.g:6618:7: (a18= UPPERBOUND )
                                    // St.g:6619:8: a18= UPPERBOUND
                                    {
                                    a18=(Token)match(input,UPPERBOUND,FOLLOW_UPPERBOUND_in_parse_org_be_textbe_st_textst_SecondaryRelation7481); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a18 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UPPERBOUND");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a18).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a18).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a18).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a18).getStopIndex());
                                      									}
                                      									java.lang.String resolved = (java.lang.String) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_5_0_1_0_0_0_1_0_0_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a18, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 184);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 184);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 184);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 184, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 184);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 184);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 184);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 184);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 184, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 184);
                                      						
                                    }

                                    }
                                    break;
                                case 2 :
                                    // St.g:6664:14: (a19= NUMBER )
                                    {
                                    // St.g:6664:14: (a19= NUMBER )
                                    // St.g:6665:8: a19= NUMBER
                                    {
                                    a19=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation7555); if (state.failed) return element;
                                    if ( state.backtracking==0 ) {

                                      								if (terminateParsing) {
                                      									throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                                      								}
                                      								if (element == null) {
                                      									element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                                      									incompleteObjects.push(element);
                                      								}
                                      								if (a19 != null) {
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
                                      									tokenResolver.setOptions(getOptions());
                                      									org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                                      									tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND), result);
                                      									Object resolvedObject = result.getResolvedToken();
                                      									if (resolvedObject == null) {
                                      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a19).getStopIndex());
                                      									}
                                      									java.lang.String resolved = (java.lang.String) resolvedObject;
                                      									if (resolved != null) {
                                      										Object value = resolved;
                                      										element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__SECONDARY_UPPER_BOUND), value);
                                      										completedElement(value, false);
                                      									}
                                      									collectHiddenTokens(element);
                                      									retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_5_0_1_0_0_0_1_0_1_0, resolved, true);
                                      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a19, element);
                                      								}
                                      							
                                    }

                                    }

                                    if ( state.backtracking==0 ) {

                                      							// expected elements (follow set)
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 185);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 185);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 185);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 185, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 185);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 185);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 185);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 185);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 185, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                                      							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 185);
                                      						
                                    }

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 186);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 186);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 186);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 186, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 186);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 186);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 186);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 186);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 186, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 186);
                              					
                            }

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 187);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 187);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 187);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 187, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 187);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 187);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 187);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 187);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 187, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 187);
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_115, 188);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_116, 188);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_117, 188);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 188, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 188);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 188);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 188);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 188);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 188, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 188);
              		
            }
            // St.g:6755:3: ( ( (a20= TEXT2 ) | (a21= COMPONENT ) | (a22= REQUIREMENT ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==REQUIREMENT||(LA72_0>=COMPONENT && LA72_0<=TEXT2)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // St.g:6756:4: ( (a20= TEXT2 ) | (a21= COMPONENT ) | (a22= REQUIREMENT ) )
                    {
                    // St.g:6756:4: ( (a20= TEXT2 ) | (a21= COMPONENT ) | (a22= REQUIREMENT ) )
                    int alt71=3;
                    switch ( input.LA(1) ) {
                    case TEXT2:
                        {
                        alt71=1;
                        }
                        break;
                    case COMPONENT:
                        {
                        alt71=2;
                        }
                        break;
                    case REQUIREMENT:
                        {
                        alt71=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }

                    switch (alt71) {
                        case 1 :
                            // St.g:6757:5: (a20= TEXT2 )
                            {
                            // St.g:6757:5: (a20= TEXT2 )
                            // St.g:6758:6: a20= TEXT2
                            {
                            a20=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_SecondaryRelation7677); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (terminateParsing) {
                              							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              						}
                              						if (element == null) {
                              							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              							incompleteObjects.push(element);
                              						}
                              						if (a20 != null) {
                              							org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT2");
                              							tokenResolver.setOptions(getOptions());
                              							org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              							tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME), result);
                              							Object resolvedObject = result.getResolvedToken();
                              							if (resolvedObject == null) {
                              								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a20).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a20).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a20).getStopIndex());
                              							}
                              							java.lang.String resolved = (java.lang.String) resolvedObject;
                              							if (resolved != null) {
                              								Object value = resolved;
                              								element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME), value);
                              								completedElement(value, false);
                              							}
                              							collectHiddenTokens(element);
                              							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_6_0_0_0, resolved, true);
                              							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a20, element);
                              						}
                              					
                            }

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 189, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 189);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 189);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 189);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 189);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 189, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 189);
                              				
                            }

                            }
                            break;
                        case 2 :
                            // St.g:6800:10: (a21= COMPONENT )
                            {
                            // St.g:6800:10: (a21= COMPONENT )
                            // St.g:6801:6: a21= COMPONENT
                            {
                            a21=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SecondaryRelation7733); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (terminateParsing) {
                              							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              						}
                              						if (element == null) {
                              							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              							incompleteObjects.push(element);
                              						}
                              						if (a21 != null) {
                              							org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COMPONENT");
                              							tokenResolver.setOptions(getOptions());
                              							org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              							tokenResolver.resolve(a21.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME), result);
                              							Object resolvedObject = result.getResolvedToken();
                              							if (resolvedObject == null) {
                              								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a21).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a21).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a21).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a21).getStopIndex());
                              							}
                              							java.lang.String resolved = (java.lang.String) resolvedObject;
                              							if (resolved != null) {
                              								Object value = resolved;
                              								element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME), value);
                              								completedElement(value, false);
                              							}
                              							collectHiddenTokens(element);
                              							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_6_0_1_0, resolved, true);
                              							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a21, element);
                              						}
                              					
                            }

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 190, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 190);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 190);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 190);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 190);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 190, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 190);
                              				
                            }

                            }
                            break;
                        case 3 :
                            // St.g:6843:10: (a22= REQUIREMENT )
                            {
                            // St.g:6843:10: (a22= REQUIREMENT )
                            // St.g:6844:6: a22= REQUIREMENT
                            {
                            a22=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_SecondaryRelation7789); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (terminateParsing) {
                              							throw new org.be.textbe.st.textst.resource.st.mopp.StTerminateParsingException();
                              						}
                              						if (element == null) {
                              							element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
                              							incompleteObjects.push(element);
                              						}
                              						if (a22 != null) {
                              							org.be.textbe.st.textst.resource.st.IStTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REQUIREMENT");
                              							tokenResolver.setOptions(getOptions());
                              							org.be.textbe.st.textst.resource.st.IStTokenResolveResult result = getFreshTokenResolveResult();
                              							tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME), result);
                              							Object resolvedObject = result.getResolvedToken();
                              							if (resolvedObject == null) {
                              								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a22).getStopIndex());
                              							}
                              							java.lang.String resolved = (java.lang.String) resolvedObject;
                              							if (resolved != null) {
                              								Object value = resolved;
                              								element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.st.textst.TextstPackage.SECONDARY_RELATION__RELATION_NAME), value);
                              								completedElement(value, false);
                              							}
                              							collectHiddenTokens(element);
                              							retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_6_0_2_0, resolved, true);
                              							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a22, element);
                              						}
                              					
                            }

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 191, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 191);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 191);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 191);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 191);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 191, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
                              					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 191);
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 192, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 192);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 192);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 192);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 192);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 192, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 192);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 193, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 193);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 193);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 193);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 193);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 193, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 193);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_org_be_textbe_st_textst_SecondaryRelation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_SecondaryRelation"


    // $ANTLR start "parse_org_be_textbe_st_textst_AbstractNode"
    // St.g:6912:1: parse_org_be_textbe_st_textst_AbstractNode returns [org.be.textbe.st.textst.AbstractNode element = null] : (c0= parse_org_be_textbe_st_textst_RelatedToNode | c1= parse_org_be_textbe_st_textst_DefinedByNode | c2= parse_org_be_textbe_st_textst_Node );
    public final org.be.textbe.st.textst.AbstractNode parse_org_be_textbe_st_textst_AbstractNode() throws RecognitionException {
        org.be.textbe.st.textst.AbstractNode element =  null;
        int parse_org_be_textbe_st_textst_AbstractNode_StartIndex = input.index();
        org.be.textbe.st.textst.RelatedToNode c0 = null;

        org.be.textbe.st.textst.DefinedByNode c1 = null;

        org.be.textbe.st.textst.Node c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // St.g:6913:1: (c0= parse_org_be_textbe_st_textst_RelatedToNode | c1= parse_org_be_textbe_st_textst_DefinedByNode | c2= parse_org_be_textbe_st_textst_Node )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt73=1;
                }
                break;
            case 23:
                {
                alt73=2;
                }
                break;
            case REQUIREMENT:
            case VALIDITY:
            case COMPONENT:
            case MCI:
            case 22:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // St.g:6914:2: c0= parse_org_be_textbe_st_textst_RelatedToNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_RelatedToNode_in_parse_org_be_textbe_st_textst_AbstractNode7864);
                    c0=parse_org_be_textbe_st_textst_RelatedToNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // St.g:6915:4: c1= parse_org_be_textbe_st_textst_DefinedByNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_DefinedByNode_in_parse_org_be_textbe_st_textst_AbstractNode7874);
                    c1=parse_org_be_textbe_st_textst_DefinedByNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // St.g:6916:4: c2= parse_org_be_textbe_st_textst_Node
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_Node_in_parse_org_be_textbe_st_textst_AbstractNode7884);
                    c2=parse_org_be_textbe_st_textst_Node();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 17, parse_org_be_textbe_st_textst_AbstractNode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_AbstractNode"


    // $ANTLR start "parse_org_be_textbe_st_textst_AbstractBlockOrNode"
    // St.g:6920:1: parse_org_be_textbe_st_textst_AbstractBlockOrNode returns [org.be.textbe.st.textst.AbstractBlockOrNode element = null] : (c0= parse_org_be_textbe_st_textst_ParallelBlock | c1= parse_org_be_textbe_st_textst_AlternativeBlock | c2= parse_org_be_textbe_st_textst_RelatedToNode | c3= parse_org_be_textbe_st_textst_DefinedByNode | c4= parse_org_be_textbe_st_textst_Node );
    public final org.be.textbe.st.textst.AbstractBlockOrNode parse_org_be_textbe_st_textst_AbstractBlockOrNode() throws RecognitionException {
        org.be.textbe.st.textst.AbstractBlockOrNode element =  null;
        int parse_org_be_textbe_st_textst_AbstractBlockOrNode_StartIndex = input.index();
        org.be.textbe.st.textst.ParallelBlock c0 = null;

        org.be.textbe.st.textst.AlternativeBlock c1 = null;

        org.be.textbe.st.textst.RelatedToNode c2 = null;

        org.be.textbe.st.textst.DefinedByNode c3 = null;

        org.be.textbe.st.textst.Node c4 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // St.g:6921:1: (c0= parse_org_be_textbe_st_textst_ParallelBlock | c1= parse_org_be_textbe_st_textst_AlternativeBlock | c2= parse_org_be_textbe_st_textst_RelatedToNode | c3= parse_org_be_textbe_st_textst_DefinedByNode | c4= parse_org_be_textbe_st_textst_Node )
            int alt74=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt74=1;
                }
                break;
            case 19:
                {
                alt74=2;
                }
                break;
            case 20:
                {
                alt74=3;
                }
                break;
            case 23:
                {
                alt74=4;
                }
                break;
            case REQUIREMENT:
            case VALIDITY:
            case COMPONENT:
            case MCI:
            case 22:
                {
                alt74=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // St.g:6922:2: c0= parse_org_be_textbe_st_textst_ParallelBlock
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_ParallelBlock_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7905);
                    c0=parse_org_be_textbe_st_textst_ParallelBlock();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // St.g:6923:4: c1= parse_org_be_textbe_st_textst_AlternativeBlock
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_AlternativeBlock_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7915);
                    c1=parse_org_be_textbe_st_textst_AlternativeBlock();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // St.g:6924:4: c2= parse_org_be_textbe_st_textst_RelatedToNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_RelatedToNode_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7925);
                    c2=parse_org_be_textbe_st_textst_RelatedToNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // St.g:6925:4: c3= parse_org_be_textbe_st_textst_DefinedByNode
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_DefinedByNode_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7935);
                    c3=parse_org_be_textbe_st_textst_DefinedByNode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // St.g:6926:4: c4= parse_org_be_textbe_st_textst_Node
                    {
                    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_Node_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7945);
                    c4=parse_org_be_textbe_st_textst_Node();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 18, parse_org_be_textbe_st_textst_AbstractBlockOrNode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_be_textbe_st_textst_AbstractBlockOrNode"

    // $ANTLR start synpred3_St
    public final void synpred3_St_fragment() throws RecognitionException {   
        org.be.textbe.st.textst.ComponentList a2_0 = null;


        // St.g:594:3: ( (a2_0= parse_org_be_textbe_st_textst_ComponentList ) )
        // St.g:594:3: (a2_0= parse_org_be_textbe_st_textst_ComponentList )
        {
        // St.g:594:3: (a2_0= parse_org_be_textbe_st_textst_ComponentList )
        // St.g:595:4: a2_0= parse_org_be_textbe_st_textst_ComponentList
        {
        pushFollow(FOLLOW_parse_org_be_textbe_st_textst_ComponentList_in_synpred3_St194);
        a2_0=parse_org_be_textbe_st_textst_ComponentList();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_St

    // $ANTLR start synpred7_St
    public final void synpred7_St_fragment() throws RecognitionException {   
        Token a1=null;

        // St.g:908:3: ( ( ( (a1= REQUIREMENT ) )* ) )
        // St.g:908:3: ( ( (a1= REQUIREMENT ) )* )
        {
        // St.g:908:3: ( ( (a1= REQUIREMENT ) )* )
        // St.g:909:4: ( (a1= REQUIREMENT ) )*
        {
        // St.g:909:4: ( (a1= REQUIREMENT ) )*
        loop75:
        do {
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==REQUIREMENT) ) {
                alt75=1;
            }


            switch (alt75) {
        	case 1 :
        	    // St.g:910:5: (a1= REQUIREMENT )
        	    {
        	    // St.g:910:5: (a1= REQUIREMENT )
        	    // St.g:911:6: a1= REQUIREMENT
        	    {
        	    a1=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred7_St582); if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop75;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred7_St

    // $ANTLR start synpred12_St
    public final void synpred12_St_fragment() throws RecognitionException {   
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;

        // St.g:1059:5: ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )
        // St.g:1059:5: ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) )
        {
        // St.g:1059:5: ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) )
        int alt76=4;
        switch ( input.LA(1) ) {
        case TEXT2:
            {
            alt76=1;
            }
            break;
        case NUMBER:
            {
            alt76=2;
            }
            break;
        case COMPONENT:
            {
            alt76=3;
            }
            break;
        case REQUIREMENT:
            {
            alt76=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 76, 0, input);

            throw nvae;
        }

        switch (alt76) {
            case 1 :
                // St.g:1060:6: (a4= TEXT2 )
                {
                // St.g:1060:6: (a4= TEXT2 )
                // St.g:1061:7: a4= TEXT2
                {
                a4=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_synpred12_St749); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // St.g:1112:12: (a5= NUMBER )
                {
                // St.g:1112:12: (a5= NUMBER )
                // St.g:1113:7: a5= NUMBER
                {
                a5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred12_St814); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // St.g:1164:12: (a6= COMPONENT )
                {
                // St.g:1164:12: (a6= COMPONENT )
                // St.g:1165:7: a6= COMPONENT
                {
                a6=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred12_St879); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // St.g:1216:12: (a7= REQUIREMENT )
                {
                // St.g:1216:12: (a7= REQUIREMENT )
                // St.g:1217:7: a7= REQUIREMENT
                {
                a7=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred12_St944); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred12_St

    // $ANTLR start synpred19_St
    public final void synpred19_St_fragment() throws RecognitionException {   
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;

        // St.g:1629:5: ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )
        // St.g:1629:5: ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) )
        {
        // St.g:1629:5: ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) )
        int alt82=4;
        switch ( input.LA(1) ) {
        case TEXT2:
            {
            alt82=1;
            }
            break;
        case NUMBER:
            {
            alt82=2;
            }
            break;
        case COMPONENT:
            {
            alt82=3;
            }
            break;
        case REQUIREMENT:
            {
            alt82=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 82, 0, input);

            throw nvae;
        }

        switch (alt82) {
            case 1 :
                // St.g:1630:6: (a15= TEXT2 )
                {
                // St.g:1630:6: (a15= TEXT2 )
                // St.g:1631:7: a15= TEXT2
                {
                a15=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_synpred19_St1439); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // St.g:1682:12: (a16= NUMBER )
                {
                // St.g:1682:12: (a16= NUMBER )
                // St.g:1683:7: a16= NUMBER
                {
                a16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred19_St1504); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // St.g:1734:12: (a17= COMPONENT )
                {
                // St.g:1734:12: (a17= COMPONENT )
                // St.g:1735:7: a17= COMPONENT
                {
                a17=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred19_St1569); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // St.g:1786:12: (a18= REQUIREMENT )
                {
                // St.g:1786:12: (a18= REQUIREMENT )
                // St.g:1787:7: a18= REQUIREMENT
                {
                a18=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred19_St1634); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred19_St

    // $ANTLR start synpred26_St
    public final void synpred26_St_fragment() throws RecognitionException {   
        Token a1=null;

        // St.g:2208:3: ( ( ( (a1= REQUIREMENT ) )* ) )
        // St.g:2208:3: ( ( (a1= REQUIREMENT ) )* )
        {
        // St.g:2208:3: ( ( (a1= REQUIREMENT ) )* )
        // St.g:2209:4: ( (a1= REQUIREMENT ) )*
        {
        // St.g:2209:4: ( (a1= REQUIREMENT ) )*
        loop88:
        do {
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==REQUIREMENT) ) {
                alt88=1;
            }


            switch (alt88) {
        	case 1 :
        	    // St.g:2210:5: (a1= REQUIREMENT )
        	    {
        	    // St.g:2210:5: (a1= REQUIREMENT )
        	    // St.g:2211:6: a1= REQUIREMENT
        	    {
        	    a1=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred26_St2115); if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop88;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred26_St

    // $ANTLR start synpred31_St
    public final void synpred31_St_fragment() throws RecognitionException {   
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;

        // St.g:2359:5: ( ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) ) )
        // St.g:2359:5: ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) )
        {
        // St.g:2359:5: ( (a4= TEXT2 ) | (a5= NUMBER ) | (a6= COMPONENT ) | (a7= REQUIREMENT ) )
        int alt89=4;
        switch ( input.LA(1) ) {
        case TEXT2:
            {
            alt89=1;
            }
            break;
        case NUMBER:
            {
            alt89=2;
            }
            break;
        case COMPONENT:
            {
            alt89=3;
            }
            break;
        case REQUIREMENT:
            {
            alt89=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }

        switch (alt89) {
            case 1 :
                // St.g:2360:6: (a4= TEXT2 )
                {
                // St.g:2360:6: (a4= TEXT2 )
                // St.g:2361:7: a4= TEXT2
                {
                a4=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_synpred31_St2282); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // St.g:2412:12: (a5= NUMBER )
                {
                // St.g:2412:12: (a5= NUMBER )
                // St.g:2413:7: a5= NUMBER
                {
                a5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred31_St2347); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // St.g:2464:12: (a6= COMPONENT )
                {
                // St.g:2464:12: (a6= COMPONENT )
                // St.g:2465:7: a6= COMPONENT
                {
                a6=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred31_St2412); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // St.g:2516:12: (a7= REQUIREMENT )
                {
                // St.g:2516:12: (a7= REQUIREMENT )
                // St.g:2517:7: a7= REQUIREMENT
                {
                a7=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred31_St2477); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred31_St

    // $ANTLR start synpred38_St
    public final void synpred38_St_fragment() throws RecognitionException {   
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;

        // St.g:2929:5: ( ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) ) )
        // St.g:2929:5: ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) )
        {
        // St.g:2929:5: ( (a15= TEXT2 ) | (a16= NUMBER ) | (a17= COMPONENT ) | (a18= REQUIREMENT ) )
        int alt95=4;
        switch ( input.LA(1) ) {
        case TEXT2:
            {
            alt95=1;
            }
            break;
        case NUMBER:
            {
            alt95=2;
            }
            break;
        case COMPONENT:
            {
            alt95=3;
            }
            break;
        case REQUIREMENT:
            {
            alt95=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 95, 0, input);

            throw nvae;
        }

        switch (alt95) {
            case 1 :
                // St.g:2930:6: (a15= TEXT2 )
                {
                // St.g:2930:6: (a15= TEXT2 )
                // St.g:2931:7: a15= TEXT2
                {
                a15=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_synpred38_St2972); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // St.g:2982:12: (a16= NUMBER )
                {
                // St.g:2982:12: (a16= NUMBER )
                // St.g:2983:7: a16= NUMBER
                {
                a16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred38_St3037); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // St.g:3034:12: (a17= COMPONENT )
                {
                // St.g:3034:12: (a17= COMPONENT )
                // St.g:3035:7: a17= COMPONENT
                {
                a17=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred38_St3102); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // St.g:3086:12: (a18= REQUIREMENT )
                {
                // St.g:3086:12: (a18= REQUIREMENT )
                // St.g:3087:7: a18= REQUIREMENT
                {
                a18=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred38_St3167); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred38_St

    // $ANTLR start synpred45_St
    public final void synpred45_St_fragment() throws RecognitionException {   
        Token a0=null;

        // St.g:3490:3: ( ( ( (a0= REQUIREMENT ) )* ) )
        // St.g:3490:3: ( ( (a0= REQUIREMENT ) )* )
        {
        // St.g:3490:3: ( ( (a0= REQUIREMENT ) )* )
        // St.g:3491:4: ( (a0= REQUIREMENT ) )*
        {
        // St.g:3491:4: ( (a0= REQUIREMENT ) )*
        loop101:
        do {
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==REQUIREMENT) ) {
                alt101=1;
            }


            switch (alt101) {
        	case 1 :
        	    // St.g:3492:5: (a0= REQUIREMENT )
        	    {
        	    // St.g:3492:5: (a0= REQUIREMENT )
        	    // St.g:3493:6: a0= REQUIREMENT
        	    {
        	    a0=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred45_St3634); if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop101;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred45_St

    // $ANTLR start synpred50_St
    public final void synpred50_St_fragment() throws RecognitionException {   
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;

        // St.g:3641:5: ( ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) ) )
        // St.g:3641:5: ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) )
        {
        // St.g:3641:5: ( (a3= TEXT2 ) | (a4= NUMBER ) | (a5= COMPONENT ) | (a6= REQUIREMENT ) )
        int alt102=4;
        switch ( input.LA(1) ) {
        case TEXT2:
            {
            alt102=1;
            }
            break;
        case NUMBER:
            {
            alt102=2;
            }
            break;
        case COMPONENT:
            {
            alt102=3;
            }
            break;
        case REQUIREMENT:
            {
            alt102=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 102, 0, input);

            throw nvae;
        }

        switch (alt102) {
            case 1 :
                // St.g:3642:6: (a3= TEXT2 )
                {
                // St.g:3642:6: (a3= TEXT2 )
                // St.g:3643:7: a3= TEXT2
                {
                a3=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_synpred50_St3801); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // St.g:3694:12: (a4= NUMBER )
                {
                // St.g:3694:12: (a4= NUMBER )
                // St.g:3695:7: a4= NUMBER
                {
                a4=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred50_St3866); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // St.g:3746:12: (a5= COMPONENT )
                {
                // St.g:3746:12: (a5= COMPONENT )
                // St.g:3747:7: a5= COMPONENT
                {
                a5=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred50_St3931); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // St.g:3798:12: (a6= REQUIREMENT )
                {
                // St.g:3798:12: (a6= REQUIREMENT )
                // St.g:3799:7: a6= REQUIREMENT
                {
                a6=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred50_St3996); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred50_St

    // $ANTLR start synpred57_St
    public final void synpred57_St_fragment() throws RecognitionException {   
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;

        // St.g:4211:5: ( ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) ) )
        // St.g:4211:5: ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) )
        {
        // St.g:4211:5: ( (a14= TEXT2 ) | (a15= NUMBER ) | (a16= COMPONENT ) | (a17= REQUIREMENT ) )
        int alt108=4;
        switch ( input.LA(1) ) {
        case TEXT2:
            {
            alt108=1;
            }
            break;
        case NUMBER:
            {
            alt108=2;
            }
            break;
        case COMPONENT:
            {
            alt108=3;
            }
            break;
        case REQUIREMENT:
            {
            alt108=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 108, 0, input);

            throw nvae;
        }

        switch (alt108) {
            case 1 :
                // St.g:4212:6: (a14= TEXT2 )
                {
                // St.g:4212:6: (a14= TEXT2 )
                // St.g:4213:7: a14= TEXT2
                {
                a14=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_synpred57_St4491); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // St.g:4264:12: (a15= NUMBER )
                {
                // St.g:4264:12: (a15= NUMBER )
                // St.g:4265:7: a15= NUMBER
                {
                a15=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred57_St4556); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // St.g:4316:12: (a16= COMPONENT )
                {
                // St.g:4316:12: (a16= COMPONENT )
                // St.g:4317:7: a16= COMPONENT
                {
                a16=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred57_St4621); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // St.g:4368:12: (a17= REQUIREMENT )
                {
                // St.g:4368:12: (a17= REQUIREMENT )
                // St.g:4369:7: a17= REQUIREMENT
                {
                a17=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred57_St4686); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred57_St

    // $ANTLR start synpred68_St
    public final void synpred68_St_fragment() throws RecognitionException {   
        Token a0=null;
        org.be.textbe.st.textst.Component a1_0 = null;


        // St.g:5193:3: ( (a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component ) ) )
        // St.g:5193:3: (a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component ) )
        {
        // St.g:5193:3: (a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component ) )
        // St.g:5194:4: a0= '#C' (a1_0= parse_org_be_textbe_st_textst_Component )
        {
        a0=(Token)match(input,27,FOLLOW_27_in_synpred68_St5544); if (state.failed) return ;
        // St.g:5209:4: (a1_0= parse_org_be_textbe_st_textst_Component )
        // St.g:5210:5: a1_0= parse_org_be_textbe_st_textst_Component
        {
        pushFollow(FOLLOW_parse_org_be_textbe_st_textst_Component_in_synpred68_St5570);
        a1_0=parse_org_be_textbe_st_textst_Component();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred68_St

    // $ANTLR start synpred75_St
    public final void synpred75_St_fragment() throws RecognitionException {   
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        org.be.textbe.st.textst.SecondaryRelation a5_0 = null;


        // St.g:5357:2: ( (a0= COMPONENT ) ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) ) ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )* )
        // St.g:5357:2: (a0= COMPONENT ) ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) ) ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )*
        {
        // St.g:5357:2: (a0= COMPONENT )
        // St.g:5358:3: a0= COMPONENT
        {
        a0=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred75_St5782); if (state.failed) return ;

        }

        // St.g:5395:2: ( (a1= REQUIREMENT ) | (a2= COMPONENT ) | (a3= TEXT2 ) )
        int alt115=3;
        switch ( input.LA(1) ) {
        case REQUIREMENT:
            {
            alt115=1;
            }
            break;
        case COMPONENT:
            {
            alt115=2;
            }
            break;
        case TEXT2:
            {
            alt115=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 115, 0, input);

            throw nvae;
        }

        switch (alt115) {
            case 1 :
                // St.g:5396:3: (a1= REQUIREMENT )
                {
                // St.g:5396:3: (a1= REQUIREMENT )
                // St.g:5397:4: a1= REQUIREMENT
                {
                a1=(Token)match(input,REQUIREMENT,FOLLOW_REQUIREMENT_in_synpred75_St5812); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // St.g:5437:6: (a2= COMPONENT )
                {
                // St.g:5437:6: (a2= COMPONENT )
                // St.g:5438:4: a2= COMPONENT
                {
                a2=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_synpred75_St5850); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // St.g:5478:6: (a3= TEXT2 )
                {
                // St.g:5478:6: (a3= TEXT2 )
                // St.g:5479:4: a3= TEXT2
                {
                a3=(Token)match(input,TEXT2,FOLLOW_TEXT2_in_synpred75_St5888); if (state.failed) return ;

                }


                }
                break;

        }

        // St.g:5528:2: ( (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ ) )*
        loop117:
        do {
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==29) ) {
                alt117=1;
            }


            switch (alt117) {
        	case 1 :
        	    // St.g:5529:3: (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ )
        	    {
        	    // St.g:5529:3: (a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+ )
        	    // St.g:5530:4: a4= '#SR' ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+
        	    {
        	    a4=(Token)match(input,29,FOLLOW_29_in_synpred75_St5931); if (state.failed) return ;
        	    // St.g:5544:4: ( (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation ) )+
        	    int cnt116=0;
        	    loop116:
        	    do {
        	        int alt116=2;
        	        int LA116_0 = input.LA(1);

        	        if ( (LA116_0==NUMBER) ) {
        	            alt116=1;
        	        }


        	        switch (alt116) {
        	    	case 1 :
        	    	    // St.g:5545:5: (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation )
        	    	    {
        	    	    // St.g:5545:5: (a5_0= parse_org_be_textbe_st_textst_SecondaryRelation )
        	    	    // St.g:5546:6: a5_0= parse_org_be_textbe_st_textst_SecondaryRelation
        	    	    {
        	    	    pushFollow(FOLLOW_parse_org_be_textbe_st_textst_SecondaryRelation_in_synpred75_St5964);
        	    	    a5_0=parse_org_be_textbe_st_textst_SecondaryRelation();

        	    	    state._fsp--;
        	    	    if (state.failed) return ;

        	    	    }


        	    	    }
        	    	    break;

        	    	default :
        	    	    if ( cnt116 >= 1 ) break loop116;
        	    	    if (state.backtracking>0) {state.failed=true; return ;}
        	                EarlyExitException eee =
        	                    new EarlyExitException(116, input);
        	                throw eee;
        	        }
        	        cnt116++;
        	    } while (true);


        	    }


        	    }
        	    break;

        	default :
        	    break loop117;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred75_St

    // $ANTLR start synpred91_St
    public final void synpred91_St_fragment() throws RecognitionException {   
        Token a16=null;

        // St.g:6533:5: ( (a16= NUMBER ) )
        // St.g:6533:5: (a16= NUMBER )
        {
        // St.g:6533:5: (a16= NUMBER )
        // St.g:6534:6: a16= NUMBER
        {
        a16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred91_St7355); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred91_St

    // $ANTLR start synpred93_St
    public final void synpred93_St_fragment() throws RecognitionException {   
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;

        // St.g:6532:4: ( ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) ) )
        // St.g:6532:4: ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) )
        {
        // St.g:6532:4: ( (a16= NUMBER ) | ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) ) )
        int alt124=2;
        int LA124_0 = input.LA(1);

        if ( (LA124_0==NUMBER) ) {
            int LA124_1 = input.LA(2);

            if ( (LA124_1==EOF) ) {
                alt124=1;
            }
            else if ( (LA124_1==NUMBER||LA124_1==UPPERBOUND) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 1, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 124, 0, input);

            throw nvae;
        }
        switch (alt124) {
            case 1 :
                // St.g:6533:5: (a16= NUMBER )
                {
                // St.g:6533:5: (a16= NUMBER )
                // St.g:6534:6: a16= NUMBER
                {
                a16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred93_St7355); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // St.g:6579:10: ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) )
                {
                // St.g:6579:10: ( (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) ) )
                // St.g:6580:6: (a17= NUMBER ) ( (a18= UPPERBOUND ) | (a19= NUMBER ) )
                {
                // St.g:6580:6: (a17= NUMBER )
                // St.g:6581:7: a17= NUMBER
                {
                a17=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred93_St7419); if (state.failed) return ;

                }

                // St.g:6617:6: ( (a18= UPPERBOUND ) | (a19= NUMBER ) )
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==UPPERBOUND) ) {
                    alt123=1;
                }
                else if ( (LA123_0==NUMBER) ) {
                    alt123=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 0, input);

                    throw nvae;
                }
                switch (alt123) {
                    case 1 :
                        // St.g:6618:7: (a18= UPPERBOUND )
                        {
                        // St.g:6618:7: (a18= UPPERBOUND )
                        // St.g:6619:8: a18= UPPERBOUND
                        {
                        a18=(Token)match(input,UPPERBOUND,FOLLOW_UPPERBOUND_in_synpred93_St7481); if (state.failed) return ;

                        }


                        }
                        break;
                    case 2 :
                        // St.g:6664:14: (a19= NUMBER )
                        {
                        // St.g:6664:14: (a19= NUMBER )
                        // St.g:6665:8: a19= NUMBER
                        {
                        a19=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_synpred93_St7555); if (state.failed) return ;

                        }


                        }
                        break;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred93_St

    // Delegated rules

    public final boolean synpred50_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_St() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_St_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_TextST_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_OptionList_in_parse_org_be_textbe_st_textst_TextST124 = new BitSet(new long[]{0x000000001C008000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_RequirementList_in_parse_org_be_textbe_st_textst_TextST159 = new BitSet(new long[]{0x0000000018008000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_ComponentList_in_parse_org_be_textbe_st_textst_TextST194 = new BitSet(new long[]{0x0000000018008000L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_StructureTree_in_parse_org_be_textbe_st_textst_TextST224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_org_be_textbe_st_textst_StructureTree257 = new BitSet(new long[]{0x0000000000400470L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_Node_in_parse_org_be_textbe_st_textst_StructureTree275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_org_be_textbe_st_textst_ParallelBlock308 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_be_textbe_st_textst_ParallelBlock331 = new BitSet(new long[]{0x0000000000D00470L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_AbstractNode_in_parse_org_be_textbe_st_textst_ParallelBlock357 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_parse_org_be_textbe_st_textst_ParallelBlock398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_org_be_textbe_st_textst_AlternativeBlock427 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_be_textbe_st_textst_AlternativeBlock450 = new BitSet(new long[]{0x0000000000D00470L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_AbstractNode_in_parse_org_be_textbe_st_textst_AlternativeBlock476 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_parse_org_be_textbe_st_textst_AlternativeBlock517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_org_be_textbe_st_textst_RelatedToNode546 = new BitSet(new long[]{0x0000000000400470L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_RelatedToNode582 = new BitSet(new long[]{0x0000000000400470L});
    public static final BitSet FOLLOW_VALIDITY_in_parse_org_be_textbe_st_textst_RelatedToNode650 = new BitSet(new long[]{0x0000000000400440L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode695 = new BitSet(new long[]{0x0000000000D90FF2L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_RelatedToNode749 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_RelatedToNode814 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode879 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_RelatedToNode944 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1033 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1107 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1167 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_MCI_in_parse_org_be_textbe_st_textst_RelatedToNode1287 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode1326 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_be_textbe_st_textst_RelatedToNode1359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode1385 = new BitSet(new long[]{0x0000000000D90FF2L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_RelatedToNode1439 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_RelatedToNode1504 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_RelatedToNode1569 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_RelatedToNode1634 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1723 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1797 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_RelatedToNode1857 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_22_in_parse_org_be_textbe_st_textst_RelatedToNode1966 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_OPERATOR_in_parse_org_be_textbe_st_textst_RelatedToNode1999 = new BitSet(new long[]{0x0000000000D90472L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_AbstractBlockOrNode_in_parse_org_be_textbe_st_textst_RelatedToNode2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_org_be_textbe_st_textst_DefinedByNode2079 = new BitSet(new long[]{0x0000000000400470L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_DefinedByNode2115 = new BitSet(new long[]{0x0000000000400470L});
    public static final BitSet FOLLOW_VALIDITY_in_parse_org_be_textbe_st_textst_DefinedByNode2183 = new BitSet(new long[]{0x0000000000400440L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode2228 = new BitSet(new long[]{0x0000000000D90FF2L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_DefinedByNode2282 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_DefinedByNode2347 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode2412 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_DefinedByNode2477 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode2566 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode2640 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode2700 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_MCI_in_parse_org_be_textbe_st_textst_DefinedByNode2820 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode2859 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_be_textbe_st_textst_DefinedByNode2892 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode2918 = new BitSet(new long[]{0x0000000000D90FF2L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_DefinedByNode2972 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_DefinedByNode3037 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_DefinedByNode3102 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_DefinedByNode3167 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode3256 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode3330 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_DefinedByNode3390 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_22_in_parse_org_be_textbe_st_textst_DefinedByNode3499 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_OPERATOR_in_parse_org_be_textbe_st_textst_DefinedByNode3532 = new BitSet(new long[]{0x0000000000D90472L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_AbstractBlockOrNode_in_parse_org_be_textbe_st_textst_DefinedByNode3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Node3634 = new BitSet(new long[]{0x0000000000400470L});
    public static final BitSet FOLLOW_VALIDITY_in_parse_org_be_textbe_st_textst_Node3702 = new BitSet(new long[]{0x0000000000400440L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node3747 = new BitSet(new long[]{0x0000000000D90FF2L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Node3801 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_Node3866 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node3931 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Node3996 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4085 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4159 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4219 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_MCI_in_parse_org_be_textbe_st_textst_Node4339 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node4378 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_be_textbe_st_textst_Node4411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node4437 = new BitSet(new long[]{0x0000000000D90FF2L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Node4491 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_Node4556 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Node4621 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Node4686 = new BitSet(new long[]{0x0000000000D90E72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4775 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4849 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUALIFIER_in_parse_org_be_textbe_st_textst_Node4909 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_22_in_parse_org_be_textbe_st_textst_Node5018 = new BitSet(new long[]{0x0000000000D90C72L});
    public static final BitSet FOLLOW_OPERATOR_in_parse_org_be_textbe_st_textst_Node5051 = new BitSet(new long[]{0x0000000000D90472L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_AbstractBlockOrNode_in_parse_org_be_textbe_st_textst_Node5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_org_be_textbe_st_textst_OptionList5131 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_Option_in_parse_org_be_textbe_st_textst_OptionList5154 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Option5199 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_org_be_textbe_st_textst_Option5220 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Option5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_org_be_textbe_st_textst_RequirementList5274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_Requirement_in_parse_org_be_textbe_st_textst_RequirementList5297 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Requirement5342 = new BitSet(new long[]{0x00000000000001D0L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Requirement5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_Requirement5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Requirement5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Requirement5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_org_be_textbe_st_textst_ComponentList5544 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_Component_in_parse_org_be_textbe_st_textst_ComponentList5570 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_28_in_parse_org_be_textbe_st_textst_ComponentList5620 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_SystemComponent_in_parse_org_be_textbe_st_textst_ComponentList5646 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_parse_org_be_textbe_st_textst_ComponentList5696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_Component_in_parse_org_be_textbe_st_textst_ComponentList5722 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Component5782 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_Component5812 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_Component5850 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_Component5888 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_parse_org_be_textbe_st_textst_Component5931 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_SecondaryRelation_in_parse_org_be_textbe_st_textst_Component5964 = new BitSet(new long[]{0x0000000020000102L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_SystemComponent_in_parse_org_be_textbe_st_textst_Component6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SystemComponent6051 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_SystemComponent6081 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SystemComponent6119 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_SystemComponent6157 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_parse_org_be_textbe_st_textst_SystemComponent6200 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_SecondaryRelation_in_parse_org_be_textbe_st_textst_SystemComponent6233 = new BitSet(new long[]{0x0000000020000102L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6310 = new BitSet(new long[]{0x0000000040000140L});
    public static final BitSet FOLLOW_30_in_parse_org_be_textbe_st_textst_SecondaryRelation6348 = new BitSet(new long[]{0x00000000000001D0L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_SecondaryRelation6386 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6451 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SecondaryRelation6516 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_SecondaryRelation6581 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6678 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6742 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_UPPERBOUND_in_parse_org_be_textbe_st_textst_SecondaryRelation6804 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation6878 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SecondaryRelation6987 = new BitSet(new long[]{0x00000000400001D2L});
    public static final BitSet FOLLOW_30_in_parse_org_be_textbe_st_textst_SecondaryRelation7025 = new BitSet(new long[]{0x00000000000001D0L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_SecondaryRelation7063 = new BitSet(new long[]{0x00000000000001D2L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation7128 = new BitSet(new long[]{0x00000000000001D2L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SecondaryRelation7193 = new BitSet(new long[]{0x00000000000001D2L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_SecondaryRelation7258 = new BitSet(new long[]{0x00000000000001D2L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation7355 = new BitSet(new long[]{0x00000000000000D2L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation7419 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_UPPERBOUND_in_parse_org_be_textbe_st_textst_SecondaryRelation7481 = new BitSet(new long[]{0x00000000000000D2L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_be_textbe_st_textst_SecondaryRelation7555 = new BitSet(new long[]{0x00000000000000D2L});
    public static final BitSet FOLLOW_TEXT2_in_parse_org_be_textbe_st_textst_SecondaryRelation7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_parse_org_be_textbe_st_textst_SecondaryRelation7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_parse_org_be_textbe_st_textst_SecondaryRelation7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_RelatedToNode_in_parse_org_be_textbe_st_textst_AbstractNode7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_DefinedByNode_in_parse_org_be_textbe_st_textst_AbstractNode7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_Node_in_parse_org_be_textbe_st_textst_AbstractNode7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_ParallelBlock_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_AlternativeBlock_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_RelatedToNode_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_DefinedByNode_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_Node_in_parse_org_be_textbe_st_textst_AbstractBlockOrNode7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_ComponentList_in_synpred3_St194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred7_St582 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_TEXT2_in_synpred12_St749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred12_St814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred12_St879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred12_St944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT2_in_synpred19_St1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred19_St1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred19_St1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred19_St1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred26_St2115 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_TEXT2_in_synpred31_St2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred31_St2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred31_St2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred31_St2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT2_in_synpred38_St2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred38_St3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred38_St3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred38_St3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred45_St3634 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_TEXT2_in_synpred50_St3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred50_St3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred50_St3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred50_St3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT2_in_synpred57_St4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred57_St4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred57_St4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred57_St4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred68_St5544 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_Component_in_synpred68_St5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred75_St5782 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_REQUIREMENT_in_synpred75_St5812 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMPONENT_in_synpred75_St5850 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_TEXT2_in_synpred75_St5888 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_synpred75_St5931 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_be_textbe_st_textst_SecondaryRelation_in_synpred75_St5964 = new BitSet(new long[]{0x0000000020000102L});
    public static final BitSet FOLLOW_NUMBER_in_synpred91_St7355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred93_St7355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred93_St7419 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_UPPERBOUND_in_synpred93_St7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred93_St7555 = new BitSet(new long[]{0x0000000000000002L});

}