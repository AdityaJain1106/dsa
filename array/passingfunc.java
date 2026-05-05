
import java.util.*;

public class passingfunc {
    static void change(int[] arr) {
        arr[0] = 99;
    }
    public static void main(String[] args) {

        int[] arr = {3,4,5,12};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
