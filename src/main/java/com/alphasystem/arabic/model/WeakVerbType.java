/**
 * 
 */
package com.alphasystem.arabic.model;

import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.JEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.QAF;
import static com.alphasystem.arabic.model.ArabicLetterType.SAD;
import static com.alphasystem.arabic.model.ArabicLetterType.SPACE;
import static com.alphasystem.arabic.model.ArabicLetterType.THA;
import static com.alphasystem.arabic.model.ArabicLetterType.WAW;
import static com.alphasystem.arabic.model.ArabicLetterType.YA;
import static com.alphasystem.arabic.model.ArabicLetterType.YA_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 * 
 */
public enum WeakVerbType {

	FIRST_RADICAL_WEAK_WAW(getWord(MEEM, THA, ALIF, LAM, SPACE, ALIF, LAM, WAW,
			ALIF, WAW, YA)),

	FIRST_RADICAL_WEAK_YA(getWord(MEEM, THA, ALIF, LAM, SPACE, ALIF, LAM, YA,
			ALIF, YA_HAMZA_ABOVE, YA)),

	SECOND_RADICAL_WEAK_WAW(getWord(ALIF_HAMZA_ABOVE, JEEM, WAW, FA, SPACE,
			ALIF, LAM, WAW, ALIF, WAW, YA)),

	SECOND_RADICAL_WEAK_YA(getWord(ALIF_HAMZA_ABOVE, JEEM, WAW, FA, SPACE,
			ALIF, LAM, YA, ALIF, YA_HAMZA_ABOVE, YA)),

	THIRD_RADICAL_WEAK_WAW(getWord(NOON, ALIF, QAF, SAD, SPACE, ALIF, LAM, WAW,
			ALIF, WAW, YA)),

	THIRD_RADICAL_WEAK_YA(getWord(NOON, ALIF, QAF, SAD, SPACE, ALIF, LAM, YA,
			ALIF, YA_HAMZA_ABOVE, YA));

	private final ArabicWord label;

	/**
	 * @param label
	 */
	private WeakVerbType(ArabicWord label) {
		this.label = label;
	}

	public ArabicWord getLabel() {
		return label;
	}
}
