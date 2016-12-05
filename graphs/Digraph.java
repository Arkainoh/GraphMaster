package graphs;

public class Digraph extends Graph{

	public Digraph(int V) {
		super(V);
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}
	
}
