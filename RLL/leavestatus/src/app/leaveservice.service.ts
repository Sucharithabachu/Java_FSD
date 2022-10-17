import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Leaves } from './leave';
@Injectable({
  providedIn: 'root'
})
export class LeaveserviceService {
  getLeaveURL : string;
  
  

  constructor(private http : HttpClient) { 

    this. getLeaveURL = "http://localhost:3000/leavestatus";
   

  }

  public getAllLeave(): Observable<Leaves[]> {
    return this.http.post<Leaves[]>(this.getLeaveURL,Leaves);
  }


  //Employee applies for leave
  applyLeave(leaves:Leaves) : Observable<any> {
    return this.http.post(`${this.getLeaveURL}`,Leaves);
   }

   //Employee views all his leave details
   getLeaveById(employeeid:String) : Observable<any> {
    return this.http.get(`${this.getLeaveURL}/${employeeid}`);
   }

   //Admin views all leave details
   getLeave() :Observable<any> {
    return this.http.get(`${this.getLeaveURL}`);
   }

   pendingLeave():Observable<any> {
    return this.http.get(`${this.getLeaveURL}/pending`);
   }
   
   remainingLeave():Observable<any> {
    return this.http.get(`${this.getLeaveURL}/remaining`);
   }

   //Admin leave status
   updateLeave(employeeid:string,leaves:Leaves):Observable<any> {
    return this.http.put(`${this.getLeaveURL}/${employeeid}`,Leaves);
   }

   //Delete Leave
   deleteLeave(employeeid:string):Observable<any> {
    return this.http.delete(`${this.getLeaveURL}/${employeeid}`);
   }
}
