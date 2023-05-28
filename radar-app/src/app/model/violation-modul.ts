export interface Violation {
  id : number;
  radarID : number;
  registrationNumber :number;
  carSpeed : number;
  maxSpeed : number,
  date :string,
  penalty:number,
}

export interface ViolationRequest {
  radarID : number;
  registrationNumber :number;
  carSpeed : number;
  maxSpeed : number,
  date :string,
  penalty:number,
}
