package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private TextView bodyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        bodyText = (TextView) findViewById(R.id.EditTweetTextView);

        Intent intent = getIntent();
        String tweetMessage = intent.getStringExtra("myTweetMessage");
        String tweetDate = intent.getStringExtra("myTweetDate");

        bodyText.setText(tweetDate + " | " + tweetMessage);
    }
}
