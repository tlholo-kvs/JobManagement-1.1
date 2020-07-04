package com.example.jobmanagement.data_models;

import androidx.room.PrimaryKey;

public class JobAdvert
{
    @PrimaryKey
    private String id;

    private String jobTitle;

    private String jobSalary;

    private String jobLocation;
    private String appointmentType;

    private String jobPosition;

    private String jobCompany;

    private String jobDescription;

    private boolean isLicense;

    private String jobQualification;
}
