import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookCatalogListComponent } from './book-catalog-list.component';

describe('BookCatalogListComponent', () => {
  let component: BookCatalogListComponent;
  let fixture: ComponentFixture<BookCatalogListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BookCatalogListComponent]
    });
    fixture = TestBed.createComponent(BookCatalogListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
