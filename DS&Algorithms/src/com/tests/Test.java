package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            int Q = Integer.parseInt(br.readLine().trim());
            String[] arr_L = br.readLine().split(" ");
            long[] L = new long[Q];
            for(int i_L=0; i_L<arr_L.length; i_L++)
            {
                L[i_L] = Long.parseLong(arr_L[i_L]);
            }

            String[] arr_R = br.readLine().split(" ");
            long[] R = new long[Q];
            for(int i_R=0; i_R<arr_R.length; i_R++)
            {
                R[i_R] = Long.parseLong(arr_R[i_R]);
            }

            long[] out_ = solve(A, R, L);
            System.out.print(out_[0]);
            for(int i_out_=1; i_out_<out_.length; i_out_++)
            {
                System.out.print(" " + out_[i_out_]);
            }
            System.out.println("");
        }

        //wr.close();
        br.close();
    }
    static long[] solve(int[] A, long[] R, long[] L){

        // write your code here
        int q = R.length;
        int sz = A.length;
        long sum =0;
        for(int j=0;j<sz;j++){
            sum+=A[j];
        }
        long[] ans = new long[q];
        for(int i=0;i<q;i++){
            ans[i] = getSum(A,L[i],R[i],sz,sum);
        }
        return ans;

    }

    static long getSum(int[] a, long l, long r, int sz , long sum) {
        long finalSum = 0;
        long temp = r-l+1;
        long repeat = temp/sz;
        finalSum += repeat*sum;
        while(l<=r){
            if(l%sz==1){
                l=l+(sz*repeat);
                break;
            }
            else if(l%sz==0){
                finalSum+=a[sz-1];
                l++;
            }
            else{
                long temp2=l%sz;
                String temp4 = String.valueOf(temp2);
                int temp3 = Integer.valueOf(temp4);
                finalSum+=a[temp3-1];
                l++;
            }
        }

        while(l<=r){
            if(l%sz==0){
                finalSum+=a[sz-1];
                l++;
            }
            else{
                long temp2=l%sz;
                String temp4 = String.valueOf(temp2);
                int temp3 = Integer.valueOf(temp4);
                finalSum+=a[temp3-1];
                l++;
            }
        }
        return finalSum;
    }
}




