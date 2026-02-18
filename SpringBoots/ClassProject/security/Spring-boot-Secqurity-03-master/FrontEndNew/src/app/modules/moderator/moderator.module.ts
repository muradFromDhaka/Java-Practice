import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ModeratorRoutingModule } from './moderator-routing.module';
import { DashboardComponent } from './dashboard/dashboard.component';


@NgModule({
  declarations: [
    DashboardComponent
  ],
  imports: [
    CommonModule,
    ModeratorRoutingModule
  ]
})
export class ModeratorModule { }
