/**
 * 
 */
package com.alphasystem.arabic.model;

import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.CLOSE_BRACKET;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.OPEN_BRACKET;
import static com.alphasystem.arabic.model.ArabicLetterType.SPACE;
import static com.alphasystem.arabic.model.ArabicLetterType.getByCode;
import static com.alphasystem.arabic.model.ArabicLetters.LETTER_SPACE;
import static com.alphasystem.arabic.model.ArabicLetters.LETTER_WAW;
import static com.alphasystem.util.HashCodeUtil.hash;
import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.util.Collections.addAll;
import static org.apache.commons.lang3.ArrayUtils.add;
import static org.apache.commons.lang3.ArrayUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.isBlank;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author sali
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArabicWordType", propOrder = { "letters" })
public class ArabicWord implements Serializable, Comparable<ArabicWord> {

	private static final long serialVersionUID = -8680553361456269317L;

	public static ArabicWord concatenate(ArabicWord... words) {
		List<ArabicLetter> letters = new ArrayList<ArabicLetter>();
		addAll(letters, words[0].getLetters());
		for (int i = 1; i < words.length; i++) {
			addAll(letters, words[i].getLetters());
		}
		return new ArabicWord(letters);
	}

	public static ArabicWord concatenateWithAnd(ArabicWord... words) {
		List<ArabicLetter> letters = new ArrayList<ArabicLetter>();
		addAll(letters, words[0].getLetters());
		for (int i = 1; i < words.length; i++) {
			addAll(letters, LETTER_SPACE, LETTER_WAW, LETTER_SPACE);
			addAll(letters, words[i].getLetters());
		}
		return new ArabicWord(letters);
	}

	public static ArabicWord concatenateWithSpace(ArabicWord... words) {
		List<ArabicLetter> letters = new ArrayList<ArabicLetter>();
		addAll(letters, words[0].getLetters());
		for (int i = 1; i < words.length; i++) {
			addAll(letters, LETTER_SPACE);
			addAll(letters, words[i].getLetters());
		}
		return new ArabicWord(letters);
	}

	public static ArabicWord concatenateWithSpace(List<ArabicWord> words) {
		return concatenateWithSpace(words.toArray(new ArabicWord[0]));
	}

	public static ArabicWord fromBuckWalterString(String buckWalterString) {
		return fromString(buckWalterString, false);
	}

	private static ArabicWord fromString(String s, boolean fromUnicode) {
		ArabicWord word = new ArabicWord();
		ArabicLetterType lastLetter = null;
		if (!isBlank(s)) {
			char[] chars = s.toCharArray();
			for (char c : chars) {
				ArabicLetterType letter = fromUnicode ? ArabicLetterType
						.getByUnicode(c) : ArabicLetterType.getByCode(c);
				if (c == ' ') {
					letter = SPACE;
				}
				if (letter == null) {
					// it must one of diacritric
					DiacriticType diacritric = fromUnicode ? DiacriticType
							.getByUnicode(c) : DiacriticType.getByCode(c);
					if (lastLetter != null) {
						word.append(lastLetter, diacritric);
					} else {
						word.addDiacriticToLastLetter(diacritric);
					}
					lastLetter = null;
				} else {
					if (lastLetter != null) {
						word.append(new ArabicLetter(lastLetter));
					}
					lastLetter = letter;
				}
			}
		}
		if (lastLetter != null) {
			word.append(new ArabicLetter(lastLetter));
		}
		return word;
	}

	public static ArabicWord fromUnicode(String unicodeString) {
		return fromString(unicodeString, true);
	}

	public static ArabicWord getArabicNumber(int value) {
		String s = valueOf(value);
		ArabicLetterType[] letters = new ArabicLetterType[s.length()];
		for (int i = 0; i < letters.length; i++) {
			char code = s.charAt(i);
			letters[i] = getByCode(code);
		}
		return getWord(letters);
	}

	public static String getChapterNumber(int chapterNumber) {
		return getVerseChapterNumber(chapterNumber, -1, true, false, true);
	}

	public static ArabicWord getConcatenatedNumber(String delimiter,
			Integer... numbers) {
		delimiter = isBlank(delimiter) ? ":" : delimiter;
		if (!ArrayUtils.isEmpty(numbers)) {

		}
		return null;
	}

