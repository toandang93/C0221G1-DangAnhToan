package compar;

import java.util.Comparator;

public class SoSanhTuoi implements Comparator<HocSinh> {
    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        return o1.getTuoi()-o2.getTuoi();
    }
}
