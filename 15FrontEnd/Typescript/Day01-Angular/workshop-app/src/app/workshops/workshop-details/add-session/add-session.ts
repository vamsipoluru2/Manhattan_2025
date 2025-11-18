import { Component } from '@angular/core';
import { ActivatedRoute, Router, RouterLink } from "@angular/router";
import { FormsModule, NgForm } from '@angular/forms';
import { JsonPipe } from '@angular/common';
import ISession from '../../model/Iworkshop';
import { Sessions } from '../../sessions';
 
@Component({
  selector: 'app-add-session',
  imports: [RouterLink,FormsModule, JsonPipe],
  templateUrl: './add-session.html',
  styleUrl: './add-session.scss'
})
export class AddSession {
 
 constructor(
        private activatedRoute: ActivatedRoute,
        private Sessions: Sessions,
        private router: Router
    ) {}
 
    addSession(addSessionForm: NgForm) {
        const id = +(this.activatedRoute.snapshot.parent?.paramMap.get(
            'id'
        ) as string);
 
        const newSession = {
            ...addSessionForm.value, //spread operator to copy the properties
            workshopId: id,
            upvoteCount: 0,
            sequenceId: +addSessionForm.value.sequenceId,
            duration: +addSessionForm.value.duration,
        } as Omit<ISession, 'id'>;
 
        console.log(newSession);
       
        this.Sessions.addSession(newSession).subscribe({
            next: (addedSession) => {
                alert(`Added session with id = ${addedSession.id}`);
               
                // You can also use navigateByUrl()
                this.router.navigate(['/workshops', id]);
            },
        });
    }
 
}