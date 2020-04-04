package com.example.lang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LanguageSubscription extends AppCompatActivity {
    private static final String TAG = LanguageSubscription.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_subscription);
        Log.d(TAG, "LanguageSubscription");
    }
}
