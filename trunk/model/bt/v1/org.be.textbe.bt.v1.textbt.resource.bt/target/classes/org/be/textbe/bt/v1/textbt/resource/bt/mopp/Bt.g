grammar Bt;

options {
	superClass = BtANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.be.textbe.bt.v1.textbt.resource.bt.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
	}
}
@header{
	package org.be.textbe.bt.v1.textbt.resource.bt.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_0, 0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_be_textbe_bt_v1_textbt_Specification{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_be_textbe_bt_v1_textbt_Specification returns [org.be.textbe.bt.v1.textbt.Specification element = null]
@init{
}
:
	a0 = '#RT' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSpecification();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_1, 1, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_0);
	}
	
	(
		(
			a1_0 = parse_org_be_textbe_bt_v1_textbt_Requirement			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_1, 2, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_0);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 2, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 2, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a2_0 = parse_org_be_textbe_bt_v1_textbt_Component			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 3, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 3, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_4, 3);
	}
	
	(
		(
			a3 = '#T' {
				if (element == null) {
					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSpecification();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_0_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 4, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_2);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 4, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_2);
			}
			
			(
				a4_0 = parse_org_be_textbe_bt_v1_textbt_Sequence				{
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
			)
			{
				// expected elements (follow set)
			}
			
		)
		
	)?	{
		// expected elements (follow set)
	}
	
;

parse_org_be_textbe_bt_v1_textbt_Requirement returns [org.be.textbe.bt.v1.textbt.Requirement element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_7, 7);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_1, 8, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_0);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_2, 8, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_3, 8, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_1);
	}
	
;

parse_org_be_textbe_bt_v1_textbt_Component returns [org.be.textbe.bt.v1.textbt.Component element = null]
@init{
}
:
	a0 = '#C' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_8, 9);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_9, 10);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Behavior			{
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
		)
		
	)*	{
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
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_be_textbe_bt_v1_textbt_SystemComponent{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_be_textbe_bt_v1_textbt_SystemComponent returns [org.be.textbe.bt.v1.textbt.SystemComponent element = null]
@init{
}
:
	a0 = '#SC' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSystemComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_20, 13);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_21, 14);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Behavior			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Event returns [org.be.textbe.bt.v1.textbt.Event element = null]
@init{
}
:
	a0 = '#E' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createEvent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_22, 17);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_23, 18);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_be_textbe_bt_v1_textbt_InternalInput{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_be_textbe_bt_v1_textbt_ExternalInput{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_be_textbe_bt_v1_textbt_InternalOutput{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_be_textbe_bt_v1_textbt_ExternalOutput{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_be_textbe_bt_v1_textbt_InternalInput returns [org.be.textbe.bt.v1.textbt.InternalInput element = null]
@init{
}
:
	a0 = '#II' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalInput();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_30, 21);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_31, 22);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_ExternalInput returns [org.be.textbe.bt.v1.textbt.ExternalInput element = null]
@init{
}
:
	a0 = '#EI' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalInput();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_32, 25);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_33, 26);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_InternalOutput returns [org.be.textbe.bt.v1.textbt.InternalOutput element = null]
@init{
}
:
	a0 = '#IO' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInternalOutput();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_34, 29);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_35, 30);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_ExternalOutput returns [org.be.textbe.bt.v1.textbt.ExternalOutput element = null]
@init{
}
:
	a0 = '#EO' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createExternalOutput();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_36, 33);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_37, 34);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_StateRealization returns [org.be.textbe.bt.v1.textbt.StateRealization element = null]
@init{
}
:
	a0 = '#S' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_38, 37);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_39, 38);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3 = '[' {
				if (element == null) {
					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_41, 40);
			}
			
			(
				a4 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_42, 41);
			}
			
			a5 = ']' {
				if (element == null) {
					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createStateRealization();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_9_0_0_6_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
			}
			{
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
			
		)
		
	)?	{
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
	
	(
		(
			a6_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_AttributeRealization returns [org.be.textbe.bt.v1.textbt.AttributeRealization element = null]
@init{
}
:
	a0 = '#AR' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAttributeRealization();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_10_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_43, 45);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_44, 46);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Selection returns [org.be.textbe.bt.v1.textbt.Selection element = null]
@init{
}
:
	a0 = '#L' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createSelection();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_45, 49);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_46, 50);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Guard returns [org.be.textbe.bt.v1.textbt.Guard element = null]
