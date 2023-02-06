package com.lellzapps.interview_spring_boot.config;

import com.lellzapps.interview_spring_boot.service.E_DemoService;
import com.lellzapps.interview_spring_boot.service.F_DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class ApplicationConfig_AutowireDemo {

    @Bean
    E_DemoService getEDemoServiceBean_NamedByMethod()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService getEDemoServiceBean_NamedByMethod method called");
        return new E_DemoService("********** E_DemoService init using getEDemoServiceBean_NamedByMethod method");
    }

    @Bean("eDemoServiceBean_NamedByBean")
    E_DemoService getEDemoServiceBean_NamedByBean()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService getEDemoServiceBean_NamedByBean method called");
        return new E_DemoService("********** E_DemoService init using getEDemoServiceBean_NamedByBean method");
    }

    @Bean
    @Qualifier("eDemoServiceBean_NamedByQualifier")
    E_DemoService getEDemoServiceBean_NamedByQualifier()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService getEDemoServiceBean_NamedByQualifier method called");
        return new E_DemoService("********** E_DemoService init using getEDemoServiceBean_NamedByQualifier method");
    }

    @Bean("eDemoServiceBean_NamedByBeanAndQualifierBoth_Bean")
    @Qualifier("eDemoServiceBean_NamedByBeanAndQualifierBoth_Qualifier")
    E_DemoService getEDemoServiceBean_NamedByBeanAndQualifierBoth()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService getEDemoServiceBean_NamedByBeanAndQualifierBoth method called");
        return new E_DemoService("********** E_DemoService init using getEDemoServiceBean_NamedByBeanAndQualifierBoth method");
    }


    @Bean
    F_DemoService fDemoService()
    {
        log.info(">>>>>>>>>>>>>>>>>> F_DemoService fDemoService method called");
        return new F_DemoService("********** F_DemoService init using fDemoService method");
    }
}
