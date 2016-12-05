package graphs.edges;

public class WeightedEdge<T> {
	public int from;
	public int to;
	public T weight;
	
	public WeightedEdge() {}
	
	public WeightedEdge(int v, int w, T weight) {
		this.from = v;
		this.to = w;
		this.weight = weight;
	}
	
	public String toString() {
		return "" + from + "-" + to + ":" + weight;
	}
}