package com.payroll.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.app.entities.Attendance;
import com.payroll.app.entities.Salary;
import com.payroll.app.repo.AttendanceRepo;


@Service
public class AttendanceService {
    
    
        @Autowired
        private AttendanceRepo repo;
        
        public Attendance addAttendance(Attendance u) {
            return repo.save(u);
        }
        public List<Attendance> getAllAttendance(){
            return repo.findAll();
        }
        
        public List<Attendance> getByEmpId(String EmpId){
            return repo.findByEmployeeid(EmpId);
        }
        
        public Attendance updateAttendance(long employeeid, Attendance newAttendance) {
            if(repo.findById(employeeid).isPresent()) {
                Attendance olduser= repo.findById(employeeid).get();
                olduser.setEmployeeid(newAttendance.getEmployeeid());
                olduser.setName(newAttendance.getName());
                olduser.setStarttime(newAttendance.getStarttime());
                olduser.setEndtime(newAttendance.getEndtime());
                olduser.setDate(newAttendance.getDate());
                olduser.setStatus(newAttendance.getStatus());
                
                return repo.save(olduser);
            }
            else {
                return null;
            }
        }
        
        
        public boolean deleteAttendance(long employeeid) {
            if(repo.findById(employeeid).isPresent()) {
                repo.deleteById(employeeid);
                return true;
            }
            
            else {
                return false;
            }
        }
        
    }