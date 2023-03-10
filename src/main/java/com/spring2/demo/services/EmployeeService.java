package com.spring2.demo.services;

import com.spring2.demo.models.Employee;
import com.spring2.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.exceptions.TemplateOutputException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employeeList.add(employee));
        return employeeList;

}
public Optional <Employee> getEmployeeById(Integer id){
        return employeeRepository.findById(id);
}

}
