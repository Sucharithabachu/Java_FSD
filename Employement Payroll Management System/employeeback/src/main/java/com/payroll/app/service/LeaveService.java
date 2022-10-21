package com.payroll.app.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.app.entities.Leaves;
import com.payroll.app.repo.LeaveRepo;

@Service
public class LeaveService {
    
    @Autowired
    private LeaveRepo repo;
    
    public Leaves applyLeave(Leaves leave) {
        return repo.save(leave);
    }
    
    public List<Leaves> getAllLeave(){
        return repo.findAll();
    }
    
    @PersistenceContext
    private EntityManager em;
    public List<Leaves> pendingLeave() {
        Query query = em.createQuery("select l from Leaves l where l.status = 'Pending'");
        return query.getResultList();
    }
    
    public List<Leaves> remainingLeave() {
        Query query = em.createQuery("select l from Leaves l where l.status = 'Approved' or l.status = 'Rejected'");
        return query.getResultList();
    }
    
  
    
    public List<Leaves> getLeaveByEmployeeid(String employeeid) {
      
            return repo.findByEmployeeid(employeeid);
         
    }
    
    public int updateLeave(String employeeid,Long id,Leaves newLeave) {  
        Query query = em.createQuery("update Leaves set status = '"+newLeave.getStatus()+"' where id= "+id+" and employeeid= "+employeeid);
        return query.executeUpdate();
    }
    
    public Leaves update(Long id,Leaves newLeave) {
        if(repo.findById(id).isPresent())
        {
            Leaves old = repo.findById(id).get();
            old.setStatus(newLeave.getStatus());
            return repo.save(old);
        } else
            return null;
    }
    
    public boolean deleteLeave(String employeeid) {
      
            repo.deleteByEmployeeid(employeeid);
            return true;
       
    }
}