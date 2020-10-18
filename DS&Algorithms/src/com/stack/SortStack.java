package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class SortStack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t=Integer.parseInt(br.readLine());
		while(t-- > 0){
			int n=Integer.parseInt(br.readLine());
			Stack<Integer> myStack = new Stack<>();
			for(int i=0;i<n;i++){
				int temp = sc.nextInt();
				myStack.push(temp);
			}
		}
	}
}
