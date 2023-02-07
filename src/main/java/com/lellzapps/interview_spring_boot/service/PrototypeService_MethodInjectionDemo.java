package com.lellzapps.interview_spring_boot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@Scope(value = "prototype")
public class PrototypeService_MethodInjectionDemo {

    private String message;

    PrototypeService_MethodInjectionDemo()
    {
        this.message = "Message Created from PrototypeService_MethodInjectionDemo at:" + new Date().toLocaleString();
        log.info(">>>>>>>>>>>> PrototypeService_MethodInjectionDemo Constructor Called with message : " + this.message);
    }

    public String getMessage()
    {
        return message;
    }
}
