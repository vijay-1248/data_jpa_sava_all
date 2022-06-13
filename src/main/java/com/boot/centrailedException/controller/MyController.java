package com.boot.centrailedException.controller;

import com.boot.centrailedException.Entities.EmployeeEntity;
import com.boot.centrailedException.model.EmployeeDto;
import com.boot.centrailedException.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee/save")
    public List<EmployeeEntity> storeEmployeeData(@RequestBody List<EmployeeDto> employeeList){
        return employeeService.storeEmployee(employeeList);
    }
}
