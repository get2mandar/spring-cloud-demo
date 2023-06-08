import { Component } from '@angular/core';

import { books } from '../books';

@Component({
  selector: 'app-book-catalog-list',
  templateUrl: './book-catalog-list.component.html',
  styleUrls: ['./book-catalog-list.component.css']
})

export class BookCatalogListComponent {
  books = [...books];
}
