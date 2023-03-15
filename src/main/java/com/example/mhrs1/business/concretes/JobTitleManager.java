package com.example.mhrs1.business.concretes;

import java.util.List;

import com.example.mhrs1.business.abstracts.JobTitleService;
import com.example.mhrs1.core.utilities.results.*;
import com.example.mhrs1.dataAccess.abstracts.JobTitleDao;
import com.example.mhrs1.entities.concrtetes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JobTitleManager implements JobTitleService {

    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        super();
        this.jobTitleDao = jobTitleDao;
    }
    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<>("Data Listelendi.",this.jobTitleDao.findAll());

    }

    @Override
    public Result postData(JobPosition jobTitle) {
        try{
            this.jobTitleDao.save(jobTitle);
            return new SuccessResult("Data Eklendi.");
        }catch(Exception ex){
            return new ErrorResult("Aynı kayıt.");
        }

    }

    @Override
    public JobPosition getById(int id) {
        return this.jobTitleDao.findById(id).get();
    }

}
