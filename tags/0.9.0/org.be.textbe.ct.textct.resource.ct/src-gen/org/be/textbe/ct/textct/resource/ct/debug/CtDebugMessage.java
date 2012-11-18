/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class CtDebugMessage {
	
	private static final char DELIMITER = ':';
	private org.be.textbe.ct.textct.resource.ct.debug.ECtDebugMessageTypes messageType;
	private String[] arguments;
	
	public CtDebugMessage(org.be.textbe.ct.textct.resource.ct.debug.ECtDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public CtDebugMessage(org.be.textbe.ct.textct.resource.ct.debug.ECtDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public org.be.textbe.ct.textct.resource.ct.debug.ECtDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return org.be.textbe.ct.textct.resource.ct.util.CtStringUtil.encode(DELIMITER, parts);
	}
	
	public static CtDebugMessage deserialize(String response) {
		java.util.List<String> parts = org.be.textbe.ct.textct.resource.ct.util.CtStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		org.be.textbe.ct.textct.resource.ct.debug.ECtDebugMessageTypes type = org.be.textbe.ct.textct.resource.ct.debug.ECtDebugMessageTypes.valueOf(messageType);
		CtDebugMessage message = new CtDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(org.be.textbe.ct.textct.resource.ct.debug.ECtDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + org.be.textbe.ct.textct.resource.ct.util.CtStringUtil.explode(arguments, ", ") + "]";
	}
	
}
