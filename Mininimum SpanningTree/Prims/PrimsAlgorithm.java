package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
	ArrayList<WeightedNode> nodelist;
	ArrayList<UndirectedWeightedEdge> edges = new ArrayList<>();
	public PrimsAlgorithm(ArrayList<WeightedNode> nodelist){
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
	public void Prims_Minimum_Spanning(WeightedNode node) {
		for(int i=0;i<nodelist.size();i++) {
			nodelist.get(i).distance = Integer.MAX_VALUE;
		}
		node.distance = 0;
		PriorityQueue<WeightedNode>queue = new PriorityQueue<>();
		queue.addAll(nodelist);
		while(!queue.isEmpty()) {
			WeightedNode current = queue.remove();
			for(WeightedNode neighbour : current.neighbours) {
				if(queue.contains(neighbour)) {
					if(neighbour.distance > current.map.get(neighbour))
					{
						neighbour.distance = current.map.get(neighbour);
						neighbour.parent = current;
						queue.remove(neighbour);
						queue.add(neighbour);
					}
				}
			}
		}
		int cost = 0;
		for(WeightedNode dummynode:nodelist) {
			System.out.println(dummynode.parent+" to "+dummynode+" cost : "+dummynode.distance);
			cost += dummynode.distance;
		}
		System.out.println("Total Cost "+cost);
	}
}
