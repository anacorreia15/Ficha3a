package pt.pdm.ficha3a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class baseDeDados extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "baseDeDados";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "Utilizador";
    private static final String TABLE_ID = "IdUtilizador";
    private static final String TABLE_NOME_USER = "Nome";
    private static final String TABLE_IDADE = "Idade";
    private static final String TABLE_CC = "CC";
    private static final String TABLE_MORADA = "Morada";

    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_NAME + "(" + TABLE_ID + "INTEGER PRIMARY KEY,"
                    +  TABLE_NOME_USER + "TEXT," +  TABLE_IDADE + "INTEGER," + TABLE_CC +
                    "TEXT," + TABLE_MORADA + "TEXT);";

    private static final String TABLE_DELETE =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

    public baseDeDados(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(TABLE_CREATE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(TABLE_DELETE);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
