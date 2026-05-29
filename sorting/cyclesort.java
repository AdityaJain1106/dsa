package sorting;

import java.util.Arrays;

public class cyclesort {
    static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void cyclicSort(int[] arr){
        int i=0;
        int correct=arr[i]-1;
        while (i<arr.length) {
            if(arr[i]!=arr[correct]){
                swap(arr, i,correct);
            }else{
                i++;
            }
            
        }
    }

    public static void main(String[] args) {
        int [] arr= {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
