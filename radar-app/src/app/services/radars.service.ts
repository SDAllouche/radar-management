import { Injectable } from '@angular/core';
import {Radar, RadarRequest} from "../model/radar-modul";
import {Observable, of} from "rxjs";
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class RadarsService {

  constructor(private route: Router,private http : HttpClient) { }

  saveProduct(radar: RadarRequest) : Observable<RadarRequest>{
    this.http.post<RadarRequest>("http://localhost:8888/RADAR-SERVICE/rest-api/radars",radar);
    this.route.navigateByUrl("/admin/radars")
    return of(radar);
  }
}
