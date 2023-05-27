import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CarsComponent} from "./Page/cars/cars.component";
import {RadarsComponent} from "./Page/radars/radars.component";
import {ViolationsComponent} from "./Page/violations/violations.component";
import {OwnersComponent} from "./Page/owners/owners.component";

const routes: Routes = [
  {
    path : "cars" , component : CarsComponent
  },
  {
    path : "owners" , component : OwnersComponent
  },
  {
    path : "radars" , component : RadarsComponent
  },
  {
    path : "violations" , component : ViolationsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
