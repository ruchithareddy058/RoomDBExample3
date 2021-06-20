package com.ruchitha.roomdbexample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")
public class Student_Entity {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "rollnumber")
    private String rollnumber;

    @ColumnInfo(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(@NonNull String rollnumber) {
        this.rollnumber = rollnumber;
    }
}
