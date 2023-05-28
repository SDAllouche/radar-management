import { Injectable } from '@angular/core';
import {Owners} from "../model/owner-model";
import {HttpClient} from "@angular/common/http";
import {Observable, of, throwError} from "rxjs";
import {Violation, ViolationRequest} from "../model/violation-modul";
import {Radar, RadarRequest} from "../model/radar-modul";
import {Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class ViolationService {

  violations!:Violation[];

  constructor(private http : HttpClient,private route: Router) {
    this.getAllViolation().subscribe({
      next: data=>{
        this.violations = data;
      }
    });
  }

  getAllViolation() :  Observable<Violation[]>{
    return this.http.get<Violation[]>("http://localhost:8888/VIOLATION-SERVICE/rest-api/violations")
  }

  searchRadar(keyword: any):Observable<Violation[]> {
    let violationList =this.violations.filter(p=>`${p.maxSpeed}`.includes(keyword));
    return of(violationList);

  }

  deleteViolation(id: number) {
    return this.http.delete<void>("http://localhost:8888/VIOLATION-SERVICE/rest-api/violations/"+id);

  }

  updateViolation(violation:ViolationRequest, id : number) : Observable<ViolationRequest>{
    this.http.put<RadarRequest>("http://localhost:8888/VIOLATION-SERVICE/rest-api/violations/"+id,violation)
    this.route.navigateByUrl("/admin/violations")
    return of(violation);
  }

  saveViolation(violation:ViolationRequest) : Observable<ViolationRequest>{
    this.http.post<ViolationRequest>("http://localhost:8888/VIOLATION-SERVICE/rest-api/violations",violation);
    this.route.navigateByUrl("/admin/violations")
    return of(violation);
  }

  public getViolation(id:number) : Observable<Violation>{
    let violation = this.violations.find(p=>p.id==id)
    if(violation )return of(violation);
    else return throwError(()=>new Error("Violation not found"));
  }
}