@init{
}
:
	a0 = '#G' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createGuard();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_12_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_47, 53);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_48, 54);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Assertion returns [org.be.textbe.bt.v1.textbt.Assertion element = null]
@init{
}
:
	a0 = '#A' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAssertion();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_13_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_49, 57);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_50, 58);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a3_0 = parse_org_be_textbe_bt_v1_textbt_Relation			{
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
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_What returns [org.be.textbe.bt.v1.textbt.What element = null]
@init{
}
:
	a0 = '#R' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_51, 61);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_52, 61);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_53, 61);
	}
	
	(
		(
			a1 = '/' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_52, 62);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_53, 62);
	}
	
	(
		(
			a4 = '/' {
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
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_52, 63);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_53, 63);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_52, 64);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_53, 64);
	}
	
	a5 = 'What' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_54, 65);
	}
	
	(
		a6 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			(
				a7 = TEXT				
				{
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
			)
			{
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
			
			
			|			a8 = '/' {
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
			{
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
			
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Who returns [org.be.textbe.bt.v1.textbt.Who element = null]
@init{
}
:
	a0 = '#R' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_57, 70);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_58, 70);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_59, 70);
	}
	
	(
		(
			a1 = '/' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_58, 71);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_59, 71);
	}
	
	(
		(
			a4 = '/' {
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
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_58, 72);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_59, 72);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_58, 73);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_59, 73);
	}
	
	a5 = 'Who' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_60, 74);
	}
	
	(
		a6 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			(
				a7 = TEXT				
				{
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
			)
			{
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
			
			
			|			a8 = '/' {
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
			{
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
			
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Why returns [org.be.textbe.bt.v1.textbt.Why element = null]
@init{
}
:
	a0 = '#R' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_63, 79);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_64, 79);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_65, 79);
	}
	
	(
		(
			a1 = '/' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_64, 80);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_65, 80);
	}
	
	(
		(
			a4 = '/' {
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
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_64, 81);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_65, 81);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_64, 82);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_65, 82);
	}
	
	a5 = 'Why' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_66, 83);
	}
	
	(
		a6 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			(
				a7 = TEXT				
				{
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
			)
			{
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
			
			
			|			a8 = '/' {
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
			{
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
			
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_How returns [org.be.textbe.bt.v1.textbt.How element = null]
@init{
}
:
	a0 = '#R' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_69, 88);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_70, 88);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_71, 88);
	}
	
	(
		(
			a1 = '/' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_70, 89);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_71, 89);
	}
	
	(
		(
			a4 = '/' {
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
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_70, 90);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_71, 90);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_70, 91);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_71, 91);
	}
	
	a5 = 'How' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_72, 92);
	}
	
	(
		a6 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			(
				a7 = TEXT				
				{
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
			)
			{
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
			
			
			|			a8 = '/' {
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
			{
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
			
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Where returns [org.be.textbe.bt.v1.textbt.Where element = null]
@init{
}
:
	a0 = '#R' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_75, 97);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_76, 97);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_77, 97);
	}
	
	(
		(
			a1 = '/' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_76, 98);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_77, 98);
	}
	
	(
		(
			a4 = '/' {
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
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_76, 99);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_77, 99);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_76, 100);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_77, 100);
	}
	
	a5 = 'Where' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_78, 101);
	}
	
	(
		a6 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			(
				a7 = TEXT				
				{
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
			)
			{
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
			
			
			|			a8 = '/' {
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
			{
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
			
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_When returns [org.be.textbe.bt.v1.textbt.When element = null]
@init{
}
:
	a0 = '#R' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_81, 106);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_82, 106);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_83, 106);
	}
	
	(
		(
			a1 = '/' {
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
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_82, 107);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_83, 107);
	}
	
	(
		(
			a4 = '/' {
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
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_82, 108);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_83, 108);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_82, 109);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_83, 109);
	}
	
	a5 = 'When' {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_84, 110);
	}
	
	(
		a6 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			(
				a7 = TEXT				
				{
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
			)
			{
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
			
			
			|			a8 = '/' {
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
			{
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
			
		)
		
	)*	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Atomic returns [org.be.textbe.bt.v1.textbt.Atomic element = null]
@init{
}
:
	a0 = '{' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_87, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_92, 115, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
	}
	
	(
		a1_0 = parse_org_be_textbe_bt_v1_textbt_Node		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 116);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 116, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 116, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 116, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 116);
	}
	
	(
		(
			a2 = ';;' {
				if (element == null) {
					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_87, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_92, 117, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
			}
			
			(
				a3_0 = parse_org_be_textbe_bt_v1_textbt_Node				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 118);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 118, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 118, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 118, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 118);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_93, 119);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 119, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 119, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 119, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 119);
	}
	
	(
		(
			a4_0 = parse_org_be_textbe_bt_v1_textbt_Interleaving			{
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
			|			a4_1 = parse_org_be_textbe_bt_v1_textbt_Alternative			{
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
			|			a4_2 = parse_org_be_textbe_bt_v1_textbt_Parallel			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_96, 120);
	}
	
	a5 = '}' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAtomic();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_20_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 121);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 121, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 121, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 121, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 121, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 121);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 121);
	}
	
