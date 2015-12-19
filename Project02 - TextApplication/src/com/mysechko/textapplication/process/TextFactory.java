package com.mysechko.textapplication.process;

import com.mysechko.textapplication.text.Symbol;
import com.mysechko.textapplication.text.TextPart;
import com.mysechko.textapplication.text.Word;

/**
 * 
 * com.mysechko.textapplication.process.TextFactory.java
 * 
 * @author Vitaliy Mysechko
 * 
 *	@data 15 лист. 2015 р.
 *
 * Ver.
 *
 */
public class TextFactory {
	private TextPart part;
	
	public TextPart getTextPart(String textPart){

		if(textPart.matches("[-(),.!?\\s]")){
			part = new Symbol(textPart);
		} else {
			part = new Word(textPart);
		}
		
		return part;
		
	}

}
