package com.graph;

import java.util.LinkedList;

public class UndirectedGraph {

	public int V;

	public LinkedList<Integer> adjList[];

	public UndirectedGraph() {
		super();
	}

	public UndirectedGraph(int v, LinkedList<Integer>[] adjList) {
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
		//Only Change In UnDirected Graph
		adjList[w].add(v);
	}

	public UndirectedGraph(int v) {
		super();
		V = v;
		adjList = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adjList[i] = new LinkedList();
	}

}
