package com.kaankubat.HRManagementSystem.entitiy.abstracts;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "password_repeat")
    private String password_repeat;
}
