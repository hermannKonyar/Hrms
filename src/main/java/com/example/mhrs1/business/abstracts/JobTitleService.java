package com.example.mhrs1.business.abstracts;

import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.entities.concrtetes.JobPosition;

import java.util.List;

public interface JobTitleService {

    DataResult<List<JobPosition>> getAll();

     Result postData(JobPosition jobTitle);

    JobPosition getById(int id);
}
