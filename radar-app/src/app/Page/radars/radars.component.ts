import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {RadarsService} from "../../services/radars.service";
import {Router} from "@angular/router";
import {AuthenticationService} from "../../services/authentication.service";

@Component({
  selector: 'app-radars',
  templateUrl: './radars.component.html',
  styleUrls: ['./radars.component.css']
})
export class RadarsComponent implements OnInit{

  radars:any;

  constructor(private http:HttpClient,private radarService : RadarsService,private router : Router,
              public authService : AuthenticationService) {
  }

  ngOnInit() {
    this.http.get("http://localhost:8888/RADAR-SERVICE/rest-api/radars").subscribe({
      next : (data) =>{
        this.radars=data;
      },
      error : (err) => {}
    })
  }


  addRadar() {
    this.router.navigateByUrl("/admin/addRadar")
  }
}
