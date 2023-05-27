import {Owners} from "./ownerDTO-model";

export interface Cars {
  id : number;
  registartionNumber : number;
  brand : number;
  power :number;
  model :number;
  owner : Owners;
}
