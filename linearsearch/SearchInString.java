package linearsearch;
import java.util.*;

public class SearchInString {

    static boolean search(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (char ch: str.toCharArray()) {
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name="Aditya";
        char target='d';
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    
}
