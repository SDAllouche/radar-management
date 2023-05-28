import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {RadarsService} from "../../services/radars.service";
import {Router} from "@angular/router";
import {AuthenticationService} from "../../services/authentication.service";
import {Radar} from "../../model/radar-modul";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-radars',
  templateUrl: './radars.component.html',
  styleUrls: ['./radars.component.css']
})
export class RadarsComponent implements OnInit{

  radars!:Radar[];
  errorMessage! : String;
  searchRadarFormGroup! : FormGroup;

  constructor(private http:HttpClient,private radarService : RadarsService,private route : Router,
              public authService : AuthenticationService,private fb :FormBuilder) {
  }

  ngOnInit() {
    this.searchRadarFormGroup=this.fb.group({
      keyword : this.fb.control(null)
    })
    this.getAllRadars();
  }

  public getAllRadars(){
    this.radarService.getAllRadars().subscribe({
      next: data=>{
        this.radars = data;
      },
      error : errorMessage => console.error(errorMessage)
    })
  }

  searchRadar() {
    let keyword=this.searchRadarFormGroup.value.keyword;
    this.radarService.searchRadar(keyword).subscribe({
      next :data=>{
        this.radars=data
      }
    })
  }


  addRadar() {
    this.route.navigateByUrl("/admin/addRadar")
  }

  deleteRadar(p: Radar) {
    let conf =confirm("Do you want to delete this radar?");
    if(conf==false) return;
    this.radarService.deleteRadar(p.id).subscribe(()=>this.getAllRadars());
  }

  updateRadar(id : number) {
    this.route.navigateByUrl("/admin/updateRadar/"+id)
  }
}
