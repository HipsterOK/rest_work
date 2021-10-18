package com.example.work.rest_work.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    private long id;
    private String name;

    public Role(){ }

    public Role(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Role{" +
                "id=" + id +
                ", name='"+name+ "\'" +
                '}';
    }
}
