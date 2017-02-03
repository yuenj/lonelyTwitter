
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A subclass of the Tweet class
 * Template for creating important tweets
 */
public class ImportantTweet extends Tweet {

    /**
     * The constructor for ImportantTweet that accepts date and message parameters
     * @param date
     * @param message
     * @throws TweetTooLongException if the tweet is too long
     */
    public ImportantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * The constructor for ImportantTweet that accepts a message parameter only
     * @param message
     * @throws TweetTooLongException if the tweet is too long
     */
    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * An abstract method belonging to the Tweet superclass
     * Indicates whether the tweet is important or not
     * @return true
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * Implements the toString method for the ImportantTweet class
     * Overrides the toString method in parent class Tweet by adding exclamation marks
     * @return a string representing the ImportantTweet object
     */
    @Override
    public String getMessage() {
        return super.getMessage() + " !!!!";
    }
}