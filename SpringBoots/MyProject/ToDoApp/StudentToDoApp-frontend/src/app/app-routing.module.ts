import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProjectListComponent } from './components/project-list/project-list.component';
import { ProjectFormComponent } from './components/project-form/project-form.component';
import { ProjecViewComponent } from './components/projec-view/projec-view.component';

const routes: Routes = [
  {path:'', pathMatch:'full', redirectTo:'list'},
  {path:'list', component: ProjectListComponent},
  {path:'form', component: ProjectFormComponent},
  {path:'edit/:id', component: ProjectFormComponent},
  {path:'view/:id', component: ProjecViewComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
