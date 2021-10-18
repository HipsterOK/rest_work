package com.example.work.rest_work.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
        private String name;
        private String login;
        private String password;
        private String role;

        public User(){ }

        public User(String name, String login, String password, String role){
            this.name=name;
            this.login=login;
            this.password=password;
            this.role=role;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getLogin(){
            return login;
        }

        public void setLogin(String login){
            this.login = login;
        }

        public String getPassword(){
            return password;
        }

        public void setPassword(String password){
            this.password = password;
        }

        public String getRole(){
            return role;
        }

        public void setRole(String role){
            this.role = role;
        }

        @Override
    public String toString() {
            return "User{" +
                    "name=" + name +
                    ", login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    ", role=" + role + '\'' +
                    '}';
        }
}

