package com.example.mhrs1.business.concretes;

import com.example.mhrs1.business.abstracts.UserService;
import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.core.utilities.results.SuccessDataResult;
import com.example.mhrs1.core.utilities.results.SuccessResult;
import com.example.mhrs1.dataAccess.abstracts.UserDao;
import com.example.mhrs1.entities.concrtetes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public Result postData(User user) {
        this.userDao.save(user);
        return new SuccessResult("Data Eklendi.");
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<>("Data Listelendi",this.userDao.findAll());

    }

    @Override
    public Result deleteData(int id) {
        this.userDao.deleteById(id);
        return new SuccessResult("Data Silindi");
    }

}
