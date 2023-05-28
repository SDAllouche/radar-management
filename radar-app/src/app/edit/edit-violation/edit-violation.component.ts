import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute} from "@angular/router";
import {RadarsService} from "../../services/radars.service";
import {ViolationService} from "../../services/violation.service";

@Component({
  selector: 'app-edit-violation',
  templateUrl: './edit-violation.component.html',
  styleUrls: ['./edit-violation.component.css']
})
export class EditViolationComponent implements OnInit{
  updateViolationFormGroup!: FormGroup;
  violationId!: number;
  private errorMessage!: string;

  constructor(private activeRoute : ActivatedRoute,private violationService : ViolationService, private fb : FormBuilder) {
  }


  ngOnInit(): void {
    this.violationId=this.activeRoute.snapshot.params['id'];
    if(this.violationId){
      this.violationService.getViolation(this.violationId).subscribe({
        next:(data)=> {
          this.updateViolationFormGroup=this.fb.group({
            id : this.fb.control(data.id,[Validators.required]),
            maxSpeed : this.fb.control(data.maxSpeed,[Validators.required]),
            radarID : this.fb.control(data.radarID, [Validators.required]),
            carSpeed : this.fb.control(data.carSpeed, [Validators.required]),
            penalty : this.fb.control(data.penalty, [Validators.required]),
            date : this.fb.control(data.date, [Validators.required]),
            registrationNumber : this.fb.control(data.registrationNumber,[Validators.required])
          });
        },
        error : (err) => {
          console.log(err)
        }
      })
    }
  }

  updateViolation() {
    this.violationService.updateViolation(this.updateViolationFormGroup.value,this.violationId).subscribe({
      next : (data)=>{
        alert("Violation has been successfully updated");
      }, error : err => {
        this.errorMessage=err;
      }
    });
  }
}
