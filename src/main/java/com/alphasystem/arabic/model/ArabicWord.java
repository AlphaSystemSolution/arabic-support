/**
 *
 */
package com.alphasystem.arabic.model;

import org.apache.commons.lang3.ArrayUtils;

import javax.xml.bind.annotation.*;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicLetters.*;
import static com.alphasystem.util.AppUtil.isInstanceOf;
import static com.alphasystem.util.HashCodeUtil.hash;
import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.lang.System.err;
import static java.util.Collections.addAll;
import static org.apache.commons.lang3.ArrayUtils.*;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArabicWordType", propOrder = {"letters"})
public class ArabicWord implements ArabicSupport, Serializable, Comparable<ArabicWord> {

    private static final long serialVersionUID = -8680553361456269317L;
    @XmlElementWrapper
    @XmlElement(name = "arabic-letter", namespace = "http://www.alphasystem.com/arabic/support")
    private ArabicLetter[] letters;
    @XmlTransient
    private String buckWalterString;
    @XmlTransient
    private String unicodeString;
    @XmlTransient
    private String htmlCodeString;

    public ArabicWord() {
        this((ArabicLetter[]) null);
    }

    /**
     * @param letters
     */
    @ConstructorProperties({"letters"})
    public ArabicWord(ArabicLetter... letters) {
        this.letters = new ArabicLetter[0];
        if (isNotEmpty(letters)) {
            this.letters = ArrayUtils.addAll(this.letters, letters);
        }
        convert();
    }

    @ConstructorProperties({"letter", "diacriticType"})
    public ArabicWord(ArabicLetterType letter, DiacriticType diacriticType) {
        this(new ArabicLetter(letter, diacriticType));
    }

    /**
     * @param src
     */
    public ArabicWord(ArabicWord src) {
        ArabicLetter[] srcLetters = src.getLetters();
        int length = srcLetters == null ? 0 : srcLetters.length;
        this.letters = new ArabicLetter[length];
        for (int i = 0; i < length; i++) {
            this.letters[i] = new ArabicLetter(srcLetters[i]);
        }
        convert();
    }

    @ConstructorProperties({"letterList"})
    public ArabicWord(List<ArabicLetter> letterList) {
        this(letterList.toArray(new ArabicLetter[0]));
    }

    public static ArabicWord concatenate(ArabicWord... words) {
        List<ArabicLetter> letters = new ArrayList<ArabicLetter>();
        ArabicLetter[] arabicLetters = words[0].getLetters();
        if (!isEmpty(arabicLetters)) {
            addAll(letters, arabicLetters);
        }
        for (int i = 1; i < words.length; i++) {
            arabicLetters = words[i].getLetters();
            if (!isEmpty(arabicLetters)) {
                addAll(letters, arabicLetters);
            }
        }
        return new ArabicWord(letters);
    }

    public static ArabicWord concatenateWithAnd(ArabicWord... words) {
        List<ArabicLetter> letters = new ArrayList<ArabicLetter>();
        addAll(letters, words[0].getLetters());
        for (int i = 1; i < words.length; i++) {
            addAll(letters, LETTER_SPACE, LETTER_WAW, LETTER_SPACE);
            addAll(letters, words[i].getLetters());
        }
        return new ArabicWord(letters);
    }

    public static ArabicWord concatenateWithSpace(ArabicWord... words) {
        List<ArabicLetter> letters = new ArrayList<ArabicLetter>();
        ArabicWord currentWord = words[0];
        if (currentWord != null) {
            addAll(letters, currentWord.getLetters());
        }
        for (int i = 1; i < words.length; i++) {
            if (!letters.isEmpty()) {
                addAll(letters, LETTER_SPACE);
            }
            currentWord = words[i];
            if (currentWord != null) {
                addAll(letters, currentWord.getLetters());
            }
        }
        return new ArabicWord(letters);
    }

    public static ArabicWord concatenateWithSpace(List<ArabicWord> words) {
        return concatenateWithSpace(words.toArray(new ArabicWord[0]));
    }

    public static ArabicWord fromBuckWalterString(String buckWalterString) {
        return fromString(buckWalterString, false);
    }

