package com.example.ecommerce.services;

import com.example.ecommerce.dto.UserDto;
import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> allUser(){
        return userRepository.findAll();
    }

    public boolean addTuple(UserDto userDto){
        User user = new User();

        user.setEmail(user.getEmail());
        user.setName(userDto.getName());

        if(userRepository.save(user) != null){
            return true;
        }
        else{
            return false;
        }
    }
}
