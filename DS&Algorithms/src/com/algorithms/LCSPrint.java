package com.algorithms;

import java.io.*;
import java.util.*;


public class LCSPrint {
    static List<Integer> list = new ArrayList<>();


    static int lcs(int[] a , int[] b , int m , int n){

        if(m==0 || n==0){
            return 0;
        }else{
            if(a[m-1]==b[n-1]){
                list.add(a[m-1]);
                return 1 + lcs(a,b,m-1,n-1);
            }
            else{
                return Math.max(lcs(a,b,m-1,n),lcs(a,b,m,n-1));
            }
        }
    }

    // Complete the longestCommonSubsequence function below.
    static int[] longestCommonSubsequence(int[] a, int[] b) {
        lcs(a,b,a.length,b.length);
        int sz =list.size();
        int[] ans = new int[sz];
        for(int i=0;i<sz;i++){
            ans[i] = list.get(sz-1-i);
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(system.in);

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        int[] result = longestCommonSubsequence(a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}

