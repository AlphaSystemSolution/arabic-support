/**
 *
 */
package com.alphasystem.arabic.model;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.fromBuckWalterString;
import static com.alphasystem.arabic.model.ArabicWord.getWord;
import static com.alphasystem.arabic.model.DiacriticType.*;

/**
 * @author sali
 */
public interface ArabicLetters {

    ArabicLetter LETTER_TATWEEL = new ArabicLetter(TATWEEL);
    ArabicLetter LETTER_SPACE = new ArabicLetter(SPACE);
    ArabicLetter LETTER_COMMA = new ArabicLetter(COMMA);
    ArabicLetter LETTER_ALIF = new ArabicLetter(ALIF);
    ArabicLetter LETTER_YA = new ArabicLetter(YA);
    ArabicLetter LETTER_WAW = new ArabicLetter(WAW);
    ArabicLetter LETTER_ALIF_MAKSURA = new ArabicLetter(ALIF_MAKSURA);
    ArabicLetter ALIF_HAMZA_BELOW_WITH_KASRA = new ArabicLetter(ALIF_HAMZA_BELOW, KASRA);
    ArabicLetter ALIF_HAMZA_BELOW_WITH_DAMMA = new ArabicLetter(ALIF_HAMZA_BELOW, DAMMA);
    ArabicLetter ALIF_HAMZA_ABOVE_WITH_DAMMA = new ArabicLetter(ALIF_HAMZA_ABOVE, DAMMA);
    ArabicLetter ALIF_HAMZA_ABOVE_WITH_FATHA = new ArabicLetter(ALIF_HAMZA_ABOVE, FATHA);
    ArabicLetter ALIF_HAMZA_ABOVE_WITH_SUKUN = new ArabicLetter(ALIF_HAMZA_ABOVE, SUKUN);
    ArabicLetter YA_HAMZA_ABOVE_WITH_KASRA = new ArabicLetter(YA_HAMZA_ABOVE, KASRA);
    ArabicLetter WAW_HAMZA_ABOVE_WITH_SUKUN = new ArabicLetter(WAW_HAMZA_ABOVE, SUKUN);
    ArabicLetter YA_WITH_SUKUN = new ArabicLetter(YA, SUKUN);
    ArabicLetter YA_WITH_DAMMA = new ArabicLetter(YA, DAMMA);
    ArabicLetter YA_WITH_DAMMATAN = new ArabicLetter(YA, DAMMATAN);
    ArabicLetter YA_WITH_FATHA = new ArabicLetter(YA, FATHA);
    ArabicLetter YA_WITH_FATHATAN = new ArabicLetter(YA, FATHATAN);
    ArabicLetter BA_WITH_FATHA = new ArabicLetter(BA, FATHA);
    ArabicLetter BA_WITH_DAMMA = new ArabicLetter(BA, DAMMA);
    ArabicLetter BA_WITH_KASRA = new ArabicLetter(BA, KASRA);
    ArabicLetter BA_WITH_SUKUN = new ArabicLetter(BA, SUKUN);
    ArabicLetter BA_WITH_FATHATAN = new ArabicLetter(BA, FATHATAN);
    ArabicLetter BA_WITH_DAMMATAN = new ArabicLetter(BA, DAMMATAN);
    ArabicLetter BA_WITH_KASRATAN = new ArabicLetter(BA, KASRATAN);
    ArabicLetter BA_WITH_SHADDA_AND_FATHA = new ArabicLetter(BA, SHADDA, FATHA);
    ArabicLetter BA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(BA, SHADDA, DAMMA);
    ArabicLetter BA_WITH_SHADDA_AND_KASRA = new ArabicLetter(BA, SHADDA, KASRA);
    ArabicLetter TA_WITH_FATHA = new ArabicLetter(TA, FATHA);
    ArabicLetter TA_WITH_DAMMA = new ArabicLetter(TA, DAMMA);
    ArabicLetter TA_WITH_KASRA = new ArabicLetter(TA, KASRA);
    ArabicLetter TA_WITH_SUKUN = new ArabicLetter(TA, SUKUN);
    ArabicLetter TA_WITH_FATHATAN = new ArabicLetter(TA, FATHATAN);
    ArabicLetter TA_WITH_DAMMATAN = new ArabicLetter(TA, DAMMATAN);
    ArabicLetter TA_WITH_KASRATAN = new ArabicLetter(TA, KASRATAN);
    ArabicLetter TA_WITH_SHADDA_AND_FATHA = new ArabicLetter(TA, SHADDA, FATHA);
    ArabicLetter TA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(TA, SHADDA, DAMMA);
    ArabicLetter TA_WITH_SHADDA_AND_KASRA = new ArabicLetter(TA, SHADDA, KASRA);
    ArabicLetter THA_WITH_FATHA = new ArabicLetter(THA, FATHA);
    ArabicLetter THA_WITH_DAMMA = new ArabicLetter(THA, DAMMA);
    ArabicLetter THA_WITH_KASRA = new ArabicLetter(THA, KASRA);
    ArabicLetter THA_WITH_SUKUN = new ArabicLetter(THA, SUKUN);
    ArabicLetter THA_WITH_FATHATAN = new ArabicLetter(THA, FATHATAN);
    ArabicLetter THA_WITH_DAMMATAN = new ArabicLetter(THA, DAMMATAN);
    ArabicLetter THA_WITH_KASRATAN = new ArabicLetter(THA, KASRATAN);
    ArabicLetter THA_WITH_SHADDA_AND_FATHA = new ArabicLetter(THA, SHADDA, FATHA);
    ArabicLetter THA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(THA, SHADDA, DAMMA);
    ArabicLetter THA_WITH_SHADDA_AND_KASRA = new ArabicLetter(THA, SHADDA, KASRA);
    ArabicLetter JEEM_WITH_FATHA = new ArabicLetter(JEEM, FATHA);
    ArabicLetter JEEM_WITH_DAMMA = new ArabicLetter(JEEM, DAMMA);
    ArabicLetter JEEM_WITH_KASRA = new ArabicLetter(JEEM, KASRA);
    ArabicLetter JEEM_WITH_SUKUN = new ArabicLetter(JEEM, SUKUN);
    ArabicLetter JEEM_WITH_FATHATAN = new ArabicLetter(JEEM, FATHATAN);
    ArabicLetter JEEM_WITH_DAMMATAN = new ArabicLetter(JEEM, DAMMATAN);
    ArabicLetter JEEM_WITH_KASRATAN = new ArabicLetter(JEEM, KASRATAN);
    ArabicLetter JEEM_WITH_SHADDA_AND_FATHA = new ArabicLetter(JEEM, SHADDA, FATHA);
    ArabicLetter JEEM_WITH_SHADDA_AND_DAMMA = new ArabicLetter(JEEM, SHADDA, DAMMA);
    ArabicLetter JEEM_WITH_SHADDA_AND_KASRA = new ArabicLetter(JEEM, SHADDA, KASRA);
    ArabicLetter HHA_WITH_FATHA = new ArabicLetter(HHA, FATHA);
    ArabicLetter HHA_WITH_DAMMA = new ArabicLetter(HHA, DAMMA);
    ArabicLetter HHA_WITH_KASRA = new ArabicLetter(HHA, KASRA);
    ArabicLetter HHA_WITH_SUKUN = new ArabicLetter(HHA, SUKUN);
    ArabicLetter HHA_WITH_FATHATAN = new ArabicLetter(HHA, FATHATAN);
    ArabicLetter HHA_WITH_DAMMATAN = new ArabicLetter(HHA, DAMMATAN);
    ArabicLetter HHA_WITH_KASRATAN = new ArabicLetter(HHA, KASRATAN);
    ArabicLetter HHA_WITH_SHADDA_AND_FATHA = new ArabicLetter(HHA, SHADDA, FATHA);
    ArabicLetter HHA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(HHA, SHADDA, DAMMA);
    ArabicLetter HHA_WITH_SHADDA_AND_KASRA = new ArabicLetter(HHA, SHADDA, KASRA);
    ArabicLetter HA_WITH_FATHA = new ArabicLetter(HA, FATHA);
    ArabicLetter HA_WITH_DAMMA = new ArabicLetter(HA, DAMMA);
    ArabicLetter KHA_WITH_FATHA = new ArabicLetter(KHA, FATHA);
    ArabicLetter KHA_WITH_DAMMA = new ArabicLetter(KHA, DAMMA);
    ArabicLetter KHA_WITH_KASRA = new ArabicLetter(KHA, KASRA);
    ArabicLetter KHA_WITH_SUKUN = new ArabicLetter(KHA, SUKUN);
    ArabicLetter KHA_WITH_FATHATAN = new ArabicLetter(KHA, FATHATAN);
    ArabicLetter KHA_WITH_DAMMATAN = new ArabicLetter(KHA, DAMMATAN);
    ArabicLetter KHA_WITH_KASRATAN = new ArabicLetter(KHA, KASRATAN);
    ArabicLetter KHA_WITH_SHADDA_AND_FATHA = new ArabicLetter(KHA, SHADDA, FATHA);
    ArabicLetter KHA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(KHA, SHADDA, DAMMA);
    ArabicLetter KHA_WITH_SHADDA_AND_KASRA = new ArabicLetter(KHA, SHADDA, KASRA);
    ArabicLetter DAL_WITH_FATHA = new ArabicLetter(DAL, FATHA);
    ArabicLetter DAL_WITH_DAMMA = new ArabicLetter(DAL, DAMMA);
    ArabicLetter DAL_WITH_KASRA = new ArabicLetter(DAL, KASRA);
    ArabicLetter DAL_WITH_SUKUN = new ArabicLetter(DAL, SUKUN);
    ArabicLetter DAL_WITH_FATHATAN = new ArabicLetter(DAL, FATHATAN);
    ArabicLetter DAL_WITH_DAMMATAN = new ArabicLetter(DAL, DAMMATAN);
    ArabicLetter DAL_WITH_KASRATAN = new ArabicLetter(DAL, KASRATAN);
    ArabicLetter DAL_WITH_SHADDA_AND_FATHA = new ArabicLetter(DAL, SHADDA, FATHA);
    ArabicLetter DAL_WITH_SHADDA_AND_DAMMA = new ArabicLetter(DAL, SHADDA, DAMMA);
    ArabicLetter DAL_WITH_SHADDA_AND_KASRA = new ArabicLetter(DAL, SHADDA, KASRA);
    ArabicLetter THAL_WITH_FATHA = new ArabicLetter(THAL, FATHA);
    ArabicLetter THAL_WITH_DAMMA = new ArabicLetter(THAL, DAMMA);
    ArabicLetter THAL_WITH_KASRA = new ArabicLetter(THAL, KASRA);
    ArabicLetter THAL_WITH_SUKUN = new ArabicLetter(THAL, SUKUN);
    ArabicLetter THAL_WITH_FATHATAN = new ArabicLetter(THAL, FATHATAN);
    ArabicLetter THAL_WITH_DAMMATAN = new ArabicLetter(THAL, DAMMATAN);
    ArabicLetter THAL_WITH_KASRATAN = new ArabicLetter(THAL, KASRATAN);
    ArabicLetter THAL_WITH_SHADDA_AND_FATHA = new ArabicLetter(THAL, SHADDA, FATHA);
    ArabicLetter THAL_WITH_SHADDA_AND_DAMMA = new ArabicLetter(THAL, SHADDA, DAMMA);
    ArabicLetter THAL_WITH_SHADDA_AND_KASRA = new ArabicLetter(THAL, SHADDA, KASRA);
    ArabicLetter RA_WITH_FATHA = new ArabicLetter(RA, FATHA);
    ArabicLetter RA_WITH_DAMMA = new ArabicLetter(RA, DAMMA);
    ArabicLetter RA_WITH_KASRA = new ArabicLetter(RA, KASRA);
    ArabicLetter RA_WITH_SUKUN = new ArabicLetter(RA, SUKUN);
    ArabicLetter RA_WITH_FATHATAN = new ArabicLetter(RA, FATHATAN);
    ArabicLetter RA_WITH_DAMMATAN = new ArabicLetter(RA, DAMMATAN);
    ArabicLetter RA_WITH_KASRATAN = new ArabicLetter(RA, KASRATAN);
    ArabicLetter RA_WITH_SHADDA_AND_FATHA = new ArabicLetter(RA, SHADDA, FATHA);
    ArabicLetter RA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(RA, SHADDA, DAMMA);
    ArabicLetter RA_WITH_SHADDA_AND_KASRA = new ArabicLetter(RA, SHADDA, KASRA);
    ArabicLetter ZAIN_WITH_FATHA = new ArabicLetter(ZAIN, FATHA);
    ArabicLetter ZAIN_WITH_DAMMA = new ArabicLetter(ZAIN, DAMMA);
    ArabicLetter ZAIN_WITH_KASRA = new ArabicLetter(ZAIN, KASRA);
    ArabicLetter ZAIN_WITH_SUKUN = new ArabicLetter(ZAIN, SUKUN);
    ArabicLetter ZAIN_WITH_FATHATAN = new ArabicLetter(ZAIN, FATHATAN);
    ArabicLetter ZAIN_WITH_DAMMATAN = new ArabicLetter(ZAIN, DAMMATAN);
    ArabicLetter ZAIN_WITH_KASRATAN = new ArabicLetter(ZAIN, KASRATAN);
    ArabicLetter ZAIN_WITH_SHADDA_AND_FATHA = new ArabicLetter(ZAIN, SHADDA, FATHA);
    ArabicLetter ZAIN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(ZAIN, SHADDA, DAMMA);
    ArabicLetter ZAIN_WITH_SHADDA_AND_KASRA = new ArabicLetter(ZAIN, SHADDA, KASRA);
    ArabicLetter SEEN_WITH_FATHA = new ArabicLetter(SEEN, FATHA);
    ArabicLetter SEEN_WITH_DAMMA = new ArabicLetter(SEEN, DAMMA);
    ArabicLetter SEEN_WITH_KASRA = new ArabicLetter(SEEN, KASRA);
    ArabicLetter SEEN_WITH_SUKUN = new ArabicLetter(SEEN, SUKUN);
    ArabicLetter SEEN_WITH_FATHATAN = new ArabicLetter(SEEN, FATHATAN);
    ArabicLetter SEEN_WITH_DAMMATAN = new ArabicLetter(
            SEEN, DAMMATAN);
    ArabicLetter SEEN_WITH_KASRATAN = new ArabicLetter(
            SEEN, KASRATAN);
    ArabicLetter SEEN_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            SEEN, SHADDA, FATHA);
    ArabicLetter SEEN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            SEEN, SHADDA, DAMMA);
    ArabicLetter SEEN_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            SEEN, SHADDA, KASRA);
    ArabicLetter SHEEN_WITH_FATHA = new ArabicLetter(SHEEN,
            FATHA);
    ArabicLetter SHEEN_WITH_DAMMA = new ArabicLetter(SHEEN,
            DAMMA);
    ArabicLetter SHEEN_WITH_KASRA = new ArabicLetter(SHEEN,
            KASRA);
    ArabicLetter SHEEN_WITH_SUKUN = new ArabicLetter(SHEEN,
            SUKUN);
    ArabicLetter SHEEN_WITH_FATHATAN = new ArabicLetter(
            SHEEN, FATHATAN);
    ArabicLetter SHEEN_WITH_DAMMATAN = new ArabicLetter(
            SHEEN, DAMMATAN);
    ArabicLetter SHEEN_WITH_KASRATAN = new ArabicLetter(
            SHEEN, KASRATAN);
    ArabicLetter SHEEN_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            SHEEN, SHADDA, FATHA);
    ArabicLetter SHEEN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            SHEEN, SHADDA, DAMMA);
    ArabicLetter SHEEN_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            SHEEN, SHADDA, KASRA);
    ArabicLetter SAD_WITH_FATHA = new ArabicLetter(SAD,
            FATHA);
    ArabicLetter SAD_WITH_DAMMA = new ArabicLetter(SAD,
            DAMMA);
    ArabicLetter SAD_WITH_KASRA = new ArabicLetter(SAD,
            KASRA);
    ArabicLetter SAD_WITH_SUKUN = new ArabicLetter(SAD,
            SUKUN);
    ArabicLetter SAD_WITH_FATHATAN = new ArabicLetter(SAD,
            FATHATAN);
    ArabicLetter SAD_WITH_DAMMATAN = new ArabicLetter(SAD,
            DAMMATAN);
    ArabicLetter SAD_WITH_KASRATAN = new ArabicLetter(SAD,
            KASRATAN);
    ArabicLetter SAD_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            SAD, SHADDA, FATHA);
    ArabicLetter SAD_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            SAD, SHADDA, DAMMA);
    ArabicLetter SAD_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            SAD, SHADDA, KASRA);
    ArabicLetter DDAD_WITH_FATHA = new ArabicLetter(DDAD,
            FATHA);
    ArabicLetter DDAD_WITH_DAMMA = new ArabicLetter(DDAD,
            DAMMA);
    ArabicLetter DDAD_WITH_KASRA = new ArabicLetter(DDAD,
            KASRA);
    ArabicLetter DDAD_WITH_SUKUN = new ArabicLetter(DDAD,
            SUKUN);
    ArabicLetter DDAD_WITH_FATHATAN = new ArabicLetter(
            DDAD, FATHATAN);
    ArabicLetter DDAD_WITH_DAMMATAN = new ArabicLetter(
            DDAD, DAMMATAN);
    ArabicLetter DDAD_WITH_KASRATAN = new ArabicLetter(
            DDAD, KASRATAN);
    ArabicLetter DDAD_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            DDAD, SHADDA, FATHA);
    ArabicLetter DDAD_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            DDAD, SHADDA, DAMMA);
    ArabicLetter DDAD_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            DDAD, SHADDA, KASRA);
    ArabicLetter TTA_WITH_FATHA = new ArabicLetter(TTA,
            FATHA);
    ArabicLetter TTA_WITH_DAMMA = new ArabicLetter(TTA,
            DAMMA);
    ArabicLetter TTA_WITH_KASRA = new ArabicLetter(TTA,
            KASRA);
    ArabicLetter TTA_WITH_SUKUN = new ArabicLetter(TTA,
            SUKUN);
    ArabicLetter TTA_WITH_FATHATAN = new ArabicLetter(TTA,
            FATHATAN);
    ArabicLetter TTA_WITH_DAMMATAN = new ArabicLetter(TTA,
            DAMMATAN);
    ArabicLetter TTA_WITH_KASRATAN = new ArabicLetter(TTA,
            KASRATAN);
    ArabicLetter TTA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            TTA, SHADDA, FATHA);
    ArabicLetter TTA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            TTA, SHADDA, DAMMA);
    ArabicLetter TTA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            TTA, SHADDA, KASRA);
    ArabicLetter DTHA_WITH_FATHA = new ArabicLetter(DTHA,
            FATHA);
    ArabicLetter DTHA_WITH_DAMMA = new ArabicLetter(DTHA,
            DAMMA);
    ArabicLetter DTHA_WITH_KASRA = new ArabicLetter(DTHA,
            KASRA);
    ArabicLetter DTHA_WITH_SUKUN = new ArabicLetter(DTHA,
            SUKUN);
    ArabicLetter DTHA_WITH_FATHATAN = new ArabicLetter(
            DTHA, FATHATAN);
    ArabicLetter DTHA_WITH_DAMMATAN = new ArabicLetter(
            DTHA, DAMMATAN);
    ArabicLetter DTHA_WITH_KASRATAN = new ArabicLetter(
            DTHA, KASRATAN);
    ArabicLetter DTHA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            DTHA, SHADDA, FATHA);
    ArabicLetter DTHA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            DTHA, SHADDA, DAMMA);
    ArabicLetter DTHA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            DTHA, SHADDA, KASRA);
    ArabicLetter AIN_WITH_FATHA = new ArabicLetter(AIN,
            FATHA);
    ArabicLetter AIN_WITH_DAMMA = new ArabicLetter(AIN,
            DAMMA);
    ArabicLetter AIN_WITH_KASRA = new ArabicLetter(AIN,
            KASRA);
    ArabicLetter AIN_WITH_SUKUN = new ArabicLetter(AIN,
            SUKUN);
    ArabicLetter AIN_WITH_FATHATAN = new ArabicLetter(AIN,
            FATHATAN);
    ArabicLetter AIN_WITH_DAMMATAN = new ArabicLetter(AIN,
            DAMMATAN);
    ArabicLetter AIN_WITH_KASRATAN = new ArabicLetter(AIN,
            KASRATAN);
    ArabicLetter AIN_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            AIN, SHADDA, FATHA);
    ArabicLetter AIN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            AIN, SHADDA, DAMMA);
    ArabicLetter AIN_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            AIN, SHADDA, KASRA);
    ArabicLetter GHAIN_WITH_FATHA = new ArabicLetter(GHAIN,
            FATHA);
    ArabicLetter GHAIN_WITH_DAMMA = new ArabicLetter(GHAIN,
            DAMMA);
    ArabicLetter GHAIN_WITH_KASRA = new ArabicLetter(GHAIN,
            KASRA);
    ArabicLetter GHAIN_WITH_SUKUN = new ArabicLetter(GHAIN,
            SUKUN);
    ArabicLetter GHAIN_WITH_FATHATAN = new ArabicLetter(
            GHAIN, FATHATAN);
    ArabicLetter GHAIN_WITH_DAMMATAN = new ArabicLetter(
            GHAIN, DAMMATAN);
    ArabicLetter GHAIN_WITH_KASRATAN = new ArabicLetter(
            GHAIN, KASRATAN);
    ArabicLetter GHAIN_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            GHAIN, SHADDA, FATHA);
    ArabicLetter GHAIN_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            GHAIN, SHADDA, DAMMA);
    ArabicLetter GHAIN_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            GHAIN, SHADDA, KASRA);
    ArabicLetter FA_WITH_FATHA = new ArabicLetter(FA, FATHA);
    ArabicLetter FA_WITH_DAMMA = new ArabicLetter(FA, DAMMA);
    ArabicLetter FA_WITH_KASRA = new ArabicLetter(FA, KASRA);
    ArabicLetter FA_WITH_SUKUN = new ArabicLetter(FA, SUKUN);
    ArabicLetter FA_WITH_FATHATAN = new ArabicLetter(FA,
            FATHATAN);
    ArabicLetter FA_WITH_DAMMATAN = new ArabicLetter(FA,
            DAMMATAN);
    ArabicLetter FA_WITH_KASRATAN = new ArabicLetter(FA,
            KASRATAN);
    ArabicLetter FA_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            FA, SHADDA, FATHA);
    ArabicLetter FA_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            FA, SHADDA, DAMMA);
    ArabicLetter FA_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            FA, SHADDA, KASRA);
    ArabicLetter QAF_WITH_FATHA = new ArabicLetter(QAF,
            FATHA);
    ArabicLetter QAF_WITH_DAMMA = new ArabicLetter(QAF,
            DAMMA);
    ArabicLetter QAF_WITH_KASRA = new ArabicLetter(QAF,
            KASRA);
    ArabicLetter QAF_WITH_SUKUN = new ArabicLetter(QAF,
            SUKUN);
    ArabicLetter QAF_WITH_FATHATAN = new ArabicLetter(QAF,
            FATHATAN);
    ArabicLetter QAF_WITH_DAMMATAN = new ArabicLetter(QAF,
            DAMMATAN);
    ArabicLetter QAF_WITH_KASRATAN = new ArabicLetter(QAF,
            KASRATAN);
    ArabicLetter QAF_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            QAF, SHADDA, FATHA);
    ArabicLetter QAF_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            QAF, SHADDA, DAMMA);
    ArabicLetter QAF_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            QAF, SHADDA, KASRA);
    ArabicLetter KAF_WITH_FATHA = new ArabicLetter(KAF,
            FATHA);
    ArabicLetter KAF_WITH_DAMMA = new ArabicLetter(KAF,
            DAMMA);
    ArabicLetter KAF_WITH_KASRA = new ArabicLetter(KAF,
            KASRA);
    ArabicLetter KAF_WITH_SUKUN = new ArabicLetter(KAF,
            SUKUN);
    ArabicLetter KAF_WITH_FATHATAN = new ArabicLetter(KAF,
            FATHATAN);
    ArabicLetter KAF_WITH_DAMMATAN = new ArabicLetter(KAF,
            DAMMATAN);
    ArabicLetter KAF_WITH_KASRATAN = new ArabicLetter(KAF,
            KASRATAN);
    ArabicLetter KAF_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            KAF, SHADDA, FATHA);
    ArabicLetter KAF_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            KAF, SHADDA, DAMMA);
    ArabicLetter KAF_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            KAF, SHADDA, KASRA);
    ArabicLetter LAM_WITH_FATHA = new ArabicLetter(LAM,
            FATHA);
    ArabicLetter LAM_WITH_DAMMA = new ArabicLetter(LAM,
            DAMMA);
    ArabicLetter LAM_WITH_KASRA = new ArabicLetter(LAM,
            KASRA);
    ArabicLetter LAM_WITH_SUKUN = new ArabicLetter(LAM,
            SUKUN);
    ArabicLetter LAM_WITH_FATHATAN = new ArabicLetter(LAM,
            FATHATAN);
    ArabicLetter LAM_WITH_DAMMATAN = new ArabicLetter(LAM,
            DAMMATAN);
    ArabicLetter LAM_WITH_KASRATAN = new ArabicLetter(LAM,
            KASRATAN);
    ArabicLetter LAM_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            LAM, SHADDA, FATHA);
    ArabicLetter LAM_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            LAM, SHADDA, DAMMA);
    ArabicLetter LAM_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            LAM, SHADDA, KASRA);
    ArabicLetter MEEM_WITH_FATHA = new ArabicLetter(MEEM,
            FATHA);
    ArabicLetter MEEM_WITH_DAMMA = new ArabicLetter(MEEM,
            DAMMA);
    ArabicLetter MEEM_WITH_KASRA = new ArabicLetter(MEEM,
            KASRA);
    ArabicLetter MEEM_WITH_SUKUN = new ArabicLetter(MEEM,
            SUKUN);
    ArabicLetter MEEM_WITH_FATHATAN = new ArabicLetter(
            MEEM, FATHATAN);
    ArabicLetter MEEM_WITH_DAMMATAN = new ArabicLetter(
            MEEM, DAMMATAN);
    ArabicLetter MEEM_WITH_KASRATAN = new ArabicLetter(
            MEEM, KASRATAN);
    ArabicLetter MEEM_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            MEEM, SHADDA, FATHA);
    ArabicLetter MEEM_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            MEEM, SHADDA, DAMMA);
    ArabicLetter MEEM_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            MEEM, SHADDA, KASRA);
    ArabicLetter NOON_WITH_FATHA = new ArabicLetter(NOON,
            FATHA);
    ArabicLetter NOON_WITH_DAMMA = new ArabicLetter(NOON,
            DAMMA);
    ArabicLetter NOON_WITH_KASRA = new ArabicLetter(NOON,
            KASRA);
    ArabicLetter NOON_WITH_SUKUN = new ArabicLetter(NOON,
            SUKUN);
    ArabicLetter NOON_WITH_FATHATAN = new ArabicLetter(
            NOON, FATHATAN);
    ArabicLetter NOON_WITH_DAMMATAN = new ArabicLetter(
            NOON, DAMMATAN);
    ArabicLetter NOON_WITH_KASRATAN = new ArabicLetter(
            NOON, KASRATAN);
    ArabicLetter NOON_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            NOON, SHADDA, FATHA);
    ArabicLetter NOON_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            NOON, SHADDA, DAMMA);
    ArabicLetter NOON_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            NOON, SHADDA, KASRA);
    ArabicLetter WAW_WITH_FATHA = new ArabicLetter(WAW,
            FATHA);
    ArabicLetter WAW_WITH_DAMMA = new ArabicLetter(WAW,
            DAMMA);
    ArabicLetter WAW_WITH_KASRA = new ArabicLetter(WAW,
            KASRA);
    ArabicLetter WAW_WITH_SUKUN = new ArabicLetter(WAW,
            SUKUN);
    ArabicLetter WAW_WITH_FATHATAN = new ArabicLetter(WAW,
            FATHATAN);
    ArabicLetter WAW_WITH_DAMMATAN = new ArabicLetter(WAW,
            DAMMATAN);
    ArabicLetter WAW_WITH_KASRATAN = new ArabicLetter(WAW,
            KASRATAN);
    ArabicLetter WAW_WITH_SHADDA_AND_FATHA = new ArabicLetter(
            WAW, SHADDA, FATHA);
    ArabicLetter WAW_WITH_SHADDA_AND_DAMMA = new ArabicLetter(
            WAW, SHADDA, DAMMA);
    ArabicLetter WAW_WITH_SHADDA_AND_KASRA = new ArabicLetter(
            WAW, SHADDA, KASRA);
    ArabicLetter WAW_WITH_SHADDA_AND_DAMMATAN = new ArabicLetter(
            WAW, SHADDA, DAMMATAN);
    ArabicLetter TA_MARBUTA_WITH_DAMMATAN = new ArabicLetter(
            TA_MARBUTA, DAMMATAN);
    ArabicLetter TA_MARBUTA_WITH_FATHATAN = new ArabicLetter(
            TA_MARBUTA, FATHATAN);
    ArabicLetter TA_MARBUTA_WITH_KASRATAN = new ArabicLetter(
            TA_MARBUTA, KASRATAN);
    ArabicLetter HAMZA_WITH_KASRA = new ArabicLetter(HAMZA,
            KASRA);
    ArabicLetter HAMZA_WITH_FATHA = new ArabicLetter(HAMZA,
            FATHA);
    ArabicLetter HAMZA_WITH_DAMMA = new ArabicLetter(HAMZA,
            DAMMA);
    ArabicLetter HAMZA_WITH_SUKUN = new ArabicLetter(HAMZA,
            SUKUN);

    ArabicWord WORD_SPACE = getWord(SPACE);
    ArabicWord WORD_COMMA = getWord(COMMA);
    ArabicWord WORD_TATWEEL = getWord(LETTER_TATWEEL);

    ArabicWord BISMILLAH = fromBuckWalterString("bisomi All~ahi Alr~aHoma`ni Alr~aHiymi");
    ArabicWord BISMILLAH_LONG = fromBuckWalterString("bi__________________________________________________________________somi All~ahi Alr~aHoma`ni Alr~aHiymi");
}
