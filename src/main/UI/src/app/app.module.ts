import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import {AuthService} from './services/auth.service';
import {  } from '@angular/material';
import { DashboardComponent } from './dashboard/dashboard/dashboard.component';
import { ProductComponent } from './product/product.component';
import { OrderComponent } from './order/order.component';
import { ViewordersComponent } from './vieworders/vieworders.component';
@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    DashboardComponent,
    ProductComponent,
    OrderComponent,
    ViewordersComponent
  ],
  imports: [
    RouterModule.forRoot([
      { path: '', component: LoginComponent, pathMatch: 'full' },
      {path:'login',component:LoginComponent },
      {path:'register',component:RegisterComponent},
      {path:'dashboard',component:DashboardComponent,children: [
        { path: 'vieworders', component: ViewordersComponent },
        { path: 'product', component: ProductComponent },
        { path: 'order', component: OrderComponent }
      ]}
    ]),
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
