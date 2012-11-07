/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see org.be.textbe.bt.textbt.resource.bt.IBtOptions.RESOURCE_CONTENT_TYPE
 */
public class BtUnexpectedContentTypeException extends org.antlr.runtime3_3_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  BtUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
