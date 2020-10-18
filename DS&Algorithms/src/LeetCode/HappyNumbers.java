package LeetCode;

import java.util.HashSet;
import java.util.Set;

// https://www.geeksforgeeks.org/happy-numbers/
public class HappyNumbers {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        if(n==1){
            return true;
        }
        set.add(n);

        while(n!=1){
            n=nextNumber(n);
            if(n==1){
                return true;
            }
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
            }
        }
        return true;


    }

    public static int nextNumber(int n){
        int nextNum = 0;
        while(n>10){
            int temp = n%10;
            n= n/10;
            nextNum += temp*temp;
        }
        nextNum += n*n;
        return nextNum;
    }


}
