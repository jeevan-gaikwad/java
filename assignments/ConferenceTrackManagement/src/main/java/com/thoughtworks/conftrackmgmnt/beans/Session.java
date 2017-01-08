package com.thoughtworks.conftrackmgmnt.beans;
import java.util.Date;
import java.util.List;

import com.thoughtworks.conftrackmgmnt.beans.Session.Type;

public class Session {
	public enum Type{MORNING, AFTERNOON, LUNCHTIME}
	
	private Integer duration;
	private List<Talk> talks;
	private Date startTime;
	private Date endTime;
	private Type type;
	private boolean isFull;
	
	public Session(Type type) {
		this.type=type;
	}
	public boolean isFull() {
		return isFull;
	}
	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public List<Talk> getSessions() {
		return talks;
	}
	public void setSessions(List<Talk> sessions) {
		this.talks = sessions;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public List<Talk> getTalks() {
		return talks;
	}
	public void setTalks(List<Talk> talks) {
		this.talks = talks;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
}
