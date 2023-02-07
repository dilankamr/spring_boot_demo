package com.lellzapps.interview_spring_boot.controller;

import com.lellzapps.interview_spring_boot.service.E_DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Slf4j
@RestController
public class RestController_CollectionInjectDemo {


    List<String> stringList;
    Set<Integer> integerSet;

    Map<Integer, Character> integerCharacterMap;

    List<E_DemoService> eDemoServiceList;

    @Autowired
    public void setStringList(List<String> stringList)
    {
        this.stringList = stringList;

        System.out.println("************ " + this.stringList.toString());
    }

    @Autowired
    public void setIntegerSet(Set<Integer> integerSet)
    {
        this.integerSet = integerSet;

        System.out.println("************ " + this.integerSet.toString());
    }

    @Autowired
    public void setIntegerCharacterMap(Map<Integer, Character> integerCharacterMap)
    {
        this.integerCharacterMap = integerCharacterMap;

        System.out.println("************ " + this.integerCharacterMap.toString());
    }

    @Autowired
    public void setEDemoServiceList(List<E_DemoService> eDemoServiceList)
    {
        this.eDemoServiceList = eDemoServiceList;

        for(E_DemoService eDemoService: eDemoServiceList)
        {
            eDemoService.printMessage();
        }
    }
}
