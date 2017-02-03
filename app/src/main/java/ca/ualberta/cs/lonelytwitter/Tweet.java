package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.ArrayList;

/**
 *This class is the blueprint for Tweet objects.
 */
public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private ArrayList<Mood> moods;
    // private String hiddenString;

    /**
     * Called when a new tweet is created with date and message arguments
     * @param date
     * @param message
     * @throws TweetTooLongException
     */
    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    /**
     * Called when a new tweet is created with only a message argument
     * @param message
     * @throws TweetTooLongException
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date();	//current time and date
    }

    /**
     * An abstract method implemented by subclasses of Tweet
     * Specifies whether the Tweet is important or normal
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Returns the date that the tweet was created or modified
     * @return this.date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date attribute of the Tweet object
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns the message instance attribute of Tweet object
     * @return this.message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message attribute of the Tweet object
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144) {
            // todo throw new error here
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Adds a mood to the moods (type ArrayList<Mood>) instance attribute
     * @param mood
     */
    public void setMoods(Mood mood) {
        moods.add(mood);
    }

    /**
     * Implements the toString method for the Tweet class
     * @return a string representing the tweet object
     */
    @Override
    public String toString()  {
        return date.toString() + " | " + message;
    }

}