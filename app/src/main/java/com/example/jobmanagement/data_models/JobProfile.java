package com.example.jobmanagement.data_models;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

public class JobProfile
{
    @PrimaryKey
    @ColumnInfo(name = "ID")
    private long id;

    @ColumnInfo(name = "E-mail")
    private String email;

    @ColumnInfo(name = "Password")
    private String password;

    @ColumnInfo(name = "Name")
    private String name;

    @ColumnInfo(name = "Surname")
    private String surname;

    @ColumnInfo(name = "Cellphone")
    private String cellphone;

    @ColumnInfo(name = "Qualification")
    private String qualification;

    @ColumnInfo(name = "Education")
    private String education;

    @ColumnInfo(name = "Identity Number")
    private String identityNumber;

}
