package com.example.lang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPhrase extends AppCompatActivity {
    private static final String TAG = AddPhrase.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_phrase);
        Log.d(TAG, "AddPhrase");

        final DatabaseHelper myDb = new DatabaseHelper(this);
        final EditText txtInput = (EditText) findViewById(R.id.edit_text);
        Button btnSave = (Button) findViewById(R.id.btn_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.instertData(txtInput.getText().toString());
                if (isInserted)
                    Toast.makeText(AddPhrase.this, "Data added", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(AddPhrase.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
