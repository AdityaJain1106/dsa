package sorting;

public class firstMissingPositive {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;

            if (arr[i] <= arr.length && arr[i] > 0 && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //serch for missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > 0 && arr[index] != index+1) {
                return index+1;
            }
        }
        //case 2 - i.e. if the last number is missing
        return arr.length+1;
    }

    public static void main(String[] args) {

    }
    
}
