package com.lellzapps.interview_spring_boot.service;

import com.lellzapps.interview_spring_boot.config.exception.UserNotFoundException;
import com.lellzapps.interview_spring_boot.model.User;
import com.lellzapps.interview_spring_boot.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Service
public class UserService {

    final private UserRepository userRepository;

    @Service
    public static class PersonService
    {
         public void printMessage()
         {
             log.info("************ UserService.PersonService printMessage()");
         }
    }

    @Service
    public class MemberService
    {
        public void printMessage()
        {
            log.info("************ UserService.MemberService printMessage()");
        }
    }

    @Autowired
    UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public void printMessage()
    {
        log.info("************ UserService printMessage()");
    }

    public ResponseEntity<User> saveUser(User user)
    {
        User savedUser = userRepository.save(user);

        if(savedUser != null)
        {
            return new ResponseEntity<>(savedUser, HttpStatus.ACCEPTED);
        }
        else
        {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<User> getUser(Long id)
    {
        User savedUser = userRepository.findById(id).orElse(null);

        if(savedUser != null)
        {
            return new ResponseEntity<>(savedUser, HttpStatus.ACCEPTED);
        }
        else
        {
            throw new UserNotFoundException(id);
        }
    }

}
