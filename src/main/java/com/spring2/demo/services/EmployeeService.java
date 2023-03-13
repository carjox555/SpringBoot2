package com.spring2.demo.services;

import com.spring2.demo.models.Employee;
import com.spring2.demo.models.Empresa;
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

    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employeeList.add(employee));
        return employeeList;

        }
        //Metodo para buscar employee por id
    public Optional <Employee> getEmployeeById(Integer id){
         return employeeRepository.findById(id);
        }

        //Guardad o actualizar
    public Employee saveOrUpdateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    //Eliminar
    public boolean deleteEmployee(Integer id){
        employeeRepository.deleteById(id);
        if(this.employeeRepository.findById(id).isPresent()){
        return  false;
        }
        return true;
    }
}
