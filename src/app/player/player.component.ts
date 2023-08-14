import { Component } from '@angular/core';
import { PlayerService } from '../Services/player.service';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent {

  constructor(private playerService: PlayerService){}
  playerData : any;
  getData(){
    this.playerService.getData().subscribe({
      next : (data)=>{
        this.playerData = data;
      }
    });
  }

  ngOnInit(){
    this.getData();
  }
}
