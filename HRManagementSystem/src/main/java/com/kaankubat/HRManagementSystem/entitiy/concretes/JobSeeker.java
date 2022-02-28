package com.kaankubat.HRManagementSystem.entitiy.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kaankubat.HRManagementSystem.entitiy.abstracts.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
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

    @ApiModelProperty(hidden = true) //Api'de gizler
    @Column(name = "is_active", columnDefinition = "boolean default false")
    private Boolean isActive = false;

    @JsonIgnore
    @OneToMany(mappedBy = "job_seeker")
    private List<ResumeEducation> resumeEducations = new java.util.ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "job_seeker", cascade = CascadeType.ALL)
    private List<ResumeExperience> resumeExperiences = new java.util.ArrayList<>();

    public void setResumeEducations(List<ResumeEducation> resumeEducations) {
        this.resumeEducations = resumeEducations;
    }

    public List<ResumeEducation> getResumeEducations() {
        return resumeEducations;
    }

}
