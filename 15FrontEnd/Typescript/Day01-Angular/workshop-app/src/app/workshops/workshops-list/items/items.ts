import { Component, Input, input } from '@angular/core';
import { IWorkshop } from '../../model/Iworkshop';
import { RouterLink } from '@angular/router';
import { DatePipe } from '@angular/common';
import { LocationPipe } from "../../../common/location-pipe";


@Component({
  selector: 'app-items',
  imports: [RouterLink, DatePipe, LocationPipe],
  templateUrl: './items.html',
  styleUrl: './items.scss'
})
export class Items {
  @Input()
  workshop!:IWorkshop;
}
