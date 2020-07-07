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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

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
