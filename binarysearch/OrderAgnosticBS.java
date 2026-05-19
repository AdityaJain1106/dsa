package binarysearch;

public class OrderAgnosticBS {

    static int orderAgnosticBS(int[] nums,int target){

        int start = 0;
        int end = nums.length - 1;

        boolean isAsc=nums[start]<nums[end];
            while (start <= end) {
                
                //int mid=(start+end)/2 -> might be possible that start+end might get out or range of the value integer can store so better to use-
                int mid = start + (end - start) / 2;

                if(nums[mid]==target){
                    return mid;
                }
                if(isAsc){
                    if (nums[mid] > target) {
                        end = mid - 1;
                    } else{
                        start = mid + 1;
                    }
                }else{
                    if (nums[mid] < target) {
                        end = mid - 1;
                    } else{
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=9;
        System.out.println(orderAgnosticBS(arr, target));
        int[] arr2={10,9,8,7,6,5,4,3,2,1};
        int target2=9;
        System.out.println(orderAgnosticBS(arr2, target2));
    }
    
}