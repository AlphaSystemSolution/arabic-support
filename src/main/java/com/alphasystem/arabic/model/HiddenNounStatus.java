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
public enum HiddenNounStatus implements SarfMemberType {

    NOMINATIVE_SINGULAR(getWord(MEEM, RA, FA, WAW, AIN), getWord(MEEM, FA, RA, DAL)),

    NOMINATIVE_DUAL(getWord(MEEM, RA, FA, WAW, AIN), getWord(MEEM, THA, NOON, ALIF_MAKSURA)),

    NOMINATIVE_PLURAL(getWord(MEEM, RA, FA, WAW, AIN), getWord(JEEM, MEEM, AIN)),

    ACCUSATIVE_SINGULAR(getWord(MEEM, NOON, SAD, WAW, BA), getWord(MEEM, FA, RA, DAL)),

    ACCUSATIVE_DUAL(getWord(MEEM, NOON, SAD, WAW, BA), getWord(MEEM, THA, NOON, ALIF_MAKSURA)),

    ACCUSATIVE_PLURAL(getWord(MEEM, NOON, SAD, WAW, BA), getWord(JEEM, MEEM, AIN)),

    GENITIVE_SINGULAR(getWord(MEEM, JEEM, RA, WAW, RA), getWord(MEEM, FA, RA, DAL)),

    GENITIVE_DUAL(getWord(MEEM, JEEM, RA, WAW, RA), getWord(MEEM, THA, NOON, ALIF_MAKSURA)),

    GENITIVE_PLURAL(getWord(MEEM, JEEM, RA, WAW, RA), getWord(MEEM, THA, NOON, ALIF_MAKSURA));

    private final ArabicWord label;

    private final ArabicWord numberLabel;

    /**
     * @param numberLabel
     * @param label
     */
    HiddenNounStatus(ArabicWord label, ArabicWord numberLabel) {
        this.label = label;
        this.numberLabel = numberLabel;
    }

    @Override
    public ArabicWord getMemberTermLabel() {
        return concatenateWithSpace(getLabel(), getNumberLabel());
    }

    public ArabicWord getNumberLabel() {
        return numberLabel;
    }

    @Override
    public ArabicWord getLabel() {
        return label;
    }


    @Override
    public String getMemberTermName() {
        return name();
    }

}
