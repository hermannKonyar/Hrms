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
        return jobAdverManager.getAll();
    }

    @GetMapping("/getTrueStatus")
    public Object getStatusTrue(int sayi){
        return jobAdverManager.getStatus(sayi);
    }

    @PostMapping("/postData")
    public Result postData(@RequestBody JobAdver jobAdver) throws RemoteException {



        Result result =jobAdverManager.postData(jobAdver);
        return result;
    }

    @GetMapping("getCompanyAdver")
    public Result getCompanyAdver( String companyName){
        return this.jobAdverManager.getCompanyAdver(companyName);
    }

    @GetMapping("getCompanyAdverDesc")
    public Result getCompanyAdverDesc(){
        return this.jobAdverManager.getActiveJobAdvertisementOrderedByDesc();
    }

    @PostMapping("updateAdverStatus")
    public Result updateAdverStatus(int id , boolean bool){
        return this.jobAdverManager.updateAdverStatus(id,bool);
    }


}
