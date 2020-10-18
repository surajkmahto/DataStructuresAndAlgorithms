package com.algorithms;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {	
	static Stack<Integer> myStack1 = new Stack<>();
	static Stack<Integer> myStack2 = new Stack<>();
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);		 
    	 while(true){
			 System.out.println("Enter : 1 to insert || 2 to delete || 3 to show..");
			 int choice =  sc.nextInt();
			 switch(choice){
			    case 1:
			    	System.out.println("Enter the number to insert ?");
			    	int num = sc.nextInt();
			    	insert(num);
			    	System.out.println("The number has been inserted..");
			    	break;		    	
			    case 2:
			    	delete();
			    	break;			    	
			    case 3:
			    	
			    	System.out.println("The Current Elements in my Queue:");
			    	for (int i=myStack2.size()-1;i>=0;i--) {
						System.out.println(myStack2.get(i));
					}
					for (Integer integer : myStack1) {
						System.out.println(integer);
					}
			    	break;
			 }
		 }
	}
	private static void delete() {
		
		if(myStack1.isEmpty() && myStack2.isEmpty()){
			System.out.println("The Queue is empty.");
		}
		else if(myStack2.isEmpty()){
			while(myStack1.size()!=1){
				myStack2.push(myStack1.peek());
				myStack1.pop();
			}
			int temp = myStack1.peek();
			System.out.println("The number to be deleted ::" + temp);
			myStack1.pop();
		}
		else{
			int temp = myStack2.peek();
			System.out.println("The number to be deleted ::" + temp);
			myStack2.pop();
		}		
	}
	private static void insert(int i) {
		myStack1.push(i);	
	}
}
