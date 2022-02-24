package com.kaankubat.HRManagementSystem.entitiy.concretes;

import com.kaankubat.HRManagementSystem.entitiy.abstracts.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@Table(name = "job_seekers")
public class JobSeeker extends User {

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "identity_number")
    private int identity_number;

    @Column(name = "date")
    private LocalDate date;
}
