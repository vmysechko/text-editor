package com.mysechko.textapplication.text;

/**
 * 
 * com.mysechko.textapplication.text.Symbol.java
 * 
 * @author Vitaliy Mysechko
 * 
 *	@data 15 лист. 2015 р.
 *
 * Ver.
 *
 */
public class Symbol extends TextPart{

	/**
	 * 
	 * @param value
	 */
	public Symbol(String value) {
		super(value);
		this.isWord = false;
		this.length = 1;
	}

	/**
	 * @return marker end of sentence
	 */
	@Override
	public boolean endOfSentence() {
		if(value.matches("[.!?]")){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return value;
	}
}
