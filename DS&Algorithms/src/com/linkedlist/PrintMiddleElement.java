package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class PrintMiddleElement {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		int middleElement = getMiddleElement(ll);
		System.out.println("The Middle Element : " + middleElement);

	}

	private static int getMiddleElement(LinkedList<Integer> ll) {
		int ans = -1;
		int sz =ll.size();

		Iterator <Integer> it = ll.iterator();
		Iterator <Integer> it2 = ll.iterator();
		while(it2.hasNext()){
			ans = it.next();
			it2.next();
			if(it2.hasNext())
				it2.next();
		}
		if(sz%2==0){
			ans = it.next();
		}
		return ans;
	}

}
