package com.lellzapps.interview_spring_boot.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class E_DemoService {
    private String message;

    public E_DemoService()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService constructor called");
        this.message = "********** E_DemoService init using default constructor";
    }

    public E_DemoService(String message)
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService constructor called");
        this.message = message;
    }

    public void printMessage()
    {
        System.out.println(this.message);
    }

}
