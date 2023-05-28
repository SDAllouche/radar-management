import { Component } from '@angular/core';

@Component({
  selector: 'app-new-owner',
  templateUrl: './new-owner.component.html',
  styleUrls: ['./new-owner.component.css']
})
export class NewOwnerComponent {
  newOwnerFormGroup: any;

  saveOwner() {

  }

  getErrorMessage(maxSpeed: string, errors: any) {

  }
}
