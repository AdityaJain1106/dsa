package linearsearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class evenDigits {

    // Counts how many Digits are Even
    static int findNumbers(int[] nums){
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // Returns true of No of Digits are Even
    static boolean even(int num){
        int numberOfDigits=digits(num);
        return numberOfDigits%2==0;

    }

    // Counts No of Digits
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    // Main function
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
