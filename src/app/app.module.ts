import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { PlayerComponent } from './player/player.component';
import { Base64contentPipe } from './base64content.pipe'

@NgModule({
  declarations: [
    AppComponent,
    PlayerComponent,
    Base64contentPipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
