import {Component, OnInit} from '@angular/core';
import {Owner, Owners} from "../../model/owner-model";
import {ActivatedRoute} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Cars} from "../../model/car-model";

@Component({
  selector: 'app-owners-details',
  templateUrl: './owners-details.component.html',
  styleUrls: ['./owners-details.component.css']
})
export class OwnersDetailsComponent implements OnInit{

  ownerId! : number;

  owner! : Owner;

  constructor(private activeRoute : ActivatedRoute,private http:HttpClient) {
  }
  ngOnInit(): void {
    this.ownerId=this.activeRoute.snapshot.params['id'];
    this.getRadar().subscribe({
      next :data=>{
        this.owner=data
        console.log(this.owner.cars)
      }
    })
  }

  getRadar(): Observable<Owner> {
    return  this.http.get<Owner>("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars/owners/"+this.ownerId);
  }

}
