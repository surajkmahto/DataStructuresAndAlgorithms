package com.algorithms;

import java.io.IOException;

public class RepeatedNumberInSortedArray {

	public static void main(String[] args) throws IOException {
		int [] arr = new int[] {14,22,23,45,56,56,71,75};
		int ans = getRepeatedNumber(arr,0,arr.length-1);
		System.out.println("The repeated number : " + ans);

	}

	private static int getRepeatedNumber(int[] arr,int low,int high) {

		if (low > high){
			return -1;
		}

		int mid = (low+high)/2;
		if(arr[mid]!=arr[mid+1]){
			if(mid>0 && arr[mid]==arr[mid-1]){
				return arr[mid];

			}
			if(mid!=0){
				return getRepeatedNumber(arr,low,mid-1);
			}
		}else{
			return arr[mid];
		}
		return getRepeatedNumber(arr,mid+1,high);
	}

}
