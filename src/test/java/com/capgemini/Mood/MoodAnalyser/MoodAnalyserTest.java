package com.capgemini.Mood.MoodAnalyser;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.BeforeClass;
import org.junit.Test;


public class MoodAnalyserTest {
	private boolean mailValid;
	private String Email;

	static MoodAnalyser moodAnalyser= null;

	@BeforeClass
	public static void setUp() {
		moodAnalyser = new MoodAnalyser();
	}


	@Test
	public void givenSadMessage_ReturnSad() {
		assertEquals("NOT SAD","SAD",moodAnalyser.analyseMood("I am sad"));
	}
    
	@Test
	public void givenNonSadMessage_ReturnHappy() {
		assertEquals("SAD","HAPPY",moodAnalyser.analyseMood("I am good"));
	}
}