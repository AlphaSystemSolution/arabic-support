/**
 * 
 */
package com.alphasystem.arabic.model;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_HAMZA_BELOW;
import static com.alphasystem.arabic.model.ArabicLetterType.DAL;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.HA;
import static com.alphasystem.arabic.model.ArabicLetterType.JEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.RA;
import static com.alphasystem.arabic.model.ArabicLetterType.SEEN;
import static com.alphasystem.arabic.model.ArabicLetterType.SPACE;
import static com.alphasystem.arabic.model.ArabicLetterType.TA;
import static com.alphasystem.arabic.model.ArabicLetterType.THA;
import static com.alphasystem.arabic.model.ArabicLetterType.WAW;
import static com.alphasystem.arabic.model.ArabicLetterType.YA;
import static com.alphasystem.arabic.model.ArabicLetterType.ZAIN;
import static com.alphasystem.arabic.model.ArabicWord.fromBuckWalterString;
import static com.alphasystem.arabic.model.ArabicWord.getWord;
import static com.alphasystem.arabic.model.DiacriticType.DAMMA;
import static com.alphasystem.arabic.model.DiacriticType.FATHA;
import static com.alphasystem.arabic.model.DiacriticType.KASRA;
import static com.alphasystem.arabic.model.DiacriticType.SHADDA;
import static com.alphasystem.arabic.model.DiacriticType.SUKUN;
import static java.lang.String.format;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * @author sali
 * 
 */
@XmlType(name = "NamedTemplateType")
@XmlEnum
public enum NamedTemplate implements ArabicSupportEnum {

	FORM_I_CATEGORY_A_GROUP_U_TEMPLATE("I",
			1,
			1,
			// label
			getWord(new ArabicLetter(FA, FATHA), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, FATHA), new ArabicLetter(FA, SUKUN),
					new ArabicLetter(AIN, DAMMA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					JEEM, RA, DAL)),

	FORM_I_CATEGORY_A_GROUP_I_TEMPLATE("I",
			1,
			2,
			// label
			getWord(new ArabicLetter(FA, FATHA), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, FATHA), new ArabicLetter(FA, SUKUN),
					new ArabicLetter(AIN, KASRA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					JEEM, RA, DAL)),

	FORM_I_CATEGORY_A_GROUP_A_TEMPLATE("I",
			1,
			3,
			// label
			getWord(new ArabicLetter(FA, FATHA), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, FATHA), new ArabicLetter(FA, SUKUN),
					new ArabicLetter(AIN, FATHA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					JEEM, RA, DAL)),

