package com.lellzapps.interview_spring_boot.controller;

import com.lellzapps.interview_spring_boot.model.User;
import com.lellzapps.interview_spring_boot.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin("*")
@RequestMapping("user")
@RestController
public class UserRestController {

    final private UserService userService;

    final private UserService.PersonService uPersonService;

    final private UserService.MemberService uMemberService;

    @Autowired
    public UserRestController(UserService userService,
                              UserService.PersonService uPersonService,
                              UserService.MemberService uMemberService)
    {
        this.userService = userService;
        this.uPersonService = uPersonService;
        this.uMemberService = uMemberService;

        this.uPersonService.printMessage();
        this.uMemberService.printMessage();
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user)
    {
        return this.userService.saveUser(user);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable("id") Long id)
    {
        return this.userService.getUser(id);
    }
}
