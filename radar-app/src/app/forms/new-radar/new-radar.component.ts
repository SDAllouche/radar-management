import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {RadarsService} from "../../services/radars.service";

@Component({
  selector: 'app-new-radar',
  templateUrl: './new-radar.component.html',
  styleUrls: ['./new-radar.component.css']
})
export class NewRadarComponent implements OnInit{
  newRadarFormGroup!: FormGroup;

  constructor(private fb :FormBuilder, private radarService: RadarsService) {
  }

  saveRadar() {
    let radar=this.newRadarFormGroup.value;
    this.radarService.saveProduct(radar).subscribe({
      next :(data)=>{
        alert("Product saved successfully");
        this.newRadarFormGroup.reset();
      }
    });
  }

  getErrorMessage(field: string,error :any) {
    if(error['required']){
      return field +" is Required";
    } else if(error['minlength']){
      return field+" should have at least "+error['minlength']['requiredLength']+" Characters";
    } else return "";
  }

  ngOnInit(): void {
    this.newRadarFormGroup=this.fb.group({
      maxSpeed : this.fb.control(0,[Validators.required]),
      longitude : this.fb.control(0, [Validators.required]),
      latitude : this.fb.control(0,[Validators.required])
    });
  }
}
