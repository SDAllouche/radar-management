import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Owners} from "../../model/owner-model";
import {FormBuilder, FormGroup} from "@angular/forms";
import {AuthenticationService} from "../../services/authentication.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-owners',
  templateUrl: './owners.component.html',
  styleUrls: ['./owners.component.css']
})
export class OwnersComponent implements OnInit{

  owners!:Owners[];
  errorMessage!: String;
  searchOwnerFormGroup!: FormGroup;

  constructor(private fb :FormBuilder,public authService : AuthenticationService,
              private router : Router) {
  }

  ngOnInit() {
    this.http.get("http://localhost:8888/REGISTRATION-SERVICE/rest-api/cars/owners").subscribe({
      next : (data) =>{
        this.owners=data;
      },
      error : (err) => {}
    })
  }
  

  searchOwner() {
    
  }

  addOwner() {
    
  }

  getCars(p: Owners) {
    
  }

  deleteOwner(p: Owners) {
    
  }
}
