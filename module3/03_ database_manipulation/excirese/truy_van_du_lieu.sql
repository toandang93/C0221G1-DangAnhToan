use quan_ly_sinh_vien;
select * from student
where StudentName like 'h%';
select * from class 
where month(StarDate)=12;
select * from subject
where Credit between 3 and 5;
SET SQL_SAFE_UPDATES = 0;
update student
set ClassID = 2
where StudentName = "Hung";
select * from student;
-- Hiển thị các thông tin: StudentName, SubName, Mark. 
-- Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần
select StudentName,SubName,Mark
