import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {RadarsService} from "../../services/radars.service";
import {Radar} from "../../model/radar-modul";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-edit-radar',
  templateUrl: './edit-radar.component.html',
  styleUrls: ['./edit-radar.component.css']
})
export class EditRadarComponent implements OnInit{
  updateRadarFormGroup! : FormGroup;
  radarId! : number;
  radar! : Radar;
  errorMessage!: string;

  constructor(private activeRoute : ActivatedRoute,private radarService : RadarsService, private fb : FormBuilder) {
  }
  ngOnInit(): void {
    this.radarId=this.activeRoute.snapshot.params['id'];
    if(this.radarId){
      this.radarService.getRadar(this.radarId).subscribe({
        next:(data)=> {
          this.updateRadarFormGroup=this.fb.group({
            id : this.fb.control(data.id,[Validators.required]),
            maxSpeed : this.fb.control(data.maxSpeed,[Validators.required]),
            longitude : this.fb.control(data.longitude, [Validators.required]),
            latitude : this.fb.control(data.latitude,[Validators.required])
          });
        },
        error : (err) => {
          console.log(err)
        }
      })
    }

  }

  updateRadar() {
    this.radarService.updateRadar(this.updateRadarFormGroup.value,this.radarId).subscribe({
      next : (data)=>{
        alert("Radar has been successfully updated");
      }, error : err => {
        this.errorMessage=err;
      }
    });
  }

}
