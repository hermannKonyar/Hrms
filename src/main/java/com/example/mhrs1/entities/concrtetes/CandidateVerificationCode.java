package com.example.mhrs1.entities.concrtetes;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="candidate_verification_code")
@Entity()
public class CandidateVerificationCode {

    @Id
    @GeneratedValue
    @Column(name="candidate_id")
    private int candidateID;


    @Column(name="verification_id")
    private int verificationID;
}
