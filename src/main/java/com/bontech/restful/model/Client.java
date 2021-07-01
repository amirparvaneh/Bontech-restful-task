package com.bontech.restful.model;

import javax.persistence.*;

@Entity
@Table(name = "Client")
public class Client {

public enum type {
    SIMPLE,ADMIN
}
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id ;
    @Column(name = "Name")
    private String name;
    @Column(name = "Credit")
    private int credit;
    @Column(name = "password")
    private long password;

    public Client() {
    }

    public Client(int id, String name, int credit,) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    public long getPassword(){
        return password;
    }
    public void setPassword(long password){
        this.password = password;
    }
}
