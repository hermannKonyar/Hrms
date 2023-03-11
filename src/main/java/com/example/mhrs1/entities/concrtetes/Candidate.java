package com.example.mhrs1.entities.concrtetes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name="candidate")
@Entity()
public class Candidate {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="dogum_gunu")
    private Date dogumGunu;

    @OneToOne()
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;
}
