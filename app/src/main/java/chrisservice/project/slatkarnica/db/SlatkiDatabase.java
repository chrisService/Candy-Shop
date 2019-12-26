package chrisservice.project.slatkarnica.db;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import chrisservice.project.slatkarnica.model.Blago;

@Database(entities = {Blago.class}, version = 1, exportSchema = false)
public abstract class SlatkiDatabase extends RoomDatabase {

    public abstract SlatkiDao slatkiDao();

    private static SlatkiDatabase INSTANCE;

    public static SlatkiDatabase getSlatkiDatabase(Context context){
        if(INSTANCE == null){
            synchronized (SlatkiDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(
                            context,
                            SlatkiDatabase.class,
                            "slatki_db")
                            .addCallback(new RoomDatabase.Callback(){
                                @Override
                                public void onOpen(@NonNull SupportSQLiteDatabase db) {
                                    super.onOpen(db);
                                }
                            })
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
