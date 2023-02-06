package com.lellzapps.interview_spring_boot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Qualifier("dbServiceBean_CustomNaming_ByServiceAndQualifierAnnotation")
//@Service(value = "dbServiceBean_CustomNaming_ByServiceAnnotation")
public class DBService_BeanNamingDemo {

    private String message = "";

    public DBService_BeanNamingDemo()
    {
        this.message = "Bean using @Service";
    }

    public DBService_BeanNamingDemo(String message)
    {
        this.message = message;
    }

    public String serviceMessage()
    {
        return this.message;
    }
}

