package com.example.mhrs1.entities.concrtetes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name="verification_code")
@Entity()
public class VerificationCode {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="code")
    private String code;

    @Column(name = "date")
    private Date date;
}
