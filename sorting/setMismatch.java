package sorting;

public class setMismatch {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] setMismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //serch for missing number and its index
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return new int[]{index+1,arr[index]};
            }
        }

        return new int[]{-1,-1} ;
    }
    public static void main(String[] args) {
        
    }
}
