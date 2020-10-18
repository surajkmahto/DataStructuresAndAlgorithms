package com.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DoublyEndedQueue {

	private static void printQueue(Deque<Integer> deque){
		Iterator<Integer> itr = deque.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);
		deque.add(6);

		printQueue(deque);

		deque.removeFirst();
		deque.removeLast();

		System.out.println();
		printQueue(deque);

		System.out.println();
		System.out.println(deque.contains(5));





	}

}
