import { Component, Input } from '@angular/core';
import ISession from '../../../model/Iworkshop';

@Component({
  selector: 'app-item',
  imports: [],
  templateUrl: './item.html',
  styleUrl: './item.scss'
})
export class Item {
  @Input()
  session!: ISession;

}
