package binarysearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target=6;
        System.out.println(Arrays.toString(serach(arr, target)));
    }


    //normal binary search
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){

        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target){
                cStart=mid+1;
            } else {
                cEnd=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] serach(int[][] matrix,int target){

        int rows=matrix.length;
        int cols=matrix[0].length; //be cautios,matrx may be empty

        //extra condition if there is only one row
        if(rows==1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        //for length reduction
        //run the loop till 2 rows are remaining
        while(rStart<(rEnd-1)){//while this is true it will have more tham 2 rows which we are trying to eleminate
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }

        }

        //for searching the remaining 4 areas
        //now we have 2 rows
        //check wether the target is in the col of 2 rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
         if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart,cMid};
        }
        //otherwise search in first half
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart,0, cMid-1, target); 
        }
        //otherwise search in second half
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1, cols-1, target);
        }
        //otherwise search in third half
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1,0, cMid-1, target);
        }
        //otherwise search in forth half
        else{//target<=matrix[rStart+1][cMid+1]
            return binarySearch(matrix, rStart+1,cMid+1, cols-1 ,target);
        }
    }
}
