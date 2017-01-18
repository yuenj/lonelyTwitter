package ca.ualberta.cs.lonelytwitter;

public class BadMood extends Mood {
    public BadMood(Date date){
        this.date = date;
    }

    public BadMood() {
        this.date = new Date();	//current time and date
    }

    public String getMood() {
        return "I'm in a bad mood";
    }
}