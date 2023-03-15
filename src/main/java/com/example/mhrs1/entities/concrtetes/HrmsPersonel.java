package com.example.mhrs1.entities.concrtetes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name="hrms_personel")
@Entity()
public class HrmsPersonel {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="tcno")
    private int tcNo;



}
