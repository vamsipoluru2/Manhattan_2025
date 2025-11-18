import { Component, inject } from '@angular/core';
import { NgbToastModule } from '@ng-bootstrap/ng-bootstrap';
import { ToastService } from '../toast';
@Component({
  selector: 'app-toast',
  imports: [NgbToastModule],
  templateUrl: './toast.html',
  styleUrl: './toast.scss'
})
export class Toast {
    show(message: string, arg1: { className: string; delay: number; }) {
        throw new Error('Method not implemented.');
    }
getToasts() {
throw new Error('Method not implemented.');
}
remove(_t1: any) {
throw new Error('Method not implemented.');
}
  public toastService=inject(ToastService)
}
