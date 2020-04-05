package com.example.lang;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DisplayPhrase extends AppCompatActivity {
    private static final String TAG = DisplayPhrase.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_phrase);
        Log.d(TAG, "DisplayPhrase");

        DatabaseHelper myDb = new DatabaseHelper(this);
        ListView list = (ListView) findViewById(R.id.list_view);
        ArrayList<String> listItem = new ArrayList<>();

        Cursor cursor = myDb.viewData();
        if (cursor.getCount() == 0) {
            Toast.makeText(DisplayPhrase.this, "No data to show", Toast.LENGTH_SHORT).show();
        } else {
            while (cursor.moveToNext()) {
                listItem.add(cursor.getString(1));//index 1 is WORD/PHRASE ondex o is ID
            }
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItem);
            list.setAdapter(adapter);
        }
    }
}
