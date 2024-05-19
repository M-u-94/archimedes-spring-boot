package com.example.demo.service;

import com.example.demo.mapper.IMyMapperA;
import com.example.demo.mapper.IMyMapperB;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private IMyMapperA myMapperA;

    @Autowired
    private IMyMapperB myMapperB;

    @PostConstruct
    private void testMapper(){
        myMapperA.query();
        myMapperB.query();
    }
}
