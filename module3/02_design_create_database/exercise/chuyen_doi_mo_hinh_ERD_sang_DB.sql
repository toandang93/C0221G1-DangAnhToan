create database quan_ly_vat_tu;
use quan_ly_vat_tu;
-- vì số điện thoại là trường thuộc tính đa trị(đề yêu cầu) nên tách ra 1 bảng
create table so_dien_thoai(
id_so_dien_thoai int auto_increment primary key,
so_dien_thoai varchar(30)
);
create table nha_cung_cap(
ma_nha_cung_cap int auto_increment primary key,
ten_nha_cung_cap varchar(45),
dia_chi varchar(45),
id_so_dien_thoai int,foreign key(id_so_dien_thoai) references so_dien_thoai(id_so_dien_thoai)
);
create table don_dat_hang(
ma_don_dat_hang int auto_increment primary key,
ma_nha_cung_cap int,
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap),
ngay_dat_hang date
);

create table don_dat_hang_chi_tiet(
ma_don_dat_hang int,foreign key (ma_don_dat_hang) references don_dat_hang(ma_don_dat_hang),
ma_vat_tu int,foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
primary key(ma_don_dat_hang,ma_vat_tu)
);
create table phieu_xuat(
ma_phieu_xuat int auto_increment primary key,
ngay_xuat date
);
create table vat_tu(
ma_vat_tu int auto_increment primary key,
ten_vat_tu varchar(45)
);
create table phieu_xuat_chi_tiet(
ma_phieu_xuat int,foreign key (ma_phieu_xuat) references phieu_xuat(ma_phieu_xuat),
ma_vat_tu int,foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
don_gia_xuat int,
so_luong_xuat int,
primary key (ma_phieu_xuat,ma_vat_tu)
);

create table phieu_nhap(
ma_phieu_nhap int auto_increment primary key,
ngay_nhap date
);
create table phieu_nhap_chi_tiet(
ma_phieu_nhap int,foreign key (ma_phieu_nhap) references phieu_nhap(ma_phieu_nhap),
ma_vat_tu int,foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
don_gia_nhap int,
so_luong_nhap int,
primary key (ma_phieu_nhap,ma_vat_tu)
);