	public static ArabicWord getSubWord(ArabicWord src, int startIndex,
			int endIndex) {
		ArabicLetter[] letters = src.getLetters();
		ArabicWord arabicWord = new ArabicWord();
		for (int i = startIndex; i < endIndex; i++) {
			ArabicLetter arabicLetter = letters[i];
			arabicWord.append(arabicLetter);
		}
		return arabicWord;
	}

	public static String getVerseChapterNumber(int chapterNumber,
			int verseNumber, boolean includeChapterNumber,
			boolean includeVerseNumber, boolean encloseBracket) {
		StringBuilder builder = new StringBuilder();
		if (encloseBracket) {
			builder.append(CLOSE_BRACKET.getUnicode());
		}
		if (includeChapterNumber) {
			builder.append(getArabicNumber(chapterNumber).toUnicode());
		}

		if (includeVerseNumber) {
			if (includeChapterNumber) {
				builder.append(":");
			}
			builder.append(getArabicNumber(verseNumber).toUnicode());
		}

		if (encloseBracket) {
			builder.append(OPEN_BRACKET.getUnicode());
		}
		return builder.toString();
	}

	public static String getVerseNumber(int chapterNumber, int verseNumber,
			boolean includeChapterNumber) {
		return getVerseChapterNumber(chapterNumber, verseNumber,
				includeChapterNumber, true, true);
	}

	public static ArabicWord getWord(ArabicLetter... letters) {
		return new ArabicWord(letters);
	}

	public static ArabicWord getWord(ArabicLetterType... letterTypes) {
		List<ArabicLetter> list = new ArrayList<ArabicLetter>();
		for (ArabicLetterType arabicLetter : letterTypes) {
			list.add(new ArabicLetter(arabicLetter));
		}
		return new ArabicWord(list);
	}

	public static ArabicWord negate(ArabicWord word) {
		return concatenate(getWord(LAM, ALIF, SPACE), word);
	}

	@XmlElementWrapper
	@XmlElement(name = "arabic-letter", namespace = "http://www.alphasystem.com/arabic/support")
	private ArabicLetter[] letters;

	@XmlTransient
	private String buckWalterString;

	@XmlTransient
	private String unicodeString;

	@XmlTransient
	private String htmlCodeString;

	public ArabicWord() {
		this((ArabicLetter[]) null);
	}

	/**
	 * @param letters
	 */
	@ConstructorProperties({ "letters" })
	public ArabicWord(ArabicLetter... letters) {
		this.letters = isEmpty(letters) ? new ArabicLetter[0] : letters;
		convert();
	}

	@ConstructorProperties({ "letter", "diacriticType" })
	public ArabicWord(ArabicLetterType letter, DiacriticType diacriticType) {
		this(new ArabicLetter(letter, diacriticType));
	}

	/**
	 * 
	 * @param src
	 */
	public ArabicWord(ArabicWord src) {
		ArabicLetter[] srcLetters = src.getLetters();
		int length = srcLetters == null ? 0 : srcLetters.length;
		this.letters = new ArabicLetter[length];
		for (int i = 0; i < length; i++) {
			this.letters[i] = new ArabicLetter(srcLetters[i]);
		}
		convert();
	}

	@ConstructorProperties({ "letterList" })
	public ArabicWord(List<ArabicLetter> letterList) {
		this(letterList.toArray(new ArabicLetter[0]));
	}

	public ArabicWord addDiacritic(int index, DiacriticType newDiacritic) {
		if (ArrayUtils.isEmpty(letters)) {
			return this;
		}
		ArabicLetter arabicLetter = letters[index];
		DiacriticType[] diacritics = arabicLetter.getDiacritics();
		if (diacritics == null) {
			diacritics = new DiacriticType[0];
		}
		diacritics = ArrayUtils.add(diacritics, newDiacritic);
		arabicLetter = new ArabicLetter(arabicLetter.getLetter(), diacritics);
		replaceDiacritic(index, diacritics);
		return this;
	}

	public ArabicWord addDiacriticToLastLetter(DiacriticType newDiacritic) {
		return addDiacritic(letters.length - 1, newDiacritic);
	}

	public ArabicWord append(ArabicLetter... letters) {
		this.letters = ArrayUtils.addAll(this.letters, letters);
		convert();
		return this;
	}

	public ArabicWord append(ArabicLetterType letter,
			DiacriticType... diacriticTypes) {
		return append(new ArabicLetter(letter, diacriticTypes));
	}

	public ArabicWord append(ArabicWord... words) {
		for (ArabicWord arabicWord : words) {
			this.letters = ArrayUtils.addAll(this.letters,
					arabicWord.getLetters());
		}
		convert();
		return this;
	}

