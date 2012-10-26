grammar St;

options {
	superClass = StANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.be.textbe.st.textst.resource.st.mopp;
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
	package org.be.textbe.st.textst.resource.st.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_0, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_0);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_1, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 0, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_be_textbe_st_textst_TextST{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_be_textbe_st_textst_TextST returns [org.be.textbe.st.textst.TextST element = null]
@init{
}
:
	(
		(
			a0_0 = parse_org_be_textbe_st_textst_OptionList			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_1, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 1, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a1_0 = parse_org_be_textbe_st_textst_RequirementList			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 2, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 2, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 2, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 2, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a2_0 = parse_org_be_textbe_st_textst_ComponentList			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 3, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
	(
		a3_0 = parse_org_be_textbe_st_textst_StructureTree		{
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
	)
	{
		// expected elements (follow set)
	}
	
;

parse_org_be_textbe_st_textst_StructureTree returns [org.be.textbe.st.textst.StructureTree element = null]
@init{
}
:
	a0 = '#ST' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createStructureTree();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 5, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_4);
	}
	
	(
		a1_0 = parse_org_be_textbe_st_textst_Node		{
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
	)
	{
		// expected elements (follow set)
	}
	
;

parse_org_be_textbe_st_textst_ParallelBlock returns [org.be.textbe.st.textst.ParallelBlock element = null]
@init{
}
:
	a0 = '#P{' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createParallelBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 7);
	}
	
	(
		(
			a1 = '#' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createParallelBlock();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_2_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 8, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
			}
			
			(
				a2_0 = parse_org_be_textbe_st_textst_AbstractNode				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 9);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 9);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 10);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 10);
	}
	
	a3 = '}' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createParallelBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 11);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 11);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 11);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 11);
	}
	
;

parse_org_be_textbe_st_textst_AlternativeBlock returns [org.be.textbe.st.textst.AlternativeBlock element = null]
@init{
}
:
	a0 = '#N{' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createAlternativeBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 12);
	}
	
	(
		(
			a1 = '#' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createAlternativeBlock();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_3_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_13, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_14, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 13, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_5);
			}
			
			(
				a2_0 = parse_org_be_textbe_st_textst_AbstractNode				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 14);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 14);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 15);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 15);
	}
	
	a3 = '}' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createAlternativeBlock();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 16);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 16);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 16);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 16);
	}
	
;

