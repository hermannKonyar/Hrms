package com.example.mhrs1.api.controller;

import com.example.mhrs1.business.abstracts.EmployersService;
import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.core.utilities.results.SuccessResult;
import com.example.mhrs1.entities.concrtetes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employers")
public class EmployerController {
    @Autowired
    private EmployersService employersService;

    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll(){
        return this.employersService.getAll();
    }

    @PostMapping("/postData")
    public Result postData(@RequestBody Employer employer){
        employersService.postData(employer);
        return new SuccessResult("Data Eklendi");
    }
}
