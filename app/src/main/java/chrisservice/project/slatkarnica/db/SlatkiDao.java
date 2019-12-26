package chrisservice.project.slatkarnica.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import chrisservice.project.slatkarnica.model.Blago;

@Dao
public interface SlatkiDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertSlatki(List<Blago> slatki);

    @Query("SELECT * FROM Blago")
    List<Blago> getAllSlatki();

}
