package com.example.codingchallenge0218;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.codingchallenge0218.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleButtonOne(View view) {
        Intent intent = new Intent(this, ScrollActivity.class);
        String message = getApplicationContext().getResources().getString(R.string.passage_one);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void handleButtonTwo(View view) {
        Intent intent = new Intent(this, ScrollActivity.class);
        String message = getApplicationContext().getResources().getString(R.string.passage_two);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void handleButtonThree(View view) {
        Intent intent = new Intent(this, ScrollActivity.class);
        String message = getApplicationContext().getResources().getString(R.string.passage_three);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    // A better solution would be for the buttons to call the same onClick-function
    // and handle them differently depending on what button id the call came from.
    // Not sure if that would affect performance though.
}