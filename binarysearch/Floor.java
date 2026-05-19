package binarysearch;

public class Floor {

    //return the smallest number <=target
    static int floor(int[] nums, int target) {

        //but what if the target is the samller then the smallest number in the arrray
        if (target < nums[0]) {
            return -1;
        }

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
        return end;
    }

    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(floor(arr, target));

    }

}
