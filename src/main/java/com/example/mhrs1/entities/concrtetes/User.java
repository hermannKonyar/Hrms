package com.example.mhrs1.entities.concrtetes;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.Date;


@Data
@Table(name="users",uniqueConstraints={@UniqueConstraint(columnNames = {"e_mail"})})
@Entity()
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @ApiModelProperty(required = false, hidden = true)
    @GeneratedValue
    @Column(name="id")
    private int id;


    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    @Column(name = "e_mail",unique = true)
    private String eMail;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="dogum_gunu")
    private Date dogumGunu;
    @Column(name="password")
    private String password;


    private String repassword;




}
