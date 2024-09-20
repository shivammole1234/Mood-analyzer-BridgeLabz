package com.bridgelabz.moodanalyzer;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest extends TestCase {
        MoodAnalyzer mood=new MoodAnalyzer();
        @Test
    public void sad_should_return_sad(){

            String msg="I am in sad mood";
            assertEquals("SAD",mood.analyze_mood(msg));
    }

    @Test
    public void in_any_mood_should_return_hapy(){
        String msg="I am in Any Mood";
        assertEquals("HAPPY",mood.analyze_mood(msg));
    }
}