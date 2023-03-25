package com.example.mhrs1.api.controller;

import com.example.mhrs1.business.abstracts.EmployeService;
import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.dataAccess.abstracts.CandidateDao;
import com.example.mhrs1.entities.concrtetes.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.RemoteException;
import java.util.List;

@RestController
@RequestMapping("api/employes")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @Autowired
    private CandidateDao candidateDao;

    @GetMapping("/getAll")
    public DataResult<List<Employe>> getAll(){
        return this.employeService.getAll();
    }

    @PostMapping("/postData")
    public Result postData(@RequestBody Employe employe) throws RemoteException {



        Result result =employeService.postData(employe);
        return result;
    }
    @PostMapping("candidate")
    public Object getCandidate(){
        return candidateDao.findAll();
    }
}
