package ca.ualberta.cs.lonelytwitter;

/**
 * Handles tweets that are too long
 */
public class TweetTooLongException extends Exception {

    /**
     * The constructor for TweetTooLongException class that accepts no parameters
     */
    public TweetTooLongException() {

    }

    /**
     * The constructor for TweetTooLongException class that accepts a string parameter
     * representing a detailed message of the exception
     * @param detailMessage
     */
    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}