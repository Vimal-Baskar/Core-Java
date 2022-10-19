package com.register;


import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SampleListener
 *
 */
public class SampleListener implements HttpSessionListener  {
	public static int SessionCount=0;
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("Session created");
    	SessionCount++;
    }
    
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("Session destroyed");
    	SessionCount--;
    }
    
    public static int SessionCount() {
    	return SessionCount;
    }
	
}