    private static ArabicWord fromString(String s, boolean fromUnicode) {
        ArabicWord word = new ArabicWord();
        ArabicLetterType lastLetter = null;
        if (!isBlank(s)) {
            char[] chars = s.toCharArray();
            for (char c : chars) {
                ArabicLetterType letter = fromUnicode ? ArabicLetterType
                        .getByUnicode(c) : ArabicLetterType.getByCode(c);
                if (c == ' ') {
                    letter = SPACE;
                }
                if (letter == null) {
                    // it must one of diacritic
                    DiacriticType diacritic = fromUnicode ? DiacriticType
                            .getByUnicode(c) : DiacriticType.getByCode(c);
                    if (diacritic == null) {
                        String hexString = Integer.toHexString((int) c);
                        err.println(format("NULL letter for value {%s}, CHAR: %s", hexString, c));
                        err.println(format("NULL diacritic for value{%s}, CHAR: %s", hexString, c));
                    }
                    if (lastLetter != null) {
                        word.append(lastLetter, diacritic);
                    } else {
                        word.addDiacriticToLastLetter(diacritic);
                    }
                    lastLetter = null;
                } else {
                    if (lastLetter != null) {
                        word.append(new ArabicLetter(lastLetter));
                    }
                    lastLetter = letter;
                }
            }
        }
        if (lastLetter != null) {
            word.append(new ArabicLetter(lastLetter));
        }
        return word;
    }

    public static ArabicWord fromUnicode(String unicodeString) {
        return fromString(unicodeString, true);
    }

    @Deprecated
    public static ArabicWord getArabicNumber(int value) {
        String s = valueOf(value);
        ArabicLetterType[] letters = new ArabicLetterType[s.length()];
        for (int i = 0; i < letters.length; i++) {
            char code = s.charAt(i);
            letters[i] = getByCode(code);
        }
        return getWord(letters);
    }

    @Deprecated
    public static String getChapterNumber(int chapterNumber) {
        return getVerseChapterNumber(chapterNumber, -1, true, false, true);
    }

    public static ArabicWord getConcatenatedNumber(String delimiter,
                                                   Integer... numbers) {
        delimiter = isBlank(delimiter) ? ":" : delimiter;
        if (!isEmpty(numbers)) {

        }
        return null;
    }

    public static ArabicWord getSubWord(ArabicWord src, int startIndex,
                                        int endIndex) {
        ArabicLetter[] letters = src.getLetters();
        ArabicWord arabicWord = new ArabicWord();
        for (int i = startIndex; i < endIndex; i++) {
            ArabicLetter arabicLetter = letters[i];
            arabicWord.append(arabicLetter);
        }
        return arabicWord;
    }

    @Deprecated
    public static String getVerseChapterNumber(int chapterNumber,
                                               int verseNumber, boolean includeChapterNumber,
                                               boolean includeVerseNumber, boolean encloseBracket) {
        StringBuilder builder = new StringBuilder();
        if (encloseBracket) {
            builder.append(ORNATE_RIGHT_PARENTHESIS.getUnicode());
        }
        if (includeChapterNumber) {
            builder.append(getArabicNumber(chapterNumber).toUnicode());
        }

        if (includeVerseNumber) {
            if (includeChapterNumber) {
                builder.append(":");
            }
            builder.append(getArabicNumber(verseNumber).toUnicode());
        }

        if (encloseBracket) {
            builder.append(ORNATE_LEFT_PARENTHESIS.getUnicode());
        }
        return builder.toString();
    }

    public static String getVerseNumber(int chapterNumber, int verseNumber,
                                        boolean includeChapterNumber) {
        return getVerseChapterNumber(chapterNumber, verseNumber,
                includeChapterNumber, true, true);
    }

    public static ArabicWord getWord(ArabicLetter... letters) {
        return new ArabicWord(letters);
    }

    public static ArabicWord getWord(ArabicLetterType... letterTypes) {
        List<ArabicLetter> list = new ArrayList<ArabicLetter>();
        for (ArabicLetterType arabicLetter : letterTypes) {
            list.add(new ArabicLetter(arabicLetter));
        }
        return new ArabicWord(list);
    }

    public static ArabicWord negate(ArabicWord word) {
        return concatenate(getWord(LAM, ALIF, SPACE), word);
    }

