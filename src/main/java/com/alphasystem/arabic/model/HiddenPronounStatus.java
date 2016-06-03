/**
 *
 */
package com.alphasystem.arabic.model;


import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.concatenateWithSpace;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum HiddenPronounStatus implements SarfMemberType {

    THIRD_PERSON_MASCULINE_SINGULAR(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA), getWord(MEEM, THAL, KAF, RA),
            getWord(MEEM, FA, RA, DAL), ProNoun.THIRD_PERSON_MASCULINE_SINGULAR),

    THIRD_PERSON_MASCULINE_DUAL(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA), getWord(MEEM, THAL, KAF, RA),
            getWord(MEEM, THA, NOON, ALIF_MAKSURA), ProNoun.THIRD_PERSON_MASCULINE_DUAL),

    THIRD_PERSON_MASCULINE_PLURAL(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA), getWord(MEEM, THAL, KAF, RA),
            getWord(JEEM, MEEM, AIN), ProNoun.THIRD_PERSON_MASCULINE_PLURAL),

    THIRD_PERSON_FEMININE_SINGULAR(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA), getWord(MEEM, WAW_HAMZA_ABOVE, NOON, THA),
            getWord(MEEM, FA, RA, DAL), ProNoun.THIRD_PERSON_FEMININE_SINGULAR),

    THIRD_PERSON_FEMININE_DUAL(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA), getWord(MEEM, WAW_HAMZA_ABOVE, NOON, THA),
            getWord(MEEM, THA, NOON, ALIF_MAKSURA), ProNoun.THIRD_PERSON_FEMININE_DUAL),

    THIRD_PERSON_FEMININE_PLURAL(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA), getWord(MEEM, WAW_HAMZA_ABOVE, NOON, THA),
            getWord(JEEM, MEEM, AIN), ProNoun.THIRD_PERSON_FEMININE_PLURAL),

    SECOND_PERSON_MASCULINE_SINGULAR(getWord(MEEM, KHA, ALIF, TTA, BA), getWord(MEEM, THAL, KAF, RA),
            getWord(MEEM, FA, RA, DAL), ProNoun.SECOND_PERSON_MASCULINE_SINGULAR),

    SECOND_PERSON_MASCULINE_DUAL(getWord(MEEM, KHA, ALIF, TTA, BA), getWord(MEEM, THAL, KAF, RA),
            getWord(MEEM, THA, NOON, ALIF_MAKSURA), ProNoun.SECOND_PERSON_MASCULINE_DUAL),

    SECOND_PERSON_MASCULINE_PLURAL(getWord(MEEM, KHA, ALIF, TTA, BA), getWord(MEEM, THAL, KAF, RA),
            getWord(JEEM, MEEM, AIN), ProNoun.SECOND_PERSON_MASCULINE_PLURAL),

    SECOND_PERSON_FEMININE_SINGULAR(getWord(MEEM, KHA, ALIF, TTA, BA), getWord(MEEM, WAW_HAMZA_ABOVE, NOON, THA),
            getWord(MEEM, FA, RA, DAL), ProNoun.SECOND_PERSON_FEMININE_SINGULAR),

    SECOND_PERSON_FEMININE_DUAL(getWord(MEEM, KHA, ALIF, TTA, BA), getWord(MEEM, WAW_HAMZA_ABOVE, NOON, THA),
            getWord(MEEM, THA, NOON, ALIF_MAKSURA), ProNoun.SECOND_PERSON_FEMININE_DUAL),

    SECOND_PERSON_FEMININE_PLURAL(getWord(MEEM, KHA, ALIF, TTA, BA), getWord(MEEM, WAW_HAMZA_ABOVE, NOON, THA),
            getWord(JEEM, MEEM, AIN), ProNoun.SECOND_PERSON_FEMININE_PLURAL),

    FIRST_PERSON_SINGULAR(getWord(MEEM, TA, KAF, LAM, MEEM), getWord(SPACE),
            getWord(MEEM, FA, RA, DAL), ProNoun.FIRST_PERSON_SINGULAR),

    FIRST_PERSON_PLURAL(getWord(MEEM, TA, KAF, LAM, MEEM), getWord(SPACE),
            getWord(JEEM, MEEM, AIN), ProNoun.FIRST_PERSON_PLURAL);

    private final ProNoun proNoun;

    private final ArabicWord genderLabel;

    private final ArabicWord conversationLabel;

    private final ArabicWord numberLabel;

    /**
     * @param conversationLabel
     * @param genderLabel
     * @param numberLabel
     * @param proNoun
     */
    HiddenPronounStatus(ArabicWord conversationLabel, ArabicWord genderLabel, ArabicWord numberLabel, ProNoun proNoun) {
        this.conversationLabel = conversationLabel;
        this.genderLabel = genderLabel;
        this.numberLabel = numberLabel;
        this.proNoun = proNoun;
    }

    public ProNoun getProNoun() {
        return proNoun;
    }

    public ArabicWord getGenderLabel() {
        return genderLabel;
    }

    public ArabicWord getConversationLabel() {
        return conversationLabel;
    }

    public ArabicWord getNumberLabel() {
        return numberLabel;
    }

    @Override
    public ArabicWord getLabel() {
        return concatenateWithSpace(getConversationLabel(), getGenderLabel(), getNumberLabel());
    }

    public ArabicWord getGenderAndConversation(){
        return concatenateWithSpace(getGenderLabel(), getConversationLabel());
    }

    @Override
    public String getMemberTermName() {
        return name();
    }

}
