package com.example.mhrs1.entities.concrtetes;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name="employess",uniqueConstraints={@UniqueConstraint(columnNames = {"Tc_No"})})
@Entity()
public class Employe extends User {

    @Id
    @ApiModelProperty(required = false, hidden = true)
    @GeneratedValue
    @Column(name="id")
    private int id;

    @NotBlank
    @Column(name="name")
    private String name;

    @NotBlank(message = "Soyad boş bırakılamaz!")
    @NotEmpty
    @Column(name="surname",nullable = false)
    private String surname;


    @NotBlank
    @Column(name = "Tc_No",unique = true)
    private Long tcNo;




}
