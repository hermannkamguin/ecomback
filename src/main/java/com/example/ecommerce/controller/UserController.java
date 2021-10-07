package com.example.ecommerce.controller;

import com.example.ecommerce.dto.UserDto;
import com.example.ecommerce.model.User;
import com.example.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/addUser")
    public ResponseEntity<Boolean> addTuple(@RequestBody UserDto userDto){
        if(userService.addTuple(userDto))
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.ok(false);
    }


    @GetMapping(value = "/user")
    public ResponseEntity<List<User>> UserAll(){
        List<User> userAll = userService.allUser();
        return ResponseEntity.ok(userAll);
    }
}
