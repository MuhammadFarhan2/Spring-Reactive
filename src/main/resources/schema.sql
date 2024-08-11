CREATE TABLE BOOK (
                      ID INTEGER AUTO_INCREMENT PRIMARY KEY,
                      TITLE VARCHAR(255) NOT NULL,
                      AUTHOR VARCHAR(255) NOT NULL
);

INSERT INTO BOOK (TITLE, AUTHOR) VALUES ('Angels and Demons', 'Dan Brown');
INSERT INTO BOOK (TITLE, AUTHOR) VALUES ('The Matarese Circle', 'Robert Ludlum');
INSERT INTO BOOK (TITLE, AUTHOR) VALUES ('Name of the Rose', 'Umberto Eco');
