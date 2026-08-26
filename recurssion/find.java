import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int target = 2;
        ArrayList<Integer> ans = findAllIndex2(arr, target, 0);
        System.out.println(ans);
        
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}