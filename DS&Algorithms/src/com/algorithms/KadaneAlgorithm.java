/**
 *
 */
package com.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suraj.mahto
 */

/*
Given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
For this problem, return the maximum sum.
 */


/*
 *
 Kadane's Algo in Python:

 def max_subarray(A):
    max_ending_here = max_so_far = A[0]
    for x in A[1:]:
        max_ending_here = max(x, max_ending_here + x)
        max_so_far = max(max_so_far, max_ending_here)
    return max_so_far
 */


public class KadaneAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List <Integer> Arrays = new ArrayList<>();
		Arrays.add(-2);
		Arrays.add(5);
		Arrays.add(-1);
		int largestsum = getLargestSum(Arrays);
		System.out.println("The Largest Sum:: " + largestsum);
	}

	private static int getLargestSum(List<Integer> arrays) {
		int locallargestsum=0;
		int finallargestsum=0;

		for (Integer integer : arrays) {
			if(locallargestsum+integer > 0){
				locallargestsum = locallargestsum + integer;
				if(finallargestsum < locallargestsum){
					finallargestsum = locallargestsum;
				}
			}else{
				locallargestsum = 0;
			}
		}
		return finallargestsum;
	}




}
