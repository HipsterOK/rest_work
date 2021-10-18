package com.example.work.rest_work.service;

import com.example.work.rest_work.model.Role;
import com.example.work.rest_work.repository.RoleRepository;
import com.example.work.rest_work.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.*;

@Service
@RequiredArgsConstructor
public class UserServiceImpl{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public Role readRole(Long id){
        Optional<RoleRepository> role = roleRepository.findById(id);
        if(role.isPresent()){
            return (Role) role.get();
        }
        throw new EntityNotFoundException("Не найдена такая роль");
    }

    public List<RoleRepository> readRole(){
        return roleRepository.findAll();
    }
}
