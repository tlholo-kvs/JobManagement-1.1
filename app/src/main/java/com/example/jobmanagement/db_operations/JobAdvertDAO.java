package com.example.jobmanagement.db_operations;

import com.example.jobmanagement.data_models.JobAdvert;

import java.util.List;

public interface JobAdvertDAO extends GenericDAO
{
    void delete(long id);
    List<JobAdvert> getAllJobAdverts();
    JobAdvert getJobAdvertById(long id);
}
