import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Owners} from "../../model/owner-model";
import {FormBuilder, FormGroup} from "@angular/forms";
import {AuthenticationService} from "../../services/authentication.service";
import {Router} from "@angular/router";
import {OwnersService} from "../../services/owners.service";

@Component({
  selector: 'app-owners',
  templateUrl: './owners.component.html',
  styleUrls: ['./owners.component.css']
})
export class OwnersComponent implements OnInit{

  owners!:Owners[];
  errorMessage!: String;
  searchOwnerFormGroup!: FormGroup;

  constructor(private fb :FormBuilder,public authService : AuthenticationService,private ownerService : OwnersService,
              private router : Router) {
  }

  ngOnInit() {
    this.searchOwnerFormGroup=this.fb.group({
      keyword : this.fb.control(null)
    })
    this.getAllOwners();
  }

  public getAllOwners(){
    this.ownerService.getAllOwners().subscribe({
      next: data=>{
        this.owners = data;
        console.log(this.owners)
      },
      error : errorMessage => console.error(errorMessage)
    })
  }


  searchOwner() {
    let keyword=this.searchOwnerFormGroup.value.keyword;
    this.ownerService.searchCar(keyword).subscribe({
      next :data=>{
        this.owners=data
      }
    })
  }

  addOwner() {
    this.router.navigateByUrl("/admin/addOwner")
  }

  getCars(p: Owners) {
    this.router.navigateByUrl("/admin/carDetail/"+p.id);
  }

  deleteOwner(id: number) {
    let conf =confirm("Do you want to delete this car?");
    if(conf==false) return;
    this.owners=this.owners.filter(p=>p.id!=id);
  }

  updateOwner(p: Owners) {
    this.router.navigateByUrl("/admin/editOwner/"+p.id);
  }
}
