package com.example.ecommerce.tests;

import com.example.ecommerce.dto.UserDto;
import com.example.ecommerce.model.User;
import com.example.ecommerce.services.UserService;
import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class TestUserService {

    private UserService userService;

    private UserDto userDto;

    @Before
    public void setUp(){
        userService = new UserService();
        userDto = new UserDto("hkamguin@gmail.com", "Hermann");
    }

    @Test
    public void ShouldReturnTrueIfUserIsSendInDatabase(){
        assertTrue(userService.addTuple(userDto));
    }

}
