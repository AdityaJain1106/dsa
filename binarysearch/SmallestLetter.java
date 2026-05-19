package binarysearch;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {

    //return the index of smallest number >=target
    static int ceiling(int[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            //int mid=(start+end)/2 -> might be possible that start+end might get out or range of the value integer can store so better to use-
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        int[] arr={'c','f','j'};
        char target='c';
        System.out.println(ceiling(arr, target));

    }
    
}
