package com.example.mhrs1.entities.concrtetes;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import springfox.documentation.annotations.ApiIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name="employers")
@Entity()
public class Employer {
    @Id
    @ApiModelProperty(required = false, hidden = true)
    @GeneratedValue
    @Column(name="id")
    private int id;



    @OneToMany(cascade = CascadeType.ALL)
    @Column(name="job_id")
    private List<JobTitle> jobTitle;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;
}
