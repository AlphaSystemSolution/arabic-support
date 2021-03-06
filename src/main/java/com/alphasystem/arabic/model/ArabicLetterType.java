package com.alphasystem.arabic.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sali
 */
@XmlType(name = "ArabicLetterTypeType")
@XmlEnum
public enum ArabicLetterType implements ArabicCharacter, ArabicSupport {

    HAMZA('\'', '\u0621'),

    ALIF_MADDAH('|', '\u0622'),

    ALIF_HAMZA_ABOVE('>', '\u0623'),

    WAW_HAMZA_ABOVE('&', '\u0624'),

    ALIF_HAMZA_BELOW('<', '\u0625'),

    YA_HAMZA_ABOVE('}', '\u0626'),

    ALIF('A', '\u0627'),

    BA('b', '\u0628'),

    TA_MARBUTA('p', '\u0629'),

    TA('t', '\u062A'),

    THA('v', '\u062B'),

    JEEM('j', '\u062C'),

    HHA('H', '\u062D'),

    KHA('x', '\u062E'),

    DAL('d', '\u062F'),

    THAL('*', '\u0630'),

    RA('r', '\u0631'),

    ZAIN('z', '\u0632'),

    SEEN('s', '\u0633'),

    SHEEN('$', '\u0634'),

    SAD('S', '\u0635'),

    DDAD('D', '\u0636'),

    TTA('T', '\u0637'),

    DTHA('Z', '\u0638'),

    AIN('E', '\u0639'),

    GHAIN('g', '\u063A'),

    TATWEEL('_', '\u0640'),

    FA('f', '\u0641'),

    QAF('q', '\u0642'),

    KAF('k', '\u0643'),

    LAM('l', '\u0644'),

    MEEM('m', '\u0645'),

    NOON('n', '\u0646'),

    HA('h', '\u0647'),

    WAW('w', '\u0648'),

    ALIF_MAKSURA('Y', '\u0649'),

    YA('y', '\u064A'),

    ALIF_HAMZATWASL('{', '\u0671'),

    HAMZA_ABOVE('#', '\u0654'),

    SMALL_HIGH_LIGATURE_SAD('G', '\u06D6'),

    SMALL_HIGH_LIGATURE_QAF('Q', '\u06D7'),

    SMALL_HIGH_LIGATURE_MEEM('M', '\u06D8'),

    SMALL_HIGH_LIGATURE_LAM_ALIF('L', '\u06D9'),

    SMALL_HIGH_JEEM('J', '\u06DA'),

    SMALL_HIGH_THREE_DOTS('O', '\u06DB'),

    SMALL_HIGH_SEEN('C', '\u06DC'),

    END_OF_AYAH('V', '\u06DD'),

    START_OF_RUB_EL_HIZB('B', '\u06DE'),

    SMALL_HIGH_ROUNDED_ZERO('@', '\u06DF'),

    SMALL_HIGH_UPRIGHT_RECTANGULAR_ZERO('"', '\u06E0'),

    SMALL_HIGH_MEEM_ISOLATED_FORM('[', '\u06E2'),

    SMALL_LOW_SEEN(';', '\u06E3'),

    SMALL_WAW(',', '\u06E5'),

    SMALL_YA('.', '\u06E6'),

    SMALL_HIGH_YEH('\\', '\u06E7'),

    SMALL_HIGH_NOON('!', '\u06E8'),

    PLACE_OF_SAJDAH('P', '\u06E9'),

    EMPTY_CENTRE_LOW_STOP('-', '\u06EA'),

    EMPTY_CENTRE_HIGH_STOP('+', '\u06EB'),

    ROUNDED_HIGH_STOP_WITH_FILLED_CENTRE('%', '\u06EC'),

    SMALL_LOW_MEEM(']', '\u06ED'),

    SPACE(' ', '\u0020'), COMMA('=', '\u060C'),

    ORNATE_LEFT_PARENTHESIS('(', '\uFD3E'),

    ORNATE_RIGHT_PARENTHESIS(')', '\uFD3F'),

    ASTERISK('*', '\u002A'),

    FORWARD_SLASH('/', '\u002F'),

    LEFT_PARENTHESIS('(', '\u0028'),

    RIGHT_PARENTHESIS(')', '\u0029'),

    SEMI_COLON(':', '\u003A'),

    ZERO('0', '\u0660'),

    ONE('1', '\u0661'),

    TWO('2', '\u0662'),

    THREE('3', '\u0663'),

    FOUR('4', '\u0664'),

    FIVE('5', '\u0665'),

    SIX('6', '\u0666'),

    SEVEN('7', '\u0667'),

    EIGHT('8', '\u0668'),

    NINE('9', '\u0669'),

    NEW_LINE('\n', '\n');

