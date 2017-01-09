package com.alphasystem.arabic.ui.util;

import javafx.scene.text.Font;

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
    public static final int DEFAULT_ENGLISH_FONT_SIZE = 12;

    /**
     * Do not let anyone instantiate this class
     */
    private FontUtilities(){
    }

    public static String getDefaultArabicFontName() {
        final List<String> families = Font.getFamilies();
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

    public static String getDefaultEnglishFont(){
        final List<String> families = Font.getFamilies();
        if(families.contains(CANDARA)){
            return CANDARA;
        }
        return ARIAL;
    }
}
