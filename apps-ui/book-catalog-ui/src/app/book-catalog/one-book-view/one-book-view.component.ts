import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { Book } from '../../books';
import { BookCatalogService } from '../book-catalog.service';

@Component({
  selector: 'app-one-book-view',
  templateUrl: './one-book-view.component.html',
  styleUrls: ['./one-book-view.component.css']
})
export class OneBookViewComponent implements OnInit {

  loadedCatalogBook: Book = {
    isbn13: '',
    isbn10: '',
    title: ''
  };

  constructor(private route: ActivatedRoute, private catalogService: BookCatalogService) { }

  // books = [...statbooks];

  // oneBook: any;

  ngOnInit() {

    const isbn13: string = this.route.snapshot.params['isbn13'];

    this.onGetOneBook(isbn13);

    // let isbn13 = this.route.snapshot.params['isbn13'];

    // let filteredBook = statbooks.filter((book) => {
    //   return book.isbn13 === isbn13;
    // });

    // this.oneBook = filteredBook[0];
  }

  onGetOneBook(isbn13: string) {
    // Send GET Http Request for One Book
    this.catalogService.getOneBook(isbn13).subscribe(oneCatalogBook => {
      this.loadedCatalogBook = oneCatalogBook;
    })

  }
}
