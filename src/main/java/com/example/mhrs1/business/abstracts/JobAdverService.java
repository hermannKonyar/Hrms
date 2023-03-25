package com.example.mhrs1.business.abstracts;

import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.entities.concrtetes.Employe;
import com.example.mhrs1.entities.concrtetes.JobAdver;

import java.rmi.RemoteException;
import java.util.List;

public interface JobAdverService {
    DataResult<List<JobAdver>> getAll();

    Result postData(JobAdver jobAdver) throws RemoteException;

    JobAdver getById(int id);

    DataResult<List<JobAdver>> getStatusTrue();
    DataResult<List<JobAdver>> getStatusFalse();

    DataResult<List<JobAdver>> getCompanyAdver(String companyName);

    DataResult<List<JobAdver>> getActiveJobAdvertisementOrderedByDesc();

    DataResult updateAdverStatus(int id,boolean bool);
}
