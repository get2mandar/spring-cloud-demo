import { Component, OnInit } from '@angular/core';

//import { books } from '../books';
import { BookCatalogService } from './book-catalog.service';
import { Book } from '../books';

@Component({
  selector: 'app-book-catalog-list',
  templateUrl: './book-catalog.component.html',
  styleUrls: ['./book-catalog.component.css']
})

export class BookCatalogListComponent implements OnInit {

  loadedCatalogBooks: Book[] = [];
  isFetching = false;

  constructor(private catalogService: BookCatalogService) { }

  ngOnInit(): void {
    this.isFetching = true;
    this.onGetAllBooks();
  }

  onGetAllBooks() {
    // Send GET Http Request
    this.catalogService.getAllBooks().subscribe(catalogBooks => {
      this.isFetching = false;
      this.loadedCatalogBooks = catalogBooks;
    });
  }
}
