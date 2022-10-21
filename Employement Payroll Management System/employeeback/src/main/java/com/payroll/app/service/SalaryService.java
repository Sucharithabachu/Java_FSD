package com.payroll.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.app.entities.Salary;
import com.payroll.app.repo.SalaryRepo;



@Service
public class SalaryService {
    
    @Autowired
    private SalaryRepo repo;
    
    public Salary addSalaryInfo(Salary salary) {
        return repo.save(salary);
    }
    
    public List<Salary> getAllInfo(){
        return repo.findAll();
    }
        
    public Salary updateSalaryInfo(Long id, Salary newinfo) {
        if(repo.findById(id).isPresent()) {
            Salary oldinfo = repo.findById(id).get();
            oldinfo.setSalary(newinfo.getSalary());
            return repo.save(oldinfo);
        }else {
            return null;
        }
    }
    
    public boolean deleteSalaryInfo(Long id) {
        if(repo.findById(id).isPresent()) {
            repo.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }
    
    public Salary getSalaryById(Long id) {
        if(repo.findById(id).isPresent()) {
            return repo.findById(id).get();
        }
        else {
            return null;
        }
    }
    
    //Fetching Details By EmpId
    public List<Salary> getByEmpId(String EmpId){
        return repo.findByEmployeeid(EmpId);
    }

    /*
    public Salary updateSalaryByEmpId(String employeeid, Salary newinfo) {
        if(repo.findByEmployeeid(employeeid).isPresent()) {
            Salary oldinfo = repo.findByEmployeeid(employeeid).get();
            oldinfo.setSalary(newinfo.getSalary());
            return repo.save(oldinfo);
        }else {
            return null;
        }
    }*/
}