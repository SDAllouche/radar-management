import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {RadarsService} from "../../services/radars.service";
import {ViolationService} from "../../services/violation.service";

@Component({
  selector: 'app-new-violation',
  templateUrl: './new-violation.component.html',
  styleUrls: ['./new-violation.component.css']
})
export class NewViolationComponent implements OnInit{
  newViolationFormGroup!: FormGroup;

  constructor(private fb :FormBuilder, private violationService: ViolationService) {
  }

  getErrorMessage(field: string, error:any) {
    if(error['required']){
      return field +" is Required";
    } else if(error['minlength']){
      return field+" should have at least "+error['minlength']['requiredLength']+" Characters";
    } else return "";
  }

  saveViolation() {
    let violation=this.newViolationFormGroup.value;
    this.violationService.saveViolation(violation).subscribe({
      next :(data)=>{
        alert("Violation saved successfully");
        this.newViolationFormGroup.reset();
      }
    });
  }

  ngOnInit(): void {
    this.newViolationFormGroup=this.fb.group({
      maxSpeed : this.fb.control(0,[Validators.required]),
      radarID : this.fb.control(0, [Validators.required]),
      carSpeed : this.fb.control(0, [Validators.required]),
      penalty : this.fb.control(0, [Validators.required]),
      date : this.fb.control(null, [Validators.required]),
      registrationNumber : this.fb.control(0,[Validators.required])
    });
  }
}
