package com.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorQueue {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Ascending
		//PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		//Descending
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		pQueue.add(10);
		pQueue.add(7);
		pQueue.add(3);
		pQueue.add(5);
		pQueue.add(2);
		while(!pQueue.isEmpty()){
			System.out.println(pQueue.peek());
			pQueue.remove();
		}
		if(pQueue.isEmpty()){
			System.out.println(0);
		}
		else{
			System.out.println(pQueue.peek());
		}

	}

}
