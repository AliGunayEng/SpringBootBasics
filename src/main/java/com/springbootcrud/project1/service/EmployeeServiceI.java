package com.springbootcrud.project1.service;

import com.springbootcrud.project1.entity.Employee;
import com.springbootcrud.project1.model.EmployeeCreationModel;

import java.util.List;

public interface EmployeeServiceI {
    List<Employee> getAllEmployes();

    public List<Employee> getEmployeeByDepartment(String department);

    public String addEmployee(EmployeeCreationModel employeeCreationModel);

    public String deleteEmployee(Employee employee);

    Employee updateEmployee(Employee employee);
}
