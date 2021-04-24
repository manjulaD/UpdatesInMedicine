package com.android.updatesInMedicine;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
    public class Subjects {

    public Subjects(int uid,String subject,String journal,String link){
        this.uid=uid;
        this.subject=subject;
        this.journal=journal;
        this.link=link;
    }
        @PrimaryKey
        public int uid;

        @ColumnInfo(name = "subject")
        public String subject;

        @ColumnInfo(name = "journal")
        public String journal;

        @ColumnInfo(name = "link")
        public String link;
    }

