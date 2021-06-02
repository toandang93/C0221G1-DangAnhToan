create database if not exists case_study_DB;
use case_study_DB;

create table vi_tri(
id_vi_tri int auto_increment primary key,
ten_vi_tri varchar(45)
);
create table trinh_do(
id_trinh_do int auto_increment primary key,
trinh_do varchar(45)
);
create table bo_phan(
id_bo_phan int auto_increment primary key,
ten_bo_phan varchar(45)
);
create table nhan_vien(
id_nhan_vien int auto_increment primary key,
ho_ten varchar(45),
id_vi_tri int, foreign key (id_vi_tri) references vi_tri(id_vi_tri),
id_bo_phan int,foreign key (id_bo_phan) references bo_phan(id_bo_phan),
id_trinh_do int ,foreign key (id_trinh_do) references trinh_do(id_trinh_do),
ngay_sinh date,
so_CMTND varchar(45),
luong varchar(45),
SDT varchar(45),
email varchar(45),
dia_chi varchar(45)
);

create table dich_vu_di_kem(
id_dich_vu_di_kem int auto_increment primary key,
ten_dich_vu_di_kem varchar(45),
gia int,
donVi int,
trang_thai_kha_dung varchar(45)
);
create table hop_dong(
id_hop_dong int auto_increment primary key,
id_nhan_vien int,foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),
id_khach_hang int,foreign key (id_khach_hang) references khach_hang(id_khach_hang),
id_dich_vu int, foreign key (id_dich_vu) references dich_vu(id_dich_vu),
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int
);
create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int auto_increment primary key,
id_hop_dong int, 
id_dich_vu_di_kem int,
so_luong int,
foreign key(id_hop_dong) references hop_dong(id_hop_dong),
foreign key(id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem)
);

create table khach_hang(
id_khach_hang int auto_increment primary key,
id_loai_khach int, foreign key (id_loai_khach) references loai_khach(id_loai_khach),
ho_ten varchar(45),
ngay_sinh date,
so_CMTND varchar(45),
SDT varchar(45),
dia_chi varchar(45)
);
alter table khach_hang
add gioi_tinh varchar(45),
add email varchar(45);

create table loai_khach(
id_loai_khach int auto_increment primary key,
ten_loai_khach_hang varchar(45)
);
create table dich_vu(
id_dich_vu int auto_increment primary key,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar(45),
id_kieu_thue int, foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue),
id_loai_dich_vu int, foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
trang_thai varchar(45)
);
create table kieu_thue(
id_kieu_thue int auto_increment primary key,
ten_kieu_thue varchar(45),
gia int
);
create table loai_dich_vu(
id_loai_dich_vu int auto_increment primary key,
ten_loai_dich_vu varchar(45)
);

insert into khach_hang(id_loai_khach,ho_ten,ngay_sinh,so_CMTND,SDT,dia_chi)
values (1,"Dang Toan","1993/09/18",222999887,0908333222,"Da Nang"),
(2,"Duong Thinh","1998/07/18",234876345,0222123854,"Quang Tri"),
(3,"Huynh Tan","1995/06/18",123098324,0333867534,"Hue"),
(4,"Tran Yen","1999/09/18",325654345,0575424234,"Hoi An"),
(5,"Trinh Cong Son","1997/07/18",754253564,0122354642,"Vinh"),
(4,"Nguyen Thang","1989/06/18",856345236,0333456234,"Quang Binh"),
(1,"Nguyen Hung","2000/09/18",347543763,0866789987,"Da Nang"),
(2,"Ronaldo","1992/07/18",346754231,0983456654,"Quang Tri"),
(3,"Ziddans","1991/06/18",235764322,0675234432,"Hue");

SET SQL_SAFE_UPDATES = 0;

select * from khach_hang;
insert into trinh_do(trinh_do)
values ("Trung Cap"),
("Cao Dang"),
("Dai Hoc"),
("Sau Dai Hoc");
insert into vi_tri(ten_vi_tri)
values ("Le Tan"),
("Phuc Vu"),
("Chuyen Vien"),
("Giam Sat"),
("Quan Ly"),
("Giam Doc");
insert into bo_phan(ten_bo_phan)
values ("Sale-Marketing"),
("Hanh Chinh"),
("Phuc Vu"),
("Quan Ly");
insert into loai_khach(ten_loai_khach_hang)
values ("Diamond"),
("Platinium"),
("Gold"),
("Silver"),
("Member");
select * from loai_khach;
insert into kieu_thue(ten_kieu_thue,gia)
values ("Nam",1200),
("Thang",150),
("Ngay",10),
("Gio",2);
select * from kieu_thue;
insert into nhan_vien(ho_ten,id_vi_tri,id_bo_phan,id_trinh_do,ngay_sinh,so_CMTND,luong,SDT,email,dia_chi)
values ("Huynh Tan Khoa",1,1,1,"1999/12/05",345212345,800,0909111123,"dathuynh@gmail.com","Quang Tri"),
("Truong Cong Tuan",2,2,2,"1995/12/09",256765888,800,0909111123,"tuantruong@gmail.com","Da Nang"),
("Nguyen Quoc Huy",3,3,3,"1990/12/05",137564222,800,0909111123,"huynguyen@gmail.com","Quang Tri");

select * from nhan_vien;
-- massage, karaoke, thức ăn, nước uống
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia)
values ("massage",50),
("karaoke",50),
("thuc an",10),
("thuc uong",5);

insert into loai_dich_vu(ten_loai_dich_vu)
values ("Binh dan"),
("Trung cap"),
("Cao cap");

update dich_vu
set IDloaiDichVu = 3
where IDdichVu = 3;

insert into dich_vu(ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
values ("Villa",40,3,10,200,3,2,"day"),
("House",30,2,6,200,3,2,"day"),
("Room",20,0,4,100,1,2,"day"),
("Villa",40,4,14,250,3,1,"trong"),
("House",30,2,6,200,3,2,"trong"),
("Room",20,0,4,100,1,1,"trong");

insert into hop_dong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,tong_tien)
values (1,1,1,"2020/10/12","2020/10/15",100,0),
(2,2,2,"2020/11/10","2020/11/15",120,0),
(3,1,1,"2018/10/12","2019/10/15",150,0),
(2,3,2,"2009/11/10","2009/11/15",150,0),
(1,4,1,"2012/10/12","2013/10/15",100,0),
(3,5,2,"2017/11/10","2018/11/15",120,0);

insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)
values (1,1,2),
(2,2,3),
(3,3,2),
(4,4,3),
(5,2,2);










