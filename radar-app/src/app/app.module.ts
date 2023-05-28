import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarsComponent } from './Page/cars/cars.component';
import { RadarsComponent } from './Page/radars/radars.component';
import { ViolationsComponent } from './Page/violations/violations.component';
import {HttpClientModule} from "@angular/common/http";
import { OwnersComponent } from './Page/owners/owners.component';
import { OwnersDetailsComponent } from './Page/owners-details/owners-details.component';
import { CarsDetailsComponent } from './Page/cars-details/cars-details.component';
import { ViolationsDetailsComponent } from './Page/violations-details/violations-details.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { LoginComponent } from './Page/login/login.component';
import { AdminComponent } from './Page/admin/admin.component';
import { NewCarComponent } from './forms/new-car/new-car.component';
import { NewRadarComponent } from './forms/new-radar/new-radar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { EditRadarComponent } from './edit/edit-radar/edit-radar.component';
import { EditCarComponent } from './edit/edit-car/edit-car.component';
import { EditOwnerComponent } from './edit/edit-owner/edit-owner.component';
import { NewOwnerComponent } from './forms/new-owner/new-owner.component';
import { NewViolationComponent } from './forms/new-violation/new-violation.component';
import { EditViolationComponent } from './edit/edit-violation/edit-violation.component';
import { MainComponent } from './main/main.component';

@NgModule({
  declarations: [
    AppComponent,
    CarsComponent,
    RadarsComponent,
    ViolationsComponent,
    OwnersComponent,
    OwnersDetailsComponent,
    CarsDetailsComponent,
    ViolationsDetailsComponent,
    LoginComponent,
    AdminComponent,
    NewCarComponent,
    NewRadarComponent,
    EditRadarComponent,
    EditCarComponent,
    EditOwnerComponent,
    NewOwnerComponent,
    NewViolationComponent,
    EditViolationComponent,
    MainComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
