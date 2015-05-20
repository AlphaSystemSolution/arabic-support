/**
 * 
 */
package com.alphasystem.arabic.model;


/**
 * @author sali
 * 
 */
public enum HiddenPronounStatus implements SarfMemberType {

	THIRD_PERSON_MASCULINE_SINGULAR(null),

	THIRD_PERSON_MASCULINE_DUAL(null),

	THIRD_PERSON_MASCULINE_PLURAL(null),

	THIRD_PERSON_FEMININE_SINGULAR(null),

	THIRD_PERSON_FEMININE_DUAL(null),

	THIRD_PERSON_FEMININE_PLURAL(null),

	SECOND_PERSON_MASCULINE_SINGULAR(null),

	SECOND_PERSON_MASCULINE_DUAL(null),

	SECOND_PERSON_MASCULINE_PLURAL(null),

	SECOND_PERSON_FEMININE_SINGULAR(null),

	SECOND_PERSON_FEMININE_DUAL(null),

	SECOND_PERSON_FEMININE_PLURAL(null),

	FIRST_PERSON_SINGULAR(null),

	FIRST_PERSON_PLURAL(null);

	private final ArabicWord label;

	/**
	 * @param label
	 */
	private HiddenPronounStatus(ArabicWord label) {
		this.label = label;
	}

	@Override
	public ArabicWord getMemberTermLabel() {
		return label;
	}

	@Override
	public String getMemberTermName() {
		return name();
	}

}
