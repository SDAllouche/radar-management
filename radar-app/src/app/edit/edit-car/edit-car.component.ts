import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute} from "@angular/router";
import {RadarsService} from "../../services/radars.service";
import {CarsService} from "../../services/cars.service";

@Component({
  selector: 'app-edit-car',
  templateUrl: './edit-car.component.html',
  styleUrls: ['./edit-car.component.css']
})
export class EditCarComponent implements OnInit{
  updateCarFormGroup!: FormGroup;
  CarId!: number;
  errorMessage!: string;

  constructor(private activeRoute : ActivatedRoute,private carService : CarsService, private fb : FormBuilder) {
  }
  ngOnInit(): void {
    this.CarId=this.activeRoute.snapshot.params['id'];
    if(this.CarId){
      this.carService.getCar(this.CarId).subscribe({
        next:(data)=> {
          this.updateCarFormGroup=this.fb.group({
            id : this.fb.control(data.id,[Validators.required]),
            registrationNumber : this.fb.control(data.registartionNumber,[Validators.required]),
            brand : this.fb.control(data.brand, [Validators.required]),
            power : this.fb.control(data.power,[Validators.required]),
            model : this.fb.control(data.model,[Validators.required]),
            name : this.fb.control(data.ownerResponseDTO.name,[Validators.required]),
            date : this.fb.control(data.ownerResponseDTO.date,[Validators.required]),
            mail : this.fb.control(data.ownerResponseDTO.mail,[Validators.required]),
          });
        },
        error : (err) => {
          console.log(err)
        }
      })
    }

  }

  updateCar() {
    this.carService.updateCar(this.updateCarFormGroup.value,this.CarId).subscribe({
      next : (data)=>{
        alert("Car has been successfully updated");
      }, error : err => {
        this.errorMessage=err;
      }
    });
  }
}
