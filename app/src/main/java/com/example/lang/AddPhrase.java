package com.example.lang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class AddPhrase extends AppCompatActivity {
    private static final String TAG = AddPhrase.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_phrase);

        Log.d(TAG, "AddPhrase");
    }
}
