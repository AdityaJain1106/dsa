package linearsearch;

public class searchInRange {
    
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int start = 1;
        int end = 6;
        int ans = linearSearch(nums, target,start,end);
        System.out.println(ans);
    }
    
}
