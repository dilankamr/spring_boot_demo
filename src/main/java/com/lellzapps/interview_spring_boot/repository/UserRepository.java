package com.lellzapps.interview_spring_boot.repository;

import com.lellzapps.interview_spring_boot.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public default String getMessage()
    {
        return "************ UserRepository getMessage()";
    }

}
