package com.payroll.app.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.app.entities.Salary;
import com.payroll.app.entities.User;
import com.payroll.app.repo.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;
    
    public User addUser(User user)
    {
        user.setEmployeeid(UUID.randomUUID().toString().substring(0, 6));
        user.setSchedule("Not yet Assigned");
        return userRepo.save(user);
    }
    
    public List<User> getAllUser()
    {
        return userRepo.findAll();
    }
    
    public User updateUser(Long id,User user)
    {
        if(userRepo.findById(id).isPresent()) {
            User oldone=userRepo.findById(id).get();
            oldone.setName(user.getName());
            oldone.setMobile(user.getMobile());
            oldone.setEmail(user.getEmail());
            oldone.setGender(user.getGender());
            oldone.setDob(user.getDob());
            oldone.setDoj(user.getDoj());
            oldone.setPassword(user.getPassword());
            oldone.setDesignation(user.getDesignation());
            oldone.setSchedule(user.getSchedule());
            oldone.setRole(user.getRole());
            return userRepo.save(oldone);
        }else {
            return null;
        }
        
    }
    
    public void deleteUser(Long id)
    {
        userRepo.deleteById(id);
    }
    
    public User getUserById(Long id)
    {
        return userRepo.findById(id).get();
    }
    
    
    

}
