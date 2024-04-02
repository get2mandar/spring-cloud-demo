import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { BookCatalogListComponent } from './book-catalog/book-catalog.component';
import { OneBookViewComponent } from './book-catalog/one-book-view/one-book-view.component';

@NgModule({
  declarations: [
    AppComponent,
    BookCatalogListComponent,
    OneBookViewComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: '', component: BookCatalogListComponent },
      { path: 'book/:isbn13', component: OneBookViewComponent },
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