;

parse_org_be_textbe_bt_v1_textbt_Interleaving returns [org.be.textbe.bt.v1.textbt.Interleaving element = null]
@init{
}
:
	a0 = '{' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_87, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_92, 122, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
	}
	
	(
		a1_0 = parse_org_be_textbe_bt_v1_textbt_Node		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 123);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 123, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 123, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 123, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 123, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 123);
	}
	
	(
		(
			a2 = ';' {
				if (element == null) {
					element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_87, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_92, 124, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_5);
			}
			
			(
				a3_0 = parse_org_be_textbe_bt_v1_textbt_Node				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 125);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 125, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 125, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 125, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 125, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 125);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_100, 126);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 126, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 126, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 126, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 126, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 126);
	}
	
	(
		(
			a4_0 = parse_org_be_textbe_bt_v1_textbt_Sequence			{
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
			|			a4_1 = parse_org_be_textbe_bt_v1_textbt_Alternative			{
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
			|			a4_2 = parse_org_be_textbe_bt_v1_textbt_Parallel			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_97, 127);
	}
	
	a5 = '}' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createInterleaving();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_21_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Alternative returns [org.be.textbe.bt.v1.textbt.Alternative element = null]
@init{
}
:
	a0 = '#N' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAlternative();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_22_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_101, 129);
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAlternative();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_22_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 130, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 130, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 130, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 130, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
	}
	
	(
		a2_0 = parse_org_be_textbe_bt_v1_textbt_BehaviorTree		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 131, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 131, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 131, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 131, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 131);
	}
	
	(
		(
			(
				a3_0 = parse_org_be_textbe_bt_v1_textbt_BehaviorTree				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 132, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 132, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 132, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 132, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 132);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 133, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 133, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 133, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 133, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_98, 133);
	}
	
	a4 = '}' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createAlternative();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_22_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Parallel returns [org.be.textbe.bt.v1.textbt.Parallel element = null]
