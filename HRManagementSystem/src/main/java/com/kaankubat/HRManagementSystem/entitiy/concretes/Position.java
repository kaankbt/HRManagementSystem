package com.kaankubat.HRManagementSystem.entitiy.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "position_name")
    private String position_name;
}
