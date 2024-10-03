INSERT INTO users(username,email,password) VALUES('nas1','nas1@gmail.com','123456');
INSERT INTO users(username,email,password) VALUES('nas2','nas2@gmail.com','123456');
INSERT INTO users(username,email,password) VALUES('nas3','nas3@gmail.com','123456');
INSERT INTO users(username,email,password) VALUES('nas4','nas4@gmail.com','123456');

INSERT INTO authors(name) VALUES('author 1');
INSERT INTO authors(name) VALUES('author 2');
INSERT INTO authors(name) VALUES('author 3');
INSERT INTO authors(name) VALUES('author 4');


INSERT INTO books(title,author_id,publisher) VALUES('book 1',1,'publisher 1');
INSERT INTO books(title,author_id,publisher) VALUES('book 2',1,'publisher 2');
INSERT INTO books(title,author_id,publisher) VALUES('book 3',1,'publisher 1');

INSERT INTO books(title,author_id,publisher) VALUES('book 4',2,'publisher 3');
INSERT INTO books(title,author_id,publisher) VALUES('book 5',2,'publisher 2');
INSERT INTO books(title,author_id,publisher) VALUES('book 6',2,'publisher 1');
INSERT INTO books(title,author_id,publisher) VALUES('book 7',2,'publisher 2');

INSERT INTO books(title,author_id,publisher) VALUES('book 8',3,'publisher 1');
INSERT INTO books(title,author_id,publisher) VALUES('book 9',3,'publisher 1');
INSERT INTO books(title,author_id,publisher) VALUES('book 10',3,'publisher 1');
INSERT INTO books(title,author_id,publisher) VALUES('book 11',3,'publisher 1');
INSERT INTO books(title,author_id,publisher) VALUES('book 12',3,'publisher 1');
INSERT INTO books(title,author_id,publisher) VALUES('book 13',3,'publisher 1');


INSERT INTO comments(content,user_id,book_id) VALUES('comment 1',3,1);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 2',2,1);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 3',4,1);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 4',2,1);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 5',3,2);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 6',4,3);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 7',3,1);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 8',3,1);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 9',2,1);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 10',4,1);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 11',2,1);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 12',3,2);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 13',4,3);
INSERT INTO comments(content,user_id,book_id) VALUES('comment 14',3,1);