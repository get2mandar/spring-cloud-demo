export interface Book {
    isbn13: string;
    isbn10: string;
    title: string;
  }

  export const books = [
    {
        isbn13: "9780071808569",
        isbn10: "0071808566",
        title: "Java: The Complete Reference, Ninth Edition"
    },
    {
        isbn13: "9780471423140",
        isbn10: "0471423149",
        title: "Java in 60 Minutes A Day"
    },
    {
        isbn13: "9781590595961",
        isbn10: "1590595963",
        title: "Beginning POJOs Novice to Professional"
    },
    {
        isbn13: "9781617290060",
        isbn10: "1617290068",
        title: "The Well-Grounded Java Developer"
    }
  ];