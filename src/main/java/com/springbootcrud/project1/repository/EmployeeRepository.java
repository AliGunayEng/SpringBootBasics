package com.springbootcrud.project1.repository;

import com.springbootcrud.project1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    List<Employee>findByDepartment(String department);


}
