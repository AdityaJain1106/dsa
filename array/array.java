import java.util.*;

public class array {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);

    //Primitive Array
       int[] rono = {1, 2, 3, 4, 5};
       int [] rono2 = new int[5];

       int[] ros; //declaration of array nad ros is defined in the stack memory and it is a reference variable which can point to an array object
        ros = new int[5]; //actually here the object is created in heap memory and the reference variable ros is pointing to that object

         
         for (int i = 0; i < rono2.length; i++) {
             rono2[i] = sc.nextInt();
            }
            
        // System.out.println(rono2[0]);
        // System.out.println(rono2[1]);
        // System.out.println(rono2[2]);
        // System.out.println(rono2[3]);
        // System.out.println(rono2[4]);
            
        System.out.println(Arrays.toString(rono2));

        //Arrays of objects

         String [] arr= new String[4];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextLine();
            }
        System.out.println(Arrays.toString(arr));  
        
        }
}
 