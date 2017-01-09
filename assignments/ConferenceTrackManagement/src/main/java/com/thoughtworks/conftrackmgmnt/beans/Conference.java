package com.thoughtworks.conftrackmgmnt.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Conference {
	private String name;
	private List<Track> tracks;
	public Conference(String name){
		this.name=name;
		tracks=new ArrayList<Track>();
	}
	public Conference(String name,List<Track> tracks){
		this.name=name;
		this.tracks=tracks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	public void addTalks(List<Talk> talks){
		Iterator talkItr=talks.iterator();
		if(tracks.size() == 0){
			Track track=new Track();
		}
		while(talkItr.hasNext()){
			Iterator trackItr=tracks.iterator();
			while(trackItr.hasNext()){
				
			}
		}
		
	}
	
}
