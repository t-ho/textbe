grammar Btt;

options {
	superClass = BttANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.be.textbe.bttrace.resource.btt.mopp;
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
	package org.be.textbe.bttrace.resource.btt.mopp;
}

@members{
	private org.be.textbe.bttrace.resource.btt.IBttTokenResolverFactory tokenResolverFactory = new org.be.textbe.bttrace.resource.btt.mopp.BttTokenResolverFactory();
	
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
	private java.util.List<org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal> expectedElements = new java.util.ArrayList<org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal>();
	
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
		postParseCommands.add(new org.be.textbe.bttrace.resource.btt.IBttCommand<org.be.textbe.bttrace.resource.btt.IBttTextResource>() {
			public boolean execute(org.be.textbe.bttrace.resource.btt.IBttTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new org.be.textbe.bttrace.resource.btt.IBttProblem() {
					public org.be.textbe.bttrace.resource.btt.BttEProblemSeverity getSeverity() {
						return org.be.textbe.bttrace.resource.btt.BttEProblemSeverity.ERROR;
					}
					public org.be.textbe.bttrace.resource.btt.BttEProblemType getType() {
						return org.be.textbe.bttrace.resource.btt.BttEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<org.be.textbe.bttrace.resource.btt.IBttQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.be.textbe.bttrace.resource.btt.IBttExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
		if (!this.rememberExpectedElements) {
			return;
		}
		org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal expectedElement = new org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal(terminal, followSetID, containmentTrace);
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
		postParseCommands.add(new org.be.textbe.bttrace.resource.btt.IBttCommand<org.be.textbe.bttrace.resource.btt.IBttTextResource>() {
			public boolean execute(org.be.textbe.bttrace.resource.btt.IBttTextResource resource) {
				org.be.textbe.bttrace.resource.btt.IBttLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new org.be.textbe.bttrace.resource.btt.IBttCommand<org.be.textbe.bttrace.resource.btt.IBttTextResource>() {
			public boolean execute(org.be.textbe.bttrace.resource.btt.IBttTextResource resource) {
				org.be.textbe.bttrace.resource.btt.IBttLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<org.be.textbe.bttrace.resource.btt.IBttCommand<org.be.textbe.bttrace.resource.btt.IBttTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new org.be.textbe.bttrace.resource.btt.IBttCommand<org.be.textbe.bttrace.resource.btt.IBttTextResource>() {
			public boolean execute(org.be.textbe.bttrace.resource.btt.IBttTextResource resource) {
				org.be.textbe.bttrace.resource.btt.IBttLocationMap locationMap = resource.getLocationMap();
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
	
	public org.be.textbe.bttrace.resource.btt.IBttTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new BttParser(new org.antlr.runtime3_3_0.CommonTokenStream(new BttLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new BttParser(new org.antlr.runtime3_3_0.CommonTokenStream(new BttLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			org.be.textbe.bttrace.resource.btt.mopp.BttPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public BttParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((BttLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((BttLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == org.be.textbe.bttrace.TextBTTrace.class) {
				return parse_org_be_textbe_bttrace_TextBTTrace();
			}
			if (type.getInstanceClass() == org.be.textbe.bttrace.BT.class) {
				return parse_org_be_textbe_bttrace_BT();
			}
			if (type.getInstanceClass() == org.be.textbe.bttrace.Delay.class) {
				return parse_org_be_textbe_bttrace_Delay();
			}
			if (type.getInstanceClass() == org.be.textbe.bttrace.Activate.class) {
				return parse_org_be_textbe_bttrace_Activate();
			}
			if (type.getInstanceClass() == org.be.textbe.bttrace.Interleave.class) {
				return parse_org_be_textbe_bttrace_Interleave();
			}
			if (type.getInstanceClass() == org.be.textbe.bttrace.Trace.class) {
				return parse_org_be_textbe_bttrace_Trace();
			}
			if (type.getInstanceClass() == org.be.textbe.bttrace.NodeGroup.class) {
				return parse_org_be_textbe_bttrace_NodeGroup();
			}
			if (type.getInstanceClass() == org.be.textbe.bttrace.Node.class) {
				return parse_org_be_textbe_bttrace_Node();
			}
		}
		throw new org.be.textbe.bttrace.resource.btt.mopp.BttUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(org.be.textbe.bttrace.resource.btt.IBttOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public org.be.textbe.bttrace.resource.btt.IBttParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.be.textbe.bttrace.resource.btt.IBttCommand<org.be.textbe.bttrace.resource.btt.IBttTextResource>>();
		org.be.textbe.bttrace.resource.btt.mopp.BttParseResult parseResult = new org.be.textbe.bttrace.resource.btt.mopp.BttParseResult();
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
	
	public java.util.List<org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.be.textbe.bttrace.resource.btt.IBttTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
		org.be.textbe.bttrace.resource.btt.IBttParseResult result = parse();
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
			for (org.be.textbe.bttrace.resource.btt.IBttCommand<org.be.textbe.bttrace.resource.btt.IBttTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal>();
		java.util.List<org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal> newFollowSet = new java.util.ArrayList<org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 36;
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
				for (org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<org.be.textbe.bttrace.resource.btt.util.BttPair<org.be.textbe.bttrace.resource.btt.IBttExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.be.textbe.bttrace.resource.btt.util.BttPair<org.be.textbe.bttrace.resource.btt.IBttExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							org.be.textbe.bttrace.resource.btt.IBttExpectedElement newFollower = newFollowerPair.getLeft();
							org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal newFollowTerminal = new org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
		for (org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.be.textbe.bttrace.resource.btt.mopp.BttExpectedTerminal expectedElement, int tokenIndex) {
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
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_0, 0, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_be_textbe_bttrace_TextBTTrace{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_be_textbe_bttrace_TextBTTrace returns [org.be.textbe.bttrace.TextBTTrace element = null]
@init{
}
:
	(
		a0_0 = parse_org_be_textbe_bttrace_BT		{
			if (terminateParsing) {
				throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
			}
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTextBTTrace();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.TEXT_BT_TRACE__BT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_0_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_1, 1, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_2, 1, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_3, 1, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_3);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_4, 1, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_5, 1, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_6, 1, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
	}
	
	(
		(
			a1_0 = parse_org_be_textbe_bttrace_Delay			{
				if (terminateParsing) {
					throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
				}
				if (element == null) {
					element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTextBTTrace();
					incompleteObjects.push(element);
				}
				if (a1_0 != null) {
					if (a1_0 != null) {
						Object value = a1_0;
						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.TEXT_BT_TRACE__DELAY), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_0_0_0_1, a1_0, true);
					copyLocalizationInfos(a1_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_2, 2, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_3, 2, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_3);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_4, 2, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_5, 2, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_6, 2, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
	}
	
	(
		(
			a2_0 = parse_org_be_textbe_bttrace_Activate			{
				if (terminateParsing) {
					throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
				}
				if (element == null) {
					element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTextBTTrace();
					incompleteObjects.push(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.TEXT_BT_TRACE__ACTIVATE), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_0_0_0_2, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_3, 3, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_3);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_4, 3, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_5, 3, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_6, 3, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
	}
	
	(
		(
			a3_0 = parse_org_be_textbe_bttrace_Interleave			{
				if (terminateParsing) {
					throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
				}
				if (element == null) {
					element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTextBTTrace();
					incompleteObjects.push(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.TEXT_BT_TRACE__INTERLEAVE), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_0_0_0_3, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_4, 4, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_5, 4, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_6, 4, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
	}
	
	(
		a4_0 = parse_org_be_textbe_bttrace_Trace		{
			if (terminateParsing) {
				throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
			}
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTextBTTrace();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.TEXT_BT_TRACE__TRACE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_0_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
	}
	
;

parse_org_be_textbe_bttrace_BT returns [org.be.textbe.bttrace.BT element = null]
@init{
}
:
	a0 = 'BT' {
		if (element == null) {
			element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createBT();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_7, 6);
	}
	
	(
		a1 = FILE		
		{
			if (terminateParsing) {
				throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
			}
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createBT();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.be.textbe.bttrace.resource.btt.IBttTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FILE");
				tokenResolver.setOptions(getOptions());
				org.be.textbe.bttrace.resource.btt.IBttTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.BT__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.BT__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_1_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_1, 7, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_1);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_2, 7, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_3, 7, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_3);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_4, 7, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_5, 7, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_6, 7, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_be_textbe_bttrace_Delay returns [org.be.textbe.bttrace.Delay element = null]
@init{
}
:
	a0 = 'DELAY' {
		if (element == null) {
			element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createDelay();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_8, 8);
	}
	
	(
		a1 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
			}
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createDelay();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.be.textbe.bttrace.resource.btt.IBttTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.be.textbe.bttrace.resource.btt.IBttTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.DELAY__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.DELAY__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_2_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_2, 9, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_2);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_3, 9, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_3);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_4, 9, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_5, 9, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_6, 9, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_be_textbe_bttrace_Activate returns [org.be.textbe.bttrace.Activate element = null]
@init{
}
:
	a0 = 'ACTIVATE' {
		if (element == null) {
			element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createActivate();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_9, 10);
	}
	
	(
		a1 = COLORS		
		{
			if (terminateParsing) {
				throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
			}
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createActivate();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.be.textbe.bttrace.resource.btt.IBttTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COLORS");
				tokenResolver.setOptions(getOptions());
				org.be.textbe.bttrace.resource.btt.IBttTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.ACTIVATE__COLOR), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.ACTIVATE__COLOR), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_3_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_3, 11, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_3);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_4, 11, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_5, 11, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_6, 11, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_be_textbe_bttrace_Interleave returns [org.be.textbe.bttrace.Interleave element = null]
@init{
}
:
	a0 = 'INTERLEAVE' {
		if (element == null) {
			element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createInterleave();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_10, 12);
	}
	
	(
		a1 = COLORS		
		{
			if (terminateParsing) {
				throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
			}
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createInterleave();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.be.textbe.bttrace.resource.btt.IBttTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COLORS");
				tokenResolver.setOptions(getOptions());
				org.be.textbe.bttrace.resource.btt.IBttTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.INTERLEAVE__COLOR), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.INTERLEAVE__COLOR), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_4_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_4, 13, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_5, 13, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_6, 13, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_be_textbe_bttrace_Trace returns [org.be.textbe.bttrace.Trace element = null]
@init{
}
:
	(
		a0 = 'TRACE' {
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTrace();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_5_0_0_0_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 14, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_5);
		}
		
		(
			(
				(
					a1_0 = parse_org_be_textbe_bttrace_NodeGroup					{
						if (terminateParsing) {
							throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
						}
						if (element == null) {
							element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTrace();
							incompleteObjects.push(element);
						}
						if (a1_0 != null) {
							if (a1_0 != null) {
								Object value = a1_0;
								addObjectToList(element, org.be.textbe.bttrace.BttracePackage.TRACE__NODE_GROUP, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_5_0_0_0_0_0_1_0_0_0, a1_0, true);
							copyLocalizationInfos(a1_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 15, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_5);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 16, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_5);
		}
		
	)
	{
		// expected elements (follow set)
	}
	
	
	|	(
		a2 = 'LOOP' {
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTrace();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_5_0_1_0_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 18, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_6);
		}
		
		(
			(
				(
					a3_0 = parse_org_be_textbe_bttrace_NodeGroup					{
						if (terminateParsing) {
							throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
						}
						if (element == null) {
							element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTrace();
							incompleteObjects.push(element);
						}
						if (a3_0 != null) {
							if (a3_0 != null) {
								Object value = a3_0;
								addObjectToList(element, org.be.textbe.bttrace.BttracePackage.TRACE__LOOP_NODE_GROUP, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_5_0_1_0_0_0_1_0_0_0, a3_0, true);
							copyLocalizationInfos(a3_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 19, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_6);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 20, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_6);
		}
		
	)
	{
		// expected elements (follow set)
	}
	
	
	|	(
		a4 = 'TRACE' {
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTrace();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_5_0_2_0_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 22, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_5);
		}
		
		(
			(
				(
					a5_0 = parse_org_be_textbe_bttrace_NodeGroup					{
						if (terminateParsing) {
							throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
						}
						if (element == null) {
							element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTrace();
							incompleteObjects.push(element);
						}
						if (a5_0 != null) {
							if (a5_0 != null) {
								Object value = a5_0;
								addObjectToList(element, org.be.textbe.bttrace.BttracePackage.TRACE__NODE_GROUP, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_5_0_2_0_0_0_1_0_0_0, a5_0, true);
							copyLocalizationInfos(a5_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 23, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_5);
					addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_12, 23);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 24, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_5);
			addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_12, 24);
		}
		
		a6 = 'LOOP' {
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTrace();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_5_0_2_0_0_0_2, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 25, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_6);
		}
		
		(
			(
				(
					a7_0 = parse_org_be_textbe_bttrace_NodeGroup					{
						if (terminateParsing) {
							throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
						}
						if (element == null) {
							element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createTrace();
							incompleteObjects.push(element);
						}
						if (a7_0 != null) {
							if (a7_0 != null) {
								Object value = a7_0;
								addObjectToList(element, org.be.textbe.bttrace.BttracePackage.TRACE__LOOP_NODE_GROUP, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_5_0_2_0_0_0_3_0_0_0, a7_0, true);
							copyLocalizationInfos(a7_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 26, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_6);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 27, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_6);
		}
		
	)
	{
		// expected elements (follow set)
	}
	
;

parse_org_be_textbe_bttrace_NodeGroup returns [org.be.textbe.bttrace.NodeGroup element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createNodeGroup();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_13, 29, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_7);
	}
	
	(
		a1_0 = parse_org_be_textbe_bttrace_Node		{
			if (terminateParsing) {
				throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
			}
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createNodeGroup();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.NODE_GROUP__ACTIVE_NODE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_6_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_14, 30);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_15, 30);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createNodeGroup();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_6_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_13, 31, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_8);
			}
			
			(
				a3_0 = parse_org_be_textbe_bttrace_Node				{
					if (terminateParsing) {
						throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
					}
					if (element == null) {
						element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createNodeGroup();
						incompleteObjects.push(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, org.be.textbe.bttrace.BttracePackage.NODE_GROUP__INTERLEAVE_NODE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_6_0_0_2_0_0_1, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_14, 32);
				addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_15, 32);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_14, 33);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_15, 33);
	}
	
	a4 = ']' {
		if (element == null) {
			element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createNodeGroup();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_6_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_11, 34, org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.FEATURE_5);
	}
	
;

parse_org_be_textbe_bttrace_Node returns [org.be.textbe.bttrace.Node element = null]
@init{
}
:
	(
		a0 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.be.textbe.bttrace.resource.btt.mopp.BttTerminateParsingException();
			}
			if (element == null) {
				element = org.be.textbe.bttrace.BttraceFactory.eINSTANCE.createNode();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				org.be.textbe.bttrace.resource.btt.IBttTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.be.textbe.bttrace.resource.btt.IBttTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.NODE__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.be.textbe.bttrace.BttracePackage.NODE__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.be.textbe.bttrace.resource.btt.grammar.BttGrammarInformationProvider.BTT_7_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_14, 35);
		addExpectedElement(org.be.textbe.bttrace.resource.btt.grammar.BttFollowSetProvider.TERMINAL_15, 35);
	}
	
;

INTEGER:
	(('0'..'9')+)
;
COLORS:
	((
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
	))
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
	{ _channel = 99; }
;
FILE:
	(('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-'|'.')+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;

