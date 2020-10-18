package com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UglyNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List <Long> myList = new ArrayList<Long>();
		int count=1;
		int i2=0,i3=0,i5=0;
		long ugly=1;
		myList.add(ugly);
		while(count<10001){
			ugly = getmin(myList.get(i2)*2,myList.get(i3)*3,myList.get(i5)*5);
			if(ugly==myList.get(i2)*2){
				if(!myList.contains(ugly)){
					myList.add(ugly);
					count++;
				}
				i2=i2+1;
			}else if(ugly==myList.get(i3)*3){
				if(!myList.contains(ugly)){
					myList.add(ugly);
					count++;
				}
				i3=i3+1;
			}else{
				if(!myList.contains(ugly)){
					myList.add(ugly);
					count++;
				}
				i5=i5+1;
			}

		}
		while(t-- > 0){
			int n = sc.nextInt();
			System.out.println(myList.get(n-1));
		}



	}

	private static long getmin(long l, long m, long n) {
		if(l<=m && l<=n){
			return l;
		}
		else if(m<=n && m<=l){
			return m;
		}
		else{
			return n;
		}
	}

}
