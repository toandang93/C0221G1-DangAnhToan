package caseStudy.controllers;

import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner scanner = new Scanner(System.in);
    public static void themMoiDichVu(){
        String chon = null;
        while (true){
            System.out.println("Add new service\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    return;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("vui long chon 1-5");
            }
        }
    }
}
