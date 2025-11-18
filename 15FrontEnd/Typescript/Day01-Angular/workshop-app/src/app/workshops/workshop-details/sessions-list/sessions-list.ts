import { Component, OnInit, inject } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Sessions } from '../../sessions';
import ISession from '../../model/Iworkshop';

import { LoaderSpinner } from '../../../common/loader-spinner/loader-spinner';
import { ErrorAlert } from '../../../common/error-alert/error-alert';
import { Item } from './item/item';

import { VotingWidgetComponent } from '../../../common/voting-widget/voting-widget';
import { Toast } from '../../../common/toast/toast';

@Component({
  selector: 'app-sessions-list',
  standalone: true,
  imports: [LoaderSpinner, ErrorAlert, Item, VotingWidgetComponent],
  templateUrl: './sessions-list.html',
  styleUrl: './sessions-list.scss',
})
export class SessionsList implements OnInit {
  loading = true;
  error: Error | null = null;
  workshopId!: number;
  sessions!: ISession[];

  constructor(
    private sessionsService: Sessions,
    private activatedRoute: ActivatedRoute,
    private toastService: Toast
  ) {}

  updateVote(session: ISession, by: number) {
    this.sessionsService.voteForSession(session.id, by === 1 ? 'upvote' : 'downvote').subscribe({
      next: (updatedSession) => {
        session.upvoteCount = updatedSession.upvoteCount;
        const label = by === 1 ? 'Upvoted' : 'Downvoted';
        const message = `${label}: ${session.name}`;
        const className = by === 1 ? 'bg-success text-white' : 'bg-info text-dark';
        // Prefer add({ message, className, duration }) if available, else fallback to show()
        const anySvc: any = this.toastService as any;
        if (typeof anySvc.add === 'function') {
          anySvc.add({ message, className, duration: 3000 });
        } else {
          this.toastService.show(message, { className, delay: 3000 });
        }
      },
      error: () => {
        const anySvc: any = this.toastService as any;
        const message = 'Failed to register vote';
        const className = 'bg-danger text-white';
        if (typeof anySvc.add === 'function') {
          anySvc.add({ message, className, duration: 4000 });
        } else {
          this.toastService.show(message, { className, delay: 4000 });
        }
      },
    });
  }

  ngOnInit() {
    // this.activatedRoute.snapshot.paramMap is NOT an observable unlike this.activatedRoute.paramMap which is an observable
    const idStr = this.activatedRoute.snapshot.paramMap.get('id');
    this.workshopId = +(idStr as string);

    this.loading = true;
    this.sessionsService.getSessionsForWorkshop(this.workshopId).subscribe({
      next: (sessions) => {
        this.sessions = sessions;
        this.loading = false;
      },
      error: (err) => {
        this.error = err;
        this.loading = false;
      },
    });
  }
}
 