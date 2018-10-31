set names utf8;
set foreign_key_checks=0;
drop database if exists Book;

create database if not exists Book;
use Book;

drop table if exists book_title;

create table book_title(
id int not null primary key auto_increment,
title varchar(30),
price int,
stock int,
insert_date datetime,
update_date datetime
);

create table login_user(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
update_date datetime
);

create table buy_book(
id int not null primary key auto_increment,
book_id int,
total_price int,
total_count int,
user_id varchar(16),
pay varchar(30),
insert_date datetime,
update_date datetime
);

INSERT INTO login_user(login_id,login_pass,user_name) VALUES("internous","internous01","test");

INSERT INTO book_title(title,price,stock) VALUES
("賢者の石",500,30),
("秘密の部屋",500,30),
("アズカバンの囚人",500,30),
("炎のゴブレット",500,30);




