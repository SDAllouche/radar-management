import {OwnerRequest, Owners} from "./owner-model";

export interface Cars {
  id : number;
  registartionNumber : number;
  brand : number;
  power :number;
  model :number;
  ownerResponseDTO : Owners;
}
export interface Car {
  id : number;
  registartionNumber : number;
  brand : number;
  power :number;
  model :number;
}

export interface CarRequest {
  registartionNumber : number;
  brand : number;
  power :number;
  model :number;
  ownerResponseDTO : OwnerRequest;
}
