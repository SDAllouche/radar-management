import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-violations',
  templateUrl: './violations.component.html',
  styleUrls: ['./violations.component.css']
})
export class ViolationsComponent implements OnInit{

  violations:any;

  constructor(private http:HttpClient) {
  }

  ngOnInit() {
    this.http.get("http://localhost:8888/VIOLATION-SERVICE/violations").subscribe({
      next : (data) =>{
        this.violations=data;
      },
      error : (err) => {}
    })
  }

}
