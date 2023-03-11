package com.example.mhrs1.entities.concrtetes;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;


@Data
@Table(name="users")
@Entity()
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @ApiModelProperty(required = false, hidden = true)
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="tcno")
    private int tcNo;


    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    @Column(name = "e_mail")
    private String eMail;

    @Column(name="password")
    private String password;


    private String repassword;




}
