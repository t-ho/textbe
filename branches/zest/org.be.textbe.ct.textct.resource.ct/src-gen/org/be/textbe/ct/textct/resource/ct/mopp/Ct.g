grammar Ct;

options {
	superClass = CtANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.be.textbe.ct.textct.resource.ct.mopp;
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
	package org.be.textbe.ct.textct.resource.ct.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_0, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_0);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_1, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 0, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_be_textbe_ct_textct_TextCT{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_be_textbe_ct_textct_TextCT returns [org.be.textbe.ct.textct.TextCT element = null]
@init{
}
:
	(
		(
			a0_0 = parse_org_be_textbe_ct_textct_OptionList			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_1, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 1, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a1_0 = parse_org_be_textbe_ct_textct_RequirementList			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 2, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 2, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 2, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 2, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a2_0 = parse_org_be_textbe_ct_textct_ComponentList			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 3, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
	(
		a3_0 = parse_org_be_textbe_ct_textct_CompositionTree		{
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
	)
	{
		// expected elements (follow set)
	}
	
;

parse_org_be_textbe_ct_textct_CompositionTree returns [org.be.textbe.ct.textct.CompositionTree element = null]
@init{
}
:
	a0 = '#T' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createCompositionTree();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 5, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_4);
	}
	
	(
		a1_0 = parse_org_be_textbe_ct_textct_Node		{
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
	)
	{
		// expected elements (follow set)
	}
	
;

parse_org_be_textbe_ct_textct_AggregatedNode returns [org.be.textbe.ct.textct.AggregatedNode element = null]
@init{
}
:
	a0 = '<' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedNode();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_8, 7);
	}
	
	(
		a1 = COMPONENT		
		{
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
	)
	{
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
	
	(
		(
			(
				(
					a2_0 = parse_org_be_textbe_ct_textct_AbstractBlockOrNode					{
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
				)
				
			)+			{
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
			
		)
		
	)?	{
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
	
;

parse_org_be_textbe_ct_textct_AssociatedNode returns [org.be.textbe.ct.textct.AssociatedNode element = null]
@init{
}
:
	a0 = '>' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedNode();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_17, 11);
	}
	
	(
		a1 = COMPONENT		
		{
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
	)
	{
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
	
	(
		(
			(
				(
					a2_0 = parse_org_be_textbe_ct_textct_AbstractBlockOrNode					{
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
				)
				
			)+			{
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
			
		)
		
	)?	{
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
	
;

parse_org_be_textbe_ct_textct_InheritedNode returns [org.be.textbe.ct.textct.InheritedNode element = null]
@init{
}
:
	a0 = '<=' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedNode();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_18, 15);
	}
	
	(
		a1 = COMPONENT		
		{
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
	)
	{
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
	
	(
		(
			(
				(
					a2_0 = parse_org_be_textbe_ct_textct_AbstractBlockOrNode					{
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
				)
				
			)+			{
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
			
		)
		
	)?	{
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
	
;

parse_org_be_textbe_ct_textct_AggregatedBlock returns [org.be.textbe.ct.textct.AggregatedBlock element = null]
@init{
}
:
	a0 = '<' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_19, 19);
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 20, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 20, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 20, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 20, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
	}
	
	(
		(
			a2_0 = parse_org_be_textbe_ct_textct_AbstractNode			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 21, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 21, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 21, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 21, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_14, 21);
	}
	
	a3 = '}' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAggregatedBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_5_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
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
	
;

parse_org_be_textbe_ct_textct_AssociatedBlock returns [org.be.textbe.ct.textct.AssociatedBlock element = null]
@init{
}
:
	a0 = '>' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_20, 23);
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 24, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 24, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 24, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 24, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
	}
	
	(
		(
			a2_0 = parse_org_be_textbe_ct_textct_AbstractNode			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 25, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 25, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 25, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 25, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_15, 25);
	}
	
	a3 = '}' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createAssociatedBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_6_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
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
	
;

parse_org_be_textbe_ct_textct_InheritedBlock returns [org.be.textbe.ct.textct.InheritedBlock element = null]
@init{
}
:
	a0 = '<=' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_21, 27);
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_7_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 28, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 28, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 28, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 28, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
	}
	
	(
		(
			a2_0 = parse_org_be_textbe_ct_textct_AbstractNode			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_7, 29, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_9, 29, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_10, 29, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_6, 29, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_6);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_16, 29);
	}
	
	a3 = '}' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createInheritedBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_7_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
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
	
;

parse_org_be_textbe_ct_textct_Node returns [org.be.textbe.ct.textct.Node element = null]
@init{
}
:
	(
		a0 = COMPONENT		
		{
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
	)
	{
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
	
	(
		(
			(
				(
					a1_0 = parse_org_be_textbe_ct_textct_AbstractBlockOrNode					{
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
				)
				
			)+			{
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
			
		)
		
	)?	{
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
	
;

parse_org_be_textbe_ct_textct_OptionList returns [org.be.textbe.ct.textct.OptionList element = null]
@init{
}
:
	a0 = '#OPTIONS' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createOptionList();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_22, 34, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_7);
	}
	
	(
		(
			a1_0 = parse_org_be_textbe_ct_textct_Option			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_22, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_1, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 35, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_ct_textct_Option returns [org.be.textbe.ct.textct.Option element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_23, 36);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createOption();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_10_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_24, 37);
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_22, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_1, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 38, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_ct_textct_RequirementList returns [org.be.textbe.ct.textct.RequirementList element = null]
@init{
}
:
	a0 = '#RT' {
		if (element == null) {
			element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createRequirementList();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 39, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
	}
	
	(
		(
			a1_0 = parse_org_be_textbe_ct_textct_Requirement			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 40, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_ct_textct_Requirement returns [org.be.textbe.ct.textct.Requirement element = null]
@init{
}
:
	(
		a0 = REQUIREMENT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_26, 41);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_27, 41);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_28, 41);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_29, 41);
	}
	
	(
		(
			a1 = BEHAVIOR			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 42, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a2 = REQUIREMENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 43, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a3 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 44, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a4 = COMPONENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 45, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_25, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 46, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_ct_textct_ComponentList returns [org.be.textbe.ct.textct.ComponentList element = null]
@init{
}
:
	(
		(
			a0 = '#C' {
				if (element == null) {
					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponentList();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_13_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_30, 47, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_31, 47, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
			}
			
			(
				a1_0 = parse_org_be_textbe_ct_textct_Component				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 48);
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 48);
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 48);
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 48, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 49);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 49);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 49);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 49, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a2 = '#SC' {
				if (element == null) {
					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponentList();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_13_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_31, 50, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
			}
			
			(
				a3_0 = parse_org_be_textbe_ct_textct_SystemComponent				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 51);
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 51, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 52);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 52, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a4 = '#C' {
				if (element == null) {
					element = org.be.textbe.ct.textct.TextctFactory.eINSTANCE.createComponentList();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.ct.textct.resource.ct.grammar.CtGrammarInformationProvider.CT_13_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_30, 53, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_31, 53, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_9);
			}
			
			(
				a5_0 = parse_org_be_textbe_ct_textct_Component				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 54);
				addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 54, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 55);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 55, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_ct_textct_Component returns [org.be.textbe.ct.textct.Component element = null]
@init{
}
:
	(
		a0 = COMPONENT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_32, 56);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_33, 56);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_34, 56);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_35, 56);
	}
	
	(
		(
			a1 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 57);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 57);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 57);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 57, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a2 = COMPONENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 58);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 58);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 58);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 58, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a3 = COMPONENTNAME			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 59);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 59);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 59);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 59, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a4 = REQUIREMENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 60);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 60);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 60);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 60, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 61);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 61);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 61);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 61, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_be_textbe_ct_textct_SystemComponent{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_be_textbe_ct_textct_SystemComponent returns [org.be.textbe.ct.textct.SystemComponent element = null]
@init{
}
:
	(
		a0 = COMPONENT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_36, 62);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_37, 62);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_38, 62);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_39, 62);
	}
	
	(
		(
			a1 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 63);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 63);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 63);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 63, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a2 = COMPONENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 64);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 64);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 64);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 64, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a3 = COMPONENTNAME			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 65);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 65);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 65);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 65, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a4 = REQUIREMENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 66);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 66);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 66);
			addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 66, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_2, 67);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_3, 67);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_4, 67);
		addExpectedElement(org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.TERMINAL_5, 67, org.be.textbe.ct.textct.resource.ct.grammar.CtFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_ct_textct_AbstractBlockOrNode returns [org.be.textbe.ct.textct.AbstractBlockOrNode element = null]
:
	c0 = parse_org_be_textbe_ct_textct_AggregatedNode{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_be_textbe_ct_textct_AssociatedNode{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_be_textbe_ct_textct_InheritedNode{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_be_textbe_ct_textct_AggregatedBlock{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_be_textbe_ct_textct_AssociatedBlock{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_be_textbe_ct_textct_InheritedBlock{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_be_textbe_ct_textct_Node{ element = c6; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_be_textbe_ct_textct_AbstractNode returns [org.be.textbe.ct.textct.AbstractNode element = null]
:
	c0 = parse_org_be_textbe_ct_textct_AggregatedNode{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_be_textbe_ct_textct_AssociatedNode{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_be_textbe_ct_textct_InheritedNode{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_be_textbe_ct_textct_Node{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

PERCENT:
	('%')
	{ _channel = 99; }
;
DOUBLEMINUS:
	('--')
	{ _channel = 99; }
;
EQUALS:
	'=';
VALIDITY:
	('+'|'-'|'+-'|'++')
	{ _channel = 99; }
;
MCI:
	('\u007C\u007C'|'[]'|'%+')
	{ _channel = 99; }
;
COMPONENT:
	('C'('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*)
;
REQUIREMENT:
	('R'('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-'|'.')*)
;
OPERATORWITHLABEL:
	(('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*'.'('^'|'=>'|'--'|'='|'^^'|'%'|'&'|'\u007C'|'XOR'))
	{ _channel = 99; }
;
STATE:
	(('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')+'['('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')+']')
	{ _channel = 99; }
;
OPERATOR:
	(('^'|'=>'|'^^'|'&'|'\u007C'|'XOR'))
	{ _channel = 99; }
;
QUALIFIER:
	(('Who'|'What'|'Where'|'When'|'Why'|'How'))
	{ _channel = 99; }
;
LEVEL:
	(('/')+)
	{ _channel = 99; }
;
COMPONENTNAME:
	(('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*('#'|'*'|'+')('0'..'9')*)
;
BEHAVIOR:
	((('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*('+'|'#'|'<'|'>'|'='|':'|'.'|'\u007C'|'('|')'|','|'/')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*)+)
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

