import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { DetailsComponent } from './details/details.component';
import { HistoricComponent } from './historic/historic.component';
import { GradesComponent } from './grades/grades.component';
import {EmailComponent} from "./email/email.component";

const routes: Routes = [
  {path: '', component: LoginComponent},
  {path: 'login', component: LoginComponent},
  {path: 'details', component: DetailsComponent},
  {path: 'grades', component: GradesComponent},
  {path: 'historic', component: HistoricComponent},
  {path:'email',component:EmailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
