package com.example.jobmanagement.db_repositories;

public interface ASyncTaskCallback <T>
{
    void onSuccess(T success);
    void onException(Exception e);
}
