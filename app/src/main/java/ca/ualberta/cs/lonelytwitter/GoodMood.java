package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class GoodMood extends Mood {
    public GoodMood(Date date){
        super(date);
    }

    public GoodMood() {
        super();
    }

    public String getMood() {
        return "I'm in a good mood";
    }
}