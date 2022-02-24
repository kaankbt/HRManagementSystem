package com.kaankubat.HRManagementSystem.entitiy.concretes;

import com.kaankubat.HRManagementSystem.entitiy.abstracts.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "system_personnel")
public class SystemPersonnel extends User {

    @Column(name = "position_name")
    private String position_name;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;
}
