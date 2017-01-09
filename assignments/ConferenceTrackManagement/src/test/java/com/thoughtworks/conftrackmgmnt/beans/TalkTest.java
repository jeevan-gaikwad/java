package com.thoughtworks.conftrackmgmnt.beans;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.thoughtworks.conftrackmgmnt.provider.FileInput;

public class TalkTest {
	@Test
	public void readTalkListFromFileTest(){
		FileInput fileInput=new FileInput();
		try {
			List<Talk> talkList=fileInput.readFromFile("F:/testInput.txt");
			assertEquals(talkList.size(), 19);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
