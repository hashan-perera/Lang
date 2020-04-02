package com.example.lang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "MainActivity");

        Button btn_add_phrases = findViewById(R.id.btn_add_phrases);
        Button btn_display_phrases = findViewById(R.id.btn_display_phrases);
        Button btn_edit_phrases = findViewById(R.id.btn_edit_phrases);
        Button btn_language_subscription = findViewById(R.id.btn_language_subscription);
        Button btn_translate = findViewById(R.id.btn_translate);

        btn_add_phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddPhrase.class);
                startActivity(intent);

                Log.d(TAG, "AddPhrase");
            }
        });
        btn_display_phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DisplayPhrase.class);
                startActivity(intent);

                Log.d(TAG, "DisplayPhrase");
            }
        });
        btn_edit_phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditPhrase.class);
                startActivity(intent);

                Log.d(TAG, "EditPhrase");
            }
        });
        btn_language_subscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LanguageSubscription.class);
                startActivity(intent);

                Log.d(TAG, "LanguageSubscription");
            }
        });
        btn_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Translate.class);
                startActivity(intent);

                Log.d(TAG, "Translate");
            }
        });
    }
}
