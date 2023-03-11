package com.example.mhrs1.business.concretes;

import com.example.mhrs1.business.abstracts.EmployersService;
import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.core.utilities.results.SuccessDataResult;
import com.example.mhrs1.core.utilities.results.SuccessResult;
import com.example.mhrs1.dataAccess.abstracts.EmployerDao;
import com.example.mhrs1.entities.concrtetes.Employe;
import com.example.mhrs1.entities.concrtetes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployersManager implements EmployersService {

    private EmployerDao employerDao;
    @Autowired
    public EmployersManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }


    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>("Data Listelendi.",this.employerDao.findAll());
    }

    @Override
    public Result postData(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("Data Eklendi");
    }

    @Override
    public Employe getById(int id) {
        return null;
    }
}
