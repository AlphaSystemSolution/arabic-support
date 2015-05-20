/**
 * 
 */
package com.alphasystem.arabic.model;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_HAMZA_BELOW;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_MAKSURA;
import static com.alphasystem.arabic.model.ArabicLetterType.BA;
import static com.alphasystem.arabic.model.ArabicLetterType.COMMA;
import static com.alphasystem.arabic.model.ArabicLetterType.DAL;
import static com.alphasystem.arabic.model.ArabicLetterType.DDAD;
import static com.alphasystem.arabic.model.ArabicLetterType.DTHA;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.GHAIN;
import static com.alphasystem.arabic.model.ArabicLetterType.HA;
import static com.alphasystem.arabic.model.ArabicLetterType.HAMZA;
import static com.alphasystem.arabic.model.ArabicLetterType.HHA;
import static com.alphasystem.arabic.model.ArabicLetterType.JEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.KAF;
import static com.alphasystem.arabic.model.ArabicLetterType.KHA;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.QAF;
import static com.alphasystem.arabic.model.ArabicLetterType.RA;
import static com.alphasystem.arabic.model.ArabicLetterType.SAD;
import static com.alphasystem.arabic.model.ArabicLetterType.SEEN;
import static com.alphasystem.arabic.model.ArabicLetterType.SHEEN;
import static com.alphasystem.arabic.model.ArabicLetterType.SPACE;
import static com.alphasystem.arabic.model.ArabicLetterType.TA;
import static com.alphasystem.arabic.model.ArabicLetterType.TATWEEL;
import static com.alphasystem.arabic.model.ArabicLetterType.TA_MARBUTA;
import static com.alphasystem.arabic.model.ArabicLetterType.THA;
import static com.alphasystem.arabic.model.ArabicLetterType.THAL;
import static com.alphasystem.arabic.model.ArabicLetterType.TTA;
import static com.alphasystem.arabic.model.ArabicLetterType.WAW;
import static com.alphasystem.arabic.model.ArabicLetterType.WAW_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicLetterType.YA;
import static com.alphasystem.arabic.model.ArabicLetterType.YA_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicLetterType.ZAIN;
import static com.alphasystem.arabic.model.ArabicWord.fromBuckWalterString;
import static com.alphasystem.arabic.model.ArabicWord.getWord;
import static com.alphasystem.arabic.model.DiacriticType.DAMMA;
import static com.alphasystem.arabic.model.DiacriticType.DAMMATAN;
import static com.alphasystem.arabic.model.DiacriticType.FATHA;
import static com.alphasystem.arabic.model.DiacriticType.FATHATAN;
import static com.alphasystem.arabic.model.DiacriticType.KASRA;
import static com.alphasystem.arabic.model.DiacriticType.KASRATAN;
import static com.alphasystem.arabic.model.DiacriticType.SHADDA;
import static com.alphasystem.arabic.model.DiacriticType.SUKUN;

/**
 * @author sali
 * 
 */
public interface ArabicLetters {

