package com.example.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWord {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> helloWord(){
        System.out.println("je rentre");
        return ResponseEntity.ok("hello word");
    }

    @RequestMapping(value = "/sttr", method = RequestMethod.GET)
    public ResponseEntity<String> sttr(){
        return ResponseEntity.ok("hello word");
    }

}
