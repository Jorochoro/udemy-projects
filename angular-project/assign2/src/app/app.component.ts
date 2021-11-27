import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  username = '';
  showParagraph = false;
  buttonClicks: Date[] = [];

  constructor() {}

  clearUsername() {
    this.username = '';
  }

  logClick() {
    this.showParagraph = !this.showParagraph;
    this.buttonClicks.push(new Date());
  }
}
