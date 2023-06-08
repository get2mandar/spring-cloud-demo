import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { Book, books } from '../books';

@Component({
  selector: 'app-one-book-view',
  templateUrl: './one-book-view.component.html',
  styleUrls: ['./one-book-view.component.css']
})
export class OneBookViewComponent implements OnInit {
  constructor(private route: ActivatedRoute) {}

  books = [...books];

  oneBook: any;

  ngOnInit() {
    let isbn13 = this.route.snapshot.params['isbn13'];

    let filteredBook = books.filter((book) => {
      return book.isbn13 === isbn13;
    });

    this.oneBook = filteredBook[0];
  }
}
