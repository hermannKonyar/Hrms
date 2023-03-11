package com.example.mhrs1.business.abstracts;

import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.entities.concrtetes.Employe;
import com.example.mhrs1.entities.concrtetes.Employer;

import java.util.List;

public interface EmployersService {

    DataResult<List<Employer>> getAll();

    Result postData(Employer employer);

    Employe getById(int id);
}
