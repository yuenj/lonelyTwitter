package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood implements Moodable {
    private Date date;

    public Mood(Date date){
        this.date = date;
    }

    public Mood() {
        this.date = new Date();	//current time and date
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();

}