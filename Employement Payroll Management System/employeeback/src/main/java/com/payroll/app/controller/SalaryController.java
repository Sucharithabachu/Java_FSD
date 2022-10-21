package com.payroll.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payroll.app.entities.Salary;
import com.payroll.app.service.SalaryService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/salary")
public class SalaryController {

    @Autowired
    private SalaryService service;
    
    @PostMapping("/")
    public ResponseEntity<Salary> addSalary(@RequestBody Salary s){
        Salary salary=service.addSalaryInfo(s);
        if(salary!=null)
            return new ResponseEntity<Salary>(salary,HttpStatus.CREATED);
        else
            return new ResponseEntity<Salary>(salary,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    
    @GetMapping("/")
    public List<Salary> getAllInfo(){
        return service.getAllInfo();    
    }
    
    @GetMapping("/{id}")
    public Salary getById(@PathVariable long id) {
        return service.getSalaryById(id);
    }
    
    
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateInfo(@PathVariable Long id,@RequestBody Salary newInfo){
        Salary oldInfo=service.updateSalaryInfo(id, newInfo);
        if(oldInfo!=null)
            return new ResponseEntity<Object>(oldInfo,HttpStatus.OK);
        else
            return new ResponseEntity<Object>("No SalaryInfo Available to Update",HttpStatus.NOT_FOUND);
    }
    
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteSalary(@PathVariable Long id){
        boolean result= service.deleteSalaryInfo(id);
        if(result)
            return new ResponseEntity<Object>("Object Deleted",HttpStatus.OK);
        else
            return new ResponseEntity<Object>("NO user Found", HttpStatus.NOT_FOUND);
    }
    
    
    //Fetching Details By EmpId
    @GetMapping("/emp/{employeeid}")
    public List<Salary> getByEmpId(@PathVariable String employeeid){
        return service.getByEmpId(employeeid);
    }
    
    /*
    @PutMapping("emp/{employeeid}")
    public Salary updateInfoByEmpId(@PathVariable String employeeid,@RequestBody Salary newInfo){
        return service.updateSalaryByEmpId(employeeid, newInfo);
    }*/
}