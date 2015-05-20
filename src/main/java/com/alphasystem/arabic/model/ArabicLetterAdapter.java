/**
 * 
 */
package com.alphasystem.arabic.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author sali
 * 
 */
public class ArabicLetterAdapter extends
		XmlAdapter<AdaptedArabicLetter, ArabicLetter> {

	@Override
	public AdaptedArabicLetter marshal(ArabicLetter v) throws Exception {
		return new AdaptedArabicLetter(v.getLetter(), v.getDiacritics());
	}

	@Override
	public ArabicLetter unmarshal(AdaptedArabicLetter v) throws Exception {
		return new ArabicLetter(v.getLetter(), v.getDiacritics());
	}

}
