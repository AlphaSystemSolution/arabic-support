package com.alphasystem.arabic.model;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static java.lang.String.valueOf;

/**
 * @author sali
 */
public final class ArabicTool {

    public static ArabicWord getWord(ArabicLetterType... letterTypes) {
        List<ArabicLetter> list = new ArrayList<ArabicLetter>();
        for (ArabicLetterType arabicLetter : letterTypes) {
            list.add(new ArabicLetter(arabicLetter));
        }
        return new ArabicWord(list);
    }

    public static ArabicWord getArabicNumberWord(int value) {
        return getWord(getArabicNumber(value));
    }

    public static ArabicLetterType[] getArabicNumber(int value) {
        String s = valueOf(value);
        ArabicLetterType[] letters = new ArabicLetterType[s.length()];
        for (int i = 0; i < letters.length; i++) {
            char code = s.charAt(i);
            letters[i] = getByCode(code);
        }
        return letters;
    }

    public static ArabicWord getChapterNumber(int chapterNumber) {
        return getVerseChapterNumber(chapterNumber, -1, true, false, true);
    }

    public static ArabicWord getVerseChapterNumber(int chapterNumber,
                                                   int verseNumber, boolean includeChapterNumber,
                                                   boolean includeVerseNumber, boolean encloseBracket) {
        ArabicLetterType[] letters = new ArabicLetterType[0];
        if (encloseBracket) {
            letters = ArrayUtils.add(letters, ORNATE_RIGHT_PARENTHESIS);
        }
        if (includeChapterNumber) {
            letters = ArrayUtils.addAll(letters, getArabicNumber(chapterNumber));
        }

        if (includeVerseNumber) {
            if (includeChapterNumber) {
                letters = ArrayUtils.add(letters, SEMI_COLON);
            }
            letters = ArrayUtils.addAll(letters, getArabicNumber(verseNumber));
        }

        if (encloseBracket) {
            letters = ArrayUtils.add(letters, ORNATE_LEFT_PARENTHESIS);
        }
        return getWord(letters);
    }
}
