package com.thoughtworks.conftrackmgmnt.provider;
import com.thoughtworks.conftrackmgmnt.beans.Talk;
import com.thoughtworks.conftrackmgmnt.constants.FileInputProviderConstants;
import com.thoughtworks.conftrackmgmnt.exception.InvalidInputException;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileInput {
	
	private Talk parseLine(String line){
		Integer talkLength=0;
		Pattern p = Pattern.compile(FileInputProviderConstants.DECIMAL_NO_PATTERN);
		Matcher m = p.matcher(line);
		if(m.find()){
			talkLength=Integer.parseInt(m.group());
		}
		return new Talk(line,talkLength);
	}
	public List<Talk> readFromFile(String fileName) throws IOException{
		LinkedList<Talk> talks=new LinkedList<Talk>();
		String lineFromFile;
		FileInputStream fstream = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		while (( lineFromFile= br.readLine()) != null)   {
			Talk talk=parseLine(lineFromFile);
			talks.add(talk);
		}
		br.close();
		return talks;
	}
}
