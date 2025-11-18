import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbAlert } from '@ng-bootstrap/ng-bootstrap';

import { Workshops } from '../workshops';
import { IWorkshop } from '../model/Iworkshop';
import { LoaderSpinner } from '../../common/loader-spinner/loader-spinner';
import { ErrorAlert } from '../../common/error-alert/error-alert';
import { Items } from './items/items';
import { Pagination } from "../../common/pagination/pagination";
import { ActivatedRoute, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-workshops-list',
  standalone: true,
  imports: [CommonModule, LoaderSpinner, ErrorAlert, Items, Pagination,FormsModule],
  templateUrl: './workshops-list.html',
  styleUrls: ['./workshops-list.scss']
})
export class WorkshopsList implements OnInit {
[x: string]: any;


  workshops: IWorkshop[] = [];
  filteredWorkshops: IWorkshop[] = [];
  error!: Error;
  loading = true;
  page = 1;

  //what has user typed in search 
  filterKey='';
  
  constructor(
    private w:Workshops,
    private activeRoute:ActivatedRoute,
    private router:Router
  ){}


  ngOnInit() {
    // this.activatedRoute.queryParamMap is an Observable that tracks changes to the query string -> thus whenever `page` in the query string changes, the next() method is called
    this.activeRoute.queryParamMap.subscribe({
        next: (queryParams) => {
            const queryStr = queryParams.get('page');

            // when the page loads for the first time, there is no `page` query string parameter -> so we set page to 1. Later on there is some `page` value
            if (queryStr === null) {
                this.page = 1;
            } else {
                this.page = +queryStr; // convert `page` from string type to number
            }

            this.getWorkshops(); // page has changed -> get fresh data
        }
    });
  }

  getWorkshops() {
    this.loading = true;
    this.w.getWorkshops(this.page).subscribe({
      next: (workshops) => {
        // this.workshops = workshops;
        // this.filteredWorkshops=workshops;
        this.loading = false;
      },
      error: (error) => {
        this.error = error;
        this.loading = false;
      },
    });
  }

  changePage(by: number) {
    if (this.page === 1 && by < 0) {
      return;
    }
    this.page += by;
    // this.getWorkshops();
     this.router.navigate(['/workshops'], {
      queryParams: { page: this.page }
    });
  }

  filterWorkshops() {
    const search = this.filterKey.trim().toUpperCase();

    // ✅ defensive check (avoid error when data not loaded)
    if (!this.workshops) return;

    this.filteredWorkshops = this.workshops.filter(
      w => w.name.toUpperCase().includes(search)
    );
  }
}