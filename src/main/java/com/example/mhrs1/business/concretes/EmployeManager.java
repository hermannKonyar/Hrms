package com.example.mhrs1.business.concretes;


import com.example.mhrs1.business.abstracts.EmployeService;
import com.example.mhrs1.core.utilities.results.*;
import com.example.mhrs1.dataAccess.abstracts.EmployeDao;
import com.example.mhrs1.entities.concrtetes.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class EmployeManager implements EmployeService {
    private EmployeDao employeDao;

    @Autowired
    public EmployeManager(EmployeDao employeDao) {
        this.employeDao = employeDao;
    }


    @Override
    public DataResult<List<Employe>> getAll() {
        return new SuccessDataResult<>("Data Listelendi.", this.employeDao.findAll());
    }

    @Override
    public Result postData(Employe employe) throws RemoteException {

        String regexPattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}";
        boolean check=patternMatches(employe.getEMail(), regexPattern);



        try{
            if(check){
                this.employeDao.save(employe);
                return new SuccessResult("Data Eklendi");
            }
            else{
                return new ErrorResult("Uygunsuz Email");
            }
        }
        catch(Exception ex){
            return new ErrorResult("Girdiğiniz Email veya TcNo kayıtlıdır.");
        }




    }

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern).matcher(emailAddress).matches();
    }

    @Override
    public Employe getById(int id) {
        return null;
    }
}
