package com.example.ecommerce.services;

import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> allUser(){
        return userRepository.findAll();
    }

    public boolean addTuple(){
        User user = new User();

        user.setEmail("hkamguin@gmail.com");
        user.setName("Hermann");

        if(userRepository.save(user) != null){
            System.out.println("sa marche ");
            return true;
        }
        else{
            System.out.println("sa marche pas ");
            return false;
        }
    }
}
