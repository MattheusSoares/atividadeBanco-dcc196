package br.ufjf.dcc196.appcombanco;
        import android.provider.BaseColumns;

public class SerieContract {
    public static final String TEXT_TYPE = " TEXT";
    public static final String INT_TYPE = " INTEGER";
    public static final String SEP = ",";
    public static final String SQL_CREATE_SERIE = "CREATE TABLE " + Serie.TABLE_NAME + " (" +
            Serie._ID + INT_TYPE + " PRIMARY KEY AUTOINCREMENT" + SEP +
            Serie.COLUMN_NAME_TITULO_TEMPORADA_EPISODIO + TEXT_TYPE + SEP  + ")";
    public static final String SQL_DROP_SERIE = "DROP TABLE IF EXISTS" + Serie.TABLE_NAME;



    public static final class Serie implements BaseColumns {
        public static final String TABLE_NAME = "serie";
        public static final String COLUMN_NAME_TITULO_TEMPORADA_EPISODIO = "titulo temporada episodios";
    }

}
