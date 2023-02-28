package com.example.mhrs1.business.concretes;

import java.util.List;

import com.example.mhrs1.business.abstracts.JobTitleService;
import com.example.mhrs1.dataAccess.abstracts.JobTitleDao;
import com.example.mhrs1.entities.concrtetes.JobTitle;
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
    public List<JobTitle> getAll() {
        return this.jobTitleDao.findAll();
    }

}
