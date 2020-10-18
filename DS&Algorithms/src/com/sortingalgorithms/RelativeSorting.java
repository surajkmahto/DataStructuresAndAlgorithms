package com.sortingalgorithms;

import java.util.HashMap;
import java.util.Map;

public class RelativeSorting {



	public static void main(String[] args) {
		int [] arr1 =  new int[]{2,1,2,5,7,1,9,3,6,8,8};
		int [] arr2 =  new int[]{2,1,8,3};
		Map <Integer,Integer> priority = new HashMap<>();
		for(int i=0;i<arr2.length;i++){
			priority.put(arr2[i], i);
		}
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<i;j++){
				if(!(priority.containsKey(arr1[i]))){
					break;
				}
				else if(!(priority.containsKey(arr1[j]))){
					arr1 = swap(i,j,arr1);
				}
				else{
					if(priority.get(arr1[i])<priority.get(arr1[j])){
						arr1 = swap(i,j,arr1);
					}else{
						break;
					}
				}
			}
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}
	}

	private static int[] swap(int i, int j, int[] arr1) {
		int temp = arr1[i];
		arr1[i]=arr1[j];
		arr1[j]=temp;
		return arr1;
	}

}
