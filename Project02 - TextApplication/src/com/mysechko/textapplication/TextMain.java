package com.mysechko.textapplication;

import com.mysechko.textapplication.io.TextWriter;
import com.mysechko.textapplication.process.TextEditor;
import com.mysechko.textapplication.text.Text;

/**
 * 
 * com.mysechko.textapplication.TextMain.java
 * 
 * @author Vitaliy Mysechko
 * 
 *	@data 15 лист. 2015 р.
 *
 * Ver.
 *
 */
public class TextMain {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor("TextToRead");
		
		TextWriter writer = new TextWriter(editor);
		System.out.println(writer.toString());
		writer.toFile("SortedSentences.txt");

	}

}
