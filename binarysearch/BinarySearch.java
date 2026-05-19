package binarysearch;

public class BinarySearch {

    //return index at which target is found 
    //return -1 if the target doea not exist
    static int binarySearch(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            //int mid=(start+end)/2 -> might be possible that start+end might get out or range of the value integer can store so better to use-
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=9;
        System.out.println(binarySearch(arr, target));

    }

}
