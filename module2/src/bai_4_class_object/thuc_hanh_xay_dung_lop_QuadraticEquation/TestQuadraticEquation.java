package bai_4_class_object.thuc_hanh_xay_dung_lop_QuadraticEquation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập a : ");
        float a =Float.parseFloat(scanner.nextLine());
        System.out.print("nhập b : ");
        float b =Float.parseFloat(scanner.nextLine());
        System.out.print("nhập c : ");
        float c =Float.parseFloat(scanner.nextLine());
        QuadraticEquation test = new QuadraticEquation(a,b,c);
        if(test.getDiscriminant()>=0){
            System.out.println(" hai nghiệm của phương trình là : "+test.getRoot1()+" và "+test.getRoot2());
        }else {
            System.out.println("Không có nghiệm nào");
        }
    }
}
