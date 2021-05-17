use case_study_db;

-- task 13
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm 
-- được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select dvdk.id_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem,
dvdk.gia,dvdk.donVi,dvdk.trang_thai_kha_dung,
 sum(hdct.so_luong)  as 'so_lan_su_dung'
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
group by dvdk.ten_dich_vu_di_kem,dvdk.id_dich_vu_di_kem
having so_lan_su_dung >= all (select  sum(hop_dong_chi_tiet.so_luong) 
				from hop_dong_chi_tiet
                group by id_dich_vu_di_kem
				);



-- Để thêm thông tin để kiểm tra cho dễ á Tiến.
select kh.id_khach_hang,kh.ho_ten,dvdk.ten_dich_vu_di_kem,
dvdk.gia,dvdk.donVi,dvdk.trang_thai_kha_dung,
count(dvdk.id_dich_vu_di_kem) as 'so_lan_su_dung'
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
join hop_dong hd on hdct.id_hop_dong = hd.id_hop_dong
join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
group by dvdk.ten_dich_vu_di_kem
having so_lan_su_dung >= all (select count(id_dich_vu_di_kem)
				from hop_dong_chi_tiet
                group by id_dich_vu_di_kem
				);




-- task 14
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select hd.id_hop_dong,ldv.ten_loai_dich_vu,dvdk.ten_dich_vu_di_kem,
count(dvdk.id_dich_vu_di_kem) as "so_lan_su_dung"
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
join hop_dong hd on hdct.id_hop_dong = hd.id_hop_dong
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
group by dvdk.ten_dich_vu_di_kem
having so_lan_su_dung = 1;

-- task 15
-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm 
-- IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai,
--  DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select nv.id_nhan_vien,nv.ho_ten,td.trinh_do,bp.ten_bo_phan,nv.SDT,nv.dia_chi,
count(hd.id_hop_dong) as "so_lan_lam_hd"
from nhan_vien nv
join bo_phan bp on nv.id_bo_phan = bp.id_bo_phan
join trinh_do td on nv.id_trinh_do = td.id_trinh_do
join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
where year(hd.ngay_lam_hop_dong) between 2018 and 2019
group by nv.id_nhan_vien
having so_lan_lam_hd <= 3;






