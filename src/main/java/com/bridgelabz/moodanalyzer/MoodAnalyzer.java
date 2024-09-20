package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    public MoodAnalyzer(){ // empty constructor

    }

    public String analyze_mood(String msg){

        if(msg.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public static void main(String[] args) {
        MoodAnalyzer mood=new MoodAnalyzer();
        String msg="I am feeling sad";

        System.out.println("mood according to the function is :- "+ mood.analyze_mood(msg));

    }
}
