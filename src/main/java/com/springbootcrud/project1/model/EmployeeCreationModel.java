package com.springbootcrud.project1.model;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class EmployeeCreationModel {
    private String name;
    private String department;
    private Integer salary;
}
