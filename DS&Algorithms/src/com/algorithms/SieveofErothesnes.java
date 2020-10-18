package com.algorithms;

import java.util.Arrays;

public class SieveofErothesnes {

	public static void main(String[] args) {
		int n = 1001;
		boolean prime[] = new boolean[1001];
		Arrays.fill(prime, true);
		for(int i=2;i<Math.sqrt(n);i++){
			for(int j=i+1;j<n;j++){
				if(j%i==0){
					prime[j]=false;
				}
			}
		}
		for(int i=2;i<prime.length;i++){
			if(prime[i]){
				System.out.print(i+ " ");
			}
		}


	}

}
