create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;
create table class(
ClassId int auto_increment primary key,
ClassName varchar(60) not null,
StarDate datetime not null,
`Status` Bit 
);
create table student(
StudentID int auto_increment primary key,
StudentName varchar(20) not null,
Address varchar(50),
Phone varchar(20),
`Status` Bit,
ClassID int not null ,foreign key(ClassID) references class(Classid)
);
create table `subject`(
SubID int auto_increment primary key,
SubName varchar(30) not null,
Credit tinyint not null default 1 check(Credit >=1),
`Status` Bit default 1
);
create table mark(
MarkID int auto_increment primary key,
SubID int not null,foreign key(SubID) references `subject`(SubID),
StudentID int not null, foreign key(StudentID) references student(StudentID),
Mark float default 0 check (Mark between 0 and 100),
unique (SubID,StudentID)
);
