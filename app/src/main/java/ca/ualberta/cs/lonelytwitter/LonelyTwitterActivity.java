package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;

public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	private ArrayList<Tweet> tweetList;
	private ArrayAdapter<Tweet> adapter;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		try {
			Tweet tweet = new NormalTweet("First tweet");
			tweet.setMessage("kdjfdksdf");
			ImportantTweet importantTweet = new ImportantTweet("very important");
			ImportantTweet.getDate();
			NormalTweet normalTweet = newNormalTweet("im normal");

			ArrayList<Tweet> arrayList = new ArrayList<Tweet>();
			arrayList.add(tweet);
			arrayList.add(importantTweet);
			arrayList.add(normalTweet);

		} catch (TweetTooLongException e) {
			e.printStackTrace();
		}
		// tweet.message = "sdfjsdlf";
		// Tweet tweet2 = new Tweet(new Data(), "My second tweet");


		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();

				Tweet tweet = new NormalTweet(text);
				tweetList.add(tweet);

				adapter.notifyDataSetChanged(); // listview will refresh itself

				saveInFile();
			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		loadFromFile();

		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

	private void loadFromFile() {
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			Gson gson = new Gson();

			//Taken from http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt
			//2017-01-24 18:19
			Type listType = new TypeToken<ArrayList<Tweet>>(){}.getType();
			tweetList = gson.fromJson(in, listType);

		} catch (FileNotFoundException e) {
			tweetList = new ArrayList<Tweet>();
			throw new RunTimeException();
		} catch (IOException e) {
			throw new RunTimeException();
		}
	}
	
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

			Gson gson = new Gson();
			gson.toJson(tweetList, out);
			out.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO: Handle the Exception properly later
			throw new RunTimeException();
		} catch (IOException e) {
			throw new RunTimeException();
		}
	}
}