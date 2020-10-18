package com.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void printBFS(DirectedGraph graph , int v, boolean[] visited){
		LinkedList<Integer>[] adjList = graph.getAdjList();
		Queue<Integer> myQueue = new LinkedList<>();
		myQueue.add(v);
		visited[v]=true;

		while(myQueue.size()!=0){
			int lastNumber = myQueue.poll();
			System.out.print(lastNumber + " ");
			Iterator<Integer> it = adjList[lastNumber].listIterator();
			while(it.hasNext()){
				int temp=it.next();
				if(!visited[temp]){
					myQueue.add(temp);
					visited[temp]=true;
				}
			}
		}


	}

	public static void main(String[] args) {
		DirectedGraph graph = new DirectedGraph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		boolean visited[] =  new boolean[4];
		System.out.println("The BFS : ");
		printBFS(graph,2,visited);

	}

}
