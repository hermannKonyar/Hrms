package com.example.mhrs1.business.concretes;

import com.example.mhrs1.business.abstracts.JobAdverService;
import com.example.mhrs1.core.utilities.results.*;
import com.example.mhrs1.dataAccess.abstracts.EmployeDao;
import com.example.mhrs1.dataAccess.abstracts.JobAdverDao;
import com.example.mhrs1.entities.concrtetes.Employe;
import com.example.mhrs1.entities.concrtetes.JobAdver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.List;
@Service
public class JobAdverManager implements JobAdverService {
    private JobAdverDao jobAdverDao;

    @Autowired
    public JobAdverManager(EmployeDao employeDao) {
        this.jobAdverDao = jobAdverDao;
    }


    @Override
    public DataResult<List<JobAdver>> getAll() {
        return new SuccessDataResult<>("Data Listelendi.", this.jobAdverDao.findAll());
    }

    @Override
    public Result postData(JobAdver jobAdver) throws RemoteException {


        this.jobAdverDao.save(jobAdver);
        return new SuccessResult("Data Eklendi");





    }

    @Override
    public JobAdver getById(int id) {
        return null;
    }
}
