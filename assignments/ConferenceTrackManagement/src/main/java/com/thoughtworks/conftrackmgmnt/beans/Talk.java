package com.thoughtworks.conftrackmgmnt.beans;

public class Talk {
	private String name;
	private Integer length;
	public Talk(String line, Integer talkLength) {
		this.name=line;
		this.length=talkLength;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	
}
