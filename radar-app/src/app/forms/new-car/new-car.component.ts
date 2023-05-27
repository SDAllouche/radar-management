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
    /*this.newCarFormGroup=this.fb.group({
      name : this.fb.control(null,[Validators.required, Validators.minLength(5)]),
      price : this.fb.control(0, [Validators.required]),
      promoted : this.fb.control(false)
    });*/
  }
  handleSaveProduct() {
    /*let product=this.newCarFormGroup.value;
    this.carService.saveProduct(product).subscribe({
      next :(data)=>{
        alert("Product saved successfully");
        this.newCarFormGroup.reset();
      }
    });*/
  }
  getErrorMessage(field:string, error:any):string{
    if(error['required']){
      return field +" is Required";
    } else if(error['minlength']){
      return field+" should have at least "+error['minlength']['requiredLength']+" Characters";
    } else return "";
  }

}