	public static final ArabicLetter LETTER_TATWEEL = new ArabicLetter(TATWEEL);
	public static final ArabicLetter LETTER_SPACE = new ArabicLetter(SPACE);
	public static final ArabicLetter LETTER_COMMA = new ArabicLetter(COMMA);
	public static final ArabicLetter LETTER_ALIF = new ArabicLetter(ALIF);
	public static final ArabicLetter LETTER_YA = new ArabicLetter(YA);
	public static final ArabicLetter LETTER_WAW = new ArabicLetter(WAW);
	public static final ArabicLetter LETTER_ALIF_MAKSURA = new ArabicLetter(
			ALIF_MAKSURA);
	public static final ArabicLetter ALIF_HAMZA_BELOW_WITH_KASRA = new ArabicLetter(
			ALIF_HAMZA_BELOW, KASRA);
	public static final ArabicLetter ALIF_HAMZA_BELOW_WITH_DAMMA = new ArabicLetter(
			ALIF_HAMZA_BELOW, DAMMA);
	public static final ArabicLetter ALIF_HAMZA_ABOVE_WITH_DAMMA = new ArabicLetter(
			ALIF_HAMZA_ABOVE, DAMMA);
	public static final ArabicLetter ALIF_HAMZA_ABOVE_WITH_FATHA = new ArabicLetter(
			ALIF_HAMZA_ABOVE, FATHA);
	public static final ArabicLetter ALIF_HAMZA_ABOVE_WITH_SUKUN = new ArabicLetter(
			ALIF_HAMZA_ABOVE, SUKUN);
	public static final ArabicLetter YA_HAMZA_ABOVE_WITH_KASRA = new ArabicLetter(
			YA_HAMZA_ABOVE, KASRA);
	public static final ArabicLetter WAW_HAMZA_ABOVE_WITH_SUKUN = new ArabicLetter(
			WAW_HAMZA_ABOVE, SUKUN);
	public static final ArabicLetter YA_WITH_SUKUN = new ArabicLetter(YA, SUKUN);
	public static final ArabicLetter YA_WITH_DAMMA = new ArabicLetter(YA, DAMMA);
	public static final ArabicLetter YA_WITH_DAMMATAN = new ArabicLetter(YA,
			DAMMATAN);
	public static final ArabicLetter YA_WITH_FATHA = new ArabicLetter(YA, FATHA);
	public static final ArabicLetter YA_WITH_FATHATAN = new ArabicLetter(YA,
			FATHATAN);
	public static final ArabicLetter BA_WITH_FATHA = new ArabicLetter(BA, FATHA);
	public static final ArabicLetter BA_WITH_DAMMA = new ArabicLetter(BA, DAMMA);
	public static final ArabicLetter BA_WITH_KASRA = new ArabicLetter(BA, KASRA);
	public static final ArabicLetter BA_WITH_SUKUN = new ArabicLetter(BA, SUKUN);
	public static final ArabicLetter BA_WITH_FATHATAN = new ArabicLetter(BA,
			FATHATAN);
	public static final ArabicLetter BA_WITH_DAMMATAN = new ArabicLetter(BA,
			DAMMATAN);
	public static final ArabicLetter BA_WITH_KASRATAN = new ArabicLetter(BA,
			KASRATAN);
	public static final ArabicLetter BA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			BA, SHADDA, FATHA);
	public static final ArabicLetter BA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			BA, SHADDA, DAMMA);
	public static final ArabicLetter BA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			BA, SHADDA, KASRA);
	public static final ArabicLetter TA_WITH_FATHA = new ArabicLetter(TA, FATHA);
	public static final ArabicLetter TA_WITH_DAMMA = new ArabicLetter(TA, DAMMA);
	public static final ArabicLetter TA_WITH_KASRA = new ArabicLetter(TA, KASRA);
	public static final ArabicLetter TA_WITH_SUKUN = new ArabicLetter(TA, SUKUN);
	public static final ArabicLetter TA_WITH_FATHATAN = new ArabicLetter(TA,
			FATHATAN);
	public static final ArabicLetter TA_WITH_DAMMATAN = new ArabicLetter(TA,
			DAMMATAN);
	public static final ArabicLetter TA_WITH_KASRATAN = new ArabicLetter(TA,
			KASRATAN);
	public static final ArabicLetter TA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			TA, SHADDA, FATHA);
	public static final ArabicLetter TA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			TA, SHADDA, DAMMA);
	public static final ArabicLetter TA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			TA, SHADDA, KASRA);
	public static final ArabicLetter THA_WITH_FATHA = new ArabicLetter(THA,
			FATHA);
	public static final ArabicLetter THA_WITH_DAMMA = new ArabicLetter(THA,
			DAMMA);
	public static final ArabicLetter THA_WITH_KASRA = new ArabicLetter(THA,
			KASRA);
	public static final ArabicLetter THA_WITH_SUKUN = new ArabicLetter(THA,
			SUKUN);
	public static final ArabicLetter THA_WITH_FATHATAN = new ArabicLetter(THA,
			FATHATAN);
	public static final ArabicLetter THA_WITH_DAMMATAN = new ArabicLetter(THA,
			DAMMATAN);
	public static final ArabicLetter THA_WITH_KASRATAN = new ArabicLetter(THA,
			KASRATAN);
	public static final ArabicLetter THA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			THA, SHADDA, FATHA);
	public static final ArabicLetter THA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			THA, SHADDA, DAMMA);
	public static final ArabicLetter THA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			THA, SHADDA, KASRA);
	public static final ArabicLetter JEEM_WITH_FATHA = new ArabicLetter(JEEM,
			FATHA);
	public static final ArabicLetter JEEM_WITH_DAMMA = new ArabicLetter(JEEM,
			DAMMA);
	public static final ArabicLetter JEEM_WITH_KASRA = new ArabicLetter(JEEM,
			KASRA);
	public static final ArabicLetter JEEM_WITH_SUKUN = new ArabicLetter(JEEM,
			SUKUN);
	public static final ArabicLetter JEEM_WITH_FATHATAN = new ArabicLetter(
			JEEM, FATHATAN);
	public static final ArabicLetter JEEM_WITH_DAMMATAN = new ArabicLetter(
			JEEM, DAMMATAN);
	public static final ArabicLetter JEEM_WITH_KASRATAN = new ArabicLetter(
			JEEM, KASRATAN);
	public static final ArabicLetter JEEM_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			JEEM, SHADDA, FATHA);
	public static final ArabicLetter JEEM_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			JEEM, SHADDA, DAMMA);
	public static final ArabicLetter JEEM_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			JEEM, SHADDA, KASRA);
	public static final ArabicLetter HHA_WITH_FATHA = new ArabicLetter(HHA,
			FATHA);
	public static final ArabicLetter HHA_WITH_DAMMA = new ArabicLetter(HHA,
			DAMMA);
	public static final ArabicLetter HHA_WITH_KASRA = new ArabicLetter(HHA,
			KASRA);
	public static final ArabicLetter HHA_WITH_SUKUN = new ArabicLetter(HHA,
			SUKUN);
	public static final ArabicLetter HHA_WITH_FATHATAN = new ArabicLetter(HHA,
			FATHATAN);
	public static final ArabicLetter HHA_WITH_DAMMATAN = new ArabicLetter(HHA,
			DAMMATAN);
	public static final ArabicLetter HHA_WITH_KASRATAN = new ArabicLetter(HHA,
			KASRATAN);
	public static final ArabicLetter HHA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			HHA, SHADDA, FATHA);
	public static final ArabicLetter HHA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			HHA, SHADDA, DAMMA);
	public static final ArabicLetter HHA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			HHA, SHADDA, KASRA);
	public static final ArabicLetter HA_WITH_FATHA = new ArabicLetter(HA, FATHA);
	public static final ArabicLetter HA_WITH_DAMMA = new ArabicLetter(HA, DAMMA);
	public static final ArabicLetter KHA_WITH_FATHA = new ArabicLetter(KHA,
			FATHA);
	public static final ArabicLetter KHA_WITH_DAMMA = new ArabicLetter(KHA,
			DAMMA);
	public static final ArabicLetter KHA_WITH_KASRA = new ArabicLetter(KHA,
			KASRA);
	public static final ArabicLetter KHA_WITH_SUKUN = new ArabicLetter(KHA,
			SUKUN);
	public static final ArabicLetter KHA_WITH_FATHATAN = new ArabicLetter(KHA,
			FATHATAN);
	public static final ArabicLetter KHA_WITH_DAMMATAN = new ArabicLetter(KHA,
			DAMMATAN);
	public static final ArabicLetter KHA_WITH_KASRATAN = new ArabicLetter(KHA,
			KASRATAN);
	public static final ArabicLetter KHA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			KHA, SHADDA, FATHA);
	public static final ArabicLetter KHA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			KHA, SHADDA, DAMMA);
	public static final ArabicLetter KHA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			KHA, SHADDA, KASRA);
	public static final ArabicLetter DAL_WITH_FATHA = new ArabicLetter(DAL,
			FATHA);
	public static final ArabicLetter DAL_WITH_DAMMA = new ArabicLetter(DAL,
			DAMMA);
	public static final ArabicLetter DAL_WITH_KASRA = new ArabicLetter(DAL,
			KASRA);
	public static final ArabicLetter DAL_WITH_SUKUN = new ArabicLetter(DAL,
			SUKUN);
	public static final ArabicLetter DAL_WITH_FATHATAN = new ArabicLetter(DAL,
			FATHATAN);
	public static final ArabicLetter DAL_WITH_DAMMATAN = new ArabicLetter(DAL,
			DAMMATAN);
	public static final ArabicLetter DAL_WITH_KASRATAN = new ArabicLetter(DAL,
			KASRATAN);
	public static final ArabicLetter DAL_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			DAL, SHADDA, FATHA);
	public static final ArabicLetter DAL_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			DAL, SHADDA, DAMMA);
	public static final ArabicLetter DAL_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			DAL, SHADDA, KASRA);
	public static final ArabicLetter THAL_WITH_FATHA = new ArabicLetter(THAL,
			FATHA);
	public static final ArabicLetter THAL_WITH_DAMMA = new ArabicLetter(THAL,
			DAMMA);
	public static final ArabicLetter THAL_WITH_KASRA = new ArabicLetter(THAL,
			KASRA);
	public static final ArabicLetter THAL_WITH_SUKUN = new ArabicLetter(THAL,
			SUKUN);
	public static final ArabicLetter THAL_WITH_FATHATAN = new ArabicLetter(
			THAL, FATHATAN);
	public static final ArabicLetter THAL_WITH_DAMMATAN = new ArabicLetter(
			THAL, DAMMATAN);
	public static final ArabicLetter THAL_WITH_KASRATAN = new ArabicLetter(
			THAL, KASRATAN);
	public static final ArabicLetter THAL_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			THAL, SHADDA, FATHA);
	public static final ArabicLetter THAL_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			THAL, SHADDA, DAMMA);
	public static final ArabicLetter THAL_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			THAL, SHADDA, KASRA);
	public static final ArabicLetter RA_WITH_FATHA = new ArabicLetter(RA, FATHA);
	public static final ArabicLetter RA_WITH_DAMMA = new ArabicLetter(RA, DAMMA);
	public static final ArabicLetter RA_WITH_KASRA = new ArabicLetter(RA, KASRA);
	public static final ArabicLetter RA_WITH_SUKUN = new ArabicLetter(RA, SUKUN);
	public static final ArabicLetter RA_WITH_FATHATAN = new ArabicLetter(RA,
			FATHATAN);
	public static final ArabicLetter RA_WITH_DAMMATAN = new ArabicLetter(RA,
			DAMMATAN);
	public static final ArabicLetter RA_WITH_KASRATAN = new ArabicLetter(RA,
			KASRATAN);
	public static final ArabicLetter RA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			RA, SHADDA, FATHA);
	public static final ArabicLetter RA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			RA, SHADDA, DAMMA);
	public static final ArabicLetter RA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			RA, SHADDA, KASRA);
	public static final ArabicLetter ZAIN_WITH_FATHA = new ArabicLetter(ZAIN,
			FATHA);
	public static final ArabicLetter ZAIN_WITH_DAMMA = new ArabicLetter(ZAIN,
			DAMMA);
	public static final ArabicLetter ZAIN_WITH_KASRA = new ArabicLetter(ZAIN,
			KASRA);
	public static final ArabicLetter ZAIN_WITH_SUKUN = new ArabicLetter(ZAIN,
			SUKUN);
	public static final ArabicLetter ZAIN_WITH_FATHATAN = new ArabicLetter(
			ZAIN, FATHATAN);
	public static final ArabicLetter ZAIN_WITH_DAMMATAN = new ArabicLetter(
			ZAIN, DAMMATAN);
	public static final ArabicLetter ZAIN_WITH_KASRATAN = new ArabicLetter(
			ZAIN, KASRATAN);
	public static final ArabicLetter ZAIN_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			ZAIN, SHADDA, FATHA);
	public static final ArabicLetter ZAIN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			ZAIN, SHADDA, DAMMA);
	public static final ArabicLetter ZAIN_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			ZAIN, SHADDA, KASRA);
	public static final ArabicLetter SEEN_WITH_FATHA = new ArabicLetter(SEEN,
			FATHA);
	public static final ArabicLetter SEEN_WITH_DAMMA = new ArabicLetter(SEEN,
			DAMMA);
	public static final ArabicLetter SEEN_WITH_KASRA = new ArabicLetter(SEEN,
			KASRA);
	public static final ArabicLetter SEEN_WITH_SUKUN = new ArabicLetter(SEEN,
			SUKUN);
	public static final ArabicLetter SEEN_WITH_FATHATAN = new ArabicLetter(
			SEEN, FATHATAN);
	public static final ArabicLetter SEEN_WITH_DAMMATAN = new ArabicLetter(
			SEEN, DAMMATAN);
	public static final ArabicLetter SEEN_WITH_KASRATAN = new ArabicLetter(
			SEEN, KASRATAN);
	public static final ArabicLetter SEEN_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			SEEN, SHADDA, FATHA);
	public static final ArabicLetter SEEN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			SEEN, SHADDA, DAMMA);
	public static final ArabicLetter SEEN_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			SEEN, SHADDA, KASRA);
	public static final ArabicLetter SHEEN_WITH_FATHA = new ArabicLetter(SHEEN,
			FATHA);
	public static final ArabicLetter SHEEN_WITH_DAMMA = new ArabicLetter(SHEEN,
			DAMMA);
	public static final ArabicLetter SHEEN_WITH_KASRA = new ArabicLetter(SHEEN,
			KASRA);
	public static final ArabicLetter SHEEN_WITH_SUKUN = new ArabicLetter(SHEEN,
			SUKUN);
	public static final ArabicLetter SHEEN_WITH_FATHATAN = new ArabicLetter(
			SHEEN, FATHATAN);
	public static final ArabicLetter SHEEN_WITH_DAMMATAN = new ArabicLetter(
			SHEEN, DAMMATAN);
	public static final ArabicLetter SHEEN_WITH_KASRATAN = new ArabicLetter(
			SHEEN, KASRATAN);
	public static final ArabicLetter SHEEN_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			SHEEN, SHADDA, FATHA);
	public static final ArabicLetter SHEEN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			SHEEN, SHADDA, DAMMA);
	public static final ArabicLetter SHEEN_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			SHEEN, SHADDA, KASRA);
	public static final ArabicLetter SAD_WITH_FATHA = new ArabicLetter(SAD,
			FATHA);
	public static final ArabicLetter SAD_WITH_DAMMA = new ArabicLetter(SAD,
			DAMMA);
	public static final ArabicLetter SAD_WITH_KASRA = new ArabicLetter(SAD,
			KASRA);
	public static final ArabicLetter SAD_WITH_SUKUN = new ArabicLetter(SAD,
			SUKUN);
	public static final ArabicLetter SAD_WITH_FATHATAN = new ArabicLetter(SAD,
			FATHATAN);
	public static final ArabicLetter SAD_WITH_DAMMATAN = new ArabicLetter(SAD,
			DAMMATAN);
	public static final ArabicLetter SAD_WITH_KASRATAN = new ArabicLetter(SAD,
			KASRATAN);
	public static final ArabicLetter SAD_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			SAD, SHADDA, FATHA);
	public static final ArabicLetter SAD_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			SAD, SHADDA, DAMMA);
	public static final ArabicLetter SAD_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			SAD, SHADDA, KASRA);
	public static final ArabicLetter DDAD_WITH_FATHA = new ArabicLetter(DDAD,
			FATHA);
	public static final ArabicLetter DDAD_WITH_DAMMA = new ArabicLetter(DDAD,
			DAMMA);
	public static final ArabicLetter DDAD_WITH_KASRA = new ArabicLetter(DDAD,
			KASRA);
	public static final ArabicLetter DDAD_WITH_SUKUN = new ArabicLetter(DDAD,
			SUKUN);
	public static final ArabicLetter DDAD_WITH_FATHATAN = new ArabicLetter(
			DDAD, FATHATAN);
	public static final ArabicLetter DDAD_WITH_DAMMATAN = new ArabicLetter(
			DDAD, DAMMATAN);
	public static final ArabicLetter DDAD_WITH_KASRATAN = new ArabicLetter(
			DDAD, KASRATAN);
	public static final ArabicLetter DDAD_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			DDAD, SHADDA, FATHA);
	public static final ArabicLetter DDAD_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			DDAD, SHADDA, DAMMA);
	public static final ArabicLetter DDAD_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			DDAD, SHADDA, KASRA);
	public static final ArabicLetter TTA_WITH_FATHA = new ArabicLetter(TTA,
			FATHA);
	public static final ArabicLetter TTA_WITH_DAMMA = new ArabicLetter(TTA,
			DAMMA);
	public static final ArabicLetter TTA_WITH_KASRA = new ArabicLetter(TTA,
			KASRA);
	public static final ArabicLetter TTA_WITH_SUKUN = new ArabicLetter(TTA,
			SUKUN);
	public static final ArabicLetter TTA_WITH_FATHATAN = new ArabicLetter(TTA,
			FATHATAN);
	public static final ArabicLetter TTA_WITH_DAMMATAN = new ArabicLetter(TTA,
			DAMMATAN);
	public static final ArabicLetter TTA_WITH_KASRATAN = new ArabicLetter(TTA,
			KASRATAN);
	public static final ArabicLetter TTA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			TTA, SHADDA, FATHA);
	public static final ArabicLetter TTA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			TTA, SHADDA, DAMMA);
	public static final ArabicLetter TTA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			TTA, SHADDA, KASRA);
	public static final ArabicLetter DTHA_WITH_FATHA = new ArabicLetter(DTHA,
			FATHA);
	public static final ArabicLetter DTHA_WITH_DAMMA = new ArabicLetter(DTHA,
			DAMMA);
	public static final ArabicLetter DTHA_WITH_KASRA = new ArabicLetter(DTHA,
			KASRA);
	public static final ArabicLetter DTHA_WITH_SUKUN = new ArabicLetter(DTHA,
			SUKUN);
	public static final ArabicLetter DTHA_WITH_FATHATAN = new ArabicLetter(
			DTHA, FATHATAN);
	public static final ArabicLetter DTHA_WITH_DAMMATAN = new ArabicLetter(
			DTHA, DAMMATAN);
	public static final ArabicLetter DTHA_WITH_KASRATAN = new ArabicLetter(
			DTHA, KASRATAN);
	public static final ArabicLetter DTHA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			DTHA, SHADDA, FATHA);
	public static final ArabicLetter DTHA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			DTHA, SHADDA, DAMMA);
	public static final ArabicLetter DTHA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			DTHA, SHADDA, KASRA);
	public static final ArabicLetter AIN_WITH_FATHA = new ArabicLetter(AIN,
			FATHA);
	public static final ArabicLetter AIN_WITH_DAMMA = new ArabicLetter(AIN,
			DAMMA);
	public static final ArabicLetter AIN_WITH_KASRA = new ArabicLetter(AIN,
			KASRA);
	public static final ArabicLetter AIN_WITH_SUKUN = new ArabicLetter(AIN,
			SUKUN);
	public static final ArabicLetter AIN_WITH_FATHATAN = new ArabicLetter(AIN,
			FATHATAN);
	public static final ArabicLetter AIN_WITH_DAMMATAN = new ArabicLetter(AIN,
			DAMMATAN);
	public static final ArabicLetter AIN_WITH_KASRATAN = new ArabicLetter(AIN,
			KASRATAN);
	public static final ArabicLetter AIN_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			AIN, SHADDA, FATHA);
	public static final ArabicLetter AIN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			AIN, SHADDA, DAMMA);
	public static final ArabicLetter AIN_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			AIN, SHADDA, KASRA);
	public static final ArabicLetter GHAIN_WITH_FATHA = new ArabicLetter(GHAIN,
			FATHA);
	public static final ArabicLetter GHAIN_WITH_DAMMA = new ArabicLetter(GHAIN,
			DAMMA);
	public static final ArabicLetter GHAIN_WITH_KASRA = new ArabicLetter(GHAIN,
			KASRA);
	public static final ArabicLetter GHAIN_WITH_SUKUN = new ArabicLetter(GHAIN,
			SUKUN);
	public static final ArabicLetter GHAIN_WITH_FATHATAN = new ArabicLetter(
			GHAIN, FATHATAN);
	public static final ArabicLetter GHAIN_WITH_DAMMATAN = new ArabicLetter(
			GHAIN, DAMMATAN);
	public static final ArabicLetter GHAIN_WITH_KASRATAN = new ArabicLetter(
			GHAIN, KASRATAN);
	public static final ArabicLetter GHAIN_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			GHAIN, SHADDA, FATHA);
	public static final ArabicLetter GHAIN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			GHAIN, SHADDA, DAMMA);
	public static final ArabicLetter GHAIN_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			GHAIN, SHADDA, KASRA);
	public static final ArabicLetter FA_WITH_FATHA = new ArabicLetter(FA, FATHA);
	public static final ArabicLetter FA_WITH_DAMMA = new ArabicLetter(FA, DAMMA);
	public static final ArabicLetter FA_WITH_KASRA = new ArabicLetter(FA, KASRA);
	public static final ArabicLetter FA_WITH_SUKUN = new ArabicLetter(FA, SUKUN);
	public static final ArabicLetter FA_WITH_FATHATAN = new ArabicLetter(FA,
			FATHATAN);
	public static final ArabicLetter FA_WITH_DAMMATAN = new ArabicLetter(FA,
			DAMMATAN);
	public static final ArabicLetter FA_WITH_KASRATAN = new ArabicLetter(FA,
			KASRATAN);
	public static final ArabicLetter FA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			FA, SHADDA, FATHA);
	public static final ArabicLetter FA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			FA, SHADDA, DAMMA);
	public static final ArabicLetter FA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			FA, SHADDA, KASRA);
	public static final ArabicLetter QAF_WITH_FATHA = new ArabicLetter(QAF,
			FATHA);
	public static final ArabicLetter QAF_WITH_DAMMA = new ArabicLetter(QAF,
			DAMMA);
	public static final ArabicLetter QAF_WITH_KASRA = new ArabicLetter(QAF,
			KASRA);
	public static final ArabicLetter QAF_WITH_SUKUN = new ArabicLetter(QAF,
			SUKUN);
	public static final ArabicLetter QAF_WITH_FATHATAN = new ArabicLetter(QAF,
			FATHATAN);
	public static final ArabicLetter QAF_WITH_DAMMATAN = new ArabicLetter(QAF,
			DAMMATAN);
	public static final ArabicLetter QAF_WITH_KASRATAN = new ArabicLetter(QAF,
			KASRATAN);
	public static final ArabicLetter QAF_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			QAF, SHADDA, FATHA);
	public static final ArabicLetter QAF_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			QAF, SHADDA, DAMMA);
	public static final ArabicLetter QAF_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			QAF, SHADDA, KASRA);
	public static final ArabicLetter KAF_WITH_FATHA = new ArabicLetter(KAF,
			FATHA);
	public static final ArabicLetter KAF_WITH_DAMMA = new ArabicLetter(KAF,
			DAMMA);
	public static final ArabicLetter KAF_WITH_KASRA = new ArabicLetter(KAF,
			KASRA);
	public static final ArabicLetter KAF_WITH_SUKUN = new ArabicLetter(KAF,
			SUKUN);
	public static final ArabicLetter KAF_WITH_FATHATAN = new ArabicLetter(KAF,
			FATHATAN);
	public static final ArabicLetter KAF_WITH_DAMMATAN = new ArabicLetter(KAF,
			DAMMATAN);
	public static final ArabicLetter KAF_WITH_KASRATAN = new ArabicLetter(KAF,
			KASRATAN);
	public static final ArabicLetter KAF_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			KAF, SHADDA, FATHA);
	public static final ArabicLetter KAF_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			KAF, SHADDA, DAMMA);
	public static final ArabicLetter KAF_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			KAF, SHADDA, KASRA);
	public static final ArabicLetter LAM_WITH_FATHA = new ArabicLetter(LAM,
			FATHA);
	public static final ArabicLetter LAM_WITH_DAMMA = new ArabicLetter(LAM,
			DAMMA);
	public static final ArabicLetter LAM_WITH_KASRA = new ArabicLetter(LAM,
			KASRA);
	public static final ArabicLetter LAM_WITH_SUKUN = new ArabicLetter(LAM,
			SUKUN);
	public static final ArabicLetter LAM_WITH_FATHATAN = new ArabicLetter(LAM,
			FATHATAN);
	public static final ArabicLetter LAM_WITH_DAMMATAN = new ArabicLetter(LAM,
			DAMMATAN);
	public static final ArabicLetter LAM_WITH_KASRATAN = new ArabicLetter(LAM,
			KASRATAN);
	public static final ArabicLetter LAM_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			LAM, SHADDA, FATHA);
	public static final ArabicLetter LAM_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			LAM, SHADDA, DAMMA);
	public static final ArabicLetter LAM_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			LAM, SHADDA, KASRA);
	public static final ArabicLetter MEEM_WITH_FATHA = new ArabicLetter(MEEM,
			FATHA);
	public static final ArabicLetter MEEM_WITH_DAMMA = new ArabicLetter(MEEM,
			DAMMA);
	public static final ArabicLetter MEEM_WITH_KASRA = new ArabicLetter(MEEM,
			KASRA);
	public static final ArabicLetter MEEM_WITH_SUKUN = new ArabicLetter(MEEM,
			SUKUN);
	public static final ArabicLetter MEEM_WITH_FATHATAN = new ArabicLetter(
			MEEM, FATHATAN);
	public static final ArabicLetter MEEM_WITH_DAMMATAN = new ArabicLetter(
			MEEM, DAMMATAN);
	public static final ArabicLetter MEEM_WITH_KASRATAN = new ArabicLetter(
			MEEM, KASRATAN);
	public static final ArabicLetter MEEM_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			MEEM, SHADDA, FATHA);
	public static final ArabicLetter MEEM_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			MEEM, SHADDA, DAMMA);
	public static final ArabicLetter MEEM_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			MEEM, SHADDA, KASRA);
	public static final ArabicLetter NOON_WITH_FATHA = new ArabicLetter(NOON,
			FATHA);
	public static final ArabicLetter NOON_WITH_DAMMA = new ArabicLetter(NOON,
			DAMMA);
	public static final ArabicLetter NOON_WITH_KASRA = new ArabicLetter(NOON,
			KASRA);
	public static final ArabicLetter NOON_WITH_SUKUN = new ArabicLetter(NOON,
			SUKUN);
	public static final ArabicLetter NOON_WITH_FATHATAN = new ArabicLetter(
			NOON, FATHATAN);
	public static final ArabicLetter NOON_WITH_DAMMATAN = new ArabicLetter(
			NOON, DAMMATAN);
	public static final ArabicLetter NOON_WITH_KASRATAN = new ArabicLetter(
			NOON, KASRATAN);
	public static final ArabicLetter NOON_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			NOON, SHADDA, FATHA);
	public static final ArabicLetter NOON_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			NOON, SHADDA, DAMMA);
	public static final ArabicLetter NOON_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			NOON, SHADDA, KASRA);
	public static final ArabicLetter WAW_WITH_FATHA = new ArabicLetter(WAW,
			FATHA);
	public static final ArabicLetter WAW_WITH_DAMMA = new ArabicLetter(WAW,
			DAMMA);
	public static final ArabicLetter WAW_WITH_KASRA = new ArabicLetter(WAW,
			KASRA);
	public static final ArabicLetter WAW_WITH_SUKUN = new ArabicLetter(WAW,
			SUKUN);
	public static final ArabicLetter WAW_WITH_FATHATAN = new ArabicLetter(WAW,
			FATHATAN);
	public static final ArabicLetter WAW_WITH_DAMMATAN = new ArabicLetter(WAW,
			DAMMATAN);
	public static final ArabicLetter WAW_WITH_KASRATAN = new ArabicLetter(WAW,
			KASRATAN);
	public static final ArabicLetter WAW_WITH_SHADDA_AND_FATHA = new ArabicLetter(
			WAW, SHADDA, FATHA);
	public static final ArabicLetter WAW_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
			WAW, SHADDA, DAMMA);
	public static final ArabicLetter WAW_WITH_SHADDA_AND_KASRA = new ArabicLetter(
			WAW, SHADDA, KASRA);
	public static final ArabicLetter WAW_WITH_SHADDA_AND_DAMMATAN = new ArabicLetter(
			WAW, SHADDA, DAMMATAN);
	public static final ArabicLetter TA_MARBUTA_WITH_DAMMATAN = new ArabicLetter(
			TA_MARBUTA, DAMMATAN);
	public static final ArabicLetter TA_MARBUTA_WITH_FATHATAN = new ArabicLetter(
			TA_MARBUTA, FATHATAN);
	public static final ArabicLetter TA_MARBUTA_WITH_KASRATAN = new ArabicLetter(
			TA_MARBUTA, KASRATAN);
	public static final ArabicLetter HAMZA_WITH_KASRA = new ArabicLetter(HAMZA,
			KASRA);
	public static final ArabicLetter HAMZA_WITH_FATHA = new ArabicLetter(HAMZA,
			FATHA);
	public static final ArabicLetter HAMZA_WITH_DAMMA = new ArabicLetter(HAMZA,
			DAMMA);
	public static final ArabicLetter HAMZA_WITH_SUKUN = new ArabicLetter(HAMZA,
			SUKUN);

	public static final ArabicWord WORD_SPACE = getWord(SPACE);
	public static final ArabicWord WORD_COMMA = getWord(COMMA);

	public static final ArabicWord BISMILLAH = fromBuckWalterString("bisomi All~ahi Alr~aHoma`ni Alr~aHiymi");
	public static final ArabicWord BISMILLAH_LONG = fromBuckWalterString("bi__________________________________________________________________somi All~ahi Alr~aHoma`ni Alr~aHiymi");
}
