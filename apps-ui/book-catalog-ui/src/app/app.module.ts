import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { BookCatalogListComponent } from './book-catalog-list/book-catalog-list.component';
import { OneBookViewComponent } from './one-book-view/one-book-view.component';

@NgModule({
  declarations: [
    AppComponent,
    BookCatalogListComponent,
    OneBookViewComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      { path: '', component: BookCatalogListComponent },
      { path: 'book/:isbn13', component: OneBookViewComponent },
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
