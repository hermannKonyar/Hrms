package com.example.mhrs1.business.concretes;

import com.example.mhrs1.business.abstracts.EmployersService;
import com.example.mhrs1.core.utilities.hrmsValidation.ValidationService;
import com.example.mhrs1.core.utilities.results.*;
import com.example.mhrs1.dataAccess.abstracts.EmployerDao;
import com.example.mhrs1.entities.concrtetes.Employe;
import com.example.mhrs1.entities.concrtetes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.mhrs1.business.concretes.EmployeManager.patternMatches;

@Service
public class EmployersManager implements EmployersService {

    private EmployerDao employerDao;
    @Autowired
    private ValidationService validationService;
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
        String regexPattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}";
        String regexPattern1 = "[a-z0-9._%+-]+@+"+employer.getCompanyName()+"+\\.[a-z]{2,3}";
        boolean check=patternMatches(employer.getEMail(), regexPattern);
        boolean check1 =patternMatches(employer.getEMail(),regexPattern1);

        if(employer.getName()!=null && employer.getSurname()!=null && employer.getSurname()!=""){
            try{
                if(check&&check1&&validationService.emailValidation()&&validationService.hrmsValidation()){
                    this.employerDao.save(employer);
                    return new SuccessResult("Kayıt doğrulandı.");
                } else{
                    return new ErrorResult("Şirket ismiyle aynı domain ismine sahip olmalı.");
                }
            }
            catch(Exception ex){
                return new ErrorResult("Girdiğiniz Email kayıtlıdır.");
            }
        }
        else{
            return new ErrorResult("Eksik alanlar mevcut");
        }



    }

    @Override
    public Employe getById(int id) {
        return null;
    }
}
