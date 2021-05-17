use case_study_db;
-- task_2
select *
from nhan_vien
where ((ho_ten like 'H%') or (ho_ten like 'K%') or (ho_ten like 'T%')) and length(ho_ten)<=15;

-- task_3
select *
from khach_hang
where (year(curdate()) - year(ngay_sinh) between 18 and 50) and (dia_chi in ("Da Nang","Quang Tri"));

-- task_4
select kh.id_khach_hang,kh.ho_ten,count(hd.id_hop_dong)
from khach_hang kh 
join hop_dong hd
on kh.id_khach_hang=hd.id_khach_hang
where kh.id_loai_khach = 1
group by kh.ho_ten
order by count(hd.id_hop_dong) ASC;

-- IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem
-- task_5
select kh.id_khach_hang,kh.ho_ten,lk.ten_loai_khach_hang,
hd.id_hop_dong,dv.ten_dich_vu,hd.ngay_lam_hop_dong,hd.ngay_ket_thuc,
sum(dv.chi_phi_thue + hdct.so_luong*dvdk.gia) as tong_tien
from khach_hang kh 
left join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach
left join hop_dong hd  on kh.id_khach_hang = hd.id_khach_hang
left join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
left join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by kh.id_khach_hang,hd.id_hop_dong,tong_tien;


