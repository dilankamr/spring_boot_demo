package com.lellzapps.interview_spring_boot.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Slf4j
@Configuration
public class ApplicationConfig_CollectionInjectDemo {

    @Bean
    List<String> stringListBean()
    {
        log.info(">>>>>>>>>>>>>>>>>> stringListBean() method called");
        return Arrays.asList("string A", "string B", "string C", "string D", "string E");
    }

    @Bean
    Set<Integer> integerSetBean()
    {
        log.info(">>>>>>>>>>>>>>>>>> integerSetBean() method called");
        return new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    }

    @Bean
    Map<Integer, Character> integerCharacterMapBean()
    {
        log.info(">>>>>>>>>>>>>>>>>> integerCharacterMapBean() method called");

        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'A');
        map.put(2, 'B');
        map.put(3, 'C');
        map.put(4, 'D');
        map.put(5, 'E');

        return map;
    }
}
