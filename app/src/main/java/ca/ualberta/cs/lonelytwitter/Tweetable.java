package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Requires that classes implementing this interface have getters for message and date
 */
public interface Tweetable {

    /**
     * Interface method that returns the message
     * @return
     */
    public String getMessage();

    /**
     * Interface method that returns the date
     * @return
     */
    public Date getDate();
}