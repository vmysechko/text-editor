package com.mysechko.textapplication.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * com.mysechko.textapplication.io.TextReader.java
 * 
 * @author Vitaliy Mysechko
 * 
 *	@data 15 лист. 2015 р.
 *
 * Ver.
 *
 */
public class TextReader {
	
	/**
	 * @param filename
	 * @param encoding
	 */
	private String filename = "";
	private String encoding = "Cp1251";
	
	public TextReader(String file){
		this.filename = file;
	}
	
	/**
	 * Method to read all the data from given file into the String object.
	 * @return
	 */
	public String readTextFromFile(){
		StringBuilder builder = new StringBuilder();
		String tmp = "";
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), encoding));
			
			while( (tmp = reader.readLine()) != null){
				builder.append(tmp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder.toString().replaceAll("[\\s]+", " ");
	}

}
