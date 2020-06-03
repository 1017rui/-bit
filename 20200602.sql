//建表语句
create table students_notepad (
id int,
name varchar(50),
age int,
sex char(1),
brief varchar(200)
);
create table courses(
id int,
course varchar(20),
teacher varchar(50),
book varchar(50),
class varchar(20)
);
create database if not exists bit32mall;
use bit32mall;

create table if not exists goods(
goods_id int  comment '商品编号',
goods_name varchar(32) comment '商品名称',
unitprice int comment '单价，单位分',
category varchar(12) comment '商品分类',
provider varchar(64) comment '供应商名称'
);

create table if not exists customer(
customer_id int comment '客户编号',
customer_name varchar(32) comment '客户姓名',
address varchar(256) comment '客户住址',
email varchar(64) comment '客户邮箱',
sex char comment '客户性别',
card_id varchar(18) comment'客户身份证'
);

create table if not exists purchase(
order_id int comment '购买订单号',
customer_id int comment '客户编号',
goods_id int comment '商品编号',
nums int comment '购买数量'
);

create table student(
id int,
sn int comment '学号',
name varchar(20) comment '姓名',
qq_mail varchar(20) comment 'QQ邮箱'
);

insert into student values (100,10000,'唐三藏',null);
insert into student values (101,10001,'孙悟空',null);

insert into student(id ,sn,name)values(102,20001,'曹孟德'),(103,20002,'孙仲谋');

//准备工作
create table exam_result(
id int,
name varchar(20),
chinese decimal(3,1),
math decimal (3,1),
english decimal (3,1)
);

insert into exam_result(id,name,chinese,math,english) values
(1,'唐三藏',67,98,56),
(2,'孙悟空',87.5,78,77),
(3,'猪悟能',88,98.5,90),
(4,'曹孟德',82,84,67),
(5,'刘玄德',55.5,85,45),
(6,'孙权',70,73,78.5),
(7,'宋公明',75,65,30);

select * from exam_result;

select id,name,english from exam_result;

select id, name, 10 from exam_result;
select id,name,english+10 from exam_result;
select id,name,chinese+math+english as total from exam_result;
select math from exam_result;
update exam_result set math=98 where name='猪悟能';
update student set qq_mail='11111' where name='孙悟空';
select distinct math from exam_result;

select english >60 from exam_result;--查询出的是bool类型  0表示false 1表示true
select name from exam_result where english>chinese;
select * from exam_result where english=77;
select * from exam_result where english!=77;
select * from exam_result where id=1;
select * from exam_result where name='唐三藏';
select * from exam_result where name !='唐三藏';
select * from exam_result where english >60;
--查询英语成绩在[67,100] 
select * from exam_result where english  between 67 and 100;
select * from exam_result where  english>=67 and english<=100;
--查询孙悟空，唐三藏的成绩
select * from exam_result where name in ('孙悟空','唐三藏');
select * from exam_result where name ='孙悟空'or name='唐三藏';
--查询除了孙悟空，唐三藏的成绩
select * from exam_result where name not in ('孙悟空','唐三藏');
select * from exam_result where not (name ='孙悟空'or name='唐三藏');
select * from exam_result where name !='孙悟空'and name!='唐三藏';
--查询已经登记过QQ邮箱的同学

select * from student where qq_mail !=null;--error
select * from student where qq_mail is not null;
--查询没有登过邮箱的同学
select * from student where null;--error

select * from student qq_mail is null;
select * from student qq_mail <=> null;

-- 查询已经登记过 qq 邮箱的同学
select * from student where qq_mail != null; -- 错误
select * from student where null; -- 错误

select * from student where qq_mail is not null; -- 正确

-- 查询没有登记过 qq 邮箱的同学
select * from student where qq_mail = null; -- 错误
select * from student where null; -- 错误

select * from student where qq_mail is null; -- 正确 鼓励使用这种方法
select * from student where qq_mail <=> null; -- 正确 看到认识即可

-- 查询某个同学的成绩，条件是，该同学姓孙
select * from exam_result where name like '孙%';
-- % 代表
-- 0个或者多个字符 数目待定
-- 如果出现，可以是任意字符 字符待定

-- 查询某个同学的成绩，条件是，该同学叫“什么孙”
select * from exam_result where name like '%孙';

-- 查询某个同学的成绩，条件是，该同学名字中带“孙”
select * from exam_result where name like '%孙%';

-- 查询某个同学的成绩，条件是，该同学叫“孙某”
select * from exam_result where name like '孙_';

-- 查询某个同学的成绩，条件是，该同学叫“孙某某”
select * from exam_result where name like '孙__';

-- 查询同学的成绩，条件是，同学不叫“孙某某”
select * from exam_result where name not like '孙__';

select name,qq_mail from student order by qq_mail;
select name,qq_mail from student order by qq_mail desc;

select name,chinese+english+math from exam_result ;
order by chinese+english+math desc;
select name,chinese+english+math total from exam_result
order by total desc;

select name,math,english,chinese from exam_result
order by math desc ,english,chinese;

-- 查询所有人的成绩，按照数学成绩排序，从低到高
select * from exam_result order by math;
select * from exam_result order by math asc;

-- 查询所有人的成绩，按照数学成绩排序，从高到低
select * from exam_result order by math desc;

-- 查询所有人的成绩，按照数学成绩排序，从高到低，如果相等，按照语文成绩排序，从低到高
select * from exam_result order by math desc, chinese asc;

-- 查询所有人的成绩，按照数学成绩排序，从高到低，如果数学成绩相等，按照语文成绩排序，从低到高，如果语文成绩相等，按照id排序，从高到底
select * from exam_result order by math desc, chinese asc, id desc;

-- 选出 id 排序，从低到高，前 3 个
select * from exam_result order by id limit 3;


-- 选出 id 排序，从低到高，5, 6, 7
select * from exam_result order by id limit 3 offset 4;
select * from exam_result order by id limit 4, 3;

--查询总分在200分以下的同学
select name,chinese+math+english total from exam_result 
where chinese+math+english<200;

select * from exam_result where chinese>80 and english>80;

select * from exam_result where chinese>80 or english>80;
select * from exam_result where chinese>80 or math>70 and english>70;