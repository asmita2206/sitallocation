package com.practise.sitallocation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Login {

    @Id
    private String employeeCode;
    private String password;
}
