import { Component, OnInit } from '@angular/core';
import {UserLoginService} from "../services/user-login";

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  users:any;
  email:string = "";

  constructor(private service:UserLoginService) { }

  ngOnInit(): void {

  }

  public findUserByEmail(){
    let resp = this.service.getStudentInfo(this.email);
    resp.subscribe((data)=>this.users=data);
  }

}
