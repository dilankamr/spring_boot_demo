package com.lellzapps.interview_spring_boot.controller;

import com.lellzapps.interview_spring_boot.service.DBService_BeanNamingDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RestController_BeanNamingDemo {

    final private DBService_BeanNamingDemo dbServiceBeanNamingDemo1;
    final private DBService_BeanNamingDemo dbServiceBeanNamingDemo2;
    final private DBService_BeanNamingDemo dbServiceBeanNamingDemo3;
    final private DBService_BeanNamingDemo dbServiceBeanNamingDemo4;

    @Autowired
    public RestController_BeanNamingDemo(
            @Qualifier("DBService_BeanNamingDemo") DBService_BeanNamingDemo dbServiceBeanNamingDemo1,
            @Qualifier("dbServiceBean_AutoNaming_ByMethod") DBService_BeanNamingDemo dbServiceBeanNamingDemo2,
            @Qualifier("dbServiceBean_CustomNaming_ByBeanAnnotation") DBService_BeanNamingDemo dbServiceBeanNamingDemo3,
            @Qualifier("dbServiceBean_CustomNaming_ByQualifierAnnotation") DBService_BeanNamingDemo dbServiceBeanNamingDemo4
    )
    {
        this.dbServiceBeanNamingDemo1 = dbServiceBeanNamingDemo1;
        this.dbServiceBeanNamingDemo2 = dbServiceBeanNamingDemo2;
        this.dbServiceBeanNamingDemo3 = dbServiceBeanNamingDemo3;
        this.dbServiceBeanNamingDemo4 = dbServiceBeanNamingDemo4;

        log.info(">>>>>>>>>>>>>>>>>>>> " + this.dbServiceBeanNamingDemo1.serviceMessage());
        log.info(">>>>>>>>>>>>>>>>>>>> " + this.dbServiceBeanNamingDemo2.serviceMessage());
        log.info(">>>>>>>>>>>>>>>>>>>> " + this.dbServiceBeanNamingDemo3.serviceMessage());
        log.info(">>>>>>>>>>>>>>>>>>>> " + this.dbServiceBeanNamingDemo4.serviceMessage());
    }
}
