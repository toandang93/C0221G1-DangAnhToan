use case_study_db;

-- task_6 .Đọc đề chưa rõ lắm Tiến ơi nên phải làm 2 câu.

-- Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện 
-- đặt *TỪ* quý 1 của năm 2019
--  (Quý 1 là tháng 1, 2, 3).
select dv.id_dich_vu,dv.ten_dich_vu,dv.dien_tich,
dv.chi_phi_thue,ldv.ten_loai_dich_vu
from dich_vu dv 
join loai_dich_vu ldv on dv.id_loai_dich_vu= ldv.id_loai_dich_vu
join hop_dong hd on hd.id_dich_vu=dv.id_dich_vu
where dv.id_dich_vu not in (select hop_dong.id_dich_vu
						from hop_dong
                        where (year(ngay_lam_hop_dong) >= 2019));

-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện 
-- đặt *TRONG* quý 1 của năm 2019
--  (Quý 1 là tháng 1, 2, 3).
select dv.id_dich_vu,dv.ten_dich_vu,dv.dien_tich,
dv.chi_phi_thue,ldv.ten_loai_dich_vu
from dich_vu dv 
join loai_dich_vu ldv on dv.id_loai_dich_vu= ldv.id_loai_dich_vu
join hop_dong hd on hd.id_dich_vu=dv.id_dich_vu
where dv.id_dich_vu not in (select hop_dong.id_dich_vu
			from hop_dong 
			where (year(ngay_lam_hop_dong)=2019) and (month(ngay_lam_hop_dong) in (1,2,3))
                       );



-- task_7
-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa,
--  ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ
--  đã từng được Khách hàng đặt phòng trong năm 2018
--  nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select dv.id_dich_vu,dv.ten_dich_vu,
dv.dien_tich,dv.so_nguoi_toi_da,dv.chi_phi_thue,
hd.ngay_lam_hop_dong,
ldv.ten_loai_dich_vu
from dich_vu dv
join loai_dich_vu ldv on dv.id_loai_dich_vu= ldv.id_loai_dich_vu
join hop_dong hd on hd.id_dich_vu=dv.id_dich_vu
where year(ngay_lam_hop_dong)=2018 
	and not exists (select hd.ngay_lam_hop_dong
					from hop_dong
					where year(ngay_lam_hop_dong) = 2019
					and hd.id_dich_vu= id_dich_vu)
group by dv.id_dich_vu;                    

-- task_8
-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống,
--  với yêu cầu HoThenKhachHang không trùng nhau.
-- cách 1
select kh.ho_ten 
from khach_hang kh
group by kh.ho_ten;

-- cách 2
select distinct kh.ho_ten
from khach_hang kh;

-- cách 3
select kh.ho_ten
from khach_hang kh
union select kh.ho_ten
from khach_hang kh;

-- cách 4
select distinctrow kh.ho_ten
from khach_hang kh;

-- task 9
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select month(hd.ngay_lam_hop_dong) as 'Month', count(hd.id_khach_hang),
sum(dv.chi_phi_thue + hdct.so_luong*dvdk.gia) as tong_tien
from khach_hang kh 
left join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach
left join hop_dong hd  on kh.id_khach_hang = hd.id_khach_hang
left join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
left join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by month(hd.ngay_lam_hop_dong);

select month(hd.ngay_lam_hop_dong) as 'thang' , count(hd.id_khach_hang) as 'so_luong_dat',
sum(dv.chi_phi_thue + hdct.so_luong*dvdk.gia) as 'tong_tien'
from hop_dong hd 
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
where year(ngay_lam_hop_dong)=2019
group by 'thang';






