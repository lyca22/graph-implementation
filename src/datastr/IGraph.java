package datastr;

import java.util.ArrayList;

public interface IGraph<V> {

	public void addVertex(V value);
	public Vertex<V> searchInVertexList(int id);
	public void addEdge(Vertex<V> vertex1, Vertex<V> vertex2, int weight);
	public void breadthFirstSearch(Vertex<V> start);
	public void depthFirstSearch();
	public ArrayList<Integer> dijkstra(Vertex<V> start);
	public void floydWarshall();
	public Graph<Vertex<V>> prim();
	public Graph<Vertex<V>> kruskal();
	public int degreeOf(Vertex<V> vertex);
	public boolean containsValue(V value);
	
}
