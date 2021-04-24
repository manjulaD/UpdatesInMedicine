package com.android.updatesInMedicine;

import android.app.Application;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

@Dao
    public interface SubjectDao {
        @Query("SELECT journal FROM subjects WHERE subject = :subject ")
        List<String> getJournals(String subject);

        @Query("SELECT DISTINCT  subject FROM subjects ")
        List<String> getSubjects();

        @Query("SELECT link FROM subjects WHERE subject LIKE :subject AND " +
                "journal LIKE :journal LIMIT 1")
        String getLink(String subject, String journal);

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        void insertAll(List<Subjects> subjects);

        @Delete
        void delete(Subjects subjects);





    }

