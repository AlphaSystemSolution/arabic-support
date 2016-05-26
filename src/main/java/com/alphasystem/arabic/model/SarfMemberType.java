/**
 * 
 */
package com.alphasystem.arabic.model;

import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * @author sali
 *
 * @see HiddenNounStatus
 * @see HiddenPronounStatus
 */
@XmlSeeAlso({ HiddenNounStatus.class, HiddenPronounStatus.class })
public interface SarfMemberType extends ArabicSupport {

	/**
	 * @return
	 */
	String getMemberTermName();
}
