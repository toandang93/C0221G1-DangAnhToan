use case_study_db;

-- task 25
-- 25.	Tạo triggers có tên Tr_1 Xóa bản ghi trong bảng HopDong
--  thì hiển thị tổng số lượng bản ghi còn lại có trong bảng HopDong
--  ra giao diện console của database

-- C:/ProgramData/MySQL/MySQL Server 8.0/Uploads
-- select "message display" as log into outfile 'đường_dẫn_ở_bước_1.b/log.txt';
drop trigger tr_1;
drop trigger tr_2;
delimiter //
create trigger tr_1 
after delete on hop_dong for each row
begin
	declare variable int;
	set variable  = (select count(*) from hop_dong) ;
    select concat("số lượng bản ghi còn lại là ",variable)
    as log into outfile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/toan.txt';
end; //
delimiter ;    

-- delimiter //
-- create trigger tr_2
-- after delete on hop_dong for each row
-- begin
-- 	set @variable  = (select count(*) from hop_dong) ;
--     select concat("số lượng bản ghi còn lại là ",@variable) as log
--     into outfile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/toannnn.txt';
-- end; //
-- delimiter ;    

delete from hop_dong
where id_hop_dong = 12;	


-- task 26
-- 26.	Tạo triggers có tên Tr_2 Khi cập nhật Ngày kết thúc hợp đồng,
--  cần kiểm tra xem thời gian cập nhật có phù hợp hay không,
--  với quy tắc sau: Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày.
--  Nếu dữ liệu hợp lệ thì cho phép cập nhật, 
--  nếu dữ liệu không hợp lệ thì in ra thông báo 
--  “Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày” trên console của database
    
    
delimiter //
create trigger tr_2
before update on hop_dong for each row
begin
	if datediff(ngay_ket_thuc,old.ngay_lam_hop_dong) <= 2 then
		select "cập nhật thành công" as log into outfile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/toan_tr2.txt';
    else
		SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày';
	end if;
end; //
delimiter ;    
    


	





