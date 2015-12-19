package com.mysechko.textapplication.text;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * com.mysechko.textapplication.text.Text.java
 * 
 * @author Vitaliy Mysechko
 * 
 *	@data 15 лист. 2015 р.
 *
 * Ver.
 *
 */
public class Text {
	
	/**
	 * @param sentences 
	 */
	private List<Sentence> sentences = new ArrayList<>();
	
	/**
	 * Adds sentence to the list.
	 * 
	 * @param sentence
	 */
	public void addSentence(Sentence sentence){
		sentences.add(sentence);
	}
	
	/**
	 * Returns the complete list with sentences.
	 * 
	 * @return
	 */
	public List<Sentence> getSentences(){
		return sentences;
	}
	
	public int getSize(){
		return this.sentences.size();
	}
	
	/**
	 * Returns String representation of the given edited text.
	 */
	public String toString(){
		StringBuilder builder = new StringBuilder();
		
		for(Sentence s: this.sentences){
			builder.append(s.toString());
			builder.append("\n");
		}
		
		return builder.toString();
	}
	

}
