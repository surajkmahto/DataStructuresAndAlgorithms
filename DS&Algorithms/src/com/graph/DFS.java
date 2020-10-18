package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

	public static void printDFS(boolean[] visited, DirectedGraph graph , int v){
		visited[v]=true;
		System.out.print(v + " ");
		LinkedList<Integer>[] adj = graph.getAdjList();
		Iterator<Integer> it = adj[v].listIterator();
		while(it.hasNext()){
			int n = it.next();
			if(!visited[n]){
				printDFS(visited,graph,n);
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
		boolean visited[] = new boolean[4];
		System.out.println("The DFS : ");
		printDFS(visited,graph,2);

	}

}
