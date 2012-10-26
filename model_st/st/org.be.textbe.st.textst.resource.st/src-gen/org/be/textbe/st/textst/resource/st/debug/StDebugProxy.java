/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class StDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private org.be.textbe.st.textst.resource.st.debug.StDebugTarget debugTarget;
	
	private org.be.textbe.st.textst.resource.st.debug.StDebugCommunicationHelper communicationHelper = new org.be.textbe.st.textst.resource.st.debug.StDebugCommunicationHelper();
	
	public StDebugProxy(org.be.textbe.st.textst.resource.st.debug.StDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.EXIT);
	}
	
	public org.be.textbe.st.textst.resource.st.debug.StDebugMessage getStack() {
		return sendCommandAndRead(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		org.be.textbe.st.textst.resource.st.debug.StDebugMessage message = new org.be.textbe.st.textst.resource.st.debug.StDebugMessage(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		org.be.textbe.st.textst.resource.st.debug.StDebugMessage message = new org.be.textbe.st.textst.resource.st.debug.StDebugMessage(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		org.be.textbe.st.textst.resource.st.debug.StDebugMessage response = sendCommandAndRead(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		org.be.textbe.st.textst.resource.st.debug.StDebugMessage response = sendCommandAndRead(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		org.be.textbe.st.textst.resource.st.debug.StDebugVariable[] variables  = new org.be.textbe.st.textst.resource.st.debug.StDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = org.be.textbe.st.textst.resource.st.util.StStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new org.be.textbe.st.textst.resource.st.debug.StDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			org.be.textbe.st.textst.resource.st.debug.StDebugVariable variable = new org.be.textbe.st.textst.resource.st.debug.StDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes command, String... parameters) {
		org.be.textbe.st.textst.resource.st.debug.StDebugMessage message = new org.be.textbe.st.textst.resource.st.debug.StDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private org.be.textbe.st.textst.resource.st.debug.StDebugMessage sendCommandAndRead(org.be.textbe.st.textst.resource.st.debug.EStDebugMessageTypes command, String... parameters) {
		org.be.textbe.st.textst.resource.st.debug.StDebugMessage message = new org.be.textbe.st.textst.resource.st.debug.StDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
