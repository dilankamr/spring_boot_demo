package com.lellzapps.interview_spring_boot.config;

import com.lellzapps.interview_spring_boot.service.DBService_BeanNamingDemo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig_BeanNamingDemo {

    @Bean
    DBService_BeanNamingDemo dbServiceBean_AutoNaming_ByMethod()
    {
        return new DBService_BeanNamingDemo("Bean using @Bean");
    }

    @Bean("dbServiceBean_CustomNaming_ByBeanAnnotation")
    DBService_BeanNamingDemo dbServiceBean1()
    {
        return new DBService_BeanNamingDemo("Bean using @Bean(name = \"...\")");
    }

    @Qualifier("dbServiceBean_CustomNaming_ByQualifierAnnotation")
    @Bean()
    DBService_BeanNamingDemo dbServiceBean2()
    {
        return new DBService_BeanNamingDemo("Bean using @Bean and @Qualifier(value = \"...\")");
    }
}
