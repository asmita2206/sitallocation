package com.practise.sitallocation.service;

import com.practise.sitallocation.entity.Employee;
import com.practise.sitallocation.entity.Login;
import com.practise.sitallocation.repository.EmployeeRepository;
import com.practise.sitallocation.repository.LoginRepository;
import com.practise.sitallocation.request.EmployeeRequest;
import com.practise.sitallocation.response.EmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;
    private final LoginRepository loginRepository;

    public void addEmployee(EmployeeRequest request) {

        String password= request.getPassword();
        String confirmPassword= request.getConfirmPassword();
        Employee employee=new Employee();
        Login login=new Login();
        employee.setEmployeeCode(request.getEmployeeCode());
        employee.setEmployeeName(request.getEmployeeName());
        employee.setFullyVaxinated(request.getFullyVaxinated());
        login.setEmployeeCode(request.getEmployeeCode());

        if(password.equals(confirmPassword)){
            login.setPassword(request.getPassword());
            employee.setPassword(request.getPassword());
            loginRepository.save(login);
            repository.save(employee);
        }

    }

    public EmployeeResponse getEmployee() {
        List<Employee> employeeList=repository.findAll();
        EmployeeResponse response=new EmployeeResponse();
//        Iterator iterator=employeeList.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (Employee employee : employeeList){
            response.setEmployeeCode(employee.getEmployeeCode());
            response.setEmployeeName(employee.getEmployeeName());
            response.setFullyVaxinated(employee.getFullyVaxinated());
        }
       return response;
    }
}
