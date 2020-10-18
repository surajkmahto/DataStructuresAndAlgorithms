package com.algorithms;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStreams {

	public static void main(String[] args) {

		int[] arr = {5, 15, 10, 20, 3, 4, 10, 85, 12, 100};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		printMedians(arr);
	}

	private static void printMedians(int[] arr) {
		int sz = arr.length;
		//minheap
		PriorityQueue<Integer> minpq = new PriorityQueue<>();

		//max_Heap
		PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
		double median = 0.0;

		for(int i=0;i<sz;i++){
			if(minpq.size()==maxpq.size()){
				if(arr[i]<median){
					maxpq.add(arr[i]);
					median = maxpq.peek();
				}else{
					minpq.add(arr[i]);
					median = minpq.peek();
				}
			}else{
				if(maxpq.size() > minpq.size()){
					if(arr[i]<median){
						int temp = maxpq.poll();
						minpq.add(temp);
						maxpq.add(arr[i]);
					}else{
						minpq.add(arr[i]);
					}
				}else{
					if(arr[i]>median){
						int temp = minpq.poll();
						maxpq.add(temp);
						minpq.add(arr[i]);
					}else{
						maxpq.add(arr[i]);
					}
				}
				median = Double.valueOf((minpq.peek()+maxpq.peek())/2.0);
			}
			System.out.print(median + " ");
		}
	}
}
