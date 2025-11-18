import { Routes } from '@angular/router';
import { WorkshopsList } from './workshops-list/workshops-list';
import { Favorites } from '../workshops/favorites/favorites';
import { Home } from '../home/home';
import { PageNotFound } from '../page-not-found/page-not-found';
import { AddWorkshop } from './add-workshop/add-workshop';
import { RouterLink } from '@angular/router';
import { WorkshopDetailsComponent } from './workshop-details/workshop-details';
import { Component } from '@angular/core';
import{SessionsList} from './workshop-details/sessions-list/sessions-list';
import{AddSession} from './workshop-details/add-session/add-session';


export const routes: Routes = [
    {
        path: 'workshops',
        component: WorkshopsList,
        title: 'List of workshops'
    },
    {
        path: 'workshops/add',
        component: AddWorkshop,
        title: 'Add a workshop'
    },
    {
        path: 'workshops/favourites',
        component: Favorites,
        title: 'Favourite workshops'
    },
   {
    path: 'workshops/:id',
    component: WorkshopDetailsComponent,
    // title: 'Workshop Details',
   children: [
        {
            path: '', // same as parent route as nothing is to be added to that route
            component: SessionsList,
        },
        {
            path: 'add-session',
            component: AddSession,
        },
    ],
},

];