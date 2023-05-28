import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Owner} from "../../model/owner-model";
import {Radar} from "../../model/radar-modul";
import {Car, Cars} from "../../model/car-model";
import {Violation} from "../../model/violation-modul";

@Component({
  selector: 'app-violations-details',
  templateUrl: './violations-details.component.html',
  styleUrls: ['./violations-details.component.css']
})
export class ViolationsDetailsComponent implements OnInit{

  car!: Cars;
  carRegistration!: any;
  radar! : Radar;
  radarId! : number;
  violation! : Violation;
  violationId! : number;


  constructor(private activeRoute : ActivatedRoute,private http:HttpClient) {

  }
  ngOnInit(): void {
    this.violationId=this.activeRoute.snapshot.params['id'];
    this.getViolation().subscribe({
      next :data=>{
        this.violation=data
        this.getCar().subscribe({
          next :data=>{
            this.car=data
          }
        });
        this.getRadar().subscribe({
          next :data=>{
            this.radar=data
          }
        })
      }
    })
  }

  getViolation(): Observable<Violation> {
    return this.http.get<Violation>("http://localhost:8888/VIOLATION-SERVICE/rest-api/violations/"+this.violationId);
  }

  getCar(): Observable<Cars> {
    return  this.http.get<Cars>("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars/registration/"+this.violation.registrationNumber);
  }

  getRadar(): Observable<Radar> {
    return  this.http.get<Radar>("http://localhost:8888/RADAR-SERVICE/rest-api/radars/"+this.violation.radarID);
  }

}
