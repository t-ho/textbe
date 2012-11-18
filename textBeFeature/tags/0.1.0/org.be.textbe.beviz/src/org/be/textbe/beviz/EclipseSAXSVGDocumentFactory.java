/*
 * @author sschwieb
 * @version $Revision: 1.1 $
 * @created 04.04.2005
 *
 */

package org.be.textbe.beviz;

import java.io.IOException;
import java.io.InterruptedIOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * This is a special version of the SAXSVGDocumentFactory class. It loads the XML
 * parser class via the Eclipse class loader and bypasses the Batik NewInstance class
 * which used to be responsible for loading the parser.
 * 
 * @author sschwieb
 */
public class EclipseSAXSVGDocumentFactory extends SAXSVGDocumentFactory {
    public EclipseSAXSVGDocumentFactory(String parser, boolean dd) {
        super(parser, dd);
    }

    protected Document createDocument(InputSource is) throws IOException {
        try {
            Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
            //System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.jaxp.SAXParserFactoryImpl");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setFeature("http://xml.org/sax/features/namespaces", true);
            factory.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
            factory.setFeature("http://xml.org/sax/features/validation", isValidating);
          
            SAXParser parser = factory.newSAXParser();
            parser.getXMLReader().setContentHandler(this);
            parser.getXMLReader().setDTDHandler(this);
            parser.getXMLReader().setEntityResolver(this);
            parser.getXMLReader().setErrorHandler((errorHandler == null) ? this : errorHandler);
            parser.setProperty("http://xml.org/sax/properties/lexical-handler", this);
            parser.getXMLReader().parse(is);
        } catch (SAXException e) {
            Exception ex = e.getException();
            if (ex != null && ex instanceof InterruptedIOException) {
                throw (InterruptedIOException) ex;
            }
            throw new IOException(e.getMessage());
        } catch (ParserConfigurationException e) {
            throw new IOException(e.getMessage());
        }
        currentNode = null;
        Document ret = document;
        document = null;
        return ret;
    }
}