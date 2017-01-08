package com.thoughtworks.conftrackmgmnt.beans;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;s
import org.junit.Test;

import com.thoughtworks.conftrackmgmnt.exception.SessionNotFoundException;

public class SessionTest {
	@Test
	public void getSessionTest() throws SessionNotFoundException{
		Conference testConferene=new Conference("Test Conference");
		Session morningSession=new Session(Session.Type.MORNING);
		Session lunchTime=new Session(Session.Type.LUNCHTIME);
		List<Session> sessions=new ArrayList<Session>();
		sessions.add(morningSession);
		sessions.add(lunchTime);
		Track track1=testConferene.getTracks().get(0);
		track1.setSessions(sessions);s		
		assertEquals(morningSession,track1.getMorningSession());
	}

}
