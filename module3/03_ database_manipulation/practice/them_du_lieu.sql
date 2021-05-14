use quan_ly_sinh_vien;
INSERT INTO class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO class
VALUES (3, 'B3', current_date, 0);
INSERT INTO student (`name`,address,phone,`Status`,class_id)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO student (`name`,address,phone,`Status`,class_id)
VALUES ('Hoa', 'Hai phong','0912432888', 1, 1);
INSERT INTO student (`name`,address,phone,`Status`,class_id)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);
INSERT INTO subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
INSERT INTO mark (subject_id,student_id,Mark)
VALUES (1, 1, 1),
       (2, 2, 2),
       (1, 3, 1);       