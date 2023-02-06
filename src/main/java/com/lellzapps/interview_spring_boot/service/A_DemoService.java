package com.lellzapps.interview_spring_boot.service;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class A_DemoService {

    private B_DemoService b_demoService;

//    @Autowired
//    public A_DemoService(B_DemoService bDemoService)
//    {
//        this.b_demoService = bDemoService;
//
//        log.info(">>>>>>>>>>>>>>>>>> A_DemoService constructor called");
////        this.b_demoService.printMessage();
//    }

    public A_DemoService()
    {
        log.info(">>>>>>>>>>>>>>>>>> A_DemoService constructor called");
    }

    @Autowired
    public void setB_demoService(B_DemoService b_demoService)
    {
        this.b_demoService = b_demoService;
    }

    public void printMessage()
    {
        log.info("************ A_DemoService printMessage()");
    }
}
