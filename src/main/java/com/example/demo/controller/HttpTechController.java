package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.*;

/**
 * http学习
 */
@RestController
@RequestMapping("/http-tech")
public class HttpTechController {

    @PostMapping("/login")
    public String redirect(@Valid  @RequestBody @NotNull JSONObject req){
        return req.toString();
    }

}
