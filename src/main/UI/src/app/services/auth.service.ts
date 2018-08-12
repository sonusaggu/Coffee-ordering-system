import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import {Observable} from "rxjs/Rx";
import {product} from '../product/product';
@Injectable()
export class AuthService {
  url:'http://localhost:8082/register';


  constructor(private _http:Http) { }
 


    register(food) {
      let headers = new Headers({ 'Content-Type': 'application/json' ,'Access-Control-Allow-Origin':'http://localhost:8080'});
      let options = new RequestOptions({ headers: headers });
      let body = JSON.stringify(food);
      return this._http.post('/register', body, options ).map((res: Response) => res.toString());
    }

      login(food) {
      let headers = new Headers({ 'Content-Type': 'application/json' });
      let options = new RequestOptions({ headers: headers });
      let body = JSON.stringify(food);
      return this._http.post('/login', body, options ).map((res: Response) => res.toString());
    }
    getProducts() :Observable<product>{
      
      return this._http.get('/getproduct'  ).map((res: Response) => res.json());
    }

    addProduct(food) {
      let headers = new Headers({ 'Content-Type': 'application/json' });
      let options = new RequestOptions({ headers: headers });
      let body = JSON.stringify(food);
      return this._http.post('/product', body, options ).map((res: Response) => res.toString());
    }
addOrder(food) {
      let headers = new Headers({ 'Content-Type': 'application/json' });
      let options = new RequestOptions({ headers: headers });
      let body = JSON.stringify(food);
      return this._http.post('/order', body, options ).map((res: Response) => res.toString());
    }
    getOrders() :Observable<Array<Object>>{
      
      return this._http.get('/getorders'  ).map((res: Response) => res.json());
    }
}
