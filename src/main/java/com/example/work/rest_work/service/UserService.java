package com.example.work.rest_work.service;

import com.example.work.rest_work.model.User;

import java.util.List;

public interface UserService {
    /**
     * Создает нового клиента
     * @param user - клиент для создания
     */
    void create(User user, String login);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    List<User> readAll();

    /**
     * Возвращает клиента по его login
     * @param login - login клиента
     * @return - объект клиента с заданным login
     */
    User read(String login);

    /**
     * Обновляет клиента с заданным login,
     * в соответствии с переданным клиентом
     * @param user - клиент в соответсвии с которым нужно обновить данные
     * @param login - login клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(User user, String login);

    /**
     * Удаляет клиента с заданным login
     * @param login - login клиента, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(String login);
}
