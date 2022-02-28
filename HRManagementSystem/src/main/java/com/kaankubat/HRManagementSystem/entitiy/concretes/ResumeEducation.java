package com.kaankubat.HRManagementSystem.entitiy.concretes;

import javax.persistence.*;

@Entity
@Table(name = "resume_education")
public class ResumeEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;

    @ManyToOne
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker job_seeker;

    public JobSeeker getJob_seeker() {
        return job_seeker;
    }

    public void setJob_seeker(JobSeeker job_seeker) {
        this.job_seeker = job_seeker;
    }

    public JobSeeker getJobSeeker() {
        return jobSeeker;
    }

    public void setJobSeeker(JobSeeker jobSeeker) {
        this.jobSeeker = jobSeeker;
    }
}