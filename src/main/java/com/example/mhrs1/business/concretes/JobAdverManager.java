package com.example.mhrs1.business.concretes;

import com.example.mhrs1.business.abstracts.JobAdverService;
import com.example.mhrs1.core.utilities.results.*;
import com.example.mhrs1.dataAccess.abstracts.JobAdverDao;
import com.example.mhrs1.entities.concrtetes.JobAdver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.List;
@Service
public class JobAdverManager implements JobAdverService {
    @Autowired
    private JobAdverDao jobAdverDao;

    //@Autowired
     //public JobAdverManager(EmployeDao employeDao) {
       // this.jobAdverDao = jobAdverDao;
    //}


    @Override
    public DataResult<List<JobAdver>> getAll() {
        return new SuccessDataResult<>("Data Listelendi.", jobAdverDao.findAll());
    }

    @Override
    public Result postData(JobAdver jobAdver) throws RemoteException {


        jobAdverDao.save(jobAdver);
        return new SuccessResult("Data Eklendi");





    }

    @Override
    public JobAdver getById(int id) {
        return null;
    }

    @Override
    public DataResult<List<JobAdver>> getStatusTrue() {
        return new SuccessDataResult<>("Listelendi aktif olanlar",this.jobAdverDao.getByStatusTrue());
    }

    @Override
    public DataResult<List<JobAdver>> getStatusFalse() {
        return new SuccessDataResult<>("Listelendi aktif olanlar",this.jobAdverDao.getByStatusFalse());
    }

    @Override
    public DataResult<List<JobAdver>> getCompanyAdver(String companyName) {
        return new SuccessDataResult<>("Şirkete Göre Listelendi",this.jobAdverDao.getByStatusTrueAndEmployer_CompanyName(companyName));
    }

    @Override
    public DataResult<List<JobAdver>> getActiveJobAdvertisementOrderedByDesc() {
        return new SuccessDataResult<List<JobAdver>>("Aktif ilanlar tarihe göre sıralandı.",this.jobAdverDao.getByStatusTrueOrderByStartDateDesc());
    }



    @Override
    public DataResult updateAdverStatus(int id,boolean bool) {
        try{
            JobAdver data = this.jobAdverDao.getById(id);
            data.setStatus(bool);
            jobAdverDao.save(data);

            return new SuccessDataResult("Güncellendi.");
        }
        catch(Exception ex){
            return new ErrorDataResult("Hatalı id");
        }

    }


    public Object getStatus(int sayi) {

        switch (sayi){
            case 1:return new SuccessDataResult<>("Listelendi aktif olanlar",getStatusTrue());
            case 2: return new SuccessDataResult<>("Listelendi pasif olanlar",getStatusFalse());
            default: return new SuccessDataResult<>("Tüm veriler listelendi",this.jobAdverDao.findAll());
        }

    }


}
