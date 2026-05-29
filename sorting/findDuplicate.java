package sorting;

public class findDuplicate {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i]!=i+1){
                int correct = arr[i];
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
    
}
