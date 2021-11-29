import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nums: number[] = [];

  updateNumbers(event: number) {
    this.nums.push(event);
  }
}
