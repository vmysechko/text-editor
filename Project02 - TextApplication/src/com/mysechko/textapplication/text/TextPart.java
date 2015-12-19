package com.mysechko.textapplication.text;

/**
 * 
 * com.mysechko.textapplication.text.TextPart.java
 * 
 * @author Vitaliy Mysechko
 * 
 *	@data 15 лист. 2015 р.
 *
 * Ver.
 *
 */
public abstract class TextPart {
	
	/**
	 * @param value word or symbol
	 * @param isWord boolean flag which marks end of sentence.
	 */
	protected String value;
	protected boolean isWord;
	protected int length;
	
	public TextPart(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isWord() {
		return isWord;
	}

	public void setWord(boolean isWord) {
		this.isWord = isWord;
	}
	
	public abstract boolean endOfSentence();
	
	public abstract String toString();
	
}
