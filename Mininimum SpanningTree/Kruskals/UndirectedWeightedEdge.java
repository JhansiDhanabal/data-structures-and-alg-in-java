package graph;

public class UndirectedWeightedEdge {
	WeightedNode first;
	WeightedNode second;
	int weight;
	public UndirectedWeightedEdge(WeightedNode first, WeightedNode second, int weight){
		this.first = first;
		this.second = second;
		this.weight = weight;
	}
}
