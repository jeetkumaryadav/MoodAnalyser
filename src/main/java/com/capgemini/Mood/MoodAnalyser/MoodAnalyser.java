package com.capgemini.Mood.MoodAnalyser;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoodAnalyser {
	public String analyseMood(String message) {
		if (message.contains("sad")||message.contains("SAD")||message.contains("Sad")) {
			return "SAD";
		} else
			return "HAPPY";
	}
	private static Logger Log = LogManager.getLogger(MoodAnalyser.class);
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		MoodAnalyser moodAnalyser=new MoodAnalyser();
		Log.info("Enter message");
		String message=scan.nextLine();
		Log.info(moodAnalyser.analyseMood(message));
		
		
	}
}
