package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http学习
 */
@RestController
@RequestMapping("/http-tech")
public class HttpTechController {


    public String redirect(@RequestBody String req){
        return null;
    }

}
