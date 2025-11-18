import { Routes } from '@angular/router';
import { WorkshopsList } from './workshops/workshops-list/workshops-list';
import { Favorites } from './workshops/favorites/favorites';
import { Home } from './home/home';
import { PageNotFound } from './page-not-found/page-not-found';
 
export const routes: Routes = [
    {
        path: '',
        component: Home,
        title: 'Workshops App'
    },
    {
        path: '**',
        component: PageNotFound
    }
];