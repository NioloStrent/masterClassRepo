package com.keith.codingexercises;

public class SecondsAndMinutesChallenge {
	
	static public final int SECONDS_IN_HOUR = 3600;
	static public final int SECONDS_IN_MINUTE = 60;
	static public final int SECONDS_IN_DAY = 86400;

	public static void main(String[] args) {
		System.out.println("min:5 sec:10 result:" + getDurationString(5, 10));
		System.out.println("min:60 sec:1 result:" + getDurationString(60, 1));
		System.out.println("min:120 sec:70 result:" + getDurationString(120, 70));
		System.out.println("min:0 sec:0 result:" + getDurationString(0, 0));
		System.out.println("min:130 sec:70 result:" + getDurationString(130, 70));
		System.out.println("min:-1 sec:10 result:" + getDurationString(-1, 10));
		System.out.println("min:0 sec:86400 result:" + getDurationString(0, 86400));
		System.out.println("sec:86400 result:" + getDurationString(86400));
		System.out.println("sec:-1 result:" + getDurationString(-1));

	}
	
	public static String getDurationString(int minutes, int seconds) {
		
		if ((minutes >= 0) && (seconds >= 0)) {
			int totalSeconds = (minutes * 60) + seconds;
			
			int calcHours = totalSeconds / SECONDS_IN_HOUR;
			totalSeconds -= calcHours * SECONDS_IN_HOUR;
			
			int calcMinutes = totalSeconds / SECONDS_IN_MINUTE;
			totalSeconds -= calcMinutes * SECONDS_IN_MINUTE;
			
			int calcSeconds = totalSeconds % SECONDS_IN_MINUTE;
			return (calcHours + "h " + calcMinutes + "m " + calcSeconds + "s");
		} else {
			return "Invalid Value";
		}
		
	}
	
	public static String getDurationString(int seconds) {
		return getDurationString(0, seconds);
	}

}
