package binarysearch;

public class InfiniteArray {

    static int findingAns(int[] nums, int target){
        //We start with the box of size two
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(target>nums[end]){
            int newStart=end+1;
            //doubl the box size
            //newEnd = previous end + sizeofbox*2
            end = end + (end - start + 1)*2;
            start=newStart;

        }
        return binarySearch(nums, target);

        
    }
    static int binarySearch(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

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
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(findingAns(arr, target));
    }
    
}
