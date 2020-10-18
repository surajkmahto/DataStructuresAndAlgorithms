package com.bitset;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {

	public static void main(String[] args) {
		int [] arr = new int[] {1,2,3,4};
		int size = arr.length;

		for(int i=0;i<(1<<size);i++){
			List<Integer> subset = new ArrayList<>();
			for(int j=0;j<size;j++){
				if((i & (1<<j)) > 0){
					subset.add(arr[j]);
				}
			}
			System.out.println(subset.toString());
			subset.clear();
		}

	}

}
