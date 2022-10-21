package com.payroll.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payroll.app.entities.Salary;


@Repository
public interface SalaryRepo extends JpaRepository<Salary, Long>{

    List<Salary> findByEmployeeid(String employeeid);
    
}