import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {FormBuilder, FormGroup} from "@angular/forms";
import {Cars} from "../../model/car-model";
import {CarsService} from "../../services/cars.service";
import {AuthenticationService} from "../../services/authentication.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css'],
})
export class CarsComponent implements OnInit{

  cars! : Cars[];
  errorMessage! : String;
  searchCarFormGroup! : FormGroup;
  constructor(private carService :CarsService, private fb :FormBuilder,public authService : AuthenticationService,
              private router : Router) {
  }

  ngOnInit() {
    this.searchCarFormGroup=this.fb.group({
      keyword : this.fb.control(null)
    })
    this.getAllCars();
  }

  public getAllCars(){
    this.carService.getAllCars().subscribe({
      next: data=>{
        this.cars = data;
      },
      error : errorMessage => console.error(errorMessage)
    })
  }

  searchCar() {
    let keyword=this.searchCarFormGroup.value.keyword;
    this.carService.searchCar(keyword).subscribe({
      next :data=>{
        this.cars=data
      }
    })
  }

  deleteCar(car:Cars) {
    let conf =confirm("Do you want to delete this car?");
    if(conf==false) return;
    this.carService.deleteCar(car.id).subscribe(()=>this.getAllCars());
  }

  addCar() {
    this.router.navigateByUrl("/admin/addCar")
  }

  getOwner(id: number) {
    this.router.navigateByUrl("/admin/ownerDetail/"+id);
  }

  updateCar(id: number) {
    this.router.navigateByUrl("/admin/updateCar/"+id)
  }
}
