package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import com.example.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addTuple", method = RequestMethod.POST)
    public ResponseEntity<Boolean> addTuple(){
        if(userService.addTuple())
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.ok(false);
    }

    @RequestMapping(value = "/UserAll", method = RequestMethod.GET)
    public ResponseEntity<List<User>> UserAll(){
        List<User> userAll = userService.allUser();
        return ResponseEntity.ok(userAll);
    }
}
