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

    private Context mContext;

    public static final String DATABASE_NAME = "mydatabase.db";
    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_JAMESON = "jameson";
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

    public static final String DATABASE_NEMIROFF = "nemiroff";
    public static final String DATABASE_NEMIROFF_LEXX = "nemirofflexx";
    public static final String DATABASE_NEMIROFF_PAPER = "nemiroffpaper";
    public static final String DATABASE_GREY_GOOSE = "greygoose";
    public static final String DATABASE_SMIRNOFF = "smirnoff";

    public static final String DATABASE_GUINNESS = "guinness";
    public static final String DATABASE_KILKENNY = "kilkenny";
    public static final String DATABASE_HARP = "harp";
    public static final String DATABASE_HOEGAARDEN = "hoegaarden";
    public static final String DATABASE_LEFFE_BLONDE = "leffeblonde";
    public static final String DATABASE_LEFFE_BRUNE = "leffebrune";
    public static final String DATABASE_CORONA_EXTRA = "corona";
    public static final String DATABASE_WARSCHTAINER = "warschtainer";

    public static final String DATABASE_JAGERMEISTER = "Jagermeister";
    public static final String DATABASE_BECHEROVKA = "Becherovka";
    public static final String DATABASE_MARTINI_BIANCO = "MartiniBianco";
    public static final String DATABASE_MARTINI_ROSSO = "MartiniRosso";
    public static final String DATABASE_MARTINI_EXTRA_DRY = "MartiniExtrDry";
    public static final String DATABASE_SAMBUKA = "Sambuka";
    public static final String DATABASE_PISANG = "Pisang";
    public static final String DATABASE_TRIPLE_SEC = "TripleSec";
    public static final String DATABASE_PEAC_TREE = "PeachTree";
    public static final String DATABASE_ABSENT = "Absent";
    public static final String DATABASE_BAILEYS = "Baileys";
    public static final String DATABASE_KHALUA = "Khalua";

    public static final String DATABASE_GORDONS = "Gordons";
    public static final String DATABASE_JOSE_CUERVO_SILVER = "JoseCuervoSilver";
    public static final String DATABASE_JOSE_CUERVO_GOLD = "JoseCuervoGold";
    public static final String DATABASE_MORGAN_GOLD = "MorgGold";
    public static final String DATABASE_MORGAN_WHITE = "MorgWhite";
    public static final String DATABASE_MORGAN_BLACK = "MorgJamaicaBlack";
    public static final String DATABASE_MORGAN_SPICED = "MorgSpicedBlack";

    public static final String DATABASE_COLA = "cola";
    public static final String DATABASE_SPRITE = "sprite";
    public static final String DATABASE_TONIC = "tonic";
    public static final String DATABASE_MORSHIN_STILL = "morshinstill";
    public static final String DATABASE_MORSHIN_GAS = "morshingas";
    public static final String DATABASE_BORJOMI = "borjomi";
    public static final String DATABASE_RED_BULL = "redbull";



    public static final String COLUMN_ID = BaseColumns._ID;
    public static final String COLUMN_DATE = "archive_date";
    public static final String COLUMN_SUMM = "archive_boohlo";
    public static final String COLUMN_DOLG = "archive_dolg";


    public String newCrateTable;

    public String DynamicCreateTable(String key){
        newCrateTable = "create table "
                + DATABASE_SINGLETON + " (" + BaseColumns._ID
                + " integer primary key autoincrement, "
                + COLUMN_DATE + " text not null, " + COLUMN_SUMM
                + " text not null);";

        return newCrateTable;
    }




    private static final String DATABASE_CREATE_JAMESON = "create table "
            + DATABASE_JAMESON + " (" + BaseColumns._ID
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
    private static final String DATABASE_CREATE_NEMIROFF = "create table "
            + DATABASE_NEMIROFF + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_NEMOROFF_LEXX = "create table "
            + DATABASE_NEMIROFF_LEXX + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_NEMIROFF_PAPER = "create table "
            + DATABASE_NEMIROFF_PAPER + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_GREY_GOOSE = "create table "
            + DATABASE_GREY_GOOSE + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_SMIRNOFF = "create table "
            + DATABASE_SMIRNOFF + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_GUINNESS = "create table "
            + DATABASE_GUINNESS + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_KILKENNY = "create table "
            + DATABASE_KILKENNY + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_HARP = "create table "
            + DATABASE_HARP + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_HOEGAARDEN = "create table "
            + DATABASE_HOEGAARDEN + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_LEFFE_BLONDE = "create table "
            + DATABASE_LEFFE_BLONDE + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_LEFFE_BROWN = "create table "
            + DATABASE_LEFFE_BRUNE + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_CORONA = "create table "
            + DATABASE_CORONA_EXTRA + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_WARSCHTAINER = "create table "
            + DATABASE_WARSCHTAINER + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_JAGERMEISTER = "create table "
            + DATABASE_JAGERMEISTER + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_BECHEROVKA = "create table "
            + DATABASE_BECHEROVKA + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_MARTINI_BIANCO = "create table "
            + DATABASE_MARTINI_BIANCO + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_MARTINI_ROSSO = "create table "
            + DATABASE_MARTINI_ROSSO + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_MARTINI_EXTRA_DRY = "create table "
            + DATABASE_MARTINI_EXTRA_DRY + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_SAMBUKA = "create table "
            + DATABASE_SAMBUKA + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_PISANG = "create table "
            + DATABASE_PISANG + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_TRIPLE_SEC = "create table "
            + DATABASE_TRIPLE_SEC + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_PEACH_TREE = "create table "
            + DATABASE_PEAC_TREE + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_ABSENT = "create table "
            + DATABASE_ABSENT + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_BAILEYS = "create table "
            + DATABASE_BAILEYS + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_KHALUA = "create table "
            + DATABASE_KHALUA + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_CUERVO_SILVER = "create table "
            + DATABASE_JOSE_CUERVO_SILVER + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_CUERVO_GOLD = "create table "
            + DATABASE_JOSE_CUERVO_GOLD + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_GORDONS = "create table "
            + DATABASE_GORDONS + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_MORGAN_GOLD = "create table "
            + DATABASE_MORGAN_GOLD + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_MORGAN_WHITE = "create table "
            + DATABASE_MORGAN_WHITE + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_MORGAN_JAMAICA_BLACK = "create table "
            + DATABASE_MORGAN_BLACK + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_MORGAN_SPICED = "create table "
            + DATABASE_MORGAN_SPICED + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_COLA = "create table "
            + DATABASE_COLA + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_SPRITE = "create table "
            + DATABASE_SPRITE + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_TONIC = "create table "
            + DATABASE_TONIC + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_MORSHIN_STILL = "create table "
            + DATABASE_MORSHIN_STILL + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_MORSHIN_GASS = "create table "
            + DATABASE_MORSHIN_GAS + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_BORJOMI = "create table "
            + DATABASE_BORJOMI + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";
    private static final String DATABASE_CREATE_RED_BULL = "create table "
            + DATABASE_RED_BULL + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + COLUMN_DATE + " text not null, " + COLUMN_SUMM
            + " text not null);";

    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.mContext = context;
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

        db.execSQL(DATABASE_CREATE_NEMIROFF);
        db.execSQL(DATABASE_CREATE_NEMOROFF_LEXX);
        db.execSQL(DATABASE_CREATE_NEMIROFF_PAPER);
        db.execSQL(DATABASE_CREATE_GREY_GOOSE);
        db.execSQL(DATABASE_CREATE_SMIRNOFF);
        db.execSQL(DATABASE_CREATE_GUINNESS);
        db.execSQL(DATABASE_CREATE_KILKENNY);
        db.execSQL(DATABASE_CREATE_HARP);
        db.execSQL(DATABASE_CREATE_HOEGAARDEN);
        db.execSQL(DATABASE_CREATE_LEFFE_BLONDE);
        db.execSQL(DATABASE_CREATE_LEFFE_BROWN);
        db.execSQL(DATABASE_CREATE_CORONA);
        db.execSQL(DATABASE_CREATE_WARSCHTAINER);
        db.execSQL(DATABASE_CREATE_JAGERMEISTER);
        db.execSQL(DATABASE_CREATE_BECHEROVKA);
        db.execSQL(DATABASE_CREATE_MARTINI_BIANCO);
        db.execSQL(DATABASE_CREATE_MARTINI_ROSSO);
        db.execSQL(DATABASE_CREATE_MARTINI_EXTRA_DRY);
        db.execSQL(DATABASE_CREATE_SAMBUKA);
        db.execSQL(DATABASE_CREATE_PISANG);
        db.execSQL(DATABASE_CREATE_TRIPLE_SEC);
        db.execSQL(DATABASE_CREATE_PEACH_TREE);
        db.execSQL(DATABASE_CREATE_ABSENT);
        db.execSQL(DATABASE_CREATE_BAILEYS);
        db.execSQL(DATABASE_CREATE_KHALUA);
        db.execSQL(DATABASE_CREATE_GORDONS);
        db.execSQL(DATABASE_CREATE_CUERVO_GOLD);
        db.execSQL(DATABASE_CREATE_CUERVO_SILVER);
        db.execSQL(DATABASE_CREATE_MORGAN_GOLD);
        db.execSQL(DATABASE_CREATE_MORGAN_JAMAICA_BLACK);
        db.execSQL(DATABASE_CREATE_MORGAN_SPICED);
        db.execSQL(DATABASE_CREATE_MORGAN_WHITE);
        db.execSQL(DATABASE_CREATE_COLA);
        db.execSQL(DATABASE_CREATE_SPRITE);
        db.execSQL(DATABASE_CREATE_TONIC);
        db.execSQL(DATABASE_CREATE_MORSHIN_GASS);
        db.execSQL(DATABASE_CREATE_MORSHIN_STILL);
        db.execSQL(DATABASE_CREATE_BORJOMI);
        db.execSQL(DATABASE_CREATE_RED_BULL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Запишем в журнал
        Log.w("SQLite", "Обновляемся с версии " + oldVersion + " на версию " + newVersion);

        // Удаляем старую таблицу и создаём новую
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_JAMESON);
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

        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_NEMIROFF);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_NEMOROFF_LEXX);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_NEMIROFF_PAPER);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_GREY_GOOSE);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_SMIRNOFF);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_GUINNESS);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_KILKENNY);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_HARP);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_HOEGAARDEN);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_LEFFE_BLONDE);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_LEFFE_BROWN);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_CORONA);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_WARSCHTAINER);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_JAGERMEISTER);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_BECHEROVKA);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_MARTINI_BIANCO);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_MARTINI_ROSSO);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_MARTINI_EXTRA_DRY);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_SAMBUKA);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_PISANG);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_TRIPLE_SEC);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_PEACH_TREE);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_ABSENT);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_BAILEYS);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_KHALUA);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_GORDONS);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_CUERVO_GOLD);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_CUERVO_SILVER);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_MORGAN_GOLD);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_MORGAN_JAMAICA_BLACK);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_MORGAN_SPICED);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_MORGAN_WHITE);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_COLA);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_SPRITE);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_TONIC);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_MORSHIN_GASS);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_MORSHIN_STILL);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_BORJOMI);
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_CREATE_RED_BULL);

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

        Cursor cursor = db.query(DATABASE_JAMESON, new String[]{COLUMN_ID,
                        COLUMN_DATE, COLUMN_SUMM}, COLUMN_ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
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
//        newsItem.setSecond_id("Итого: ");
        newsItem.setSecond_headline(getSum(newsItem, string));
        newsItem.setSecond_data(mContext.getString(R.string.all));
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
                new String[]{String.valueOf(archiveItem.getArchiveId())});
    }

    // Удалить контакт
    public void deleteNewsItem(NewsItem newsItem, String string) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(string, COLUMN_ID + " = ?",
                new String[]{String.valueOf(newsItem.getSecond_id())});
        db.close();
    }

    public int getSum(NewsItem newsItem, String string) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.rawQuery("SELECT SUM(archive_boohlo) FROM " + string, null);
        cur.moveToFirst();

        int sum = cur.getInt(0);

        newsItem.setSecond_headline(Integer.parseInt(Integer.toString(sum)));

        cur.close();

        return sum;


    }
}