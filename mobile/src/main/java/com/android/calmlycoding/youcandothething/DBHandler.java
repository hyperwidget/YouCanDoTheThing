package com.android.calmlycoding.youcandothething;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ycdtt.db";
    public static final String TABLE_QUOTE = "quote";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_QUOTE = " quote";
    public static final String COLUMN_AUTHOR = " author";
    public static final String COLUMN_VIEW_COUNT = " view_count";

    public static final String CREATE_QUOTE_TABLE = "CREATE TABLE " + TABLE_QUOTE + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_QUOTE
            + " TEXT," + COLUMN_AUTHOR + " TEXT," + COLUMN_VIEW_COUNT + " INTEGER DEFAULT 0)";
    public static final String DROP_QUOTE_TABLE = "DROP TABLE IF EXISTS " + TABLE_QUOTE + ";";

    public DBHandler(Context context, String name,
                     CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DROP_QUOTE_TABLE);
        db.execSQL(CREATE_QUOTE_TABLE);

        addQuote(db, "Be a part of life.", "Uriah Hall");
    }

    public void addQuote(SQLiteDatabase db, String quote, String author){
        db.execSQL("INSERT INTO " + TABLE_QUOTE + "(" + COLUMN_QUOTE + ", " + COLUMN_AUTHOR + ")" +
                " VALUES ('" + quote + "', '" + author + "'");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUOTE);
        onCreate(db);
    }
}