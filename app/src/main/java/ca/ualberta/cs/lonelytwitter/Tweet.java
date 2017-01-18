package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private ArrayList moods;
    // private String hiddenString;

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date();	//current time and date
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (message.length() > 144) {
            // todo throw new error here
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public void setMoods(Mood mood) {
        moods.add(mood);
    }

}