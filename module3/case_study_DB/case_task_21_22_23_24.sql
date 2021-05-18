use case_study_db;
-- task 21
-- 21.	Tạo khung nhìn có tên là V_NHANVIEN
--  để lấy được thông tin của tất cả các nhân viên
--  có địa chỉ là “Hải Châu” và đã từng lập hợp đồng cho 1 hoặc nhiều Khách hàng 
--  bất kỳ  với ngày lập hợp đồng là “12/12/2019”

create view v_nhan_vien as
select nv.id_nhan_vien,nv.ngay_sinh,nv.dia_chi,nv.so_CMTND,nv.SDT,nv.email,nv.luong
from nhan_vien nv
join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
where nv.dia_chi = "Hai Chau" and hd.ngay_lam_hop_dong = "2019/12/12";

select * from v_nhan_vien;

--  task 22
-- 22.Thông qua khung nhìn V_NHANVIEN 
-- thực hiện cập nhật địa chỉ thành “Liên Chiểu” 
-- đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.

update v_nhan_vien
set dia_chi = "Lien Chieu";

-- task 23
-- 23.Tạo Store procedure Sp_1
--  Dùng để xóa thông tin của một Khách hàng nào đó
--  với Id Khách hàng được truyền vào như là 1 tham số của Sp_1

delimiter //
create procedure sp_1(p_id int)
begin
delete from khach_hang
where id_khach_hang = p_id;
end; //
delimiter ;

-- task 24
-- 24.	Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong
--  với yêu cầu Sp_2 phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, 
--  với nguyên tắc không được trùng khóa chính 
--  và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.

delimiter //
create procedure sp_2(p_id_nv int,p_id_kh int ,p_id_dv int,p_ngay_lam_hd varchar(45),
p_ngay_ket_thuc varchar(45),p_tien_dat_coc float)
begin
insert hop_dong (id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc)
values (p_id_nv,p_id_kh,p_id_dv,p_ngay_lam_hd,p_ngay_ket_thuc,p_tien_dat_coc);
end; //
delimiter ;


