/**
 * 
 */
package com.alphasystem.arabic.model;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.HHA;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.SAD;
import static com.alphasystem.arabic.model.ArabicLetterType.TA;
import static com.alphasystem.arabic.model.ArabicLetterType.YA;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 * 
 */
public enum RootType {

	CONSONANT(getWord(SAD, HHA, YA, HHA)),

	WEAK(getWord(MEEM, AIN, TA, LAM));

	private final ArabicWord label;

	/**
	 * @param label
	 */
	private RootType(ArabicWord label) {
		this.label = label;
	}

	public ArabicWord getLabel() {
		return label;
	}
}
