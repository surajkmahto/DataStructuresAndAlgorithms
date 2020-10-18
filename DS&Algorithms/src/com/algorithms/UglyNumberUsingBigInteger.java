package com.algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UglyNumberUsingBigInteger {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List <BigInteger> myList = new ArrayList<BigInteger>();
		int count=1;
		int i2=0,i3=0,i5=0;
		BigInteger ugly= new BigInteger("1");
		BigInteger two= new BigInteger("2");
		BigInteger three= new BigInteger("3");
		BigInteger five= new BigInteger("5");
		myList.add(ugly);
		while(count<10001){
			ugly = getmin(myList.get(i2).multiply(two),myList.get(i3).multiply(three),myList.get(i5).multiply(five));
			if(ugly.compareTo(myList.get(i2).multiply(two))==0){
				if(!myList.contains(ugly)){
					myList.add(ugly);
					count++;
				}
				i2=i2+1;
			}else if(ugly.compareTo(myList.get(i3).multiply(three))==0){
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
		//System.out.println(myList.toString());
		//System.out.println(myList.get(100));

		while(t-- > 0){
			int n = sc.nextInt();
			System.out.println(myList.get(n-1));
		}



	}

	@SuppressWarnings("unused")
	private static BigInteger getmin(BigInteger l, BigInteger m, BigInteger n) {
		int temp1 = l.compareTo(m);
		int temp2 = l.compareTo(n);
		int temp3 = m.compareTo(l);
		int temp4 = m.compareTo(n);

		if((temp1==-1 || temp1==0) && (temp2==-1 || temp2==0)){
			return l;
		}
		else if((temp3==-1 || temp3==0) && (temp4==-1 || temp4==0)){
			return m;
		}
		else{
			return n;
		}
	}

}
