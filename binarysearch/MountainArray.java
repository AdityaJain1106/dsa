package binarysearch;

public class MountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start < end) {

            //int mid=(start+end)/2 -> might be possible that start+end might get out or range of the value integer can store so better to use-
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {
                //you are in decreasing part of array
                //this may be the answer but look at left
                end = mid ;
            } else {
                //you are in the ascending part of an array
                start=mid+1;//beacuse we know that mid +1 element is grater than mid element -> hence we are ingnoring the mid element
            }
        }
        //in the end, start==end and pointing to the largest no becz of the two checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
    public static void main(String[] args) {
        
    }
}
