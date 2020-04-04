package com.example.lang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class EditPhrase extends AppCompatActivity {
    private static final String TAG = EditPhrase.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_phrase);
        Log.d(TAG, "EditPhrase");
    }
}
