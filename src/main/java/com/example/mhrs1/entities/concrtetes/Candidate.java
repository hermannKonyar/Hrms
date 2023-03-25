package com.example.mhrs1.entities.concrtetes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name="candidates")
@Entity()
public class Candidate extends User {
    @Id
    @GeneratedValue
    @Column(name="Id")
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name="Surname")
    private String surname;

    @Column(name="Birth_Day")
    private Date dogumGunu;

    @Column(name="School")
    private String school;

    @Column(name = "School_Start_Date")
    private Date schoolStartDate;

    @Column(name = "School_End_Date")
    private Date schoolEndDate;

    @Column(name = "Experiences")
    private String experiences;

    @Column(name = "Languages")
    private String languages;

    @Column(name = "Photo_Url")
    private String photoUrl;

    @Column(name = "Social_Medias")
    private String socialMedia;

    @Column(name = "Programming_Languages")
    private String programmingLanguages;

    @Column(name = "Cover_Letter")
    private String coverLetter;

    @Column(name = "Tc_No",unique = true)
    private Long tcNo;


}
