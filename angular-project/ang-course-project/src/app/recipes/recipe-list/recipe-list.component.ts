import { Component, OnInit } from '@angular/core';
import { Recipe } from '../recipe.model';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {
  recipes: Recipe[] = [
    new Recipe('A Test Recipe', 'This is simply a test', ''), new Recipe('A Test Recipe', 'This is simply a test', 'https://robbreport.com/wp-content/uploads/2020/04/gozu-wagyu-beef.jpg?w=1000')
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
