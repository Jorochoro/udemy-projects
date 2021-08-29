import { Component, OnInit } from '@angular/core';

import { Ingredient } from '../shared/ingredient.model';
@Component({
  selector: 'app-recipe-shopping-list',
  templateUrl: './recipe-shopping-list.component.html',
  styleUrls: ['./recipe-shopping-list.component.css']
})
export class RecipeShoppingListComponent implements OnInit {
  ingredients: Ingredient[] = [
    new Ingredient('Apples', 5),
    new Ingredient('Tomatoes', 10),
  ];
  
  constructor() { }

  ngOnInit(): void {
  }

}
