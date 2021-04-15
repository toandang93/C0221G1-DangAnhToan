package bai_11_collectionFarmword.thuc_hanh.sap_xep_voi_Comparable_va_Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }

}
