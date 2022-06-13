package com.boot.centrailedException.mapper;

import com.boot.centrailedException.Entities.EmployeeEntity;
import com.boot.centrailedException.model.EmployeeDto;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeMapper {

    public List<EmployeeEntity> mapDtoToEntity(List<EmployeeDto> employeeList){
        List<EmployeeEntity> employeeEntities = new ArrayList<>();
        if(!CollectionUtils.isEmpty(employeeList)){
            for(EmployeeDto employee : employeeList){
                EmployeeEntity employeeEntity = new EmployeeEntity();
                employeeEntity.setName(employee.getName());
                employeeEntity.setDissignation(employee.getDissignation());
                employeeEntities.add(employeeEntity);
            }
        }
        return employeeEntities;
    }
}
