use case_study_db;

-- task 16
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.					
SET FOREIGN_KEY_CHECKS=0;
SET SQL_SAFE_UPDATES = 0;
delete from nhan_vien
 where  id_nhan_vien not in (
						 select id_nhan_vien
						 from hop_dong 
						 where year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019
                         );
SET FOREIGN_KEY_CHECKS=1;                         

                   
-- task 17
-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
--  chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán
--  trong năm 2019 là lớn hơn 10.000.000 VNĐ.      

update khach_hang 
set id_loai_khach = 1
where (id_loai_khach = 2)
and id_khach_hang in (select a.id from (select hd.id_khach_hang as id,
		sum(dv.chi_phi_thue + hdct.so_luong*dvdk.gia) as tong_tien
        from hop_dong hd
        join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
        join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
        join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
        where year(hd.ngay_lam_hop_dong)=2019
        group by id
        having tong_tien > 300 ) as a	  	);           


-- task 18
-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).
SET SQL_SAFE_UPDATES = 0;
delete from khach_hang 
where id_khach_hang in (select id_khach_hang
		from hop_dong 
        where year(ngay_lam_hop_dong)<2016 );












                         
                        
                         
						                      