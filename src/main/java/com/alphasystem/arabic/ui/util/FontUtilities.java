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
    public static final int DEFAULT_ENGLISH_FONT_SIZE = 12;

    public static final Font ENGLISH_FONT_14 = getEnglishFont(14);
    public static final Font ARABIC_FONT_24 = getArabicFont(24L);

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

    public static Font getArabicFont(long size){
        return getArabicFont(FontWeight.BLACK, FontPosture.REGULAR, size);
    }

    public static Font getArabicFont(FontWeight weight, FontPosture posture, long size){
        return Font.font(getDefaultArabicFontName(), weight, posture, size);
    }

    public static Font getEnglishFont(long size){
        return getEnglishFont(FontWeight.BLACK, FontPosture.REGULAR, size);
    }

    public static Font getEnglishFont(FontWeight weight, FontPosture posture, long size){
        return Font.font(getDefaultEnglishFont(), weight, posture, size);
    }
}