    private static final Map<Character, ArabicLetterType> lettersByCodeMap = new LinkedHashMap<>();

    private static final Map<Character, ArabicLetterType> lettersByUnicodeMap = new LinkedHashMap<>();

    static {
        putByCode(HAMZA);
        putByCode(ALIF_MADDAH);
        putByCode(ALIF_HAMZA_ABOVE);
        putByCode(WAW_HAMZA_ABOVE);
        putByCode(ALIF_HAMZA_BELOW);
        putByCode(YA_HAMZA_ABOVE);
        putByCode(ALIF);
        putByCode(BA);
        putByCode(TA_MARBUTA);
        putByCode(TA);
        putByCode(THA);
        putByCode(JEEM);
        putByCode(HHA);
        putByCode(KHA);
        putByCode(DAL);
        putByCode(THAL);
        putByCode(RA);
        putByCode(ZAIN);
        putByCode(SEEN);
        putByCode(SHEEN);
        putByCode(SAD);
        putByCode(DDAD);
        putByCode(TTA);
        putByCode(DTHA);
        putByCode(AIN);
        putByCode(GHAIN);
        putByCode(TATWEEL);
        putByCode(FA);
        putByCode(QAF);
        putByCode(KAF);
        putByCode(LAM);
        putByCode(MEEM);
        putByCode(NOON);
        putByCode(HA);
        putByCode(WAW);
        putByCode(ALIF_MAKSURA);
        putByCode(YA);
        putByCode(ALIF_HAMZATWASL);
        putByCode(HAMZA_ABOVE);
        putByCode(SMALL_HIGH_LIGATURE_SAD);
        putByCode(SMALL_HIGH_LIGATURE_QAF);
        putByCode(SMALL_HIGH_LIGATURE_MEEM);
        putByCode(SMALL_HIGH_LIGATURE_LAM_ALIF);
        putByCode(SMALL_HIGH_JEEM);
        putByCode(SMALL_HIGH_THREE_DOTS);
        putByCode(SMALL_HIGH_SEEN);
        putByCode(END_OF_AYAH);
        putByCode(START_OF_RUB_EL_HIZB);
        putByCode(SMALL_HIGH_ROUNDED_ZERO);
        putByCode(SMALL_HIGH_UPRIGHT_RECTANGULAR_ZERO);
        putByCode(SMALL_HIGH_MEEM_ISOLATED_FORM);
        putByCode(SMALL_LOW_SEEN);
        putByCode(SMALL_WAW);
        putByCode(SMALL_YA);
        putByCode(SMALL_HIGH_YEH);
        putByCode(SMALL_HIGH_NOON);
        putByCode(PLACE_OF_SAJDAH);
        putByCode(EMPTY_CENTRE_LOW_STOP);
        putByCode(EMPTY_CENTRE_HIGH_STOP);
        putByCode(ROUNDED_HIGH_STOP_WITH_FILLED_CENTRE);
        putByCode(SMALL_LOW_MEEM);
        putByCode(SPACE);
        putByCode(ORNATE_LEFT_PARENTHESIS);
        putByCode(ORNATE_RIGHT_PARENTHESIS);
        putByCode(FORWARD_SLASH);
        putByCode(ZERO);
        putByCode(ONE);
        putByCode(TWO);
        putByCode(THREE);
        putByCode(FOUR);
        putByCode(FIVE);
        putByCode(SIX);
        putByCode(SEVEN);
        putByCode(EIGHT);
        putByCode(NINE);
        putByCode(ZERO);
        putByCode(NEW_LINE);
        for (ArabicLetterType letter : values()) {
            putByUnicode(letter);
        }
    }

    private final char code;
    private final char unicode;

    ArabicLetterType(char code, char unicode) {
        this.code = code;
        this.unicode = unicode;
    }

    public static ArabicLetterType getByCode(char code) {
        return lettersByCodeMap.get(code);
    }

    public static ArabicLetterType getByUnicode(char unicode) {
        return lettersByUnicodeMap.get(unicode);
    }

    private static void put(ArabicLetterType letter, boolean code, Map<Character, ArabicLetterType> map) {
        map.put(code ? letter.getCode() : letter.getUnicode(), letter);
    }

    private static void putByCode(ArabicLetterType letter) {
        put(letter, true, lettersByCodeMap);
    }

    private static void putByUnicode(ArabicLetterType letter) {
        put(letter, false, lettersByUnicodeMap);
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

    public String toCode() {
        return String.valueOf(code);
    }

    @Override
    public String getHtmlCode() {
        return ArabicLetter.toHtmlCodeString(unicode);
    }

    @Override
    public ArabicWord toLabel() {
        return ArabicWord.getWord(this);
    }
}
