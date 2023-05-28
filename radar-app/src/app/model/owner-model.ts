import {Car} from "./car-model";

export interface Owners {
  id : number;
  name : string;
  date : string;
  mail : string;
}

export interface Owner {
  id : number;
  name : string;
  date : string;
  mail : string;
  cars : Car[];
}

export interface OwnerRequest {
  name : string;
  date : string;
  mail : string;
}


