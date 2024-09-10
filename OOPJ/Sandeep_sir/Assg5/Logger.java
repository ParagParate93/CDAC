package org.example.Assg5_2;

import java.util.ArrayList;

class Logger{
	private static Logger logReference;
	private ArrayList<String> ar = new ArrayList<String>();
	private static int count;
	
	
	public static Logger getInstance() {
		if(logReference == null) {
			logReference = new Logger();
		}
		return logReference;
	}
	
	
	public void log(String message) {
		count++;
		ar.add(message);
		System.out.println(ar.get(Logger.count-1)); // as array so -1
		
	}
	
	public String getLog() {
		if(ar.size()>0) {
			return ar.get(Logger.count-1); //as array start at index 0 so -1
		}
		else {
			return "Empty: No log";
		}
	}
	
	public void clearLog() {
		ar.clear();
		Logger.count = 0; 
	}
}


