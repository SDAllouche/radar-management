import { Injectable } from '@angular/core';
import {Owners} from "../model/owner-model";
import {HttpClient} from "@angular/common/http";
import {Observable, of} from "rxjs";
import {Violation, ViolationRequest} from "../model/violation-modul";
import {RadarRequest} from "../model/radar-modul";
import {Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class ViolationService {

  constructor(private http : HttpClient,private route: Router) { }

  getAllViolation() :  Observable<Violation[]>{
    return this.http.get<Violation[]>("http://localhost:8888/VIOLATION-SERVICE/rest-api/violations")
  }

  searchRadar(keyword: any) {

  }

  deleteViolation(id: number) {

  }

  updateRadar(violation:ViolationRequest, id : number) : Observable<ViolationRequest>{
    this.http.put<RadarRequest>("http://localhost:8888/VIOLATION-SERVICE/rest-api/violations/"+id,violation)
    this.route.navigateByUrl("/admin/violations")
    return of(violation);
  }
}