	@Override
	public int compareTo(ArabicWord o) {
		int result = 0;
		if (o == null) {
			return 1;
		}
		ArabicLetter[] otherLetters = o.getLetters();
		if (letters == null && otherLetters == null) {
			result = 0;
		} else if (letters == null && otherLetters != null) {
			result = -1;
		} else if (letters != null && otherLetters == null) {
			result = 1;
		} else {
			int len = otherLetters.length;
			for (int i = 0; i < letters.length; i++) {
				ArabicLetter l1 = letters[i];
				ArabicLetter l2 = null;
				if (i < len) {
					l2 = otherLetters[i];
				}
				result = l1.compareTo(l2);
				if (result != 0) {
					break;
				}
			}
		}
		return result;
	}

	private void convert() {
		StringBuilder bwBuilder = new StringBuilder();
		StringBuilder ucBuilder = new StringBuilder();
		StringBuilder htmlBuilder = new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			ArabicLetter letter = letters[i];
			bwBuilder.append(letter.toBuckWalter());
			ucBuilder.append(letter.toUnicode());
			htmlBuilder.append(letter.toHtmlCode());
		}
		buckWalterString = bwBuilder.toString();
		unicodeString = ucBuilder.toString();
		htmlCodeString = htmlBuilder.toString();
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (getClass().isAssignableFrom(obj.getClass())) {
			ArabicWord other = (ArabicWord) obj;
			result = toBuckWalter().equals(other.toBuckWalter());
		}
		return result;
	}

	/**
	 * @param chapterNumber
	 * @return
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public ArabicLetter find(int index) throws ArrayIndexOutOfBoundsException {
		if (index < 0 || index >= letters.length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return letters[index];
	}

	public ArabicLetter getFirstLetter() {
		return getLetter(0);
	}

	public ArabicLetter getLastLetter() {
		return getLetter(letters.length - 1);
	}

	public int getLength() {
		return isEmpty(letters) ? 0 : letters.length;
	}

	public ArabicLetter getLetter(int index)
			throws ArrayIndexOutOfBoundsException {
		int length = letters.length;
		// System.out.println(toBuckWalter() + " : " + length + " : " + index);
		if (index < 0 || index >= length) {
			throw new ArrayIndexOutOfBoundsException(format(
					"Found: %s, Actual: %s for {%s}", index, length,
					toBuckWalter()));
		}
		return letters[index];
	}

	public ArabicLetter[] getLetters() {
		return letters;
	}

	@Override
	public int hashCode() {
		return hash(buckWalterString);
	}

	public ArabicWord preppend(ArabicLetter letter) {
		this.letters = add(this.letters, 0, letter);
		convert();
		return this;
	}

	public ArabicWord preppend(ArabicLetterType letter,
			DiacriticType diacriticType) {
		return preppend(new ArabicLetter(letter, diacriticType));
	}

	public ArabicWord remove(int index) {
		letters = ArrayUtils.remove(letters, index);
		convert();
		return this;
	}

	public ArabicWord removeFirst() {
		return remove(0);
	}

	public ArabicWord removeLast() {
		return remove(letters.length - 1);
	}

	public ArabicWord replaceDiacritic(int index,
			DiacriticType... newDiacritics) {
		ArabicLetter arabicLetter = letters[index];
		letters[index] = new ArabicLetter(arabicLetter.getLetter(),
				newDiacritics);
		convert();
		return this;
	}

	public ArabicWord replaceLetter(int index, ArabicLetter newLetter) {
		letters[index] = new ArabicLetter(newLetter.getLetter(),
				newLetter.getDiacritics());
		convert();
		return this;
	}

	public ArabicWord replaceLetter(int index, ArabicLetterType newLetter) {
		ArabicLetter arabicLetter = letters[index];
		letters[index] = new ArabicLetter(newLetter,
				arabicLetter.getDiacritics());
		convert();
		return this;
	}

	public void setLetters(ArabicLetter[] letters) {
		this.letters = letters;
		convert();
	}

	public String toBuckWalter() {
		if (isBlank(buckWalterString)) {
			convert();
		}
		return buckWalterString;
	}

	public String toHtmlCode() {
		if (isBlank(htmlCodeString)) {
			convert();
		}
		return htmlCodeString;
	}

	@Override
	public String toString() {
		return buckWalterString;
	}

	public String toUnicode() {
		if (isBlank(unicodeString)) {
			convert();
		}
		return unicodeString;
	}
}
