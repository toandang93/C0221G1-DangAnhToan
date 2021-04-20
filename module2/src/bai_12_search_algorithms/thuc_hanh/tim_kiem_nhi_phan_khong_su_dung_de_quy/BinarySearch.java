package bai_12_search_algorithms.thuc_hanh.tim_kiem_nhi_phan_khong_su_dung_de_quy;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch(int[] list, int key) {
        int left = 0;
        int right = list.length - 1;
        int mid ;
        while (left <= right){
            mid = (left + right) / 2;
            if(key == list[mid]){
                return mid;
            }else if(key > list[mid]){
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,10));;
    }
}
