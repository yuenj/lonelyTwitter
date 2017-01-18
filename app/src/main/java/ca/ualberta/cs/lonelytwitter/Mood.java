package ca.ualberta.cs.lonelytwitter;

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

    public setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();

}