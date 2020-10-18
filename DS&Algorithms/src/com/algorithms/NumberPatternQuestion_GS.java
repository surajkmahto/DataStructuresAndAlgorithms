package com.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * M -> 21
 * N -> 12
 * MNM -> 2143
 */
public class NumberPatternQuestion_GS {

    public static void main(String[] args) throws IOException {

        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pattern = br.readLine();

        System.out.println("The String Pattern needs to be converted :: " + pattern);

        String numberPattern = decode(pattern);
        System.out.println("The Number Pattern :: " + numberPattern);

    }

    private static String decode(String pattern) {
        String ans = "";
        int counter = 1;
        Stack<Integer> myStack = new Stack<>();
        myStack.push(counter);
        List<Integer> list = new ArrayList<>();
        for (Character c : pattern.toCharArray()) {
            if (c == 'M') {
                counter++;
                myStack.push(counter);

            } else {

                counter++;
                int temp = myStack.peek();
                while (!myStack.isEmpty()) {
                    temp = myStack.peek();
                    list.add(temp);
                    myStack.pop();
                }
                myStack.push(counter);

            }

        }
        for (int i = list.size() - 1; i >= 0; i--) {
            myStack.push(list.get(i));
        }
        int sz = myStack.size();
        for (int i = sz - 1; i >= 0; i--) {
            ans += String.valueOf(myStack.get(i));
        }
        return ans;
    }
}
