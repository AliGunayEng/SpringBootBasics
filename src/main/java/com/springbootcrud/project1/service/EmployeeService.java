package com.springbootcrud.project1.service;

import com.springbootcrud.project1.entity.Employee;
import com.springbootcrud.project1.model.EmployeeCreationModel;
import com.springbootcrud.project1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceI{
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployes() {

        return employeeRepository.findAll();
    }


    public List<Employee> getEmployeeByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    public String addEmployee(EmployeeCreationModel employeeCreationModel) {
        Employee employee=new Employee();
        employee.setName(employeeCreationModel.getName());
        employee.setDepartment(employeeCreationModel.getDepartment());
        employee.setSalary(employeeCreationModel.getSalary());
        employeeRepository.save(employee);
        return "Successfully Added.";
    }

    public String deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
        return "Successfully Deleted.";
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


}
