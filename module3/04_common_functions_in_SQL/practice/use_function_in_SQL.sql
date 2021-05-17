use quan_ly_sinh_vien;

select student.address , count(student.student_id)
from student
group by student.address;

select student.student_id, student.name, avg(mark.Mark)
from student
join mark on student.student_id = mark.student_id
group by student.student_id;

select s.student_id,s.name,avg(m.Mark)
from student s
join mark m on s.student_id = m.student_id
group by s.student_id
having avg(m.Mark) > 15;

select s.student_id,s.name,avg(m.Mark)
from student s
join mark m on s.student_id = m.student_id
group by s.student_id
having avg(m.Mark) >= all (select avg(m.mark) 
			from mark m 
			group by m.student_id);



