import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarsComponent } from './cars/cars.component';
import { RadarsComponent } from './radars/radars.component';
import { ViolationsComponent } from './violations/violations.component';
import {HttpClientModule} from "@angular/common/http";
import { OwnersComponent } from './owners/owners.component';
import { OwnerComponent } from './owner/owner.component';
import { CarComponent } from './car/car.component';
import { ViolationComponent } from './violation/violation.component';

@NgModule({
  declarations: [
    AppComponent,
    CarsComponent,
    RadarsComponent,
    ViolationsComponent,
    OwnersComponent,
    OwnerComponent,
    CarComponent,
    ViolationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
