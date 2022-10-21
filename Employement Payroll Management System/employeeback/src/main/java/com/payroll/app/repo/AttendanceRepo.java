package com.payroll.app.repo;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.payroll.app.entities.Attendance;



public interface AttendanceRepo extends JpaRepository<Attendance,Long>{
    
    List<Attendance> findByEmployeeid(String employeeid);
    

}