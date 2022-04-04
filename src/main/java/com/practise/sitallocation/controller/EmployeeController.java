package com.practise.sitallocation.controller;

import com.practise.sitallocation.request.EmployeeRequest;
import com.practise.sitallocation.response.EmployeeResponse;
import com.practise.sitallocation.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Employee")
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping
    public void addEmployee(@RequestBody EmployeeRequest request){
        service.addEmployee(request);
    }

    @GetMapping("/hello")
    public EmployeeResponse getEmployee(){
        return service.getEmployee();
    }
}
