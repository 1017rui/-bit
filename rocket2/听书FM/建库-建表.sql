create database tingshuFM charset utf8mb4;

use tingshuFM;

create table users (
  uid int primary key auto_increment comment '用户id',
  username varchar(64) not null unique comment '用户名',
  password char(64) not null comment '经过sha-256计算后的用户密码'
);

create table books (
  bid int primary key auto_increment comment '小说id',
  uid int not null comment '上传用户的id',
  title varchar(100) not null comment '小说名称'
);

create table sections (
  sid int primary key auto_increment comment '章节id',
  bid int not null comment '属于哪本小说的id',
  name varchar(100) comment '章节名称'
);

create table audios (
  aid int primary key auto_increment comment '音频id',
  sid int not null comment '属于哪个章节的id',
  uuid char(36) not null comment 'uuid',
  content_type varchar(20) not null comment '音频类型 audio/wmv audio/mp3',
  content blob default null comment '音频内容'
);
!--找出最新上架的一本书
select title from books order by bid desc limit 1;
!--找出章节数最多的一本书

select title from books where bid=(
select bid  from sections group by bid order by count(*) desc limit 1
);
!--找到小A同学最新发表的一本书
select title from books ,users where books.uid=users.uid and users.username='小A'
order by bid desc limit 1;
!--给出统计，每个用户各自发表了多少数，按倒序排列
select uid,count(*) count from books group by uid order by count desc;
select username ,count(bid) count from users,books where users.uid=books.uid
group by books.uid order by

