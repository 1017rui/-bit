<<<<<<< HEAD
--创建一个 小型博客系统 数据库
create database if not exists Small_Blog_System charset utf8mb4 ;

use Small_Blog_System;

create table users(
  id int primary key auto_increment,
  username varchar(40) not null unique,
  password varchar(100) not null
);

create table articles(
  id int primary key auto_increment,
  user_id int not null,
  title varchar(200) not null,
  content text  not null,
  published_at datetime not null
=======
--创建一个 小型博客系统 数据库
create database if not exists Small_Blog_System charset utf8mb4 ;

use Small_Blog_System;

create table users(
  id int primary key auto_increment,
  username varchar(40) not null unique,
  password varchar(100) not null
);

create table articles(
  id int primary key auto_increment,
  user_id int not null,
  title varchar(200) not null,
  content text  not null,
  published_at datetime not null
>>>>>>> 64b400532b9ce10e2603c7cd10c3636032e66765
);