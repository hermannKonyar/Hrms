package com.example.mhrs1.business.abstracts;

import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.entities.concrtetes.Employe;
import com.example.mhrs1.entities.concrtetes.JobTitle;

import java.util.List;

public interface EmployeService {
    DataResult<List<Employe>> getAll();

    Result postData(Employe employe);

    Employe getById(int id);
}
