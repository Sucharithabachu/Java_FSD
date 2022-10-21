package com.payroll.app.entities;

import javax.persistence.*;

@Entity
public class Leaves {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    private String employeeid;
    private String startdate;
    private String enddate;
    private String reason;
    private String status="pending";
   
    public Leaves(long id, String employeeid, String startdate, String enddate, String reason, String status) {
        super();
        this.id = id;
        this.employeeid = employeeid;
        this.startdate = startdate;
        this.enddate = enddate;
        this.reason = reason;
        this.status = status;
    }

    public Leaves() {
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

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Leaves [id=" + id + ", employeeid=" + employeeid + ", startdate=" + startdate + ", enddate=" + enddate
                + ", reason=" + reason + ", status=" + status + "]";
    }
    
    
    
   
    
    

}