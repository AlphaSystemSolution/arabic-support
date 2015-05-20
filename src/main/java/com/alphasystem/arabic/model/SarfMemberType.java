/**
 * 
 */
package com.alphasystem.arabic.model;

import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * @author sali
 * 
 */
@XmlSeeAlso({ HiddenNounStatus.class, HiddenPronounStatus.class })
public interface SarfMemberType {

	/**
	 * @return
	 */
	public ArabicWord getMemberTermLabel();

	/**
	 * @return
	 */
	public String getMemberTermName();
}
