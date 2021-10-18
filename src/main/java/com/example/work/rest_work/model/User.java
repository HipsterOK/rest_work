package com.example.work.rest_work.model;

import com.example.work.rest_work.model.Role;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
@NoArgsConstructor
public class User {

    @Id
    private String login;

    private String name;

    private String password;

    private String role;

    @ManyToOne
    @JoinColumn(name = "name")
    @JsonManagedReference
    private Role role_name;
}