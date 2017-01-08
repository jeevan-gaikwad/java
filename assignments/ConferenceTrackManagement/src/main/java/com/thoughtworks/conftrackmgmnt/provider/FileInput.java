package com.thoughtworks.conftrackmgmnt.provider;
import com.thoughtworks.conftrackmgmnt.beans.Talk;
import com.thoughtworks.conftrackmgmnt.exception.InvalidInputException;

import java.io.*;
import java.util.List;


public class FileInput {
	
	private Talk parseLine(String line)throws InvalidInputException{
		
		return null;
	}
	public List<Talk> readFromFile(String fileName) throws IOException{
		
		String lineFromFile;
		FileInputStream fstream = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));


		while (( lineFromFile= br.readLine()) != null)   {
			try {
				parseLine(lineFromFile);
			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//Close the input stream
		br.close();
		return null;
	}
}
