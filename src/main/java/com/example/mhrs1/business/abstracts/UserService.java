package com.example.mhrs1.business.abstracts;

import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.entities.concrtetes.User;

import java.util.List;

public interface UserService {
    Result postData(User user);

    DataResult<List<User>> getAll();

    Result deleteData(int id);


}
