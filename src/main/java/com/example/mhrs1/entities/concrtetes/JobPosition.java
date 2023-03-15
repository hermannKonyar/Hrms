package com.example.mhrs1.entities.concrtetes;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="job_title",uniqueConstraints={@UniqueConstraint(columnNames = {"name"})})
@Entity()
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name="id")
    @ApiModelProperty(required = false, hidden = true)
    private int id;


    @Column(name="name",unique = true)
    private String name;
}
