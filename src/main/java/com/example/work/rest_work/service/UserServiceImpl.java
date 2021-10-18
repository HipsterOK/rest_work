package com.example.work.rest_work.service;

import com.example.work.rest_work.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserServiceImpl implements UserService{

    // Хранилище user
    private static final Map<String, User> CLIENT_REPOSITORY_MAP = new HashMap<>();

    // Переменная для генерации ID клиента
    private static final AtomicInteger CLIENT_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(User user, String login) {
        user.setLogin(login);
        CLIENT_REPOSITORY_MAP.put(login, user);
    }

    @Override
    public List<User> readAll() {
        return new ArrayList<>(CLIENT_REPOSITORY_MAP.values());
    }

    @Override
    public User read(String login) {
        return CLIENT_REPOSITORY_MAP.get(login);
    }

    @Override
    public boolean update(User user, String login) {
        if (CLIENT_REPOSITORY_MAP.containsKey(login)) {
            user.setLogin(login);
            CLIENT_REPOSITORY_MAP.put(login, user);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String login) {
        return CLIENT_REPOSITORY_MAP.remove(login) != null;
    }
}
