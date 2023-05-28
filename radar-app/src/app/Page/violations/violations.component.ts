import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {RadarsService} from "../../services/radars.service";
import {Router} from "@angular/router";
import {AuthenticationService} from "../../services/authentication.service";
import {FormBuilder, FormGroup} from "@angular/forms";
import {ViolationService} from "../../services/violation.service";
import {Radar} from "../../model/radar-modul";
import {Violation} from "../../model/violation-modul";

@Component({
  selector: 'app-violations',
  templateUrl: './violations.component.html',
  styleUrls: ['./violations.component.css']
})
export class ViolationsComponent implements OnInit{

  violations!:Violation[];
  errorMessage! : String;
  searchViolationFormGroup! : FormGroup;

  constructor(private http:HttpClient,private violationService : ViolationService,private route : Router,
              public authService : AuthenticationService,private fb :FormBuilder) {
  }

  ngOnInit() {
    this.searchViolationFormGroup=this.fb.group({
      keyword : this.fb.control(null)
    })
    this.getAllViolations();
  }

  public getAllViolations(){
    this.violationService.getAllViolation().subscribe({
      next: data=>{
        this.violations = data;
      },
      error : errorMessage => console.error(errorMessage)
    });
  }

  searchViolation() {
    let keyword=this.searchViolationFormGroup.value.keyword;
    this.violationService.searchRadar(keyword).subscribe({
      next :data=>{
        this.radars=data
      }
    })
  }

  addViolation() {
    this.route.navigateByUrl("/admin/addViolation")
  }

  deleteViolation(p: Violation) {
    let conf =confirm("Do you want to delete this violation?");
    if(conf==false) return;
    this.violationService.deleteViolation(p.id).subscribe(()=>this.getAllViolations());
  }

  updateViolation(id: number) {
    this.route.navigateByUrl("/admin/editViolation/"+id)
  }

  getDetail(p: Violation) {

  }
}
