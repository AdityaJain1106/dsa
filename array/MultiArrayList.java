import java.util.*;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //intializing the list of lists
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //add elements to the list of lists
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        //printing the list of lists
        System.out.println(list);
    }
    
}
