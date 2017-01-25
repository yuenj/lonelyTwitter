package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class BadMood extends Mood {
    public BadMood(Date date){
        super(date);
    }

    public BadMood() {
        super();
    }

    public String getMood() {
        return "I'm in a bad mood";
    }
}