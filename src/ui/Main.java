package ui;

import java.util.ArrayList;

import datastr.SimpleGraph;
import datastr.Vertex;

public class Main {

	public static void main(String[] args) {
		SimpleGraph<Integer> sg = new SimpleGraph<Integer>();
		sg.addVertex(1);
		sg.addVertex(2);
		sg.addVertex(3);
		sg.addVertex(4);
		sg.addVertex(5);
		sg.addVertex(6);
		
		Vertex<Integer> v1 = sg.searchInVertexList(0);
		Vertex<Integer> v2 = sg.searchInVertexList(1);
		Vertex<Integer> v3 = sg.searchInVertexList(2);
		Vertex<Integer> v4 = sg.searchInVertexList(3);
		Vertex<Integer> v5 = sg.searchInVertexList(4);
		Vertex<Integer> v6 = sg.searchInVertexList(5);
		
		sg.addEdge(v1, v2, 2);
		sg.addEdge(v2, v1, 2);
		
		sg.addEdge(v2, v3, 10);
		sg.addEdge(v3, v2, 10);
		
		sg.addEdge(v3, v6, 2);
		sg.addEdge(v6, v3, 2);
		
		sg.addEdge(v6, v5, 2);
		sg.addEdge(v5, v6, 2);
		
		sg.addEdge(v5, v4, 4);
		sg.addEdge(v4, v5, 4);
		
		sg.addEdge(v4, v1, 4);
		sg.addEdge(v1, v4, 4);
		
		sg.addEdge(v2, v5, 2);
		sg.addEdge(v5, v2, 2);
		
		ArrayList<Integer> result = sg.dijkstra(v1);
		
		System.out.println(result.toString());
		
	}

}
