package com.lellzapps.interview_spring_boot.controller;

import com.lellzapps.interview_spring_boot.service.DemoService_LifeCycleDemo;
import com.lellzapps.interview_spring_boot.service.PrototypeService_MethodInjectionDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class RestController_LifeCycleDemo {

    @Autowired
    ConfigurableApplicationContext applicationContext;

    @Lookup("singletonBean")
    public abstract DemoService_LifeCycleDemo getSingletonScopedBean();

    @Lookup("prototypeBean")
    public abstract DemoService_LifeCycleDemo getPrototypeScopedBean();

    @Lookup("requestBean")
    public abstract DemoService_LifeCycleDemo getRequestScopedBean();

    @Lookup("sessionBean")
    public abstract DemoService_LifeCycleDemo getSessionScopedBean();

    @Lookup("applicationBean")
    public abstract DemoService_LifeCycleDemo getApplicationScopedBean();


    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<?> testLifeCycles()
    {
        DemoService_LifeCycleDemo singletonBean = getSingletonScopedBean();
        singletonBean.printScope();

        DemoService_LifeCycleDemo prototypeBean = getPrototypeScopedBean();
        prototypeBean.printScope();

        DemoService_LifeCycleDemo requestBean = getRequestScopedBean();
        requestBean.printScope();

        DemoService_LifeCycleDemo sessionBean = getSessionScopedBean();
        sessionBean.printScope();

        DemoService_LifeCycleDemo applicationBean = getApplicationScopedBean();
        applicationBean.printScope();

        DemoService_LifeCycleDemo object = new DemoService_LifeCycleDemo();
        object.printScope();

        return new ResponseEntity<>("Instances Created", HttpStatus.ACCEPTED);
    }

    @RequestMapping(path = "/shutdown", method = RequestMethod.GET)
    public ResponseEntity<?> shutdownApp()
    {
        applicationContext.close();
        return new ResponseEntity<>("Instances Created", HttpStatus.ACCEPTED);
    }
}