	FORM_I_CATEGORY_U_TEMPLATE("I",
			1,
			4,
			// label
			getWord(new ArabicLetter(FA, FATHA), new ArabicLetter(AIN, DAMMA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, FATHA), new ArabicLetter(FA, SUKUN),
					new ArabicLetter(AIN, DAMMA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					JEEM, RA, DAL)),

	FORM_I_CATEGORY_I_GROUP_A_TEMPLATE("I",
			1,
			5,
			// label
			getWord(new ArabicLetter(FA, FATHA), new ArabicLetter(AIN, KASRA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, FATHA), new ArabicLetter(FA, SUKUN),
					new ArabicLetter(AIN, FATHA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					JEEM, RA, DAL)),

	FORM_I_CATEGORY_I_GROUP_I_TEMPLATE("I",
			1,
			6,
			// label
			getWord(new ArabicLetter(FA, FATHA), new ArabicLetter(AIN, KASRA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, FATHA), new ArabicLetter(FA, SUKUN),
					new ArabicLetter(AIN, KASRA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					JEEM, RA, DAL)),

	FORM_II_TEMPLATE("II", 2, 0,
	// label
			getWord(new ArabicLetter(FA, FATHA), new ArabicLetter(AIN, SHADDA,
					FATHA), new ArabicLetter(LAM, FATHA), new ArabicLetter(
					SPACE), new ArabicLetter(YA, DAMMA), new ArabicLetter(FA,
					FATHA), new ArabicLetter(AIN, SHADDA, KASRA),
					new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_III_TEMPLATE("III",
			2,
			1,
			// label
			getWord(new ArabicLetter(FA, FATHA), new ArabicLetter(ALIF),
					new ArabicLetter(AIN, FATHA), new ArabicLetter(LAM, FATHA),
					new ArabicLetter(SPACE), new ArabicLetter(YA, DAMMA),
					new ArabicLetter(FA, FATHA), new ArabicLetter(ALIF),
					new ArabicLetter(AIN, KASRA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_IV_TEMPLATE("IV",
			2,
			2,
			// label
			getWord(new ArabicLetter(ALIF_HAMZA_ABOVE, FATHA),
					new ArabicLetter(FA, SUKUN), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, DAMMA), new ArabicLetter(FA, SUKUN),
					new ArabicLetter(AIN, KASRA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_V_TEMPLATE("V", 2, 3,
	// label
			getWord(new ArabicLetter(TA, FATHA), new ArabicLetter(FA, FATHA),
					new ArabicLetter(AIN, SHADDA, FATHA), new ArabicLetter(LAM,
							FATHA), new ArabicLetter(SPACE), new ArabicLetter(
							YA, FATHA), new ArabicLetter(TA, FATHA),
					new ArabicLetter(FA, FATHA), new ArabicLetter(AIN, SHADDA,
							FATHA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_VI_TEMPLATE("VI",
			2,
			4,
			// label
			getWord(new ArabicLetter(TA, FATHA), new ArabicLetter(FA, FATHA),
					new ArabicLetter(ALIF), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, FATHA), new ArabicLetter(TA, FATHA),
					new ArabicLetter(FA, FATHA), new ArabicLetter(ALIF),
					new ArabicLetter(AIN, FATHA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_VII_TEMPLATE("VII",
			2,
			5,
			// label
			getWord(new ArabicLetter(ALIF_HAMZA_BELOW, KASRA),
					new ArabicLetter(NOON, SUKUN), new ArabicLetter(FA, FATHA),
					new ArabicLetter(AIN, FATHA), new ArabicLetter(LAM, FATHA),
					new ArabicLetter(SPACE), new ArabicLetter(YA, FATHA),
					new ArabicLetter(NOON, SUKUN), new ArabicLetter(FA, FATHA),
					new ArabicLetter(AIN, KASRA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_VIII_TEMPLATE("VIII",
			2,
			6,
			// label
			getWord(new ArabicLetter(ALIF_HAMZA_BELOW, KASRA),
					new ArabicLetter(FA, SUKUN), new ArabicLetter(TA, FATHA),
					new ArabicLetter(AIN, FATHA), new ArabicLetter(LAM, FATHA),
					new ArabicLetter(SPACE), new ArabicLetter(YA, FATHA),
					new ArabicLetter(FA, SUKUN), new ArabicLetter(TA, FATHA),
					new ArabicLetter(AIN, KASRA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_IX_TEMPLATE("IX", 2, 7,
	// label
			getWord(new ArabicLetter(ALIF_HAMZA_BELOW, KASRA),
					new ArabicLetter(FA, SUKUN), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(LAM, SHADDA, FATHA), new ArabicLetter(
							SPACE), new ArabicLetter(YA, FATHA),
					new ArabicLetter(FA, SUKUN), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(LAM, SHADDA, FATHA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_X_TEMPLATE("X",
			2,
			8,
			// label
			getWord(new ArabicLetter(ALIF_HAMZA_BELOW, KASRA),
					new ArabicLetter(SEEN, SUKUN), new ArabicLetter(TA, FATHA),
					new ArabicLetter(FA, SUKUN), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, FATHA), new ArabicLetter(SEEN, SUKUN),
					new ArabicLetter(TA, FATHA), new ArabicLetter(FA, SUKUN),
					new ArabicLetter(AIN, KASRA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_XI_TEMPLATE("XI",
			2,
			9,
			// label
			getWord(new ArabicLetter(ALIF_HAMZA_BELOW, KASRA),
					new ArabicLetter(FA, SUKUN), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(WAW, SUKUN), new ArabicLetter(AIN, FATHA),
					new ArabicLetter(LAM, FATHA), new ArabicLetter(SPACE),
					new ArabicLetter(YA, FATHA), new ArabicLetter(FA, SUKUN),
					new ArabicLetter(AIN, FATHA), new ArabicLetter(WAW, SUKUN),
					new ArabicLetter(AIN, KASRA), new ArabicLetter(LAM, DAMMA)),
			// type
			getWord(FA, AIN, LAM, SPACE, THA, LAM, ALIF, THA, YA, SPACE, MEEM,
					ZAIN, YA, DAL, SPACE, FA, YA, HA)),

	FORM_XII_TEMPLATE("XII", 2, 10, "IifoEaw~ala", "fElQvlAvyQmzydQfyh"),

	FORM_XIII_TEMPLATE("XIII", 2, 11, "IifoEaAl~a", "fElQvlAvyQmzydQfyh");

	private final String form;

	private final Integer index;

	private final Integer subIndex;

	private final ArabicWord label;

	private final ArabicWord type;

	/**
	 * 
	 * @param form
	 * @param index
	 * @param subIndex
	 * @param label
	 * @param type
	 */
	private NamedTemplate(String form, Integer index, Integer subIndex,
			ArabicWord label, ArabicWord type) {
		this.form = form;
		this.index = index;
		this.subIndex = subIndex;
		this.label = label;
		this.type = type;
	}

	/**
	 * 
	 * @param form
	 * @param index
	 * @param subIndex
	 * @param label
	 * @param type
	 */
	private NamedTemplate(String form, Integer index, Integer subIndex,
			String label, String type) {
		this(form, index, subIndex, fromBuckWalterString(label),
				fromBuckWalterString(type));
	}

	@Override
	public String getCode() {
		return format("Form %s", form);
	}

	public String getForm() {
		return form;
	}

	public Integer getIndex() {
		return index;
	}

	@Override
	public ArabicWord getLabel() {
		return label;
	}

	@Override
	public String getName() {
		return name();
	}

	public Integer getSubIndex() {
		return subIndex;
	}

	public ArabicWord getType() {
		return type;
	}

}
