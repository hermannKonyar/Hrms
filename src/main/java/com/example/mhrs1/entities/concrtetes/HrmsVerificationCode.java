package com.example.mhrs1.entities.concrtetes;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="hrms_verification_code")
@Entity()
public class HrmsVerificationCode {

    @Id
    @GeneratedValue
    @Column(name="hrms_id")
    private int hrmsId;


    @Column(name="verification_id")
    private int verificationID;
}
