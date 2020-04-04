package com.example.lang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DisplayPhrase extends AppCompatActivity {
private static final String TAG=DisplayPhrase.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_phrase);
        Log.d(TAG, "DisplayPhrase");
    }
}
