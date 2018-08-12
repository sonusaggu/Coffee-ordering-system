import { Injectable } from '@angular/core';
import {Todo} from './todo';
@Injectable()
export class TodoDataService {

  constructor() { }

  lastId:number=0;

  todos:Todo[]=[];


  //add method
  addTodo(todo:Todo):TodoDataService{

    if(!todo.id){
      todo.id=++this.lastId;
    }
    this.todos.push(todo);
    return this;
  }
}
