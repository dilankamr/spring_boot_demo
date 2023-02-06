package com.lellzapps.interview_spring_boot.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class D_DemoService {

    private String message;

    public D_DemoService()
    {
        log.info(">>>>>>>>>>>>>>>>>> D_DemoService constructor called");
        this.message = "********** D_DemoService init using default constructor";
    }

    public D_DemoService(String message)
    {
        log.info(">>>>>>>>>>>>>>>>>> D_DemoService constructor called");
        this.message = message;
    }

    public void printMessage()
    {
        System.out.println(this.message);
    }
}
