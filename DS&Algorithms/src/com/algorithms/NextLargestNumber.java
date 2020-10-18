package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextLargestNumber {

	public static void main(String[] args) {
		Stack <Integer> myStack = new Stack<>();
		int[] array = new int[]{25,2,7,5,11};
		int size = array.length;
		List <Integer> myList = new ArrayList<>();
		int[] finalarray = new int[size];
		Arrays.fill(finalarray, -1);
		myStack.push(array[0]);
		for(int i=1;i<size;i++){
			if(!myStack.isEmpty() && array[i]>myStack.peek() ){
				myStack.pop();
				myList.add(array[i]);
			}else{
				while(!myStack.isEmpty()){
					myStack.pop();
				}
			}
			myStack.push(array[i]);
		}
		System.out.println(myList);

	}

}
