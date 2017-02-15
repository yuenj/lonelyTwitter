package ca.ualberta.cs.lonelytwitter;

import java.util.Comparator;
import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 */
public abstract class Tweet implements Comparator<Tweet>, Comparable<Tweet>{
    protected String message;
    private Date date;

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date(System.currentTimeMillis());
    }

    public String getMessage() {
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    abstract public boolean isImportant();
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

    public int compare(Tweet tweet1, Tweet tweet2) {
        return tweet1.getDate().compareTo(tweet2.getDate());
    }

    public int compareTo(Tweet otherTweet) {
        return this.date.compareTo(otherTweet.getDate());
    }

}
