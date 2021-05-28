/* Data for Entity Publisher */
INSERT INTO publisher (name) VALUES
  ('Addison-Wesley'),
  ('Apress Media LLC'),
  ('DVT Press'),
  ('Manning Publications'),
  ('McGraw-Hill Education'),
  ('O''Reilly Media Inc'),
  ('Packt Publishing'),
  ('Pearson Education'),
  ('Pragmatic Programmers LLC'),
  ('Prentice-Hall Inc'),
  ('Wiley Publishing Inc');

/* Data for Entity Author */
INSERT INTO author (name) VALUES
  ('Herbert Schildt'),
  ('Richard F. Raposa'),
  ('Brian Sam Bodden'),
  ('Benjamin J Evans'),
  ('Martijn Verburg'),
  ('Craig Walls'),
  ('Derek C. Ashmore'),
  ('Martin Kalin'),
  ('Kathy Sierra'),
  ('Bert Bates'),
  ('Jonathan Knudsen'),
  ('Patrick Niemeyer'),
  ('Bryan Basham');
  
/* Data for Entity Book */
INSERT INTO book (isbn13, isbn10, title, publisherid) VALUES
  ('9780071808569', '0071808566', 'Java: The Complete Reference, Ninth Edition', 5),
  ('9780471423140', '0471423149', 'Java in 60 Minutes A Day', 11),
  ('9781590595961', '1590595963', 'Beginning POJOs Novice to Professional', 2),
  ('9781617290060', '1617290068', 'The Well-Grounded Java Developer', 4),
  ('9781617292545', '1617292540', 'Spring Boot in Action', 4),
  ('9780972954891', '0972954899', 'The J2EE Architect''s Handbook', 3),
  ('9781449365110', '1449365116', 'Java Web Services- Up and Running, 2nd Edition', 6),
  ('9781449331443', '1449331440', 'Head First Java', 6),
  ('9781565927186', '1565927184', 'Learning Java', 6),
  ('9780596516680', '0596516681', 'Head First Servlets and JSP', 6);

/* Data for Many-To-Many Mapping of Book and Author */
INSERT INTO book_authors (bookid, authorid) VALUES
  (1, 1),
  (2, 2),
  (3, 3),
  (4, 4),
  (4, 5),
  (5, 6),
  (6, 7),
  (7, 8),
  (8, 9),
  (8, 10),
  (9, 11),
  (9, 12),
  (10, 9),
  (10, 10),
  (10, 13);