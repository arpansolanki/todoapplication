package com.application.todoapplication.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;

@Getter
@NoArgsConstructor
@Accessors(chain = true)
@Validated
@Setter
public class UserRegister {

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String phoneNumber;


}
