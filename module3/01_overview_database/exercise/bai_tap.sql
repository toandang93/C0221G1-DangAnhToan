create database if not exists student_managerment;
use student_managerment;
create table Teacher(
id int(10) auto_increment not null primary key ,
`name` varchar(50),
age int,
country varchar(50)
);
create table Class(
id int(10) auto_increment not null primary key,
`name` varchar(50)
);
select * 
from teacher;
insert into teacher(`name`,age,country)
values ("Huong",18,"VN"),
("Huong1",18,"VN"),
("Huong2",18,"VN");
update teacher
set `name`="Toan";
SET SQL_SAFE_UPDATES = 0;
update teacher
set `name`="Hung"
where id=2;
delete from teacher
where id =3;