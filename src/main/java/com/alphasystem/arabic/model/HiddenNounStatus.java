/**
 *
 */
package com.alphasystem.arabic.model;


import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum HiddenNounStatus implements SarfMemberType {

    NOMINATIVE_SINGULAR(getWord(MEEM, RA, FA, AIN, SPACE, MEEM, FA, RA, DAL)),

    NOMINATIVE_DUAL(getWord(MEEM, RA, FA, AIN, SPACE, MEEM, THA, NOON, ALIF_MAKSURA)),

    NOMINATIVE_PLURAL(getWord(MEEM, RA, FA, AIN, SPACE, JEEM, MEEM, AIN)),

    ACCUSATIVE_SINGULAR(getWord(MEEM, NOON, SAD, WAW, BA, SPACE, MEEM, FA, RA, DAL)),

    ACCUSATIVE_DUAL(getWord(MEEM, NOON, SAD, WAW, BA, SPACE, MEEM, THA, NOON, ALIF_MAKSURA)),

    ACCUSATIVE_PLURAL(getWord(MEEM, NOON, SAD, WAW, BA, SPACE, JEEM, MEEM, AIN)),

    GENITIVE_SINGULAR(getWord(MEEM, JEEM, RA, WAW, RA, SPACE, MEEM, FA, RA, DAL)),

    GENITIVE_DUAL(getWord(MEEM, JEEM, RA, WAW, RA, SPACE, MEEM, THA, NOON, ALIF_MAKSURA)),

    GENITIVE_PLURAL(getWord(MEEM, JEEM, RA, WAW, RA, SPACE, MEEM, THA, NOON, ALIF_MAKSURA));

    private final ArabicWord label;

    /**
     * @param label
     */
    HiddenNounStatus(ArabicWord label) {
        this.label = label;
    }

    @Override
    public ArabicWord getMemberTermLabel() {
        return label;
    }

    @Override
    public String getMemberTermName() {
        return name();
    }

}
