package graphs;
import java.util.ArrayList;

public class Graph {
	private int V;
	private int E;
	private ArrayList<Integer>[] adj;
	private StringBuffer sb;
	
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
				sb.append(v + "-" + w + "\n");
			}
		}
		return sb.toString();
	}
}
