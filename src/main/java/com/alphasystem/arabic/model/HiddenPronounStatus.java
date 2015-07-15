/**
 *
 */
package com.alphasystem.arabic.model;


import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum HiddenPronounStatus implements SarfMemberType {

    THIRD_PERSON_MASCULINE_SINGULAR(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA, SPACE, MEEM, THAL, KAF, RA,
            SPACE, MEEM, FA, RA, DAL)),

    THIRD_PERSON_MASCULINE_DUAL(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA, SPACE, MEEM, THAL, KAF, RA,
            SPACE, MEEM, THA, NOON, ALIF_MAKSURA)),

    THIRD_PERSON_MASCULINE_PLURAL(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA, SPACE, MEEM, THAL, KAF, RA,
            SPACE, JEEM, MEEM, AIN)),

    THIRD_PERSON_FEMININE_SINGULAR(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA, SPACE, MEEM, WAW_HAMZA_ABOVE, NOON, THA,
            SPACE, MEEM, FA, RA, DAL)),

    THIRD_PERSON_FEMININE_DUAL(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA, SPACE, MEEM, WAW_HAMZA_ABOVE, NOON, THA,
            SPACE, MEEM, THA, NOON, ALIF_MAKSURA)),

    THIRD_PERSON_FEMININE_PLURAL(getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA, SPACE, MEEM, WAW_HAMZA_ABOVE, NOON, THA,
            SPACE, JEEM, MEEM, AIN)),

    SECOND_PERSON_MASCULINE_SINGULAR(getWord(MEEM, KHA, ALIF, TTA, BA, SPACE, MEEM, THAL, KAF, RA,
            SPACE, MEEM, FA, RA, DAL)),

    SECOND_PERSON_MASCULINE_DUAL(getWord(MEEM, KHA, ALIF, TTA, BA, SPACE, MEEM, THAL, KAF, RA,
            SPACE, MEEM, THA, NOON, ALIF_MAKSURA)),

    SECOND_PERSON_MASCULINE_PLURAL(getWord(MEEM, KHA, ALIF, TTA, BA, SPACE, MEEM, THAL, KAF, RA,
            SPACE, JEEM, MEEM, AIN)),

    SECOND_PERSON_FEMININE_SINGULAR(getWord(MEEM, KHA, ALIF, TTA, BA, SPACE, MEEM, WAW_HAMZA_ABOVE, NOON, THA,
            SPACE, MEEM, FA, RA, DAL)),

    SECOND_PERSON_FEMININE_DUAL(getWord(MEEM, KHA, ALIF, TTA, BA, SPACE, MEEM, WAW_HAMZA_ABOVE, NOON, THA,
            SPACE, MEEM, THA, NOON, ALIF_MAKSURA)),

    SECOND_PERSON_FEMININE_PLURAL(getWord(MEEM, KHA, ALIF, TTA, BA, SPACE, MEEM, WAW_HAMZA_ABOVE, NOON, THA,
            SPACE, JEEM, MEEM, AIN)),

    FIRST_PERSON_SINGULAR(getWord(MEEM, TA, KHA, LAM, MEEM, SPACE, MEEM, FA, RA, DAL)),

    FIRST_PERSON_PLURAL(getWord(MEEM, TA, KHA, LAM, MEEM, SPACE, MEEM, JEEM, MEEM, AIN));

    private final ArabicWord label;

    /**
     * @param label
     */
    HiddenPronounStatus(ArabicWord label) {
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
