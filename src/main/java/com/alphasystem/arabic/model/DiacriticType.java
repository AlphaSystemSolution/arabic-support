/**
 *
 */
package com.alphasystem.arabic.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The enumeration <code>DiacriticType</code> represents the type of diacritic
 * attached to an { @link
 * com.alphasystem.app.sarfwriter.conjugation.support.ArabicLetterType}, such as
 * <i>Fatha</i> or <i>Kasra</i>.
 *
 * @author sali
 */
@XmlType(name = "DiacriticTypeType")
@XmlEnum
public enum DiacriticType implements ArabicCharacter {

    FATHATAN('F', '\u064B'),

    DAMMATAN('N', '\u064C'),

    KASRATAN('K', '\u064D'),

    FATHA('a', '\u064E'),

    DAMMA('u', '\u064F'),

    KASRA('i', '\u0650'),

    SHADDA('~', '\u0651'),

    SUKUN('o', '\u0652'),

    MADDAH('^', '\u0653'),

    ALIF_KHAN_JAREEYA('`', '\u0670');

    private static final Map<Character, DiacriticType> lettersByCodeMap = new LinkedHashMap<Character, DiacriticType>();

    private static final Map<Character, DiacriticType> lettersByUnicodeMap = new LinkedHashMap<Character, DiacriticType>();

    static {
        for (DiacriticType letter : values()) {
            lettersByCodeMap.put(letter.getCode(), letter);
            lettersByUnicodeMap.put(letter.getUnicode(), letter);
        }
    }

    public static DiacriticType getByCode(char code) {
        return lettersByCodeMap.get(code);
    }

    public static DiacriticType getByUnicode(char unicode) {
        return lettersByUnicodeMap.get(unicode);
    }

    private final char code;

    private final char unicode;

    private DiacriticType(char code, char unicode) {
        this.code = code;
        this.unicode = unicode;
    }

    @Override
    public char getCode() {
        return code;
    }

    @Override
    public char getUnicode() {
        return unicode;
    }

    public String toUnicode() {
        return String.valueOf(unicode);
    }

    @Override
    public String getHtmlCode() {
        return ArabicLetter.toHtmlCodeString(unicode);
    }


}
