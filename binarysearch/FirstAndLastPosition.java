package binarysearch;

public class FirstAndLastPosition {

    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        //check for the first occurence if target first
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;

        return ans;

    }

    int search(int[] nums, int target, boolean findStartIndex){

        int ans=-1;

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

                //potential answer is found
                ans=mid;
                if(findStartIndex){ //if(findStartIndex==true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    
}
