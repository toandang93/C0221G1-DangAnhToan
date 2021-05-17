use case_study_db;

-- task 16
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

 delete from nhan_vien
 where  nhan_vien.id_nhan_vien not in (
 					  select nhan_vien.id_nhan_vien,hop_dong.ngay_lam_hop_dong 
 						 from nhan_vien 
						 join hop_dong  on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
						 where year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019
                         group by nhan_vien.id_nhan_vien
                         );
                         
-- khối lệnh dòng 6-11 chạy lỗi.Giải thích dùm với Tiến.Đọc lỗi dịch ra vẫn chưa hiểu 
-- chính xác được.Lỗi (Error Code: 1093. 
-- You can't specify target table 'nhan_vien' for update in FROM clause)						

delete from nhan_vien
 where  id_nhan_vien not in (
						 select id_nhan_vien
						 from hop_dong 
						 where year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019
                         );
                      
                       
                         
                        
                         
						                      