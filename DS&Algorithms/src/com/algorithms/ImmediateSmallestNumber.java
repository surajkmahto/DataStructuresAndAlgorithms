package com.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImmediateSmallestNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = br.read();
		int ans = getImmediateSmallestNumber(number);
		System.out.println("The Immediate Smallest Number : " + ans);


	}

	private static int getImmediateSmallestNumber(int number) {
		String num = String.valueOf(number);
		for(int i=0;i<num.length()-1;i++){
			if(num.charAt(i) > num.charAt(i++)){

			}
		}
		return 0;
	}

}