parse_org_be_textbe_st_textst_RelatedToNode returns [org.be.textbe.st.textst.RelatedToNode element = null]
@init{
}
:
	a0 = '>' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_19, 17);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_20, 17);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_21, 17);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_22, 17);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_23, 17);
	}
	
	(
		(
			(
				(
					a1 = REQUIREMENT					
					{
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
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_19, 18);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_20, 18);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_21, 18);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_22, 18);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_23, 18);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_20, 19);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_21, 19);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_22, 19);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_23, 19);
	}
	
	(
		(
			a2 = VALIDITY			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_21, 20);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_22, 20);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_23, 20);
	}
	
	(
		(
			(
				a3 = COMPONENT				
				{
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
			)
			{
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
			
			(
				(
					(
						a4 = TEXT2						
						{
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
					)
					{
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
					
					
					|					(
						a5 = NUMBER						
						{
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
					)
					{
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
					
					
					|					(
						a6 = COMPONENT						
						{
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
					)
					{
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
					
					
					|					(
						a7 = REQUIREMENT						
						{
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
					)
					{
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
					
				)
				
			)?			{
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
			
			(
				(
					(
						a8 = QUALIFIER						
						{
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
					)
					{
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
					
					
					|					(
						(
							a9 = QUALIFIER							
							{
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
						)
						{
							// expected elements (follow set)
							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_31, 28);
						}
						
						(
							a10 = QUALIFIER							
							{
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
						)
						{
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
						
					)
					{
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
					
				)
				
			)?			{
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
			
		)
		{
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
		
		
		|		(
			(
				a11 = MCI				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_32, 33);
			}
			
			(
				a12 = COMPONENT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_33, 34);
			}
			
			a13 = ':' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_1_0_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_34, 35);
			}
			
			(
				a14 = COMPONENT				
				{
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
			)
			{
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
			
			(
				(
					(
						a15 = TEXT2						
						{
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
					)
					{
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
					
					
					|					(
						a16 = NUMBER						
						{
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
					)
					{
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
					
					
					|					(
						a17 = COMPONENT						
						{
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
					)
					{
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
					
					
					|					(
						a18 = REQUIREMENT						
						{
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
					)
					{
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
					
				)
				
			)?			{
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
			
			(
				(
					(
						a19 = QUALIFIER						
						{
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
					)
					{
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
					
					
					|					(
						(
							a20 = QUALIFIER							
							{
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
						)
						{
							// expected elements (follow set)
							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_41, 43);
						}
						
						(
							a21 = QUALIFIER							
							{
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
						)
						{
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
						
					)
					{
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
					
				)
				
			)?			{
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
			
		)
		{
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
		
		
		|		a22 = '_' {
			if (element == null) {
				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRelatedToNode();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_4_0_0_3_0_2_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a22, element);
		}
		{
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
		
	)
	{
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
	
	(
		(
			a23 = OPERATOR			
			{
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
		)
		
	)?	{
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
	
	(
		(
			a24_0 = parse_org_be_textbe_st_textst_AbstractBlockOrNode			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 51);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 51);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 51);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 51);
	}
	
;

parse_org_be_textbe_st_textst_DefinedByNode returns [org.be.textbe.st.textst.DefinedByNode element = null]
@init{
}
:
	a0 = '<' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_42, 52);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_43, 52);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_44, 52);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_45, 52);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_46, 52);
	}
	
	(
		(
			(
				(
					a1 = REQUIREMENT					
					{
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
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_42, 53);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_43, 53);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_44, 53);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_45, 53);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_46, 53);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_43, 54);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_44, 54);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_45, 54);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_46, 54);
	}
	
	(
		(
			a2 = VALIDITY			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_44, 55);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_45, 55);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_46, 55);
	}
	
	(
		(
			(
				a3 = COMPONENT				
				{
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
			)
			{
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
			
			(
				(
					(
						a4 = TEXT2						
						{
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
					)
					{
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
					
					
					|					(
						a5 = NUMBER						
						{
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
					)
					{
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
					
					
					|					(
						a6 = COMPONENT						
						{
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
					)
					{
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
					
					
					|					(
						a7 = REQUIREMENT						
						{
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
					)
					{
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
					
				)
				
			)?			{
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
			
			(
				(
					(
						a8 = QUALIFIER						
						{
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
					)
					{
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
					
					
					|					(
						(
							a9 = QUALIFIER							
							{
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
						)
						{
							// expected elements (follow set)
							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_54, 63);
						}
						
						(
							a10 = QUALIFIER							
							{
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
						)
						{
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
						
					)
					{
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
					
				)
				
			)?			{
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
			
		)
		{
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
		
		
		|		(
			(
				a11 = MCI				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_55, 68);
			}
			
			(
				a12 = COMPONENT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_56, 69);
			}
			
			a13 = ':' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_1_0_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_57, 70);
			}
			
			(
				a14 = COMPONENT				
				{
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
			)
			{
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
			
			(
				(
					(
						a15 = TEXT2						
						{
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
					)
					{
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
					
					
					|					(
						a16 = NUMBER						
						{
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
					)
					{
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
					
					
					|					(
						a17 = COMPONENT						
						{
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
					)
					{
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
					
					
					|					(
						a18 = REQUIREMENT						
						{
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
					)
					{
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
					
				)
				
			)?			{
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
			
			(
				(
					(
						a19 = QUALIFIER						
						{
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
					)
					{
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
					
					
					|					(
						(
							a20 = QUALIFIER							
							{
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
						)
						{
							// expected elements (follow set)
							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_64, 78);
						}
						
						(
							a21 = QUALIFIER							
							{
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
						)
						{
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
						
					)
					{
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
					
				)
				
			)?			{
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
			
		)
		{
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
		
		
		|		a22 = '_' {
			if (element == null) {
				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createDefinedByNode();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_5_0_0_3_0_2_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a22, element);
		}
		{
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
		
	)
	{
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
	
	(
		(
			a23 = OPERATOR			
			{
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
		)
		
	)?	{
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
	
	(
		(
			a24_0 = parse_org_be_textbe_st_textst_AbstractBlockOrNode			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 86);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 86);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 86);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 86);
	}
	
;

parse_org_be_textbe_st_textst_Node returns [org.be.textbe.st.textst.Node element = null]
@init{
}
:
	(
		(
			(
				(
					a0 = REQUIREMENT					
					{
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
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_6, 87);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 87);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 87);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 87);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 87);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_7, 88);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 88);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 88);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 88);
	}
	
	(
		(
			a1 = VALIDITY			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_8, 89);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_9, 89);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_10, 89);
	}
	
	(
		(
			(
				a2 = COMPONENT				
				{
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
			)
			{
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
			
			(
				(
					(
						a3 = TEXT2						
						{
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
					)
					{
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
					
					
					|					(
						a4 = NUMBER						
						{
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
					)
					{
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
					
					
					|					(
						a5 = COMPONENT						
						{
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
					)
					{
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
					
					
					|					(
						a6 = REQUIREMENT						
						{
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
					)
					{
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
					
				)
				
			)?			{
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
			
			(
				(
					(
						a7 = QUALIFIER						
						{
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
					)
					{
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
					
					
					|					(
						(
							a8 = QUALIFIER							
							{
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
						)
						{
							// expected elements (follow set)
							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_72, 97);
						}
						
						(
							a9 = QUALIFIER							
							{
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
						)
						{
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
						
					)
					{
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
					
				)
				
			)?			{
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
			
		)
		{
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
		
		
		|		(
			(
				a10 = MCI				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_73, 102);
			}
			
			(
				a11 = COMPONENT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_74, 103);
			}
			
			a12 = ':' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_1_0_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_75, 104);
			}
			
			(
				a13 = COMPONENT				
				{
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
			)
			{
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
			
			(
				(
					(
						a14 = TEXT2						
						{
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
					)
					{
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
					
					
					|					(
						a15 = NUMBER						
						{
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
					)
					{
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
					
					
					|					(
						a16 = COMPONENT						
						{
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
					)
					{
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
					
					
					|					(
						a17 = REQUIREMENT						
						{
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
					)
					{
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
					
				)
				
			)?			{
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
			
			(
				(
					(
						a18 = QUALIFIER						
						{
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
					)
					{
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
					
					
					|					(
						(
							a19 = QUALIFIER							
							{
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
						)
						{
							// expected elements (follow set)
							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_82, 112);
						}
						
						(
							a20 = QUALIFIER							
							{
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
						)
						{
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
						
					)
					{
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
					
				)
				
			)?			{
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
			
		)
		{
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
		
		
		|		a21 = '_' {
			if (element == null) {
				element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createNode();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_6_0_0_2_0_2_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a21, element);
		}
		{
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
		
	)
	{
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
	
	(
		(
			a22 = OPERATOR			
			{
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
		)
		
	)?	{
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
	
	(
		(
			a23_0 = parse_org_be_textbe_st_textst_AbstractBlockOrNode			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_12, 120);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_15, 120);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_16, 120);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_17, 120);
	}
	
;

parse_org_be_textbe_st_textst_OptionList returns [org.be.textbe.st.textst.OptionList element = null]
@init{
}
:
	a0 = '#OPTIONS' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createOptionList();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_83, 121, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_7);
	}
	
	(
		(
			a1_0 = parse_org_be_textbe_st_textst_Option			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_83, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_1, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 122, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_st_textst_Option returns [org.be.textbe.st.textst.Option element = null]
@init{
}
:
	(
		a0 = TEXT2		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_84, 123);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createOption();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_85, 124);
	}
	
	(
		a2 = TEXT2		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_83, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_7);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_1, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 125, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_st_textst_RequirementList returns [org.be.textbe.st.textst.RequirementList element = null]
@init{
}
:
	a0 = '#RT' {
		if (element == null) {
			element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createRequirementList();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 126, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
	}
	
	(
		(
			a1_0 = parse_org_be_textbe_st_textst_Requirement			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 127, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_st_textst_Requirement returns [org.be.textbe.st.textst.Requirement element = null]
@init{
}
:
	(
		a0 = REQUIREMENT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_87, 128);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_88, 128);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_89, 128);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_90, 128);
	}
	
	(
		(
			a1 = TEXT2			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 129, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a2 = NUMBER			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 130, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a3 = COMPONENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 131, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a4 = REQUIREMENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 132, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_86, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_8);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 133, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_st_textst_ComponentList returns [org.be.textbe.st.textst.ComponentList element = null]
@init{
}
:
	(
		(
			a0 = '#C' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponentList();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_11_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_91, 134, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_92, 134, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
			}
			
			(
				a1_0 = parse_org_be_textbe_st_textst_Component				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 135);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 135);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 135);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 135, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 136);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 136);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 136);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 136, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a2 = '#SC' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponentList();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_11_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_92, 137, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
			}
			
			(
				a3_0 = parse_org_be_textbe_st_textst_SystemComponent				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 138);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 138, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 139);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 139, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a4 = '#C' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponentList();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_11_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_91, 140, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_92, 140, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_9);
			}
			
			(
				a5_0 = parse_org_be_textbe_st_textst_Component				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 141);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 141, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 142);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 142, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_st_textst_Component returns [org.be.textbe.st.textst.Component element = null]
@init{
}
:
	(
		a0 = COMPONENT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_93, 143);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_94, 143);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_95, 143);
	}
	
	(
		(
			a1 = REQUIREMENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 144);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 144);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 144);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 144);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 144, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a2 = COMPONENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 145);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 145);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 145);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 145);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 145, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a3 = TEXT2			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 146);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 146);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 146);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 146);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 146, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 147);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 147);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 147);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 147);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 147, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a4 = '#SR' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createComponent();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_12_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 148, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
			}
			
			(
				(
					a5_0 = parse_org_be_textbe_st_textst_SecondaryRelation					{
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
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 149, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 149);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 149);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 149);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 149);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 149, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 150);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 150);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 150);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 150);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 150, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_be_textbe_st_textst_SystemComponent{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_be_textbe_st_textst_SystemComponent returns [org.be.textbe.st.textst.SystemComponent element = null]
@init{
}
:
	(
		a0 = COMPONENT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_98, 151);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_99, 151);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_100, 151);
	}
	
	(
		(
			a1 = REQUIREMENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 152);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 152);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 152);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 152);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 152, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a2 = COMPONENT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 153);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 153);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 153);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 153);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 153, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
		
		|		(
			a3 = TEXT2			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 154);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 154);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 154);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 154);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 154, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 155);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 155);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 155);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 155);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 155, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
	(
		(
			a4 = '#SR' {
				if (element == null) {
					element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSystemComponent();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_13_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 156, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
			}
			
			(
				(
					a5_0 = parse_org_be_textbe_st_textst_SecondaryRelation					{
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
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 157, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 157);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 157);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 157);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 157);
				addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 157, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 158);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 158);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 158);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 158);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 158, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
	}
	
;

parse_org_be_textbe_st_textst_SecondaryRelation returns [org.be.textbe.st.textst.SecondaryRelation element = null]
@init{
}
:
	(
		(
			a0 = NUMBER			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_102, 159);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 159);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 159);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 159);
		}
		
		(
			(
				a1 = '.' {
					if (element == null) {
						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
						incompleteObjects.push(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_1_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_106, 160);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_107, 160);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_108, 160);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_109, 160);
				}
				
				(
					(
						a2 = TEXT2						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 161);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 161);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 161);
					}
					
					
					|					(
						a3 = NUMBER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 162);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 162);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 162);
					}
					
					
					|					(
						a4 = COMPONENT						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 163);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 163);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 163);
					}
					
					
					|					(
						a5 = REQUIREMENT						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 164);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 164);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 164);
					}
					
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 165);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 165);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 165);
				}
				
			)
			
		)?		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_103, 166);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_104, 166);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 166);
		}
		
		(
			(
				(
					a6 = NUMBER					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 167);
				}
				
				
				|				(
					(
						a7 = NUMBER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_110, 168);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_111, 168);
					}
					
					(
						(
							a8 = UPPERBOUND							
							{
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
						)
						{
							// expected elements (follow set)
							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 169);
						}
						
						
						|						(
							a9 = NUMBER							
							{
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
						)
						{
							// expected elements (follow set)
							addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 170);
						}
						
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 171);
					}
					
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 172);
				}
				
			)
			
		)?		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_105, 173);
		}
		
		(
			a10 = COMPONENT			
			{
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
		)
		{
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
		
		(
			(
				a11 = '.' {
					if (element == null) {
						element = org.be.textbe.st.textst.TextstFactory.eINSTANCE.createSecondaryRelation();
						incompleteObjects.push(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.be.textbe.st.textst.resource.st.grammar.StGrammarInformationProvider.ST_14_0_0_0_0_0_4_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_118, 175);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_119, 175);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_120, 175);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_121, 175);
				}
				
				(
					(
						a12 = TEXT2						
						{
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
					)
					{
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
					
					
					|					(
						a13 = NUMBER						
						{
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
					)
					{
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
					
					
					|					(
						a14 = COMPONENT						
						{
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
					)
					{
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
					
					
					|					(
						a15 = REQUIREMENT						
						{
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
					)
					{
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
					
				)
				{
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
				
			)
			
		)?		{
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
		
		(
			(
				(
					a16 = NUMBER					
					{
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
				)
				{
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
				
				
				|				(
					(
						a17 = NUMBER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_122, 183);
						addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_123, 183);
					}
					
					(
						(
							a18 = UPPERBOUND							
							{
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
						)
						{
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
						
						
						|						(
							a19 = NUMBER							
							{
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
						)
						{
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
						
					)
					{
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
					
				)
				{
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
				
			)
			
		)?		{
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
		
		(
			(
				(
					a20 = TEXT2					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 189, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 189);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 189);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 189);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 189);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 189, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 189);
				}
				
				
				|				(
					a21 = COMPONENT					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 190, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 190);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 190);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 190);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 190);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 190, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 190);
				}
				
				
				|				(
					a22 = REQUIREMENT					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 191, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 191);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 191);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 191);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 191);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 191, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
					addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 191);
				}
				
			)
			
		)?		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 192, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 192);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 192);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 192);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 192);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 192, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
			addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 192);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_97, 193, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_10);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_96, 193);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_2, 193);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_3, 193);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_4, 193);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_5, 193, org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.FEATURE_3);
		addExpectedElement(org.be.textbe.st.textst.resource.st.grammar.StFollowSetProvider.TERMINAL_101, 193);
	}
	
