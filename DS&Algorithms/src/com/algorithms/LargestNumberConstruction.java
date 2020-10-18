/**
 * 
 */
package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author suraj.mahto
 */

/*
Given a list of non negative integers, arrange them such that they form the largest number.
For example:
Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
Note: The result may be very large, so you need to return a string instead of an integer.
*/


public class LargestNumberConstruction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      List <Integer> Arrays = new ArrayList<>();
      Arrays.add(3);
      Arrays.add(30);
      Arrays.add(34);
      Arrays.add(5);
      Arrays.add(9);
      String largestsum = getLargestSum(Arrays);
      System.out.println("The Largest Sum:: " + largestsum);

	}
	
	private static int comparator(int a, int b){
		int flag = 0;
		String sa = String.valueOf(a);
		String sb = String.valueOf(b);
		String sab = sa.concat(sb);
		String sba = sb.concat(sa);
		Integer iab = Integer.parseInt(sab);
		Integer iba = Integer.parseInt(sba);
		if(iba >iab){
			flag=1;
		}
		return flag;
		
	}

	private static String getLargestSum(List<Integer> arrays) {
        String largestSum="";
        for(int i=0;i<arrays.size();i++){
        	for(int j=0;j<arrays.size()-1;j++){
        		if(comparator(arrays.get(j),arrays.get(i))==1){
        			Collections.swap(arrays, j, i);
        		}
        	}
        }
        
        List<String> stringArray =  new ArrayList<>();
        for (Integer integer : arrays) {
        	stringArray.add(String.valueOf(integer));
        	largestSum = largestSum + String.valueOf(integer);
		}
         
		return largestSum;
	}


}
