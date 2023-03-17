package com.spring2.demo.repository;

import com.spring2.demo.models.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Integer> {

    @Query(value = "select * from employee where empresa_id=?1", nativeQuery = true) // el ? significa el numero del parametro que se necesite example (Integer id, String nombre);
    public abstract ArrayList<Employee> findByEmpresa(Integer id);
}

