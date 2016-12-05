package graphs;
import java.util.ArrayList;
import graphs.edges.WeightedDirectedEdge;

public class WeightedDigraph<T> extends WeightedGraph<T>{
	private ArrayList<WeightedDirectedEdge<T>>[] adj;
	public WeightedDigraph(int V) {
		super(V);
	}
	
	public void addEdge(int v, int w, T weight) {
		adj[v].add(new WeightedDirectedEdge<T>(v, w, weight));
		E++;
	}
	
	public String toString() {
		sb = new StringBuffer();
		sb.append("V: " + V + "\nE: " + E + "\n");
		for(int v = 0; v < V; v++) {
			for(WeightedDirectedEdge<T> e : adj[v]) {
				sb.append(e+"\n");
			}
		}
		return sb.toString();
	}
}
