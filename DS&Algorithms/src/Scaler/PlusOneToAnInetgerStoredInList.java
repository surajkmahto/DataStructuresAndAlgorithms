package Scaler;

import java.util.ArrayList;
import java.util.Stack;

public class PlusOneToAnInetgerStoredInList {
    public static void main(String[] args) {
        System.out.println(5);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        ArrayList<Integer> ans = plusOne(list);
        System.out.println(ans.toString());
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> myStack = new Stack<>();
        int sz = A.size();
        int carry=1;
        for(int i=sz-1;i>=0;i--){
            int sum = A.get(i)+carry;
            if(sum==10){
                carry=1;
                myStack.push(0);
            }else{
                carry=0;
                myStack.push(sum);
            }
        }
        if(carry==1){
            myStack.push(carry);
        }
        while(!myStack.isEmpty()){
            int top = myStack.peek();
            ans.add(top);
            myStack.pop();
        }
        return ans;
    }
}


