package com.example.mhrs1.entities.concrtetes;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name="employes")
@Entity()
public class Employe {

    @Id
    @ApiModelProperty(required = false, hidden = true)
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="dogum_gunu")
    private Date dogumGunu;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name="job_id")
    private List<JobTitle> jobTitle;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;
}
