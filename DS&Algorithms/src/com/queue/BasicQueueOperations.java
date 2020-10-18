package com.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BasicQueueOperations {


	private static void printQueue(Queue<Integer> queue){
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		printQueue(queue);
		queue.remove();
		System.out.println();
		printQueue(queue);
		queue.poll();
		System.out.println();
		printQueue(queue);
		System.out.println();
		System.out.println(queue.contains(7));


	}

}
