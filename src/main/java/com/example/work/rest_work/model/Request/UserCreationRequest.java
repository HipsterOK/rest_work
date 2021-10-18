package com.example.work.rest_work.model.Request;

import lombok.Data;

@Data
public class UserCreationRequest {
    private String name;
    private String login;
    private String password;
    private String role;
}
