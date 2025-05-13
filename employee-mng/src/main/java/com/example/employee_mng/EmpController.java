package com.example.employee_mng;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_mng.entity.EmployeeEntity;

import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class EmpController {
    // List<Employee> employees= new ArrayList<>();

    //Dependency Injection
    @Autowired
    EmployeeService employees;
    // EmployeeService employees = new EmployeeServiceImplement();

    @GetMapping("employees")
    public List<EmployeeEntity> getAllEmployees(){        
        return employees.readEmployees();
    }

    @PostMapping("employees")
    public Employee createEmployee(@RequestBody Employee employee){
        employees.creatEmployee(employee);
        return employee;
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employees.deleteEmployee(id)) return "Deleted successfully";
        return "Not Found";
    }

    @PutMapping("employees/{id}")
    public Employee updaEmployeeEntity(@PathVariable Long id, @RequestBody Employee employee) {
        employees.updateEmployee(id, employee);
        
        return employee;
    }
}
