package ca.ualberta.cs.lonelytwitter;

public class GoodMood extends Mood {
    public GoodMood(Date date){
        this.date = date;
    }

    public GoodMood() {
        this.date = new Date();	//current time and date
    }

    public String getMood() {
        return "I'm in a good mood";
    }
}