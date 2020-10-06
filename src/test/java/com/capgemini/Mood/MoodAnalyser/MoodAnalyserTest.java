package com.capgemini.Mood.MoodAnalyser;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenSadMessage_ReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am sad");
		assertEquals("NOT SAD", "SAD", moodAnalyser.analyseMood());
	}

	@Test
	public void givenNonSadMessage_ReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am good");
		assertEquals("SAD", "HAPPY", moodAnalyser.analyseMood());
	}
	@Test
	public void givenNull_ReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		assertEquals("not Null", "HAPPY", moodAnalyser.analyseMood());
	}
}