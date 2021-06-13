package model.repository;

import model.bean.Class;
import model.bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    BaseRepository baseRepository = new BaseRepository();
    public StudentRepository() {
    }

    private final String SELECT_ALL_STUDENT = "select * from student;";
    private final String SELECT_ALL_CLASS = "select * from class;";
    private final String INSERT_STUDENT = "insert into student(name_student,age_student,id_class)\n" +
            "values(?,?,?);";

    public List<Student> findAllStudent(){
        List<Student> studentList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id_student");
                String name = resultSet.getString("name_student");
                int age = resultSet.getInt("age_student");
                int idClass = resultSet.getInt("id_class");
                Student student = new Student(id,name,age,idClass);
                studentList.add(student);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }
    public List<Class> findAllClass(){
        List<Class> classList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CLASS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id_class");
                String name = resultSet.getString("name_class");
                Class classsss = new Class(id,name);
                classList.add(classsss);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classList;
    }
}
