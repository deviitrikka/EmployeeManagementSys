package com.example.employee_mng;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_mng.entity.EmployeeEntity;
import com.example.employee_mng.repository.EmployeeRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class EmployeeServiceImplement implements EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    // List<Employee> employees = new ArrayList<>();

    @Override
    public Employee creatEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity(); //to save in table
        BeanUtils.copyProperties(employee, employeeEntity); //copy from employee.java to employeeEntity
        employeeRepository.save(employeeEntity); //save in table
        // employees.add(employee);
        return employee;
    }

    @Override
    public List<EmployeeEntity> readEmployees() {
        List<EmployeeEntity> employees =  employeeRepository.findAll();
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        EmployeeEntity emp = employeeRepository.findById(id).get();
        employeeRepository.delete(emp);
        return true;
    }

    @Override
    public EmployeeEntity updateEmployee(Long id, Employee employee) {
        //find existing employee
        EmployeeEntity existingEmployee = employeeRepository.findById(id).get();

        //update values
        existingEmployee.setName(employee.getName());
        existingEmployee.setNumber(employee.getNumber());
        existingEmployee.setSalary(employee.getSalary());
        //save new employee
        employeeRepository.save(existingEmployee);

        return existingEmployee;
    }
    
}
