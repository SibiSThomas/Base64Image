import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private httpClient: HttpClient) { }


  getData(): Observable<any>{
    return this.httpClient.get('http://localhost:8080/findAll');
  }

}
