package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class getMinInO1 {

    static Stack<Integer> s = new Stack<>();
    static int min;

    public static void main(String[] args) {
        String str = "abs";
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        buffer.compareTo(new StringBuffer(str));

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1 - Push || 2 - Pop || 3 - GetMin || 4 - Peek");
            int in = sc.nextInt();
            switch (in){
                case 1:
                    int temp = sc.nextInt();
                    performPush(temp);
                    break;

                case 2:
                    performPop();
                    break;

                case 3:
                    System.out.println("The Current Minimum Element: " + min);
                    break;

                case 4:
                    performPeek();
                    break;

                default:
                    continue;

            }
        }



    }

    private static void performPeek() {
        System.out.println(Math.max(s.peek(),min));
    }

    private static void performPop() {
        if(s.isEmpty()){
            System.out.println("Stack is empty.");
        }
        else{
            if(s.peek()>min){
                s.pop();
            }
            else{
                min=2*min-s.peek();
                s.pop();
            }
        }
    }

    private static void performPush(int temp) {
        if(s.isEmpty()){
            s.push(temp);
            min = temp;
        }
        else{
            if(temp>min){
                s.push(temp);
            }
            else{
                s.push(2*temp-min);
                min = temp;
            }
        }

    }
}
