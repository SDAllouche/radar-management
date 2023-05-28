import { Injectable } from '@angular/core';
import {User} from "../model/user-model";
import {Observable, of, throwError} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  private users : User[]=[];
  public authenticatedUser : User | undefined;
  constructor() {
    this.users.push({id : 1,username:"user",password :"user","roles":['USER']});
    this.users.push({id : 3,username:"admin",password :"admin","roles":['USER',"ADMIN"]});
  }

  public login(username:string, password :string):Observable<User> {
    let appUser = this.users.find(u=>u.username==username);
    if(!appUser)
      return throwError(()=>new Error('User Not found'));
    if(appUser.password!=password)
      return throwError(()=>new Error('Bad Credentials'));
    return of(appUser);
  }

  public authenticateUser(user : User):Observable<boolean>{
    this.authenticatedUser=user;
    localStorage.setItem("authUser", JSON.stringify({username:user.username, roles:user.roles, token : "JWT_TOKEN"}));
    return of(true);
  }

  public hasRole(role : string) :boolean {
    return this.authenticatedUser!.roles.includes(role);
  }

  public logout(){
    this.authenticatedUser=undefined;
    localStorage.removeItem("authUser");
    return of(true);
  }

  public isAuthenticated():boolean{
    return this.authenticatedUser!=undefined;
  }

}
