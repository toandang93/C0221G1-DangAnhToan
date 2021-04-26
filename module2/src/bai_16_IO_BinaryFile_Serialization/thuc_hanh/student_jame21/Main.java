package bai_16_IO_BinaryFile_Serialization.thuc_hanh.student_jame21;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) throws IOException {
      try{
          FileOutputStream fos = new FileOutputStream(path);
          ObjectOutputStream oos = new ObjectOutputStream(fos);
          oos.writeObject(students);
          oos.close();
          fos.close();
      }catch (IOException e){
          e.printStackTrace();
      }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis= new FileInputStream(path);
            ObjectInputStream ois= new ObjectInputStream(fis);
           students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(01,"Đặng Anh Toàn","ĐN"));
        students.add(new Student(02,"Lê Khánh Hà","QB"));
        students.add(new Student(03,"Phan Gia Khánh","Sơn Trà"));
        students.add(new Student(04,"Dương Thanh Hậu","JP"));
        writeToFile("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }

    }
}
