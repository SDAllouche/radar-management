import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-owners',
  templateUrl: './owners.component.html',
  styleUrls: ['./owners.component.css']
})
export class OwnersComponent implements OnInit{

  owners:any;

  constructor(private http:HttpClient) {
  }

  ngOnInit() {
    this.http.get("http://localhost:8888/REGISTRATION-SERVICE/rest-api/owners").subscribe({
      next : (data) =>{
        this.owners=data;
      },
      error : (err) => {}
    })
  }

}
