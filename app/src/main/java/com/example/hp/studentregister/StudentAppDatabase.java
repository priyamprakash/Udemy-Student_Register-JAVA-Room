package com.example.hp.studentregister;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class},version = 1)
public abstract class StudentAppDatabase extends RoomDatabase {

    public abstract StudentDao getStudentDao();

}
