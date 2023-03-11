package com.example.mhrs1.api.controller;

import com.example.mhrs1.business.abstracts.JobTitleService;
import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.core.utilities.results.SuccessResult;
import com.example.mhrs1.entities.concrtetes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/jobTitles")
public class JobTitleController {
    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping("/getAll")
    public DataResult<List<JobTitle>> getAll(){
        return this.jobTitleService.getAll();
    }
    @PostMapping("/postData")
    public Result postData(JobTitle jobTitle){
        jobTitleService.postData(jobTitle);
        return new SuccessResult("Data Eklendi");
    }



    @GetMapping("/getById")
    public JobTitle getById(int id){
        return jobTitleService.getById(id);
    }
}
