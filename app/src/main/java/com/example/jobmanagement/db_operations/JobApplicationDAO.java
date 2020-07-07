package com.example.jobmanagement.db_operations;

import com.example.jobmanagement.data_models.JobAdvert;
import com.example.jobmanagement.data_models.JobApplication;

import java.util.List;

public interface JobApplicationDAO extends GenericDAO
{
    List<JobApplication> getAllJobApplications();
    List<JobApplication> getUserApplications(long profileId);
    void delete(long jobId, long applicantId);
    JobApplication findJobIdandUserId(long jobId, long profileId);
    List<JobAdvert> getUserAppliedJObAdverts(long profileId);
}
