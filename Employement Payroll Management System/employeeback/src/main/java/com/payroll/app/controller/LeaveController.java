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
import org.springframework.web.bind.annotation.RestController;

import com.payroll.app.entities.Leaves;
import com.payroll.app.service.LeaveService;

@RestController
//@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class LeaveController {
    
    @Autowired
    private LeaveService service;
    
    @PostMapping("/leave")
    public Leaves applyLeave(@RequestBody Leaves leave) {
        return service.applyLeave(leave);
    }
    
    @GetMapping("/leave")
    public List<Leaves> getAllLeave() {
        return service.getAllLeave();
    }
    
    @GetMapping("/leave/{employeeid}")
    public List<Leaves> getByEmpId(@PathVariable String employeeid){
        return service.getLeaveByEmployeeid(employeeid);
    }
    
    
    @GetMapping("/leave/pending")
    public List<Leaves> pendingLeave()  {
        List<Leaves> list = service.pendingLeave();
        if(list!=null)
            return list;
        return null;
        
    }
    
    @GetMapping("/leave/remaining")
    public List<Leaves> remainingLeave()  {
        List<Leaves> list = service.remainingLeave();
        if(list!=null)
            return list;
        return null;
    }
    
    
    
    
    @PutMapping("/leave/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id,@RequestBody Leaves ques){
        Leaves data= service.update(id,ques);       
        if(data!=null)
            return new ResponseEntity<Object>(data,HttpStatus.OK);
        else
            return new ResponseEntity<Object>("Question is Not Available",HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/leave/{employeeid}")
    public ResponseEntity<Object> deleteUser(@PathVariable  String employeeid ){    
        if(service.deleteLeave(employeeid))
            return new ResponseEntity<Object>("Leave Deleted", HttpStatus.OK);
        else
            return new ResponseEntity<Object>("No Leave Found",HttpStatus.NOT_FOUND);
    }

}