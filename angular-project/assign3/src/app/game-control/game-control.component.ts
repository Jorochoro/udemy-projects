import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-game-control',
  templateUrl: './game-control.component.html',
  styleUrls: ['./game-control.component.css']
})
export class GameControlComponent implements OnInit {

  @Output() start = new EventEmitter<number>();
  num = 0;
  ref;

  constructor() { }

  ngOnInit(): void {
  }

  startGame() {
    this.ref = setInterval(() => {
      console.log(this.num);
      this.start.emit(this.num++);
    }, 1000)
  }

  stopGame() {
    clearInterval(this.ref);
  }
}
