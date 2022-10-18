package com.example.gitalesson7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DBHelper dbHelper;
    EditText text1,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
    }

    public void saveToDB(View view) {
        ContentValues cv = new ContentValues();
        cv.put("Mobile", text1.getText().toString());
        cv.put("Password", text2.getText().toString());

        dbHelper.savdt(cv);
        Toast.makeText(this, "Save Success!", Toast.LENGTH_SHORT).show();
    }
}