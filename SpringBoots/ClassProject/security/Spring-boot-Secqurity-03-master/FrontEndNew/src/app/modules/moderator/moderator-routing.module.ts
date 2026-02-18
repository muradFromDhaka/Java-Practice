import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AuthGuard } from '../auth/auth.guard';

const routes: Routes = [
    { path: '', component: DashboardComponent
      // ,  canActivate: [AuthGuard],
      //   data: { role: 'ROLE_MODERATOR'}
      }
  
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ModeratorRoutingModule { }
