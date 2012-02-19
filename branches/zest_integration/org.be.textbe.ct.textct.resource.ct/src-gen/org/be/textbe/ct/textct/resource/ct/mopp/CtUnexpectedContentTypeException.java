/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see org.be.textbe.ct.textct.resource.ct.ICtOptions.RESOURCE_CONTENT_TYPE
 */
public class CtUnexpectedContentTypeException extends org.antlr.runtime3_3_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  CtUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
