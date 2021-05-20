use case_study_db;

-- task 19
-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần
--  trong năm 2019 lên gấp đôi.
SET SQL_SAFE_UPDATES = 0;
update dich_vu_di_kem
set gia = gia *2
where id_dich_vu_di_kem in (select a.id from 
			( select dvdk.id_dich_vu_di_kem as id , sum(hdct.so_luong) as so_lan_su_dung
            from dich_vu_di_kem dvdk
            join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
            group by dvdk.id_dich_vu_di_kem 
            having so_lan_su_dung > 10) as a );


-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống,
--  thông tin hiển thị bao gồm
--  ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

-- select nv.id_nhan_vien,nv.ho_ten,nv.ngay_sinh,nv.email,nv.SDT,nv.dia_chi,
-- kh.id_khach_hang,kh.ho_ten,kh.ngay_sinh,kh.SDT,kh.dia_chi
-- from nhan_vien nv
-- left join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
-- right join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang;

select nv.id_nhan_vien as id_nv,nv.ho_ten,nv.email,nv.sdt,nv.ngay_sinh,nv.dia_chi, 1 as `type`
from nhan_vien nv
union all
select kh.id_khach_hang as id_kh,kh.ho_ten,kh.so_CMTND,kh.sdt,kh.ngay_sinh,kh.dia_chi, 0 as `type`
from khach_hang kh;


