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
import {ReactiveFormsModule} from "@angular/forms";
import { LoginComponent } from './Page/login/login.component';
import { AdminComponent } from './Page/admin/admin.component';

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
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
