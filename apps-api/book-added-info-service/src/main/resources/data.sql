/* Data for Entity BookBinding */
INSERT INTO binding (type) VALUES
  ('Paperback'),
  ('Kindle (Amazon)'),
  ('ePUB');

/* Data for Entity BookInfo */
INSERT INTO book_info (isbn13, edition, pages, language, published, bindingid) VALUES
  ('9780071808569', 9, 1313, 'English', 'April 2014', 2),
  ('9780471423140', 1, 789, 'English', 'May 2003', 1),
  ('9781590595961', 1, 425, 'English', 'March 2006', 1),
  ('9781617290060', 1, 496, 'English', 'July 2012', 1),
  ('9781617292545', 1, 266, 'English', 'January 2016', 1),
  ('9780972954891', 1, 306, 'English', 'May 2004', 1),
  ('9781449365110', 2, 359, 'English', 'September 2013', 1),
  ('9781449331443', 2, 720, 'English', 'August 2005', 3),
  ('9781565927186', 1, 706, 'English', 'May 2000', 1),
  ('9780596516680', 2, 879, 'English', 'April 2008', 1);
  