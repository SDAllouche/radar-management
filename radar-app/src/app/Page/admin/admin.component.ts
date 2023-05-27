import {Component, OnInit} from '@angular/core';
import {AuthenticationService} from "../../services/authentication.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit{

  constructor(public authService:AuthenticationService, private router:Router) {
  }

  ngOnInit(): void {
  }


  logout() {
    this.authService.logout().subscribe({
      next : (data)=>{
        this.router.navigateByUrl("/login")
      }
    });
  }
}
