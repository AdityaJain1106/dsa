import java.util.*;

public class swaparr {
    static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void max(int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element in the array is: " + max);
        
    }
    public static void main(String[] args) {
        int [] arr= {1, 2, 3, 4, 5};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
        max(arr);
    }
    
}
