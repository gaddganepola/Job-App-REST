package com.expert.JobAppREST.service;

import com.expert.JobAppREST.model.JobPost;
import com.expert.JobAppREST.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public JobPost getJob(int id) {
        return repo.getJob(id);
    }

    public void addJob(JobPost job) {
        repo.addJob(job);
    }
}
