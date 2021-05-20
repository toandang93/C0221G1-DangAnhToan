create database internship;
use internship;

create table faculty(
faculty_id int primary key,
faculty_name varchar(20),
phone varchar(20)
);

create table instructor(
instructor_id int primary key,
instructor_name varchar(20),
salary float,
faculty_id int,
foreign key (faculty_id) references faculty(faculty_id)
on delete cascade
);

create table student(
student_id int primary key,
student_name varchar(20),
birth_day date,
place_of_birth varchar(20),
faculty_id int,
foreign key (faculty_id) references faculty (faculty_id)
on delete cascade
);

create table project(
project_id int primary key,
project_name varchar(20),
expense int,
place_of_intern varchar(20)
);

create table instructor_student(
student_id int,
project_id int,
instructor_id int,
grade float,
primary key (student_id,project_id,instructor_id),
foreign key (student_id) references student(student_id) on delete cascade,
foreign key ( project_id) references project(project_id) on delete cascade,
foreign key ( instructor_id) references instructor(instructor_id) on delete cascade
);

insert into faculty
values (1,"Toan","0908345234"),
(2,"CNSH","0908346524"),
(3,"Dia Ly","0926745234"),
(4,"QLTN","0986445234");

insert into instructor
values (1,"Huong",500,1),
(2,"Vinh",500,2),
(3,"Thang",500,3),
(4,"Nhi",500,4);

insert into project
values (1,"Hoa Sinh",1000,"Da Nang"),
(2,"Dia Chat",1000,"Hue"),
(3,"Nha Hang",1000,"Quang nam"),
(4,"Ma Tran",1000,"Quang Binh");

insert into student 
values (1,"Toan","1993-12-12","Da Nang",1),
(2,"Cuong","1994-08-06","Nghe An",2),
(3,"Van","1995-05-08","Ha Noi",3),
(4,"Thinh","1996-04-07","Binh Dinh",4);

insert into  instructor_student
values (1,1,1,80),
(2,2,2,79.5),
(3,3,3,72.5),
(4,4,4,82.5);