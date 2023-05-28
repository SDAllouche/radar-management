import {Component, OnInit} from '@angular/core';
import {AuthenticationService} from "../services/authentication.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit{

  constructor(public authService:AuthenticationService, private router:Router) {

  }

  logout() {
    this.authService.logout().subscribe({
      next : (data)=>{
        this.router.navigateByUrl("/login")
      }
    });
  }

  ngOnInit(): void {
  }
}
