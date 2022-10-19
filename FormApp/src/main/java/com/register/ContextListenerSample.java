package com.register;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;



public class ContextListenerSample implements ServletContextListener, ServletContextAttributeListener {
	public static Integer count=0;
	public ServletContext context;
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	System.out.println("Attribute replaced at context");
    }
    
    
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
         System.out.println("Attribute removed at context");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("Context initialised");
    	context = sce.getServletContext();
        context.setAttribute("count", count);
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("Context Destroyed");
    }


    public void attributeAdded(ServletContextAttributeEvent scae)  { 
        System.out.println("Attribute added at context");
    }
	
}
