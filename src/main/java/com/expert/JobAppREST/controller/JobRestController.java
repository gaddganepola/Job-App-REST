package com.expert.JobAppREST.controller;

import com.expert.JobAppREST.model.JobPost;
import com.expert.JobAppREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobs")
//    @ResponseBody
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

}
