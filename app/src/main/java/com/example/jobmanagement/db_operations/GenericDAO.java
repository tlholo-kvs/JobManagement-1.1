package com.example.jobmanagement.db_operations;


import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import static android.icu.text.MessagePattern.ArgType.SELECT;

@Dao
public interface GenericDAO <T>
{
    @Insert
    public void insert(long id);

    @Delete
    public void delete(long id);

    @RequiresApi(api = Build.VERSION_CODES.N)

    //@Query(SELECT * FROM)
    public void update(long id);
}
