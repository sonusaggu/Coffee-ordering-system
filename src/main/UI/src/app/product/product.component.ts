import { Component, OnInit } from '@angular/core';
import {AuthService} from '../services/auth.service';
import {Observable} from "rxjs/Rx";
import {Router} from '@angular/router';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  errorMsg:any;
  productData:any;
  router: Router;
  
     constructor(_router: Router, private _auth:AuthService){   
   
         this.router = _router;
     }

  ngOnInit() {
  }
  addProduct(data:any){
    this._auth.addProduct(data).subscribe(
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
   )}}
