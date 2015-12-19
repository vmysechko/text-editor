package com.mysechko.textapplication.text;

/**
 * 
 * com.mysechko.textapplication.text.Word.java
 * 
 * @author Vitaliy Mysechko
 * 
 *	@data 15 лист. 2015 р.
 *
 * Ver.
 *
 */
public class Word extends TextPart  {

	/**
	 * Use super-constructor from the TextPart abstract class.
	 * 
	 * @param value
	 */
	public Word(String value) {
		super(value);
		this.isWord = true;
		this.length = value.length();
	}

	/**
	 * Overrided method from TextPart class - means that word cannot be an end-of-sentence.
	 */
	@Override
	public boolean endOfSentence() {
		return false;
	}

	@Override
	public String toString() {
		return value;
	}
	
}
