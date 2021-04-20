package bai_13_sorting_algorithms.bai_tap;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int index = i-1;
            while (index >= 0 && key <arr[index] ){
                arr[index+1]= arr[index];
                index--;
            }
            arr[index+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] array={4,1,3,5,6,7,3};
        insertionSort(array);
        for (int temp: array) {
            System.out.print(temp+" ");
        }
    }
}
