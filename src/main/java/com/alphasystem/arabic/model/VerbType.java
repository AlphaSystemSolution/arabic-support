/**
 * 
 */
package com.alphasystem.arabic.model;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.DDAD;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.HA;
import static com.alphasystem.arabic.model.ArabicLetterType.HAMZA;
import static com.alphasystem.arabic.model.ArabicLetterType.HHA;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.QAF;
import static com.alphasystem.arabic.model.ArabicLetterType.RA;
import static com.alphasystem.arabic.model.ArabicLetterType.SAD;
import static com.alphasystem.arabic.model.ArabicLetterType.SEEN;
import static com.alphasystem.arabic.model.ArabicLetterType.SPACE;
import static com.alphasystem.arabic.model.ArabicLetterType.TA;
import static com.alphasystem.arabic.model.ArabicLetterType.WAW;
import static com.alphasystem.arabic.model.ArabicLetterType.YA;
import static com.alphasystem.arabic.model.ArabicLetterType.ZAIN;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 * 
 */
public enum VerbType {

	CONSONANT(getWord(SAD, HHA, YA, HHA, SPACE, SEEN, ALIF, LAM, MEEM)),

	DOUBLE_LETTERED(getWord(SAD, HHA, YA, HHA, SPACE, MEEM, DDAD, ALIF, FA)),

	FIRST_RADICAL_HAMZA(getWord(SAD, HHA, YA, HHA, SPACE, MEEM, HA, MEEM, WAW,
			ZAIN, SPACE, ALIF, LAM, FA, ALIF, HAMZA)),

	SECOND_RADICAL_HAMZA(getWord(SAD, HHA, YA, HHA, SPACE, MEEM, HA, MEEM, WAW,
			ZAIN, SPACE, ALIF, LAM, AIN, YA, NOON)),

	THIRD_RADICAL_HAMZA(getWord(SAD, HHA, YA, HHA, SPACE, MEEM, HA, MEEM, WAW,
			ZAIN, SPACE, ALIF, LAM, LAM, ALIF, MEEM)),

	FIRST_RADICAL_WEAK(getWord(MEEM, AIN, TA, LAM, SPACE, ALIF, LAM, FA, ALIF,
			HAMZA)),

	SECOND_RADICAL_WEAK(getWord(MEEM, AIN, TA, LAM, SPACE, ALIF, LAM, AIN, YA,
			NOON)),

	THIRD_RADICAL_WEAK(getWord(MEEM, AIN, TA, LAM, SPACE, ALIF, LAM, LAM, ALIF,
			MEEM)),

	TWO_SEPARATE_RADICALS_WEAK(getWord(LAM, FA, YA, FA, SPACE, MEEM, FA, RA,
			WAW, QAF)),

	TWO_CONSECUTIVE_RADICALS_WEAK(getWord(LAM, FA, YA, FA, SPACE, MEEM, QAF,
			RA, WAW, NOON));

	private final ArabicWord label;

	/**
	 * @param label
	 */
	private VerbType(ArabicWord label) {
		this.label = label;
	}

	public ArabicWord getLabel() {
		return label;
	}
}
