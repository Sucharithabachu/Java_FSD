import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/model/user';
import { AuthService } from 'src/app/service/auth.service';
import { FormBuilder,FormGroup } from '@angular/forms';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  public signupForm!:FormGroup;
  name : string = '';
  username : string = '';
  password : string = '';

  user : User = new User();

  constructor( private formBuilder:FormBuilder, private authService : AuthService, private route : Router) { }

  ngOnInit(): void {
    this.signupForm=this.formBuilder.group({
      
    })
    this.username = '';
    this.password = '';
    this.name = '';
  }

  signup() {

    this.user.username = this.username;
    this.user.password = this.password;
    this.user.name = this.name;
    this.user.role = 'user';

    this.authService.signUp(this.user).subscribe(res => {
      if(res == null) {
        alert("Registration failed");
        this.ngOnInit();
      }else {
        console.log("Registration successful");
        alert("Registration successful");
        this.route.navigate(['/']);
      }
    }, err => {
      alert("Registration failed.");
      this.ngOnInit();
    })

  }

}
