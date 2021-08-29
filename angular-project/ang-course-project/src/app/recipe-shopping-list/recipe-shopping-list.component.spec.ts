import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecipeShoppingListComponent } from './recipe-shopping-list.component';

describe('RecipeShoppingListComponent', () => {
  let component: RecipeShoppingListComponent;
  let fixture: ComponentFixture<RecipeShoppingListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RecipeShoppingListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RecipeShoppingListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
