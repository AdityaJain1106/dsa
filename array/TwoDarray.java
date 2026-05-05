
import java.util.*;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //2D array is just array of arrays
        int [][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] arr = new int[3][3];
        //interating into rows
        for (int i = 0; i < arr.length; i++) {
            //interating into columns
            for (int j = 0; j < arr[i].length; j++) {
                //taking input from user
                arr[i][j] = sc.nextInt();
            }
        }


        //printing 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //OR
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        //OR
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }


        //Dynamic size of columns in an array -> jagged array - used in cpp but in java we can create jagged array using Arraylist of Arraylist

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr3 = new int[rows][];

        // taking column size for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();

            arr3[i] = new int[cols]; // dynamic column size
        }

        // taking input
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // printing
        System.out.println("\nJagged Array:");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
    }
    
}