;

parse_org_be_textbe_st_textst_AbstractNode returns [org.be.textbe.st.textst.AbstractNode element = null]
:
	c0 = parse_org_be_textbe_st_textst_RelatedToNode{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_be_textbe_st_textst_DefinedByNode{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_be_textbe_st_textst_Node{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_be_textbe_st_textst_AbstractBlockOrNode returns [org.be.textbe.st.textst.AbstractBlockOrNode element = null]
:
	c0 = parse_org_be_textbe_st_textst_ParallelBlock{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_be_textbe_st_textst_AlternativeBlock{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_be_textbe_st_textst_RelatedToNode{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_be_textbe_st_textst_DefinedByNode{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_be_textbe_st_textst_Node{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

OPERATOR:
	(('^'|'=>'|'^^'))
;
VALIDITY:
	('+'|'-'|'+-'|'++'|'--')
;
QUALIFIER:
	('?'|'\u0021'|'\u007E')
;
MCI:
	('\u007C\u007C'|'[]'|'%+'|'%')
;
COMPONENT:
	('C'('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-')*)
;
REQUIREMENT:
	('R'('0'..'9'|'a'..'z'|'A'..'Z')+('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'-'|'.')*)
;
NUMBER:
	(('0'..'9')+)
;
UPPERBOUND:
	((('0'..'9')+|'*')+)
;
TEXT2:
	(('\u0024')?(('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-')+ ('#'|'+'|'.'|'/'|'('|')')* )+)
;
LINEBREAK:
	(('\r\n'|'\r'|'\n'))
	{ _channel = 99; }
;
WHITESPACE:
	((' '|'\t'|'\f'))
	{ _channel = 99; }
;