    /**
     * This method appends the letter {@link ArabicLetterType#TATWEEL} at the end of the given word, unless the last
     * letter is is one of non-connectors.
     * <div></div>
     * <div style='font-style: italic;'>
     * Most of the Arabic letters are connectors; that is, that they connect both to a preceding and a following
     * letter. However, there are six letters that do not connect to a following letter, though they connect to
     * preceding letter. These letters are:
     * <div>
     * <span style='text-align: center; font-weight: bold;'>
     * {@link ArabicLetterType#ALIF}, {@link ArabicLetterType#DAL}, {@link ArabicLetterType#THAL},
     * {@link ArabicLetterType#RA}, {@link ArabicLetterType#ZAIN}, {@link ArabicLetterType#WAW}
     * </span>
     * </div>
     * </div>
     * <div></div>
     *
     * @param src given word
     * @return the given word if the last letter is one of non-connectors, otherwise {@link ArabicLetterType#TATWEEL}
     * will be added at the end.
     * @see ArabicLetters#NON_CONNECTORS
     */
    public static ArabicWord appendTatweel(ArabicWord src) {
        if (src == null) {
            return src;
        }
        boolean appendTatweel = false;
        ArabicLetter lastLetter = src.getLastLetter();
        if (lastLetter != null) {
            ArabicLetterType letter = lastLetter.getLetter();
            appendTatweel = (letter == null) ? false : NON_CONNECTORS.contains(letter);
        }
        return appendTatweel ? src : concatenate(src, WORD_TATWEEL);
    }

    /**
     * This method adds the letter {@link ArabicLetterType#TATWEEL} between every letter of the given word, unless the
     * letter is is one of non-connectors.
     * <div><span style='font-weight: bold'>NOTE:</span> this method works for single word, this method cannot
     * handle multiple word with space and/or and</div>
     *
     * @param src the given word
     * @return the given word with {@link ArabicLetterType#TATWEEL} added in between every letter unless the letter
     * is one of non-connectors.
     * @see #appendTatweel(ArabicWord)
     * @see ArabicLetters#NON_CONNECTORS
     */
    public static ArabicWord addTatweel(ArabicWord src) {
        if (src == null) {
            return src;
        }
        ArabicLetter[] letters = src.getLetters();
        if (isEmpty(letters)) {
            return src;
        }
        ArabicWord result = new ArabicWord();
        // starting from 0 we will try to append TATWEEL but we will stop one letter before last letter, since we
        // do not want to add TATWEEL after last letter
        for (int i = 0; i < letters.length - 1; i++) {
            ArabicLetter letter = letters[i];
            result.append(letter);
            if (!NON_CONNECTORS.contains(letter.getLetter())) {
                result.append(LETTER_TATWEEL);
            }
        }
        result.append(src.getLastLetter());
        return result;
    }

    public ArabicWord addDiacritic(int index, DiacriticType newDiacritic) {
        if (isEmpty(letters)) {
            return this;
        }
        ArabicLetter arabicLetter = letters[index];
        DiacriticType[] diacritics = arabicLetter.getDiacritics();
        if (diacritics == null) {
            diacritics = new DiacriticType[0];
        }
        diacritics = ArrayUtils.add(diacritics, newDiacritic);
        arabicLetter = new ArabicLetter(arabicLetter.getLetter(), diacritics);
        replaceDiacritic(index, diacritics);
        return this;
    }

    public ArabicWord addDiacriticToLastLetter(DiacriticType newDiacritic) {
        return addDiacritic(letters.length - 1, newDiacritic);
    }

    public ArabicWord append(ArabicLetter... letters) {
        this.letters = ArrayUtils.addAll(this.letters, letters);
        convert();
        return this;
    }

    public ArabicWord append(ArabicLetterType letter,
                             DiacriticType... diacriticTypes) {
        return append(new ArabicLetter(letter, diacriticTypes));
    }

    public ArabicWord append(ArabicWord... words) {
        for (ArabicWord arabicWord : words) {
            this.letters = ArrayUtils.addAll(this.letters,
                    arabicWord.getLetters());
        }
        convert();
        return this;
    }

