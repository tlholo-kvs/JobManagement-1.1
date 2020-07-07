package com.example.jobmanagement.db_operations;

import com.example.jobmanagement.data_models.JobProfile;

import java.util.List;

public interface JobProfileDAO extends GenericDAO
{
    void delete(long id);
    List<JobProfile> getAllJobProfiles();
    JobProfile getJobProfileById(long id);
    JobProfile getJobProfileByEmail(String email);
}
