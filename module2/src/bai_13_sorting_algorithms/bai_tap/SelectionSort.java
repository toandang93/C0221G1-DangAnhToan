package bai_13_sorting_algorithms.bai_tap;

public class SelectionSort {
    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            int index=i;
            for (int j = i+1; j < list.length ; j++) {
                if(list[j]<list[index]){
                    index=j;
                }
            }
            int temp=list[index];
            list[index]=list[i];
            list[i]=temp;
        }
    }
}
