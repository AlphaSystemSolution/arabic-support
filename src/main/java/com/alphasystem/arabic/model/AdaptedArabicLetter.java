/**
 * 
 */
package com.alphasystem.arabic.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 * @author sali
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArabicLetterType", propOrder = { "letter", "diacritics" })
public class AdaptedArabicLetter {

	@XmlElement
	private ArabicLetterType letter;

	@XmlElementWrapper
	@XmlElement(name = "diacritic", namespace = "http://www.alphasystem.com/arabic/support")
	private DiacriticType[] diacritics;

	/**
	 * 
	 */
	public AdaptedArabicLetter() {
		setDiacritics(null);
	}

	/**
	 * @param letter
	 * @param diacritics
	 */
	public AdaptedArabicLetter(ArabicLetterType letter,
			DiacriticType[] diacritics) {
		this.letter = letter;
		setDiacritics(diacritics);
	}

	public DiacriticType[] getDiacritics() {
		return diacritics;
	}

	public ArabicLetterType getLetter() {
		return letter;
	}

	public void setDiacritics(DiacriticType[] diacritics) {
		this.diacritics = diacritics == null ? new DiacriticType[0]
				: diacritics;
	}

	public void setLetter(ArabicLetterType letter) {
		this.letter = letter;
	}
}
