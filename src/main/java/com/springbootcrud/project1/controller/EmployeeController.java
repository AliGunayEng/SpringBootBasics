package com.springbootcrud.project1.controller;

import com.springbootcrud.project1.entity.Employee;
import com.springbootcrud.project1.model.EmployeeCreationModel;
import com.springbootcrud.project1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployes();
    }

    @GetMapping("/department/{department}")
    public List<Employee> getEmployeeByDepartmant(@PathVariable String department) {
        return employeeService.getEmployeeByDepartment(department);
    }

    @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeCreationModel employeeCreationModel){

        return employeeService.addEmployee(employeeCreationModel);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(Employee employee){
        return employeeService.deleteEmployee(employee);
    }

    @PutMapping("update/{id}")
    public Employee updateEmployee(@PathVariable Integer id,@RequestBody Employee employee){
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }



}
