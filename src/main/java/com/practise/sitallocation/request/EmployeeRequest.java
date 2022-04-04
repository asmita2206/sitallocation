package com.practise.sitallocation.request;

import lombok.Data;

import javax.persistence.Column;

@Data
public class EmployeeRequest {

    private String employeeCode;
    private String employeeName;
    private String password;
    private String confirmPassword;
    @Column(columnDefinition = "boolean default false")
    private Boolean fullyVaxinated;
}
