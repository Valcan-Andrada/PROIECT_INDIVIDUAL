import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {User} from "../user";
import {UserLoginService} from "../services/user-login";
import {FormControl, FormGroup} from "@angular/forms";
import { Observable } from 'rxjs';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User=new User("","","",1,"",2,"","");
  message:any;
  loginForm = new FormGroup({
  email:new FormControl(''),
  password: new FormControl('')
  });
  data: User={};

  constructor(private service: UserLoginService,private router:Router) { }

  ngOnInit(): void {

  }

  public registerNow(user:{email:string, password:string}) {

    let resp=this.service.doRegistration(user);
    resp.subscribe((data)=>this.message=data);
     console.log(user);
     console.log(this.message);
      if(this.loginForm.valid){

           this.router.navigate(['/details']);

    }


  }
}
