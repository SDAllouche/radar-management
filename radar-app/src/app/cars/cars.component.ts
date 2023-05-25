import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit{

  cars : any;
  constructor(private http:HttpClient) {
  }

  ngOnInit() {
    this.http.get("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars").subscribe({
      next : (data) =>{
        this.cars=data;
      },
      error : (err) => {}
    })
  }

}
