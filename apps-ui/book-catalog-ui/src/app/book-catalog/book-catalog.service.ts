import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { map } from "rxjs";
import { Book } from "../books";

@Injectable({ providedIn: 'root' })
export class BookCatalogService {

    constructor(private http: HttpClient) { }

    getAllBooks() {
        return this.http
            .get<Book[]>(
                'http://localhost:9050/catalog/books'
            ).pipe(map(responseData => {
                const booksList: Book[] = [];
                for (const key in responseData) {
                    if (responseData.hasOwnProperty(key)) {
                        booksList.push({ ...responseData[key] })
                    }
                }
                return booksList;
            })
            );
    }

    getOneBook(isbn13: string) {
        return this.http
            .get<Book>(
                'http://localhost:9081/books/' + isbn13
            ).pipe(map(responseData => {
                const oneBook: Book = {
                    isbn13: responseData.isbn13,
                    isbn10: responseData.isbn10,
                    title: responseData.title
                }
                return oneBook;
            })
            );
    }

}