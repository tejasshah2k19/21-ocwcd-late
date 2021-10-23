package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCounterListener implements HttpSessionListener {
	int userCounter = 0;

	// create
	public void sessionCreated(HttpSessionEvent se) {
		userCounter++;
		System.out.println("LoggedInd" + userCounter);
	}

	// destroy
	public void sessionDestroyed(HttpSessionEvent se) {
		userCounter--;
		System.out.println("LoggedOut" + userCounter);

	}
}
