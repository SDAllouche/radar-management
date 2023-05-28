import { Component } from '@angular/core';
import {FormGroup} from "@angular/forms";

@Component({
  selector: 'app-edit-owner',
  templateUrl: './edit-owner.component.html',
  styleUrls: ['./edit-owner.component.css']
})
export class EditOwnerComponent {
  updateOwnerFormGroup!: FormGroup;
  ownerId! : number;

  updateOwner() {

  }
}
