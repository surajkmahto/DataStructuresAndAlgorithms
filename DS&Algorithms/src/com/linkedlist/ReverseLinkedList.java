package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		int sz = ll.size();
		int i=0;
		int limit=0;
		if(sz%2==0){
			limit=sz/2-1;
		}else{
			limit=sz/2;
		}
		while(i<=limit){
			Collections.swap(ll, i, sz-1-i);
			i++;
		}
		System.out.println(ll.toString());


	}

}
