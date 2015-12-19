package com.mysechko.textapplication.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.mysechko.textapplication.process.TextEditor;

/**
 * 
 * com.mysechko.textapplication.io.TextWriter.java
 * 
 * @author Vitaliy Mysechko
 * 
 * @data 15 лист. 2015 р.
 *
 *       Ver.
 *
 */
public class TextWriter {

	private TextEditor editor;

	public TextWriter(TextEditor editor) {
		this.editor = editor;
	}

	/**
	 * Converts Text object into String object, with sentences in ascending order.
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < editor.getText().getSize(); i++) {
			builder.append(editor.getText().getSentences().get(i).toString());
			builder.append("\n");
		}
		return builder.toString();
	}

	/**
	 * Writes all the Text object info into the specified file.
	 * 
	 * @param filename
	 */
	public void toFile(String filename) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

			for (int i = 0; i < editor.getText().getSize(); i++) {
				writer.write(editor.getText().getSentences().get(i).toString() + "\n");
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
