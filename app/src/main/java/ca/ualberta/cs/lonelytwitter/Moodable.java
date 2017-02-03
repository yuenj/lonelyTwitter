
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The Moodable interface for the Mood class
 */
public interface Moodable {
    /**
     * Returns the date that the Mood was added or modified
     * @return
     */
    public Date getDate();

    /**
     * Sets the date of the Mood attribute in the Mood class
     * @param date
     */
    public void setDate(Date date);
}