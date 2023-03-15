package com.example.mhrs1.api.controller;

import com.example.mhrs1.business.abstracts.UserService;
import com.example.mhrs1.core.utilities.results.DataResult;
import com.example.mhrs1.core.utilities.results.Result;
import com.example.mhrs1.core.utilities.results.SuccessResult;
import com.example.mhrs1.entities.concrtetes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/postData")
    public Result postData( @RequestParam User user){

        this.userService.postData(user);
        return new SuccessResult("Data Eklendi");
    }

    @GetMapping("/getData")
    public DataResult<List<User>> postData(){
        return this.userService.getAll();
    }

    @DeleteMapping("/deleteData")
    public Result deleteData( int id){
        this.userService.deleteData(id);
        return new SuccessResult("Data Silindi");
    }
}
