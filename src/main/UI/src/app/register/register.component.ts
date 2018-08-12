import { Component, OnInit } from '@angular/core';
import {AuthService} from '../services/auth.service';
import {Observable} from "rxjs/Rx";
import {Router} from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  router: Router;
  
     constructor(_router: Router, private _auth:AuthService){   
   
         this.router = _router;
     }

  ngOnInit() {
  }
  register(data:any){
    this._auth.register(data).subscribe(
    data => {
      // refresh the list
      this.router.navigateByUrl('/login');
      return true;
    },
    error => {
      console.error("Error saving food!");
      return Observable.throw(error);
    }
 );
}
}
