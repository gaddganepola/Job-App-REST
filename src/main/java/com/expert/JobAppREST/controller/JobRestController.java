package com.expert.JobAppREST.controller;

import com.expert.JobAppREST.model.JobPost;
import com.expert.JobAppREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobs")
//    @ResponseBody
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("job/{id}")
    public JobPost getJob(@PathVariable("id") int id) {
        return service.getJob(id);
    }

    @PostMapping("job")
    public JobPost addJob(@RequestBody JobPost job) {
        service.addJob(job);
        return service.getJob(job.getPostId());
    }

}
