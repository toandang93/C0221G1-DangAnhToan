create database if not exists case_study_DB;
use case_study_DB;

create table vi_tri(
IDviTri int auto_increment primary key,
TenViTri varchar(45)
);
create table trinh_do(
IDtrinhDo int auto_increment primary key,
TrinhDo varchar(45)
);
create table bo_phan(
IDboPhan int auto_increment primary key,
TenBoPhan varchar(45)
);
create table nhan_vien(
IDnhanVien int auto_increment primary key,
hoTen varchar(45),
IDviTri int, foreign key (IDviTri) references vi_tri(IDviTri),
IDtrinhDo int,foreign key (IDtrinhDo) references trinh_do(IDtrinhDo),
IDboPhan int ,foreign key (IDboPhan) references bo_phan(IDboPhan),
NgaySinh date,
SoCMTND varchar(45),
Luong varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45)
);
alter table nhan_vien
modify column SoCMTND varchar(45) unique;

create table dich_vu_di_kem(
IDdichVuDiKem int auto_increment primary key,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45)
);
create table hop_dong(
IDhopDong int auto_increment primary key,
IDnhanVien int,foreign key (IDnhanVien) references nhan_vien(IDnhanVien),
IDkhachHang int,foreign key (IDkhachHang) references khach_hang(IDkhachHang),
IDdichVu int, foreign key (IDdichVu) references dich_vu(IDdichVu),
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int
);
create table hop_dong_chi_tiet(
IDhopDongChiTiet int auto_increment primary key,
IDhopDong int, foreign key(IDhopDong) references hop_dong(IDhopDong),
IDdichVuDiKem int, foreign key(IDdichVuDiKem) references dich_vu_di_kem(IDdichVuDiKem),
Soluong int
);

create table khach_hang(
IDkhachHang int auto_increment primary key,
IDloaiKhach int, foreign key (IDloaiKhach) references loai_khach(IDloaiKhach),
HoTen varchar(45),
NgaySinh date,
SoCMTND varchar(45),
SDT varchar(45),
DiaChi varchar(45)
);
alter table khach_hang
modify column SoCMTND varchar(45) unique;
create table loai_khach(
IDloaiKhach int auto_increment primary key,
TenLoaiKhachHang varchar(45)
);
create table dich_vu(
IDdichVu int auto_increment primary key,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IDkieuThue int, foreign key (IDkieuThue) references kieu_thue(IDkieuThue),
IDloaiDichVu int, foreign key (IDloaiDichVu) references loai_dich_vu(IDloaiDichVu),
TrangThai varchar(45)
);
create table kieu_thue(
IDkieuThue int auto_increment primary key,
TenKieuThue varchar(45),
Gia int
);
create table loai_dich_vu(
IDloaiDichVu int auto_increment primary key,
TenLoaiDichVu varchar(45)
);

insert into khach_hang(HoTen,NgaySinh,SoCMTND,SDT,DiaChi)
values ("Dang Toan","1993/09/18",222999887,0908333222,"Da Nang"),
("Duong Thinh","1998/07/18",234876345,0222123854,"Quang Tri"),
("Huynh Tan","1995/06/18",123098324,0333867534,"Hue");
SET SQL_SAFE_UPDATES = 0;

select * from khach_hang;
insert into trinh_do(Trinhdo)
values ("Trung Cap"),
("Cao Dang"),
("Dai Hoc"),
("Sau Dai Hoc");
insert into vi_tri(TenViTri)
values ("Le Tan"),
("Phuc Vu"),
("Chuyen Vien"),
("Giam Sat"),
("Quan Ly"),
("Giam Doc");
insert into bo_phan(TenBoPhan)
values ("Sale-Marketing"),
("Hanh Chinh"),
("Phuc Vu"),
("Quan Ly");
insert into loai_khach(TenLoaiKhachHang)
values ("Diamond"),
("Platinium"),
("Gold"),
("Silver"),
("Member");
select * from loai_khach;
insert into kieu_thue(TenKieuThue,Gia)
values ("Nam",1200),
("Thang",150),
("Ngay",10),
("Gio",2);
select * from kieu_thue;
insert into nhan_vien(hoTen,NgaySinh,SoCMTND,Luong,SDT,Email,DiaChi)
values ("Huynh Tan Khoa","1999/12/05",345212345,800,0909111123,"dathuynh@gmail.com","Quang Tri"),
("Truong Cong Tuan","1995/12/09",256765888,800,0909111123,"tuantruong@gmail.com","Da Nang"),
("Nguyen Quoc Huy","1990/12/05",137564222,800,0909111123,"huynguyen@gmail.com","Quang Tri");
update nhan_vien
set IDviTri = 4 , IDtrinhDo = 3,IDboPhan = 4
where IDnhanVien = 3;
select * from nhan_vien;
-- massage, karaoke, thức ăn, nước uống
insert into dich_vu_di_kem(TenDichVuDiKem,Gia)
values ("massage",50),
("karaoke",50),
("thuc an",10),
("thuc uong",5);
insert into loai_dich_vu(TenLoaiDichVu)
values ("Binh dan"),
("Trung cap"),
("Cao cap");
update dich_vu
set IDloaiDichVu = 3
where IDdichVu = 3;

insert into dich_vu(TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDkieuThue,IDloaiDichVu)
values 
("House",40,2,6,200,3,2),
("Room",40,0,4,100,1,2);
select * from dich_vu;
insert into hop_dong(IDnhanVien,IDkhachHang,IDdichVu,NgayLamHopDong,NgayKetThuc,TienDatCoc,TongTien)
values (1,1,4,"2020/10/12","2020/10/15",100,250),
(2,2,5,"2020/11/10","2020/11/15",120,300);
select * from hop_dong_chi_tiet;
insert into hop_dong_chi_tiet(IDhopDong,IDdichVuDiKem,Soluong)
values (3,1,2),
(4,2,2);







