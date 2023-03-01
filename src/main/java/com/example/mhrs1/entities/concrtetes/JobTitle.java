package com.example.mhrs1.entities.concrtetes;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="job_title")
@Entity()
public class JobTitle {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
}
