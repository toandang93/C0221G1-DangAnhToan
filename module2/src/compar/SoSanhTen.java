package compar;

import java.util.Comparator;

public class SoSanhTen implements Comparator<HocSinh> {
    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        return o1.getTen().compareTo(o2.getTen());
    }
}
