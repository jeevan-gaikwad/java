package com.thoughtworks.conftrackmgmnt.beans;

import java.util.Iterator;
import java.util.List;

import com.thoughtworks.conftrackmgmnt.constants.SessionConstants;
import com.thoughtworks.conftrackmgmnt.exception.SessionNotFoundException;

public class Track {
	private String name;
	private List<Session> sessions;
	private NetworkingEvent networkingEvent;
	
	private Session getSession(Session.Type type) throws SessionNotFoundException{
		Iterator<Session> sessionIterator = sessions.iterator();
		while(sessionIterator.hasNext()){
			Session currentSession=sessionIterator.next();
			if(currentSession.getType().equals(type)){
				return currentSession;
			}
		}
		throw new SessionNotFoundException(SessionConstants.REQUESTED_SESSION+type.toString()+SessionConstants.NOT_FOUND);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Session> getSessions() {
		return sessions;
	}
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	public NetworkingEvent getNetworkingEvent() {
		return networkingEvent;
	}
	public void setNetworkingEvent(NetworkingEvent networkingEvent) {
		this.networkingEvent = networkingEvent;
	}
	
	public Session getMorningSession() throws SessionNotFoundException{
		return getSession(Session.Type.MORNING);
	}
	
	public Session getAfternoonSession() throws SessionNotFoundException{
		return getSession(Session.Type.AFTERNOON);
	}
	
	public Session getLunchTime() throws SessionNotFoundException{
		return getSession(Session.Type.LUNCHTIME);
	}
}
