package com.example.gitalesson7;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    SQLiteDatabase sq;

    public DBHelper(Context context) {
        super(context, "users.db", null, 1);
        sq = getWritableDatabase();
    }

    
    
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String quer = "create table students (Mobile text, Password text)";

        sqLiteDatabase.execSQL(quer);
        
        
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void savdt(ContentValues cv) {
        sq.insert("students",null,cv);


    }
}
