package com.algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class StacksUsingQueues {
	
	static Queue<Integer> myQueue1 = new LinkedList<>();
	static Queue<Integer> myQueue2 = new LinkedList<>();
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		  
		
		Scanner sc = new Scanner(System.in);		 
    	while(true){
    		
			 System.out.println("Enter : 1 to push || 2 to pop || 3 to show..");
			 int choice =  sc.nextInt();
			 switch(choice){
			    case 1:
			    	System.out.println("Enter the number to insert ?");
			    	int num = sc.nextInt();
			    	push(num);
			    	System.out.println("The number has been inserted..");
			    	break;		    	
			    case 2:
			    	pop();
			    	break;			    	
			    case 3:
			    	
			    	System.out.println("The Current Elements in my Stack:");
						System.out.println(myQueue1.toString());
			    	break;
			 }
		 }
	}

	private static void pop() {
		if(myQueue1.isEmpty() && myQueue2.isEmpty()){
			System.out.println("The Stack is empty");
		}
		else{
			while(myQueue1.size()!=1){
				int temp = myQueue1.peek();
				myQueue2.add(temp);
				myQueue1.remove();		
				
			}
			int temp2 = myQueue1.peek();
			System.out.println("The Popped number :: " + temp2);
			myQueue1.remove();	
			Queue<Integer> queue3 = myQueue1;
			myQueue1 = myQueue2;
			myQueue2 = queue3;
		}
		
	}

	private static void push(int num) {
		myQueue1.add(num);
		
	}

}
