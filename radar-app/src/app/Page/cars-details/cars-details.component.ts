import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Owner} from "../../model/owner-model";

@Component({
  selector: 'app-cars-details',
  templateUrl: './cars-details.component.html',
  styleUrls: ['./cars-details.component.css']
})
export class CarsDetailsComponent implements OnInit{
  owner: any;
  ownerId: any;

  constructor(private activeRoute : ActivatedRoute,private http:HttpClient) {
  }
  ngOnInit(): void {
    this.ownerId=this.activeRoute.snapshot.params['id'];
    this.getOwner().subscribe({
      next :data=>{
        this.owner=data
      }
    })
  }

  getOwner(): Observable<Owner> {
    return  this.http.get<Owner>("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars/owners/"+this.ownerId);
  }

}
