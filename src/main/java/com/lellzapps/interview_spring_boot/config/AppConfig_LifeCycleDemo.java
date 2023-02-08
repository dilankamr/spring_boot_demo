package com.lellzapps.interview_spring_boot.config;

import com.lellzapps.interview_spring_boot.service.DemoService_LifeCycleDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class AppConfig_LifeCycleDemo {


    @Scope("singleton")
    @Bean(value = "singletonBean", initMethod = "customInit", destroyMethod = "customDestroy")
    DemoService_LifeCycleDemo singletonBean()
    {
        log.info("============ called singletonBean() method");
        return new DemoService_LifeCycleDemo("Singleton");
    }

    @Scope("prototype")
    @Bean(value = "prototypeBean", initMethod = "customInit", destroyMethod = "customDestroy")
    DemoService_LifeCycleDemo prototypeBean()
    {
        log.info("============ called prototypeBean() method");
        return new DemoService_LifeCycleDemo("Prototype");
    }

    @Scope("request")
    @Bean(value = "requestBean", initMethod = "customInit", destroyMethod = "customDestroy")
    DemoService_LifeCycleDemo requestBean()
    {
        log.info("============ called requestBean() method");
        return new DemoService_LifeCycleDemo("Request");
    }

    @Scope("session")
    @Bean(value = "sessionBean", initMethod = "customInit", destroyMethod = "customDestroy")
    DemoService_LifeCycleDemo sessionBean()
    {
        log.info("============ called sessionBean() method");
        return new DemoService_LifeCycleDemo("Session");
    }

    @Scope("application")
    @Bean(value = "applicationBean", initMethod = "customInit", destroyMethod = "customDestroy")
    DemoService_LifeCycleDemo applicationBean()
    {
        log.info("============ called applicationBean() method");
        return new DemoService_LifeCycleDemo("Application");
    }
}
