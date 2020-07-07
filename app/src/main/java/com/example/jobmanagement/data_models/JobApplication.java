package com.example.jobmanagement.data_models;

import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

public class JobApplication
{
    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    @PrimaryKey
    private long jobId, profileId;

}
