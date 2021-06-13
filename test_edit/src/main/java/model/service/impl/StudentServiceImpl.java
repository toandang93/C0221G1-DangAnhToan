package model.service.impl;

import model.bean.Class;
import model.bean.Student;
import model.repository.StudentRepository;
import model.service.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAllStudent();
    }

    @Override
    public List<Class> findAllClass() {
        return studentRepository.findAllClass();
    }
}
