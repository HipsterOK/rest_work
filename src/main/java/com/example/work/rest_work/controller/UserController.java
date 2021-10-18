package com.example.work.rest_work.controller;

import com.example.work.rest_work.model.User;
import com.example.work.rest_work.service.UserService;
import com.example.work.rest_work.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {
    private final UserServiceImpl userService;

    @GetMapping("/role")
    public ResponseEntity readRole(@RequestParam(required = false) Long id) {
        if (id == null) {
            return ResponseEntity.ok(userService.readRole());
        }
        return ResponseEntity.ok(userService.readRole(id));
    }
  }