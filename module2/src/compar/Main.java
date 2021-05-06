package compar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh("Binh",18);
        HocSinh hocSinh1 = new HocSinh("Huan",20);
        HocSinh hocSinh3 = new HocSinh("An",20);
        HocSinh hocSinh4 = new HocSinh("Binh",19);

        List<HocSinh> hocSinhList = new ArrayList<>();
        hocSinhList.add(hocSinh);
        hocSinhList.add(hocSinh1);
        hocSinhList.add(hocSinh3);
        hocSinhList.add(hocSinh4);

        Collections.sort(hocSinhList,new SoSanhTuoi());

        for (HocSinh hocSinh2 : hocSinhList ){
            System.out.println(hocSinh2.toString());
        }
    }
}
