import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //ArrayList is a dynamic array which can grow and shrink in size
        //It is a part of java.util package and it implements List interface

        ArrayList<Integer> list = new ArrayList<>(10); // creating an ArrayList of Integer type

        list.add(1); // adding elements to the ArrayList
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list); // printing the ArrayList

        list.remove(2); // removing element at index 2 (which is 3)

        System.out.println(list); // printing the ArrayList after removal

        System.out.println(list.get(2)); // getting element at index 2 (which is now 4)

        System.out.println(list.size()); // getting the size of the ArrayList
    }
    
}
