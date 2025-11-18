import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import IWorkshop from './model/Iworkshop';
import { environment } from '../../enviroments/environment';

@Injectable({
  providedIn: 'root',
})
export class Workshops {
  private apiUrl = environment.apiUrl;
  constructor(private http: HttpClient) {}
  getWorkshops(page: number = 1) {
    return this.http.get<IWorkshop[]>(`${this.apiUrl}/workshops`, {
      params: {
        _page: page,
      },
    });
  }

  getWorkshopById(workshopId: number) {
    return this.http.get<IWorkshop>(`${this.apiUrl}/workshops/${workshopId}`);
  }

  deleteWorkshop(workshopId: number) {
    return this.http.delete<void>(`${this.apiUrl}/workshops/${workshopId}`);
  }
}
 