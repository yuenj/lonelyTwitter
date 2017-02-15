package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jyuen1 on 2/14/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        //assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
        //assertTrue(tweets.hasTweet(tweet));
    }

    public void testString() {
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }

    public void testAddTweets() {
        TweetList tweets = new TweetList();
        Date date = new Date(2017, 02, 14);
        Tweet tweet = new NormalTweet("duplicate", date);
        Tweet duplicateTweet = new NormalTweet("duplicate", date);
        try {
            tweets.addTweet(tweet);
            tweets.addTweet(duplicateTweet);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        assertFalse(tweets.hasTweet(duplicateTweet));
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("date1", new Date(2017, 02, 16));
        Tweet tweet2 = new NormalTweet("date2", new Date(2017, 02, 14));
        Tweet tweet3 = new NormalTweet("date3", new Date(2017, 02, 15));

        ArrayList<Tweet> tweetList = tweets.getTweets();
        for (int i = 0; i < tweetList.size() - 1; i++) {
            assertTrue(tweetList.get(i).getDate().compareTo(tweetList.get(i + 1).getDate()) < 0);
        }
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("testing");
        tweets.addTweet(tweet1);
        assertEquals(tweets.getCount(), tweets.getTweets().size());
    }

}
