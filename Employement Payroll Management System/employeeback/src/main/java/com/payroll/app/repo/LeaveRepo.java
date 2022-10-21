package com.payroll.app.repo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.payroll.app.entities.Leaves;
import com.payroll.app.entities.Salary;


public interface LeaveRepo extends JpaRepository<Leaves, Long>{

    List<Leaves> findByEmployeeid(String employeeid);
    
   
    
    void deleteByEmployeeid(String employeeid);
}