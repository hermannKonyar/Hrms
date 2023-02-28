package com.example.mhrs1.entities.concrtetes;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="JobTitle")
@Entity()
public class JobTitle {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
}
