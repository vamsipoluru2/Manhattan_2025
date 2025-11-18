import { Component, ViewEncapsulation } from "@angular/core";
import { NgbAlert } from "@ng-bootstrap/ng-bootstrap";
import { Menu } from "./menu/menu";
import { Home } from "./home/home";
import { RouterOutlet } from "@angular/router";
import { Toast as ToastComponent} from "./common/toast/toast";


@Component({
  selector:'app-root',
  // encapsulation:ViewEncapsulation.Emulated,
  standalone:true,
  imports: [NgbAlert, Menu, Home, RouterOutlet,ToastComponent],//to implement import
  templateUrl:'./app.html',//to collect html 
  styleUrl:'./app.scss'//to collect all css
  
})
export class App{
  title='Workshop App';

  changeTitle(newTitle:string){
    this.title=newTitle;
  }

}
