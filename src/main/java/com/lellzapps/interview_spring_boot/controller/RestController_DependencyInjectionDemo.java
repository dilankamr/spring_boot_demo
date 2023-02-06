package com.lellzapps.interview_spring_boot.controller;

import com.lellzapps.interview_spring_boot.repository.UserRepository;
import com.lellzapps.interview_spring_boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RestController_DependencyInjectionDemo {

    final private UserService userService;

    private UserRepository userRepository;

    @Autowired
    public RestController_DependencyInjectionDemo(UserService userService)
    {
        log.info(">>>>>>>>>>>>>>>>>> RestController_DependencyInjectionDemo(UserService userService) constructor called");

        this.userService = userService;
        this.userService.printMessage();
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository)
    {
        log.info(">>>>>>>>>>>>>>>>>> RestController_DependencyInjectionDemo setUserRepository setter called");

        this.userRepository = userRepository;
        log.info(this.userRepository.getMessage());
    }
}
