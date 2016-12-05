package graphs;
import java.util.ArrayList;

public class WeightedGraph<T> extends Graph{
	private ArrayList<WeightedEdge<T>>[] adj;
	
	public WeightedGraph(int V) {
		this.V = V;
		this.E = 0;
		adj = new ArrayList[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new ArrayList<WeightedEdge<T>>();
		}
	}
	
	public void addEdge(int v, int w, T weight) {
		adj[v].add(new WeightedEdge<T>(v, w, weight));
		adj[w].add(new WeightedEdge<T>(w, v, weight));
		E++;
	}
	
	public String toString() {
		sb = new StringBuffer();
		sb.append("V: " + V + "\nE: " + E + "\n");
		for(int v = 0; v < V; v++) {
			for(WeightedEdge<T> e : adj[v]) {
				if (e.from <= e.to) sb.append(e+"\n");
			}
		}
		return sb.toString();
	}
}
