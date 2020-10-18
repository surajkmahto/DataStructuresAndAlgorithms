package com.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecodeThePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        List<String> list = new ArrayList<>();
        list.add("1");
        for(int i=1;i<20;i++){
            String temp = getpattern(list.get(i-1));
            list.add(temp);
        }
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(list.get(n-1));
        }
    }

    private static String getpattern(String s) {

        char[] arr = s.toCharArray();
        String ans = "";
        int sz = arr.length;
        for(int j=0;j<arr.length;j++){
            int count=1;
            while(j+1<arr.length && arr[j]==arr[j+1]){
                j++;
                count++;
            }
            ans += String.valueOf(count);
            ans += String.valueOf(arr[j]);

        }
        return ans;

    }
}
