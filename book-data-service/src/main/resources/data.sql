DROP TABLE IF EXISTS publisher;

CREATE TABLE publisher (
  publisherid INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO publisher (name) VALUES
  ('O''Reilly Media'),
  ('Manning Publications'),
  ('Wiley Publishing');