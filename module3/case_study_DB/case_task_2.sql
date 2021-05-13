use case_study_db;
-- task_2
select *
from nhan_vien
where (hoTen like 'H%' or 'K%' or 'T%') and length(hoTen)<=15;
-- task_3
select *
from khach_hang
where (year(curdate()) - year(NgaySinh) between 18 and 50) and (DiaChi in ("Da Nang","Quang Tri"));
-- task_4

