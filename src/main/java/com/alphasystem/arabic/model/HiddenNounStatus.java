/**
 * 
 */
package com.alphasystem.arabic.model;


/**
 * @author sali
 * 
 */
public enum HiddenNounStatus implements SarfMemberType {

	NOMINATIVE_SINGULAR(null),

	NOMINATIVE_DUAL(null),

	NOMINATIVE_PLURAL(null),

	ACCUSATIVE_SINGULAR(null),

	ACCUSATIVE_DUAL(null),

	ACCUSATIVE_PLURAL(null),

	GENITIVE_SINGULAR(null),

	GENITIVE_DUAL(null),

	GENITIVE_PLURAL(null);

	private final ArabicWord label;

	/**
	 * @param label
	 */
	private HiddenNounStatus(ArabicWord label) {
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
