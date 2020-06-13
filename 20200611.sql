--子查询
--建测试库和表
create database hjb2_0611 charset utf8mb4;
use hjb2_0611;
create table students(
id int primary key auto_increment,
name varchar(20),
height int,
weight int
);
insert into students (name,height,weight) values
('张三',177,63),
('李四',169,73),
('王五',183,53),
('赵六',202,103);


--首先查出name,height构成的一个表

--所有子查询必须用小括号包裹起来。
select name,height from students;
select * from (select name,height from students) t where t.height<200;

select * from (select name,height from students) t where t.name='张三';

create table employee (
id int primary key auto_increment,
depart_id int,
name varchar(20),
salary int
);

insert into employee(depart_id,name,salary)values
(1,'孙悟空',7000),
(1,'观世音',9000),
(1,'如来佛',12000),
(1,'唐三藏',8000),
(2,'贾宝玉',6000),
(2,'林黛玉',4000),
(3,'郭靖',17000),
(3,'黄蓉',9000),
(3,'杨过',13000);

--查询部门人数<3人的部门

--先查出每个部门的人数
select depart_id,count(*) from employee group by depart_id;
--不使用子查询的方式
select depart_id,count(*) from employee group by depart_id having count(*)<3;
--使用子查询的方式
select depart_id,cnt
from (select depart_id,count(*) cnt from employee group by depart_id) t 
where t.cnt<3;
--找到比孙悟空工资高的人
--不使用子查询的方式
select salary from employee where name='孙悟空';
select name ,salary from employee where salary>?;

--使用子查询的方式
select name ,salary from employee where salary>(
select salary from employee where name='孙悟空'
);
--找和黄蓉工资相同的人
--不使用子查询的方式
select salary from employee where name='黄蓉';
select name,salary from employee where salary=?;

--找到和部门3 工资相同的人但不是部门2 的人
--不使用子查询的方式
select salary from employee where depart_id=3;
select * from employee where salary in (17000,9000,13000);
--使用子查询的方式
select * from employee where salary in (
select salary from employee where depart_id=3
) and depart_id!=3;
--配合any,all等方法使用
--any大于里面任意一个
select * from employee where salary >any(
select salary from employee where depart_id=3
) and depart_id!=3;
--相当于
select * from employee where salary >9000 and depart_id!=3;
--all大于里面的所有
select * from employee where salary >all(
select salary from employee where depart_id=1
) and depart_id!=1;
--相当于
select * from employee where salary >12000 and depart_id!=1;


--找到id为7的人姓名和工资
select name,salary from employee where id=7;
--找到公司中，和这个人姓名相同，并且工资也相同的人
insert into employee (depart_id,name,salary) values
(4,'郭靖',17000),
(5,'郭靖',17000);
insert into employee (depart_id,name,salary) values
(6,'郭靖',1000),
(7,'郭靖',2000);
select * from employee where name='郭靖' and salary=17000;

select * from employee where (name,salary) =(
select name,salary from employee where id=7);


create table Person(
Id int,
Email varchar(20)
);
insert into Person (Id,Email) values
(1,'a@b.com'),
(2,'c@d.com'),
(3,'a@b.com');

select Email,count(*) from Person group by Email;
select Email,count(*) from Person group by Email having count(*)>1;

 