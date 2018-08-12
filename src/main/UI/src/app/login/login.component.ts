import { Component, OnInit } from '@angular/core';
import {AuthService} from '../services/auth.service';
import {Observable} from "rxjs/Rx";
import {Router} from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  errorMsg:any;
  router: Router;
  
     constructor(_router: Router, private _auth:AuthService){   
   
         this.router = _router;
     }


  ngOnInit() {
  }

  login(data:any){
    this._auth.login(data).subscribe(
      data => {
        // refresh the list

        this.router.navigateByUrl('/dashboard');
       // return true;
      },
      error => {
//console.error("Authentication error!");
this.errorMsg="Please enter valid credentials."
        //return Observable.throw(error);
      }
   )}

   register(){
 
  this.router.navigateByUrl('/register');
   }

}
