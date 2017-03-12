package com.alphasystem.arabic.model;

import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicLetterType.HA;
import static com.alphasystem.arabic.model.ArabicLetterType.HHA;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.TA;
import static com.alphasystem.arabic.model.ArabicLetterType.WAW;
import static com.alphasystem.arabic.model.ArabicLetterType.YA;
import static com.alphasystem.arabic.model.ArabicWord.getWord;
import static com.alphasystem.arabic.model.DiacriticType.DAMMA;
import static com.alphasystem.arabic.model.DiacriticType.FATHA;
import static com.alphasystem.arabic.model.DiacriticType.KASRA;
import static com.alphasystem.arabic.model.DiacriticType.SHADDA;
import static com.alphasystem.arabic.model.DiacriticType.SUKUN;

/**
 * @author sali
 */
public enum ProNoun {

    THIRD_PERSON_MASCULINE_SINGULAR(getWord(new ArabicLetter(HA, DAMMA), new ArabicLetter(WAW, FATHA))),

    THIRD_PERSON_MASCULINE_DUAL(getWord(new ArabicLetter(HA, DAMMA), new ArabicLetter(MEEM, FATHA),
            new ArabicLetter(ALIF))),

    THIRD_PERSON_MASCULINE_PLURAL(getWord(new ArabicLetter(HA, DAMMA), new ArabicLetter(MEEM, SUKUN))),

    THIRD_PERSON_FEMININE_SINGULAR(getWord(new ArabicLetter(HA, KASRA), new ArabicLetter(YA, FATHA))),

    THIRD_PERSON_FEMININE_DUAL(getWord(new ArabicLetter(HA, DAMMA), new ArabicLetter(MEEM, FATHA),
            new ArabicLetter(ALIF))),

    THIRD_PERSON_FEMININE_PLURAL(getWord(new ArabicLetter(HA, DAMMA), new ArabicLetter(NOON, SHADDA, FATHA))),

    SECOND_PERSON_MASCULINE_SINGULAR(getWord(new ArabicLetter(ALIF_HAMZA_ABOVE, FATHA),
            new ArabicLetter(NOON, SUKUN), new ArabicLetter(TA, FATHA))),

    SECOND_PERSON_MASCULINE_DUAL(getWord(new ArabicLetter(ALIF_HAMZA_ABOVE, FATHA), new ArabicLetter(NOON, SUKUN),
            new ArabicLetter(TA, DAMMA), new ArabicLetter(MEEM, FATHA), new ArabicLetter(ALIF))),

    SECOND_PERSON_MASCULINE_PLURAL(getWord(new ArabicLetter(ALIF_HAMZA_ABOVE, FATHA), new ArabicLetter(NOON, SUKUN),
            new ArabicLetter(TA, DAMMA), new ArabicLetter(MEEM, SUKUN))),

    SECOND_PERSON_FEMININE_SINGULAR(getWord(new ArabicLetter(ALIF_HAMZA_ABOVE, FATHA), new ArabicLetter(NOON, SUKUN),
            new ArabicLetter(TA, KASRA))),

    SECOND_PERSON_FEMININE_DUAL(getWord(new ArabicLetter(ALIF_HAMZA_ABOVE, FATHA), new ArabicLetter(NOON, SUKUN),
            new ArabicLetter(TA, DAMMA), new ArabicLetter(MEEM, FATHA), new ArabicLetter(ALIF))),

    SECOND_PERSON_FEMININE_PLURAL(getWord(new ArabicLetter(ALIF_HAMZA_ABOVE, FATHA), new ArabicLetter(NOON, SUKUN),
            new ArabicLetter(TA, DAMMA), new ArabicLetter(NOON, SHADDA, FATHA))),

    FIRST_PERSON_SINGULAR(getWord(new ArabicLetter(ALIF_HAMZA_ABOVE, FATHA), new ArabicLetter(NOON, FATHA),
            new ArabicLetter(ALIF))),

    FIRST_PERSON_PLURAL(getWord(new ArabicLetter(NOON, FATHA), new ArabicLetter(HHA, SUKUN),
            new ArabicLetter(NOON, DAMMA)));

    private final ArabicWord label;

    ProNoun(ArabicWord label) {
        this.label = label;
    }

    public ArabicWord getLabel() {
        return label;
    }
}