    @Override
    public int compareTo(ArabicWord o) {
        int result = 0;
        if (o == null) {
            return 1;
        }
        ArabicLetter[] otherLetters = o.getLetters();
        if (letters == null && otherLetters == null) {
            result = 0;
        } else if (letters == null && otherLetters != null) {
            result = -1;
        } else if (letters != null && otherLetters == null) {
            result = 1;
        } else {
            int len = otherLetters.length;
            for (int i = 0; i < letters.length; i++) {
                ArabicLetter l1 = letters[i];
                ArabicLetter l2 = null;
                if (i < len) {
                    l2 = otherLetters[i];
                }
                result = l1.compareTo(l2);
                if (result != 0) {
                    break;
                }
            }
        }
        return result;
    }

    private void convert() {
        StringBuilder bwBuilder = new StringBuilder();
        StringBuilder ucBuilder = new StringBuilder();
        StringBuilder htmlBuilder = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            ArabicLetter letter = letters[i];
            bwBuilder.append(letter.toBuckWalter());
            ucBuilder.append(letter.toUnicode());
            htmlBuilder.append(letter.toHtmlCode());
        }
        buckWalterString = bwBuilder.toString();
        unicodeString = ucBuilder.toString();
        htmlCodeString = htmlBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (isInstanceOf(ArabicWord.class, obj)) {
            ArabicWord other = (ArabicWord) obj;
            result = toBuckWalter().equals(other.toBuckWalter());
        }
        return result;
    }

    /**
     * @param index
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public ArabicLetter find(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= letters.length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return letters[index];
    }

    public ArabicLetter getFirstLetter() {
        return getLetter(0);
    }

    public ArabicLetter getLastLetter() {
        return getLetter(letters.length - 1);
    }

    public int getLength() {
        return isEmpty(letters) ? 0 : letters.length;
    }

    public ArabicLetter getLetter(int index)
            throws ArrayIndexOutOfBoundsException {
        int length = letters.length;
        // System.out.println(toBuckWalter() + " : " + length + " : " + index);
        if (index < 0 || index >= length) {
            throw new ArrayIndexOutOfBoundsException(format(
                    "Found: %s, Actual: %s for {%s}", index, length,
                    toBuckWalter()));
        }
        return letters[index];
    }

    public ArabicLetter[] getLetters() {
        return letters;
    }

    public void setLetters(ArabicLetter[] letters) {
        this.letters = letters;
        convert();
    }

    @Override
    public int hashCode() {
        return hash(buckWalterString);
    }

    public ArabicWord preppend(ArabicLetter letter) {
        this.letters = add(this.letters, 0, letter);
        convert();
        return this;
    }

    public ArabicWord preppend(ArabicLetterType letter,
                               DiacriticType diacriticType) {
        return preppend(new ArabicLetter(letter, diacriticType));
    }

    public ArabicWord remove(int index) {
        letters = ArrayUtils.remove(letters, index);
        convert();
        return this;
    }

    public ArabicWord removeFirst() {
        return remove(0);
    }

    public ArabicWord removeLast() {
        return remove(letters.length - 1);
    }

    public ArabicWord replaceDiacritic(int index,
                                       DiacriticType... newDiacritics) {
        ArabicLetter arabicLetter = letters[index];
        letters[index] = new ArabicLetter(arabicLetter.getLetter(),
                newDiacritics);
        convert();
        return this;
    }

    public ArabicWord replaceLetter(int index, ArabicLetter newLetter) {
        letters[index] = new ArabicLetter(newLetter.getLetter(),
                newLetter.getDiacritics());
        convert();
        return this;
    }

    public ArabicWord replaceLetter(int index, ArabicLetterType newLetter) {
        ArabicLetter arabicLetter = letters[index];
        letters[index] = new ArabicLetter(newLetter,
                arabicLetter.getDiacritics());
        convert();
        return this;
    }

    public String toBuckWalter() {
        if (isBlank(buckWalterString)) {
            convert();
        }
        return buckWalterString;
    }

    public String toHtmlCode() {
        if (isBlank(htmlCodeString)) {
            convert();
        }
        return htmlCodeString;
    }

    @Override
    public String toString() {
        return buckWalterString;
    }

    public String toUnicode() {
        if (isBlank(unicodeString)) {
            convert();
        }
        return unicodeString;
    }

    @Override
    public ArabicWord toLabel() {
        return this;
    }
}
