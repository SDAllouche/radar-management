import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CarsComponent} from "./Page/cars/cars.component";
import {RadarsComponent} from "./Page/radars/radars.component";
import {ViolationsComponent} from "./Page/violations/violations.component";
import {OwnersComponent} from "./Page/owners/owners.component";
import {LoginComponent} from "./Page/login/login.component";
import {AdminComponent} from "./Page/admin/admin.component";
import {AuthorizationGuard} from "./guards/authentication.guard";
import {NewCarComponent} from "./forms/new-car/new-car.component";
import {NewRadarComponent} from "./forms/new-radar/new-radar.component";
import {EditRadarComponent} from "./edit/edit-radar/edit-radar.component";
import {OwnersDetailsComponent} from "./Page/owners-details/owners-details.component";
import {CarsDetailsComponent} from "./Page/cars-details/cars-details.component";
import {ViolationsDetailsComponent} from "./Page/violations-details/violations-details.component";
import {EditCarComponent} from "./edit/edit-car/edit-car.component";
import {NewOwnerComponent} from "./forms/new-owner/new-owner.component";
import {EditOwnerComponent} from "./edit/edit-owner/edit-owner.component";
import {EditViolationComponent} from "./edit/edit-violation/edit-violation.component";
import {NewViolationComponent} from "./forms/new-violation/new-violation.component";
import {MainComponent} from "./main/main.component";

const routes: Routes = [
  {
    path : "login" , component : LoginComponent
  },
  {path : "" , component : MainComponent,canActivate:[AuthorizationGuard]},
  {
    path : "admin" , component : AdminComponent,canActivate:[
      AuthorizationGuard
    ],
    children : [
      {path : "cars" , component : CarsComponent},
      {path : "owners" , component : OwnersComponent},
      {path : "radars" , component : RadarsComponent},
      {path : "violations" , component : ViolationsComponent},
      {path : "addCar" , component : NewCarComponent},
      {path : "addRadar" , component : NewRadarComponent},
      {path : "updateRadar/:id" , component : EditRadarComponent},
      {path : "addOwner" , component : NewOwnerComponent},
      {path : "editOwner/:id" , component : EditOwnerComponent},
      {path : "updateCar/:id" , component : EditCarComponent},
      {path : "ownerDetail/:id" , component : OwnersDetailsComponent},
      {path : "editViolation/:id" , component : EditViolationComponent},
      {path : "addViolation" , component : NewViolationComponent},
      {path : "carDetail/:id" , component : CarsDetailsComponent},
      {path : "violationDetail/:id" , component : ViolationsDetailsComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
