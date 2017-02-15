package ca.ualberta.cs.lonelytwitter;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public boolean isImportant() {
        return false;
    }

    public String getMessage() {
        return this.message;
    }
}
