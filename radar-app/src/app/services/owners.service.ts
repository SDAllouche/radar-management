import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Owners} from "../model/owner-model";
import {Observable, of} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class OwnersService {

  owners! : Owners[];

  constructor(private http : HttpClient,) {
    this.getAllOwners().subscribe({
      next: data=>{
        this.owners = data;
      }
    });
  }

  getAllOwners() : Observable<Owners[]> {
    return this.http.get<Owners[]>("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars/owners")
  }

  searchCar(keyword: string) : Observable<Owners[]> {
    let ownerList =this.owners.filter(p=>p.name.includes(keyword));
    return of(ownerList);
  }

}
