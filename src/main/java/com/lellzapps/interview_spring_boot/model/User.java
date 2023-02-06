package com.lellzapps.interview_spring_boot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "user")
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotBlank(message = "firstName cannot be empty")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "lastName cannot be null")
    @Column(name = "last_name")
    private String lastName;


}
