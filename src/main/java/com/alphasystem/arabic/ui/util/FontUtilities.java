package com.alphasystem.arabic.ui.util;

import javafx.scene.text.Font;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author sali
 */
public final class FontUtilities {

    private static final String KFGQPC_UTHMAN_TAHA_NASKH = "KFGQPC Uthman Taha Naskh";
    private static final String TRADITIONAL_ARABIC = "Traditional Arabic";
    private static final String ARABIC_TYPESETTING = "Arabic Typesetting";
    private static final String ARIAL = "Arial";
    private static final String CANDARA = "Candara";
    private static final String ARABIC_FONT_NAME = "arabic.font.name";
    private static final String ARABIC_REGULAR_FONT_SIZE = "arabic.regular.font.size";
    private static final String ARABIC_HEADING_FONT_SIZE = "arabic.heading.font.size";
    private static final String ENGLISH_REGULAR_FONT_SIZE = "english.regular.font.size";
    public static final long DEFAULT_ARABIC_FONT_SIZE = 20;
    public static final long DEFAULT_ARABIC_HEADING_FONT_SIZE = 40;
    public static final int DEFAULT_ENGLISH_FONT_SIZE = 12;

    public static final String defaultArabicFontName;
    public static final String defaultEnglishFontName;
    public static final long defaultArabicRegularFontSize;
    public static final long defaultArabicHeadingFontSize;
    public static final long defaultEnglishFontSize;

    static {
        final List<String> families = Font.getFamilies();
        defaultArabicFontName = getDefaultArabicFontName(families);
        defaultEnglishFontName = getDefaultEnglishFont(families);
        defaultArabicRegularFontSize = getArabicRegularFontSize();
        defaultArabicHeadingFontSize = getArabicHeadingFontSize();
        defaultEnglishFontSize = getEnglishRegularFontSize();
    }

    /**
     * Do not let anyone instantiate this class.
     */
    private FontUtilities() {
    }

    private static String getDefaultArabicFontName(final List<String> families) {
        final String fontName = System.getProperty(ARABIC_FONT_NAME);
        if (StringUtils.isNotBlank(fontName)) {
            return fontName;
        }
        if (families.contains(KFGQPC_UTHMAN_TAHA_NASKH)) {
            return KFGQPC_UTHMAN_TAHA_NASKH;
        }
        if (families.contains(TRADITIONAL_ARABIC)) {
            return TRADITIONAL_ARABIC;
        }
        if (families.contains(ARABIC_TYPESETTING)) {
            return ARABIC_TYPESETTING;
        }
        return ARIAL;
    }

    private static String getDefaultEnglishFont(final List<String> families) {
        return families.contains(CANDARA) ? CANDARA : ARIAL;
    }

    private static long getFontSize(String propertyName, long defaultSize) {
        final String defaultValue = String.valueOf(defaultSize);
        return Long.parseLong(System.getProperty(propertyName, defaultValue));
    }

    private static long getArabicRegularFontSize() {
        return getFontSize(ARABIC_REGULAR_FONT_SIZE, DEFAULT_ARABIC_FONT_SIZE);
    }

    private static long getEnglishRegularFontSize() {
        return getFontSize(ENGLISH_REGULAR_FONT_SIZE, DEFAULT_ENGLISH_FONT_SIZE);
    }

    private static long getArabicHeadingFontSize() {
        return getFontSize(ARABIC_HEADING_FONT_SIZE, DEFAULT_ARABIC_HEADING_FONT_SIZE);
    }

}
