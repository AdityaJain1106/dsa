package linearsearch;

public class minSearchInArray {
    static int linearSearch(int[] arr) {
        int target = Integer.MAX_VALUE;
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                target = arr[i];
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ans = linearSearch(nums);
        System.out.println(ans);
    }
    
}
