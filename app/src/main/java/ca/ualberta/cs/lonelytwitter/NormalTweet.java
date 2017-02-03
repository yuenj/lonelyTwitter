package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A subclass of the Tweet class
 * Template for creating unimportant tweets
 */
public class NormalTweet extends Tweet {

    /**
     * The constructor for the NormalTweet class with date and message parameters
     * @param date
     * @param message
     * @throws TweetTooLongException if the tweet is too long
     */
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * The constructor for the NormalTweet class with only a message parameter
     * @param message
     * @throws TweetTooLongException
     */
    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * An abstract method belonging to the Tweet superclass
     * Indicates whether the tweet is important or not
     * @return false
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}