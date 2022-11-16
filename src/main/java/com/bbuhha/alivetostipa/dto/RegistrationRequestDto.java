package com.bbuhha.alivetostipa.dto;

import com.bbuhha.alivetostipa.model.User;
import lombok.Data;

@Data
public class RegistrationRequestDto {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String password;

    public User toUser() {

        return new User(username, email, firstName, lastName, password);
    }
}
