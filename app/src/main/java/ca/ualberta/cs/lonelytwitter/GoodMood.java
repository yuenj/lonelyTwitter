package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A subclass of the mood class
 * Represents tweets that are tweeted in a good mood
 */
public class GoodMood extends Mood {
    /**
     * The constructor for the GoodMood class
     * inherits the parent behavior of the Mood class
     */
    public GoodMood(Date date){
        super(date);
    }


    /**
     * The constructor for the GoodMood class
     * inherits the parent behavior of the Mood class
     */
    public GoodMood() {
        super();
    }

    /**
     * An abstract method of the Mood class
     * returns a string representing the mood of the GoodMood class
     * @return a string representing a good mood
     */
    public String getMood() {
        return "I'm in a good mood";
    }
}