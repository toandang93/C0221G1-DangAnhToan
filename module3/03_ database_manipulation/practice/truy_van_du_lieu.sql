use quan_ly_sinh_vien;
SELECT * FROM quan_ly_sinh_vien.student;
SELECT *
FROM Student;
SELECT *
FROM Student
WHERE Status = true;
SELECT *
FROM Subject
WHERE Credit < 6;
SELECT S.student_id, S.name, C.class_name
FROM Student S join Class C on S.class_id = C.class_id;
SELECT S.student_id, S.name, C.class_name
FROM Student S join Class C on S.class_id = C.class_id
WHERE C.class_name = 'A1';
SELECT S.student_id, S.name, Sub.name, M.Mark
FROM Student S join Mark M on S.student_id = M.student_id join Subject Sub on M.subject_id = Sub.subject_id;
SELECT S.student_id, S.name, Sub.name, M.Mark
FROM Student S join Mark M on S.student_id = M.student_id join Subject Sub on M.subject_id = Sub.subject_id
WHERE Sub.name = 'CF';