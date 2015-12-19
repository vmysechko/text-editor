package com.mysechko.textapplication.text;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * com.mysechko.textapplication.text.Sentence.java
 * 
 * @author Vitaliy Mysechko
 * 
 * @data 15 лист. 2015 р.
 *
 *       Ver.
 *
 */
public class Sentence implements Comparable<Sentence> {

	/**
	 * @param node save all sentences from the given text
	 * @param sentenceLength calculate
	 */
	private List<TextPart> node = new ArrayList<>();
	private Integer sentenceLength;

	/**
	 * 
	 * @return returns the sentence length, together with symbols and spaces.
	 */
	private int calculateSentenceLength() {
		int result = 0;

		for (TextPart part : this.node) {
			result += part.length;
		}
		return result;
	}
	
	/**
	 * 
	 * @param part
	 */
	public void addTextPart(TextPart part){
		node.add(part);
	}

	/**
	 * 
	 * @return returns sentence length for the comparator.
	 */
	public int getSize() {
		return this.sentenceLength = calculateSentenceLength();
	}

	@Override
	public int compareTo(Sentence o) {
		return this.sentenceLength.compareTo(o.sentenceLength);
	}
	
	/**
	 * 
	 */
	public String toString(){
		StringBuilder builder = new StringBuilder();
		
		for(TextPart part: this.node){
			builder.append(part.toString());
		}
		
		return builder.toString();
	}

}
