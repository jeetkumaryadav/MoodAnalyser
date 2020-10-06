package com.capgemini.Mood.MoodAnalyser;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoodAnalyser {
	String message;
	public MoodAnalyser() {}
	public MoodAnalyser(String message) {
		this.message=message;
	}
	public String analyseMood() {
		if (message.contains("sad")||message.contains("SAD")||message.contains("Sad")) {
			return "SAD";
		} else
			return "HAPPY";
	}
	private static Logger Log = LogManager.getLogger(MoodAnalyser.class);
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Log.info("Enter message");
		String message=scan.nextLine();
		MoodAnalyser moodAnalyser=new MoodAnalyser(message);
		Log.info(moodAnalyser.analyseMood());
		
		
	}
}
