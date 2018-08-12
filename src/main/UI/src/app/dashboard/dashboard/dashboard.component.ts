import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent{

  
  dataArr:{id: number, item: string,price:number , quantity:number}[];
  constructor() { }

 save(orderData){
let demy=orderData;
this.dataArr.push({id:1,item:"Latte",price:100,quantity:demy.latte});
this.dataArr.push({id:1,item:"Cappuccino",price:100,quantity:demy.Cappuccino});
this.dataArr.push({id:1,item:"Black Coffee",price:100,quantity:demy.Coffee});
 }

}
