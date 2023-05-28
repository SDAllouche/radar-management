import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {CarRequest, Cars} from "../model/car-model";
import {Observable, of, throwError} from "rxjs";
import {RadarRequest} from "../model/radar-modul";
import {Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class CarsService {

  private cars! : Cars[];
  private errorMessage! : String;

  constructor(private route: Router,private http : HttpClient) {
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

  getCar(id: number) {
    let radar = this.cars.find(p=>p.id==id)
    if(radar )return of(radar);
    else return throwError(()=>new Error("Car not found"));
  }

  updateCar(car:CarRequest, id: number) {
    this.http.put<CarRequest>("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars/"+id,car)
    this.route.navigateByUrl("/admin/radars")
    return of(car);
  }

  saveProduct(car: CarRequest):Observable<CarRequest> {
    this.http.post<CarRequest>("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars",car);
    this.route.navigateByUrl("/admin/cars")
    return of(car);
  }
}
