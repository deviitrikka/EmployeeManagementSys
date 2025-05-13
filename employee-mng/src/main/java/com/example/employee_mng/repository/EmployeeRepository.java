package com.example.employee_mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.example.employee_mng.entity.EmployeeEntity;

// @Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
    
}
