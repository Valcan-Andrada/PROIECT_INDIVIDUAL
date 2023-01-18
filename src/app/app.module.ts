import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { DetailsComponent } from './details/details.component';
import { HistoricComponent } from './historic/historic.component';
import { GradesComponent } from './grades/grades.component';
import { MenuComponent } from './menu/menu.component';
import {FormsModule} from "@angular/forms";
import { EmailComponent } from './email/email.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DetailsComponent,
    HistoricComponent,
    GradesComponent,
    MenuComponent,
    EmailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
