package com.boot.centrailedException.service;

import com.boot.centrailedException.Entities.EmployeeEntity;
import com.boot.centrailedException.model.EmployeeDto;
import com.boot.centrailedException.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boot.centrailedException.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeEntity> storeEmployee(List<EmployeeDto> employeessList){
        List<EmployeeEntity> employeeEntities = employeeMapper.mapDtoToEntity(employeessList);
        return employeeRepository.saveAll(employeeEntities);
    }
}
