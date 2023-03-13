package com.spring2.demo.controller;

import com.spring2.demo.models.Employee;
import com.spring2.demo.models.Empresa;
import com.spring2.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class employeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> verEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee")
    public Optional<Employee>saveEmployee(@RequestBody Employee empl){
        return Optional.ofNullable(employeeService.saveOrUpdateEmployee(empl));
    }

}
