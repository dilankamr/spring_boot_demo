package com.lellzapps.interview_spring_boot.controller;

import com.lellzapps.interview_spring_boot.repository.UserRepository;
import com.lellzapps.interview_spring_boot.service.UserService;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
public class RestController_AutowireUsingLombok {

    final private UserService userService;

    final private UserService.PersonService uPersonService;

    final private UserService.MemberService uMemberService;


    @PostConstruct
    public void printMessages()
    {
        System.out.println("**************** RestController_AutowireUsingLombok: printMessages");

        this.userService.printMessage();
        this.uPersonService.printMessage();
        this.uMemberService.printMessage();
    }
}
