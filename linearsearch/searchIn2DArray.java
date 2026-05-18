package linearsearch;

public class searchIn2DArray {
    static int linearSearch(int[][] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 6;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    
}
