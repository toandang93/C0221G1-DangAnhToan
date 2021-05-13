create database quan_ly_vat_tu;
use quan_ly_vat_tu;
-- vì số điện thoại là trường thuộc tính đa trị(đề yêu cầu) nên tách ra 1 bảng
create table so_dien_thoai(
id_SDT int auto_increment primary key,
SDT varchar(30)
);
create table nha_cung_cap(
MaNhaCungCap int auto_increment primary key,
TenNhaCungCap varchar(45),
DiaChi varchar(45),
SDT int,foreign key(SDT) references so_dien_thoai(id_SDT)
);
create table don_dat_hang(
MaDonDatHang int auto_increment primary key,
NgayDatHang date
);
ALTER TABLE don_dat_hang
ADD MaNhaCungCap int;
ALTER TABLE don_dat_hang
add foreign key(MaNhaCungCap) references nha_cung_cap(MaNhaCungCap);

create table don_dat_hang_chi_tiet(
MaDonDatHang int,foreign key (MaDonDatHang) references don_dat_hang(MaDonDatHang),
MaVatTu int,foreign key (MaVatTu) references vat_tu(MaVatTu),
primary key(MaDonDatHang,MaVatTu)
);
create table phieu_xuat(
MaPhieuXuat int auto_increment primary key,
NgayXuat date
);
create table vat_tu(
MaVatTu int auto_increment primary key,
TenVatTu varchar(45)
);
create table phieu_xuat_chi_tiet(
MaPhieuXuat int,foreign key (MaPhieuXuat) references phieu_xuat(MaPhieuXuat),
MaVatTu int,foreign key (MaVatTu) references vat_tu(MaVatTu),
primary key (MaPhieuXuat,MaVatTu)
);
alter table phieu_xuat_chi_tiet
add DonGiaXuat int,
add SoLuongXuat int;
create table phieu_nhap(
MaPhieuNhap int auto_increment primary key,
NgayNhap date
);
create table phieu_nhap_chi_tiet(
MaPhieuNhap int,foreign key (MaPhieuNhap) references phieu_nhap(MaPhieuNhap),
MaVatTu int,foreign key (MaVatTu) references vat_tu(MaVatTu),
primary key (MaPhieuNhap,MaVatTu)
);
alter table phieu_nhap_chi_tiet
add DonGiaNhap int,
add SoLuongNhap int;
