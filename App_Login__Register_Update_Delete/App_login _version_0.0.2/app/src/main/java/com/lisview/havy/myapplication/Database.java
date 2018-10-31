package com.lisview.havy.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    // ten db, ten table, ten colums
    public static final String DATABASE_NAME = "User_Info.db";
    public static final String TABLE_NAME = "User_Info_Table";
    public static final String COL_1 = "User_Name";
    public static final String COL_2 = "User_Pass";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, 1);
        // int db
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override // dung de tao bang
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "+TABLE_NAME+" ("+COL_1+" text primary key, "+COL_2+" text)");
    }

    @Override// update new table
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //nang cap bang: xoa bang
        // drop table if exists
        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);
    }

    // Thêm du liệu - đăng ký thành viên

    public Boolean addData(String nameAcc, String passAcc){

        SQLiteDatabase db = this.getWritableDatabase();
        Boolean result = true;
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, nameAcc);
        contentValues.put(COL_2, passAcc);

        long r = db.insert(TABLE_NAME, null, contentValues);
        if(r == -1) {return false;}
        return result;
    }


}
