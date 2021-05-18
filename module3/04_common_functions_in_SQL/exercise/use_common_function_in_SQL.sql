use quan_ly_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * 
from `subject` s 
group by s.subject_id
having s.credit >= all (select s.credit
				from `subject` s
				group by s.subject_id);
                
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.   
select s.subject_id,s.name,m.Mark
from `subject` s
join mark m on s.subject_id = m.subject_id
group by s.subject_id , s.name
having m.Mark >= all(select m.Mark
				from mark m
                );     
                
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên,
--  xếp hạng theo thứ tự điểm giảm dần   
select s.student_id,s.name, avg(m.Mark)
from student s 
left join mark m on s.student_id = m.student_id
group by s.student_id,s.name 
order by avg(m.Mark) desc;            