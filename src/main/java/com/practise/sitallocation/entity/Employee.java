package com.practise.sitallocation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    private String employeeCode;
    private String employeeName;
    private String password;
    private Boolean fullyVaxinated=false;

}