import { Component, OnInit } from '@angular/core';
import {AuthService} from '../services/auth.service';
import {Observable} from "rxjs/Rx";
import {Router} from '@angular/router';
import {product} from '../product/product';
@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {
  flag:boolean=false;
  orderData:any;
  errorMsg:any;
  displayOrder:Array<Object>;
  productData:{productid:number, productname:string,productprice:number}[] = [];
  router: Router;
  
     constructor(_router: Router, private _auth:AuthService){   
     // this.orderData={"orderid":" ","quantity":22,"orderDetail":[{"productname":"sonu","productprice":123},{"productname":"ss","productprice":222}]};
         this.router = _router;
     }

  ngOnInit() {

    this._auth.getProducts().subscribe(
      data => {
        let other:any;
        other=data;
   this.productData=other;
      
     
      },
      error => {
//console.error("Authentication error!");
    this.errorMsg="error while fetching";
        //return Observable.throw(error);
      }
   )}

saveOrder(data){
  let products:Array<Object>=[];
  Object.keys(data).forEach(key => {
    let value = data[key];
  //  console.log(`key is ${key} and value is ${value}`);
    let keySplit=key.split("-");

    products.push({"productname":keySplit[0],"productprice":Number(keySplit[1]),"quantity":value});
  });
this.flag=true;
this.orderData={"orderId":"","orderDetail":products};
//this.orderData={"orderid":" ","quantity":22,"orderDetail":[{"productname":"sonu","productprice":123},{"productname":"ss","productprice":222}]};
console.log(this.orderData.orderDetail);
this.displayOrder=this.orderData.orderDetail;

}
submitOrder(){
  this._auth.addOrder(this.orderData).subscribe(
    data => {
     console.log(data);
    this.flag=false;
    this.errorMsg="ordered Successfully";
    },
    error => {
//console.error("Authentication error!");
  this.errorMsg="error while fetching";
      //return Observable.throw(error);
    }
 )
}

}
