/**
 *
 */
package com.alphasystem.arabic.model;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.beans.ConstructorProperties;
import java.io.Serializable;

import static com.alphasystem.util.HashCodeUtil.hash;
import static java.lang.Character.valueOf;
import static java.lang.String.format;
import static org.apache.commons.lang3.ArrayUtils.isEmpty;

/**
 * Represents Arabic letter with diacritics.
 *
 * @author sali
 */
@XmlJavaTypeAdapter(ArabicLetterAdapter.class)
public class ArabicLetter implements ArabicSupport, Serializable, Comparable<ArabicLetter> {

    private static final long serialVersionUID = -4076711159374677491L;
    private final ArabicLetterType letter;
    private final DiacriticType[] diacritics;
    private transient String bukWalterString;
    private transient String unicodeString;
    private transient String htmlCodeString;

    /**
     * @param src
     */
    public ArabicLetter(ArabicLetter src) {
        this(src.getLetter(), src.getDiacritics());
    }

    /**
     * @param letter
     * @param diacritics
     * @throws IllegalArgumentException
     */
    @ConstructorProperties({"letter", "diacritics"})
    public ArabicLetter(ArabicLetterType letter, DiacriticType... diacritics)
            throws IllegalArgumentException {
        if (letter == null) {
            throw new IllegalArgumentException("Letter cannot be null.");
        }
        this.letter = letter;
        int len = diacritics == null ? 0 : diacritics.length;
        this.diacritics = new DiacriticType[len];
        for (int i = 0; i < len; i++) {
            this.diacritics[i] = diacritics[i];
        }
        convert();
    }

    static String toHtmlCodeString(char unicode) {
        String s = format("%04x", (int) unicode);
        return format("&#x%s;", s);
    }

    public static ArabicLetter getArabicLetter(ArabicLetterType letter,
                                               DiacriticType... diacritics) {
        return new ArabicLetter(letter, diacritics);
    }

    @Override
    public int compareTo(ArabicLetter o) {
        if (o == null) {
            return 1;
        }

        Character c1 = valueOf(letter.getUnicode());
        Character c2 = valueOf(o.getLetter().getUnicode());
        int result = c1.compareTo(c2);
        if (result == 0) {
            DiacriticType[] otherDiacritics = o.getDiacritics();
            if (diacritics == null && otherDiacritics == null) {
                result = 0;
            } else if (diacritics == null && otherDiacritics != null) {
                result = -1;
            } else if (diacritics != null && otherDiacritics == null) {
                result = 1;
            } else if (diacritics != null && otherDiacritics != null) {
                if (diacritics.length != otherDiacritics.length) {
                    // is this correct
                    result = 1;
                } else {
                    // TODO:
                    result = 0;
                }
            }
        }
        return result;
    }

    private void convert() {
        StringBuilder bwBuilder = new StringBuilder();
        StringBuilder ucBuilder = new StringBuilder();
        StringBuilder htmlBuilder = new StringBuilder();
        bwBuilder.append(letter.getCode());
        char unicode = letter.getUnicode();
        ucBuilder.append(unicode);
        htmlBuilder.append(letter.getHtmlCode());
        if (!isEmpty(diacritics)) {
            for (int i = 0; i < diacritics.length; i++) {
                DiacriticType d = diacritics[i];
                bwBuilder.append(d.getCode());
                unicode = d.getUnicode();
                ucBuilder.append(unicode);
                htmlBuilder.append(d.getHtmlCode());
            }
        }
        bukWalterString = bwBuilder.toString();
        unicodeString = ucBuilder.toString();
        htmlCodeString = htmlBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && ArabicLetter.class.isAssignableFrom(obj.getClass())) {
            ArabicLetter other = (ArabicLetter) obj;
            DiacriticType[] otherDiacritics = other.getDiacritics();
            result = letter.equals(other.getLetter())
                    && (diacritics != null && otherDiacritics != null && (diacritics.length == otherDiacritics.length));
            if (result) {
                for (int i = 0; i < diacritics.length; i++) {
                    result = diacritics[i].equals(otherDiacritics[i]);
                    if (!result) {
                        break;
                    }
                }
            }
        }
        return result;
    }

    public DiacriticType[] getDiacritics() {
        return diacritics;
    }

    public ArabicLetterType getLetter() {
        return letter;
    }

    @Override
    public int hashCode() {
        return hash(hash(letter), diacritics);
    }

    public String toBuckWalter() {
        return bukWalterString;
    }

    public String toHtmlCode() {
        return htmlCodeString;
    }

    @Override
    public String toString() {
        return bukWalterString;
    }

    public String toUnicode() {
        return unicodeString;
    }

    @Override
    public ArabicWord getLabel() {
        return ArabicWord.getWord(this);
    }
}
