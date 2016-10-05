package com.example.admin.booblin01;

/**
 * Created by Admin on 01.02.2016.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper implements BaseColumns {

    public static final String DATABASE_NAME = "mydatabase.db";
    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_JAMESON = "jameson";
    public static final String DATABASE_JAMESON12 = "jameson12";
    public static final String DATABASE_BUSHMILLS = "bushmills";
    public static final String DATABASE_BUSHMILLS10 = "bushmills10";
    public static final String DATABASE_BUSHMILLS_BLACK = "bushmillsblack";
    public static final String DATABASE_RED_LABEL = "redlabel";
    public static final String DATABASE_BLACK_LABEL = "blacklabel";
    public static final String DATABASE_GOLD_LABEL = "goldlabel";
    public static final String DATABASE_BELLS = "bells";
    public static final String DATABASE_DJACK_DANIELS = "djackdaniels";
    public static final String DATABASE_DJACK_SINGLE = "djacksingle";
    public static final String DATABASE_SINGLETON = "singleton";
    public static final String DATABASE_CHIWAS_REGAL = "chiwas";


    public static final String COLUMN_ID = BaseColumns._ID;
    public static final String COLUMN_DATE = "archive_date";
    public static final String COLUMN_SUMM = "archive_boohlo";

    private static final String DATABASE_CREATE_JAMESON = "create table "
            + DATABASE_JAMESON + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_JAMESON12 = "create table "
            + DATABASE_JAMESON12 + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_BUSHMILLS = "create table "
            + DATABASE_BUSHMILLS + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_BUSHMILLS10 = "create table "
            + DATABASE_BUSHMILLS10 + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_BUSHMILLS_BLACK = "create table "
            + DATABASE_BUSHMILLS_BLACK + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_RED_LABEL = "create table "
            + DATABASE_RED_LABEL + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_BLACK_LABEL = "create table "
            + DATABASE_BLACK_LABEL + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_GOLD_LABEL = "create table "
            + DATABASE_GOLD_LABEL + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_BELLS = "create table "
            + DATABASE_BELLS + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_DJACK_DANIELS = "create table "
            + DATABASE_DJACK_DANIELS + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_DJACK_SINGLE = "create table "
            + DATABASE_DJACK_SINGLE + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_SINGLETON = "create table "
            + DATABASE_SINGLETON + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_CHIWAS_REGAL = "create table "
            + DATABASE_CHIWAS_REGAL + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";




    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, name, factory, version);
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                          int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE_JAMESON);
        db.execSQL(DATABASE_CREATE_JAMESON12);
        db.execSQL(DATABASE_CREATE_BUSHMILLS);
        db.execSQL(DATABASE_CREATE_BUSHMILLS10);
        db.execSQL(DATABASE_CREATE_BUSHMILLS_BLACK);
        db.execSQL(DATABASE_CREATE_RED_LABEL);
        db.execSQL(DATABASE_CREATE_BLACK_LABEL);
        db.execSQL(DATABASE_CREATE_GOLD_LABEL);
        db.execSQL(DATABASE_CREATE_BELLS);
        db.execSQL(DATABASE_CREATE_DJACK_DANIELS);
        db.execSQL(DATABASE_CREATE_DJACK_SINGLE);
        db.execSQL(DATABASE_CREATE_SINGLETON);
        db.execSQL(DATABASE_CREATE_CHIWAS_REGAL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Запишем в журнал
        Log.w("SQLite", "Обновляемся с версии " + oldVersion + " на версию " + newVersion);

        // Удаляем старую таблицу и создаём новую
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_JAMESON);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_JAMESON12);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_BUSHMILLS);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_BUSHMILLS10);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_BUSHMILLS_BLACK);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_RED_LABEL);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_BLACK_LABEL);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_GOLD_LABEL);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_BELLS);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_DJACK_DANIELS);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_DJACK_SINGLE);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_SINGLETON);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_CHIWAS_REGAL);

        // Создаём новую таблицу
        onCreate(db);
    }

    // Добавляем новый контакт
    public void addNewsItem(NewsItem newsItem, String string) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_DATE, newsItem.getSecond_data());
        values.put(COLUMN_SUMM, newsItem.getSecond_headline());

        // Вставляем строку в таблицу
        db.insert(string, null, values);
        db.close();
    }

    // Получить контакт
    public ArchiveItem getArchiveItem(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(DATABASE_JAMESON, new String[] { COLUMN_ID,
                        COLUMN_DATE, COLUMN_SUMM}, COLUMN_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        ArchiveItem archiveItem = new ArchiveItem(Integer.parseInt(cursor.getString(0)),
                (cursor.getString(1)), cursor.getString(2));
        return archiveItem;
    }

    // Получить все контакты + сумма
    public ArrayList<NewsItem> getNewsItem(String string) {

        ArrayList contactList = new ArrayList<>();
        NewsItem newsItem = new NewsItem();
        newsItem.setSecond_id("Итого: ");
        newsItem.setSecond_headline(getSum(newsItem, string));
        newsItem.setSecond_data("грамм");
        contactList.add(newsItem);
        // Выбираем всю таблицу
        String selectQuery = "SELECT * FROM " + string;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // Проходим по всем строкам и добавляем в список
        if (cursor.moveToFirst()) {
            do {
                newsItem = new NewsItem();
                newsItem.setSecond_id(cursor.getString(0));
                newsItem.setSecond_data(cursor.getString(1));
                newsItem.setSecond_headline(Integer.parseInt(cursor.getString(2)));
                contactList.add(newsItem);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return contactList;
    }

    // Получить число контактов
    public int getArchiveItemCount() {
        String countQuery = "SELECT * FROM " + DATABASE_JAMESON;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();

        cursor.close();

        return count;
    }

    // Обновить контакт
    public int updateArchiveItem(ArchiveItem archiveItem) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_DATE, archiveItem.getArchiveDate());
        values.put(COLUMN_SUMM, archiveItem.getArchiveSumm());

        // обновляем строку
        return db.update(DATABASE_JAMESON, values, COLUMN_ID + " = ?",
                new String[] { String.valueOf(archiveItem.getArchiveId()) });
    }

    // Удалить контакт
    public void deleteNewsItem(NewsItem newsItem, String string) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(string, COLUMN_ID + " = ?",
                new String[] { String.valueOf(newsItem.getSecond_id()) });
        db.close();
    }

    public int getSum (NewsItem newsItem, String string) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.rawQuery("SELECT SUM(archive_boohlo) FROM " + string, null);
        cur.moveToFirst();

        int sum = cur.getInt(0);

        newsItem.setSecond_headline(Integer.parseInt(Integer.toString(sum)));

        cur.close();

        return sum;


    }
}