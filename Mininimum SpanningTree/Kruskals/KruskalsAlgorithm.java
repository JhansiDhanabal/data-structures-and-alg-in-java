package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KruskalsAlgorithm {
	ArrayList<WeightedNode> nodelist;
	ArrayList<UndirectedWeightedEdge> edges = new ArrayList<>();
	KruskalsAlgorithm(ArrayList<WeightedNode> nodelist){
		this.nodelist = nodelist;
	}
	public void addedge(int start, int end, int weight) {
		WeightedNode first = nodelist.get(start);
		WeightedNode second = nodelist.get(end);
		edges.add(new UndirectedWeightedEdge(first, second, weight));
		first.neighbours.add(second);
		second.neighbours.add(first);
		first.map.put(second, weight);
		second.map.put(first, weight);
	}
	public void Kruskals_Minimum_spanning() {
		Disjointset disjoint = new Disjointset();
		disjoint.createset(nodelist);
		Comparator<UndirectedWeightedEdge>comparator = new Comparator<>() {

			@Override
			public int compare(UndirectedWeightedEdge o1, UndirectedWeightedEdge o2) {
				// TODO Auto-generated method stub
				return o1.weight-o2.weight;
			}
			
		};
		int cost = 0;
		Collections.sort(edges, comparator);
		for(UndirectedWeightedEdge edge:edges) {
			if(!(edge.first.set == edge.second.set)) {
				System.out.println(edge.first.value+" to "+edge.second.value+" cost : "+edge.weight);
				disjoint.unionset(edge.first, edge.second);
				cost = cost+edge.weight;
			}
		}
		System.out.println("TOTAL COST : "+cost);
	}
}
