import { Component, OnInit } from '@angular/core';
import {AuthService} from '../services/auth.service';
import {Observable} from "rxjs/Rx";
import {Router} from '@angular/router';
import {product} from '../product/product';

@Component({
  selector: 'app-vieworders',
  templateUrl: './vieworders.component.html',
  styleUrls: ['./vieworders.component.css']
})
export class ViewordersComponent implements OnInit {
  errorMsg:String;
 orderData:Array<Object>;
  router: Router;
  
     constructor(_router: Router, private _auth:AuthService){   
    //  this.orderData={"orderid":" ","quantity":22,"orderDetail":[{"productname":"sonu","productprice":123},{"productname":"ss","productprice":222}]};
         this.router = _router;
     }

  ngOnInit() {

    this._auth.getOrders().subscribe(
      data => {
        let other:any;
        other=data;
   this.orderData=other;
      
     
      },
      error => {
//console.error("Authentication error!");
    this.errorMsg="error while fetching";
        //return Observable.throw(error);
      }
   )}
  }