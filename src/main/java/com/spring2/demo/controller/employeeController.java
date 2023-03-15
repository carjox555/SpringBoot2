package com.spring2.demo.controller;

import com.spring2.demo.models.Employee;
import com.spring2.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PatchMapping("/employees/{id}")
    public Employee actualizarEmpleado(@PathVariable("id") Integer id, @RequestBody Employee employee){
        Employee empl=employeeService.getEmployeeById(id).get();
        empl.setNombre(employee.getNombre());
        empl.setCorreo(employee.getCorreo());
        empl.setEmpresa(employee.getEmpresa());
        empl.setRol(employee.getRol());
        return employeeService.saveOrUpdateEmployee(empl);
    }

}