@init{
}
:
	a0 = '#P' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createParallel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_23_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_102, 135);
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createParallel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_23_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 136, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 136, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 136, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 136, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
	}
	
	(
		a2_0 = parse_org_be_textbe_bt_v1_textbt_BehaviorTree		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 137, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 137, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 137, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 137, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 137);
	}
	
	(
		(
			(
				a3_0 = parse_org_be_textbe_bt_v1_textbt_BehaviorTree				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 138, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 138, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 138, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 138, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 138);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_5, 139, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_6, 139, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_94, 139, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_95, 139, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_9);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_99, 139);
	}
	
	a4 = '}' {
		if (element == null) {
			element = org.be.textbe.bt.v1.textbt.TextbtFactory.eINSTANCE.createParallel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtGrammarInformationProvider.BT_23_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_Node returns [org.be.textbe.bt.v1.textbt.Node element = null]
@init{
}
:
	(
		(
			a0 = '\'' {
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
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_103, 141);
			}
			
			(
				a1 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_104, 142);
			}
			
			a2 = '\'' {
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
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 143);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 143, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 143, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
				addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 143);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_88, 144);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 144, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 144, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 144);
	}
	
	(
		(
			(
				a3 = 'show' {
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
				|				a4 = 'hide' {
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
			)
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 145, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 145, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 145);
	}
	
	(
		(
			a6_0 = parse_org_be_textbe_bt_v1_textbt_TraceabilityLink			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 146);
		}
		
		(
			a7 = TEXT			
			{
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
		)
		{
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
		
	)
	{
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
	
	
	|	a8 = '_' {
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
	{
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
	
	(
		(
			(
				a9 = '^' {
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
				|				a10 = '=' {
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
				|				a11 = '=>' {
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
				|				a12 = '--' {
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
				|				a13 = '\u0025' {
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
				|				a14 = '^^' {
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
				|				a15 = 'XOR' {
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
				|				a16 = '|' {
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
				|				a17 = '&' {
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
			)?		)
		
	)?	{
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
	
;

parse_org_be_textbe_bt_v1_textbt_TraceabilityLink returns [org.be.textbe.bt.v1.textbt.TraceabilityLink element = null]
@init{
}
:
	(
		(
			a0 = TEXT			
			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_89, 151);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_90, 151);
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 151);
	}
	
	(
		(
			(
				a1 = '+' {
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
				|				a2 = '-' {
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
				|				a3 = '++' {
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
				|				a4 = '--' {
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
				|				a5 = '+-' {
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
			)?		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFollowSetProvider.TERMINAL_91, 152);
	}
	
;

parse_org_be_textbe_bt_v1_textbt_Sequence returns [org.be.textbe.bt.v1.textbt.Sequence element = null]
:
	c0 = parse_org_be_textbe_bt_v1_textbt_Atomic{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_be_textbe_bt_v1_textbt_Interleaving{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_be_textbe_bt_v1_textbt_Behavior returns [org.be.textbe.bt.v1.textbt.Behavior element = null]
:
	c0 = parse_org_be_textbe_bt_v1_textbt_Event{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_be_textbe_bt_v1_textbt_InternalInput{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_be_textbe_bt_v1_textbt_ExternalInput{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_be_textbe_bt_v1_textbt_InternalOutput{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_be_textbe_bt_v1_textbt_ExternalOutput{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_be_textbe_bt_v1_textbt_StateRealization{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_be_textbe_bt_v1_textbt_AttributeRealization{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_be_textbe_bt_v1_textbt_Selection{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_org_be_textbe_bt_v1_textbt_Guard{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_org_be_textbe_bt_v1_textbt_Assertion{ element = c9; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_be_textbe_bt_v1_textbt_Relation returns [org.be.textbe.bt.v1.textbt.Relation element = null]
:
	c0 = parse_org_be_textbe_bt_v1_textbt_What{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_be_textbe_bt_v1_textbt_Who{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_be_textbe_bt_v1_textbt_Why{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_be_textbe_bt_v1_textbt_How{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_be_textbe_bt_v1_textbt_Where{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_be_textbe_bt_v1_textbt_When{ element = c5; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_be_textbe_bt_v1_textbt_BehaviorTree returns [org.be.textbe.bt.v1.textbt.BehaviorTree element = null]
:
	c0 = parse_org_be_textbe_bt_v1_textbt_Atomic{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_be_textbe_bt_v1_textbt_Interleaving{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_be_textbe_bt_v1_textbt_Alternative{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_be_textbe_bt_v1_textbt_Parallel{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;

