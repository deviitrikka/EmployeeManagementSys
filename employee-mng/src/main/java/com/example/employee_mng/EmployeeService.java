package com.example.employee_mng;

import java.util.List;

import com.example.employee_mng.entity.EmployeeEntity;

// making the service layer
// a blueprint is made, which would be implemented later
public interface EmployeeService {
    //abstract method does not specify a body

    //create
    Employee creatEmployee(Employee employee);

    //read
    List<EmployeeEntity> readEmployees();

    //update
    EmployeeEntity updateEmployee(Long id, Employee employee);

    //delete
    boolean deleteEmployee(Long id);

}

//now controller will send data to this service layer, which wd perform the CRUD operations
