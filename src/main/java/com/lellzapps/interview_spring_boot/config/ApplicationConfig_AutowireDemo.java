package com.lellzapps.interview_spring_boot.config;

import com.lellzapps.interview_spring_boot.service.E_DemoService;
import com.lellzapps.interview_spring_boot.service.F_DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Slf4j
@Configuration
public class ApplicationConfig_AutowireDemo {

    @Order(Ordered.HIGHEST_PRECEDENCE)
    @Bean
    E_DemoService getEDemoServiceBean_NamedByMethod()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService getEDemoServiceBean_NamedByMethod method called");
        return new E_DemoService("********** E_DemoService init using getEDemoServiceBean_NamedByMethod method (@Order(Ordered.HIGHEST_PRECEDENCE))");
    }

    @Order(Ordered.LOWEST_PRECEDENCE)
    @Bean("eDemoServiceBean_NamedByBean")
    E_DemoService getEDemoServiceBean_NamedByBean()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService getEDemoServiceBean_NamedByBean method called");
        return new E_DemoService("********** E_DemoService init using getEDemoServiceBean_NamedByBean method (@Order(Ordered.LOWEST_PRECEDENCE))");
    }

    @Order(1)
    @Bean("eDemoServiceBean_NamedByBeanAndQualifierBoth_Bean")
    @Qualifier("eDemoServiceBean_NamedByBeanAndQualifierBoth_Qualifier")
    E_DemoService getEDemoServiceBean_NamedByBeanAndQualifierBoth()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService getEDemoServiceBean_NamedByBeanAndQualifierBoth method called");
        return new E_DemoService("********** E_DemoService init using getEDemoServiceBean_NamedByBeanAndQualifierBoth method (@Order(1) - first)");
    }

    @Order(1)
    @Bean
    @Qualifier("eDemoServiceBean_NamedByQualifier")
    E_DemoService getEDemoServiceBean_NamedByQualifier()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService getEDemoServiceBean_NamedByQualifier method called");
        return new E_DemoService("********** E_DemoService init using getEDemoServiceBean_NamedByQualifier method (@Order(1) - second)");
    }

    @Bean(autowireCandidate = false)
    E_DemoService getEDemoServiceBean_AutowireCandidateFalse()
    {
        log.info(">>>>>>>>>>>>>>>>>> E_DemoService getEDemoServiceBean_AutowireCandidateFalse method called");
        return new E_DemoService("********** E_DemoService init using getEDemoServiceBean_AutowireCandidateFalse method");
    }

    @Bean
    F_DemoService fDemoService()
    {
        log.info(">>>>>>>>>>>>>>>>>> F_DemoService fDemoService method called");
        return new F_DemoService("********** F_DemoService init using fDemoService method");
    }
}
