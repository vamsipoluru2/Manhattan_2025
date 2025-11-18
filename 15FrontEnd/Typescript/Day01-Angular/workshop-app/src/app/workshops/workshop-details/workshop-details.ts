import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { CommonModule, DatePipe } from '@angular/common';
import { Workshops } from '../workshops';
import { IWorkshop } from '../model/Iworkshop';
import { LocationPipe } from '../../common/location-pipe';
import { ErrorAlert } from '../../common/error-alert/error-alert';
import { LoaderSpinner } from '../../common/loader-spinner/loader-spinner';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faCheckCircle, faTimesCircle } from '@fortawesome/free-regular-svg-icons';

@Component({
  selector: 'app-workshop-details',
  standalone: true,
  imports: [DatePipe, LoaderSpinner, ErrorAlert, LocationPipe,FontAwesomeModule,CommonModule,RouterModule],
  templateUrl: './workshop-details.html',
  styleUrls: ['./workshop-details.scss']
})
export class WorkshopDetailsComponent implements OnInit {
  loading = true;
  error: Error | null = null;
  workshop!: IWorkshop;
  workshopId!: number;

  icons = {
    // The below is just ES2015+ short for faCheckCircle: faCheckCircle,
    faCheckCircle,
    faTimesCircle,
};

  constructor(
    private workshopsService: Workshops,
    private activatedRoute: ActivatedRoute
  ) {}

  ngOnInit() {
    this.activatedRoute.paramMap.subscribe({
      next: (params) => {
        const idStr = params.get('id');
        this.workshopId = Number(idStr);

        this.workshopsService.getWorkshopById(this.workshopId).subscribe({
          next: (workshop) => {
            // this.workshop = workshop;
            this.loading = false;
          },
          error: (err) => {
            this.error = err;
            this.loading = false;
          }
        });
      }
    });
  }
}
