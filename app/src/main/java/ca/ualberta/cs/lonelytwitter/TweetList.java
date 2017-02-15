package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by jyuen1 on 2/14/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public boolean hasTweet (Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public void addTweet(Tweet tweet) throws IllegalArgumentException {
        for (Tweet t : tweets) {
            if (tweet.getDate() == t.getDate() && tweet.getMessage() == t.getMessage()) {
                throw new IllegalArgumentException();
            }
        }
        tweets.add(tweet);
    }

    public ArrayList<Tweet> getTweets() {
        ArrayList<Tweet> copy = new ArrayList(tweets);
        Collections.sort(copy);
        return copy;
    }

    public int getCount() {
        return tweets.size();
    }
}
