package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\/+(meta|data)(\\/+\\S+\\/+\\S+\\/)([a-zA-Z_]*)(.)([a-z]*)(-)(meta|data)+.+(json$)");
	    Matcher matcher = pattern.matcher("/meta/modules/Custom_Module1/leads.modules-meta.json");
	    boolean matchFound = matcher.find();
	    System.out.println(matcher.groupCount());
	    if(matchFound) {
	    	for(int i=0;i<=matcher.groupCount();i++) {
	    		System.out.println(matcher.group(i));
	    	}
	    }
	    else
	    {
	    	System.out.println("Invalid filename");
	    }
	}
}
/*
"/meta/modules/Leads/Leads.modules-meta.json"
"/meta/profiles/Admin/Admin.profiles-meta.json"
"/meta/roles/CEO/CEO.roles-meta.json"
"/meta/users/Ajith/Ajith.users-meta.json"
"/data/users/Ajith/Ajith.users-data.json"

(\S+.+([a-z]*)+-)

*/