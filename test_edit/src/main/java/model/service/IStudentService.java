package model.service;

import model.bean.Class;
import model.bean.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudent();
    List<Class> findAllClass();
}
