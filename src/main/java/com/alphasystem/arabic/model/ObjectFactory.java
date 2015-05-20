/**
 * 
 */
package com.alphasystem.arabic.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * @author sali
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ArabicWord_QNAME = new QName(
			"http://www.alphasystem.com/arabic/support", "arabic-word");

	public ObjectFactory() {
	}

	public ArabicWord createArabicWord() {
		return new ArabicWord();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ArabicWord }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.alphasystem.com/arabic/support", name = "arabic-word")
	public JAXBElement<ArabicWord> createArabicWord(ArabicWord value) {
		return new JAXBElement<ArabicWord>(_ArabicWord_QNAME, ArabicWord.class,
				null, value);
	}
}
