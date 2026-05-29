package sorting;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<Integer> findDuplicates(int[] arr){
         int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(index+1);
            }
        }
        return ans;
    } 
    public static void main(String[] args) {
        
    }
}