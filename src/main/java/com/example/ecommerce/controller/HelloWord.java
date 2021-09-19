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
    public ResponseEntity<String> helloWord() throws Exception{
        String hello = new String("Hello Word");
        return ResponseEntity.ok(hello);
    }

}
