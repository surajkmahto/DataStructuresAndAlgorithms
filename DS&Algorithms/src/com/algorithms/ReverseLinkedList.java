package com.algorithms;

import java.util.LinkedList;

public class ReverseLinkedList {
	
	
	public static LinkedList <Integer>  reverse(LinkedList <Integer> ll){
		LinkedList <Integer> rll = new LinkedList<>();
		return rll;
		
	}
	public static void main(String[] args) {
		LinkedList <Integer> myLinkedList= new LinkedList<>();
		myLinkedList.add(5);
		myLinkedList.add(10);
		myLinkedList.add(15);
		myLinkedList.add(20);
		myLinkedList = reverse(myLinkedList);
		System.out.println(myLinkedList.toString());
		
	}

}
