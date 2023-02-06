package com.lellzapps.interview_spring_boot.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class C_DemoService {

    private String message;

    public C_DemoService()
    {
        log.info(">>>>>>>>>>>>>>>>>> C_DemoService constructor called");
        this.message = "********** C_DemoService init using default constructor";
    }

    public C_DemoService(String message)
    {
        log.info(">>>>>>>>>>>>>>>>>> C_DemoService constructor called");
        this.message = message;
    }

    public void printMessage()
    {
        System.out.println(this.message);
    }

}
