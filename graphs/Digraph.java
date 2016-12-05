package graphs;

public class Digraph extends Graph{

	public Digraph(int V) {
		super(V);
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
