import { Injectable } from '@angular/core';
import {Radar, RadarRequest} from "../model/radar-modul";
import {Observable, of, throwError} from "rxjs";
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {Cars} from "../model/car-model";

@Injectable({
  providedIn: 'root'
})
export class RadarsService {

  radars! : Radar[];

  constructor(private route: Router,private http : HttpClient) {
    this.getAllRadaras().subscribe({
      next: data=>{
        this.radars = data;
      }
    });
  }

  saveProduct(radar: RadarRequest) : Observable<RadarRequest>{
    this.http.post<RadarRequest>("http://localhost:8888/RADAR-SERVICE/rest-api/radars",radar);
    this.route.navigateByUrl("/admin/radars")
    return of(radar);
  }

  public getRadar(id:number) : Observable<Radar>{
    let radar = this.radars.find(p=>p.id==id)
    if(radar )return of(radar);
    else return throwError(()=>new Error("Radar not found"));
  }

  updateRadar(radar:RadarRequest, id : number) : Observable<RadarRequest>{
    this.http.put<RadarRequest>("http://localhost:8888/RADAR-SERVICE/rest-api/radars/"+id,radar)
    this.route.navigateByUrl("/admin/radars")
    return of(radar);
  }

  private getAllRadaras() {
    return this.http.get<Radar[]>("http://localhost:8888/RADAR-SERVICE/rest-api/radars")
  }
}
