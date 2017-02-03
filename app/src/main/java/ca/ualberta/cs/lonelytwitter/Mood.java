package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * An abstract class that represents the mood of a tweet
 * Implements the Moodable interface
 */
public abstract class Mood implements Moodable {
    private Date date;

    /**
     * The constructor for the Mood class that accepts a date parameter
     * @param date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * The constructor for the Mood class that accepts no parameters
     */
    public Mood() {
        this.date = new Date();	//current time and date
    }

    /**
     * Returns the date that the mood was added or modified
     * @return date that the mood was added or modified
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date instance attribute of Mood
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * An abstract method that must be implemented by subclasses of Mood
     * @return
     */
    public abstract String getMood();

}