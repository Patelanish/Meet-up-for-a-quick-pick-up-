package com.globomatics.passion.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="register")
public class register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


  @Column(name= "name")
    private String name;

  @Column(name= "emailaddress")
    private String emailaddress;

  @Column(name= "username")
    private String username;

  @Column(name ="password")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}


