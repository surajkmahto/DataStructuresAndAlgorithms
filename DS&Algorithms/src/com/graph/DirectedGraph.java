package com.graph;

import java.util.LinkedList;

public class DirectedGraph {

	public int V;

	public LinkedList<Integer> adjList[];

	public DirectedGraph() {
		super();
	}

	public DirectedGraph(int v, LinkedList<Integer>[] adjList) {
		super();
		V = v;
		this.adjList = adjList;
	}

	public int getV() {
		return V;
	}

	public void setV(int v) {
		V = v;
	}

	public LinkedList<Integer>[] getAdjList() {
		return adjList;
	}

	public void setAdjList(LinkedList<Integer>[] adjList) {
		this.adjList = adjList;
	}

	public void addEdge(int v , int w){
		adjList[v].add(w);
	}

	public DirectedGraph(int v) {
		super();
		V = v;
		adjList = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adjList[i] = new LinkedList();
	}

}
