package com.mysechko.textapplication.process;

import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysechko.textapplication.io.TextReader;
import com.mysechko.textapplication.text.Sentence;
import com.mysechko.textapplication.text.Text;
import com.mysechko.textapplication.text.TextPart;

/**
 * 
 * com.mysechko.textapplication.process.TextEditor.java
 * 
 * @author Vitaliy Mysechko
 * 
 *	@data 15 лист. 2015 р.
 *
 * Ver.
 *
 */
public class TextEditor {
	private TextFactory factory = new TextFactory();
	private Text text;
	
	private String filename = "";
	
	public TextEditor(String filename){
		this.filename = filename;
		this.editText();
	}

	/**
	 * Edit text, creates Sentences and Words and Symbols using regular expressions and simple Fabric.
	 * 
	 * @param filename
	 * @return
	 */
	private void editText(){
		text = new Text();
		
		TextReader reader = new TextReader(filename);
		String tmp = reader.readTextFromFile();
		
		Sentence tmpSentence = new Sentence();
		
		Pattern pattern = Pattern.compile("[а-€ј-я\\w]+|[-(),.!?\\s]"); 
		Matcher matcher = pattern.matcher(tmp);
		
		while(matcher.find()){
			TextPart textPart = factory.getTextPart(matcher.group());
			if(!textPart.endOfSentence()){
				if(!((tmpSentence.getSize() == 0) && (textPart.getValue().equals(" ")))){
					tmpSentence.addTextPart(textPart);
				}
				
			} else {
				tmpSentence.addTextPart(textPart);
				text.addSentence(tmpSentence);
				tmpSentence = new Sentence();
			}
		}
		
		Collections.sort(text.getSentences());
		
	}
	
	public Text getText(){
		return text;
	}
}
