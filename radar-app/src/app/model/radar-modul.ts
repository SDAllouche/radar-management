export interface Radar {
  id : number;
  maxSpeed : number;
  longitude :number;
  latitude : number;
}

export interface RadarRequest {
  maxSpeed : number;
  longitude :number;
  latitude : number;
}
