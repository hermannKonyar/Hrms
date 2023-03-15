package com.example.mhrs1.api.controller;

import com.example.mhrs1.business.abstracts.JobAdverService;
import com.example.mhrs1.business.concretes.JobAdverManager;
import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.entities.concrtetes.JobAdver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.RemoteException;
import java.util.List;

@RestController
@RequestMapping("api/jobAdvers")
public class JobAdverController {
    @Autowired
    private JobAdverManager jobAdverManager;

    @GetMapping("/getAll")
    public DataResult<List<JobAdver>> getAll(){
        return this.jobAdverManager.getAll();
    }

    @PostMapping("/postData")
    public Result postData(@RequestBody JobAdver jobAdver) throws RemoteException {



        Result result =jobAdverManager.postData(jobAdver);
        return result;
    }
}
