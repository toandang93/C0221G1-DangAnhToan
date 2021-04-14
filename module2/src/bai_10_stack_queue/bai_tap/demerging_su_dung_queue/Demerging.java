package bai_10_stack_queue.bai_tap.demerging_su_dung_queue;

import java.util.*;

public class Demerging {
    public static void main(String[] args) {


        Queue<Object> queueMen = new LinkedList<>();
        Queue<Object> queueWomen = new LinkedList<>();
        List<HocSinh> listHocSinh = new ArrayList<>();
        HocSinh hocSinh1 = new HocSinh("Toan", "men", 1993);
        HocSinh hocSinh2 = new HocSinh("Phu", "men", 2000);
        HocSinh hocSinh3 = new HocSinh("Huy", "women", 2001);
        HocSinh hocSinh4 = new HocSinh("Ha", "women", 1996);
        HocSinh hocSinh5 = new HocSinh("Ha", "men", 1999);
        listHocSinh.add(hocSinh1);
        listHocSinh.add(hocSinh2);
        listHocSinh.add(hocSinh3);
        listHocSinh.add(hocSinh4);
        listHocSinh.add(hocSinh5);
        listHocSinh.sort(new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o1.getDate() - o2.getDate();
            }
        });
        System.out.println(listHocSinh);

        for (HocSinh hocsinh : listHocSinh) {
            if(hocsinh.getGender().equals("men")){
                queueMen.add(hocsinh);
            }else {
                queueWomen.add(hocsinh);
            }
        }

        System.out.println(queueMen);
        System.out.println(queueWomen);


    }
}