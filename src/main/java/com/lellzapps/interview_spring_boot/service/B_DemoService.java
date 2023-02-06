package com.lellzapps.interview_spring_boot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class B_DemoService {

    private A_DemoService a_demoService;

//    @Autowired
//    public B_DemoService(A_DemoService aDemoService)
//    {
//        this.a_demoService = aDemoService;
//
//        log.info(">>>>>>>>>>>>>>>>>> B_DemoService constructor called");
////        this.a_demoService.printMessage();
//    }

    public B_DemoService()
    {
        log.info(">>>>>>>>>>>>>>>>>> B_DemoService constructor called");
    }

    @Autowired
    public void setA_demoService(A_DemoService a_demoService)
    {
        this.a_demoService = a_demoService;
    }

    public void printMessage()
    {
        log.info("************ B_DemoService printMessage()");
    }
}
