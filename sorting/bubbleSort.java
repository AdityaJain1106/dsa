package sorting;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] arr={3,4,2,5,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]arr){
        boolean swapped;

        //run the steps n-1 time
        for (int i = 0; i < arr.length-1; i++) {
            swapped=false;
            //for each step max item will come at the last respective index
            for (int j = 1; j <= arr.length-i-1; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
  
                    //if swap is taking place
                    swapped=true;
                }
            }
            //if u did not swap for a particular value of i it means array is sorted hence stop the program
            if(!swapped){//swapped==false
                break;
            }
        }
    }
    
}
