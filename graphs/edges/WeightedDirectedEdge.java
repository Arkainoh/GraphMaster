package graphs.edges;

public class WeightedDirectedEdge<T> extends WeightedEdge<T>{
	
	public WeightedDirectedEdge(int v, int w, T weight) {
		super(v, w, weight);
	}

	public String toString() {
		return "" + from + "->" + to + ":" + weight;
	}
}