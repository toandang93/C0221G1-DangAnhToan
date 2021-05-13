create database if not exists quan_ly_diem_thi;
use quan_ly_diem_thi;
create table hoc_sinh(
MaHS int auto_increment primary key,
TenHS varchar(45),
NgaySinh date,
Lop varchar(45),
GT varchar(45)
);
create table giao_vien(
MaGV int auto_increment primary key,
TenGV varchar(45),
SDT varchar(45)
);
create table mon_hoc(
MaMH int auto_increment primary key,
TenMH varchar(45),
MaGV int, foreign key(MaGV) references giao_vien(MaGV)
);
create table bang_diem(
MaHS int ,foreign key (MaHS) references hoc_sinh(MaHS),
MaMH int, foreign key (MaMH) references mon_hoc(MaMH),
PRIMARY KEY (MaHS, MaMH),
DiemThi int,
NgayKT date
);