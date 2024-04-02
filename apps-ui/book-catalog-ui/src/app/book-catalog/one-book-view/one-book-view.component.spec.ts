import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OneBookViewComponent } from './one-book-view.component';

describe('OneBookViewComponent', () => {
  let component: OneBookViewComponent;
  let fixture: ComponentFixture<OneBookViewComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [OneBookViewComponent]
    });
    fixture = TestBed.createComponent(OneBookViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
