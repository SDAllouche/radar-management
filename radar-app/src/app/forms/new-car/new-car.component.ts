import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CarsService} from "../../services/cars.service";

@Component({
  selector: 'app-new-car',
  templateUrl: './new-car.component.html',
  styleUrls: ['./new-car.component.css']
})
export class NewCarComponent implements OnInit{

  newCarFormGroup! : FormGroup;

  constructor(private fb : FormBuilder, private carService:CarsService) {
  }
  ngOnInit(): void {
    this.newCarFormGroup=this.fb.group({
      registrationNumber : this.fb.control(0,[Validators.required]),
      brand : this.fb.control(null, [Validators.required]),
      power : this.fb.control(0,[Validators.required]),
      model : this.fb.control(0,[Validators.required]),
      name : this.fb.control(null,[Validators.required]),
      date : this.fb.control(null,[Validators.required]),
      mail : this.fb.control(null,[Validators.required]),
    });
  }

  getErrorMessage(field:string, errors:any):string{
    if(errors['required']){
      return field +" is Required";
    } else if(errors['minlength']){
      return field+" should have at least "+errors['minlength']['requiredLength']+" Characters";
    } else return "";
  }

  saveCar() {
    let car=this.newCarFormGroup.value;
    this.carService.saveProduct(car).subscribe({
      next :(data)=>{
        alert("Car saved successfully");
        this.newCarFormGroup.reset();
      }
    });
  }
}
