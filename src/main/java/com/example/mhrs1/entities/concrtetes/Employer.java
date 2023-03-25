package com.example.mhrs1.entities.concrtetes;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

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
    @Size(min=1)
    private String surname;

    @NotBlank
    @Column(name = "company_name")
    private String companyName;

    @NotBlank
    @Column(name = "web_site")
    private String webSite;


}