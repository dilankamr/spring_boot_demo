package com.lellzapps.interview_spring_boot.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Scope(value = "singleton")
public abstract class SingletonService_MethodInjectionDemo {

    SingletonService_MethodInjectionDemo()
    {
        log.info(">>>>>>>>>>>> SingletonService_MethodInjectionDemo Constructor Called with message");
    }

    @Lookup
    public abstract PrototypeService_MethodInjectionDemo getPrototypeServiceMethodInjectionDemoInstance();
}
