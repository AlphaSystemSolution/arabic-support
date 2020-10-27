package com.alphasystem.arabic.ui.util;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

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
    public static final long DEFAULT_ARABIC_FONT_SIZE = 20;
    public static final long DEFAULT_ARABIC_HEADING_FONT_SIZE = 40;
    public static final int DEFAULT_ENGLISH_FONT_SIZE = 12;

    public static final Font ENGLISH_FONT_14 = getEnglishFont(14);
    public static final Font ARABIC_FONT_24 = getArabicRegularFont(24L);

    public static final String defaultArabicFontName;
    public static final String defaultEnglishFontName;
    public static final long defaultArabicRegularFontSize;
    public static final long defaultArabicHeadingFontSize;
    public static final long defaultEnglishFontSize;

    static {
        final List<String> families = Font.getFamilies();
        defaultArabicFontName = getDefaultArabicFontName(families);
        defaultEnglishFontName = getDefaultEnglishFont(families);
        defaultArabicRegularFontSize = getArabicRegularFontSize(-1);
        defaultArabicHeadingFontSize = getArabicHeadingFontSize(-1);
        defaultEnglishFontSize = getEnglishRegularFontSize(-1);
    }

    /**
     * Do not let anyone instantiate this class.
     */
    private FontUtilities() {
    }

    private static String getDefaultArabicFontName(final List<String> families) {
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

    private static long getFontSize(String propertyName, long size, long defaultSize) {
        final String defaultValue = String.valueOf(size <= -1 ? defaultSize : size);
        return Long.parseLong(System.getProperty(propertyName, defaultValue));
    }

    private static long getArabicRegularFontSize(long size) {
        return getFontSize("arabic.regular.font.size", size, DEFAULT_ARABIC_FONT_SIZE);
    }

    private static long getEnglishRegularFontSize(long size) {
        return getFontSize("english.regular.font.size", size, DEFAULT_ENGLISH_FONT_SIZE);
    }

    private static long getArabicHeadingFontSize(long size) {
        return getFontSize("arabic.heading.font.size", size, DEFAULT_ARABIC_HEADING_FONT_SIZE);
    }

    public static Font getArabicRegularFont() {
        return getArabicRegularFont(-1);
    }

    public static Font getArabicRegularFont(long size) {
        return Font.font(defaultArabicFontName, FontWeight.BLACK, FontPosture.REGULAR, getArabicRegularFontSize(size));
    }

    public static Font getArabicHeadingFont() {
        return getArabicHeadingFont(-1);
    }

    public static Font getArabicHeadingFont(long size) {
        return Font.font(defaultArabicFontName, FontWeight.BOLD, FontPosture.REGULAR, getArabicHeadingFontSize(size));
    }

    public static Font getEnglishFont() {
        return getEnglishFont(-1);
    }

    public static Font getEnglishFont(long size) {
        return Font.font(defaultEnglishFontName, FontWeight.BLACK, FontPosture.REGULAR, getEnglishRegularFontSize(size));
    }

}
