package com.stack;

import java.util.Stack;

public class CopyAStackWithO1Space {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		myStack.push(1);
		myStack.push(7);
		myStack.push(3);
		myStack.push(5);

		Stack<Integer> clone = cloneStack(myStack);
		System.out.println(clone.toString());

	}

	private static Stack<Integer> cloneStack(Stack<Integer> myStack) {
		int count=0;
		int sz = myStack.size();
		Stack<Integer> temp = new Stack<>();
		while(count<sz)
		{
			int top = myStack.peek();
			myStack.pop();
			while(myStack.size()!=count){
				int tmp = myStack.pop();
				temp.push(tmp);
			}
			myStack.push(top);
			while(!temp.isEmpty()){
				int tmp = temp.pop();
				myStack.push(tmp);
			}
			count++;
		}
		while(!myStack.isEmpty()){
			int tmp = myStack.pop();
			temp.push(tmp);
		}
		return temp;
	}

}
