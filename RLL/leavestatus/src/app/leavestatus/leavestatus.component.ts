import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormControl } from '@angular/forms'
import { Router } from '@angular/router';
import { Leaves } from '../leave';
import { LeaveserviceService } from '../leaveservice.service';
@Component({
  selector: 'app-leavestatus',
  templateUrl: './leavestatus.component.html',
  styleUrls: ['./leavestatus.component.css']
})
export class LeavestatusComponent implements OnInit {

  leaveDetail !: FormGroup;
  leaveObj : Leaves =new Leaves();
  public leaveList!: Leaves[];
  leavedata!: String;
  constructor(private formBuilder : FormBuilder, private leaveService : LeaveserviceService, private Router : Router) { }



  ngOnInit(): void {
    let data=localStorage.getItem('employeeid');
  if(data!=null){
    this.leavedata=data.replace(/['"]+/g, '');
    console.log(this.leavedata);
  }
  this.leaveService.getLeaveById(this.leavedata) .subscribe(data =>{
    this.leaveList=data;
  });
    this.leaveDetail = this.formBuilder.group({ 
      id : [''],
      employeeid : [''],
      name : [''],
      startdate: [''],
      enddate: [''],
      reason: [''],
      status : [''],
    });  

  }
  
}