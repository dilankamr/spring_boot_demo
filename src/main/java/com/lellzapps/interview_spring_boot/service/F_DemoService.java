package com.lellzapps.interview_spring_boot.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("f_demoService")
public class F_DemoService {

    private String message;

    public F_DemoService()
    {
        log.info(">>>>>>>>>>>>>>>>>> F_DemoService constructor called");
        this.message = "********** F_DemoService init using default constructor";
    }

    public F_DemoService(String message)
    {
        log.info(">>>>>>>>>>>>>>>>>> F_DemoService constructor called");
        this.message = message;
    }

    public void printMessage()
    {
        System.out.println(this.message);
    }
}
