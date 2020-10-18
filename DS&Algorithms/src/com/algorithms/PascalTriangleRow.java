package com.algorithms;

import java.util.Scanner;

public class PascalTriangleRow {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] finalArray = prepareArray(n);
		
		
		
		String ans = getNthRow(n , finalArray);	
		System.out.println("The Nth Row in Pascal Triangle:: " + ans);
		sc.close();
	}

	private static int[][] prepareArray(int n) {
		int[][] arr = new int[n][n];
		arr[0][0] = 1;
		arr[1][0] = 1;
		arr[1][1] = 1;	
		for(int i=2;i<n;i++){
			arr[i][0] = 1;
			for(int j=1;j<n;j++){
				arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
			}
			arr[i][n-1]=1;
		}
		return arr;
	}
	
	private static String getNthRow(int n, int[][] finalArray){
		
        String nthRow = "";
        for(int i=0;i<n;i++){
        	nthRow += finalArray[n-1][i] + " ";
        }
		return nthRow;
	}

}
