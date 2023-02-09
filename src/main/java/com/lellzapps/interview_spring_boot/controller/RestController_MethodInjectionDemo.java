package com.lellzapps.interview_spring_boot.controller;

import com.lellzapps.interview_spring_boot.model.User;
import com.lellzapps.interview_spring_boot.service.PrototypeService_MethodInjectionDemo;
import com.lellzapps.interview_spring_boot.service.SingletonService_MethodInjectionDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController_MethodInjectionDemo {


    private final SingletonService_MethodInjectionDemo singletonServiceMethodInjectionDemo;

    @Autowired
    public RestController_MethodInjectionDemo(@Qualifier("singletonService_MethodInjectionDemo") SingletonService_MethodInjectionDemo singletonServiceMethodInjectionDemo)
    {
        this.singletonServiceMethodInjectionDemo = singletonServiceMethodInjectionDemo;
    }


    @RequestMapping(path = "/message", method = RequestMethod.GET)
    public ResponseEntity<?> getMessage()
    {
        PrototypeService_MethodInjectionDemo prototypeInstance = this.singletonServiceMethodInjectionDemo.getPrototypeServiceMethodInjectionDemoInstance();
        return new ResponseEntity<>(prototypeInstance.getMessage(), HttpStatus.ACCEPTED);
    }

}
