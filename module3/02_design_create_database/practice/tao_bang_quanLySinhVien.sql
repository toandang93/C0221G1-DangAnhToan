create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;
create table class(
class_id int auto_increment primary key,
class_name varchar(60) not null,
start_date datetime not null,
`Status` Bit 
);
create table student(
student_id int auto_increment primary key,
`name` varchar(20) not null,
address varchar(50),
phone varchar(20),
`Status` Bit,
class_id int not null ,foreign key(class_id) references class(class_id)
);
create table `subject`(
subject_id int auto_increment primary key,
`name` varchar(30) not null,
credit tinyint not null default 1 check(credit >=1),
`Status` Bit default 1
);
create table mark(
mark_id int auto_increment primary key,
subject_id int not null,foreign key(subject_id) references `subject`(subject_id),
student_id int not null, foreign key(student_id) references student(student_id),
Mark float default 0 check (Mark between 0 and 100),
unique (subject_id,student_id)
);
