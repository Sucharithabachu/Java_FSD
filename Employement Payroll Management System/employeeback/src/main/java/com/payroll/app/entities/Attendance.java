package com.payroll.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String employeeid;
    private String name;
    private String starttime;
    private String endtime;
    private String date;
    private String status;
    
    
    public Attendance(long id, String employeeid, String name, String starttime, String endtime, String date,
            String status) {
        super();
        this.id = id;
        this.employeeid = employeeid;
        this.name = name;
        this.starttime = starttime;
        this.endtime = endtime;
        this.date = date;
        this.status = status;
    }


    public Attendance() {
        super();
        // TODO Auto-generated constructor stub
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getEmployeeid() {
        return employeeid;
    }


    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getStarttime() {
        return starttime;
    }


    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }


    public String getEndtime() {
        return endtime;
    }


    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Attendance [id=" + id + ", employeeid=" + employeeid + ", name=" + name + ", starttime=" + starttime
                + ", endtime=" + endtime + ", date=" + date + ", status=" + status + "]";
    }
    
    
    
    
    
   
   
   
    
    
    
}