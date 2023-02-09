package com.lellzapps.interview_spring_boot.config;

import com.lellzapps.interview_spring_boot.service.PrototypeService_MethodInjectionDemo;
import com.lellzapps.interview_spring_boot.service.SingletonService_MethodInjectionDemo;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class APPConfig_MethodInjectionDemo {

    @Scope("prototype")
    @Bean
    PrototypeService_MethodInjectionDemo prototypeServiceMethodInjectionDemoBean()
    {
        return new PrototypeService_MethodInjectionDemo();
    }


    @Scope("singleton")
    @Bean
    SingletonService_MethodInjectionDemo singletonServiceMethodInjectionDemoBean()
    {
        return new SingletonService_MethodInjectionDemo() {
            @Override
            public PrototypeService_MethodInjectionDemo getPrototypeServiceMethodInjectionDemoInstance()
            {
                return prototypeServiceMethodInjectionDemoBean();
            }
        };
    }


    @PostConstruct
    private void testMethodInjection()
    {
        singletonServiceMethodInjectionDemoBean().getPrototypeServiceMethodInjectionDemoInstance().getMessage();
        singletonServiceMethodInjectionDemoBean().getPrototypeServiceMethodInjectionDemoInstance().getMessage();
        singletonServiceMethodInjectionDemoBean().getPrototypeServiceMethodInjectionDemoInstance().getMessage();
        singletonServiceMethodInjectionDemoBean().getPrototypeServiceMethodInjectionDemoInstance().getMessage();
        singletonServiceMethodInjectionDemoBean().getPrototypeServiceMethodInjectionDemoInstance().getMessage();
        singletonServiceMethodInjectionDemoBean().getPrototypeServiceMethodInjectionDemoInstance().getMessage();
        singletonServiceMethodInjectionDemoBean().getPrototypeServiceMethodInjectionDemoInstance().getMessage();
        singletonServiceMethodInjectionDemoBean().getPrototypeServiceMethodInjectionDemoInstance().getMessage();
    }

}
