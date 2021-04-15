package bai_11_collectionFarmword.thuc_hanh.sap_xep_voi_Comparable_va_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1= new Student("Toàn",18,"DN");
        Student student2= new Student("Hà",17,"HN");
        Student student3= new Student("Khanh",22,"Vinh");
        Student student4= new Student("Cương",14,"HCM");
        Student student5= new Student("Khánh",18,"DN");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
//        studentArrayList.sort(new AgeComparator());
        Collections.sort(studentArrayList,new AgeComparator());
        System.out.println(studentArrayList);
        System.out.println();
        for (Student temp : studentArrayList){
            System.out.println(temp);
        }
    }
}
