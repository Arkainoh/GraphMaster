package graphs;

public class Digraph extends Graph{

	public Digraph(int V) {
		super(V);
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
		E++;
	}
	
	public String toString() {
		sb = new StringBuffer();
		sb.append("V: " + V + "\nE: " + E + "\n");
		for(int v = 0; v < V; v++) {
			for(int w : adj[v]) {
				sb.append(v + "->" + w + "\n");
			}
		}
		return sb.toString();
	}
}
