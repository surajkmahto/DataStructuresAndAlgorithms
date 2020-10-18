package com.algorithms;

import java.util.HashMap;
import java.util.Map;

public class UniqueElementsInWindow {

	public static void main(String[] args) {
		int arr[] =  new int[] {1,2,2,3,1,1,4,1};
		int k=3;
		Map <Integer,Integer> map = new HashMap<>();
		for(int i=0;i<k;i++){
			if(map.containsKey(arr[i])){
				int count = map.get(arr[i]);
				map.put(arr[i],count++);
			}else{
				map.put(arr[i], 1);
			}
		}
		System.out.println(map.size() + " ");
		int i=0;
		int j=k;
		while(j<arr.length){
			if(map.get(arr[i])==1){
				map.remove(arr[i]);
			}else{
				int temp = map.get(arr[i]);
				map.put(arr[i], temp-1);
			}
			if(map.containsKey(arr[j])){
				int count = map.get(arr[j]);
				map.put(arr[j],count+1);
			}else{
				map.put(arr[j], 1);
			}
			i++;
			j++;
			System.out.println(map.size() + " ");
		}

	}

}
