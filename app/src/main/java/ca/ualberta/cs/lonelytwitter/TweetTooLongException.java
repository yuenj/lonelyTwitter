package ca.ualberta.cs.lonelytwitter;

public class TweetTooLongException extends Exception {
    public TweetTooLongException() {

    }

    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}