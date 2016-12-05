package graphs;
import java.util.ArrayList;

public class Graph {
	protected int V;
	protected int E;
	protected ArrayList<Integer>[] adj;
	protected StringBuffer sb;
	
	public Graph() {}
	
	public Graph(int V) {
		this.V = V;
		this.E = 0;
		
		adj = new ArrayList[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}
	
	public int V() {
		return V;
	}
	
	public int E() {
		return E;
	}
	
	public String toString() {
		sb = new StringBuffer();
		sb.append("V: " + V + "\nE: " + E + "\n");
		for(int v = 0; v < V; v++) {
			for(int w : adj[v]) {
				if(v <= w) sb.append(v + "-" + w + "\n");
			}
		}
		return sb.toString();
	}
}
