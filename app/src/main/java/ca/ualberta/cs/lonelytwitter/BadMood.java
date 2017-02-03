package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A subclass of the mood class
 * Represents tweets that are tweeted in a bad mood
 */
public class BadMood extends Mood {

    /**
     * The constructor for the BadMood class
     * inherits the parent behavior of the Mood class
     */
    public BadMood(Date date){
        super(date);
    }

    /**
     * The constructor for the BadMood class
     * inherits the parent behavior of the Mood class
     */
    public BadMood() {
        super();
    }

    /**
     * An abstract method of the Mood class
     * returns a string representing the mood of the BadMood class
     * @return a string representing bad mood
     */
    public String getMood() {
        return "I'm in a bad mood";
    }
}