package com.example.mhrs1.entities.concrtetes;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "employers")
@Entity()
public class Employer extends User {
    @Id
    @ApiModelProperty(required = false, hidden = true)
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotBlank
    @NotEmpty
    @Column(name = "surname")
    private String surname;

    @NotBlank
    @Column(name = "company_name")
    private String companyName;


}