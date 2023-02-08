package com.lellzapps.interview_spring_boot.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;


@NoArgsConstructor
@Slf4j
@Service
public class DemoService_LifeCycleDemo implements InitializingBean, DisposableBean {

    private String scope;

    public DemoService_LifeCycleDemo(String scope)
    {
        this.scope = scope;
        log.info("============ DemoService_LifeCycleDemo constructor called with scope : " + this.scope);
    }

    public void printScope()
    {
        log.info("============ DemoService_LifeCycleDemo bean with scope : " + this.scope);
    }

    @PostConstruct
    public void postConstruct()
    {
        log.info("============ DemoService_LifeCycleDemo with scope : " + this.scope + " called postConstruct() method");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        log.info("============ DemoService_LifeCycleDemo with scope : " + this.scope + " called InitializingBean -> afterPropertiesSet() method");
    }

    public void customInit()
    {
        log.info("============ DemoService_LifeCycleDemo with scope : " + this.scope + " called @Bean::initMethod -> customInit() method");
    }

    @PreDestroy
    public void preDestroy()
    {
        log.info("============ DemoService_LifeCycleDemo with scope : " + this.scope + " called preDestroy() method");
    }

    @Override
    public void destroy() throws Exception
    {
        log.info("============ DemoService_LifeCycleDemo with scope : " + this.scope + " called DisposableBean -> destroy() method");
    }

    public void customDestroy()
    {
        log.info("============ DemoService_LifeCycleDemo with scope : " + this.scope + " called @Bean::destroyMethod -> customDestroy() method");
    }

    public void finalize()
    {
        log.info("============ DemoService_LifeCycleDemo with scope : " + this.scope + " called before System.gc() -> finalize() method");
    }
}
