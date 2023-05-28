import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Cars} from "../model/car-model";
import {Observable, of} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CarsService {

  private cars! : Cars[];
  private errorMessage! : String;

  constructor(private http:HttpClient) {
    this.getAllCars().subscribe({
      next: data=>{
        this.cars = data;
      }
    });
  }

  public getAllCars(){
    return  this.http.get<Cars[]>("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars")
  }

  public deleteCar(id:number) : Observable<void>{
    return this.http.delete<void>("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars/"+id);
  }

  public searchCar(keyword:string): Observable<Cars[]>{
    let carList =this.cars.filter(p=>`${p.registartionNumber}`.includes(keyword));
    return of(carList);
  }

}
